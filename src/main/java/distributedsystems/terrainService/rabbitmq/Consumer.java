package distributedsystems.terrainService.rabbitmq;


import distributedsystems.terrainService.model.Terrain;
import distributedsystems.terrainService.services.TerrainService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    TerrainService TerrainService;

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void consume(Terrain Terrain) {
        TerrainService.addTerrain(Terrain);
    }
}

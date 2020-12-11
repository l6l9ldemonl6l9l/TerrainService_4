package distributedsystems.terrainService.model;

import distributedsystems.terrainService.TerrainRequest;
import distributedsystems.terrainService.TerrainResponse;
import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@EnableAutoConfiguration
@Entity
@Data
public final class Terrain {

    @Id
    private UUID id;
    @Column(unique = true)
    private int sizeBeauty;
    private String name;


    public Terrain() {
        id = UUID.randomUUID();
    }

    public Terrain(UUID id, int sizeBeauty, String name) {
        this.id = id;
        this.sizeBeauty = sizeBeauty;
        this.name = name;
    }

    public static Terrain fromTerrainRequest(TerrainRequest TerrainRequest) {
        return new Terrain(UUID.randomUUID(),
                TerrainRequest.getSizeBeauty(),
                TerrainRequest.getName());
    }

    public TerrainResponse toTerrainResponse() {
        return TerrainResponse.newBuilder().
                setId(id.toString()).
                setSizeBeauty(sizeBeauty).
                setName(name).
                build();
    }
}

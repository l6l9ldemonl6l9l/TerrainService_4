package distributedsystems.terrainService.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import distributedsystems.terrainService.model.Terrain;
import java.util.UUID;

@Repository
public interface TerrainRepository extends JpaRepository <Terrain, UUID > {
    Terrain findByName(String name);
    Terrain findByTerrainId(UUID id);
}

package distributedsystems.terrainService.services;

import distributedsystems.terrainService.model.Terrain;


import java.util.List;
import java.util.UUID;

public interface TerrainService {
    Terrain addTerrain(Terrain Terrain);

    List<Terrain> getAll();

    Terrain getById(UUID id);

    Terrain getByName(String kindTerrain);

    void deleteTerrainById(UUID id);
}

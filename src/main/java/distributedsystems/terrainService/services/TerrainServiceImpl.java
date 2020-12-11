package distributedsystems.terrainService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import distributedsystems.terrainService.model.Terrain;
import java.util.UUID;
import java.util.List;


@Service
public final class TerrainServiceImpl implements TerrainService {

    @Autowired
    private TerrainRepository TerrainRepository;

    @Override
    public Terrain addTerrain(Terrain Terrain) {
        Terrain savedTerrain = TerrainRepository.save(Terrain);
        return savedTerrain;
    }

    @Override
    public List<Terrain> getAll() {
        return TerrainRepository.findAll();
    }

    @Override
    public Terrain getById(UUID id) {
        Terrain Terrain = TerrainRepository.findById(id).get();
        return Terrain;
    }

    @Override
    public Terrain getByName(String name) {
        return TerrainRepository.findByName(name);
    }

    @Override
    public void deleteTerrainById(UUID id) {
        TerrainRepository.deleteById(id);
    }
}
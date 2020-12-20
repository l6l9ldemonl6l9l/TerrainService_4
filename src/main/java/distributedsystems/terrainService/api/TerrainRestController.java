package distributedsystems.terrainService.api;
import distributedsystems.terrainService.model.Terrain;
import distributedsystems.terrainService.services.TerrainService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/terrain")
@AllArgsConstructor
@NoArgsConstructor
public class TerrainRestController {

    @Autowired
    private TerrainService TerrainService;

    @PostMapping
    public Terrain createTerrain(@RequestBody Terrain Terrain) {
        return TerrainService.addTerrain(Terrain);
    }

    @GetMapping
    public List<Terrain> getAllTerrains() {
        return TerrainService.getAll();
    }

    @GetMapping(path = "{id}")
    public Terrain getTerrainById(@PathVariable(value = "id") UUID id) {
        Terrain Terrain = TerrainService.getById(id);
        return Terrain;
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteTerrain(@PathVariable(value = "id") UUID id)  {
        TerrainService.deleteTerrainById(id);
        return ResponseEntity.noContent().build();
    }

}
package distributedsystems.terrainService.api;

import distributedsystems.terrainService.*;
import distributedsystems.terrainService.model.Terrain;
import distributedsystems.terrainService.services.TerrainService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@GRpcService
public class TerrainGrpcController extends TerrainServiceGrpc.TerrainServiceImplBase {

    @Autowired
    private TerrainService TerrainService;

    @Override
    public void all(AllTerrainRequest request, StreamObserver<AllTerrainResponse> responseObserver) {
        List<Terrain> terrains = TerrainService.getAll();
        List<TerrainResponse> convertedTerrains = terrains.stream().
                map(Terrain::toTerrainResponse).
                collect(Collectors.toList());
        AllTerrainResponse response = AllTerrainResponse.newBuilder().
                addAllTerrain(convertedTerrains).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void add(TerrainRequest request, StreamObserver<TerrainResponse> responseObserver) {
        Terrain terrain = TerrainService.addTerrain(Terrain.fromTerrainRequest(request));
        responseObserver.onNext(terrain.toTerrainResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void byId(TerrainByIdRequest request, StreamObserver<TerrainResponse> responseObserver) {
        Terrain Terrain = TerrainService.getById(UUID.fromString(request.getId()));
        responseObserver.onNext(Terrain.toTerrainResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void byName(TerrainByNameRequest request, StreamObserver<TerrainResponse> responseObserver) {
        Terrain Terrain = TerrainService.getByName(request.getName());
        responseObserver.onNext(Terrain.toTerrainResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void delete(TerrainByIdRequest request, StreamObserver<DeleteTerrainResponse> responseObserver) {
        TerrainService.deleteTerrainById(UUID.fromString(request.getId()));
        responseObserver.onNext(DeleteTerrainResponse.newBuilder().build());
        responseObserver.onCompleted();
    }
}

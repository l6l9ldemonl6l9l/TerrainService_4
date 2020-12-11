package distributedsystems.terrainService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.0)",
    comments = "Source: terrain.proto")
public final class TerrainServiceGrpc {

  private TerrainServiceGrpc() {}

  public static final String SERVICE_NAME = "distributedsystems.terrainService.TerrainService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<distributedsystems.terrainService.AllTerrainRequest,
      distributedsystems.terrainService.AllTerrainResponse> getAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "all",
      requestType = distributedsystems.terrainService.AllTerrainRequest.class,
      responseType = distributedsystems.terrainService.AllTerrainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.terrainService.AllTerrainRequest,
      distributedsystems.terrainService.AllTerrainResponse> getAllMethod() {
    io.grpc.MethodDescriptor<distributedsystems.terrainService.AllTerrainRequest, distributedsystems.terrainService.AllTerrainResponse> getAllMethod;
    if ((getAllMethod = TerrainServiceGrpc.getAllMethod) == null) {
      synchronized (TerrainServiceGrpc.class) {
        if ((getAllMethod = TerrainServiceGrpc.getAllMethod) == null) {
          TerrainServiceGrpc.getAllMethod = getAllMethod =
              io.grpc.MethodDescriptor.<distributedsystems.terrainService.AllTerrainRequest, distributedsystems.terrainService.AllTerrainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.terrainService.AllTerrainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.terrainService.AllTerrainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TerrainServiceMethodDescriptorSupplier("all"))
              .build();
        }
      }
    }
    return getAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainRequest,
      distributedsystems.terrainService.TerrainResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = distributedsystems.terrainService.TerrainRequest.class,
      responseType = distributedsystems.terrainService.TerrainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainRequest,
      distributedsystems.terrainService.TerrainResponse> getAddMethod() {
    io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainRequest, distributedsystems.terrainService.TerrainResponse> getAddMethod;
    if ((getAddMethod = TerrainServiceGrpc.getAddMethod) == null) {
      synchronized (TerrainServiceGrpc.class) {
        if ((getAddMethod = TerrainServiceGrpc.getAddMethod) == null) {
          TerrainServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<distributedsystems.terrainService.TerrainRequest, distributedsystems.terrainService.TerrainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.terrainService.TerrainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.terrainService.TerrainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TerrainServiceMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainByIdRequest,
      distributedsystems.terrainService.TerrainResponse> getByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "byId",
      requestType = distributedsystems.terrainService.TerrainByIdRequest.class,
      responseType = distributedsystems.terrainService.TerrainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainByIdRequest,
      distributedsystems.terrainService.TerrainResponse> getByIdMethod() {
    io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainByIdRequest, distributedsystems.terrainService.TerrainResponse> getByIdMethod;
    if ((getByIdMethod = TerrainServiceGrpc.getByIdMethod) == null) {
      synchronized (TerrainServiceGrpc.class) {
        if ((getByIdMethod = TerrainServiceGrpc.getByIdMethod) == null) {
          TerrainServiceGrpc.getByIdMethod = getByIdMethod =
              io.grpc.MethodDescriptor.<distributedsystems.terrainService.TerrainByIdRequest, distributedsystems.terrainService.TerrainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "byId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.terrainService.TerrainByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.terrainService.TerrainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TerrainServiceMethodDescriptorSupplier("byId"))
              .build();
        }
      }
    }
    return getByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainByNameRequest,
      distributedsystems.terrainService.TerrainResponse> getByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "byName",
      requestType = distributedsystems.terrainService.TerrainByNameRequest.class,
      responseType = distributedsystems.terrainService.TerrainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainByNameRequest,
      distributedsystems.terrainService.TerrainResponse> getByNameMethod() {
    io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainByNameRequest, distributedsystems.terrainService.TerrainResponse> getByNameMethod;
    if ((getByNameMethod = TerrainServiceGrpc.getByNameMethod) == null) {
      synchronized (TerrainServiceGrpc.class) {
        if ((getByNameMethod = TerrainServiceGrpc.getByNameMethod) == null) {
          TerrainServiceGrpc.getByNameMethod = getByNameMethod =
              io.grpc.MethodDescriptor.<distributedsystems.terrainService.TerrainByNameRequest, distributedsystems.terrainService.TerrainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "byName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.terrainService.TerrainByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.terrainService.TerrainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TerrainServiceMethodDescriptorSupplier("byName"))
              .build();
        }
      }
    }
    return getByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainByIdRequest,
      distributedsystems.terrainService.DeleteTerrainResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = distributedsystems.terrainService.TerrainByIdRequest.class,
      responseType = distributedsystems.terrainService.DeleteTerrainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainByIdRequest,
      distributedsystems.terrainService.DeleteTerrainResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<distributedsystems.terrainService.TerrainByIdRequest, distributedsystems.terrainService.DeleteTerrainResponse> getDeleteMethod;
    if ((getDeleteMethod = TerrainServiceGrpc.getDeleteMethod) == null) {
      synchronized (TerrainServiceGrpc.class) {
        if ((getDeleteMethod = TerrainServiceGrpc.getDeleteMethod) == null) {
          TerrainServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<distributedsystems.terrainService.TerrainByIdRequest, distributedsystems.terrainService.DeleteTerrainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.terrainService.TerrainByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.terrainService.DeleteTerrainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TerrainServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TerrainServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TerrainServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TerrainServiceStub>() {
        @java.lang.Override
        public TerrainServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TerrainServiceStub(channel, callOptions);
        }
      };
    return TerrainServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TerrainServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TerrainServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TerrainServiceBlockingStub>() {
        @java.lang.Override
        public TerrainServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TerrainServiceBlockingStub(channel, callOptions);
        }
      };
    return TerrainServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TerrainServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TerrainServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TerrainServiceFutureStub>() {
        @java.lang.Override
        public TerrainServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TerrainServiceFutureStub(channel, callOptions);
        }
      };
    return TerrainServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TerrainServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void all(distributedsystems.terrainService.AllTerrainRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.terrainService.AllTerrainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllMethod(), responseObserver);
    }

    /**
     */
    public void add(distributedsystems.terrainService.TerrainRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.terrainService.TerrainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void byId(distributedsystems.terrainService.TerrainByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.terrainService.TerrainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getByIdMethod(), responseObserver);
    }

    /**
     */
    public void byName(distributedsystems.terrainService.TerrainByNameRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.terrainService.TerrainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getByNameMethod(), responseObserver);
    }

    /**
     */
    public void delete(distributedsystems.terrainService.TerrainByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.terrainService.DeleteTerrainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.terrainService.AllTerrainRequest,
                distributedsystems.terrainService.AllTerrainResponse>(
                  this, METHODID_ALL)))
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.terrainService.TerrainRequest,
                distributedsystems.terrainService.TerrainResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.terrainService.TerrainByIdRequest,
                distributedsystems.terrainService.TerrainResponse>(
                  this, METHODID_BY_ID)))
          .addMethod(
            getByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.terrainService.TerrainByNameRequest,
                distributedsystems.terrainService.TerrainResponse>(
                  this, METHODID_BY_NAME)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.terrainService.TerrainByIdRequest,
                distributedsystems.terrainService.DeleteTerrainResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class TerrainServiceStub extends io.grpc.stub.AbstractAsyncStub<TerrainServiceStub> {
    private TerrainServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TerrainServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TerrainServiceStub(channel, callOptions);
    }

    /**
     */
    public void all(distributedsystems.terrainService.AllTerrainRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.terrainService.AllTerrainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(distributedsystems.terrainService.TerrainRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.terrainService.TerrainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void byId(distributedsystems.terrainService.TerrainByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.terrainService.TerrainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void byName(distributedsystems.terrainService.TerrainByNameRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.terrainService.TerrainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(distributedsystems.terrainService.TerrainByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.terrainService.DeleteTerrainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TerrainServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TerrainServiceBlockingStub> {
    private TerrainServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TerrainServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TerrainServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public distributedsystems.terrainService.AllTerrainResponse all(distributedsystems.terrainService.AllTerrainRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.terrainService.TerrainResponse add(distributedsystems.terrainService.TerrainRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.terrainService.TerrainResponse byId(distributedsystems.terrainService.TerrainByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.terrainService.TerrainResponse byName(distributedsystems.terrainService.TerrainByNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.terrainService.DeleteTerrainResponse delete(distributedsystems.terrainService.TerrainByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TerrainServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TerrainServiceFutureStub> {
    private TerrainServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TerrainServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TerrainServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.terrainService.AllTerrainResponse> all(
        distributedsystems.terrainService.AllTerrainRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.terrainService.TerrainResponse> add(
        distributedsystems.terrainService.TerrainRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.terrainService.TerrainResponse> byId(
        distributedsystems.terrainService.TerrainByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.terrainService.TerrainResponse> byName(
        distributedsystems.terrainService.TerrainByNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.terrainService.DeleteTerrainResponse> delete(
        distributedsystems.terrainService.TerrainByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL = 0;
  private static final int METHODID_ADD = 1;
  private static final int METHODID_BY_ID = 2;
  private static final int METHODID_BY_NAME = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TerrainServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TerrainServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL:
          serviceImpl.all((distributedsystems.terrainService.AllTerrainRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.terrainService.AllTerrainResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((distributedsystems.terrainService.TerrainRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.terrainService.TerrainResponse>) responseObserver);
          break;
        case METHODID_BY_ID:
          serviceImpl.byId((distributedsystems.terrainService.TerrainByIdRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.terrainService.TerrainResponse>) responseObserver);
          break;
        case METHODID_BY_NAME:
          serviceImpl.byName((distributedsystems.terrainService.TerrainByNameRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.terrainService.TerrainResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((distributedsystems.terrainService.TerrainByIdRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.terrainService.DeleteTerrainResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TerrainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TerrainServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return distributedsystems.terrainService.Terrain.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TerrainService");
    }
  }

  private static final class TerrainServiceFileDescriptorSupplier
      extends TerrainServiceBaseDescriptorSupplier {
    TerrainServiceFileDescriptorSupplier() {}
  }

  private static final class TerrainServiceMethodDescriptorSupplier
      extends TerrainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TerrainServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TerrainServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TerrainServiceFileDescriptorSupplier())
              .addMethod(getAllMethod())
              .addMethod(getAddMethod())
              .addMethod(getByIdMethod())
              .addMethod(getByNameMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}

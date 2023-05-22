package com.sdia.radar_microservice.grpc.stubs;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: RadargRPC.proto")
public final class RadarServicesGrpc {

  private RadarServicesGrpc() {}

  public static final String SERVICE_NAME = "RadarServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest,
      com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire> getGetProprietaireByVehiculeIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProprietaireByVehiculeId",
      requestType = com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest.class,
      responseType = com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest,
      com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire> getGetProprietaireByVehiculeIdMethod() {
    io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest, com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire> getGetProprietaireByVehiculeIdMethod;
    if ((getGetProprietaireByVehiculeIdMethod = RadarServicesGrpc.getGetProprietaireByVehiculeIdMethod) == null) {
      synchronized (RadarServicesGrpc.class) {
        if ((getGetProprietaireByVehiculeIdMethod = RadarServicesGrpc.getGetProprietaireByVehiculeIdMethod) == null) {
          RadarServicesGrpc.getGetProprietaireByVehiculeIdMethod = getGetProprietaireByVehiculeIdMethod = 
              io.grpc.MethodDescriptor.<com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest, com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarServices", "GetProprietaireByVehiculeId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServicesMethodDescriptorSupplier("GetProprietaireByVehiculeId"))
                  .build();
          }
        }
     }
     return getGetProprietaireByVehiculeIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty,
      com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar> getGetRadarListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRadarList",
      requestType = com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty.class,
      responseType = com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty,
      com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar> getGetRadarListMethod() {
    io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty, com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar> getGetRadarListMethod;
    if ((getGetRadarListMethod = RadarServicesGrpc.getGetRadarListMethod) == null) {
      synchronized (RadarServicesGrpc.class) {
        if ((getGetRadarListMethod = RadarServicesGrpc.getGetRadarListMethod) == null) {
          RadarServicesGrpc.getGetRadarListMethod = getGetRadarListMethod = 
              io.grpc.MethodDescriptor.<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty, com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarServices", "GetRadarList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServicesMethodDescriptorSupplier("GetRadarList"))
                  .build();
          }
        }
     }
     return getGetRadarListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest,
      com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete> getDeleteRadarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRadar",
      requestType = com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest.class,
      responseType = com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest,
      com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete> getDeleteRadarMethod() {
    io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest, com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete> getDeleteRadarMethod;
    if ((getDeleteRadarMethod = RadarServicesGrpc.getDeleteRadarMethod) == null) {
      synchronized (RadarServicesGrpc.class) {
        if ((getDeleteRadarMethod = RadarServicesGrpc.getDeleteRadarMethod) == null) {
          RadarServicesGrpc.getDeleteRadarMethod = getDeleteRadarMethod = 
              io.grpc.MethodDescriptor.<com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest, com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarServices", "DeleteRadar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServicesMethodDescriptorSupplier("DeleteRadar"))
                  .build();
          }
        }
     }
     return getDeleteRadarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty,
      com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo> getGetAloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlo",
      requestType = com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty.class,
      responseType = com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty,
      com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo> getGetAloMethod() {
    io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty, com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo> getGetAloMethod;
    if ((getGetAloMethod = RadarServicesGrpc.getGetAloMethod) == null) {
      synchronized (RadarServicesGrpc.class) {
        if ((getGetAloMethod = RadarServicesGrpc.getGetAloMethod) == null) {
          RadarServicesGrpc.getGetAloMethod = getGetAloMethod = 
              io.grpc.MethodDescriptor.<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty, com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarServices", "GetAlo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServicesMethodDescriptorSupplier("GetAlo"))
                  .build();
          }
        }
     }
     return getGetAloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadarServicesStub newStub(io.grpc.Channel channel) {
    return new RadarServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadarServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadarServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadarServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadarServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class RadarServicesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Type of communication  : UNARY MODEL
     * </pre>
     */
    public void getProprietaireByVehiculeId(com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireByVehiculeIdMethod(), responseObserver);
    }

    /**
     */
    public void getRadarList(com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty request,
        io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRadarListMethod(), responseObserver);
    }

    /**
     */
    public void deleteRadar(com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRadarMethod(), responseObserver);
    }

    /**
     */
    public void getAlo(com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty request,
        io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProprietaireByVehiculeIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest,
                com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire>(
                  this, METHODID_GET_PROPRIETAIRE_BY_VEHICULE_ID)))
          .addMethod(
            getGetRadarListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty,
                com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar>(
                  this, METHODID_GET_RADAR_LIST)))
          .addMethod(
            getDeleteRadarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest,
                com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete>(
                  this, METHODID_DELETE_RADAR)))
          .addMethod(
            getGetAloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty,
                com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo>(
                  this, METHODID_GET_ALO)))
          .build();
    }
  }

  /**
   */
  public static final class RadarServicesStub extends io.grpc.stub.AbstractStub<RadarServicesStub> {
    private RadarServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServicesStub(channel, callOptions);
    }

    /**
     * <pre>
     *Type of communication  : UNARY MODEL
     * </pre>
     */
    public void getProprietaireByVehiculeId(com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireByVehiculeIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRadarList(com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty request,
        io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRadarListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRadar(com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRadarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAlo(com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty request,
        io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RadarServicesBlockingStub extends io.grpc.stub.AbstractStub<RadarServicesBlockingStub> {
    private RadarServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Type of communication  : UNARY MODEL
     * </pre>
     */
    public com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire getProprietaireByVehiculeId(com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireByVehiculeIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar getRadarList(com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetRadarListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete deleteRadar(com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRadarMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo getAlo(com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RadarServicesFutureStub extends io.grpc.stub.AbstractStub<RadarServicesFutureStub> {
    private RadarServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Type of communication  : UNARY MODEL
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire> getProprietaireByVehiculeId(
        com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireByVehiculeIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar> getRadarList(
        com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRadarListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete> deleteRadar(
        com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRadarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo> getAlo(
        com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPRIETAIRE_BY_VEHICULE_ID = 0;
  private static final int METHODID_GET_RADAR_LIST = 1;
  private static final int METHODID_DELETE_RADAR = 2;
  private static final int METHODID_GET_ALO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadarServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadarServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROPRIETAIRE_BY_VEHICULE_ID:
          serviceImpl.getProprietaireByVehiculeId((com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Proprietaire>) responseObserver);
          break;
        case METHODID_GET_RADAR_LIST:
          serviceImpl.getRadarList((com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty) request,
              (io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.ListRadar>) responseObserver);
          break;
        case METHODID_DELETE_RADAR:
          serviceImpl.deleteRadar((com.sdia.radar_microservice.grpc.stubs.RadarRPC.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.BoolDelete>) responseObserver);
          break;
        case METHODID_GET_ALO:
          serviceImpl.getAlo((com.sdia.radar_microservice.grpc.stubs.RadarRPC.Empty) request,
              (io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.RadarRPC.Alo>) responseObserver);
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

  private static abstract class RadarServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadarServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sdia.radar_microservice.grpc.stubs.RadarRPC.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadarServices");
    }
  }

  private static final class RadarServicesFileDescriptorSupplier
      extends RadarServicesBaseDescriptorSupplier {
    RadarServicesFileDescriptorSupplier() {}
  }

  private static final class RadarServicesMethodDescriptorSupplier
      extends RadarServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadarServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadarServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadarServicesFileDescriptorSupplier())
              .addMethod(getGetProprietaireByVehiculeIdMethod())
              .addMethod(getGetRadarListMethod())
              .addMethod(getDeleteRadarMethod())
              .addMethod(getGetAloMethod())
              .build();
        }
      }
    }
    return result;
  }
}

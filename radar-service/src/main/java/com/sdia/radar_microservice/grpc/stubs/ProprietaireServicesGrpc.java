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
    comments = "Source: ProprietairegRPC.proto")
public final class ProprietaireServicesGrpc {

  private ProprietaireServicesGrpc() {}

  public static final String SERVICE_NAME = "ProprietaireServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest,
      com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire> getGetProprietaireByVehiculeIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProprietaireByVehiculeId",
      requestType = com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest.class,
      responseType = com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest,
      com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire> getGetProprietaireByVehiculeIdMethod() {
    io.grpc.MethodDescriptor<com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest, com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire> getGetProprietaireByVehiculeIdMethod;
    if ((getGetProprietaireByVehiculeIdMethod = ProprietaireServicesGrpc.getGetProprietaireByVehiculeIdMethod) == null) {
      synchronized (ProprietaireServicesGrpc.class) {
        if ((getGetProprietaireByVehiculeIdMethod = ProprietaireServicesGrpc.getGetProprietaireByVehiculeIdMethod) == null) {
          ProprietaireServicesGrpc.getGetProprietaireByVehiculeIdMethod = getGetProprietaireByVehiculeIdMethod = 
              io.grpc.MethodDescriptor.<com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest, com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireServices", "GetProprietaireByVehiculeId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireServicesMethodDescriptorSupplier("GetProprietaireByVehiculeId"))
                  .build();
          }
        }
     }
     return getGetProprietaireByVehiculeIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProprietaireServicesStub newStub(io.grpc.Channel channel) {
    return new ProprietaireServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProprietaireServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProprietaireServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProprietaireServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProprietaireServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class ProprietaireServicesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Type of communication  : UNARY MODEL
     * </pre>
     */
    public void getProprietaireByVehiculeId(com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireByVehiculeIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProprietaireByVehiculeIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest,
                com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire>(
                  this, METHODID_GET_PROPRIETAIRE_BY_VEHICULE_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ProprietaireServicesStub extends io.grpc.stub.AbstractStub<ProprietaireServicesStub> {
    private ProprietaireServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireServicesStub(channel, callOptions);
    }

    /**
     * <pre>
     *Type of communication  : UNARY MODEL
     * </pre>
     */
    public void getProprietaireByVehiculeId(com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireByVehiculeIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProprietaireServicesBlockingStub extends io.grpc.stub.AbstractStub<ProprietaireServicesBlockingStub> {
    private ProprietaireServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireServicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Type of communication  : UNARY MODEL
     * </pre>
     */
    public com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire getProprietaireByVehiculeId(com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireByVehiculeIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProprietaireServicesFutureStub extends io.grpc.stub.AbstractStub<ProprietaireServicesFutureStub> {
    private ProprietaireServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireServicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Type of communication  : UNARY MODEL
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire> getProprietaireByVehiculeId(
        com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireByVehiculeIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPRIETAIRE_BY_VEHICULE_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProprietaireServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProprietaireServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROPRIETAIRE_BY_VEHICULE_ID:
          serviceImpl.getProprietaireByVehiculeId((com.sdia.radar_microservice.grpc.stubs.ProprietaireX.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.sdia.radar_microservice.grpc.stubs.ProprietaireX.Proprietaire>) responseObserver);
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

  private static abstract class ProprietaireServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProprietaireServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sdia.radar_microservice.grpc.stubs.ProprietaireX.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProprietaireServices");
    }
  }

  private static final class ProprietaireServicesFileDescriptorSupplier
      extends ProprietaireServicesBaseDescriptorSupplier {
    ProprietaireServicesFileDescriptorSupplier() {}
  }

  private static final class ProprietaireServicesMethodDescriptorSupplier
      extends ProprietaireServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProprietaireServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProprietaireServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProprietaireServicesFileDescriptorSupplier())
              .addMethod(getGetProprietaireByVehiculeIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}

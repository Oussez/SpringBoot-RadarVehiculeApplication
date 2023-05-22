package com.sdia.immatriculationservice.grpc.stubs;

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
    comments = "Source: gRPC.proto")
public final class ProprietaireServicesGrpc {

  private ProprietaireServicesGrpc() {}

  public static final String SERVICE_NAME = "ProprietaireServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> getGetProprietaireByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProprietaireById",
      requestType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest.class,
      responseType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> getGetProprietaireByIdMethod() {
    io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> getGetProprietaireByIdMethod;
    if ((getGetProprietaireByIdMethod = ProprietaireServicesGrpc.getGetProprietaireByIdMethod) == null) {
      synchronized (ProprietaireServicesGrpc.class) {
        if ((getGetProprietaireByIdMethod = ProprietaireServicesGrpc.getGetProprietaireByIdMethod) == null) {
          ProprietaireServicesGrpc.getGetProprietaireByIdMethod = getGetProprietaireByIdMethod = 
              io.grpc.MethodDescriptor.<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireServices", "GetProprietaireById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireServicesMethodDescriptorSupplier("GetProprietaireById"))
                  .build();
          }
        }
     }
     return getGetProprietaireByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire> getGetProprietairesListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProprietairesList",
      requestType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty.class,
      responseType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire> getGetProprietairesListMethod() {
    io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire> getGetProprietairesListMethod;
    if ((getGetProprietairesListMethod = ProprietaireServicesGrpc.getGetProprietairesListMethod) == null) {
      synchronized (ProprietaireServicesGrpc.class) {
        if ((getGetProprietairesListMethod = ProprietaireServicesGrpc.getGetProprietairesListMethod) == null) {
          ProprietaireServicesGrpc.getGetProprietairesListMethod = getGetProprietairesListMethod = 
              io.grpc.MethodDescriptor.<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireServices", "GetProprietairesList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireServicesMethodDescriptorSupplier("GetProprietairesList"))
                  .build();
          }
        }
     }
     return getGetProprietairesListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> getAddProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProprietaire",
      requestType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest.class,
      responseType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> getAddProprietaireMethod() {
    io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> getAddProprietaireMethod;
    if ((getAddProprietaireMethod = ProprietaireServicesGrpc.getAddProprietaireMethod) == null) {
      synchronized (ProprietaireServicesGrpc.class) {
        if ((getAddProprietaireMethod = ProprietaireServicesGrpc.getAddProprietaireMethod) == null) {
          ProprietaireServicesGrpc.getAddProprietaireMethod = getAddProprietaireMethod = 
              io.grpc.MethodDescriptor.<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireServices", "AddProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireServicesMethodDescriptorSupplier("AddProprietaire"))
                  .build();
          }
        }
     }
     return getAddProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete> getDeleteProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProprietaire",
      requestType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest.class,
      responseType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete> getDeleteProprietaireMethod() {
    io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete> getDeleteProprietaireMethod;
    if ((getDeleteProprietaireMethod = ProprietaireServicesGrpc.getDeleteProprietaireMethod) == null) {
      synchronized (ProprietaireServicesGrpc.class) {
        if ((getDeleteProprietaireMethod = ProprietaireServicesGrpc.getDeleteProprietaireMethod) == null) {
          ProprietaireServicesGrpc.getDeleteProprietaireMethod = getDeleteProprietaireMethod = 
              io.grpc.MethodDescriptor.<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireServices", "DeleteProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireServicesMethodDescriptorSupplier("DeleteProprietaire"))
                  .build();
          }
        }
     }
     return getDeleteProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo> getGetAloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlo",
      requestType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty.class,
      responseType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo> getGetAloMethod() {
    io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo> getGetAloMethod;
    if ((getGetAloMethod = ProprietaireServicesGrpc.getGetAloMethod) == null) {
      synchronized (ProprietaireServicesGrpc.class) {
        if ((getGetAloMethod = ProprietaireServicesGrpc.getGetAloMethod) == null) {
          ProprietaireServicesGrpc.getGetAloMethod = getGetAloMethod = 
              io.grpc.MethodDescriptor.<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireServices", "GetAlo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireServicesMethodDescriptorSupplier("GetAlo"))
                  .build();
          }
        }
     }
     return getGetAloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> getGetProprietaireByVehiculeIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProprietaireByVehiculeId",
      requestType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest.class,
      responseType = com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest,
      com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> getGetProprietaireByVehiculeIdMethod() {
    io.grpc.MethodDescriptor<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> getGetProprietaireByVehiculeIdMethod;
    if ((getGetProprietaireByVehiculeIdMethod = ProprietaireServicesGrpc.getGetProprietaireByVehiculeIdMethod) == null) {
      synchronized (ProprietaireServicesGrpc.class) {
        if ((getGetProprietaireByVehiculeIdMethod = ProprietaireServicesGrpc.getGetProprietaireByVehiculeIdMethod) == null) {
          ProprietaireServicesGrpc.getGetProprietaireByVehiculeIdMethod = getGetProprietaireByVehiculeIdMethod = 
              io.grpc.MethodDescriptor.<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest, com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireServices", "GetProprietaireByVehiculeId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire.getDefaultInstance()))
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
    public void getProprietaireById(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireByIdMethod(), responseObserver);
    }

    /**
     */
    public void getProprietairesList(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietairesListMethod(), responseObserver);
    }

    /**
     */
    public void addProprietaire(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> responseObserver) {
      asyncUnimplementedUnaryCall(getAddProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void deleteProprietaire(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void getAlo(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAloMethod(), responseObserver);
    }

    /**
     */
    public void getProprietaireByVehiculeId(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireByVehiculeIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProprietaireByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest,
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire>(
                  this, METHODID_GET_PROPRIETAIRE_BY_ID)))
          .addMethod(
            getGetProprietairesListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty,
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire>(
                  this, METHODID_GET_PROPRIETAIRES_LIST)))
          .addMethod(
            getAddProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest,
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire>(
                  this, METHODID_ADD_PROPRIETAIRE)))
          .addMethod(
            getDeleteProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest,
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete>(
                  this, METHODID_DELETE_PROPRIETAIRE)))
          .addMethod(
            getGetAloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty,
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo>(
                  this, METHODID_GET_ALO)))
          .addMethod(
            getGetProprietaireByVehiculeIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest,
                com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire>(
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
    public void getProprietaireById(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProprietairesList(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietairesListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProprietaire(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProprietaire(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAlo(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProprietaireByVehiculeId(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest request,
        io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> responseObserver) {
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
    public com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire getProprietaireById(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire getProprietairesList(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietairesListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire addProprietaire(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete deleteProprietaire(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo getAlo(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire getProprietaireByVehiculeId(com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> getProprietaireById(
        com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire> getProprietairesList(
        com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietairesListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> addProprietaire(
        com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete> deleteProprietaire(
        com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo> getAlo(
        com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire> getProprietaireByVehiculeId(
        com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireByVehiculeIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPRIETAIRE_BY_ID = 0;
  private static final int METHODID_GET_PROPRIETAIRES_LIST = 1;
  private static final int METHODID_ADD_PROPRIETAIRE = 2;
  private static final int METHODID_DELETE_PROPRIETAIRE = 3;
  private static final int METHODID_GET_ALO = 4;
  private static final int METHODID_GET_PROPRIETAIRE_BY_VEHICULE_ID = 5;

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
        case METHODID_GET_PROPRIETAIRE_BY_ID:
          serviceImpl.getProprietaireById((com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire>) responseObserver);
          break;
        case METHODID_GET_PROPRIETAIRES_LIST:
          serviceImpl.getProprietairesList((com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty) request,
              (io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ListProprietaire>) responseObserver);
          break;
        case METHODID_ADD_PROPRIETAIRE:
          serviceImpl.addProprietaire((com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.AddProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire>) responseObserver);
          break;
        case METHODID_DELETE_PROPRIETAIRE:
          serviceImpl.deleteProprietaire((com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.ProprietaireByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.BoolDelete>) responseObserver);
          break;
        case METHODID_GET_ALO:
          serviceImpl.getAlo((com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Empty) request,
              (io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Alo>) responseObserver);
          break;
        case METHODID_GET_PROPRIETAIRE_BY_VEHICULE_ID:
          serviceImpl.getProprietaireByVehiculeId((com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.Proprietaire>) responseObserver);
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
      return com.sdia.immatriculationservice.grpc.stubs.ProprietaireX.getDescriptor();
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
              .addMethod(getGetProprietaireByIdMethod())
              .addMethod(getGetProprietairesListMethod())
              .addMethod(getAddProprietaireMethod())
              .addMethod(getDeleteProprietaireMethod())
              .addMethod(getGetAloMethod())
              .addMethod(getGetProprietaireByVehiculeIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}

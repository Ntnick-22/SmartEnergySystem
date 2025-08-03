package generated.smartenergy.control;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: EnergyControl.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnergyControlServiceGrpc {

  private EnergyControlServiceGrpc() {}

  public static final String SERVICE_NAME = "EnergyControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.smartenergy.control.EnergyControl.DeviceControlRequest,
      generated.smartenergy.control.EnergyControl.ControlResponse> getControlDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlDevice",
      requestType = generated.smartenergy.control.EnergyControl.DeviceControlRequest.class,
      responseType = generated.smartenergy.control.EnergyControl.ControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smartenergy.control.EnergyControl.DeviceControlRequest,
      generated.smartenergy.control.EnergyControl.ControlResponse> getControlDeviceMethod() {
    io.grpc.MethodDescriptor<generated.smartenergy.control.EnergyControl.DeviceControlRequest, generated.smartenergy.control.EnergyControl.ControlResponse> getControlDeviceMethod;
    if ((getControlDeviceMethod = EnergyControlServiceGrpc.getControlDeviceMethod) == null) {
      synchronized (EnergyControlServiceGrpc.class) {
        if ((getControlDeviceMethod = EnergyControlServiceGrpc.getControlDeviceMethod) == null) {
          EnergyControlServiceGrpc.getControlDeviceMethod = getControlDeviceMethod =
              io.grpc.MethodDescriptor.<generated.smartenergy.control.EnergyControl.DeviceControlRequest, generated.smartenergy.control.EnergyControl.ControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ControlDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.control.EnergyControl.DeviceControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.control.EnergyControl.ControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnergyControlServiceMethodDescriptorSupplier("ControlDevice"))
              .build();
        }
      }
    }
    return getControlDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smartenergy.control.EnergyControl.DeviceControlRequest,
      generated.smartenergy.control.EnergyControl.BatchControlResponse> getBatchControlDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchControlDevices",
      requestType = generated.smartenergy.control.EnergyControl.DeviceControlRequest.class,
      responseType = generated.smartenergy.control.EnergyControl.BatchControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.smartenergy.control.EnergyControl.DeviceControlRequest,
      generated.smartenergy.control.EnergyControl.BatchControlResponse> getBatchControlDevicesMethod() {
    io.grpc.MethodDescriptor<generated.smartenergy.control.EnergyControl.DeviceControlRequest, generated.smartenergy.control.EnergyControl.BatchControlResponse> getBatchControlDevicesMethod;
    if ((getBatchControlDevicesMethod = EnergyControlServiceGrpc.getBatchControlDevicesMethod) == null) {
      synchronized (EnergyControlServiceGrpc.class) {
        if ((getBatchControlDevicesMethod = EnergyControlServiceGrpc.getBatchControlDevicesMethod) == null) {
          EnergyControlServiceGrpc.getBatchControlDevicesMethod = getBatchControlDevicesMethod =
              io.grpc.MethodDescriptor.<generated.smartenergy.control.EnergyControl.DeviceControlRequest, generated.smartenergy.control.EnergyControl.BatchControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchControlDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.control.EnergyControl.DeviceControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.control.EnergyControl.BatchControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnergyControlServiceMethodDescriptorSupplier("BatchControlDevices"))
              .build();
        }
      }
    }
    return getBatchControlDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smartenergy.control.EnergyControl.StatusRequest,
      generated.smartenergy.control.EnergyControl.DeviceStatus> getGetDeviceStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeviceStatus",
      requestType = generated.smartenergy.control.EnergyControl.StatusRequest.class,
      responseType = generated.smartenergy.control.EnergyControl.DeviceStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smartenergy.control.EnergyControl.StatusRequest,
      generated.smartenergy.control.EnergyControl.DeviceStatus> getGetDeviceStatusMethod() {
    io.grpc.MethodDescriptor<generated.smartenergy.control.EnergyControl.StatusRequest, generated.smartenergy.control.EnergyControl.DeviceStatus> getGetDeviceStatusMethod;
    if ((getGetDeviceStatusMethod = EnergyControlServiceGrpc.getGetDeviceStatusMethod) == null) {
      synchronized (EnergyControlServiceGrpc.class) {
        if ((getGetDeviceStatusMethod = EnergyControlServiceGrpc.getGetDeviceStatusMethod) == null) {
          EnergyControlServiceGrpc.getGetDeviceStatusMethod = getGetDeviceStatusMethod =
              io.grpc.MethodDescriptor.<generated.smartenergy.control.EnergyControl.StatusRequest, generated.smartenergy.control.EnergyControl.DeviceStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeviceStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.control.EnergyControl.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.control.EnergyControl.DeviceStatus.getDefaultInstance()))
              .setSchemaDescriptor(new EnergyControlServiceMethodDescriptorSupplier("GetDeviceStatus"))
              .build();
        }
      }
    }
    return getGetDeviceStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnergyControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnergyControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnergyControlServiceStub>() {
        @java.lang.Override
        public EnergyControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnergyControlServiceStub(channel, callOptions);
        }
      };
    return EnergyControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnergyControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnergyControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnergyControlServiceBlockingStub>() {
        @java.lang.Override
        public EnergyControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnergyControlServiceBlockingStub(channel, callOptions);
        }
      };
    return EnergyControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnergyControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnergyControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnergyControlServiceFutureStub>() {
        @java.lang.Override
        public EnergyControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnergyControlServiceFutureStub(channel, callOptions);
        }
      };
    return EnergyControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EnergyControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void controlDevice(generated.smartenergy.control.EnergyControl.DeviceControlRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.control.EnergyControl.ControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getControlDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.smartenergy.control.EnergyControl.DeviceControlRequest> batchControlDevices(
        io.grpc.stub.StreamObserver<generated.smartenergy.control.EnergyControl.BatchControlResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBatchControlDevicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void getDeviceStatus(generated.smartenergy.control.EnergyControl.StatusRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.control.EnergyControl.DeviceStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getControlDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.smartenergy.control.EnergyControl.DeviceControlRequest,
                generated.smartenergy.control.EnergyControl.ControlResponse>(
                  this, METHODID_CONTROL_DEVICE)))
          .addMethod(
            getBatchControlDevicesMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                generated.smartenergy.control.EnergyControl.DeviceControlRequest,
                generated.smartenergy.control.EnergyControl.BatchControlResponse>(
                  this, METHODID_BATCH_CONTROL_DEVICES)))
          .addMethod(
            getGetDeviceStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.smartenergy.control.EnergyControl.StatusRequest,
                generated.smartenergy.control.EnergyControl.DeviceStatus>(
                  this, METHODID_GET_DEVICE_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class EnergyControlServiceStub extends io.grpc.stub.AbstractAsyncStub<EnergyControlServiceStub> {
    private EnergyControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnergyControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnergyControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void controlDevice(generated.smartenergy.control.EnergyControl.DeviceControlRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.control.EnergyControl.ControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getControlDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.smartenergy.control.EnergyControl.DeviceControlRequest> batchControlDevices(
        io.grpc.stub.StreamObserver<generated.smartenergy.control.EnergyControl.BatchControlResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getBatchControlDevicesMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void getDeviceStatus(generated.smartenergy.control.EnergyControl.StatusRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.control.EnergyControl.DeviceStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EnergyControlServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EnergyControlServiceBlockingStub> {
    private EnergyControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnergyControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnergyControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public generated.smartenergy.control.EnergyControl.ControlResponse controlDevice(generated.smartenergy.control.EnergyControl.DeviceControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getControlDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public generated.smartenergy.control.EnergyControl.DeviceStatus getDeviceStatus(generated.smartenergy.control.EnergyControl.StatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EnergyControlServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EnergyControlServiceFutureStub> {
    private EnergyControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnergyControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnergyControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smartenergy.control.EnergyControl.ControlResponse> controlDevice(
        generated.smartenergy.control.EnergyControl.DeviceControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getControlDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smartenergy.control.EnergyControl.DeviceStatus> getDeviceStatus(
        generated.smartenergy.control.EnergyControl.StatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONTROL_DEVICE = 0;
  private static final int METHODID_GET_DEVICE_STATUS = 1;
  private static final int METHODID_BATCH_CONTROL_DEVICES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnergyControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnergyControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONTROL_DEVICE:
          serviceImpl.controlDevice((generated.smartenergy.control.EnergyControl.DeviceControlRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartenergy.control.EnergyControl.ControlResponse>) responseObserver);
          break;
        case METHODID_GET_DEVICE_STATUS:
          serviceImpl.getDeviceStatus((generated.smartenergy.control.EnergyControl.StatusRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartenergy.control.EnergyControl.DeviceStatus>) responseObserver);
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
        case METHODID_BATCH_CONTROL_DEVICES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.batchControlDevices(
              (io.grpc.stub.StreamObserver<generated.smartenergy.control.EnergyControl.BatchControlResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EnergyControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnergyControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.smartenergy.control.EnergyControl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnergyControlService");
    }
  }

  private static final class EnergyControlServiceFileDescriptorSupplier
      extends EnergyControlServiceBaseDescriptorSupplier {
    EnergyControlServiceFileDescriptorSupplier() {}
  }

  private static final class EnergyControlServiceMethodDescriptorSupplier
      extends EnergyControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnergyControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EnergyControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnergyControlServiceFileDescriptorSupplier())
              .addMethod(getControlDeviceMethod())
              .addMethod(getBatchControlDevicesMethod())
              .addMethod(getGetDeviceStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}

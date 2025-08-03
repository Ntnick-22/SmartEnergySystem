package generated.smartenergy.sensor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: SensorService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SensorServiceGrpc {

  private SensorServiceGrpc() {}

  public static final String SERVICE_NAME = "SensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest,
      generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> getGetCurrentReadingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentReading",
      requestType = generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest.class,
      responseType = generated.smartenergy.sensor.SensorServiceOuterClass.SensorData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest,
      generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> getGetCurrentReadingMethod() {
    io.grpc.MethodDescriptor<generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest, generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> getGetCurrentReadingMethod;
    if ((getGetCurrentReadingMethod = SensorServiceGrpc.getGetCurrentReadingMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetCurrentReadingMethod = SensorServiceGrpc.getGetCurrentReadingMethod) == null) {
          SensorServiceGrpc.getGetCurrentReadingMethod = getGetCurrentReadingMethod =
              io.grpc.MethodDescriptor.<generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest, generated.smartenergy.sensor.SensorServiceOuterClass.SensorData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentReading"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.sensor.SensorServiceOuterClass.SensorData.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("GetCurrentReading"))
              .build();
        }
      }
    }
    return getGetCurrentReadingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest,
      generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> getStreamSensorDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSensorData",
      requestType = generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest.class,
      responseType = generated.smartenergy.sensor.SensorServiceOuterClass.SensorData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest,
      generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> getStreamSensorDataMethod() {
    io.grpc.MethodDescriptor<generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest, generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> getStreamSensorDataMethod;
    if ((getStreamSensorDataMethod = SensorServiceGrpc.getStreamSensorDataMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getStreamSensorDataMethod = SensorServiceGrpc.getStreamSensorDataMethod) == null) {
          SensorServiceGrpc.getStreamSensorDataMethod = getStreamSensorDataMethod =
              io.grpc.MethodDescriptor.<generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest, generated.smartenergy.sensor.SensorServiceOuterClass.SensorData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSensorData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.sensor.SensorServiceOuterClass.SensorData.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("StreamSensorData"))
              .build();
        }
      }
    }
    return getStreamSensorDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest,
      generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage> getSetAlertThresholdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAlertThreshold",
      requestType = generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest.class,
      responseType = generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest,
      generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage> getSetAlertThresholdMethod() {
    io.grpc.MethodDescriptor<generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest, generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage> getSetAlertThresholdMethod;
    if ((getSetAlertThresholdMethod = SensorServiceGrpc.getSetAlertThresholdMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getSetAlertThresholdMethod = SensorServiceGrpc.getSetAlertThresholdMethod) == null) {
          SensorServiceGrpc.getSetAlertThresholdMethod = getSetAlertThresholdMethod =
              io.grpc.MethodDescriptor.<generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest, generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAlertThreshold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("SetAlertThreshold"))
              .build();
        }
      }
    }
    return getSetAlertThresholdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SensorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceStub>() {
        @java.lang.Override
        public SensorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceStub(channel, callOptions);
        }
      };
    return SensorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceBlockingStub>() {
        @java.lang.Override
        public SensorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceBlockingStub(channel, callOptions);
        }
      };
    return SensorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceFutureStub>() {
        @java.lang.Override
        public SensorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceFutureStub(channel, callOptions);
        }
      };
    return SensorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SensorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void getCurrentReading(generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentReadingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    public void streamSensorData(generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamSensorDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void setAlertThreshold(generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAlertThresholdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrentReadingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest,
                generated.smartenergy.sensor.SensorServiceOuterClass.SensorData>(
                  this, METHODID_GET_CURRENT_READING)))
          .addMethod(
            getStreamSensorDataMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest,
                generated.smartenergy.sensor.SensorServiceOuterClass.SensorData>(
                  this, METHODID_STREAM_SENSOR_DATA)))
          .addMethod(
            getSetAlertThresholdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest,
                generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage>(
                  this, METHODID_SET_ALERT_THRESHOLD)))
          .build();
    }
  }

  /**
   */
  public static final class SensorServiceStub extends io.grpc.stub.AbstractAsyncStub<SensorServiceStub> {
    private SensorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void getCurrentReading(generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentReadingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    public void streamSensorData(generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamSensorDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void setAlertThreshold(generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAlertThresholdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SensorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SensorServiceBlockingStub> {
    private SensorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public generated.smartenergy.sensor.SensorServiceOuterClass.SensorData getCurrentReading(generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentReadingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    public java.util.Iterator<generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> streamSensorData(
        generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamSensorDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage setAlertThreshold(generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAlertThresholdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SensorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SensorServiceFutureStub> {
    private SensorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smartenergy.sensor.SensorServiceOuterClass.SensorData> getCurrentReading(
        generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentReadingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage> setAlertThreshold(
        generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAlertThresholdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_READING = 0;
  private static final int METHODID_STREAM_SENSOR_DATA = 1;
  private static final int METHODID_SET_ALERT_THRESHOLD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SensorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SensorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_READING:
          serviceImpl.getCurrentReading((generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartenergy.sensor.SensorServiceOuterClass.SensorData>) responseObserver);
          break;
        case METHODID_STREAM_SENSOR_DATA:
          serviceImpl.streamSensorData((generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartenergy.sensor.SensorServiceOuterClass.SensorData>) responseObserver);
          break;
        case METHODID_SET_ALERT_THRESHOLD:
          serviceImpl.setAlertThreshold((generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage>) responseObserver);
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

  private static abstract class SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SensorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.smartenergy.sensor.SensorServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SensorService");
    }
  }

  private static final class SensorServiceFileDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier {
    SensorServiceFileDescriptorSupplier() {}
  }

  private static final class SensorServiceMethodDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SensorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SensorServiceFileDescriptorSupplier())
              .addMethod(getGetCurrentReadingMethod())
              .addMethod(getStreamSensorDataMethod())
              .addMethod(getSetAlertThresholdMethod())
              .build();
        }
      }
    }
    return result;
  }
}

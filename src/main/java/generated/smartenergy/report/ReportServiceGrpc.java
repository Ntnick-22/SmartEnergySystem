package generated.smartenergy.report;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: ReportService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReportServiceGrpc {

  private ReportServiceGrpc() {}

  public static final String SERVICE_NAME = "ReportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.smartenergy.report.ReportServiceOuterClass.ReportRequest,
      generated.smartenergy.report.ReportServiceOuterClass.EnergyReport> getGenerateEnergyReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateEnergyReport",
      requestType = generated.smartenergy.report.ReportServiceOuterClass.ReportRequest.class,
      responseType = generated.smartenergy.report.ReportServiceOuterClass.EnergyReport.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smartenergy.report.ReportServiceOuterClass.ReportRequest,
      generated.smartenergy.report.ReportServiceOuterClass.EnergyReport> getGenerateEnergyReportMethod() {
    io.grpc.MethodDescriptor<generated.smartenergy.report.ReportServiceOuterClass.ReportRequest, generated.smartenergy.report.ReportServiceOuterClass.EnergyReport> getGenerateEnergyReportMethod;
    if ((getGenerateEnergyReportMethod = ReportServiceGrpc.getGenerateEnergyReportMethod) == null) {
      synchronized (ReportServiceGrpc.class) {
        if ((getGenerateEnergyReportMethod = ReportServiceGrpc.getGenerateEnergyReportMethod) == null) {
          ReportServiceGrpc.getGenerateEnergyReportMethod = getGenerateEnergyReportMethod =
              io.grpc.MethodDescriptor.<generated.smartenergy.report.ReportServiceOuterClass.ReportRequest, generated.smartenergy.report.ReportServiceOuterClass.EnergyReport>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateEnergyReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.report.ReportServiceOuterClass.ReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.report.ReportServiceOuterClass.EnergyReport.getDefaultInstance()))
              .setSchemaDescriptor(new ReportServiceMethodDescriptorSupplier("GenerateEnergyReport"))
              .build();
        }
      }
    }
    return getGenerateEnergyReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smartenergy.report.ReportServiceOuterClass.DashboardRequest,
      generated.smartenergy.report.ReportServiceOuterClass.DashboardUpdate> getLiveDashboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiveDashboard",
      requestType = generated.smartenergy.report.ReportServiceOuterClass.DashboardRequest.class,
      responseType = generated.smartenergy.report.ReportServiceOuterClass.DashboardUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.smartenergy.report.ReportServiceOuterClass.DashboardRequest,
      generated.smartenergy.report.ReportServiceOuterClass.DashboardUpdate> getLiveDashboardMethod() {
    io.grpc.MethodDescriptor<generated.smartenergy.report.ReportServiceOuterClass.DashboardRequest, generated.smartenergy.report.ReportServiceOuterClass.DashboardUpdate> getLiveDashboardMethod;
    if ((getLiveDashboardMethod = ReportServiceGrpc.getLiveDashboardMethod) == null) {
      synchronized (ReportServiceGrpc.class) {
        if ((getLiveDashboardMethod = ReportServiceGrpc.getLiveDashboardMethod) == null) {
          ReportServiceGrpc.getLiveDashboardMethod = getLiveDashboardMethod =
              io.grpc.MethodDescriptor.<generated.smartenergy.report.ReportServiceOuterClass.DashboardRequest, generated.smartenergy.report.ReportServiceOuterClass.DashboardUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiveDashboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.report.ReportServiceOuterClass.DashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.report.ReportServiceOuterClass.DashboardUpdate.getDefaultInstance()))
              .setSchemaDescriptor(new ReportServiceMethodDescriptorSupplier("LiveDashboard"))
              .build();
        }
      }
    }
    return getLiveDashboardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smartenergy.report.ReportServiceOuterClass.HealthRequest,
      generated.smartenergy.report.ReportServiceOuterClass.SystemHealth> getGetSystemHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSystemHealth",
      requestType = generated.smartenergy.report.ReportServiceOuterClass.HealthRequest.class,
      responseType = generated.smartenergy.report.ReportServiceOuterClass.SystemHealth.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smartenergy.report.ReportServiceOuterClass.HealthRequest,
      generated.smartenergy.report.ReportServiceOuterClass.SystemHealth> getGetSystemHealthMethod() {
    io.grpc.MethodDescriptor<generated.smartenergy.report.ReportServiceOuterClass.HealthRequest, generated.smartenergy.report.ReportServiceOuterClass.SystemHealth> getGetSystemHealthMethod;
    if ((getGetSystemHealthMethod = ReportServiceGrpc.getGetSystemHealthMethod) == null) {
      synchronized (ReportServiceGrpc.class) {
        if ((getGetSystemHealthMethod = ReportServiceGrpc.getGetSystemHealthMethod) == null) {
          ReportServiceGrpc.getGetSystemHealthMethod = getGetSystemHealthMethod =
              io.grpc.MethodDescriptor.<generated.smartenergy.report.ReportServiceOuterClass.HealthRequest, generated.smartenergy.report.ReportServiceOuterClass.SystemHealth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSystemHealth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.report.ReportServiceOuterClass.HealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartenergy.report.ReportServiceOuterClass.SystemHealth.getDefaultInstance()))
              .setSchemaDescriptor(new ReportServiceMethodDescriptorSupplier("GetSystemHealth"))
              .build();
        }
      }
    }
    return getGetSystemHealthMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReportServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReportServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReportServiceStub>() {
        @java.lang.Override
        public ReportServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReportServiceStub(channel, callOptions);
        }
      };
    return ReportServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReportServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReportServiceBlockingStub>() {
        @java.lang.Override
        public ReportServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReportServiceBlockingStub(channel, callOptions);
        }
      };
    return ReportServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReportServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReportServiceFutureStub>() {
        @java.lang.Override
        public ReportServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReportServiceFutureStub(channel, callOptions);
        }
      };
    return ReportServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ReportServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void generateEnergyReport(generated.smartenergy.report.ReportServiceOuterClass.ReportRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.report.ReportServiceOuterClass.EnergyReport> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateEnergyReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.smartenergy.report.ReportServiceOuterClass.DashboardRequest> liveDashboard(
        io.grpc.stub.StreamObserver<generated.smartenergy.report.ReportServiceOuterClass.DashboardUpdate> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLiveDashboardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void getSystemHealth(generated.smartenergy.report.ReportServiceOuterClass.HealthRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.report.ReportServiceOuterClass.SystemHealth> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSystemHealthMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateEnergyReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.smartenergy.report.ReportServiceOuterClass.ReportRequest,
                generated.smartenergy.report.ReportServiceOuterClass.EnergyReport>(
                  this, METHODID_GENERATE_ENERGY_REPORT)))
          .addMethod(
            getLiveDashboardMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                generated.smartenergy.report.ReportServiceOuterClass.DashboardRequest,
                generated.smartenergy.report.ReportServiceOuterClass.DashboardUpdate>(
                  this, METHODID_LIVE_DASHBOARD)))
          .addMethod(
            getGetSystemHealthMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.smartenergy.report.ReportServiceOuterClass.HealthRequest,
                generated.smartenergy.report.ReportServiceOuterClass.SystemHealth>(
                  this, METHODID_GET_SYSTEM_HEALTH)))
          .build();
    }
  }

  /**
   */
  public static final class ReportServiceStub extends io.grpc.stub.AbstractAsyncStub<ReportServiceStub> {
    private ReportServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReportServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void generateEnergyReport(generated.smartenergy.report.ReportServiceOuterClass.ReportRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.report.ReportServiceOuterClass.EnergyReport> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateEnergyReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.smartenergy.report.ReportServiceOuterClass.DashboardRequest> liveDashboard(
        io.grpc.stub.StreamObserver<generated.smartenergy.report.ReportServiceOuterClass.DashboardUpdate> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getLiveDashboardMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void getSystemHealth(generated.smartenergy.report.ReportServiceOuterClass.HealthRequest request,
        io.grpc.stub.StreamObserver<generated.smartenergy.report.ReportServiceOuterClass.SystemHealth> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSystemHealthMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReportServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReportServiceBlockingStub> {
    private ReportServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReportServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public generated.smartenergy.report.ReportServiceOuterClass.EnergyReport generateEnergyReport(generated.smartenergy.report.ReportServiceOuterClass.ReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateEnergyReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public generated.smartenergy.report.ReportServiceOuterClass.SystemHealth getSystemHealth(generated.smartenergy.report.ReportServiceOuterClass.HealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSystemHealthMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReportServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ReportServiceFutureStub> {
    private ReportServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReportServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smartenergy.report.ReportServiceOuterClass.EnergyReport> generateEnergyReport(
        generated.smartenergy.report.ReportServiceOuterClass.ReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateEnergyReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smartenergy.report.ReportServiceOuterClass.SystemHealth> getSystemHealth(
        generated.smartenergy.report.ReportServiceOuterClass.HealthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSystemHealthMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_ENERGY_REPORT = 0;
  private static final int METHODID_GET_SYSTEM_HEALTH = 1;
  private static final int METHODID_LIVE_DASHBOARD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_ENERGY_REPORT:
          serviceImpl.generateEnergyReport((generated.smartenergy.report.ReportServiceOuterClass.ReportRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartenergy.report.ReportServiceOuterClass.EnergyReport>) responseObserver);
          break;
        case METHODID_GET_SYSTEM_HEALTH:
          serviceImpl.getSystemHealth((generated.smartenergy.report.ReportServiceOuterClass.HealthRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartenergy.report.ReportServiceOuterClass.SystemHealth>) responseObserver);
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
        case METHODID_LIVE_DASHBOARD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.liveDashboard(
              (io.grpc.stub.StreamObserver<generated.smartenergy.report.ReportServiceOuterClass.DashboardUpdate>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.smartenergy.report.ReportServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReportService");
    }
  }

  private static final class ReportServiceFileDescriptorSupplier
      extends ReportServiceBaseDescriptorSupplier {
    ReportServiceFileDescriptorSupplier() {}
  }

  private static final class ReportServiceMethodDescriptorSupplier
      extends ReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReportServiceFileDescriptorSupplier())
              .addMethod(getGenerateEnergyReportMethod())
              .addMethod(getLiveDashboardMethod())
              .addMethod(getGetSystemHealthMethod())
              .build();
        }
      }
    }
    return result;
  }
}

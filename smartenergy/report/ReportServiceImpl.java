package distsys.smartenergy.report;

import generated.smartenergy.report.ReportServiceGrpc;
import generated.smartenergy.report.ReportServiceOuterClass.DashboardRequest;
import generated.smartenergy.report.ReportServiceOuterClass.DashboardUpdate;
import generated.smartenergy.report.ReportServiceOuterClass.EnergyReport;
import generated.smartenergy.report.ReportServiceOuterClass.HealthRequest;
import generated.smartenergy.report.ReportServiceOuterClass.ReportRequest;
import generated.smartenergy.report.ReportServiceOuterClass.SystemHealth;
import io.grpc.stub.StreamObserver;

public class ReportServiceImpl extends ReportServiceGrpc.ReportServiceImplBase {

    @Override
    public void generateEnergyReport(ReportRequest request, StreamObserver<EnergyReport> responseObserver) {
        System.out.println("Generating energy report for type: " + request.getReportType());

        EnergyReport report = EnergyReport.newBuilder()
                .setReportId("RPT-001")
                .setTotalConsumptionKwh(5000)
                .setEnergySavedKwh(200)
                .setCostSavingsEuros(150)
                .setCo2ReductionKg(75)
                .setActiveDevices(25)
                .setGeneratedTime(String.valueOf(System.currentTimeMillis()))
                .build();

        responseObserver.onNext(report);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<DashboardRequest> liveDashboard(StreamObserver<DashboardUpdate> responseObserver) {
        return new StreamObserver<DashboardRequest>() {
            @Override
            public void onNext(DashboardRequest request) {
                System.out.println("Dashboard request type: " + request.getRequestType());

                DashboardUpdate update = DashboardUpdate.newBuilder()
                        .setCurrentPowerUsage(300.5)
                        .setDailyEnergySaved(15.2)
                        .setDevicesOnline(20)
                        .setAlertMessage("All systems normal")
                        .setTimestamp(System.currentTimeMillis())
                        .build();

                responseObserver.onNext(update);
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void getSystemHealth(HealthRequest request, StreamObserver<SystemHealth> responseObserver) {
        System.out.println("System health requested. Details? " + request.getIncludeDetails());

        SystemHealth health = SystemHealth.newBuilder()
                .setOverallStatus("HEALTHY")
                .setServicesOnline(3)
                .setTotalServices(3)
                .addServiceStatus("SensorService: OK")
                .addServiceStatus("ControlService: OK")
                .addServiceStatus("ReportService: OK")
                .build();

        responseObserver.onNext(health);
        responseObserver.onCompleted();
    }
}

package distsys.smartenergy.control;

import generated.smartenergy.control.EnergyControlServiceGrpc;
import generated.smartenergy.control.EnergyControl.BatchControlResponse;
import generated.smartenergy.control.EnergyControl.ControlResponse;
import generated.smartenergy.control.EnergyControl.DeviceControlRequest;
import generated.smartenergy.control.EnergyControl.DeviceStatus;
import generated.smartenergy.control.EnergyControl.StatusRequest;
import io.grpc.stub.StreamObserver;

public class ControlServiceImpl extends EnergyControlServiceGrpc.EnergyControlServiceImplBase {

    @Override
    public void controlDevice(DeviceControlRequest request, StreamObserver<ControlResponse> responseObserver) {
        System.out.println("Controlling device: " + request.getDeviceId() + " Turn on? " + request.getTurnOn());

        ControlResponse response = ControlResponse.newBuilder()
                .setSuccess(true)
                .setDeviceId(request.getDeviceId())
                .setCurrentState(request.getTurnOn() ? "ON" : "OFF")
                .setPowerSavedWatts(123.4)
                .setMessage("Device " + request.getDeviceId() + " updated successfully")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<DeviceControlRequest> batchControlDevices(StreamObserver<BatchControlResponse> responseObserver) {
        return new StreamObserver<DeviceControlRequest>() {
            int devicesControlled = 0;
            double totalPowerSaved = 0;

            @Override
            public void onNext(DeviceControlRequest request) {
                System.out.println("Batch controlling: " + request.getDeviceId());
                devicesControlled++;
                totalPowerSaved += 50.0; // simulate power saving
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                BatchControlResponse response = BatchControlResponse.newBuilder()
                        .setDevicesControlled(devicesControlled)
                        .setTotalPowerSaved(totalPowerSaved)
                        .setAllSuccessful(true)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void getDeviceStatus(StatusRequest request, StreamObserver<DeviceStatus> responseObserver) {
        System.out.println("Getting status for device: " + request.getDeviceId());

        DeviceStatus status = DeviceStatus.newBuilder()
                .setDeviceId(request.getDeviceId())
                .setDeviceType("SmartPlug")
                .setIsActive(true)
                .setCurrentPowerWatts(75.5)
                .setLastUpdated(System.currentTimeMillis())
                .build();

        responseObserver.onNext(status);
        responseObserver.onCompleted();
    }
}

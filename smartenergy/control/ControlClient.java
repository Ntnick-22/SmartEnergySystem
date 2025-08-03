package distsys.smartenergy.control;

import generated.smartenergy.control.*;
import generated.smartenergy.control.EnergyControl.ControlResponse;
import generated.smartenergy.control.EnergyControl.DeviceControlRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ControlClient {

    public static String turnDeviceOn(String deviceId) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        EnergyControlServiceGrpc.EnergyControlServiceBlockingStub stub =
                EnergyControlServiceGrpc.newBlockingStub(channel);

        DeviceControlRequest request = DeviceControlRequest.newBuilder()
                .setDeviceId(deviceId)
                .setTurnOn(true)
                .setReason("Manual ON from GUI")
                .build();

        ControlResponse response = stub.controlDevice(request);
        channel.shutdown();

        return response.getMessage();
    }

    public static String turnDeviceOff(String deviceId) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        EnergyControlServiceGrpc.EnergyControlServiceBlockingStub stub =
                EnergyControlServiceGrpc.newBlockingStub(channel);

        DeviceControlRequest request = DeviceControlRequest.newBuilder()
                .setDeviceId(deviceId)
                .setTurnOn(false)
                .setReason("Manual OFF from GUI")
                .build();

        ControlResponse response = stub.controlDevice(request);
        channel.shutdown();

        return response.getMessage();
    }
}

package distsys.smartenergy.client;

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

        try {
            EnergyControlServiceGrpc.EnergyControlServiceBlockingStub stub =
                    EnergyControlServiceGrpc.newBlockingStub(channel);

            DeviceControlRequest request = DeviceControlRequest.newBuilder()
                    .setDeviceId(deviceId)
                    .setTurnOn(true)
                    .setReason("Manual ON from GUI")
                    .build();

            ControlResponse response = stub.controlDevice(request);
            return " Successfully turned ON device " + deviceId + 
                   "\nServer response: " + response.getMessage();
        } catch (Exception e) {
            return " Failed to turn ON device " + deviceId + 
                   "\nError: " + e.getMessage();
        } finally {
            channel.shutdown();
        }
    }

    public static String turnDeviceOff(String deviceId) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        try {
            EnergyControlServiceGrpc.EnergyControlServiceBlockingStub stub =
                    EnergyControlServiceGrpc.newBlockingStub(channel);

            DeviceControlRequest request = DeviceControlRequest.newBuilder()
                    .setDeviceId(deviceId)
                    .setTurnOn(false)
                    .setReason("Manual OFF from GUI")
                    .build();

            ControlResponse response = stub.controlDevice(request);
            return " Successfully turned OFF device " + deviceId + 
                   "\nServer response: " + response.getMessage();
        } catch (Exception e) {
            return " Failed to turn OFF device " + deviceId + 
                   "\nError: " + e.getMessage();
        } finally {
            channel.shutdown();
        }
    }
}
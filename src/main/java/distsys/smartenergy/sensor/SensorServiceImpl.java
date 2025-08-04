package distsys.smartenergy.sensor;

import generated.smartenergy.sensor.*;
import generated.smartenergy.sensor.SensorServiceOuterClass.ConfirmationMessage;
import generated.smartenergy.sensor.SensorServiceOuterClass.ReadingRequest;
import generated.smartenergy.sensor.SensorServiceOuterClass.SensorData;
import generated.smartenergy.sensor.SensorServiceOuterClass.StreamRequest;
import generated.smartenergy.sensor.SensorServiceOuterClass.ThresholdRequest;
import io.grpc.stub.StreamObserver;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class SensorServiceImpl extends SensorServiceGrpc.SensorServiceImplBase {
    
    private Random random = new Random();
    
    @Override
    public void getCurrentReading(ReadingRequest request, StreamObserver<SensorData> responseObserver) {
        System.out.println("📊 Sensor reading requested for: " + request.getSensorId());
        
        SensorData reading = SensorData.newBuilder()
            .setSensorId(request.getSensorId())
            .setTemperature(20.0 + random.nextDouble() * 15) // 20-35°C
            .setHumidity(30.0 + random.nextDouble() * 40)    // 30-70%
            .setCo2Level(400 + random.nextInt(300))          // 400-700 ppm
            .setMotionDetected(random.nextBoolean())
            .setTimestamp(System.currentTimeMillis())
            .build();
            
        responseObserver.onNext(reading);
        responseObserver.onCompleted();
        
        System.out.println("✅ Sent reading: " + reading.getTemperature() + "°C, " + 
                          reading.getHumidity() + "% humidity");
    }
    
    @Override
    public void streamSensorData(StreamRequest request, StreamObserver<SensorData> responseObserver) {
        System.out.println("🔄 Starting sensor stream for: " + request.getSensorId());
        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                SensorData reading = SensorData.newBuilder()
                    .setSensorId(request.getSensorId())
                    .setTemperature(22.0 + random.nextDouble() * 8)
                    .setHumidity(40.0 + random.nextDouble() * 20)
                    .setCo2Level(380 + random.nextInt(150))
                    .setMotionDetected(random.nextBoolean())
                    .setTimestamp(System.currentTimeMillis())
                    .build();
                    
                responseObserver.onNext(reading);
                System.out.println("📡 Streamed: " + reading.getTemperature() + "°C");
            }
        }, 0, request.getIntervalSeconds() * 1000);
    }
    
    @Override
    public void setAlertThreshold(ThresholdRequest request, StreamObserver<ConfirmationMessage> responseObserver) {
        System.out.println("⚠️ Setting alert threshold for: " + request.getSensorId());
        
        ConfirmationMessage response = ConfirmationMessage.newBuilder()
            .setSuccess(true)
            .setMessage("Alert thresholds set successfully for " + request.getSensorId())
            .build();
            
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes11.dex */
public class TravelRecognizer implements SignalProcessor {
    private final AmortizedMaximum driverInstability;
    private final HighPassFilter3D gravity;
    private long lastTimestampNanos;
    private final HighPassFilter3D linear;
    private final HighPassFilter linearM;
    private final AmortizedMaximum passengerInstability;
    private final RestStateRecognizer restState;
    private long startTimestampNanos;
    private final AmortizedMaximum travel;
    private final VehicleDriverRecognizer vehicleDriver;
    private final VehiclePassengerRecognizer vehiclePassenger;
    private final HighPassFilter vehiclePassengerHpf;
    private final Vibration3DRecognizer vibration;

    public TravelRecognizer() {
        this(10.0d, 15.0d, 25.0d, 1000.0d, 1.0d, 0.1d, 100.0d, 1.0d, 3600000.0d, 3.0d, -2.0d, 100.0d, 1.0d, 20000.0d, 0.0d, -4.0d);
    }

    public void add(long j10, long j11, double d10, double d11, double d12) {
        if (this.lastTimestampNanos >= j11) {
            return;
        }
        if (this.startTimestampNanos <= 0) {
            this.startTimestampNanos = j11;
        }
        double value = this.gravity.getX().getValue();
        double value2 = this.gravity.getY().getValue();
        double value3 = this.gravity.getZ().getValue();
        this.gravity.add(d10, d11, d12);
        double dSmsq = Utils.smsq(this.gravity.getX().getValue() - value, this.gravity.getY().getValue() - value2, this.gravity.getZ().getValue() - value3);
        this.passengerInstability.add(j10, Utils.logisticalFunction(dSmsq, 1.5d, 4.0d));
        double value4 = 1.0d - this.passengerInstability.getValue();
        this.driverInstability.add(j10, Utils.logisticalFunction(dSmsq, 0.01d, 1000.0d));
        this.linear.add(d10 - this.gravity.getX().getValue(), d11 - this.gravity.getY().getValue(), d12 - this.gravity.getZ().getValue());
        this.linearM.add(this.linear.getValue());
        this.vibration.add(j11, d10, d11, d12);
        double dLogisticalFunction = Utils.logisticalFunction((j11 - this.startTimestampNanos) / 1.0E9d, 10.0d, 1.0d);
        this.vehiclePassenger.add(this.vibration.getFrequency(), this.vibration.getAmplitude(), this.linearM.getValue());
        this.vehiclePassengerHpf.add(value4 * dLogisticalFunction * this.vehiclePassenger.getValue());
        double value5 = this.vehiclePassengerHpf.getValue();
        this.vehicleDriver.add(this.vibration.getFrequency(), this.vibration.getAmplitude(), this.restState.getAcceleration(), this.restState.getJerk());
        this.travel.add(j10, (value5 * this.driverInstability.getValue()) + (dLogisticalFunction * this.vehicleDriver.getValue() * (1.0d - this.driverInstability.getValue())));
        this.lastTimestampNanos = j11;
    }

    public double getLinearAcceleration() {
        return this.linearM.getValue();
    }

    public double getTravelProbability() {
        return this.travel.getValue();
    }

    public long getTravelProbabilityMaximumTime() {
        return this.travel.getMaximumTime();
    }

    public double getTravelProbabilityMaximumValue() {
        return this.travel.getMaximumValue();
    }

    public double getVibrationAmplitude() {
        return this.vibration.getAmplitude();
    }

    public double getVibrationFrequency() {
        return this.vibration.getFrequency();
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.startTimestampNanos = 0L;
        this.lastTimestampNanos = 0L;
        this.gravity.reset();
        this.linear.reset();
        this.linearM.reset();
        this.vibration.reset();
        this.vehiclePassenger.reset();
        this.vehiclePassengerHpf.reset();
        this.travel.reset();
    }

    public void setTravelProbabilityMaximum(double d10, long j10) {
        this.travel.setMaximumValue(Math.min(Math.max(0.0d, d10), 1.0d));
        this.travel.setMaximumTime(j10);
    }

    public TravelRecognizer(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, double d24, double d25) {
        HighPassFilter3D highPassFilter3D = new HighPassFilter3D(new HighPassFilter(d10), new HighPassFilter(d10), new HighPassFilter(d10));
        this.gravity = highPassFilter3D;
        this.linear = new HighPassFilter3D(new HighPassFilter(d11), new HighPassFilter(d11), new HighPassFilter(d11));
        this.linearM = new HighPassFilter(d12);
        this.vibration = new Vibration3DRecognizer(new VibrationRecognizer(d14, d15, highPassFilter3D.getX()), new VibrationRecognizer(d14, d15, highPassFilter3D.getY()), new VibrationRecognizer(d14, d15, highPassFilter3D.getZ()));
        this.vehiclePassenger = new VehiclePassengerRecognizer();
        this.vehiclePassengerHpf = new HighPassFilter(d13);
        this.passengerInstability = new AmortizedMaximum(d21, d22, d23, d24, d25);
        this.vehicleDriver = new VehicleDriverRecognizer();
        this.driverInstability = new AmortizedMaximum(d21, d22, d23, d24, d25);
        this.restState = new RestStateRecognizer(5.0d, false);
        this.travel = new AmortizedMaximum(d16, d17, d18, d19, d20);
    }
}

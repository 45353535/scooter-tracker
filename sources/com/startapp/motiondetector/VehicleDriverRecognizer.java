package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes11.dex */
public class VehicleDriverRecognizer implements SignalProcessor, Valuable {
    private static final double alphaAcceleration = 0.995d;
    private static final double alphaJerk = 0.995d;
    private static final double alphaResult = 0.9995d;
    private static final double alphaVibration = 0.95d;
    private static final double weightAcceleration = 1000.0d;
    private static final double weightJerk = 1000.0d;
    private static final double weightSum = 5000.0d;
    private static final double weightVibrationAmplitude = 1000.0d;
    private static final double weightVibrationFrequency = 2000.0d;
    private double al;
    private double jl;
    private double result;
    private double val;
    private double vfl;
    private static final double zeroVfl = Utils.logisticalFunction(0.0d, 8.0d, 2.0d);
    private static final double zeroVal = Utils.logisticalFunction(0.0d, 0.2d, 20.0d);
    private static final double zeroAl = Utils.logisticalFunction(0.0d, 0.2d, 6.0d);
    private static final double zeroJl = Utils.logisticalFunction(0.0d, 0.4d, 5.0d);

    public void add(double d10, double d11, double d12, double d13) {
        this.vfl = (this.vfl * alphaVibration) + (d10 * 0.050000000000000044d);
        this.val = (this.val * alphaVibration) + (d11 * 0.050000000000000044d);
        this.al = (this.al * 0.995d) + (Math.abs(d12) * 0.0050000000000000044d);
        this.jl = (this.jl * 0.995d) + (Math.abs(d13) * 0.0050000000000000044d);
        this.result = (this.result * alphaResult) + ((((Utils.logisticalFunction0(this.vfl, 8.0d, 2.0d, zeroVfl) * weightVibrationFrequency) / weightSum) + ((Utils.logisticalFunction0(this.val, 0.2d, 20.0d, zeroVal) * 1000.0d) / weightSum) + ((Utils.logisticalFunction0(this.al, 0.2d, 6.0d, zeroAl) * 1000.0d) / weightSum) + ((Utils.logisticalFunction0(this.jl, 0.4d, 5.0d, zeroJl) * 1000.0d) / weightSum)) * 4.999999999999449E-4d);
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.result;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.vfl = 0.0d;
        this.val = 0.0d;
        this.al = 0.0d;
        this.jl = 0.0d;
        this.result = 0.0d;
    }
}

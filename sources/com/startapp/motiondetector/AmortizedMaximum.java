package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes11.dex */
public class AmortizedMaximum implements SignalProcessor, Valuable {
    private double amortized;
    private long maximumTime;
    private double maximumValue;
    private final double periodMillis;
    private final double periodMin;
    private final double periodScale;
    private final double periodZero;
    private final double weightMaximum;
    private final double weightNewValue;

    public AmortizedMaximum(double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 + d11;
        this.weightMaximum = d10 / d15;
        this.weightNewValue = d11 / d15;
        this.periodMillis = d12;
        this.periodMin = d13;
        this.periodScale = d14;
        this.periodZero = Utils.logisticalFunction(0.0d, d13, d14);
    }

    public static double calcImpact(long j10, long j11, double d10, double d11, double d12, double d13) {
        double dMax = Math.max(0L, j10 - j11) / d10;
        return d12 > 0.0d ? Utils.logisticalFunction0(dMax, d11, d12, d13) : d12 < 0.0d ? Utils.logisticalFunction1(dMax, d11, d12, d13) : Utils.logisticalFunction(dMax, d11, d12);
    }

    public void add(long j10, double d10) {
        double dCalcImpact = this.maximumValue * calcImpact(j10, this.maximumTime, this.periodMillis, this.periodMin, this.periodScale, this.periodZero);
        double d11 = (this.weightMaximum * dCalcImpact) + (this.weightNewValue * d10);
        this.amortized = d11;
        if (dCalcImpact < d11) {
            this.maximumValue = d11;
            this.maximumTime = j10;
        }
    }

    public long getMaximumTime() {
        return this.maximumTime;
    }

    public double getMaximumValue() {
        return this.maximumValue;
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.amortized;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.maximumValue = 0.0d;
        this.maximumTime = 0L;
        this.amortized = 0.0d;
    }

    public void setMaximumTime(long j10) {
        this.maximumTime = j10;
    }

    public void setMaximumValue(double d10) {
        this.maximumValue = d10;
    }
}

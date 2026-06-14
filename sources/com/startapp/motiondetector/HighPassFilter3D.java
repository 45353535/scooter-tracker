package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes11.dex */
public class HighPassFilter3D implements SignalProcessor, Valuable {
    private double magnitude;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final HighPassFilter f63661x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final HighPassFilter f63662y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final HighPassFilter f63663z;

    public HighPassFilter3D(HighPassFilter highPassFilter, HighPassFilter highPassFilter2, HighPassFilter highPassFilter3) {
        this.f63661x = highPassFilter;
        this.f63662y = highPassFilter2;
        this.f63663z = highPassFilter3;
    }

    public void add(double d10, double d11, double d12) {
        this.f63661x.add(d10);
        this.f63662y.add(d11);
        this.f63663z.add(d12);
        this.magnitude = Math.sqrt((this.f63661x.getValue() * this.f63661x.getValue()) + (this.f63662y.getValue() * this.f63662y.getValue()) + (this.f63663z.getValue() * this.f63663z.getValue()));
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.magnitude;
    }

    public HighPassFilter getX() {
        return this.f63661x;
    }

    public HighPassFilter getY() {
        return this.f63662y;
    }

    public HighPassFilter getZ() {
        return this.f63663z;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.f63661x.reset();
        this.f63662y.reset();
        this.f63663z.reset();
        this.magnitude = 0.0d;
    }
}

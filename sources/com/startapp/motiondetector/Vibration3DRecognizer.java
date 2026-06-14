package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes11.dex */
public class Vibration3DRecognizer implements SignalProcessor, Periodical {
    private double amplitude;
    private double frequency;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final VibrationRecognizer f63667x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final VibrationRecognizer f63668y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final VibrationRecognizer f63669z;

    public Vibration3DRecognizer(VibrationRecognizer vibrationRecognizer, VibrationRecognizer vibrationRecognizer2, VibrationRecognizer vibrationRecognizer3) {
        this.f63667x = vibrationRecognizer;
        this.f63668y = vibrationRecognizer2;
        this.f63669z = vibrationRecognizer3;
    }

    public void add(long j10, double d10, double d11, double d12) {
        this.f63667x.add(j10, d10);
        this.f63668y.add(j10, d11);
        this.f63669z.add(j10, d12);
        double amplitude = this.f63667x.getAmplitude();
        double amplitude2 = this.f63668y.getAmplitude();
        double amplitude3 = this.f63669z.getAmplitude();
        double d13 = amplitude + amplitude2 + amplitude3;
        if (d13 <= 0.0d) {
            this.frequency = 0.0d;
            this.amplitude = 0.0d;
            return;
        }
        this.frequency = ((this.f63667x.getFrequency() * amplitude) / d13) + ((this.f63668y.getFrequency() * amplitude2) / d13) + ((this.f63669z.getFrequency() * amplitude3) / d13);
        this.amplitude = d13 / 3.0d;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getAmplitude() {
        return this.amplitude;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getFrequency() {
        return this.frequency;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.f63667x.reset();
        this.f63668y.reset();
        this.f63669z.reset();
        this.frequency = 0.0d;
        this.amplitude = 0.0d;
    }
}

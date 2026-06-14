package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes11.dex */
public class VibrationRecognizer implements SignalProcessor, Periodical {
    private double amplitude;
    private double amplitudeSum;
    private final Valuable average;
    private final long decisionMakingIntervalNanos;
    private double frequency;
    private long localMaxTime;
    private double localMaxValue;
    private long localZeroTime;
    private final double minAmplitude;
    private Sample newest;
    private Sample oldest;
    private final SamplePool pool = new SamplePool();

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private long f63670t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    private long f63671t2;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private double f63672v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private double f63673v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    private double f63674v2;
    private int zeros;

    static class Sample {
        double amplitude;
        Sample next;
        long time;
        long timeZero;
        int zero;

        Sample() {
        }

        void reset() {
            this.next = null;
            this.time = 0L;
            this.timeZero = 0L;
            this.zero = 0;
            this.amplitude = 0.0d;
        }
    }

    static class SamplePool {
        private Sample head;

        SamplePool() {
        }

        Sample acquire() {
            Sample sample = this.head;
            if (sample == null) {
                return new Sample();
            }
            this.head = sample.next;
            sample.reset();
            return sample;
        }

        void release(Sample sample) {
            sample.next = this.head;
            this.head = sample;
        }
    }

    public VibrationRecognizer(double d10, double d11, Valuable valuable) {
        this.decisionMakingIntervalNanos = (long) (d10 * 1.0E9d);
        this.minAmplitude = d11;
        this.average = valuable;
    }

    private void addSample(Sample sample) {
        this.zeros += sample.zero;
        this.amplitudeSum += sample.amplitude;
    }

    private void removeSample(Sample sample) {
        this.zeros -= sample.zero;
        this.amplitudeSum -= sample.amplitude;
    }

    public void add(long j10, double d10) {
        this.f63672v0 = this.f63673v1;
        this.f63673v1 = this.f63674v2;
        this.f63674v2 = d10;
        this.f63670t1 = this.f63671t2;
        this.f63671t2 = j10;
        purgeSamples(j10);
        Sample sampleAcquire = this.pool.acquire();
        sampleAcquire.time = this.f63671t2;
        sampleAcquire.timeZero = this.localZeroTime;
        double value = this.average.getValue();
        double d11 = this.f63672v0;
        double d12 = this.f63673v1;
        if (d11 < d12 && d12 > this.f63674v2) {
            double d13 = d12 - value;
            if (d13 > this.minAmplitude) {
                this.localMaxValue = d13;
                this.localMaxTime = this.f63670t1;
            }
        }
        if (d12 > value && value > this.f63674v2 && this.localMaxTime > this.localZeroTime) {
            this.localZeroTime = this.f63671t2;
            sampleAcquire.zero = 1;
            sampleAcquire.amplitude = this.localMaxValue;
        }
        addSample(sampleAcquire);
        Sample sample = this.newest;
        if (sample != null) {
            sample.next = sampleAcquire;
        }
        this.newest = sampleAcquire;
        if (this.oldest == null) {
            this.oldest = sampleAcquire;
        }
        long j11 = this.localZeroTime - this.oldest.timeZero;
        if (j11 > 0) {
            this.frequency = ((double) this.zeros) / (j11 / 1.0E9d);
        }
        int i10 = this.zeros;
        if (i10 > 0) {
            this.amplitude = this.amplitudeSum / ((double) i10);
        } else {
            this.amplitude = 0.0d;
        }
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getAmplitude() {
        return this.amplitude;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getFrequency() {
        return this.frequency;
    }

    void purgeSamples(long j10) {
        Sample sample;
        long j11 = j10 - this.decisionMakingIntervalNanos;
        while (true) {
            Sample sample2 = this.oldest;
            if (sample2 == null || sample2.time >= j11 || (sample = sample2.next) == null || sample.time >= j11) {
                return;
            }
            this.oldest = sample;
            removeSample(sample2);
            this.pool.release(sample2);
        }
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        while (true) {
            Sample sample = this.oldest;
            if (sample == null) {
                this.newest = null;
                this.f63672v0 = 0.0d;
                this.f63673v1 = 0.0d;
                this.f63674v2 = 0.0d;
                this.f63670t1 = 0L;
                this.f63671t2 = 0L;
                this.localMaxValue = 0.0d;
                this.localMaxTime = 0L;
                this.localZeroTime = 0L;
                this.zeros = 0;
                this.frequency = 0.0d;
                this.amplitude = 0.0d;
                this.amplitudeSum = 0.0d;
                return;
            }
            this.oldest = sample.next;
            this.pool.release(sample);
        }
    }
}

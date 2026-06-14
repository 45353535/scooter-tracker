package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes11.dex */
public class RestStateRecognizer implements SignalProcessor {
    public static final int STATE_MOTION = 2;
    public static final int STATE_REST = 1;
    public static final int STATE_UNKNOWN = 0;
    private double acceleration;
    private double accelerationMaxSum;
    private final double alphaJerk;
    private final boolean applyCorrection;
    private double brakingAccelerationMin;
    private long brakingTimeBegin;
    private long brakingTimeEnd;
    private long brakingTimeMin;
    private final long decisionMakingIntervalNanos;
    private final long decisionValidnessIntervalNanos;
    private final long delayIntervalNanos;
    private final HighPassFilter3D forward;
    private final HighPassFilter3D gravity;
    private double jerk;
    private final HighPassFilter3D linear;
    private int maxCount;
    private Sample nearestBack;
    private Sample newest;
    private Sample oldest;
    private final SamplePool pool;
    private int samplesCount;
    private double scalarLF;
    private long stableTillTimestampNanos;
    private long startTimestampNanos;
    private int state;
    private int steadyCount;
    private long validTimestampNanos;

    static class Sample {
        double acceleration;
        double accelerationMax;
        double accelerationMin;
        int braking;
        int max;
        long maxStartTime;
        double maxStartValue;
        int min;
        long minStartTime;
        double minStartValue;
        Sample next;
        Sample prev;
        int racing;
        int retard;
        int spurt;
        int steady;
        long timestampNanos;

        Sample() {
        }

        void reset() {
            this.timestampNanos = 0L;
            this.acceleration = 0.0d;
            this.accelerationMax = 0.0d;
            this.accelerationMin = 0.0d;
            this.max = 0;
            this.min = 0;
            this.maxStartTime = 0L;
            this.maxStartValue = 0.0d;
            this.minStartTime = 0L;
            this.minStartValue = 0.0d;
            this.spurt = 0;
            this.racing = 0;
            this.steady = 0;
            this.retard = 0;
            this.braking = 0;
            this.next = null;
            this.prev = null;
        }
    }

    static class SamplePool {
        Sample head;

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
            sample.prev = null;
            this.head = sample;
        }
    }

    public RestStateRecognizer(double d10, boolean z10) {
        this(10.0d, 15.0d, 25.0d, 15.0d, 8.0d, d10, 1.0d, z10);
    }

    private void addSample(Sample sample) {
        this.accelerationMaxSum += sample.accelerationMax;
        this.maxCount += sample.max;
        this.steadyCount += sample.steady;
        this.samplesCount++;
    }

    private boolean isEnoughData() {
        Sample sample;
        Sample sample2;
        if (this.samplesCount <= 1 || (sample = this.oldest) == null || (sample2 = this.newest) == null) {
            return false;
        }
        long j10 = sample.timestampNanos;
        return j10 >= this.startTimestampNanos + this.delayIntervalNanos && sample2.timestampNanos >= j10 + this.decisionMakingIntervalNanos && this.nearestBack != null;
    }

    private boolean isRest() {
        int i10 = this.steadyCount;
        int i11 = this.samplesCount;
        if (i10 != i11) {
            return false;
        }
        return this.maxCount <= 0 || this.accelerationMaxSum / ((double) i11) <= 0.01d;
    }

    private void removeSample(Sample sample) {
        this.accelerationMaxSum -= sample.accelerationMax;
        this.maxCount -= sample.max;
        this.steadyCount -= sample.steady;
        this.samplesCount--;
    }

    private double scalarProduct(Valuable valuable, Valuable valuable2, Valuable valuable3, Valuable valuable4, Valuable valuable5, Valuable valuable6) {
        return (valuable.getValue() * valuable2.getValue()) + (valuable3.getValue() * valuable4.getValue()) + (valuable5.getValue() * valuable6.getValue());
    }

    private double smsq(double d10, double d11, double d12) {
        return (d10 * d10) + (d11 * d11) + (d12 * d12);
    }

    private double srss(Valuable valuable, Valuable valuable2, Valuable valuable3) {
        return Math.sqrt(smsq(valuable.getValue(), valuable2.getValue(), valuable3.getValue()));
    }

    private void updateMinMax() {
        Sample sample;
        Sample sample2;
        Sample sample3 = this.newest;
        if (sample3 == null) {
            return;
        }
        while (true) {
            sample = this.nearestBack;
            if (sample3 == sample || (sample2 = sample3.prev) == null) {
                break;
            }
            double d10 = sample2.accelerationMax;
            double d11 = sample3.accelerationMax;
            if (d10 < d11) {
                sample2.accelerationMax = d11;
            }
            double d12 = sample2.accelerationMin;
            double d13 = sample3.accelerationMin;
            if (d12 > d13) {
                sample2.accelerationMin = d13;
            }
            sample3 = sample2;
        }
        if (sample3 == sample) {
            Sample sample4 = this.newest;
            double d14 = sample4.acceleration;
            Sample sample5 = sample3.next;
            if (d14 == sample5.accelerationMax) {
                sample4.max = 1;
                Sample sample6 = sample4.prev;
                sample4.maxStartTime = sample6.maxStartTime;
                sample4.maxStartValue = sample6.maxStartValue;
            } else {
                sample4.max = 0;
            }
            if (d14 != sample5.accelerationMin) {
                sample4.min = 0;
                return;
            }
            sample4.min = 1;
            Sample sample7 = sample4.prev;
            sample4.minStartTime = sample7.minStartTime;
            sample4.minStartValue = sample7.minStartValue;
        }
    }

    private Sample updateNearest(Sample sample, long j10) {
        Sample sample2 = null;
        while (sample != null && sample.timestampNanos < j10) {
            sample2 = sample;
            sample = sample.next;
        }
        return sample2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void add(long r21, double r23, double r25, double r27) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.motiondetector.RestStateRecognizer.add(long, double, double, double):void");
    }

    public double getAcceleration() {
        return this.acceleration;
    }

    public double getJerk() {
        return this.jerk;
    }

    public int getState() {
        return this.state;
    }

    void purgeRollingValues(long j10) {
        Sample sample;
        long j11 = j10 - this.decisionMakingIntervalNanos;
        while (true) {
            Sample sample2 = this.oldest;
            if (sample2 == null || sample2.timestampNanos >= j11 || (sample = sample2.next) == null || sample.timestampNanos >= j11) {
                return;
            }
            this.oldest = sample;
            sample.prev = null;
            removeSample(sample2);
            this.pool.release(sample2);
        }
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        while (true) {
            Sample sample = this.oldest;
            if (sample == null) {
                this.nearestBack = null;
                this.newest = null;
                this.startTimestampNanos = 0L;
                this.validTimestampNanos = 0L;
                this.stableTillTimestampNanos = 0L;
                this.gravity.reset();
                this.linear.reset();
                this.forward.reset();
                this.scalarLF = 0.0d;
                this.acceleration = 0.0d;
                this.jerk = 0.0d;
                this.accelerationMaxSum = 0.0d;
                this.maxCount = 0;
                this.steadyCount = 0;
                this.samplesCount = 0;
                this.state = 0;
                return;
            }
            this.oldest = sample.next;
            this.pool.release(sample);
        }
    }

    private RestStateRecognizer(double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10) {
        this.pool = new SamplePool();
        this.state = 0;
        this.alphaJerk = d13 / (1.0d + d13);
        this.delayIntervalNanos = (long) (d14 * 1.0E9d);
        this.decisionMakingIntervalNanos = (long) (d15 * 1.0E9d);
        this.decisionValidnessIntervalNanos = (long) (1.0E9d * d16);
        this.applyCorrection = z10;
        this.gravity = new HighPassFilter3D(new HighPassFilter(d10), new HighPassFilter(d10), new HighPassFilter(d10));
        this.linear = new HighPassFilter3D(new HighPassFilter(d11), new HighPassFilter(d11), new HighPassFilter(d11));
        this.forward = new HighPassFilter3D(new HighPassFilter(d12), new HighPassFilter(d12), new HighPassFilter(d12));
    }
}

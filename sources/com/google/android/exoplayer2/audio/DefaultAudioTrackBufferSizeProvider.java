package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.util.Util;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultAudioTrackBufferSizeProvider implements DefaultAudioSink.AudioTrackBufferSizeProvider {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = 4;
    public final int ac3BufferMultiplicationFactor;
    protected final int maxPcmBufferDurationUs;
    protected final int minPcmBufferDurationUs;
    protected final int offloadBufferDurationUs;
    protected final int passthroughBufferDurationUs;
    protected final int pcmBufferMultiplicationFactor;

    public static class Builder {
        private int minPcmBufferDurationUs = 250000;
        private int maxPcmBufferDurationUs = DefaultAudioTrackBufferSizeProvider.MAX_PCM_BUFFER_DURATION_US;
        private int pcmBufferMultiplicationFactor = 4;
        private int passthroughBufferDurationUs = 250000;
        private int offloadBufferDurationUs = DefaultAudioTrackBufferSizeProvider.OFFLOAD_BUFFER_DURATION_US;
        private int ac3BufferMultiplicationFactor = 2;

        public DefaultAudioTrackBufferSizeProvider build() {
            return new DefaultAudioTrackBufferSizeProvider(this);
        }

        @CanIgnoreReturnValue
        public Builder setAc3BufferMultiplicationFactor(int i10) {
            this.ac3BufferMultiplicationFactor = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMaxPcmBufferDurationUs(int i10) {
            this.maxPcmBufferDurationUs = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinPcmBufferDurationUs(int i10) {
            this.minPcmBufferDurationUs = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setOffloadBufferDurationUs(int i10) {
            this.offloadBufferDurationUs = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPassthroughBufferDurationUs(int i10) {
            this.passthroughBufferDurationUs = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPcmBufferMultiplicationFactor(int i10) {
            this.pcmBufferMultiplicationFactor = i10;
            return this;
        }
    }

    protected DefaultAudioTrackBufferSizeProvider(Builder builder) {
        this.minPcmBufferDurationUs = builder.minPcmBufferDurationUs;
        this.maxPcmBufferDurationUs = builder.maxPcmBufferDurationUs;
        this.pcmBufferMultiplicationFactor = builder.pcmBufferMultiplicationFactor;
        this.passthroughBufferDurationUs = builder.passthroughBufferDurationUs;
        this.offloadBufferDurationUs = builder.offloadBufferDurationUs;
        this.ac3BufferMultiplicationFactor = builder.ac3BufferMultiplicationFactor;
    }

    protected static int durationUsToBytes(int i10, int i11, int i12) {
        return Ints.checkedCast(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static int getMaximumEncodedRateBytesPerSecond(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    protected int get1xBufferSizeInBytes(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return getPcmBufferSizeInBytes(i10, i14, i13);
        }
        if (i12 == 1) {
            return getOffloadBufferSizeInBytes(i11);
        }
        if (i12 == 2) {
            return getPassthroughBufferSizeInBytes(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider
    public int getBufferSizeInBytes(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (((double) get1xBufferSizeInBytes(i10, i11, i12, i13, i14, i15)) * d10)) + i13) - 1) / i13) * i13;
    }

    protected int getOffloadBufferSizeInBytes(int i10) {
        return Ints.checkedCast((((long) this.offloadBufferDurationUs) * ((long) getMaximumEncodedRateBytesPerSecond(i10))) / 1000000);
    }

    protected int getPassthroughBufferSizeInBytes(int i10, int i11) {
        int i12 = this.passthroughBufferDurationUs;
        if (i10 == 5) {
            i12 *= this.ac3BufferMultiplicationFactor;
        }
        return Ints.checkedCast((((long) i12) * ((long) (i11 != -1 ? IntMath.divide(i11, 8, RoundingMode.CEILING) : getMaximumEncodedRateBytesPerSecond(i10)))) / 1000000);
    }

    protected int getPcmBufferSizeInBytes(int i10, int i11, int i12) {
        return Util.constrainValue(i10 * this.pcmBufferMultiplicationFactor, durationUsToBytes(this.minPcmBufferDurationUs, i11, i12), durationUsToBytes(this.maxPcmBufferDurationUs, i11, i12));
    }
}

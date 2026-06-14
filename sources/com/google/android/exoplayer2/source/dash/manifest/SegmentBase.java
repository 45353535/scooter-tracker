package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Util;
import com.google.common.math.BigIntegerMath;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SegmentBase {

    @Nullable
    final RangedUri initialization;
    final long presentationTimeOffset;
    final long timescale;

    public static abstract class MultiSegmentBase extends SegmentBase {

        @VisibleForTesting
        final long availabilityTimeOffsetUs;
        final long duration;
        private final long periodStartUnixTimeUs;

        @Nullable
        final List<SegmentTimelineElement> segmentTimeline;
        final long startNumber;
        private final long timeShiftBufferDepthUs;

        public MultiSegmentBase(@Nullable RangedUri rangedUri, long j10, long j11, long j12, long j13, @Nullable List<SegmentTimelineElement> list, long j14, long j15, long j16) {
            super(rangedUri, j10, j11);
            this.startNumber = j12;
            this.duration = j13;
            this.segmentTimeline = list;
            this.availabilityTimeOffsetUs = j14;
            this.timeShiftBufferDepthUs = j15;
            this.periodStartUnixTimeUs = j16;
        }

        public long getAvailableSegmentCount(long j10, long j11) {
            long segmentCount = getSegmentCount(j10);
            return segmentCount != -1 ? segmentCount : (int) (getSegmentNum((j11 - this.periodStartUnixTimeUs) + this.availabilityTimeOffsetUs, j10) - getFirstAvailableSegmentNum(j10, j11));
        }

        public long getFirstAvailableSegmentNum(long j10, long j11) {
            if (getSegmentCount(j10) == -1) {
                long j12 = this.timeShiftBufferDepthUs;
                if (j12 != -9223372036854775807L) {
                    return Math.max(getFirstSegmentNum(), getSegmentNum((j11 - this.periodStartUnixTimeUs) - j12, j10));
                }
            }
            return getFirstSegmentNum();
        }

        public long getFirstSegmentNum() {
            return this.startNumber;
        }

        public long getNextSegmentAvailableTimeUs(long j10, long j11) {
            if (this.segmentTimeline != null) {
                return -9223372036854775807L;
            }
            long firstAvailableSegmentNum = getFirstAvailableSegmentNum(j10, j11) + getAvailableSegmentCount(j10, j11);
            return (getSegmentTimeUs(firstAvailableSegmentNum) + getSegmentDurationUs(firstAvailableSegmentNum, j10)) - this.availabilityTimeOffsetUs;
        }

        public abstract long getSegmentCount(long j10);

        public final long getSegmentDurationUs(long j10, long j11) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return (list.get((int) (j10 - this.startNumber)).duration * 1000000) / this.timescale;
            }
            long segmentCount = getSegmentCount(j11);
            return (segmentCount == -1 || j10 != (getFirstSegmentNum() + segmentCount) - 1) ? (this.duration * 1000000) / this.timescale : j11 - getSegmentTimeUs(j10);
        }

        public long getSegmentNum(long j10, long j11) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(j11);
            if (segmentCount != 0) {
                if (this.segmentTimeline != null) {
                    long j12 = (segmentCount + firstSegmentNum) - 1;
                    long j13 = firstSegmentNum;
                    while (j13 <= j12) {
                        long j14 = ((j12 - j13) / 2) + j13;
                        long segmentTimeUs = getSegmentTimeUs(j14);
                        if (segmentTimeUs < j10) {
                            j13 = j14 + 1;
                        } else {
                            if (segmentTimeUs <= j10) {
                                return j14;
                            }
                            j12 = j14 - 1;
                        }
                    }
                    return j13 == firstSegmentNum ? j13 : j12;
                }
                long j15 = this.startNumber + (j10 / ((this.duration * 1000000) / this.timescale));
                if (j15 >= firstSegmentNum) {
                    return segmentCount == -1 ? j15 : Math.min(j15, (firstSegmentNum + segmentCount) - 1);
                }
            }
            return firstSegmentNum;
        }

        public final long getSegmentTimeUs(long j10) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            return Util.scaleLargeTimestamp(list != null ? list.get((int) (j10 - this.startNumber)).startTime - this.presentationTimeOffset : (j10 - this.startNumber) * this.duration, 1000000L, this.timescale);
        }

        public abstract RangedUri getSegmentUrl(Representation representation, long j10);

        public boolean isExplicit() {
            return this.segmentTimeline != null;
        }
    }

    public static final class SegmentList extends MultiSegmentBase {

        @Nullable
        final List<RangedUri> mediaSegments;

        public SegmentList(RangedUri rangedUri, long j10, long j11, long j12, long j13, @Nullable List<SegmentTimelineElement> list, long j14, @Nullable List<RangedUri> list2, long j15, long j16) {
            super(rangedUri, j10, j11, j12, j13, list, j14, j15, j16);
            this.mediaSegments = list2;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j10) {
            return this.mediaSegments.size();
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j10) {
            return this.mediaSegments.get((int) (j10 - this.startNumber));
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
            return true;
        }
    }

    public static final class SegmentTemplate extends MultiSegmentBase {
        final long endNumber;

        @Nullable
        final UrlTemplate initializationTemplate;

        @Nullable
        final UrlTemplate mediaTemplate;

        public SegmentTemplate(RangedUri rangedUri, long j10, long j11, long j12, long j13, long j14, @Nullable List<SegmentTimelineElement> list, long j15, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j16, long j17) {
            super(rangedUri, j10, j11, j12, j14, list, j15, j16, j17);
            this.initializationTemplate = urlTemplate;
            this.mediaTemplate = urlTemplate2;
            this.endNumber = j13;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase
        @Nullable
        public RangedUri getInitialization(Representation representation) {
            UrlTemplate urlTemplate = this.initializationTemplate;
            if (urlTemplate == null) {
                return super.getInitialization(representation);
            }
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.f24619id, 0L, format.bitrate, 0L), 0L, -1L);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j10) {
            if (this.segmentTimeline != null) {
                return r0.size();
            }
            long j11 = this.endNumber;
            if (j11 != -1) {
                return (j11 - this.startNumber) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return BigIntegerMath.divide(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.timescale)), BigInteger.valueOf(this.duration).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j10) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            long j11 = list != null ? list.get((int) (j10 - this.startNumber)).startTime : (j10 - this.startNumber) * this.duration;
            UrlTemplate urlTemplate = this.mediaTemplate;
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.f24619id, j10, format.bitrate, j11), 0L, -1L);
        }
    }

    public static final class SegmentTimelineElement {
        final long duration;
        final long startTime;

        public SegmentTimelineElement(long j10, long j11) {
            this.startTime = j10;
            this.duration = j11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SegmentTimelineElement.class == obj.getClass()) {
                SegmentTimelineElement segmentTimelineElement = (SegmentTimelineElement) obj;
                if (this.startTime == segmentTimelineElement.startTime && this.duration == segmentTimelineElement.duration) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.startTime) * 31) + ((int) this.duration);
        }
    }

    public SegmentBase(@Nullable RangedUri rangedUri, long j10, long j11) {
        this.initialization = rangedUri;
        this.timescale = j10;
        this.presentationTimeOffset = j11;
    }

    @Nullable
    public RangedUri getInitialization(Representation representation) {
        return this.initialization;
    }

    public long getPresentationTimeOffsetUs() {
        return Util.scaleLargeTimestamp(this.presentationTimeOffset, 1000000L, this.timescale);
    }

    public static class SingleSegmentBase extends SegmentBase {
        final long indexLength;
        final long indexStart;

        public SingleSegmentBase(@Nullable RangedUri rangedUri, long j10, long j11, long j12, long j13) {
            super(rangedUri, j10, j11);
            this.indexStart = j12;
            this.indexLength = j13;
        }

        @Nullable
        public RangedUri getIndex() {
            long j10 = this.indexLength;
            if (j10 <= 0) {
                return null;
            }
            return new RangedUri(null, this.indexStart, j10);
        }

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}

package com.google.android.exoplayer2.trackselection;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import com.ironsource.U2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MAX_HEIGHT_TO_DISCARD = 719;
    public static final int DEFAULT_MAX_WIDTH_TO_DISCARD = 1279;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final String TAG = "AdaptiveTrackSelection";
    private final ImmutableList<AdaptationCheckpoint> adaptationCheckpoints;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;

    @Nullable
    private MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private final long maxDurationForQualityDecreaseUs;
    private final int maxHeightToDiscard;
    private final int maxWidthToDiscard;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long j10, long j11) {
            this.totalBandwidth = j10;
            this.allocatedBandwidth = j11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }
    }

    public static class Factory implements ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int maxHeightToDiscard;
        private final int maxWidthToDiscard;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;

        public Factory() {
            this(10000, 25000, 25000, 0.7f);
        }

        protected AdaptiveTrackSelection createAdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i10, BandwidthMeter bandwidthMeter, ImmutableList<AdaptationCheckpoint> immutableList) {
            return new AdaptiveTrackSelection(trackGroup, iArr, i10, bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.maxWidthToDiscard, this.maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, immutableList, this.clock);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelections(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] r10, com.google.android.exoplayer2.upstream.BandwidthMeter r11, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r12, com.google.android.exoplayer2.Timeline r13) {
            /*
                r9 = this;
                com.google.common.collect.ImmutableList r12 = com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.access$000(r10)
                int r13 = r10.length
                com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r13 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[r13]
                r0 = 0
                r1 = r0
            L9:
                int r2 = r10.length
                if (r1 >= r2) goto L40
                r2 = r10[r1]
                if (r2 == 0) goto L15
                int[] r5 = r2.tracks
                int r3 = r5.length
                if (r3 != 0) goto L17
            L15:
                r7 = r11
                goto L3c
            L17:
                int r3 = r5.length
                r4 = 1
                if (r3 != r4) goto L28
                com.google.android.exoplayer2.trackselection.FixedTrackSelection r3 = new com.google.android.exoplayer2.trackselection.FixedTrackSelection
                com.google.android.exoplayer2.source.TrackGroup r4 = r2.group
                r5 = r5[r0]
                int r2 = r2.type
                r3.<init>(r4, r5, r2)
                r7 = r11
                goto L3a
            L28:
                com.google.android.exoplayer2.source.TrackGroup r4 = r2.group
                int r6 = r2.type
                java.lang.Object r2 = r12.get(r1)
                r8 = r2
                com.google.common.collect.ImmutableList r8 = (com.google.common.collect.ImmutableList) r8
                r3 = r9
                r7 = r11
                com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection r11 = r3.createAdaptiveTrackSelection(r4, r5, r6, r7, r8)
                r3 = r11
            L3a:
                r13[r1] = r3
            L3c:
                int r1 = r1 + 1
                r11 = r7
                goto L9
            L40:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.Factory.createTrackSelections(com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition[], com.google.android.exoplayer2.upstream.BandwidthMeter, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.Timeline):com.google.android.exoplayer2.trackselection.ExoTrackSelection[]");
        }

        public Factory(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i10, int i11, int i12, int i13, int i14, float f10) {
            this(i10, i11, i12, i13, i14, f10, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i10, int i11, int i12, float f10, float f11, Clock clock) {
            this(i10, i11, i12, 1279, 719, f10, f11, clock);
        }

        public Factory(int i10, int i11, int i12, int i13, int i14, float f10, float f11, Clock clock) {
            this.minDurationForQualityIncreaseMs = i10;
            this.maxDurationForQualityDecreaseMs = i11;
            this.minDurationToRetainAfterDiscardMs = i12;
            this.maxWidthToDiscard = i13;
            this.maxHeightToDiscard = i14;
            this.bandwidthFraction = f10;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f11;
            this.clock = clock;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, 0, bandwidthMeter, 10000L, U2.f41836h, U2.f41836h, 1279, 719, 0.7f, 0.75f, ImmutableList.of(), Clock.DEFAULT);
    }

    private static void addCheckpoint(List<ImmutableList.Builder<AdaptationCheckpoint>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ImmutableList.Builder<AdaptationCheckpoint> builder = list.get(i10);
            if (builder != null) {
                builder.add(new AdaptationCheckpoint(j10, jArr[i10]));
            }
        }
    }

    private int determineIdealSelectedIndex(long j10, long j11) {
        long allocatedBandwidth = getAllocatedBandwidth(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.length; i11++) {
            if (j10 == Long.MIN_VALUE || !isBlacklisted(i11, j10)) {
                Format format = getFormat(i11);
                if (canSelectFormat(format, format.bitrate, allocatedBandwidth)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<ImmutableList<AdaptationCheckpoint>> getAdaptationCheckpoints(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection.Definition definition : definitionArr) {
            if (definition == null || definition.tracks.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.Builder builder = ImmutableList.builder();
                builder.add(new AdaptationCheckpoint(0L, 0L));
                arrayList.add(builder);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(definitionArr);
        int[] iArr = new int[sortedTrackBitrates.length];
        long[] jArr = new long[sortedTrackBitrates.length];
        for (int i10 = 0; i10 < sortedTrackBitrates.length; i10++) {
            long[] jArr2 = sortedTrackBitrates[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        addCheckpoint(arrayList, jArr);
        ImmutableList<Integer> switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i11 = 0; i11 < switchOrder.size(); i11++) {
            int iIntValue = switchOrder.get(i11).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = sortedTrackBitrates[iIntValue][i12];
            addCheckpoint(arrayList, jArr);
        }
        for (int i13 = 0; i13 < definitionArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        addCheckpoint(arrayList, jArr);
        ImmutableList.Builder builder2 = ImmutableList.builder();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayList.get(i14);
            builder2.add(builder3 == null ? ImmutableList.of() : builder3.build());
        }
        return builder2.build();
    }

    private long getAllocatedBandwidth(long j10) {
        long totalAllocatableBandwidth = getTotalAllocatableBandwidth(j10);
        if (this.adaptationCheckpoints.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i10 = 1;
        while (i10 < this.adaptationCheckpoints.size() - 1 && this.adaptationCheckpoints.get(i10).totalBandwidth < totalAllocatableBandwidth) {
            i10++;
        }
        AdaptationCheckpoint adaptationCheckpoint = this.adaptationCheckpoints.get(i10 - 1);
        AdaptationCheckpoint adaptationCheckpoint2 = this.adaptationCheckpoints.get(i10);
        long j11 = adaptationCheckpoint.totalBandwidth;
        float f10 = (totalAllocatableBandwidth - j11) / (adaptationCheckpoint2.totalBandwidth - j11);
        return adaptationCheckpoint.allocatedBandwidth + ((long) (f10 * (adaptationCheckpoint2.allocatedBandwidth - r2)));
    }

    private long getLastChunkDurationUs(List<? extends MediaChunk> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        MediaChunk mediaChunk = (MediaChunk) Iterables.getLast(list);
        long j10 = mediaChunk.startTimeUs;
        if (j10 != -9223372036854775807L) {
            long j11 = mediaChunk.endTimeUs;
            if (j11 != -9223372036854775807L) {
                return j11 - j10;
            }
        }
        return -9223372036854775807L;
    }

    private long getNextChunkDurationUs(MediaChunkIterator[] mediaChunkIteratorArr, List<? extends MediaChunk> list) {
        int i10 = this.selectedIndex;
        if (i10 < mediaChunkIteratorArr.length && mediaChunkIteratorArr[i10].next()) {
            MediaChunkIterator mediaChunkIterator = mediaChunkIteratorArr[this.selectedIndex];
            return mediaChunkIterator.getChunkEndTimeUs() - mediaChunkIterator.getChunkStartTimeUs();
        }
        for (MediaChunkIterator mediaChunkIterator2 : mediaChunkIteratorArr) {
            if (mediaChunkIterator2.next()) {
                return mediaChunkIterator2.getChunkEndTimeUs() - mediaChunkIterator2.getChunkStartTimeUs();
            }
        }
        return getLastChunkDurationUs(list);
    }

    private static long[][] getSortedTrackBitrates(ExoTrackSelection.Definition[] definitionArr) {
        long[][] jArr = new long[definitionArr.length][];
        for (int i10 = 0; i10 < definitionArr.length; i10++) {
            ExoTrackSelection.Definition definition = definitionArr[i10];
            if (definition == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[definition.tracks.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = definition.tracks;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = definition.group.getFormat(iArr[i11]).bitrate;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static ImmutableList<Integer> getSwitchOrder(long[][] jArr) {
        Multimap multimapBuild = MultimapBuilder.treeKeys().arrayListValues().build();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    multimapBuild.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return ImmutableList.copyOf(multimapBuild.values());
    }

    private long getTotalAllocatableBandwidth(long j10) {
        long bitrateEstimate = (long) (this.bandwidthMeter.getBitrateEstimate() * this.bandwidthFraction);
        long timeToFirstByteEstimateUs = this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (bitrateEstimate / this.playbackSpeed);
        }
        float f10 = j10;
        return (long) ((bitrateEstimate * Math.max((f10 / this.playbackSpeed) - timeToFirstByteEstimateUs, 0.0f)) / f10);
    }

    private long minDurationForQualityIncreaseUs(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.minDurationForQualityIncreaseUs;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min((long) (j10 * this.bufferedFractionToLiveEdgeForQualityIncrease), this.minDurationForQualityIncreaseUs);
    }

    protected boolean canSelectFormat(Format format, int i10, long j10) {
        return ((long) i10) <= j10;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @CallSuper
    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @CallSuper
    public void enable() {
        this.lastBufferEvaluationMs = -9223372036854775807L;
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j10, List<? extends MediaChunk> list) {
        int i10;
        int i11;
        long jElapsedRealtime = this.clock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(jElapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = jElapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (MediaChunk) Iterables.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j10, this.playbackSpeed);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (playoutDurationForMediaDuration >= minDurationToRetainAfterDiscardUs) {
            Format format = getFormat(determineIdealSelectedIndex(jElapsedRealtime, getLastChunkDurationUs(list)));
            for (int i12 = 0; i12 < size; i12++) {
                MediaChunk mediaChunk = list.get(i12);
                Format format2 = mediaChunk.trackFormat;
                if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j10, this.playbackSpeed) >= minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i10 = format2.height) != -1 && i10 <= this.maxHeightToDiscard && (i11 = format2.width) != -1 && i11 <= this.maxWidthToDiscard && i10 < format.height) {
                    return i12;
                }
            }
        }
        return size;
    }

    protected long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f10) {
        this.playbackSpeed = f10;
    }

    protected boolean shouldEvaluateQueueSize(long j10, List<? extends MediaChunk> list) {
        long j11 = this.lastBufferEvaluationMs;
        if (j11 == -9223372036854775807L || j10 - j11 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((MediaChunk) Iterables.getLast(list)).equals(this.lastBufferEvaluationMediaChunk)) ? false : true;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(mediaChunkIteratorArr, list);
        int i10 = this.reason;
        if (i10 == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i11 = this.selectedIndex;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((MediaChunk) Iterables.getLast(list)).trackFormat);
        if (iIndexOf != -1) {
            i10 = ((MediaChunk) Iterables.getLast(list)).trackSelectionReason;
            i11 = iIndexOf;
        }
        int iDetermineIdealSelectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
        if (!isBlacklisted(i11, jElapsedRealtime)) {
            Format format = getFormat(i11);
            Format format2 = getFormat(iDetermineIdealSelectedIndex);
            long jMinDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j12, nextChunkDurationUs);
            int i12 = format2.bitrate;
            int i13 = format.bitrate;
            if ((i12 > i13 && j11 < jMinDurationForQualityIncreaseUs) || (i12 < i13 && j11 >= this.maxDurationForQualityDecreaseUs)) {
                iDetermineIdealSelectedIndex = i11;
            }
        }
        if (iDetermineIdealSelectedIndex != i11) {
            i10 = 3;
        }
        this.reason = i10;
        this.selectedIndex = iDetermineIdealSelectedIndex;
    }

    protected AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i10, BandwidthMeter bandwidthMeter, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<AdaptationCheckpoint> list, Clock clock) {
        long j13;
        super(trackGroup, iArr, i10);
        if (j12 < j10) {
            Log.w(TAG, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.bandwidthMeter = bandwidthMeter;
        this.minDurationForQualityIncreaseUs = j10 * 1000;
        this.maxDurationForQualityDecreaseUs = j11 * 1000;
        this.minDurationToRetainAfterDiscardUs = j13 * 1000;
        this.maxWidthToDiscard = i11;
        this.maxHeightToDiscard = i12;
        this.bandwidthFraction = f10;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f11;
        this.adaptationCheckpoints = ImmutableList.copyOf((Collection) list);
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = -9223372036854775807L;
    }
}

package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class MergingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    @Nullable
    private MediaPeriod.Callback callback;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final MediaPeriod[] periods;

    @Nullable
    private TrackGroupArray trackGroups;
    private final ArrayList<MediaPeriod> childrenPendingPreparation = new ArrayList<>();
    private final HashMap<TrackGroup, TrackGroup> childTrackGroupByMergedTrackGroup = new HashMap<>();
    private final IdentityHashMap<SampleStream, Integer> streamPeriodIndices = new IdentityHashMap<>();
    private MediaPeriod[] enabledPeriods = new MediaPeriod[0];

    private static final class ForwardingTrackSelection implements ExoTrackSelection {
        private final TrackGroup trackGroup;
        private final ExoTrackSelection trackSelection;

        public ForwardingTrackSelection(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
            this.trackSelection = exoTrackSelection;
            this.trackGroup = trackGroup;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean blacklist(int i10, long j10) {
            return this.trackSelection.blacklist(i10, j10);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void disable() {
            this.trackSelection.disable();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void enable() {
            this.trackSelection.enable();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForwardingTrackSelection)) {
                return false;
            }
            ForwardingTrackSelection forwardingTrackSelection = (ForwardingTrackSelection) obj;
            return this.trackSelection.equals(forwardingTrackSelection.trackSelection) && this.trackGroup.equals(forwardingTrackSelection.trackGroup);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int evaluateQueueSize(long j10, List<? extends MediaChunk> list) {
            return this.trackSelection.evaluateQueueSize(j10, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public Format getFormat(int i10) {
            return this.trackSelection.getFormat(i10);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getIndexInTrackGroup(int i10) {
            return this.trackSelection.getIndexInTrackGroup(i10);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public Format getSelectedFormat() {
            return this.trackSelection.getSelectedFormat();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.trackSelection.getSelectedIndex();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndexInTrackGroup() {
            return this.trackSelection.getSelectedIndexInTrackGroup();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
            return this.trackSelection.getSelectionData();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return this.trackSelection.getSelectionReason();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public TrackGroup getTrackGroup() {
            return this.trackGroup;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getType() {
            return this.trackSelection.getType();
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.trackGroup.hashCode()) * 31) + this.trackSelection.hashCode();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int indexOf(Format format) {
            return this.trackSelection.indexOf(format);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean isBlacklisted(int i10, long j10) {
            return this.trackSelection.isBlacklisted(i10, j10);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int length() {
            return this.trackSelection.length();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onDiscontinuity() {
            this.trackSelection.onDiscontinuity();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onPlayWhenReadyChanged(boolean z10) {
            this.trackSelection.onPlayWhenReadyChanged(z10);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onPlaybackSpeed(float f10) {
            this.trackSelection.onPlaybackSpeed(f10);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onRebuffer() {
            this.trackSelection.onRebuffer();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean shouldCancelChunkLoad(long j10, Chunk chunk, List<? extends MediaChunk> list) {
            return this.trackSelection.shouldCancelChunkLoad(j10, chunk, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            this.trackSelection.updateSelectedTrack(j10, j11, j12, list, mediaChunkIteratorArr);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int indexOf(int i10) {
            return this.trackSelection.indexOf(i10);
        }
    }

    private static final class TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
        private MediaPeriod.Callback callback;
        private final MediaPeriod mediaPeriod;
        private final long timeOffsetUs;

        public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j10) {
            this.mediaPeriod = mediaPeriod;
            this.timeOffsetUs = j10;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j10) {
            return this.mediaPeriod.continueLoading(j10 - this.timeOffsetUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j10, boolean z10) {
            this.mediaPeriod.discardBuffer(j10 - this.timeOffsetUs, z10);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
            return this.mediaPeriod.getAdjustedSeekPositionUs(j10 - this.timeOffsetUs, seekParameters) + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return bufferedPositionUs + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return nextLoadPositionUs + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
            return this.mediaPeriod.getStreamKeys(list);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.mediaPeriod.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return this.mediaPeriod.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws IOException {
            this.mediaPeriod.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j10) {
            this.callback = callback;
            this.mediaPeriod.prepare(this, j10 - this.timeOffsetUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            long discontinuity = this.mediaPeriod.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return discontinuity + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j10) {
            this.mediaPeriod.reevaluateBuffer(j10 - this.timeOffsetUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j10) {
            return this.mediaPeriod.seekToUs(j10 - this.timeOffsetUs) + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
            SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
            int i10 = 0;
            while (true) {
                SampleStream childStream = null;
                if (i10 >= sampleStreamArr.length) {
                    break;
                }
                TimeOffsetSampleStream timeOffsetSampleStream = (TimeOffsetSampleStream) sampleStreamArr[i10];
                if (timeOffsetSampleStream != null) {
                    childStream = timeOffsetSampleStream.getChildStream();
                }
                sampleStreamArr2[i10] = childStream;
                i10++;
            }
            long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j10 - this.timeOffsetUs);
            for (int i11 = 0; i11 < sampleStreamArr.length; i11++) {
                SampleStream sampleStream = sampleStreamArr2[i11];
                if (sampleStream == null) {
                    sampleStreamArr[i11] = null;
                } else {
                    SampleStream sampleStream2 = sampleStreamArr[i11];
                    if (sampleStream2 == null || ((TimeOffsetSampleStream) sampleStream2).getChildStream() != sampleStream) {
                        sampleStreamArr[i11] = new TimeOffsetSampleStream(sampleStream, this.timeOffsetUs);
                    }
                }
            }
            return jSelectTracks + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    private static final class TimeOffsetSampleStream implements SampleStream {
        private final SampleStream sampleStream;
        private final long timeOffsetUs;

        public TimeOffsetSampleStream(SampleStream sampleStream, long j10) {
            this.sampleStream = sampleStream;
            this.timeOffsetUs = j10;
        }

        public SampleStream getChildStream() {
            return this.sampleStream;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return this.sampleStream.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.sampleStream.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
            int data = this.sampleStream.readData(formatHolder, decoderInputBuffer, i10);
            if (data == -4) {
                decoderInputBuffer.timeUs = Math.max(0L, decoderInputBuffer.timeUs + this.timeOffsetUs);
            }
            return data;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j10) {
            return this.sampleStream.skipData(j10 - this.timeOffsetUs);
        }
    }

    public MergingMediaPeriod(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, long[] jArr, MediaPeriod... mediaPeriodArr) {
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.periods = mediaPeriodArr;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
        for (int i10 = 0; i10 < mediaPeriodArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.periods[i10] = new TimeOffsetMediaPeriod(mediaPeriodArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j10) {
        if (this.childrenPendingPreparation.isEmpty()) {
            return this.compositeSequenceableLoader.continueLoading(j10);
        }
        int size = this.childrenPendingPreparation.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.childrenPendingPreparation.get(i10).continueLoading(j10);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            mediaPeriod.discardBuffer(j10, z10);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.periods[0]).getAdjustedSeekPositionUs(j10, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    public MediaPeriod getChildPeriod(int i10) {
        MediaPeriod mediaPeriod = this.periods[i10];
        return mediaPeriod instanceof TimeOffsetMediaPeriod ? ((TimeOffsetMediaPeriod) mediaPeriod).mediaPeriod : mediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
        return k.a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.trackGroups);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.childrenPendingPreparation.remove(mediaPeriod);
        if (!this.childrenPendingPreparation.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (MediaPeriod mediaPeriod2 : this.periods) {
            i10 += mediaPeriod2.getTrackGroups().length;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.periods;
            if (i11 >= mediaPeriodArr.length) {
                this.trackGroups = new TrackGroupArray(trackGroupArr);
                ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
                return;
            }
            TrackGroupArray trackGroups = mediaPeriodArr[i11].getTrackGroups();
            int i13 = trackGroups.length;
            int i14 = 0;
            while (i14 < i13) {
                TrackGroup trackGroup = trackGroups.get(i14);
                TrackGroup trackGroupCopyWithId = trackGroup.copyWithId(i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + trackGroup.f25051id);
                this.childTrackGroupByMergedTrackGroup.put(trackGroupCopyWithId, trackGroup);
                trackGroupArr[i12] = trackGroupCopyWithId;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.callback = callback;
        Collections.addAll(this.childrenPendingPreparation, this.periods);
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.prepare(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            long discontinuity = mediaPeriod.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && mediaPeriod.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (MediaPeriod mediaPeriod2 : this.enabledPeriods) {
                    if (mediaPeriod2 == mediaPeriod) {
                        break;
                    }
                    if (mediaPeriod2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = discontinuity;
            } else if (discontinuity != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        this.compositeSequenceableLoader.reevaluateBuffer(j10);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j10) {
        long jSeekToUs = this.enabledPeriods[0].seekToUs(j10);
        int i10 = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
            if (i10 >= mediaPeriodArr.length) {
                return jSeekToUs;
            }
            if (mediaPeriodArr[i10].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
            SampleStream sampleStream = sampleStreamArr[i11];
            Integer num = sampleStream == null ? null : this.streamPeriodIndices.get(sampleStream);
            iArr[i11] = num == null ? -1 : num.intValue();
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i11];
            if (exoTrackSelection != null) {
                String str = exoTrackSelection.getTrackGroup().f25051id;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr2[i11] = -1;
            }
        }
        this.streamPeriodIndices.clear();
        int length = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        ArrayList arrayList = new ArrayList(this.periods.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.periods.length) {
            for (int i13 = i10; i13 < exoTrackSelectionArr.length; i13++) {
                sampleStreamArr3[i13] = iArr[i13] == i12 ? sampleStreamArr[i13] : null;
                if (iArr2[i13] == i12) {
                    ExoTrackSelection exoTrackSelection2 = (ExoTrackSelection) Assertions.checkNotNull(exoTrackSelectionArr[i13]);
                    exoTrackSelectionArr2[i13] = new ForwardingTrackSelection(exoTrackSelection2, (TrackGroup) Assertions.checkNotNull(this.childTrackGroupByMergedTrackGroup.get(exoTrackSelection2.getTrackGroup())));
                } else {
                    exoTrackSelectionArr2[i13] = null;
                }
            }
            int i14 = i12;
            long jSelectTracks = this.periods[i12].selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jSelectTracks;
            } else if (jSelectTracks != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < exoTrackSelectionArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    SampleStream sampleStream2 = (SampleStream) Assertions.checkNotNull(sampleStreamArr3[i15]);
                    sampleStreamArr2[i15] = sampleStreamArr3[i15];
                    this.streamPeriodIndices.put(sampleStream2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    Assertions.checkState(sampleStreamArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(this.periods[i14]);
            }
            i12 = i14 + 1;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(sampleStreamArr2, i16, sampleStreamArr, i16, length);
        MediaPeriod[] mediaPeriodArr = (MediaPeriod[]) arrayList.toArray(new MediaPeriod[i16]);
        this.enabledPeriods = mediaPeriodArr;
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(mediaPeriodArr);
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }
}

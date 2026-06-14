package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class MaskingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private final Allocator allocator;

    @Nullable
    private MediaPeriod.Callback callback;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f25049id;

    @Nullable
    private PrepareListener listener;
    private MediaPeriod mediaPeriod;
    private MediaSource mediaSource;
    private boolean notifiedPrepareError;
    private long preparePositionOverrideUs = -9223372036854775807L;
    private final long preparePositionUs;

    public interface PrepareListener {
        void onPrepareComplete(MediaSource.MediaPeriodId mediaPeriodId);

        void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException);
    }

    public MaskingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        this.f25049id = mediaPeriodId;
        this.allocator = allocator;
        this.preparePositionUs = j10;
    }

    private long getPreparePositionWithOverride(long j10) {
        long j11 = this.preparePositionOverrideUs;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j10) {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        return mediaPeriod != null && mediaPeriod.continueLoading(j10);
    }

    public void createPeriod(MediaSource.MediaPeriodId mediaPeriodId) {
        long preparePositionWithOverride = getPreparePositionWithOverride(this.preparePositionUs);
        MediaPeriod mediaPeriodCreatePeriod = ((MediaSource) Assertions.checkNotNull(this.mediaSource)).createPeriod(mediaPeriodId, this.allocator, preparePositionWithOverride);
        this.mediaPeriod = mediaPeriodCreatePeriod;
        if (this.callback != null) {
            mediaPeriodCreatePeriod.prepare(this, preparePositionWithOverride);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
        ((MediaPeriod) Util.castNonNull(this.mediaPeriod)).discardBuffer(j10, z10);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        return ((MediaPeriod) Util.castNonNull(this.mediaPeriod)).getAdjustedSeekPositionUs(j10, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return ((MediaPeriod) Util.castNonNull(this.mediaPeriod)).getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return ((MediaPeriod) Util.castNonNull(this.mediaPeriod)).getNextLoadPositionUs();
    }

    public long getPreparePositionOverrideUs() {
        return this.preparePositionOverrideUs;
    }

    public long getPreparePositionUs() {
        return this.preparePositionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
        return k.a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return ((MediaPeriod) Util.castNonNull(this.mediaPeriod)).getTrackGroups();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        return mediaPeriod != null && mediaPeriod.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        try {
            MediaPeriod mediaPeriod = this.mediaPeriod;
            if (mediaPeriod != null) {
                mediaPeriod.maybeThrowPrepareError();
                return;
            }
            MediaSource mediaSource = this.mediaSource;
            if (mediaSource != null) {
                mediaSource.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e10) {
            PrepareListener prepareListener = this.listener;
            if (prepareListener == null) {
                throw e10;
            }
            if (this.notifiedPrepareError) {
                return;
            }
            this.notifiedPrepareError = true;
            prepareListener.onPrepareError(this.f25049id, e10);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Util.castNonNull(this.callback)).onPrepared(this);
        PrepareListener prepareListener = this.listener;
        if (prepareListener != null) {
            prepareListener.onPrepareComplete(this.f25049id);
        }
    }

    public void overridePreparePositionUs(long j10) {
        this.preparePositionOverrideUs = j10;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.callback = callback;
        MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod != null) {
            mediaPeriod.prepare(this, getPreparePositionWithOverride(this.preparePositionUs));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return ((MediaPeriod) Util.castNonNull(this.mediaPeriod)).readDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        ((MediaPeriod) Util.castNonNull(this.mediaPeriod)).reevaluateBuffer(j10);
    }

    public void releasePeriod() {
        if (this.mediaPeriod != null) {
            ((MediaSource) Assertions.checkNotNull(this.mediaSource)).releasePeriod(this.mediaPeriod);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j10) {
        return ((MediaPeriod) Util.castNonNull(this.mediaPeriod)).seekToUs(j10);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.preparePositionOverrideUs;
        if (j12 == -9223372036854775807L || j10 != this.preparePositionUs) {
            j11 = j10;
        } else {
            this.preparePositionOverrideUs = -9223372036854775807L;
            j11 = j12;
        }
        return ((MediaPeriod) Util.castNonNull(this.mediaPeriod)).selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j11);
    }

    public void setMediaSource(MediaSource mediaSource) {
        Assertions.checkState(this.mediaSource == null);
        this.mediaSource = mediaSource;
    }

    public void setPrepareListener(PrepareListener prepareListener) {
        this.listener = prepareListener;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Util.castNonNull(this.callback)).onContinueLoadingRequested(this);
    }
}

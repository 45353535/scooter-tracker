package com.mbridge.msdk.playercommon.exoplayer2.source;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class DeferredMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private final Allocator allocator;
    private MediaPeriod.Callback callback;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f50064id;

    @Nullable
    private PrepareErrorListener listener;
    private MediaPeriod mediaPeriod;
    public final MediaSource mediaSource;
    private boolean notifiedPrepareError;
    private long preparePositionOverrideUs = -9223372036854775807L;
    private long preparePositionUs;

    public interface PrepareErrorListener {
        void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException);
    }

    public DeferredMediaPeriod(MediaSource mediaSource, MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        this.f50064id = mediaPeriodId;
        this.allocator = allocator;
        this.mediaSource = mediaSource;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j10) {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        return mediaPeriod != null && mediaPeriod.continueLoading(j10);
    }

    public void createPeriod() {
        MediaPeriod mediaPeriodCreatePeriod = this.mediaSource.createPeriod(this.f50064id, this.allocator);
        this.mediaPeriod = mediaPeriodCreatePeriod;
        if (this.callback != null) {
            mediaPeriodCreatePeriod.prepare(this, this.preparePositionUs);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
        this.mediaPeriod.discardBuffer(j10, z10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        return this.mediaPeriod.getAdjustedSeekPositionUs(j10, seekParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.mediaPeriod.getBufferedPositionUs();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.mediaPeriod.getNextLoadPositionUs();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        try {
            MediaPeriod mediaPeriod = this.mediaPeriod;
            if (mediaPeriod != null) {
                mediaPeriod.maybeThrowPrepareError();
            } else {
                this.mediaSource.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e10) {
            PrepareErrorListener prepareErrorListener = this.listener;
            if (prepareErrorListener == null) {
                throw e10;
            }
            if (this.notifiedPrepareError) {
                return;
            }
            this.notifiedPrepareError = true;
            prepareErrorListener.onPrepareError(this.f50064id, e10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.callback.onPrepared(this);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.callback = callback;
        this.preparePositionUs = j10;
        MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod != null) {
            mediaPeriod.prepare(this, j10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return this.mediaPeriod.readDiscontinuity();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        this.mediaPeriod.reevaluateBuffer(j10);
    }

    public void releasePeriod() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod != null) {
            this.mediaSource.releasePeriod(mediaPeriod);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public long seekToUs(long j10) {
        return this.mediaPeriod.seekToUs(j10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.preparePositionOverrideUs;
        if (j12 == -9223372036854775807L || j10 != 0) {
            j11 = j10;
        } else {
            this.preparePositionOverrideUs = -9223372036854775807L;
            j11 = j12;
        }
        return this.mediaPeriod.selectTracks(trackSelectionArr, zArr, sampleStreamArr, zArr2, j11);
    }

    public void setDefaultPreparePositionUs(long j10) {
        if (this.preparePositionUs != 0 || j10 == 0) {
            return;
        }
        this.preparePositionOverrideUs = j10;
        this.preparePositionUs = j10;
    }

    public void setPrepareErrorListener(PrepareErrorListener prepareErrorListener) {
        this.listener = prepareErrorListener;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.callback.onContinueLoadingRequested(this);
    }
}

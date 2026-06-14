package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;

/* JADX INFO: loaded from: classes7.dex */
public abstract class WrappingMediaSource extends CompositeMediaSource<Void> {
    private static final Void CHILD_SOURCE_ID = null;
    protected final MediaSource mediaSource;

    protected WrappingMediaSource(MediaSource mediaSource) {
        this.mediaSource = mediaSource;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        return this.mediaSource.createPeriod(mediaPeriodId, allocator, j10);
    }

    protected final void disableChildSource() {
        disableChildSource(CHILD_SOURCE_ID);
    }

    protected final void enableChildSource() {
        enableChildSource(CHILD_SOURCE_ID);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
        return this.mediaSource.getInitialTimeline();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Nullable
    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    protected long getMediaTimeForChildMediaTime(long j10) {
        return j10;
    }

    protected int getWindowIndexForChildWindowIndex(int i10) {
        return i10;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
        return this.mediaSource.isSingleWindow();
    }

    protected final void prepareChildSource() {
        prepareChildSource(CHILD_SOURCE_ID, this.mediaSource);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected final void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        prepareSourceInternal();
    }

    protected final void releaseChildSource() {
        releaseChildSource(CHILD_SOURCE_ID);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        this.mediaSource.releasePeriod(mediaPeriod);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(Void r12, MediaSource mediaSource, Timeline timeline) {
        onChildSourceInfoRefreshed(timeline);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    public final MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Void r12, MediaSource.MediaPeriodId mediaPeriodId) {
        return getMediaPeriodIdForChildMediaPeriodId(mediaPeriodId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final long getMediaTimeForChildMediaTime(Void r12, long j10) {
        return getMediaTimeForChildMediaTime(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final int getWindowIndexForChildWindowIndex(Void r12, int i10) {
        return getWindowIndexForChildWindowIndex(i10);
    }

    protected void onChildSourceInfoRefreshed(Timeline timeline) {
        refreshSourceInfo(timeline);
    }

    protected void prepareSourceInternal() {
        prepareChildSource();
    }
}

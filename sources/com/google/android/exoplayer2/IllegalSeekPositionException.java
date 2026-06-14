package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes7.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(Timeline timeline, int i10, long j10) {
        this.timeline = timeline;
        this.windowIndex = i10;
        this.positionMs = j10;
    }
}

package com.google.android.exoplayer2.source.chunk;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseMediaChunkIterator implements MediaChunkIterator {
    private long currentIndex;
    private final long fromIndex;
    private final long toIndex;

    public BaseMediaChunkIterator(long j10, long j11) {
        this.fromIndex = j10;
        this.toIndex = j11;
        reset();
    }

    protected final void checkInBounds() {
        long j10 = this.currentIndex;
        if (j10 < this.fromIndex || j10 > this.toIndex) {
            throw new NoSuchElementException();
        }
    }

    protected final long getCurrentIndex() {
        return this.currentIndex;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean isEnded() {
        return this.currentIndex > this.toIndex;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean next() {
        this.currentIndex++;
        return !isEnded();
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public void reset() {
        this.currentIndex = this.fromIndex - 1;
    }
}

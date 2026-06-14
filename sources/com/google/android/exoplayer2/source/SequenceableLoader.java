package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes7.dex */
public interface SequenceableLoader {

    public interface Callback<T extends SequenceableLoader> {
        void onContinueLoadingRequested(T t10);
    }

    boolean continueLoading(long j10);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j10);
}

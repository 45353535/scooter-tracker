package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public interface Downloader {

    public interface ProgressListener {
        void onProgress(long j10, long j11, float f10);
    }

    void cancel();

    void download(@Nullable ProgressListener progressListener) throws InterruptedException, IOException;

    void remove();
}

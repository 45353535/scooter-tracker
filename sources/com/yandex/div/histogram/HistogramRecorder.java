package com.yandex.div.histogram;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class HistogramRecorder {

    @NonNull
    private final HistogramBridge mBridge;

    public HistogramRecorder(@NonNull HistogramBridge histogramBridge) {
        this.mBridge = histogramBridge;
    }

    public void recordShortTimeHistogram(@NonNull String str, long j10, @NonNull TimeUnit timeUnit) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j10), 1L, 10000L, TimeUnit.MILLISECONDS, 50);
    }
}

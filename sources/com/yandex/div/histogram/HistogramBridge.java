package com.yandex.div.histogram;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public interface HistogramBridge {
    void recordTimeHistogram(@NonNull String str, long j10, long j11, long j12, @NonNull TimeUnit timeUnit, int i10);
}

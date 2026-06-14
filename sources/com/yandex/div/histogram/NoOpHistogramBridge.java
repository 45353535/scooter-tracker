package com.yandex.div.histogram;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/histogram/NoOpHistogramBridge;", "Lcom/yandex/div/histogram/HistogramBridge;", "<init>", "()V", "", "name", "", "duration", "min", "max", "Ljava/util/concurrent/TimeUnit;", "unit", "", "bucketCount", "", "recordTimeHistogram", "(Ljava/lang/String;JJJLjava/util/concurrent/TimeUnit;I)V", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NoOpHistogramBridge implements HistogramBridge {
    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordTimeHistogram(@NotNull String name, long duration, long min, long max, @NotNull TimeUnit unit, int bucketCount) {
    }
}

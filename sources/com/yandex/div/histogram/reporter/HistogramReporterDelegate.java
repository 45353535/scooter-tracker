package com.yandex.div.histogram.reporter;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "", "", "histogramName", "", "duration", "forceCallType", "", "reportDuration", "(Ljava/lang/String;JLjava/lang/String;)V", "NoOp", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HistogramReporterDelegate {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate$NoOp;", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "<init>", "()V", "", "histogramName", "", "duration", "forceCallType", "", "reportDuration", "(Ljava/lang/String;JLjava/lang/String;)V", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NoOp implements HistogramReporterDelegate {

        @NotNull
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
        }

        @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
        public void reportDuration(@NotNull String histogramName, long duration, @Nullable String forceCallType) {
        }
    }

    void reportDuration(@NotNull String histogramName, long duration, @Nullable String forceCallType);
}

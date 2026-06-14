package com.yandex.div.histogram.reporter;

import androidx.annotation.AnyThread;
import com.yandex.div.histogram.HistogramFilter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@AnyThread
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporter;", "", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "histogramReporterDelegate", "<init>", "(Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;)V", "", "histogramName", "", "duration", "componentName", "forceCallType", "Lcom/yandex/div/histogram/HistogramFilter;", "filter", "", "reportDuration", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/yandex/div/histogram/HistogramFilter;)V", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class HistogramReporter {

    @NotNull
    private final HistogramReporterDelegate histogramReporterDelegate;

    public HistogramReporter(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        this.histogramReporterDelegate = histogramReporterDelegate;
    }

    public static /* synthetic */ void reportDuration$default(HistogramReporter histogramReporter, String str, long j10, String str2, String str3, HistogramFilter histogramFilter, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDuration");
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            histogramFilter = HistogramFilter.INSTANCE.getON();
        }
        histogramReporter.reportDuration(str, j10, str2, str3, histogramFilter);
    }

    public void reportDuration(@NotNull String histogramName, long duration, @Nullable String componentName, @Nullable String forceCallType, @NotNull HistogramFilter filter) {
        if (filter.report(null)) {
            this.histogramReporterDelegate.reportDuration(histogramName, duration, forceCallType);
        }
        if (componentName != null) {
            String str = componentName + '.' + histogramName;
            if (filter.report(componentName)) {
                this.histogramReporterDelegate.reportDuration(str, duration, forceCallType);
            }
        }
    }
}

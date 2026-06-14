package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "histogramReporterDelegate", "Lcom/yandex/div/histogram/reporter/HistogramReporter;", "createHistogramReporter", "(Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;)Lcom/yandex/div/histogram/reporter/HistogramReporter;", "Lcom/yandex/div/histogram/HistogramConfiguration;", "histogramConfiguration", "Lkf/a;", "Lcom/yandex/div/histogram/HistogramRecorder;", "histogramRecorderProvider", "Lcom/yandex/div/histogram/HistogramColdTypeChecker;", "histogramColdTypeChecker", "createHistogramReporterDelegate", "(Lcom/yandex/div/histogram/HistogramConfiguration;Lkf/a;Lkf/a;)Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivHistogramsModuleKt {
    @NotNull
    public static final HistogramReporter createHistogramReporter(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        return new HistogramReporter(histogramReporterDelegate);
    }

    @NotNull
    public static final HistogramReporterDelegate createHistogramReporterDelegate(@NotNull HistogramConfiguration histogramConfiguration, @NotNull kf.a aVar, @NotNull kf.a aVar2) {
        return !histogramConfiguration.getIsReportingEnabled() ? HistogramReporterDelegate.NoOp.INSTANCE : new HistogramReporterDelegateImpl(aVar, new HistogramCallTypeProvider(new DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(aVar2)), histogramConfiguration, histogramConfiguration.getTaskExecutorProvider());
    }
}

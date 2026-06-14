package com.yandex.div.core.dagger;

import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/dagger/DivHistogramsModule;", "", "()V", "provideHistogramReporter", "Lcom/yandex/div/histogram/reporter/HistogramReporter;", "histogramReporterDelegate", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivHistogramsModule {

    @NotNull
    public static final DivHistogramsModule INSTANCE = new DivHistogramsModule();

    private DivHistogramsModule() {
    }

    @NotNull
    public final HistogramReporter provideHistogramReporter(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        return DivHistogramsModuleKt.createHistogramReporter(histogramReporterDelegate);
    }
}

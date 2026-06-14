package com.yandex.div.storage.histogram;

import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/storage/histogram/HistogramRecorder;", "", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "histogramReporterDelegate", "Lcom/yandex/div/storage/histogram/HistogramNameProvider;", "histogramNameProvider", "<init>", "(Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;Lcom/yandex/div/storage/histogram/HistogramNameProvider;)V", "Lcom/yandex/div/histogram/reporter/HistogramReporter;", "histogramReporter", "Lcom/yandex/div/histogram/reporter/HistogramReporter;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "recordedHistograms", "Ljava/util/concurrent/CopyOnWriteArraySet;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class HistogramRecorder {

    @NotNull
    private final HistogramReporter histogramReporter;

    @NotNull
    private final CopyOnWriteArraySet<String> recordedHistograms = new CopyOnWriteArraySet<>();

    public HistogramRecorder(@NotNull HistogramReporterDelegate histogramReporterDelegate, @Nullable HistogramNameProvider histogramNameProvider) {
        this.histogramReporter = new HistogramReporter(histogramReporterDelegate);
    }
}

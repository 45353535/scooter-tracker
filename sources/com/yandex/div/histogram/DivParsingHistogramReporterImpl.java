package com.yandex.div.histogram;

import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/histogram/DivParsingHistogramReporterImpl;", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "Lkotlin/Function0;", "Lcom/yandex/div/histogram/reporter/HistogramReporter;", "histogramReporter", "Ljava/util/concurrent/Executor;", "calculateSizeExecutor", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/jvm/functions/Function0;", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivParsingHistogramReporterImpl implements DivParsingHistogramReporter {

    @NotNull
    private final Function0<Executor> calculateSizeExecutor;

    @NotNull
    private final Function0<HistogramReporter> histogramReporter;

    /* JADX WARN: Multi-variable type inference failed */
    public DivParsingHistogramReporterImpl(@NotNull Function0<? extends HistogramReporter> function0, @NotNull Function0<? extends Executor> function02) {
        this.histogramReporter = function0;
        this.calculateSizeExecutor = function02;
    }
}

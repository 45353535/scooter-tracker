package com.yandex.div.histogram.reporter;

import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.TaskExecutor;
import com.yandex.div.histogram.util.HistogramUtils;
import java.util.concurrent.TimeUnit;
import kf.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporterDelegateImpl;", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "Lkf/a;", "Lcom/yandex/div/histogram/HistogramRecorder;", "histogramRecorder", "Lcom/yandex/div/histogram/HistogramCallTypeProvider;", "histogramCallTypeProvider", "Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "histogramRecordConfig", "Lcom/yandex/div/histogram/TaskExecutor;", "taskExecutor", "<init>", "(Lkf/a;Lcom/yandex/div/histogram/HistogramCallTypeProvider;Lcom/yandex/div/histogram/HistogramRecordConfiguration;Lkf/a;)V", "", "histogramName", "", "duration", "forceCallType", "", "reportDuration", "(Ljava/lang/String;JLjava/lang/String;)V", "Lkf/a;", "Lcom/yandex/div/histogram/HistogramCallTypeProvider;", "Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HistogramReporterDelegateImpl implements HistogramReporterDelegate {

    @NotNull
    private final HistogramCallTypeProvider histogramCallTypeProvider;

    @NotNull
    private final HistogramRecordConfiguration histogramRecordConfig;

    @NotNull
    private final a histogramRecorder;

    @NotNull
    private final a taskExecutor;

    public HistogramReporterDelegateImpl(@NotNull a aVar, @NotNull HistogramCallTypeProvider histogramCallTypeProvider, @NotNull HistogramRecordConfiguration histogramRecordConfiguration, @NotNull a aVar2) {
        this.histogramRecorder = aVar;
        this.histogramCallTypeProvider = histogramCallTypeProvider;
        this.histogramRecordConfig = histogramRecordConfiguration;
        this.taskExecutor = aVar2;
    }

    @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
    public void reportDuration(@NotNull final String histogramName, final long duration, @Nullable String forceCallType) {
        final String histogramCallType = forceCallType == null ? this.histogramCallTypeProvider.getHistogramCallType(histogramName) : forceCallType;
        if (HistogramUtils.INSTANCE.shouldRecordHistogram(histogramCallType, this.histogramRecordConfig)) {
            ((TaskExecutor) this.taskExecutor.get()).post(new Function0<Unit>() { // from class: com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl.reportDuration.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((HistogramRecorder) HistogramReporterDelegateImpl.this.histogramRecorder.get()).recordShortTimeHistogram(histogramName + '.' + histogramCallType, g.f(duration, 1L), TimeUnit.MILLISECONDS);
                }
            });
        }
    }
}

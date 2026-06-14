package com.yandex.div.histogram;

import com.taurusx.tax.f.y;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.internal.util.DoubleCheckProvider;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/yandex/div/histogram/HistogramConfiguration;", "Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "Lkf/a;", "Lcom/yandex/div/histogram/HistogramBridge;", "getHistogramBridge", "()Lkf/a;", "histogramBridge", "Lcom/yandex/div/histogram/CpuUsageHistogramReporter;", "getCpuUsageHistogramReporter", "cpuUsageHistogramReporter", "", "isReportingEnabled", "()Z", "Lcom/yandex/div/histogram/TaskExecutor;", "getTaskExecutorProvider", "taskExecutorProvider", y.f66058y, "DefaultHistogramConfiguration", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HistogramConfiguration extends HistogramRecordConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final HistogramConfiguration DEFAULT = new DefaultHistogramConfiguration();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/histogram/HistogramConfiguration$Companion;", "", "()V", "DEFAULT", "Lcom/yandex/div/histogram/HistogramConfiguration;", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0014\u0010\u0010R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\tR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/histogram/HistogramConfiguration$DefaultHistogramConfiguration;", "Lcom/yandex/div/histogram/HistogramConfiguration;", "<init>", "()V", "Lkf/a;", "Lcom/yandex/div/histogram/HistogramBridge;", "histogramBridge", "Lkf/a;", "getHistogramBridge", "()Lkf/a;", "Lcom/yandex/div/histogram/CpuUsageHistogramReporter;", "cpuUsageHistogramReporter", "getCpuUsageHistogramReporter", "", "isReportingEnabled", "Z", "()Z", "isColdRecordingEnabled", "isCoolRecordingEnabled", "isWarmRecordingEnabled", "isSizeRecordingEnabled", "Lcom/yandex/div/histogram/TaskExecutor;", "taskExecutorProvider", "getTaskExecutorProvider", "Lcom/yandex/div/histogram/RenderConfiguration;", "renderConfiguration", "getRenderConfiguration", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class DefaultHistogramConfiguration implements HistogramConfiguration {
        private final boolean isColdRecordingEnabled;
        private final boolean isCoolRecordingEnabled;
        private final boolean isReportingEnabled;
        private final boolean isSizeRecordingEnabled;
        private final boolean isWarmRecordingEnabled;

        @NotNull
        private final a histogramBridge = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1.INSTANCE);

        @NotNull
        private final a cpuUsageHistogramReporter = new DoubleCheckProvider(new Function0<CpuUsageHistogramReporter>() { // from class: com.yandex.div.histogram.HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CpuUsageHistogramReporter invoke() {
                return new CpuUsageHistogramReporter.NoOp();
            }
        });

        @NotNull
        private final a taskExecutorProvider = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1.INSTANCE);

        @NotNull
        private final a renderConfiguration = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1.INSTANCE);

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        public a getCpuUsageHistogramReporter() {
            return this.cpuUsageHistogramReporter;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        public a getHistogramBridge() {
            return this.histogramBridge;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        @NotNull
        public a getRenderConfiguration() {
            return this.renderConfiguration;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        public a getTaskExecutorProvider() {
            return this.taskExecutorProvider;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        /* JADX INFO: renamed from: isColdRecordingEnabled, reason: from getter */
        public boolean getIsColdRecordingEnabled() {
            return this.isColdRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        /* JADX INFO: renamed from: isCoolRecordingEnabled, reason: from getter */
        public boolean getIsCoolRecordingEnabled() {
            return this.isCoolRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        /* JADX INFO: renamed from: isReportingEnabled, reason: from getter */
        public boolean getIsReportingEnabled() {
            return this.isReportingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        /* JADX INFO: renamed from: isSizeRecordingEnabled, reason: from getter */
        public boolean getIsSizeRecordingEnabled() {
            return this.isSizeRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        /* JADX INFO: renamed from: isWarmRecordingEnabled, reason: from getter */
        public boolean getIsWarmRecordingEnabled() {
            return this.isWarmRecordingEnabled;
        }
    }

    @NotNull
    a getCpuUsageHistogramReporter();

    @NotNull
    a getHistogramBridge();

    @NotNull
    a getTaskExecutorProvider();

    /* JADX INFO: renamed from: isReportingEnabled */
    boolean getIsReportingEnabled();
}

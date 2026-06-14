package com.yandex.div.core;

import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.dagger.ExternalOptional;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.HistogramBridge;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.storage.DivStorageComponent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001!BM\b\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u000fJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\u001eR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001f¨\u0006\""}, d2 = {"Lcom/yandex/div/core/DivKitConfiguration;", "", "Lkf/a;", "Lx6/a;", "sendBeaconConfiguration", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/yandex/div/histogram/HistogramConfiguration;", "histogramConfiguration", "Lcom/yandex/div/storage/DivStorageComponent;", "divStorageComponent", "Lcom/yandex/div/core/DivRequestExecutor;", "divRequestExecutor", "<init>", "(Lkf/a;Ljava/util/concurrent/ExecutorService;Lkf/a;Lkf/a;Lkf/a;)V", "()Lx6/a;", "()Ljava/util/concurrent/ExecutorService;", "Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "histogramRecordConfiguration", "()Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "()Lcom/yandex/div/histogram/HistogramConfiguration;", "Lcom/yandex/div/histogram/HistogramRecorder;", "histogramRecorder", "()Lcom/yandex/div/histogram/HistogramRecorder;", "Lcom/yandex/div/histogram/CpuUsageHistogramReporter;", "cpuUsageHistogramReporter", "()Lcom/yandex/div/histogram/CpuUsageHistogramReporter;", "Lcom/yandex/div/core/dagger/ExternalOptional;", "externalDivStorageComponent", "()Lcom/yandex/div/core/dagger/ExternalOptional;", "()Lcom/yandex/div/core/DivRequestExecutor;", "Lkf/a;", "Ljava/util/concurrent/ExecutorService;", "Builder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivKitConfiguration {

    @NotNull
    private final a divRequestExecutor;

    @Nullable
    private final a divStorageComponent;

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private final a histogramConfiguration;

    @Nullable
    private final a sendBeaconConfiguration;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\nR$\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00130\u00130\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/DivKitConfiguration$Builder;", "", "<init>", "()V", "Lcom/yandex/div/core/DivKitConfiguration;", "build", "()Lcom/yandex/div/core/DivKitConfiguration;", "Lkf/a;", "Lx6/a;", "sendBeaconConfiguration", "Lkf/a;", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/concurrent/ExecutorService;", "Lcom/yandex/div/histogram/HistogramConfiguration;", "kotlin.jvm.PlatformType", "histogramConfiguration", "Lcom/yandex/div/storage/DivStorageComponent;", "divStorageComponent", "Lcom/yandex/div/core/DivRequestExecutor;", "divRequestExecutor", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private a divStorageComponent;

        @Nullable
        private ExecutorService executorService;

        @Nullable
        private a sendBeaconConfiguration;

        @NotNull
        private a histogramConfiguration = new a() { // from class: y6.f
            @Override // kf.a
            public final Object get() {
                return HistogramConfiguration.DEFAULT;
            }
        };

        @NotNull
        private a divRequestExecutor = new a() { // from class: y6.g
            @Override // kf.a
            public final Object get() {
                return DivRequestExecutor.STUB;
            }
        };

        @NotNull
        public final DivKitConfiguration build() {
            a aVar = this.sendBeaconConfiguration;
            ExecutorService executorServiceNewSingleThreadExecutor = this.executorService;
            if (executorServiceNewSingleThreadExecutor == null) {
                executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            }
            return new DivKitConfiguration(aVar, executorServiceNewSingleThreadExecutor, this.histogramConfiguration, this.divStorageComponent, this.divRequestExecutor, null);
        }
    }

    public /* synthetic */ DivKitConfiguration(a aVar, ExecutorService executorService, a aVar2, a aVar3, a aVar4, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, executorService, aVar2, aVar3, aVar4);
    }

    @NotNull
    public final CpuUsageHistogramReporter cpuUsageHistogramReporter() {
        return (CpuUsageHistogramReporter) ((HistogramConfiguration) this.histogramConfiguration.get()).getCpuUsageHistogramReporter().get();
    }

    @NotNull
    public final DivRequestExecutor divRequestExecutor() {
        return (DivRequestExecutor) this.divRequestExecutor.get();
    }

    @NotNull
    /* JADX INFO: renamed from: executorService, reason: from getter */
    public final ExecutorService getExecutorService() {
        return this.executorService;
    }

    @NotNull
    public final ExternalOptional<DivStorageComponent> externalDivStorageComponent() {
        ExternalOptional.Companion companion = ExternalOptional.INSTANCE;
        a aVar = this.divStorageComponent;
        return companion.ofNullable(aVar != null ? (DivStorageComponent) aVar.get() : null);
    }

    @NotNull
    public final HistogramConfiguration histogramConfiguration() {
        return (HistogramConfiguration) this.histogramConfiguration.get();
    }

    @NotNull
    public final HistogramRecordConfiguration histogramRecordConfiguration() {
        return (HistogramRecordConfiguration) this.histogramConfiguration.get();
    }

    @NotNull
    public final HistogramRecorder histogramRecorder() {
        return new HistogramRecorder((HistogramBridge) ((HistogramConfiguration) this.histogramConfiguration.get()).getHistogramBridge().get());
    }

    @Nullable
    public final x6.a sendBeaconConfiguration() {
        a aVar = this.sendBeaconConfiguration;
        if (aVar != null) {
            androidx.privacysandbox.ads.adservices.topics.a.a(aVar.get());
        }
        return null;
    }

    private DivKitConfiguration(a aVar, ExecutorService executorService, a aVar2, a aVar3, a aVar4) {
        this.sendBeaconConfiguration = aVar;
        this.executorService = executorService;
        this.histogramConfiguration = aVar2;
        this.divStorageComponent = aVar3;
        this.divRequestExecutor = aVar4;
    }
}

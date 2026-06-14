package com.yandex.div.core.dagger;

import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporterImpl;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.util.DoubleCheckProvider;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/dagger/DivKitHistogramsModule;", "", "<init>", "()V", "Lcom/yandex/div/histogram/HistogramConfiguration;", "histogramConfiguration", "Lkf/a;", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/concurrent/Executor;", "provideCalculateSizeExecutor", "(Lcom/yandex/div/histogram/HistogramConfiguration;Lkf/a;)Lkf/a;", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "histogramReporterDelegate", "Lcom/yandex/div/histogram/reporter/HistogramReporter;", "provideHistogramReporter", "(Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;)Lkf/a;", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "provideDivParsingHistogramReporter", "(Lcom/yandex/div/histogram/HistogramConfiguration;Lkf/a;Lkf/a;)Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "Lcom/yandex/div/histogram/HistogramRecorder;", "histogramRecorderProvider", "Lcom/yandex/div/histogram/HistogramColdTypeChecker;", "histogramColdTypeCheckerProvider", "provideHistogramReporterDelegate", "(Lcom/yandex/div/histogram/HistogramConfiguration;Lkf/a;Lkf/a;)Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivKitHistogramsModule {

    @NotNull
    public static final DivKitHistogramsModule INSTANCE = new DivKitHistogramsModule();

    /* JADX INFO: renamed from: com.yandex.div.core.dagger.DivKitHistogramsModule$provideDivParsingHistogramReporter$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends y implements Function0<HistogramReporter> {
        AnonymousClass1(Object obj) {
            super(0, obj, kf.a.class, "get", "get()Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HistogramReporter invoke() {
            return (HistogramReporter) ((kf.a) this.receiver).get();
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.dagger.DivKitHistogramsModule$provideDivParsingHistogramReporter$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass2 extends y implements Function0<Executor> {
        AnonymousClass2(Object obj) {
            super(0, obj, kf.a.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Executor invoke() {
            return (Executor) ((kf.a) this.receiver).get();
        }
    }

    private DivKitHistogramsModule() {
    }

    private final kf.a provideCalculateSizeExecutor(HistogramConfiguration histogramConfiguration, kf.a executorService) {
        if (!histogramConfiguration.getIsSizeRecordingEnabled()) {
            return new kf.a() { // from class: com.yandex.div.core.dagger.b
                @Override // kf.a
                public final Object get() {
                    return DivKitHistogramsModule.provideCalculateSizeExecutor$lambda$1();
                }
            };
        }
        Intrinsics.checkNotNull(executorService, "null cannot be cast to non-null type javax.inject.Provider<java.util.concurrent.Executor>");
        return executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor provideCalculateSizeExecutor$lambda$1() {
        return new Executor() { // from class: com.yandex.div.core.dagger.c
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                DivKitHistogramsModule.provideCalculateSizeExecutor$lambda$1$lambda$0(runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideCalculateSizeExecutor$lambda$1$lambda$0(Runnable runnable) {
    }

    private final kf.a provideHistogramReporter(final HistogramReporterDelegate histogramReporterDelegate) {
        return new DoubleCheckProvider(new Function0<HistogramReporter>() { // from class: com.yandex.div.core.dagger.DivKitHistogramsModule.provideHistogramReporter.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HistogramReporter invoke() {
                return DivHistogramsModuleKt.createHistogramReporter(histogramReporterDelegate);
            }
        });
    }

    @NotNull
    public final DivParsingHistogramReporter provideDivParsingHistogramReporter(@NotNull HistogramConfiguration histogramConfiguration, @NotNull kf.a histogramReporterDelegate, @NotNull kf.a executorService) {
        if (!histogramConfiguration.getIsReportingEnabled()) {
            return DivParsingHistogramReporter.INSTANCE.getDEFAULT();
        }
        return new DivParsingHistogramReporterImpl(new AnonymousClass1(provideHistogramReporter((HistogramReporterDelegate) histogramReporterDelegate.get())), new AnonymousClass2(provideCalculateSizeExecutor(histogramConfiguration, executorService)));
    }

    @NotNull
    public final HistogramReporterDelegate provideHistogramReporterDelegate(@NotNull HistogramConfiguration histogramConfiguration, @NotNull kf.a histogramRecorderProvider, @NotNull kf.a histogramColdTypeCheckerProvider) {
        return histogramConfiguration.getIsReportingEnabled() ? DivHistogramsModuleKt.createHistogramReporterDelegate(histogramConfiguration, histogramRecorderProvider, histogramColdTypeCheckerProvider) : HistogramReporterDelegate.NoOp.INSTANCE;
    }
}

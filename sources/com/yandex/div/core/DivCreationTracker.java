package com.yandex.div.core;

import android.os.SystemClock;
import com.taurusx.tax.f.y;
import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/DivCreationTracker;", "", "", "contextCreationStarted", "<init>", "(J)V", "Lcom/yandex/div/histogram/reporter/HistogramReporter;", "histogramReporter", "", "sendContextCreationHistogram", "(Lcom/yandex/div/histogram/reporter/HistogramReporter;)V", "onContextCreationFinished", "()V", "viewCreationStart", "viewCreationFinish", "", "viewCreateCallType", "sendHistograms", "(JJLcom/yandex/div/histogram/reporter/HistogramReporter;Ljava/lang/String;)V", "J", "contextCreatedTime", "Ljava/util/concurrent/atomic/AtomicBoolean;", "contextCreationReported", "Ljava/util/concurrent/atomic/AtomicBoolean;", "contextCreateCallType", "Ljava/lang/String;", "getContextCreateCallType$annotations", "isFirstViewCreate", "getViewCreateCallType", "()Ljava/lang/String;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivCreationTracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicBoolean isColdContextCreate = new AtomicBoolean(true);

    @NotNull
    private static final AtomicBoolean isColdViewCreate = new AtomicBoolean(true);

    @NotNull
    private final String contextCreateCallType;
    private long contextCreatedTime = -1;

    @NotNull
    private final AtomicBoolean contextCreationReported = new AtomicBoolean(false);
    private final long contextCreationStarted;

    @NotNull
    private final AtomicBoolean isFirstViewCreate;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/DivCreationTracker$Companion;", "", "<init>", "()V", "", "getCurrentUptimeMillis", "()J", "currentUptimeMillis", "INVALID_TIME", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isColdContextCreate", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isColdViewCreate", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getCurrentUptimeMillis() {
            return SystemClock.uptimeMillis();
        }

        private Companion() {
        }
    }

    public DivCreationTracker(long j10) {
        this.contextCreationStarted = j10;
        this.contextCreateCallType = isColdContextCreate.compareAndSet(true, false) ? "Cold" : "Cool";
        this.isFirstViewCreate = new AtomicBoolean(true);
    }

    private final void sendContextCreationHistogram(HistogramReporter histogramReporter) {
        long j10 = this.contextCreatedTime;
        if (j10 < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, "Div.Context.Create", j10 - this.contextCreationStarted, null, this.contextCreateCallType, null, 20, null);
        this.contextCreatedTime = -1L;
    }

    @NotNull
    public final String getViewCreateCallType() {
        return this.isFirstViewCreate.compareAndSet(true, false) ? isColdViewCreate.compareAndSet(true, false) ? "Cold" : "Cool" : "Warm";
    }

    public final void onContextCreationFinished() {
        if (this.contextCreatedTime >= 0) {
            return;
        }
        this.contextCreatedTime = INSTANCE.getCurrentUptimeMillis();
    }

    public final void sendHistograms(long viewCreationStart, long viewCreationFinish, @NotNull HistogramReporter histogramReporter, @NotNull String viewCreateCallType) {
        if (viewCreationFinish < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, "Div.View.Create", viewCreationFinish - viewCreationStart, null, viewCreateCallType, null, 20, null);
        if (this.contextCreationReported.compareAndSet(false, true)) {
            sendContextCreationHistogram(histogramReporter);
        }
    }
}

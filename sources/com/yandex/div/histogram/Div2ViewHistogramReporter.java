package com.yandex.div.histogram;

import android.os.SystemClock;
import androidx.annotation.MainThread;
import com.yandex.div.histogram.metrics.RenderMetrics;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u000fJ\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u000fJ\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u000fJ\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u000fJ\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u000fJ\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u000fJ\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000fJ\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u000fJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u000fJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u000fJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u000fJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u000fJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010,R\u0018\u00102\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,R\u001b\u0010\n\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/yandex/div/histogram/Div2ViewHistogramReporter;", "", "Lkotlin/Function0;", "Lcom/yandex/div/histogram/reporter/HistogramReporter;", "histogramReporter", "Lcom/yandex/div/histogram/RenderConfiguration;", "renderConfig", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/yandex/div/histogram/metrics/RenderMetrics;", "renderMetrics", "", "reportRenderMetrics", "(Lcom/yandex/div/histogram/metrics/RenderMetrics;)V", "resetRenderMetrics", "()V", "", "toTimePassed", "(J)J", "onRenderStarted", "onBindingStarted", "onBindingPaused", "onBindingResumed", "onBindingFinished", "onRebindingStarted", "onRebindingFinished", "onMeasureStarted", "onMeasureFinished", "onLayoutStarted", "onLayoutFinished", "onDrawStarted", "onDrawFinished", "Lkotlin/jvm/functions/Function0;", "", "component", "Ljava/lang/String;", "getComponent", "()Ljava/lang/String;", "setComponent", "(Ljava/lang/String;)V", "", "renderStarted", "Z", "bindingStartedTime", "Ljava/lang/Long;", "bindingPausedTime", "bindingResumedTime", "rebindingStartedTime", "measureStartedTime", "layoutStartedTime", "drawStartedTime", "renderMetrics$delegate", "Lkotlin/Lazy;", "getRenderMetrics", "()Lcom/yandex/div/histogram/metrics/RenderMetrics;", "getCurrentUptime", "()J", "currentUptime", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@MainThread
public final class Div2ViewHistogramReporter {

    @Nullable
    private Long bindingPausedTime;

    @Nullable
    private Long bindingResumedTime;

    @Nullable
    private Long bindingStartedTime;

    @Nullable
    private String component;

    @Nullable
    private Long drawStartedTime;

    @NotNull
    private final Function0<HistogramReporter> histogramReporter;

    @Nullable
    private Long layoutStartedTime;

    @Nullable
    private Long measureStartedTime;

    @Nullable
    private Long rebindingStartedTime;

    @NotNull
    private final Function0<RenderConfiguration> renderConfig;

    /* JADX INFO: renamed from: renderMetrics$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy renderMetrics = i.b(l.f94211d, Div2ViewHistogramReporter$renderMetrics$2.INSTANCE);
    private boolean renderStarted;

    /* JADX WARN: Multi-variable type inference failed */
    public Div2ViewHistogramReporter(@NotNull Function0<? extends HistogramReporter> function0, @NotNull Function0<RenderConfiguration> function02) {
        this.histogramReporter = function0;
        this.renderConfig = function02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getCurrentUptime() {
        return SystemClock.uptimeMillis();
    }

    private final RenderMetrics getRenderMetrics() {
        return (RenderMetrics) this.renderMetrics.getValue();
    }

    private final void reportRenderMetrics(RenderMetrics renderMetrics) {
        HistogramReporter histogramReporterInvoke = this.histogramReporter.invoke();
        RenderConfiguration renderConfigurationInvoke = this.renderConfig.invoke();
        HistogramReporter.reportDuration$default(histogramReporterInvoke, "Div.Render.Total", renderMetrics.getTotalMs(), this.component, null, renderConfigurationInvoke.getTotalFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporterInvoke, "Div.Render.Measure", renderMetrics.getMeasureMs(), this.component, null, renderConfigurationInvoke.getMeasureFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporterInvoke, "Div.Render.Layout", renderMetrics.getLayoutMs(), this.component, null, renderConfigurationInvoke.getLayoutFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporterInvoke, "Div.Render.Draw", renderMetrics.getDrawMs(), this.component, null, renderConfigurationInvoke.getDrawFilter(), 8, null);
    }

    private final void resetRenderMetrics() {
        this.renderStarted = false;
        this.layoutStartedTime = null;
        this.measureStartedTime = null;
        this.drawStartedTime = null;
        getRenderMetrics().reset();
    }

    private final long toTimePassed(long j10) {
        return getCurrentUptime() - j10;
    }

    @Nullable
    public final String getComponent() {
        return this.component;
    }

    public final void onBindingFinished() {
        String str;
        long currentUptime;
        Long l10 = this.bindingStartedTime;
        Long l11 = this.bindingPausedTime;
        Long l12 = this.bindingResumedTime;
        RenderMetrics renderMetrics = getRenderMetrics();
        if (l10 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                str = "start time of Div.Binding is null";
                Assert.fail(str);
            }
        } else {
            if (l11 != null && l12 != null) {
                currentUptime = ((getCurrentUptime() - l12.longValue()) + l11.longValue()) - l10.longValue();
            } else if (l11 == null && l12 == null) {
                currentUptime = getCurrentUptime() - l10.longValue();
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    str = "when Div.Binding has paused time it should have resumed time and otherwise";
                    Assert.fail(str);
                }
            }
            renderMetrics.binding(currentUptime);
            HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.invoke(), "Div.Binding", currentUptime, getComponent(), null, null, 24, null);
        }
        this.bindingStartedTime = null;
        this.bindingPausedTime = null;
        this.bindingResumedTime = null;
    }

    public final void onBindingPaused() {
        this.bindingPausedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onBindingResumed() {
        this.bindingResumedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onBindingStarted() {
        this.bindingStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onDrawFinished() {
        Long l10 = this.drawStartedTime;
        if (l10 != null) {
            getRenderMetrics().addDraw(toTimePassed(l10.longValue()));
        }
        if (this.renderStarted) {
            reportRenderMetrics(getRenderMetrics());
        }
        resetRenderMetrics();
    }

    public final void onDrawStarted() {
        this.drawStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onLayoutFinished() {
        Long l10 = this.layoutStartedTime;
        if (l10 != null) {
            getRenderMetrics().addLayout(toTimePassed(l10.longValue()));
        }
    }

    public final void onLayoutStarted() {
        this.layoutStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onMeasureFinished() {
        Long l10 = this.measureStartedTime;
        if (l10 != null) {
            getRenderMetrics().addMeasure(toTimePassed(l10.longValue()));
        }
    }

    public final void onMeasureStarted() {
        this.measureStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onRebindingFinished() {
        Long l10 = this.rebindingStartedTime;
        RenderMetrics renderMetrics = getRenderMetrics();
        if (l10 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("start time of Div.Rebinding is null");
            }
        } else {
            long currentUptime = getCurrentUptime() - l10.longValue();
            renderMetrics.rebinding(currentUptime);
            HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.invoke(), "Div.Rebinding", currentUptime, getComponent(), null, null, 24, null);
        }
        this.rebindingStartedTime = null;
    }

    public final void onRebindingStarted() {
        this.rebindingStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onRenderStarted() {
        this.renderStarted = true;
    }

    public final void setComponent(@Nullable String str) {
        this.component = str;
    }
}

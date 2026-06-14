package com.yandex.div.histogram.metrics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003R$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R$\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R$\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u001c\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/histogram/metrics/RenderMetrics;", "", "<init>", "()V", "", "duration", "", "binding", "(J)V", "rebinding", "addMeasure", "addLayout", "addDraw", "reset", "<set-?>", "bindingMs", "J", "getBindingMs", "()J", "rebindingMs", "getRebindingMs", "measureMs", "getMeasureMs", "layoutMs", "getLayoutMs", "drawMs", "getDrawMs", "getTotalMs", "totalMs", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RenderMetrics {
    private long bindingMs;
    private long drawMs;
    private long layoutMs;
    private long measureMs;
    private long rebindingMs;

    public final void addDraw(long duration) {
        this.drawMs += duration;
    }

    public final void addLayout(long duration) {
        this.layoutMs += duration;
    }

    public final void addMeasure(long duration) {
        this.measureMs += duration;
    }

    public final void binding(long duration) {
        this.bindingMs = duration;
    }

    public final long getDrawMs() {
        return this.drawMs;
    }

    public final long getLayoutMs() {
        return this.layoutMs;
    }

    public final long getMeasureMs() {
        return this.measureMs;
    }

    public final long getTotalMs() {
        return Math.max(this.bindingMs, this.rebindingMs) + this.measureMs + this.layoutMs + this.drawMs;
    }

    public final void rebinding(long duration) {
        this.rebindingMs = duration;
    }

    public final void reset() {
        this.measureMs = 0L;
        this.layoutMs = 0L;
        this.drawMs = 0L;
        this.bindingMs = 0L;
        this.rebindingMs = 0L;
    }
}

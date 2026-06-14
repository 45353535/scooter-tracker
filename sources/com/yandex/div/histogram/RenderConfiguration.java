package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/yandex/div/histogram/RenderConfiguration;", "", "measureFilter", "Lcom/yandex/div/histogram/HistogramFilter;", "layoutFilter", "drawFilter", "totalFilter", "(Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;)V", "getDrawFilter", "()Lcom/yandex/div/histogram/HistogramFilter;", "getLayoutFilter", "getMeasureFilter", "getTotalFilter", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RenderConfiguration {

    @NotNull
    private final HistogramFilter drawFilter;

    @NotNull
    private final HistogramFilter layoutFilter;

    @NotNull
    private final HistogramFilter measureFilter;

    @NotNull
    private final HistogramFilter totalFilter;

    public RenderConfiguration(@NotNull HistogramFilter histogramFilter, @NotNull HistogramFilter histogramFilter2, @NotNull HistogramFilter histogramFilter3, @NotNull HistogramFilter histogramFilter4) {
        this.measureFilter = histogramFilter;
        this.layoutFilter = histogramFilter2;
        this.drawFilter = histogramFilter3;
        this.totalFilter = histogramFilter4;
    }

    @NotNull
    public final HistogramFilter getDrawFilter() {
        return this.drawFilter;
    }

    @NotNull
    public final HistogramFilter getLayoutFilter() {
        return this.layoutFilter;
    }

    @NotNull
    public final HistogramFilter getMeasureFilter() {
        return this.measureFilter;
    }

    @NotNull
    public final HistogramFilter getTotalFilter() {
        return this.totalFilter;
    }

    public /* synthetic */ RenderConfiguration(HistogramFilter histogramFilter, HistogramFilter histogramFilter2, HistogramFilter histogramFilter3, HistogramFilter histogramFilter4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? HistogramFilter.INSTANCE.getOFF() : histogramFilter, (i10 & 2) != 0 ? HistogramFilter.INSTANCE.getOFF() : histogramFilter2, (i10 & 4) != 0 ? HistogramFilter.INSTANCE.getOFF() : histogramFilter3, (i10 & 8) != 0 ? HistogramFilter.INSTANCE.getON() : histogramFilter4);
    }
}

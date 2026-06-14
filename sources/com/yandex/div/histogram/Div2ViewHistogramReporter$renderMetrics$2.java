package com.yandex.div.histogram;

import com.yandex.div.histogram.metrics.RenderMetrics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class Div2ViewHistogramReporter$renderMetrics$2 extends y implements Function0<RenderMetrics> {
    public static final Div2ViewHistogramReporter$renderMetrics$2 INSTANCE = new Div2ViewHistogramReporter$renderMetrics$2();

    Div2ViewHistogramReporter$renderMetrics$2() {
        super(0, RenderMetrics.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final RenderMetrics invoke() {
        return new RenderMetrics();
    }
}

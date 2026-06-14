package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1 extends a implements Function0<RenderConfiguration> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1();

    HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1() {
        super(0, RenderConfiguration.class, "<init>", "<init>(Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;)V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final RenderConfiguration invoke() {
        return new RenderConfiguration(null, null, null, null, 15, null);
    }
}

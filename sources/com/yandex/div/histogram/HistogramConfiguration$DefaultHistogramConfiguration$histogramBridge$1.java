package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1 extends y implements Function0<NoOpHistogramBridge> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1();

    HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1() {
        super(0, NoOpHistogramBridge.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final NoOpHistogramBridge invoke() {
        return new NoOpHistogramBridge();
    }
}

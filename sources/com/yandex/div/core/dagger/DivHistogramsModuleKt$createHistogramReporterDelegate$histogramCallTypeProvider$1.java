package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramColdTypeChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1 extends y implements Function0<HistogramColdTypeChecker> {
    DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(Object obj) {
        super(0, obj, kf.a.class, "get", "get()Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HistogramColdTypeChecker invoke() {
        return (HistogramColdTypeChecker) ((kf.a) this.receiver).get();
    }
}

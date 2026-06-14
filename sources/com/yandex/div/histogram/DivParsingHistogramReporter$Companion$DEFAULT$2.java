package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class DivParsingHistogramReporter$Companion$DEFAULT$2 extends y implements Function0<DefaultDivParsingHistogramReporter> {
    public static final DivParsingHistogramReporter$Companion$DEFAULT$2 INSTANCE = new DivParsingHistogramReporter$Companion$DEFAULT$2();

    DivParsingHistogramReporter$Companion$DEFAULT$2() {
        super(0, DefaultDivParsingHistogramReporter.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DefaultDivParsingHistogramReporter invoke() {
        return new DefaultDivParsingHistogramReporter();
    }
}

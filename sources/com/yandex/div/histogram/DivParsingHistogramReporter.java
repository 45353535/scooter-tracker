package com.yandex.div.histogram;

import com.taurusx.tax.f.y;
import kotlin.Lazy;
import kotlin.Metadata;
import lf.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "", y.f66058y, "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivParsingHistogramReporter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yandex/div/histogram/DivParsingHistogramReporter$Companion;", "", "()V", "DEFAULT", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "getDEFAULT", "()Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "DEFAULT$delegate", "Lkotlin/Lazy;", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: DEFAULT$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy DEFAULT = i.a(DivParsingHistogramReporter$Companion$DEFAULT$2.INSTANCE);

        private Companion() {
        }

        @NotNull
        public final DivParsingHistogramReporter getDEFAULT() {
            return (DivParsingHistogramReporter) DEFAULT.getValue();
        }
    }
}

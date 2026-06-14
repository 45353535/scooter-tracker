package com.yandex.div.histogram;

import com.appodeal.ads.modules.common.internal.Constants;
import com.taurusx.tax.f.y;
import com.yandex.div.histogram.HistogramFilter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/yandex/div/histogram/HistogramFilter;", "", Constants.REPORT, "", "componentName", "", y.f66058y, "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HistogramFilter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yandex/div/histogram/HistogramFilter$Companion;", "", "()V", "OFF", "Lcom/yandex/div/histogram/HistogramFilter;", "getOFF", "()Lcom/yandex/div/histogram/HistogramFilter;", "ON", "getON", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final HistogramFilter ON = new HistogramFilter() { // from class: w7.c
            @Override // com.yandex.div.histogram.HistogramFilter
            public final boolean report(String str) {
                return HistogramFilter.Companion.ON$lambda$0(str);
            }
        };

        @NotNull
        private static final HistogramFilter OFF = new HistogramFilter() { // from class: w7.d
            @Override // com.yandex.div.histogram.HistogramFilter
            public final boolean report(String str) {
                return HistogramFilter.Companion.OFF$lambda$1(str);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean OFF$lambda$1(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ON$lambda$0(String str) {
            return true;
        }

        @NotNull
        public final HistogramFilter getOFF() {
            return OFF;
        }

        @NotNull
        public final HistogramFilter getON() {
            return ON;
        }
    }

    boolean report(@Nullable String componentName);
}

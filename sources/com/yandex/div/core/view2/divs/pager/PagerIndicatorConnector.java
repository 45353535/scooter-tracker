package com.yandex.div.core.view2.divs.pager;

import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.jk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0003R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "", "<init>", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "pagerView", "Lk8/jk;", "pagerDiv", "", "submitPager$div_release", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;Lk8/jk;)V", "submitPager", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "indicatorView", "submitIndicator$div_release", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;Lk8/jk;)V", "submitIndicator", "attach$div_release", "attach", "", "pagers", "Ljava/util/Map;", "", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector$IndicatorData;", "indicators", "Ljava/util/List;", "IndicatorData", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PagerIndicatorConnector {

    @NotNull
    private final Map<jk, DivPagerView> pagers = new LinkedHashMap();

    @NotNull
    private final List<IndicatorData> indicators = new ArrayList();

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector$IndicatorData;", "", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "indicator", "Lk8/jk;", "pagerDiv", "<init>", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;Lk8/jk;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "getIndicator", "()Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "Lk8/jk;", "getPagerDiv", "()Lk8/jk;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class IndicatorData {

        @NotNull
        private final DivPagerIndicatorView indicator;

        @NotNull
        private final jk pagerDiv;

        public IndicatorData(@NotNull DivPagerIndicatorView divPagerIndicatorView, @NotNull jk jkVar) {
            this.indicator = divPagerIndicatorView;
            this.pagerDiv = jkVar;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IndicatorData)) {
                return false;
            }
            IndicatorData indicatorData = (IndicatorData) other;
            return Intrinsics.areEqual(this.indicator, indicatorData.indicator) && Intrinsics.areEqual(this.pagerDiv, indicatorData.pagerDiv);
        }

        @NotNull
        public final DivPagerIndicatorView getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final jk getPagerDiv() {
            return this.pagerDiv;
        }

        public int hashCode() {
            return (this.indicator.hashCode() * 31) + this.pagerDiv.hashCode();
        }

        @NotNull
        public String toString() {
            return "IndicatorData(indicator=" + this.indicator + ", pagerDiv=" + this.pagerDiv + ')';
        }
    }

    public final void attach$div_release() {
        Iterator<Map.Entry<jk, DivPagerView>> it = this.pagers.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().clearChangePageCallbackForIndicators();
        }
        for (IndicatorData indicatorData : this.indicators) {
            DivPagerView divPagerView = this.pagers.get(indicatorData.getPagerDiv());
            if (divPagerView != null) {
                indicatorData.getIndicator().attachPager(divPagerView);
            }
        }
        this.pagers.clear();
        this.indicators.clear();
    }

    public final void submitIndicator$div_release(@NotNull DivPagerIndicatorView indicatorView, @NotNull jk pagerDiv) {
        this.indicators.add(new IndicatorData(indicatorView, pagerDiv));
    }

    public final void submitPager$div_release(@NotNull DivPagerView pagerView, @NotNull jk pagerDiv) {
        this.pagers.put(pagerDiv, pagerView);
    }
}

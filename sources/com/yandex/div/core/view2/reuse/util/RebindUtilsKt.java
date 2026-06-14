package com.yandex.div.core.view2.reuse.util;

import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import k8.y0;
import kf.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/view/ViewGroup;", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lk8/y0;", "div", "", "tryRebindRecycleContainerChildren", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/Div2View;Lk8/y0;)Z", "divView", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", FirebaseAnalytics.Param.ITEMS, "Lkf/a;", "Lcom/yandex/div/core/view2/DivViewCreator;", "divViewCreator", "tryRebindPlainContainerChildren", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/Div2View;Ljava/util/List;Lkf/a;)Z", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class RebindUtilsKt {
    public static final boolean tryRebindPlainContainerChildren(@NotNull ViewGroup viewGroup, @NotNull Div2View div2View, @NotNull List<DivItemBuilderResult> list, @NotNull a aVar) {
        ReusableTokenList currentRebindReusableList$div_release = div2View.getCurrentRebindReusableList$div_release();
        if (currentRebindReusableList$div_release == null) {
            return false;
        }
        viewGroup.removeAllViews();
        for (DivItemBuilderResult divItemBuilderResult : list) {
            View uniqueViewForDiv = currentRebindReusableList$div_release.getUniqueViewForDiv(divItemBuilderResult.getDiv());
            if (uniqueViewForDiv == null) {
                uniqueViewForDiv = ((DivViewCreator) aVar.get()).create(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            viewGroup.addView(uniqueViewForDiv);
        }
        return true;
    }

    public static final boolean tryRebindRecycleContainerChildren(@NotNull ViewGroup viewGroup, @NotNull Div2View div2View, @NotNull y0 y0Var) {
        View uniqueViewForDiv;
        ReusableTokenList currentRebindReusableList$div_release = div2View.getCurrentRebindReusableList$div_release();
        if (currentRebindReusableList$div_release == null || (uniqueViewForDiv = currentRebindReusableList$div_release.getUniqueViewForDiv(y0Var)) == null) {
            return false;
        }
        viewGroup.addView(uniqueViewForDiv);
        return true;
    }
}

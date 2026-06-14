package com.yandex.div.core.view2.divs;

import com.ironsource.C4329g8;
import com.yandex.div.internal.core.DivItemBuilderResult;
import k8.gx;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0005*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/internal/core/DivItemBuilderResult;", "Lk8/gx;", "getVisibility", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;)Lk8/gx;", "visibility", "", C4329g8.f43166k, "(Lcom/yandex/div/internal/core/DivItemBuilderResult;)Z", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class VisibilityAwareAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gx getVisibility(DivItemBuilderResult divItemBuilderResult) {
        return (gx) divItemBuilderResult.getDiv().c().getVisibility().evaluate(divItemBuilderResult.getExpressionResolver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(DivItemBuilderResult divItemBuilderResult) {
        return getVisibility(divItemBuilderResult) == gx.VISIBLE;
    }
}

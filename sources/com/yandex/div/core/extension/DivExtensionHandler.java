package com.yandex.div.core.extension;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.f7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0011J/\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/extension/DivExtensionHandler;", "", "Lk8/f7;", "div", "", "matches", "(Lk8/f7;)Z", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "expressionResolver", "", "preprocess", "(Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "beforeBindView", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;Lk8/f7;)V", "bindView", "unbindView", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivExtensionHandler {
    void beforeBindView(@NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull f7 div);

    void bindView(@NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull f7 div);

    boolean matches(@NotNull f7 div);

    void preprocess(@NotNull f7 div, @NotNull ExpressionResolver expressionResolver);

    void unbindView(@NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull f7 div);
}

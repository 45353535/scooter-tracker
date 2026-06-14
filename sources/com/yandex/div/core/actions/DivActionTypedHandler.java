package com.yandex.div.core.actions;

import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.m5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J1\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedHandler;", "", "", "scopeId", "Lk8/m5;", "action", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handleAction", "(Ljava/lang/String;Lk8/m5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivActionTypedHandler {
    boolean handleAction(@Nullable String scopeId, @NotNull m5 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver);
}

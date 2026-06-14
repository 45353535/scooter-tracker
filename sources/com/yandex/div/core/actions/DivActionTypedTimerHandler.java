package com.yandex.div.core.actions;

import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.j5;
import k8.m5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedTimerHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "<init>", "()V", "Lk8/j5;", "action", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handleTimerAction", "(Lk8/j5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "scopeId", "Lk8/m5;", "", "handleAction", "(Ljava/lang/String;Lk8/m5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivActionTypedTimerHandler implements DivActionTypedHandler {
    private final void handleTimerAction(j5 action, Div2View view, ExpressionResolver resolver) {
        view.applyTimerCommand((String) action.f88348b.evaluate(resolver), j5.a.f88350c.b((j5.a) action.f88347a.evaluate(resolver)));
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull m5 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (!(action instanceof m5.u)) {
            return false;
        }
        handleTimerAction(((m5.u) action).c(), view, resolver);
        return true;
    }
}

package com.yandex.div.core.actions;

import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.items.DivViewWithItemsController;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.e4;
import k8.m5;
import k8.w3;
import k8.z3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ1\u0010\u000b\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedScrollHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "<init>", "()V", "Lk8/w3;", "action", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handleAction", "(Lk8/w3;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/e4;", "(Lk8/e4;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "scopeId", "Lk8/m5;", "", "(Ljava/lang/String;Lk8/m5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivActionTypedScrollHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull m5 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (action instanceof m5.n) {
            handleAction(((m5.n) action).c(), view, resolver);
            return true;
        }
        if (!(action instanceof m5.o)) {
            return false;
        }
        handleAction(((m5.o) action).c(), view, resolver);
        return true;
    }

    private final void handleAction(w3 action, Div2View view, ExpressionResolver resolver) {
        String str = (String) action.f92086b.evaluate(resolver);
        int iLongValue = (int) ((Number) action.f92088d.evaluate(resolver)).longValue();
        int iLongValue2 = (int) ((Number) action.f92087c.evaluate(resolver)).longValue();
        String strB = w3.c.f92092c.b((w3.c) action.f92089e.evaluate(resolver));
        boolean zBooleanValue = ((Boolean) action.f92085a.evaluate(resolver)).booleanValue();
        DivViewWithItemsController divViewWithItemsControllerCreate$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.INSTANCE, str, view, resolver, null, 8, null);
        if (divViewWithItemsControllerCreate$default == null) {
            return;
        }
        divViewWithItemsControllerCreate$default.changeCurrentItemByStep(strB, iLongValue2, zBooleanValue);
        divViewWithItemsControllerCreate$default.scrollByOffset(strB, iLongValue, zBooleanValue);
    }

    private final void handleAction(e4 action, Div2View view, ExpressionResolver resolver) {
        String str = (String) action.f87168c.evaluate(resolver);
        boolean zBooleanValue = ((Boolean) action.f87166a.evaluate(resolver)).booleanValue();
        DivViewWithItemsController divViewWithItemsControllerCreate$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.INSTANCE, str, view, resolver, null, 8, null);
        if (divViewWithItemsControllerCreate$default == null) {
            return;
        }
        z3 z3Var = action.f87167b;
        if (z3Var instanceof z3.e) {
            divViewWithItemsControllerCreate$default.scrollTo((int) ((Number) ((z3.e) z3Var).c().f92558a.evaluate(resolver)).longValue(), zBooleanValue);
            return;
        }
        if (z3Var instanceof z3.d) {
            divViewWithItemsControllerCreate$default.setCurrentItem((int) ((Number) ((z3.d) z3Var).c().f92553a.evaluate(resolver)).longValue(), zBooleanValue);
        } else if (z3Var instanceof z3.c) {
            divViewWithItemsControllerCreate$default.scrollToEnd(zBooleanValue);
        } else if (z3Var instanceof z3.f) {
            divViewWithItemsControllerCreate$default.scrollToStart(zBooleanValue);
        }
    }
}

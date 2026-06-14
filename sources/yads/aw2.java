package yads;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.ExpressionResolver;

/* JADX INFO: loaded from: classes4.dex */
public final class aw2 extends DivActionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hu f108848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wg0 f108849b;

    public aw2(hu huVar) {
        this.f108848a = huVar;
    }

    public final void a(wg0 wg0Var) {
        wg0 wg0Var2 = this.f108849b;
        if (wg0Var2 != null) {
            wg0Var2.f117451c.f111592b = null;
        }
        if (wg0Var != null) {
            wg0Var.f117451c.f111592b = this.f108848a;
        }
        this.f108849b = wg0Var;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(k8.j1 j1Var, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (super.handleAction(j1Var, divViewFacade, expressionResolver)) {
            return true;
        }
        wg0 wg0Var = this.f108849b;
        return wg0Var != null && wg0Var.handleAction(j1Var, divViewFacade, expressionResolver);
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(k8.dp dpVar, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (super.handleAction(dpVar, divViewFacade, expressionResolver)) {
            return true;
        }
        wg0 wg0Var = this.f108849b;
        return wg0Var != null && wg0Var.handleAction(dpVar, divViewFacade, expressionResolver);
    }
}

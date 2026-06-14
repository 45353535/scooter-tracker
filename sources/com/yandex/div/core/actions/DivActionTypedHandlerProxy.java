package com.yandex.div.core.actions;

import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.downloader.DivDownloadActionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.dp;
import k8.j1;
import k8.m5;
import k8.xa;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u000e\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u000e\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedHandlerProxy;", "", "<init>", "()V", "Lk8/dp;", "action", "Lcom/yandex/div/core/DivViewFacade;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handleVisibilityAction", "(Lk8/dp;Lcom/yandex/div/core/DivViewFacade;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lk8/j1;", "handleAction", "(Lk8/j1;Lcom/yandex/div/core/DivViewFacade;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "", "scopeId", "Lk8/m5;", "Lk8/xa;", "downloadCallbacks", "(Ljava/lang/String;Lk8/m5;Lcom/yandex/div/core/DivViewFacade;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/xa;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivActionTypedHandlerProxy {

    @NotNull
    public static final DivActionTypedHandlerProxy INSTANCE = new DivActionTypedHandlerProxy();

    private DivActionTypedHandlerProxy() {
    }

    public static final boolean handleAction(@NotNull j1 action, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver) {
        return INSTANCE.handleAction(action.f88312h, action.f88314j, view, resolver, action.f88305a);
    }

    public static final boolean handleVisibilityAction(@NotNull dp action, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver) {
        return INSTANCE.handleAction(action.e(), action.d(), view, resolver, action.a());
    }

    private final boolean handleAction(String scopeId, m5 action, DivViewFacade view, ExpressionResolver resolver, xa downloadCallbacks) {
        if (action == null) {
            return false;
        }
        if (!(view instanceof Div2View)) {
            Assert.fail("Div2View should be used!");
            return false;
        }
        if (action instanceof m5.k) {
            return DivDownloadActionHandler.INSTANCE.handleAction(((m5.k) action).c(), downloadCallbacks, (Div2View) view, resolver);
        }
        Div2View div2View = (Div2View) view;
        return div2View.getDiv2Component().getActionTypedHandlerCombiner().handleAction(scopeId, action, div2View, resolver);
    }
}

package com.yandex.div.core.expression;

import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.triggers.TriggersController;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u0011J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/expression/ExpressionsRuntime;", "", "expressionResolver", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "triggersController", "Lcom/yandex/div/core/expression/triggers/TriggersController;", "(Lcom/yandex/div/core/expression/ExpressionResolverImpl;Lcom/yandex/div/core/expression/triggers/TriggersController;)V", "getExpressionResolver", "()Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "getTriggersController", "()Lcom/yandex/div/core/expression/triggers/TriggersController;", "unsubscribed", "", "cleanup", "", "divView", "Lcom/yandex/div/core/DivViewFacade;", "cleanup$div_release", "clearBinding", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onAttachedToWindow", "onDetachedFromWindow", "updateSubscriptions", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExpressionsRuntime {

    @NotNull
    private final ExpressionResolverImpl expressionResolver;

    @Nullable
    private final TriggersController triggersController;
    private boolean unsubscribed = true;

    public ExpressionsRuntime(@NotNull ExpressionResolverImpl expressionResolverImpl, @Nullable TriggersController triggersController) {
        this.expressionResolver = expressionResolverImpl;
        this.triggersController = triggersController;
    }

    public final void cleanup$div_release(@Nullable DivViewFacade divView) {
        if (this.unsubscribed) {
            return;
        }
        this.unsubscribed = true;
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.clearBinding(divView);
        }
        this.expressionResolver.getVariableController().cleanupSubscriptions();
    }

    public final void clearBinding(@NotNull DivViewFacade view) {
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.clearBinding(view);
        }
    }

    @NotNull
    public final ExpressionResolverImpl getExpressionResolver() {
        return this.expressionResolver;
    }

    @Nullable
    public final TriggersController getTriggersController() {
        return this.triggersController;
    }

    public final void onAttachedToWindow(@NotNull DivViewFacade view) {
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.onAttachedToWindow(view);
        }
    }

    public final void onDetachedFromWindow(@NotNull DivViewFacade view) {
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.onDetachedFromWindow(view);
        }
    }

    public final void updateSubscriptions() {
        if (this.unsubscribed) {
            this.unsubscribed = false;
            this.expressionResolver.subscribeOnVariables$div_release();
        }
    }
}

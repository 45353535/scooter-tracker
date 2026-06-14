package com.yandex.div.core;

import android.net.Uri;
import android.view.KeyEvent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.actions.DivActionTypedHandlerProxy;
import com.yandex.div.core.downloader.DivDownloadActionHandler;
import com.yandex.div.core.expression.storedvalues.StoredValuesActionHandler;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.PathFormatException;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewLocator;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.items.DivItemChangeActionHandler;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.dp;
import k8.j1;

/* JADX INFO: loaded from: classes11.dex */
public class DivActionHandler {
    @Nullable
    private static ExpressionResolver findExpressionResolverById(Div2View div2View, @Nullable String str) {
        BindingContext bindingContext;
        if (str == null) {
            return null;
        }
        KeyEvent.Callback callbackFindSingleViewWithTag = ViewLocator.findSingleViewWithTag(div2View, str);
        if (!(callbackFindSingleViewWithTag instanceof DivHolderView) || (bindingContext = ((DivHolderView) callbackFindSingleViewWithTag).getBindingContext()) == null) {
            return null;
        }
        return bindingContext.getExpressionResolver();
    }

    private boolean handleActionInternal(@Nullable String str, @Nullable Uri uri, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        Div2View div2View;
        String authority = uri.getAuthority();
        if ("set_state".equals(authority)) {
            String queryParameter = uri.getQueryParameter("state_id");
            if (queryParameter == null) {
                Assert.fail("state_id param is required");
                return false;
            }
            try {
                divViewFacade.switchToState(DivStatePath.parse(queryParameter), uri.getBooleanQueryParameter("temporary", true));
                return true;
            } catch (PathFormatException e10) {
                Assert.fail("Invalid format of " + queryParameter, e10);
                return false;
            }
        }
        if ("show_tooltip".equals(authority)) {
            String queryParameter2 = uri.getQueryParameter("id");
            if (queryParameter2 == null) {
                Assert.fail("id param is required");
                return false;
            }
            divViewFacade.showTooltip(queryParameter2, uri.getBooleanQueryParameter("multiple", false));
            return true;
        }
        if ("hide_tooltip".equals(authority)) {
            String queryParameter3 = uri.getQueryParameter("id");
            if (queryParameter3 == null) {
                Assert.fail("id param is required");
                return false;
            }
            divViewFacade.hideTooltip(queryParameter3);
            return true;
        }
        if ("set_variable".equals(authority)) {
            String queryParameter4 = uri.getQueryParameter("name");
            if (queryParameter4 == null) {
                Assert.fail("name param is required");
                return false;
            }
            String queryParameter5 = uri.getQueryParameter("value");
            if (queryParameter5 == null) {
                Assert.fail("value param unspecified for " + queryParameter4);
                return false;
            }
            div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            if (div2View == null) {
                Assert.fail("Variable '" + queryParameter4 + "' mutation failed! View(" + divViewFacade.getClass().getSimpleName() + ") not supports variables!");
                return false;
            }
            try {
                VariableMutationHandler.setVariable(div2View, queryParameter4, queryParameter5, expressionResolver);
                return true;
            } catch (VariableMutationException e11) {
                Assert.fail("Variable '" + queryParameter4 + "' mutation failed: " + e11.getMessage(), e11);
                return false;
            }
        }
        if (!"timer".equals(authority)) {
            if (!"video".equals(authority)) {
                if (DivItemChangeActionHandler.canHandle(authority)) {
                    return DivItemChangeActionHandler.handleAction(uri, divViewFacade, expressionResolver);
                }
                if (StoredValuesActionHandler.canHandle(authority)) {
                    return StoredValuesActionHandler.handleAction(uri, divViewFacade);
                }
                return false;
            }
            div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            if (div2View == null) {
                Assert.fail("Handler view is not instance of Div2View");
                return false;
            }
            String queryParameter6 = uri.getQueryParameter("id");
            if (queryParameter6 == null) {
                Assert.fail("Video action has no id param");
                return false;
            }
            String queryParameter7 = uri.getQueryParameter("action");
            if (queryParameter7 != null) {
                return div2View.applyVideoCommand(queryParameter6, queryParameter7, expressionResolver);
            }
            Assert.fail("Video action has no action param");
            return false;
        }
        String queryParameter8 = uri.getQueryParameter("id");
        if (queryParameter8 == null) {
            Assert.fail("id param is required");
            return false;
        }
        String queryParameter9 = uri.getQueryParameter("action");
        if (queryParameter9 == null) {
            Assert.fail("action param is required");
            return false;
        }
        div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
        if (div2View != null) {
            div2View.applyTimerCommand(queryParameter8, queryParameter9);
            return true;
        }
        Assert.fail("Timer '" + queryParameter8 + "' state changing failed! View(" + divViewFacade.getClass().getSimpleName() + ") not supports timers!");
        return false;
    }

    public boolean getUseActionUid() {
        return false;
    }

    @CallSuper
    public boolean handleAction(@NonNull j1 j1Var, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        Div2View div2View = (Div2View) divViewFacade;
        ExpressionResolver expressionResolverFindExpressionResolverById = findExpressionResolverById(div2View, j1Var.f88312h);
        if (expressionResolverFindExpressionResolverById == null) {
            expressionResolverFindExpressionResolverById = expressionResolver;
        }
        if (DivActionTypedHandlerProxy.handleAction(j1Var, divViewFacade, expressionResolverFindExpressionResolverById)) {
            return true;
        }
        Expression expression = j1Var.f88315k;
        Uri uri = expression != null ? (Uri) expression.evaluate(expressionResolver) : null;
        return DivDownloadActionHandler.canHandle(uri, divViewFacade) ? DivDownloadActionHandler.handleAction(j1Var, div2View, expressionResolverFindExpressionResolverById) : handleAction(j1Var.f88312h, uri, divViewFacade, expressionResolverFindExpressionResolverById);
    }

    @CallSuper
    public boolean handleActionWithReason(@NonNull j1 j1Var, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str) {
        return handleAction(j1Var, divViewFacade, expressionResolver);
    }

    @CallSuper
    public boolean handleActionWithReason(@NonNull j1 j1Var, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str, @NonNull String str2) {
        return handleAction(j1Var, divViewFacade, expressionResolver, str);
    }

    @CallSuper
    public boolean handleAction(@NonNull j1 j1Var, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str) {
        return handleAction(j1Var, divViewFacade, expressionResolver);
    }

    @CallSuper
    public boolean handleAction(@NonNull dp dpVar, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        Div2View div2View = (Div2View) divViewFacade;
        ExpressionResolver expressionResolverFindExpressionResolverById = findExpressionResolverById(div2View, dpVar.e());
        if (expressionResolverFindExpressionResolverById == null) {
            expressionResolverFindExpressionResolverById = expressionResolver;
        }
        if (DivActionTypedHandlerProxy.handleVisibilityAction(dpVar, divViewFacade, expressionResolverFindExpressionResolverById)) {
            return true;
        }
        Uri uri = dpVar.getUrl() != null ? (Uri) dpVar.getUrl().evaluate(expressionResolver) : null;
        if (DivDownloadActionHandler.canHandle(uri, divViewFacade)) {
            return DivDownloadActionHandler.handleVisibilityAction(dpVar, div2View, expressionResolverFindExpressionResolverById);
        }
        return handleAction(dpVar.e(), uri, divViewFacade, expressionResolver);
    }

    @CallSuper
    public boolean handleAction(@NonNull dp dpVar, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str) {
        return handleAction(dpVar, divViewFacade, expressionResolver);
    }

    private boolean handleAction(@Nullable String str, @Nullable Uri uri, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        if (uri != null && "div-action".equals(uri.getScheme())) {
            return handleActionInternal(str, uri, divViewFacade, expressionResolver);
        }
        return false;
    }
}

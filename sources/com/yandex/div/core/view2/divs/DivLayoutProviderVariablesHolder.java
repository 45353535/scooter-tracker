package com.yandex.div.core.view2.divs;

import com.android.billingclient.api.BillingClient;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import k8.ea;
import k8.ep;
import k8.f7;
import k8.xc;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u001d\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivLayoutProviderVariablesHolder;", "Lcom/yandex/div/internal/core/DivTreeVisitor;", "", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "<init>", "()V", "Lk8/f7;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "observeSize", "(Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/ep;", "observe", "(Lk8/ep;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "variable", "", "contains", "(Ljava/lang/String;)Z", "clear", "Lk8/ea;", "data", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "observeDivData", "(Lk8/ea;Lcom/yandex/div/core/view2/BindingContext;)V", "Lk8/y0;", "Lcom/yandex/div/core/state/DivStatePath;", "path", "defaultVisit", "(Lk8/y0;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "", "changedVariables", "Ljava/util/List;", "Lcom/yandex/div/core/Disposable;", BillingClient.FeatureType.SUBSCRIPTIONS, "getSubscriptions", "()Ljava/util/List;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivLayoutProviderVariablesHolder extends DivTreeVisitor<Unit> implements ExpressionSubscriber {

    @NotNull
    private final List<String> changedVariables;

    @NotNull
    private final List<Disposable> subscriptions;

    public DivLayoutProviderVariablesHolder() {
        super(null, 1, 0 == true ? 1 : 0);
        this.changedVariables = new ArrayList();
        this.subscriptions = new ArrayList();
    }

    private final void observe(ep epVar, final ExpressionResolver expressionResolver) {
        Object objB = epVar.b();
        xc xcVar = objB instanceof xc ? (xc) objB : null;
        if (xcVar == null) {
            return;
        }
        Expression expression = xcVar.f92339b;
        final Expression.MutableExpression mutableExpression = expression instanceof Expression.MutableExpression ? (Expression.MutableExpression) expression : null;
        if (mutableExpression == null) {
            return;
        }
        addSubscription(mutableExpression.observe(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder.observe.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j10) {
                DivLayoutProviderVariablesHolder.this.changedVariables.addAll(mutableExpression.getVariablesName(expressionResolver));
            }
        }));
    }

    private final void observeSize(f7 f7Var, ExpressionResolver expressionResolver) {
        observe(f7Var.getWidth(), expressionResolver);
        observe(f7Var.getHeight(), expressionResolver);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void addSubscription(Disposable disposable) {
        y7.a.a(this, disposable);
    }

    public final void clear() {
        this.changedVariables.clear();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void closeAllSubscription() {
        y7.a.b(this);
    }

    public final boolean contains(@NotNull String variable) {
        return this.changedVariables.contains(variable);
    }

    @Override // com.yandex.div.internal.core.DivTreeVisitor
    public /* bridge */ /* synthetic */ Unit defaultVisit(y0 y0Var, BindingContext bindingContext, DivStatePath divStatePath) {
        defaultVisit2(y0Var, bindingContext, divStatePath);
        return Unit.f93236a;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final void observeDivData(@NotNull ea data, @NotNull BindingContext context) {
        for (ea.c cVar : data.f87205c) {
            visit(cVar.f87215a, context, DivStatePath.INSTANCE.fromState$div_release(cVar));
        }
    }

    @Override // com.yandex.div.core.view2.Releasable
    public /* synthetic */ void release() {
        y7.a.c(this);
    }

    /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
    protected void defaultVisit2(@NotNull y0 data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        observeSize(data.c(), context.getExpressionResolver());
    }
}

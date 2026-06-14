package com.yandex.div.core.view2.divs;

import com.yandex.div.core.expression.variables.TwoWayBooleanVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import k8.tr;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J+\u0010\u001a\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001c\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivSwitchBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$p;", "Lk8/tr;", "Lcom/yandex/div/core/view2/divs/widgets/DivSwitchView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/expression/variables/TwoWayBooleanVariableBinder;", "variableBinder", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/expression/variables/TwoWayBooleanVariableBinder;)V", "div", "oldDiv", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "bindIsEnabled", "(Lcom/yandex/div/core/view2/divs/widgets/DivSwitchView;Lk8/tr;Lk8/tr;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "applyIsEnabled", "(Lcom/yandex/div/core/view2/divs/widgets/DivSwitchView;Lk8/tr;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "bindOnColor", "applyOnColor", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lcom/yandex/div/core/state/DivStatePath;", "path", "observeVariable", "(Lcom/yandex/div/core/view2/divs/widgets/DivSwitchView;Lk8/tr;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivSwitchView;Lcom/yandex/div/core/view2/BindingContext;Lk8/tr;Lk8/tr;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/expression/variables/TwoWayBooleanVariableBinder;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivSwitchBinder extends DivViewBinder<y0.p, tr, DivSwitchView> {

    @NotNull
    private final TwoWayBooleanVariableBinder variableBinder;

    public DivSwitchBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull TwoWayBooleanVariableBinder twoWayBooleanVariableBinder) {
        super(divBaseBinder);
        this.variableBinder = twoWayBooleanVariableBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyIsEnabled(DivSwitchView divSwitchView, tr trVar, ExpressionResolver expressionResolver) {
        divSwitchView.setEnabled(((Boolean) trVar.f91487o.evaluate(expressionResolver)).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyOnColor(DivSwitchView divSwitchView, tr trVar, ExpressionResolver expressionResolver) {
        Expression expression = trVar.f91491s;
        divSwitchView.setColorOn(expression != null ? (Integer) expression.evaluate(expressionResolver) : null);
    }

    private final void bindIsEnabled(final DivSwitchView divSwitchView, final tr trVar, tr trVar2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(trVar.f91487o, trVar2 != null ? trVar2.f91487o : null)) {
            return;
        }
        applyIsEnabled(divSwitchView, trVar, expressionResolver);
        if (ExpressionsKt.isConstant(trVar.f91487o)) {
            return;
        }
        divSwitchView.addSubscription(trVar.f91487o.observe(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$bindIsEnabled$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                this.this$0.applyIsEnabled(divSwitchView, trVar, expressionResolver);
            }
        }));
    }

    private final void bindOnColor(final DivSwitchView divSwitchView, final tr trVar, tr trVar2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(trVar.f91491s, trVar2 != null ? trVar2.f91491s : null)) {
            return;
        }
        applyOnColor(divSwitchView, trVar, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(trVar.f91491s)) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$bindOnColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                this.this$0.applyOnColor(divSwitchView, trVar, expressionResolver);
            }
        };
        Expression expression = trVar.f91491s;
        divSwitchView.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
    }

    private final void observeVariable(final DivSwitchView divSwitchView, tr trVar, BindingContext bindingContext, DivStatePath divStatePath) {
        divSwitchView.addSubscription(this.variableBinder.bindVariable(bindingContext, trVar.f91488p, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$observeVariable$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull Function1<? super Boolean, Unit> valueUpdater) {
                divSwitchView.setOnCheckedChangeListener(valueUpdater);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Boolean value) {
                if (value != null) {
                    divSwitchView.setChecked(value.booleanValue());
                }
            }
        }, divStatePath));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivSwitchView divSwitchView, @NotNull BindingContext bindingContext, @NotNull tr trVar, @Nullable tr trVar2, @NotNull DivStatePath divStatePath) {
        bindIsEnabled(divSwitchView, trVar, trVar2, bindingContext.getExpressionResolver());
        bindOnColor(divSwitchView, trVar, trVar2, bindingContext.getExpressionResolver());
        observeVariable(divSwitchView, trVar, bindingContext, divStatePath);
    }
}

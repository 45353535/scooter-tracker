package com.yandex.div.core.view2.divs;

import com.yandex.div.R$dimen;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import k8.go;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e*\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\u000e*\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0018\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivSeparatorBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$m;", "Lk8/go;", "Lcom/yandex/div/core/view2/divs/widgets/DivSeparatorView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;)V", "Lk8/go$c;", "newStyle", "oldStyle", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "bindStyle", "(Lcom/yandex/div/core/view2/divs/widgets/DivSeparatorView;Lk8/go$c;Lk8/go$c;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "style", "applyStyle", "(Lcom/yandex/div/core/view2/divs/widgets/DivSeparatorView;Lk8/go$c;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "div", "oldDiv", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivSeparatorView;Lcom/yandex/div/core/view2/BindingContext;Lk8/go;Lk8/go;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivSeparatorBinder extends DivViewBinder<y0.m, go, DivSeparatorView> {
    public DivSeparatorBinder(@NotNull DivBaseBinder divBaseBinder) {
        super(divBaseBinder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(DivSeparatorView divSeparatorView, go.c cVar, ExpressionResolver expressionResolver) {
        if (cVar == null) {
            divSeparatorView.setDividerColor(335544320);
            divSeparatorView.setHorizontal(true);
        } else {
            divSeparatorView.setDividerColor(((Number) cVar.f87878a.evaluate(expressionResolver)).intValue());
            divSeparatorView.setHorizontal(((go.c.EnumC1040c) cVar.f87879b.evaluate(expressionResolver)) == go.c.EnumC1040c.HORIZONTAL);
        }
    }

    private final void bindStyle(final DivSeparatorView divSeparatorView, final go.c cVar, go.c cVar2, final ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Disposable disposableObserve = null;
        if (ExpressionsKt.equalsToConstant(cVar != null ? cVar.f87878a : null, cVar2 != null ? cVar2.f87878a : null)) {
            if (ExpressionsKt.equalsToConstant(cVar != null ? cVar.f87879b : null, cVar2 != null ? cVar2.f87879b : null)) {
                return;
            }
        }
        applyStyle(divSeparatorView, cVar, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(cVar != null ? cVar.f87878a : null)) {
            if (ExpressionsKt.isConstantOrNull(cVar != null ? cVar.f87879b : null)) {
                return;
            }
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSeparatorBinder$bindStyle$callback$1
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
                this.this$0.applyStyle(divSeparatorView, cVar, expressionResolver);
            }
        };
        divSeparatorView.addSubscription((cVar == null || (expression2 = cVar.f87878a) == null) ? null : expression2.observe(expressionResolver, function1));
        if (cVar != null && (expression = cVar.f87879b) != null) {
            disposableObserve = expression.observe(expressionResolver, function1);
        }
        divSeparatorView.addSubscription(disposableObserve);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivSeparatorView divSeparatorView, @NotNull BindingContext bindingContext, @NotNull go goVar, @Nullable go goVar2) {
        BaseDivViewExtensionsKt.applyDivActions(divSeparatorView, bindingContext, goVar.f87848b, goVar.f87850d, goVar.f87870x, goVar.f87861o, goVar.f87867u, goVar.f87866t, goVar.B, goVar.A, goVar.f87849c, goVar.f87857k);
        bindStyle(divSeparatorView, goVar.f87859m, goVar2 != null ? goVar2.f87859m : null, bindingContext.getExpressionResolver());
        divSeparatorView.setDividerHeightResource(R$dimen.div_separator_delimiter_height);
        divSeparatorView.setDividerGravity(17);
    }
}

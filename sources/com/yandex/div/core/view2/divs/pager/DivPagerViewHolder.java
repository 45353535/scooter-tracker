package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import k8.f7;
import k8.jk;
import k8.y0;
import k8.y5;
import k8.z5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0017\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%¨\u0006'"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerViewHolder;", "Lcom/yandex/div/core/view2/divs/DivCollectionViewHolder;", "Lcom/yandex/div/core/view2/BindingContext;", "parentContext", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageLayout;", "pageLayout", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewCreator", "Lkotlin/Function0;", "", "isHorizontal", "Lk8/jk$c;", "crossAxisAlignment", "<init>", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/pager/DivPagerPageLayout;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/core/view2/DivViewCreator;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/yandex/div/internal/widget/DivLayoutParams;", "Lk8/f7;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "setCrossAxisAlignment", "(Lcom/yandex/div/internal/widget/DivLayoutParams;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "bindingContext", "Lk8/y0;", "", C4240b4.i.L, "Lcom/yandex/div/core/state/DivStatePath;", "path", "bind", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;ILcom/yandex/div/core/state/DivStatePath;)V", "logReuseError", "()V", "Lcom/yandex/div/core/view2/BindingContext;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageLayout;", "Lkotlin/jvm/functions/Function0;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivPagerViewHolder extends DivCollectionViewHolder {

    @NotNull
    private final Function0<jk.c> crossAxisAlignment;

    @NotNull
    private final Function0<Boolean> isHorizontal;

    @NotNull
    private final DivPagerPageLayout pageLayout;

    @NotNull
    private final BindingContext parentContext;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View$OnAttachStateChangeListener, com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1] */
    public DivPagerViewHolder(@NotNull BindingContext bindingContext, @NotNull DivPagerPageLayout divPagerPageLayout, @NotNull DivBinder divBinder, @NotNull DivViewCreator divViewCreator, @NotNull Function0<Boolean> function0, @NotNull Function0<? extends jk.c> function02) {
        super(divPagerPageLayout, bindingContext, divBinder, divViewCreator);
        this.parentContext = bindingContext;
        this.pageLayout = divPagerPageLayout;
        this.isHorizontal = function0;
        this.crossAxisAlignment = function02;
        View view = this.itemView;
        ?? r22 = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view2) {
                y0 oldDiv = this.this$0.getOldDiv();
                if (oldDiv == null) {
                    return;
                }
                this.this$0.parentContext.getDivView().getDiv2Component().getVisibilityActionTracker().startTrackingViewsHierarchy(this.this$0.parentContext, view2, oldDiv);
            }
        };
        view.addOnAttachStateChangeListener(r22);
        new DivPagerViewHolder$special$$inlined$doOnEveryDetach$2(view, r22);
    }

    private final void setCrossAxisAlignment(DivLayoutParams divLayoutParams, f7 f7Var, ExpressionResolver expressionResolver) {
        Enum enumInvoke;
        Expression expressionM = this.isHorizontal.invoke().booleanValue() ? f7Var.m() : f7Var.g();
        if (expressionM == null || (enumInvoke = (Enum) expressionM.evaluate(expressionResolver)) == null) {
            enumInvoke = this.crossAxisAlignment.invoke();
        }
        int i10 = 17;
        if (this.isHorizontal.invoke().booleanValue()) {
            if (enumInvoke != jk.c.CENTER && enumInvoke != z5.CENTER) {
                i10 = (enumInvoke == jk.c.END || enumInvoke == z5.BOTTOM) ? 80 : 48;
            }
        } else if (enumInvoke != jk.c.CENTER && enumInvoke != y5.CENTER) {
            i10 = (enumInvoke == jk.c.END || enumInvoke == y5.END) ? GravityCompat.END : enumInvoke == y5.LEFT ? 3 : enumInvoke == y5.RIGHT ? 5 : GravityCompat.START;
        }
        divLayoutParams.setGravity(i10);
        this.pageLayout.requestLayout();
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void bind(@NotNull BindingContext bindingContext, @NotNull y0 div, int position, @NotNull DivStatePath path) {
        super.bind(bindingContext, div, position, path);
        View child = this.pageLayout.getChild();
        ViewGroup.LayoutParams layoutParams = child != null ? child.getLayoutParams() : null;
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null) {
            setCrossAxisAlignment(divLayoutParams, div.c(), bindingContext.getExpressionResolver());
        }
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    protected void logReuseError() {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, "DivPagerViewHolder", "Pager holder reuse failed");
        }
    }
}

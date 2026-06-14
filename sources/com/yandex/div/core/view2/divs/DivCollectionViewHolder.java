package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4240b4;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.widget.DivViewWrapper;
import k8.y0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b \u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H$¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivCollectionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/yandex/div/core/widget/DivViewWrapper;", "viewWrapper", "Lcom/yandex/div/core/view2/BindingContext;", "parentContext", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewCreator", "<init>", "(Lcom/yandex/div/core/widget/DivViewWrapper;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/core/view2/DivViewCreator;)V", "bindingContext", "Lk8/y0;", "div", "Landroid/view/View;", "createChildView", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;)Landroid/view/View;", "", C4240b4.i.L, "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "bind", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;ILcom/yandex/div/core/state/DivStatePath;)V", "childView", "updateWrapperLayoutParams", "(Landroid/view/View;)V", "updateState", "()V", "logReuseError", "Lcom/yandex/div/core/widget/DivViewWrapper;", "Lcom/yandex/div/core/view2/BindingContext;", "Lcom/yandex/div/core/view2/DivBinder;", "Lcom/yandex/div/core/view2/DivViewCreator;", "oldDiv", "Lk8/y0;", "getOldDiv", "()Lk8/y0;", "setOldDiv", "(Lk8/y0;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivCollectionViewHolder extends RecyclerView.ViewHolder {

    @NotNull
    private final DivBinder divBinder;

    @Nullable
    private y0 oldDiv;

    @NotNull
    private final BindingContext parentContext;

    @NotNull
    private final DivViewCreator viewCreator;

    @NotNull
    private final DivViewWrapper viewWrapper;

    public DivCollectionViewHolder(@NotNull DivViewWrapper divViewWrapper, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder, @NotNull DivViewCreator divViewCreator) {
        super(divViewWrapper);
        this.viewWrapper = divViewWrapper;
        this.parentContext = bindingContext;
        this.divBinder = divBinder;
        this.viewCreator = divViewCreator;
    }

    private final View createChildView(BindingContext bindingContext, y0 div) {
        if (this.oldDiv != null) {
            logReuseError();
        }
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this.viewWrapper, bindingContext.getDivView());
        return this.viewCreator.create(div, bindingContext.getExpressionResolver());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void bind(@org.jetbrains.annotations.NotNull com.yandex.div.core.view2.BindingContext r12, @org.jetbrains.annotations.NotNull k8.y0 r13, int r14, @org.jetbrains.annotations.NotNull com.yandex.div.core.state.DivStatePath r15) {
        /*
            r11 = this;
            com.yandex.div.core.view2.Div2View r1 = r12.getDivView()
            com.yandex.div.json.expressions.ExpressionResolver r4 = r12.getExpressionResolver()
            com.yandex.div.core.widget.DivViewWrapper r14 = r11.viewWrapper
            boolean r14 = com.yandex.div.core.view2.reuse.util.RebindUtilsKt.tryRebindRecycleContainerChildren(r14, r1, r13)
            if (r14 == 0) goto L13
            r11.oldDiv = r13
            return
        L13:
            com.yandex.div.core.widget.DivViewWrapper r14 = r11.viewWrapper
            android.view.View r14 = r14.getChild()
            if (r14 == 0) goto L54
            k8.y0 r0 = r11.oldDiv
            r10 = 0
            if (r0 == 0) goto L21
            goto L22
        L21:
            r14 = r10
        L22:
            if (r14 == 0) goto L54
            boolean r0 = r14 instanceof com.yandex.div.core.view2.divs.widgets.DivHolderView
            if (r0 == 0) goto L2c
            r0 = r14
            com.yandex.div.core.view2.divs.widgets.DivHolderView r0 = (com.yandex.div.core.view2.divs.widgets.DivHolderView) r0
            goto L2d
        L2c:
            r0 = r10
        L2d:
            if (r0 == 0) goto L50
            com.yandex.div.core.view2.BindingContext r0 = r0.getBindingContext()
            if (r0 == 0) goto L50
            com.yandex.div.json.expressions.ExpressionResolver r5 = r0.getExpressionResolver()
            if (r5 == 0) goto L50
            com.yandex.div.core.view2.animations.DivComparator r2 = com.yandex.div.core.view2.animations.DivComparator.INSTANCE
            k8.y0 r3 = r11.oldDiv
            r8 = 16
            r9 = 0
            r7 = 0
            r6 = r4
            r4 = r13
            boolean r13 = com.yandex.div.core.view2.animations.DivComparator.areDivsReplaceable$default(r2, r3, r4, r5, r6, r7, r8, r9)
            r3 = r4
            r4 = r6
            r0 = 1
            if (r13 != r0) goto L51
            r10 = r14
            goto L51
        L50:
            r3 = r13
        L51:
            if (r10 == 0) goto L55
            goto L5e
        L54:
            r3 = r13
        L55:
            android.view.View r10 = r11.createChildView(r12, r3)
            com.yandex.div.core.widget.DivViewWrapper r13 = r11.viewWrapper
            r13.addView(r10)
        L5e:
            r11.oldDiv = r3
            com.yandex.div.core.expression.local.RuntimeStore r0 = r1.getRuntimeStore()
            com.yandex.div.core.view2.BindingContext r13 = r11.parentContext
            com.yandex.div.json.expressions.ExpressionResolver r5 = r13.getExpressionResolver()
            r2 = r15
            r0.resolveRuntimeWith(r1, r2, r3, r4, r5)
            com.yandex.div.core.view2.DivBinder r13 = r11.divBinder
            r13.bind(r12, r10, r3, r2)
            r11.updateWrapperLayoutParams(r10)
            com.yandex.div.core.expression.local.RuntimeStore r12 = r1.getRuntimeStore()
            k8.f7 r13 = r3.c()
            r12.showWarningIfNeeded(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivCollectionViewHolder.bind(com.yandex.div.core.view2.BindingContext, k8.y0, int, com.yandex.div.core.state.DivStatePath):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final y0 getOldDiv() {
        return this.oldDiv;
    }

    protected abstract void logReuseError();

    public final void updateState() {
        BindingContext bindingContext;
        View child = this.viewWrapper.getChild();
        if (child == null || (bindingContext = BaseDivViewExtensionsKt.getBindingContext(child)) == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindStates(child, bindingContext, this.divBinder);
    }

    protected void updateWrapperLayoutParams(@NotNull View childView) {
    }
}

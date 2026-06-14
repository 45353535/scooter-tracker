package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import k8.f7;
import k8.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0011\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0012¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00102\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001aJ\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0017\u0010\u001cJ\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0011¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "Lcom/yandex/div/core/view2/divs/widgets/DivViewVisitor;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "divCustomContainerViewAdapter", "Lcom/yandex/div/core/extension/DivExtensionController;", "divExtensionController", "<init>", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/DivCustomContainerViewAdapter;Lcom/yandex/div/core/extension/DivExtensionController;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lk8/f7;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "releaseInternal", "(Landroid/view/View;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "defaultVisit", "(Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "visit", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "(Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivCustomWrapper;", "(Lcom/yandex/div/core/view2/divs/widgets/DivCustomWrapper;)V", "(Landroid/view/View;)V", "release$div_release", "release", "Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "Lcom/yandex/div/core/extension/DivExtensionController;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ReleaseViewVisitor extends DivViewVisitor {

    @NotNull
    private final DivCustomContainerViewAdapter divCustomContainerViewAdapter;

    @NotNull
    private final DivExtensionController divExtensionController;

    @NotNull
    private final Div2View divView;

    public ReleaseViewVisitor(@NotNull Div2View div2View, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController divExtensionController) {
        this.divView = div2View;
        this.divCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.divExtensionController = divExtensionController;
    }

    private void releaseInternal(View view, f7 div, ExpressionResolver resolver) {
        if (div != null && resolver != null) {
            this.divExtensionController.unbindView(this.divView, resolver, view, div);
        }
        release$div_release(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void defaultVisit(@NotNull DivHolderView<?> view) {
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) view;
        y0 div = view.getDiv();
        f7 f7VarC = div != null ? div.c() : null;
        BindingContext bindingContext = view.getBindingContext();
        releaseInternal(view2, f7VarC, bindingContext != null ? bindingContext.getExpressionResolver() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting(otherwise = 2)
    public void release$div_release(@NotNull View view) {
        if (view instanceof Releasable) {
            ((Releasable) view).release();
        }
        Iterable<Releasable> releasableList = ReleasablesKt.getReleasableList(view);
        if (releasableList != null) {
            Iterator<Releasable> it = releasableList.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivPagerView view) {
        super.visit(view);
        view.getViewPager().setAdapter(null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivRecyclerView view) {
        super.visit(view);
        view.setAdapter(null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivCustomWrapper view) {
        BindingContext bindingContext;
        ExpressionResolver expressionResolver;
        y0.d div = view.getDiv();
        if (div == null || (bindingContext = view.getBindingContext()) == null || (expressionResolver = bindingContext.getExpressionResolver()) == null) {
            return;
        }
        release$div_release(view);
        View customView = view.getCustomView();
        if (customView != null) {
            this.divExtensionController.unbindView(this.divView, expressionResolver, customView, div.d());
            this.divCustomContainerViewAdapter.release(customView, div.d());
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull View view) {
        release$div_release(view);
    }
}

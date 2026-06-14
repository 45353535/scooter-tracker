package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.x9;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B/\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ]\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010#\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b\u001b\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,¨\u0006-"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivCustomBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$d;", "Lk8/x9;", "Lcom/yandex/div/core/view2/divs/widgets/DivCustomWrapper;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "divCustomContainerViewAdapter", "Lcom/yandex/div/core/extension/DivExtensionController;", "extensionController", "Lkf/a;", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/DivCustomContainerViewAdapter;Lcom/yandex/div/core/extension/DivExtensionController;Lkf/a;)V", "previousWrapper", "Landroid/view/View;", "oldCustomView", "oldDiv", "div", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lkotlin/Function0;", "createView", "Lkotlin/Function1;", "", "bindView", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivCustomWrapper;Landroid/view/View;Lk8/x9;Lk8/x9;Lcom/yandex/div/core/view2/BindingContext;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "newCustomView", "Lcom/yandex/div/core/view2/Div2View;", "divView", "replaceInParent", "(Landroid/view/ViewGroup;Landroid/view/View;Lcom/yandex/div/core/view2/Div2View;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/state/DivStatePath;", "path", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivCustomWrapper;Lk8/y0$d;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "Lcom/yandex/div/core/extension/DivExtensionController;", "Lkf/a;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivCustomBinder extends DivViewBinder<y0.d, x9, DivCustomWrapper> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final kf.a divBinder;

    @NotNull
    private final DivCustomContainerViewAdapter divCustomContainerViewAdapter;

    @NotNull
    private final DivExtensionController extensionController;

    public DivCustomBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController divExtensionController, @NotNull kf.a aVar) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.divCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.divBinder = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bind(com.yandex.div.core.view2.divs.widgets.DivCustomWrapper r3, android.view.View r4, k8.x9 r5, k8.x9 r6, com.yandex.div.core.view2.BindingContext r7, kotlin.jvm.functions.Function0<? extends android.view.View> r8, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r9) {
        /*
            r2 = this;
            if (r4 == 0) goto L32
            k8.y0$d r0 = r3.getDiv()
            if (r0 == 0) goto L11
            k8.x9 r0 = r0.d()
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.f92311j
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.String r1 = r6.f92311j
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L32
            if (r5 == 0) goto L32
            java.util.List r5 = com.yandex.div.internal.core.DivCollectionExtensionsKt.getNonNullItems(r5)
            if (r5 == 0) goto L32
            int r5 = r5.size()
            java.util.List r0 = com.yandex.div.internal.core.DivCollectionExtensionsKt.getNonNullItems(r6)
            int r0 = r0.size()
            if (r5 != r0) goto L32
            r5 = r4
            goto L3d
        L32:
            java.lang.Object r5 = r8.invoke()
            android.view.View r5 = (android.view.View) r5
            int r8 = com.yandex.div.R$id.div_custom_tag
            r5.setTag(r8, r6)
        L3d:
            com.yandex.div.core.view2.Div2View r8 = r7.getDivView()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L4a
            r2.replaceInParent(r3, r5, r8)
        L4a:
            r9.invoke(r5)
            com.yandex.div.core.view2.divs.DivBaseBinder r3 = r2.baseBinder
            java.lang.String r4 = r6.getId()
            r3.bindId$div_release(r8, r5, r4)
            com.yandex.div.core.extension.DivExtensionController r3 = r2.extensionController
            com.yandex.div.json.expressions.ExpressionResolver r4 = r7.getExpressionResolver()
            r3.bindView(r8, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivCustomBinder.bind(com.yandex.div.core.view2.divs.widgets.DivCustomWrapper, android.view.View, k8.x9, k8.x9, com.yandex.div.core.view2.BindingContext, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    private final void replaceInParent(ViewGroup parent, View newCustomView, Div2View divView) {
        if (parent.getChildCount() != 0) {
            DivViewVisitorKt.visitViewTree(divView.getReleaseViewVisitor$div_release(), ViewGroupKt.get(parent, 0));
            parent.removeViewAt(0);
        }
        parent.addView(newCustomView);
    }

    public void bindView(@NotNull BindingContext context, @NotNull DivCustomWrapper view, @NotNull y0.d div, @NotNull final DivStatePath path) {
        BindingContext bindingContext;
        ExpressionResolver expressionResolver;
        View customView = view.getCustomView();
        y0.d div2 = view.getDiv();
        final Div2View divView = context.getDivView();
        final ExpressionResolver expressionResolver2 = context.getExpressionResolver();
        if (div2 == div) {
            BaseDivViewExtensionsKt.bindStates(view, context, (DivBinder) this.divBinder.get());
            return;
        }
        if (customView != null && div2 != null && (bindingContext = view.getBindingContext()) != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
            this.extensionController.unbindView(divView, expressionResolver, customView, div2.c());
        }
        this.baseBinder.bindView(context, view, div, div2);
        this.baseBinder.bindId$div_release(divView, view, null);
        final x9 x9VarD = div.d();
        if (this.divCustomContainerViewAdapter.isCustomTypeSupported(x9VarD.f92311j)) {
            bind(view, customView, div2 != null ? div2.d() : null, x9VarD, context, new Function0<View>() { // from class: com.yandex.div.core.view2.divs.DivCustomBinder.bindView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final View invoke() {
                    return DivCustomBinder.this.divCustomContainerViewAdapter.createView(x9VarD, divView, expressionResolver2, path);
                }
            }, new Function1<View, Unit>() { // from class: com.yandex.div.core.view2.divs.DivCustomBinder.bindView.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                    invoke2(view2);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull View view2) {
                    DivCustomBinder.this.divCustomContainerViewAdapter.bindView(view2, x9VarD, divView, expressionResolver2, path);
                }
            });
        }
    }
}

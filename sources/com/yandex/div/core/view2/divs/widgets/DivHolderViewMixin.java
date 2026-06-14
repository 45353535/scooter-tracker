package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import androidx.compose.material.OutlinedTextFieldKt;
import com.android.billingclient.api.BillingClient;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.internal.widget.TransientViewMixin;
import java.util.ArrayList;
import java.util.List;
import k8.l7;
import k8.y0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p7.b;
import y7.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\u0007J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0007J*\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00018\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00104\u001a\u00020/8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00105\u001a\u00020/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00101¨\u00066"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivHolderViewMixin;", "Lk8/y0;", "T", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/widget/TransientView;", "<init>", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "", "invalidateBorder", "", "width", "height", "onBoundsChanged", "(II)V", "releaseBorderDrawer", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "setBorder", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "div", "Lk8/y0;", "getDiv", "()Lk8/y0;", "setDiv", "(Lk8/y0;)V", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "", "Lcom/yandex/div/core/Disposable;", BillingClient.FeatureType.SUBSCRIPTIONS, "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "", "getNeedClipping", "()Z", "setNeedClipping", "(Z)V", "needClipping", "isTransient", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivHolderViewMixin<T extends y0> implements DivHolderView<T>, DivBorderSupports, TransientView {

    @Nullable
    private BindingContext bindingContext;

    @Nullable
    private T div;
    private final /* synthetic */ DivBorderSupportsMixin $$delegate_0 = new DivBorderSupportsMixin();
    private final /* synthetic */ TransientViewMixin $$delegate_1 = new TransientViewMixin();

    @NotNull
    private final List<Disposable> subscriptions = new ArrayList();

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void addSubscription(Disposable disposable) {
        a.a(this, disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void closeAllSubscription() {
        a.b(this);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.bindingContext;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public T getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* JADX INFO: renamed from: getDivBorderDrawer */
    public DivBorderDrawer getBorderDrawer() {
        return this.$$delegate_0.getBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_1.isTransient();
    }

    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.a(width, height);
    }

    @Override // com.yandex.div.core.view2.Releasable
    public /* synthetic */ void release() {
        b.a(this);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable l7 border, @NotNull View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable T t10) {
        this.div = t10;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_1.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_1.transitionStarted(view);
    }
}

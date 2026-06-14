package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.material.OutlinedTextFieldKt;
import com.android.billingclient.api.BillingClient;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.indicator.PagerIndicatorView;
import java.util.List;
import k8.l7;
import k8.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0012J \u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0012J*\u0010#\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b'\u0010&J/\u0010,\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0014¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010:\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010<\u001a\u00020;8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001c\u0010A\u001a\u00020;8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b>\u0010=\"\u0004\b?\u0010@R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\f0B8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "Lcom/yandex/div/internal/widget/indicator/PagerIndicatorView;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lk8/y0$i;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/div/core/Disposable;", "subscription", "", "addSubscription", "(Lcom/yandex/div/core/Disposable;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "release", "releaseBorderDrawer", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "setBorder", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "getDiv", "()Lk8/y0$i;", "setDiv", "(Lk8/y0$i;)V", "div", "", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "", "getSubscriptions", "()Ljava/util/List;", BillingClient.FeatureType.SUBSCRIPTIONS, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivPagerIndicatorView extends PagerIndicatorView implements DivHolderView<y0.i> {
    private final /* synthetic */ DivHolderViewMixin<y0.i> $$delegate_0;

    public /* synthetic */ DivPagerIndicatorView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public y0.i getDiv() {
        return (y0.i) this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.onBoundsChanged(width, height);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        onBoundsChanged(w10, h10);
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable l7 border, @NotNull View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable y0.i iVar) {
        this.$$delegate_0.setDiv(iVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivPagerIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
    }
}

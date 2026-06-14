package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.compose.material.OutlinedTextFieldKt;
import com.android.billingclient.api.BillingClient;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.SelectView;
import java.util.List;
import k8.l7;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ \u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ*\u0010!\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J/\u0010,\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0014H\u0014¢\u0006\u0004\b,\u0010-R0\u00100\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000b\u0018\u00010.8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010>\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020?8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001c\u0010E\u001a\u00020?8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bB\u0010A\"\u0004\bC\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0F8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivSelectView;", "Lcom/yandex/div/internal/widget/SelectView;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lk8/y0$l;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/div/core/Disposable;", "subscription", "", "addSubscription", "(Lcom/yandex/div/core/Disposable;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "", "width", "height", "onBoundsChanged", "(II)V", "release", "releaseBorderDrawer", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "setBorder", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "oldWidth", "oldHeight", "onSizeChanged", "(IIII)V", "Lkotlin/Function1;", "", "valueUpdater", "Lkotlin/jvm/functions/Function1;", "getValueUpdater", "()Lkotlin/jvm/functions/Function1;", "setValueUpdater", "(Lkotlin/jvm/functions/Function1;)V", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "getDiv", "()Lk8/y0$l;", "setDiv", "(Lk8/y0$l;)V", "div", "", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "", "getSubscriptions", "()Ljava/util/List;", BillingClient.FeatureType.SUBSCRIPTIONS, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivSelectView extends SelectView implements DivHolderView<y0.l> {
    private final /* synthetic */ DivHolderViewMixin<y0.l> $$delegate_0;

    @Nullable
    private Function1<? super String, Unit> valueUpdater;

    public DivSelectView(@NotNull Context context) {
        super(context);
        this.$$delegate_0 = new DivHolderViewMixin<>();
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
        DivBorderDrawer divBorderDrawer = getBorderDrawer();
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
    public y0.l getDiv() {
        return (y0.l) this.$$delegate_0.getDiv();
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
        return this.$$delegate_0.getSubscriptions();
    }

    @Nullable
    public Function1<String, Unit> getValueUpdater() {
        return this.valueUpdater;
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

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        onBoundsChanged(width, height);
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
    public void setDiv(@Nullable y0.l lVar) {
        this.$$delegate_0.setDiv(lVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    public void setValueUpdater(@Nullable Function1<? super String, Unit> function1) {
        this.valueUpdater = function1;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }
}

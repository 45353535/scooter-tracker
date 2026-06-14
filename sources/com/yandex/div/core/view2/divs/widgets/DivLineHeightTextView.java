package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.material.OutlinedTextFieldKt;
import com.android.billingclient.api.BillingClient;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.R$attr;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.spannable.ParticlesTicker;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import com.yandex.div.internal.widget.TextViewWithAccessibleSpans;
import java.util.List;
import k8.l7;
import k8.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0013J*\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b(\u0010'J\u000f\u0010,\u001a\u00020)H\u0010¢\u0006\u0004\b*\u0010+J/\u00101\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0014¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0004\b7\u00106J\u0017\u00109\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\tH\u0014¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000fH\u0014¢\u0006\u0004\b;\u0010\u0013R$\u0010=\u001a\u0004\u0018\u00010<8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010D\u001a\u0004\u0018\u00010C8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010)8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010[\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\\8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001c\u0010b\u001a\u00020\\8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b_\u0010^\"\u0004\b`\u0010aR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\r0c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006g"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "Lcom/yandex/div/internal/widget/TextViewWithAccessibleSpans;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lk8/y0$r;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/div/core/Disposable;", "subscription", "", "addSubscription", "(Lcom/yandex/div/core/Disposable;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "release", "releaseBorderDrawer", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "setBorder", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "Lcom/yandex/div/core/view2/spannable/ParticlesTicker;", "getParticlesTicker$div_release", "()Lcom/yandex/div/core/view2/spannable/ParticlesTicker;", "getParticlesTicker", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "onDraw", "visibility", "onWindowVisibilityChanged", "(I)V", "onDetachedFromWindow", "Lcom/yandex/div/core/widget/AdaptiveMaxLines;", "adaptiveMaxLines", "Lcom/yandex/div/core/widget/AdaptiveMaxLines;", "getAdaptiveMaxLines$div_release", "()Lcom/yandex/div/core/widget/AdaptiveMaxLines;", "setAdaptiveMaxLines$div_release", "(Lcom/yandex/div/core/widget/AdaptiveMaxLines;)V", "Lcom/yandex/div/core/util/text/DivTextRangesBackgroundHelper;", "textRoundedBgHelper", "Lcom/yandex/div/core/util/text/DivTextRangesBackgroundHelper;", "getTextRoundedBgHelper$div_release", "()Lcom/yandex/div/core/util/text/DivTextRangesBackgroundHelper;", "setTextRoundedBgHelper$div_release", "(Lcom/yandex/div/core/util/text/DivTextRangesBackgroundHelper;)V", "", "animationStartDelay", "J", "getAnimationStartDelay$div_release", "()J", "setAnimationStartDelay$div_release", "(J)V", "particlesTicker", "Lcom/yandex/div/core/view2/spannable/ParticlesTicker;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "getDiv", "()Lk8/y0$r;", "setDiv", "(Lk8/y0$r;)V", "div", "", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "", "getSubscriptions", "()Ljava/util/List;", BillingClient.FeatureType.SUBSCRIPTIONS, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivLineHeightTextView extends TextViewWithAccessibleSpans implements DivHolderView<y0.r> {
    private final /* synthetic */ DivHolderViewMixin<y0.r> $$delegate_0;

    @Nullable
    private AdaptiveMaxLines adaptiveMaxLines;
    private long animationStartDelay;

    @Nullable
    private ParticlesTicker particlesTicker;

    @Nullable
    private DivTextRangesBackgroundHelper textRoundedBgHelper;

    public /* synthetic */ DivLineHeightTextView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R$attr.divTextStyle : i10);
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

    @Nullable
    /* JADX INFO: renamed from: getAdaptiveMaxLines$div_release, reason: from getter */
    public AdaptiveMaxLines getAdaptiveMaxLines() {
        return this.adaptiveMaxLines;
    }

    /* JADX INFO: renamed from: getAnimationStartDelay$div_release, reason: from getter */
    public long getAnimationStartDelay() {
        return this.animationStartDelay;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public y0.r getDiv() {
        return (y0.r) this.$$delegate_0.getDiv();
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

    @NotNull
    public ParticlesTicker getParticlesTicker$div_release() {
        ParticlesTicker particlesTicker = this.particlesTicker;
        if (particlesTicker != null) {
            return particlesTicker;
        }
        ParticlesTicker particlesTicker2 = new ParticlesTicker(this);
        this.particlesTicker = particlesTicker2;
        return particlesTicker2;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Nullable
    /* JADX INFO: renamed from: getTextRoundedBgHelper$div_release, reason: from getter */
    public DivTextRangesBackgroundHelper getTextRoundedBgHelper() {
        return this.textRoundedBgHelper;
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

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        ParticlesTicker particlesTicker = this.particlesTicker;
        if (particlesTicker != null) {
            particlesTicker.stop();
        }
        this.particlesTicker = null;
        super.onDetachedFromWindow();
    }

    @Override // com.yandex.div.internal.widget.TextViewWithAccessibleSpans, android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        DivTextRangesBackgroundHelper textRoundedBgHelper;
        if ((getText() instanceof Spanned) && getLayout() != null && (textRoundedBgHelper = getTextRoundedBgHelper()) != null && textRoundedBgHelper.hasBackgroundSpan$div_release()) {
            float totalPaddingLeft = getTotalPaddingLeft();
            float totalPaddingTop = getTotalPaddingTop();
            int iSave = canvas.save();
            canvas.translate(totalPaddingLeft, totalPaddingTop);
            try {
                DivTextRangesBackgroundHelper textRoundedBgHelper2 = getTextRoundedBgHelper();
                if (textRoundedBgHelper2 != null) {
                    CharSequence text = getText();
                    Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
                    textRoundedBgHelper2.draw(canvas, (Spanned) text, getLayout());
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        super.onDraw(canvas);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        onBoundsChanged(w10, h10);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (visibility == 0) {
            ParticlesTicker particlesTicker = this.particlesTicker;
            if (particlesTicker != null) {
                particlesTicker.resumeIfNeeded();
                return;
            }
            return;
        }
        ParticlesTicker particlesTicker2 = this.particlesTicker;
        if (particlesTicker2 != null) {
            particlesTicker2.stop();
        }
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void setAdaptiveMaxLines$div_release(@Nullable AdaptiveMaxLines adaptiveMaxLines) {
        this.adaptiveMaxLines = adaptiveMaxLines;
    }

    public void setAnimationStartDelay$div_release(long j10) {
        this.animationStartDelay = j10;
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
    public void setDiv(@Nullable y0.r rVar) {
        this.$$delegate_0.setDiv(rVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    public void setTextRoundedBgHelper$div_release(@Nullable DivTextRangesBackgroundHelper divTextRangesBackgroundHelper) {
        this.textRoundedBgHelper = divTextRangesBackgroundHelper;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivLineHeightTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
    }
}

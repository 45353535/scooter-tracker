package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.g10;
import yads.ow2;
import yads.rh1;
import yads.sh1;
import yads.vh1;
import yads.wh1;
import yads.xx;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/ExtendedViewContainer;", "Landroid/widget/FrameLayout;", "Lyads/wh1;", "measureSpecProvider", "", "setMeasureSpecProvider", "(Lyads/wh1;)V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class ExtendedViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g10 f59019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wh1 f59020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private wh1 f59021c;

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final xx a(float f10, float f11) {
        return new xx(new sh1(this, f10, getContext().getApplicationContext()), new rh1(this, f11, getContext().getApplicationContext()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g10 g10Var = this.f59019a;
        if (g10Var.f111024d != null && !g10Var.f111023c.isEmpty()) {
            canvas.clipPath(g10Var.f111023c);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        vh1 vh1VarA = this.f59021c.a(i10, i11);
        super.onMeasure(vh1VarA.f117010a, vh1VarA.f117011b);
        this.f59019a.a();
    }

    public final void setMeasureSpecProvider(@NotNull wh1 measureSpecProvider) {
        this.f59021c = new xx(this.f59020b, measureSpecProvider);
        requestLayout();
        invalidate();
    }

    public /* synthetic */ ExtendedViewContainer(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        super(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalExtendedContainer, i10, 0);
            int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_corner_radius, 0);
            dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_left_corner_radius, dimensionPixelSize5);
            dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_left_corner_radius, dimensionPixelSize5);
            this.f59020b = a(typedArrayObtainStyledAttributes.getFloat(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_width, 1.0f), typedArrayObtainStyledAttributes.getFloat(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_height, 1.0f));
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f59020b = new ow2();
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
            dimensionPixelSize3 = 0;
            dimensionPixelSize4 = 0;
        }
        this.f59021c = this.f59020b;
        this.f59019a = new g10(this, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize);
        setWillNotDraw(false);
    }
}

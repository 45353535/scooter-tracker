package com.appodeal.ads.adapters.admobnative.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/adapters/admobnative/view/ShimmerFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "radius", "", "setCornerRadius", "(F)V", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShimmerFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f11950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f11951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f11952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f11953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f11954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ValueAnimator f11955g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void a(ShimmerFrameLayout shimmerFrameLayout, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        shimmerFrameLayout.invalidate();
    }

    private final void setCornerRadius(float radius) {
        setOutlineProvider(new c(radius));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        float fTan = (((float) Math.tan(Math.toRadians(this.f11950b))) * getHeight()) + getWidth();
        Object animatedValue = this.f11955g.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float f10 = -fTan;
        float fFloatValue = ((fTan - f10) * ((Float) animatedValue).floatValue()) + f10;
        this.f11954f.reset();
        this.f11954f.setRotate((float) this.f11950b, getWidth() / 2.0f, getHeight() / 2.0f);
        this.f11954f.postTranslate(fFloatValue, 0.0f);
        this.f11951c.getShader().setLocalMatrix(this.f11954f);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f11951c);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f11951c.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, this.f11952d, this.f11953e, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i10) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        if (i10 == 0) {
            this.f11955g.start();
        } else if (i10 == 4 || i10 == 8) {
            this.f11955g.cancel();
        }
    }

    public /* synthetic */ ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int color = Color.parseColor("#BFFFFFFF");
        this.f11950b = 45.0d;
        this.f11951c = new Paint(1);
        this.f11952d = new int[]{0, 0, color, 0, 0};
        this.f11953e = new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
        this.f11954f = new Matrix();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11955g = valueAnimatorOfFloat;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.appodeal.ads.adapters.admobnative.view.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShimmerFrameLayout.a(this.f11956b, valueAnimator);
            }
        };
        setCornerRadius(TypedValue.applyDimension(1, 8, getContext().getResources().getDisplayMetrics()));
        setLayerType(2, new Paint());
        valueAnimatorOfFloat.setDuration(3000L);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat.start();
        addOnAttachStateChangeListener(new b(this));
    }
}

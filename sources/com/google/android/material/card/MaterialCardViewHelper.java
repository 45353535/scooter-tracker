package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.cardview.R;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class MaterialCardViewHelper {
    public static final int DEFAULT_FADE_ANIM_DURATION = 300;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final double f25788y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Drawable f25789z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialCardView f25790a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaterialShapeDrawable f25792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MaterialShapeDrawable f25793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f25798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f25799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f25800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f25801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ShapeAppearanceModel f25802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f25803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f25804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LayerDrawable f25805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MaterialShapeDrawable f25806q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f25808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ValueAnimator f25809t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final TimeInterpolator f25810u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f25811v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f25812w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f25791b = new Rect();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f25807r = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f25813x = 0.0f;

    static {
        f25789z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public MaterialCardViewHelper(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i10, @StyleRes int i11) {
        this.f25790a = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i10, i11);
        this.f25792c = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(materialCardView.getContext());
        materialShapeDrawable.setShadowColor(-12303292);
        ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R.styleable.CardView, i10, R.style.CardView);
        int i12 = R.styleable.CardView_cardCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            builder.setAllCornerSizes(typedArrayObtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f25793d = new MaterialShapeDrawable();
        T(builder.build());
        this.f25810u = MotionUtils.resolveThemeInterpolator(materialCardView.getContext(), com.google.android.material.R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.f25811v = MotionUtils.resolveThemeDuration(materialCardView.getContext(), com.google.android.material.R.attr.motionDurationShort2, 300);
        this.f25812w = MotionUtils.resolveThemeDuration(materialCardView.getContext(), com.google.android.material.R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable A(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f25790a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(e());
            iCeil = (int) Math.ceil(d());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new InsetDrawable(drawable, iCeil, iCeil2, iCeil, iCeil2) { // from class: com.google.android.material.card.MaterialCardViewHelper.1
            @Override // android.graphics.drawable.Drawable
            public int getMinimumHeight() {
                return -1;
            }

            @Override // android.graphics.drawable.Drawable
            public int getMinimumWidth() {
                return -1;
            }

            @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public boolean getPadding(Rect rect) {
                return false;
            }
        };
    }

    private boolean D() {
        return (this.f25796g & 80) == 80;
    }

    private boolean E() {
        return (this.f25796g & GravityCompat.END) == 8388613;
    }

    private boolean X() {
        return this.f25790a.getPreventCornerOverlap() && !f();
    }

    private boolean Y() {
        return this.f25790a.getPreventCornerOverlap() && f() && this.f25790a.getUseCompatPadding();
    }

    private boolean Z() {
        if (this.f25790a.isClickable()) {
            return true;
        }
        View view = this.f25790a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public static /* synthetic */ void a(MaterialCardViewHelper materialCardViewHelper, ValueAnimator valueAnimator) {
        materialCardViewHelper.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialCardViewHelper.f25799j.setAlpha((int) (255.0f * fFloatValue));
        materialCardViewHelper.f25813x = fFloatValue;
    }

    private float b() {
        return Math.max(Math.max(c(this.f25802m.getTopLeftCorner(), this.f25792c.getTopLeftCornerResolvedSize()), c(this.f25802m.getTopRightCorner(), this.f25792c.getTopRightCornerResolvedSize())), Math.max(c(this.f25802m.getBottomRightCorner(), this.f25792c.getBottomRightCornerResolvedSize()), c(this.f25802m.getBottomLeftCorner(), this.f25792c.getBottomLeftCornerResolvedSize())));
    }

    private float c(CornerTreatment cornerTreatment, float f10) {
        if (cornerTreatment instanceof RoundedCornerTreatment) {
            return (float) ((1.0d - f25788y) * ((double) f10));
        }
        if (cornerTreatment instanceof CutCornerTreatment) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    private float d() {
        return this.f25790a.getMaxCardElevation() + (Y() ? b() : 0.0f);
    }

    private void d0(Drawable drawable) {
        if (this.f25790a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f25790a.getForeground()).setDrawable(drawable);
        } else {
            this.f25790a.setForeground(A(drawable));
        }
    }

    private float e() {
        return (this.f25790a.getMaxCardElevation() * 1.5f) + (Y() ? b() : 0.0f);
    }

    private boolean f() {
        return this.f25792c.isRoundRect();
    }

    private void f0() {
        Drawable drawable = this.f25804o;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.f25800k);
        }
    }

    private Drawable g() {
        this.f25806q = new MaterialShapeDrawable(this.f25802m);
        return new RippleDrawable(this.f25800k, null, this.f25806q);
    }

    private Drawable q() {
        if (this.f25804o == null) {
            this.f25804o = g();
        }
        if (this.f25805p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f25804o, this.f25793d, this.f25799j});
            this.f25805p = layerDrawable;
            layerDrawable.setId(2, com.google.android.material.R.id.mtrl_card_checked_layer_id);
        }
        return this.f25805p;
    }

    private float s() {
        if (this.f25790a.getPreventCornerOverlap() && this.f25790a.getUseCompatPadding()) {
            return (float) ((1.0d - f25788y) * ((double) this.f25790a.getCardViewRadius()));
        }
        return 0.0f;
    }

    boolean B() {
        return this.f25807r;
    }

    boolean C() {
        return this.f25808s;
    }

    void F(TypedArray typedArray) {
        ColorStateList colorStateList = MaterialResources.getColorStateList(this.f25790a.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_strokeColor);
        this.f25803n = colorStateList;
        if (colorStateList == null) {
            this.f25803n = ColorStateList.valueOf(-1);
        }
        this.f25797h = typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z10 = typedArray.getBoolean(com.google.android.material.R.styleable.MaterialCardView_android_checkable, false);
        this.f25808s = z10;
        this.f25790a.setLongClickable(z10);
        this.f25801l = MaterialResources.getColorStateList(this.f25790a.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_checkedIconTint);
        L(MaterialResources.getDrawable(this.f25790a.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_checkedIcon));
        O(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_checkedIconSize, 0));
        N(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_checkedIconMargin, 0));
        this.f25796g = typedArray.getInteger(com.google.android.material.R.styleable.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(this.f25790a.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_rippleColor);
        this.f25800k = colorStateList2;
        if (colorStateList2 == null) {
            this.f25800k = ColorStateList.valueOf(MaterialColors.getColor(this.f25790a, androidx.appcompat.R.attr.colorControlHighlight));
        }
        J(MaterialResources.getColorStateList(this.f25790a.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_cardForegroundColor));
        f0();
        c0();
        g0();
        this.f25790a.setBackgroundInternal(A(this.f25792c));
        Drawable drawableQ = Z() ? q() : this.f25793d;
        this.f25798i = drawableQ;
        this.f25790a.setForeground(A(drawableQ));
    }

    void G(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f25805p != null) {
            if (this.f25790a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(e() * 2.0f);
                iCeil2 = (int) Math.ceil(d() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = E() ? ((i10 - this.f25794e) - this.f25795f) - iCeil2 : this.f25794e;
            int i15 = D() ? this.f25794e : ((i11 - this.f25794e) - this.f25795f) - iCeil;
            int i16 = E() ? this.f25794e : ((i10 - this.f25794e) - this.f25795f) - iCeil2;
            int i17 = D() ? ((i11 - this.f25794e) - this.f25795f) - iCeil : this.f25794e;
            if (this.f25790a.getLayoutDirection() == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f25805p.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    void H(boolean z10) {
        this.f25807r = z10;
    }

    void I(ColorStateList colorStateList) {
        this.f25792c.setFillColor(colorStateList);
    }

    void J(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f25793d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.setFillColor(colorStateList);
    }

    void K(boolean z10) {
        this.f25808s = z10;
    }

    void L(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
            this.f25799j = drawableMutate;
            drawableMutate.setTintList(this.f25801l);
            setChecked(this.f25790a.isChecked());
        } else {
            this.f25799j = f25789z;
        }
        LayerDrawable layerDrawable = this.f25805p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.google.android.material.R.id.mtrl_card_checked_layer_id, this.f25799j);
        }
    }

    void M(int i10) {
        this.f25796g = i10;
        G(this.f25790a.getMeasuredWidth(), this.f25790a.getMeasuredHeight());
    }

    void N(int i10) {
        this.f25794e = i10;
    }

    void O(int i10) {
        this.f25795f = i10;
    }

    void P(ColorStateList colorStateList) {
        this.f25801l = colorStateList;
        Drawable drawable = this.f25799j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    void Q(float f10) {
        T(this.f25802m.withCornerSize(f10));
        this.f25798i.invalidateSelf();
        if (Y() || X()) {
            b0();
        }
        if (Y()) {
            e0();
        }
    }

    void R(float f10) {
        this.f25792c.setInterpolation(f10);
        MaterialShapeDrawable materialShapeDrawable = this.f25793d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f10);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f25806q;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setInterpolation(f10);
        }
    }

    void S(ColorStateList colorStateList) {
        this.f25800k = colorStateList;
        f0();
    }

    void T(ShapeAppearanceModel shapeAppearanceModel) {
        this.f25802m = shapeAppearanceModel;
        this.f25792c.setShapeAppearanceModel(shapeAppearanceModel);
        this.f25792c.setShadowBitmapDrawingEnable(!r0.isRoundRect());
        MaterialShapeDrawable materialShapeDrawable = this.f25793d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f25806q;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    void U(ColorStateList colorStateList) {
        if (this.f25803n == colorStateList) {
            return;
        }
        this.f25803n = colorStateList;
        g0();
    }

    void V(int i10) {
        if (i10 == this.f25797h) {
            return;
        }
        this.f25797h = i10;
        g0();
    }

    void W(int i10, int i11, int i12, int i13) {
        this.f25791b.set(i10, i11, i12, i13);
        b0();
    }

    void a0() {
        Drawable drawable = this.f25798i;
        Drawable drawableQ = Z() ? q() : this.f25793d;
        this.f25798i = drawableQ;
        if (drawable != drawableQ) {
            d0(drawableQ);
        }
    }

    public void animateCheckedIcon(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f25813x : this.f25813x;
        ValueAnimator valueAnimator = this.f25809t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f25809t = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f25813x, f10);
        this.f25809t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                MaterialCardViewHelper.a(this.f25815b, valueAnimator2);
            }
        });
        this.f25809t.setInterpolator(this.f25810u);
        this.f25809t.setDuration((long) ((z10 ? this.f25811v : this.f25812w) * f11));
        this.f25809t.start();
    }

    void b0() {
        int iB = (int) (((X() || Y()) ? b() : 0.0f) - s());
        MaterialCardView materialCardView = this.f25790a;
        Rect rect = this.f25791b;
        materialCardView.c(rect.left + iB, rect.top + iB, rect.right + iB, rect.bottom + iB);
    }

    void c0() {
        this.f25792c.setElevation(this.f25790a.getCardElevation());
    }

    void e0() {
        if (!B()) {
            this.f25790a.setBackgroundInternal(A(this.f25792c));
        }
        this.f25790a.setForeground(A(this.f25798i));
    }

    void g0() {
        this.f25793d.setStroke(this.f25797h, this.f25803n);
    }

    void h() {
        Drawable drawable = this.f25804o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f25804o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f25804o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    MaterialShapeDrawable i() {
        return this.f25792c;
    }

    ColorStateList j() {
        return this.f25792c.getFillColor();
    }

    ColorStateList k() {
        return this.f25793d.getFillColor();
    }

    Drawable l() {
        return this.f25799j;
    }

    int m() {
        return this.f25796g;
    }

    int n() {
        return this.f25794e;
    }

    int o() {
        return this.f25795f;
    }

    ColorStateList p() {
        return this.f25801l;
    }

    float r() {
        return this.f25792c.getTopLeftCornerResolvedSize();
    }

    public void setChecked(boolean z10) {
        setChecked(z10, false);
    }

    float t() {
        return this.f25792c.getInterpolation();
    }

    ColorStateList u() {
        return this.f25800k;
    }

    ShapeAppearanceModel v() {
        return this.f25802m;
    }

    int w() {
        ColorStateList colorStateList = this.f25803n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    ColorStateList x() {
        return this.f25803n;
    }

    int y() {
        return this.f25797h;
    }

    Rect z() {
        return this.f25791b;
    }

    public void setChecked(boolean z10, boolean z11) {
        Drawable drawable = this.f25799j;
        if (drawable != null) {
            if (z11) {
                animateCheckedIcon(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f25813x = z10 ? 1.0f : 0.0f;
            }
        }
    }
}

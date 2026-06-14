package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class MaterialButtonHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialButton f25743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ShapeAppearanceModel f25744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StateListShapeAppearanceModel f25745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SpringForce f25746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaterialShapeDrawable.OnCornerSizeChangeListener f25747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f25754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f25755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f25756n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f25757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f25758p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f25762t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private LayerDrawable f25764v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f25765w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25759q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f25760r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f25761s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f25763u = true;

    MaterialButtonHelper(MaterialButton materialButton, ShapeAppearanceModel shapeAppearanceModel) {
        this.f25743a = materialButton;
        this.f25744b = shapeAppearanceModel;
    }

    private void G(int i10, int i11) {
        int paddingStart = this.f25743a.getPaddingStart();
        int paddingTop = this.f25743a.getPaddingTop();
        int paddingEnd = this.f25743a.getPaddingEnd();
        int paddingBottom = this.f25743a.getPaddingBottom();
        int i12 = this.f25750h;
        int i13 = this.f25751i;
        this.f25751i = i11;
        this.f25750h = i10;
        if (!this.f25760r) {
            H();
        }
        this.f25743a.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f25743a.setInternalBackground(a());
        MaterialShapeDrawable materialShapeDrawableD = d();
        if (materialShapeDrawableD != null) {
            materialShapeDrawableD.setElevation(this.f25765w);
            materialShapeDrawableD.setState(this.f25743a.getDrawableState());
        }
    }

    private void I() {
        MaterialShapeDrawable materialShapeDrawableD = d();
        if (materialShapeDrawableD != null) {
            StateListShapeAppearanceModel stateListShapeAppearanceModel = this.f25745c;
            if (stateListShapeAppearanceModel != null) {
                materialShapeDrawableD.setStateListShapeAppearanceModel(stateListShapeAppearanceModel);
            } else {
                materialShapeDrawableD.setShapeAppearanceModel(this.f25744b);
            }
            SpringForce springForce = this.f25746d;
            if (springForce != null) {
                materialShapeDrawableD.setCornerSpringForce(springForce);
            }
        }
        MaterialShapeDrawable materialShapeDrawableM = m();
        if (materialShapeDrawableM != null) {
            StateListShapeAppearanceModel stateListShapeAppearanceModel2 = this.f25745c;
            if (stateListShapeAppearanceModel2 != null) {
                materialShapeDrawableM.setStateListShapeAppearanceModel(stateListShapeAppearanceModel2);
            } else {
                materialShapeDrawableM.setShapeAppearanceModel(this.f25744b);
            }
            SpringForce springForce2 = this.f25746d;
            if (springForce2 != null) {
                materialShapeDrawableM.setCornerSpringForce(springForce2);
            }
        }
        Shapeable maskDrawable = getMaskDrawable();
        if (maskDrawable != null) {
            maskDrawable.setShapeAppearanceModel(this.f25744b);
            if (maskDrawable instanceof MaterialShapeDrawable) {
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) maskDrawable;
                StateListShapeAppearanceModel stateListShapeAppearanceModel3 = this.f25745c;
                if (stateListShapeAppearanceModel3 != null) {
                    materialShapeDrawable.setStateListShapeAppearanceModel(stateListShapeAppearanceModel3);
                }
                SpringForce springForce3 = this.f25746d;
                if (springForce3 != null) {
                    materialShapeDrawable.setCornerSpringForce(springForce3);
                }
            }
        }
    }

    private void J() {
        MaterialShapeDrawable materialShapeDrawableD = d();
        MaterialShapeDrawable materialShapeDrawableM = m();
        if (materialShapeDrawableD != null) {
            materialShapeDrawableD.setStroke(this.f25753k, this.f25756n);
            if (materialShapeDrawableM != null) {
                materialShapeDrawableM.setStroke(this.f25753k, this.f25759q ? MaterialColors.getColor(this.f25743a, R.attr.colorSurface) : 0);
            }
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f25748f, this.f25750h, this.f25749g, this.f25751i);
    }

    private Drawable a() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f25744b);
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.f25745c;
        if (stateListShapeAppearanceModel != null) {
            materialShapeDrawable.setStateListShapeAppearanceModel(stateListShapeAppearanceModel);
        }
        SpringForce springForce = this.f25746d;
        if (springForce != null) {
            materialShapeDrawable.setCornerSpringForce(springForce);
        }
        MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener = this.f25747e;
        if (onCornerSizeChangeListener != null) {
            materialShapeDrawable.setOnCornerSizeChangeListener(onCornerSizeChangeListener);
        }
        materialShapeDrawable.initializeElevationOverlay(this.f25743a.getContext());
        materialShapeDrawable.setTintList(this.f25755m);
        PorterDuff.Mode mode = this.f25754l;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        materialShapeDrawable.setStroke(this.f25753k, this.f25756n);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f25744b);
        StateListShapeAppearanceModel stateListShapeAppearanceModel2 = this.f25745c;
        if (stateListShapeAppearanceModel2 != null) {
            materialShapeDrawable2.setStateListShapeAppearanceModel(stateListShapeAppearanceModel2);
        }
        SpringForce springForce2 = this.f25746d;
        if (springForce2 != null) {
            materialShapeDrawable2.setCornerSpringForce(springForce2);
        }
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.setStroke(this.f25753k, this.f25759q ? MaterialColors.getColor(this.f25743a, R.attr.colorSurface) : 0);
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f25744b);
        this.f25758p = materialShapeDrawable3;
        StateListShapeAppearanceModel stateListShapeAppearanceModel3 = this.f25745c;
        if (stateListShapeAppearanceModel3 != null) {
            materialShapeDrawable3.setStateListShapeAppearanceModel(stateListShapeAppearanceModel3);
        }
        SpringForce springForce3 = this.f25746d;
        if (springForce3 != null) {
            ((MaterialShapeDrawable) this.f25758p).setCornerSpringForce(springForce3);
        }
        this.f25758p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.f25757o), K(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.f25758p);
        this.f25764v = rippleDrawable;
        return rippleDrawable;
    }

    private MaterialShapeDrawable e(boolean z10) {
        LayerDrawable layerDrawable = this.f25764v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f25764v.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    private MaterialShapeDrawable m() {
        return e(true);
    }

    void A(StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        this.f25745c = stateListShapeAppearanceModel;
        I();
    }

    void B(ColorStateList colorStateList) {
        if (this.f25756n != colorStateList) {
            this.f25756n = colorStateList;
            J();
        }
    }

    void C(int i10) {
        if (this.f25753k != i10) {
            this.f25753k = i10;
            J();
        }
    }

    void D(ColorStateList colorStateList) {
        if (this.f25755m != colorStateList) {
            this.f25755m = colorStateList;
            if (d() != null) {
                d().setTintList(this.f25755m);
            }
        }
    }

    void E(PorterDuff.Mode mode) {
        if (this.f25754l != mode) {
            this.f25754l = mode;
            if (d() == null || this.f25754l == null) {
                return;
            }
            d().setTintMode(this.f25754l);
        }
    }

    void F(boolean z10) {
        this.f25763u = z10;
    }

    int b() {
        return this.f25752j;
    }

    SpringForce c() {
        return this.f25746d;
    }

    MaterialShapeDrawable d() {
        return e(false);
    }

    ColorStateList f() {
        return this.f25757o;
    }

    ShapeAppearanceModel g() {
        return this.f25744b;
    }

    public int getInsetBottom() {
        return this.f25751i;
    }

    public int getInsetTop() {
        return this.f25750h;
    }

    @Nullable
    public Shapeable getMaskDrawable() {
        LayerDrawable layerDrawable = this.f25764v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f25764v.getNumberOfLayers() > 2 ? (Shapeable) this.f25764v.getDrawable(2) : (Shapeable) this.f25764v.getDrawable(1);
    }

    StateListShapeAppearanceModel h() {
        return this.f25745c;
    }

    ColorStateList i() {
        return this.f25756n;
    }

    int j() {
        return this.f25753k;
    }

    ColorStateList k() {
        return this.f25755m;
    }

    PorterDuff.Mode l() {
        return this.f25754l;
    }

    boolean n() {
        return this.f25760r;
    }

    boolean o() {
        return this.f25762t;
    }

    boolean p() {
        return this.f25763u;
    }

    void q(TypedArray typedArray) {
        this.f25748f = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetLeft, 0);
        this.f25749g = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetRight, 0);
        this.f25750h = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetTop, 0);
        this.f25751i = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetBottom, 0);
        int i10 = R.styleable.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f25752j = dimensionPixelSize;
            y(this.f25744b.withCornerSize(dimensionPixelSize));
            this.f25761s = true;
        }
        this.f25753k = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_strokeWidth, 0);
        this.f25754l = ViewUtils.parseTintMode(typedArray.getInt(R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f25755m = MaterialResources.getColorStateList(this.f25743a.getContext(), typedArray, R.styleable.MaterialButton_backgroundTint);
        this.f25756n = MaterialResources.getColorStateList(this.f25743a.getContext(), typedArray, R.styleable.MaterialButton_strokeColor);
        this.f25757o = MaterialResources.getColorStateList(this.f25743a.getContext(), typedArray, R.styleable.MaterialButton_rippleColor);
        this.f25762t = typedArray.getBoolean(R.styleable.MaterialButton_android_checkable, false);
        this.f25765w = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_elevation, 0);
        this.f25763u = typedArray.getBoolean(R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = this.f25743a.getPaddingStart();
        int paddingTop = this.f25743a.getPaddingTop();
        int paddingEnd = this.f25743a.getPaddingEnd();
        int paddingBottom = this.f25743a.getPaddingBottom();
        if (typedArray.hasValue(R.styleable.MaterialButton_android_background)) {
            s();
        } else {
            H();
        }
        this.f25743a.setPaddingRelative(paddingStart + this.f25748f, paddingTop + this.f25750h, paddingEnd + this.f25749g, paddingBottom + this.f25751i);
    }

    void r(int i10) {
        if (d() != null) {
            d().setTint(i10);
        }
    }

    void s() {
        this.f25760r = true;
        this.f25743a.setSupportBackgroundTintList(this.f25755m);
        this.f25743a.setSupportBackgroundTintMode(this.f25754l);
    }

    public void setInsetBottom(@Dimension int i10) {
        G(this.f25750h, i10);
    }

    public void setInsetTop(@Dimension int i10) {
        G(i10, this.f25751i);
    }

    void t(boolean z10) {
        this.f25762t = z10;
    }

    void u(int i10) {
        if (this.f25761s && this.f25752j == i10) {
            return;
        }
        this.f25752j = i10;
        this.f25761s = true;
        y(this.f25744b.withCornerSize(i10));
    }

    void v(MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener) {
        this.f25747e = onCornerSizeChangeListener;
        MaterialShapeDrawable materialShapeDrawableD = d();
        if (materialShapeDrawableD != null) {
            materialShapeDrawableD.setOnCornerSizeChangeListener(onCornerSizeChangeListener);
        }
    }

    void w(SpringForce springForce) {
        this.f25746d = springForce;
        if (this.f25745c != null) {
            I();
        }
    }

    void x(ColorStateList colorStateList) {
        if (this.f25757o != colorStateList) {
            this.f25757o = colorStateList;
            if (this.f25743a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f25743a.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            }
        }
    }

    void y(ShapeAppearanceModel shapeAppearanceModel) {
        this.f25744b = shapeAppearanceModel;
        this.f25745c = null;
        I();
    }

    void z(boolean z10) {
        this.f25759q = z10;
        J();
    }
}

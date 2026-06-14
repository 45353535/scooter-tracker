package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    private static final int[] U0 = {R.attr.state_enabled};
    private static final ShapeDrawable V0 = new ShapeDrawable(new OvalShape());
    private int A0;
    private int B0;
    private int C0;
    private int D0;
    private int E0;
    private boolean F0;
    private int G0;
    private int H0;
    private ColorFilter I0;
    private PorterDuffColorFilter J0;
    private ColorStateList K;
    private ColorStateList K0;
    private ColorStateList L;
    private PorterDuff.Mode L0;
    private float M;
    private int[] M0;
    private float N;
    private boolean N0;
    private ColorStateList O;
    private ColorStateList O0;
    private float P;
    private WeakReference P0;
    private ColorStateList Q;
    private TextUtils.TruncateAt Q0;
    private CharSequence R;
    private boolean R0;
    private boolean S;
    private int S0;
    private Drawable T;
    private boolean T0;
    private ColorStateList U;
    private float V;
    private boolean W;
    private boolean X;
    private Drawable Y;
    private Drawable Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ColorStateList f25960a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f25961b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private CharSequence f25962c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f25963d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f25964e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Drawable f25965f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private ColorStateList f25966g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private MotionSpec f25967h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private MotionSpec f25968i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f25969j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f25970k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f25971l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f25972m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f25973n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private float f25974o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f25975p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f25976q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final Context f25977r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final Paint f25978s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final Paint f25979t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final Paint.FontMetrics f25980u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final RectF f25981v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final PointF f25982w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final Path f25983x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final TextDrawableHelper f25984y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f25985z0;

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    private ChipDrawable(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.N = -1.0f;
        this.f25978s0 = new Paint(1);
        this.f25980u0 = new Paint.FontMetrics();
        this.f25981v0 = new RectF();
        this.f25982w0 = new PointF();
        this.f25983x0 = new Path();
        this.H0 = 255;
        this.L0 = PorterDuff.Mode.SRC_IN;
        this.P0 = new WeakReference(null);
        initializeElevationOverlay(context);
        this.f25977r0 = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f25984y0 = textDrawableHelper;
        this.R = "";
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        this.f25979t0 = null;
        int[] iArr = U0;
        setState(iArr);
        setCloseIconState(iArr);
        this.R0 = true;
        V0.setTint(-1);
    }

    private void L(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Y) {
            if (drawable.isStateful()) {
                drawable.setState(getCloseIconState());
            }
            drawable.setTintList(this.f25960a0);
            return;
        }
        Drawable drawable2 = this.T;
        if (drawable == drawable2 && this.W) {
            drawable2.setTintList(this.U);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void M(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (u0() || t0()) {
            float f10 = this.f25969j0 + this.f25970k0;
            float fG0 = g0();
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fG0;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fG0;
            }
            float fF0 = f0();
            float fExactCenterY = rect.exactCenterY() - (fF0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fF0;
        }
    }

    private void O(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (v0()) {
            float f10 = this.f25976q0 + this.f25975p0 + this.f25961b0 + this.f25974o0 + this.f25973n0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private void P(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (v0()) {
            float f10 = this.f25976q0 + this.f25975p0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f25961b0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f25961b0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f25961b0;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void Q(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (v0()) {
            float f10 = this.f25976q0 + this.f25975p0 + this.f25961b0 + this.f25974o0 + this.f25973n0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void S(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.R != null) {
            float fN = this.f25969j0 + N() + this.f25972m0;
            float fR = this.f25976q0 + R() + this.f25973n0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.left = rect.left + fN;
                rectF.right = rect.right - fR;
            } else {
                rectF.left = rect.left + fR;
                rectF.right = rect.right - fN;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float T() {
        this.f25984y0.getTextPaint().getFontMetrics(this.f25980u0);
        Paint.FontMetrics fontMetrics = this.f25980u0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean V() {
        return this.f25964e0 && this.f25965f0 != null && this.f25963d0;
    }

    private void W(Canvas canvas, Rect rect) {
        if (t0()) {
            M(rect, this.f25981v0);
            RectF rectF = this.f25981v0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f25965f0.setBounds(0, 0, (int) this.f25981v0.width(), (int) this.f25981v0.height());
            this.f25965f0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void X(Canvas canvas, Rect rect) {
        if (this.T0) {
            return;
        }
        this.f25978s0.setColor(this.A0);
        this.f25978s0.setStyle(Paint.Style.FILL);
        this.f25978s0.setColorFilter(h0());
        this.f25981v0.set(rect);
        canvas.drawRoundRect(this.f25981v0, getChipCornerRadius(), getChipCornerRadius(), this.f25978s0);
    }

    private void Y(Canvas canvas, Rect rect) {
        if (u0()) {
            M(rect, this.f25981v0);
            RectF rectF = this.f25981v0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.T.setBounds(0, 0, (int) this.f25981v0.width(), (int) this.f25981v0.height());
            this.T.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void Z(Canvas canvas, Rect rect) {
        if (this.P <= 0.0f || this.T0) {
            return;
        }
        this.f25978s0.setColor(this.C0);
        this.f25978s0.setStyle(Paint.Style.STROKE);
        if (!this.T0) {
            this.f25978s0.setColorFilter(h0());
        }
        RectF rectF = this.f25981v0;
        float f10 = rect.left;
        float f11 = this.P;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.N - (this.P / 2.0f);
        canvas.drawRoundRect(this.f25981v0, f12, f12, this.f25978s0);
    }

    private void a0(Canvas canvas, Rect rect) {
        if (this.T0) {
            return;
        }
        this.f25978s0.setColor(this.f25985z0);
        this.f25978s0.setStyle(Paint.Style.FILL);
        this.f25981v0.set(rect);
        canvas.drawRoundRect(this.f25981v0, getChipCornerRadius(), getChipCornerRadius(), this.f25978s0);
    }

    private void b0(Canvas canvas, Rect rect) {
        if (v0()) {
            P(rect, this.f25981v0);
            RectF rectF = this.f25981v0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.Y.setBounds(0, 0, (int) this.f25981v0.width(), (int) this.f25981v0.height());
            this.Z.setBounds(this.Y.getBounds());
            this.Z.jumpToCurrentState();
            this.Z.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void c0(Canvas canvas, Rect rect) {
        this.f25978s0.setColor(this.D0);
        this.f25978s0.setStyle(Paint.Style.FILL);
        this.f25981v0.set(rect);
        if (!this.T0) {
            canvas.drawRoundRect(this.f25981v0, getChipCornerRadius(), getChipCornerRadius(), this.f25978s0);
        } else {
            k(new RectF(rect), this.f25983x0);
            super.s(canvas, this.f25978s0, this.f25983x0, v());
        }
    }

    @NonNull
    public static ChipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i10, i11);
        chipDrawable.m0(attributeSet, i10, i11);
        return chipDrawable;
    }

    @NonNull
    public static ChipDrawable createFromResource(@NonNull Context context, @XmlRes int i10) {
        AttributeSet drawableXml = DrawableUtils.parseDrawableXml(context, i10, "chip");
        int styleAttribute = drawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return createFromAttributes(context, drawableXml, com.google.android.material.R.attr.chipStandaloneStyle, styleAttribute);
    }

    private void d0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f25979t0;
        if (paint != null) {
            paint.setColor(ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, 127));
            canvas.drawRect(rect, this.f25979t0);
            if (u0() || t0()) {
                M(rect, this.f25981v0);
                canvas.drawRect(this.f25981v0, this.f25979t0);
            }
            if (this.R != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f25979t0);
            } else {
                canvas2 = canvas;
            }
            if (v0()) {
                P(rect, this.f25981v0);
                canvas2.drawRect(this.f25981v0, this.f25979t0);
            }
            this.f25979t0.setColor(ColorUtils.setAlphaComponent(SupportMenu.CATEGORY_MASK, 127));
            O(rect, this.f25981v0);
            canvas2.drawRect(this.f25981v0, this.f25979t0);
            this.f25979t0.setColor(ColorUtils.setAlphaComponent(-16711936, 127));
            Q(rect, this.f25981v0);
            canvas2.drawRect(this.f25981v0, this.f25979t0);
        }
    }

    private void e0(Canvas canvas, Rect rect) {
        if (this.R != null) {
            Paint.Align alignU = U(rect, this.f25982w0);
            S(rect, this.f25981v0);
            if (this.f25984y0.getTextAppearance() != null) {
                this.f25984y0.getTextPaint().drawableState = getState();
                this.f25984y0.updateTextPaintDrawState(this.f25977r0);
            }
            this.f25984y0.getTextPaint().setTextAlign(alignU);
            int iSave = 0;
            boolean z10 = Math.round(this.f25984y0.getTextWidth(getText().toString())) > Math.round(this.f25981v0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f25981v0);
            }
            CharSequence charSequenceEllipsize = this.R;
            if (z10 && this.Q0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f25984y0.getTextPaint(), this.f25981v0.width(), this.Q0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f25982w0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f25984y0.getTextPaint());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private float f0() {
        Drawable drawable = this.F0 ? this.f25965f0 : this.T;
        float fCeil = this.V;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(ViewUtils.dpToPx(this.f25977r0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float g0() {
        Drawable drawable = this.F0 ? this.f25965f0 : this.T;
        float f10 = this.V;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private ColorFilter h0() {
        ColorFilter colorFilter = this.I0;
        return colorFilter != null ? colorFilter : this.J0;
    }

    private static boolean i0(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private static boolean j0(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean k0(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean l0(TextAppearance textAppearance) {
        return (textAppearance == null || textAppearance.getTextColor() == null || !textAppearance.getTextColor().isStateful()) ? false : true;
    }

    private void m0(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.f25977r0, attributeSet, com.google.android.material.R.styleable.Chip, i10, i11, new int[0]);
        this.T0 = typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_shapeAppearance);
        q0(MaterialResources.getColorStateList(this.f25977r0, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipSurfaceColor));
        setChipBackgroundColor(MaterialResources.getColorStateList(this.f25977r0, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipBackgroundColor));
        setChipMinHeight(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipMinHeight, 0.0f));
        int i12 = com.google.android.material.R.styleable.Chip_chipCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            setChipCornerRadius(typedArrayObtainStyledAttributes.getDimension(i12, 0.0f));
        }
        setChipStrokeColor(MaterialResources.getColorStateList(this.f25977r0, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipStrokeColor));
        setChipStrokeWidth(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStrokeWidth, 0.0f));
        setRippleColor(MaterialResources.getColorStateList(this.f25977r0, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_rippleColor));
        setText(typedArrayObtainStyledAttributes.getText(com.google.android.material.R.styleable.Chip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.f25977r0, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_android_textAppearance);
        textAppearance.setTextSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_android_textSize, textAppearance.getTextSize()));
        setTextAppearance(textAppearance);
        int i13 = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.Chip_android_ellipsize, 0);
        if (i13 == 1) {
            setEllipsize(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            setEllipsize(TextUtils.TruncateAt.END);
        }
        setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconEnabled, false));
        }
        setChipIcon(MaterialResources.getDrawable(this.f25977r0, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipIcon));
        int i14 = com.google.android.material.R.styleable.Chip_chipIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setChipIconTint(MaterialResources.getColorStateList(this.f25977r0, typedArrayObtainStyledAttributes, i14));
        }
        setChipIconSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipIconSize, -1.0f));
        setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconEnabled, false));
        }
        setCloseIcon(MaterialResources.getDrawable(this.f25977r0, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIcon));
        setCloseIconTint(MaterialResources.getColorStateList(this.f25977r0, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIconTint));
        setCloseIconSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconSize, 0.0f));
        setCheckable(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_android_checkable, false));
        setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconEnabled, false));
        }
        setCheckedIcon(MaterialResources.getDrawable(this.f25977r0, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_checkedIcon));
        int i15 = com.google.android.material.R.styleable.Chip_checkedIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setCheckedIconTint(MaterialResources.getColorStateList(this.f25977r0, typedArrayObtainStyledAttributes, i15));
        }
        setShowMotionSpec(MotionSpec.createFromAttribute(this.f25977r0, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_showMotionSpec));
        setHideMotionSpec(MotionSpec.createFromAttribute(this.f25977r0, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_hideMotionSpec));
        setChipStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStartPadding, 0.0f));
        setIconStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconStartPadding, 0.0f));
        setIconEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconEndPadding, 0.0f));
        setTextStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textStartPadding, 0.0f));
        setTextEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textEndPadding, 0.0f));
        setCloseIconStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconStartPadding, 0.0f));
        setCloseIconEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconEndPadding, 0.0f));
        setChipEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipEndPadding, 0.0f));
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean o0(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.K;
        int iP = p(colorStateList != null ? colorStateList.getColorForState(iArr, this.f25985z0) : 0);
        boolean state = true;
        if (this.f25985z0 != iP) {
            this.f25985z0 = iP;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.L;
        int iP2 = p(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.A0) : 0);
        if (this.A0 != iP2) {
            this.A0 = iP2;
            zOnStateChange = true;
        }
        int iLayer = MaterialColors.layer(iP, iP2);
        if ((this.B0 != iLayer) | (getFillColor() == null)) {
            this.B0 = iLayer;
            setFillColor(ColorStateList.valueOf(iLayer));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.O;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.C0) : 0;
        if (this.C0 != colorForState) {
            this.C0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.O0 == null || !RippleUtils.shouldDrawRippleCompat(iArr)) ? 0 : this.O0.getColorForState(iArr, this.D0);
        if (this.D0 != colorForState2) {
            this.D0 = colorForState2;
            if (this.N0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f25984y0.getTextAppearance() == null || this.f25984y0.getTextAppearance().getTextColor() == null) ? 0 : this.f25984y0.getTextAppearance().getTextColor().getColorForState(iArr, this.E0);
        if (this.E0 != colorForState3) {
            this.E0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = i0(getState(), R.attr.state_checked) && this.f25963d0;
        if (this.F0 == z11 || this.f25965f0 == null) {
            z10 = false;
        } else {
            float fN = N();
            this.F0 = z11;
            if (fN != N()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.K0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.G0) : 0;
        if (this.G0 != colorForState4) {
            this.G0 = colorForState4;
            this.J0 = DrawableUtils.updateTintFilter(this, this.K0, this.L0);
        } else {
            state = zOnStateChange;
        }
        if (k0(this.T)) {
            state |= this.T.setState(iArr);
        }
        if (k0(this.f25965f0)) {
            state |= this.f25965f0.setState(iArr);
        }
        if (k0(this.Y)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.Y.setState(iArr3);
        }
        if (k0(this.Z)) {
            state |= this.Z.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            n0();
        }
        return state;
    }

    private void q0(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            onStateChange(getState());
        }
    }

    private boolean t0() {
        return this.f25964e0 && this.f25965f0 != null && this.F0;
    }

    private boolean u0() {
        return this.S && this.T != null;
    }

    private boolean v0() {
        return this.X && this.Y != null;
    }

    private void w0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void x0() {
        this.O0 = this.N0 ? RippleUtils.sanitizeRippleDrawableColor(this.Q) : null;
    }

    private void y0() {
        this.Z = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(getRippleColor()), this.Y, V0);
    }

    float N() {
        if (u0() || t0()) {
            return this.f25970k0 + g0() + this.f25971l0;
        }
        return 0.0f;
    }

    float R() {
        if (v0()) {
            return this.f25974o0 + this.f25961b0 + this.f25975p0;
        }
        return 0.0f;
    }

    Paint.Align U(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.R != null) {
            float fN = this.f25969j0 + N() + this.f25972m0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                pointF.x = rect.left + fN;
            } else {
                pointF.x = rect.right - fN;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - T();
        }
        return align;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        int iSaveLayerAlpha;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.H0;
        if (i10 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = CanvasCompat.saveLayerAlpha(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        a0(canvas2, bounds);
        X(canvas2, bounds);
        if (this.T0) {
            super.draw(canvas2);
        }
        Z(canvas2, bounds);
        c0(canvas2, bounds);
        Y(canvas2, bounds);
        W(canvas2, bounds);
        if (this.R0) {
            e0(canvas2, bounds);
        }
        b0(canvas2, bounds);
        d0(canvas2, bounds);
        if (this.H0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.H0;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f25965f0;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f25966g0;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        return this.L;
    }

    public float getChipCornerRadius() {
        return this.T0 ? getTopLeftCornerResolvedSize() : this.N;
    }

    public float getChipEndPadding() {
        return this.f25976q0;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable = this.T;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public float getChipIconSize() {
        return this.V;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        return this.U;
    }

    public float getChipMinHeight() {
        return this.M;
    }

    public float getChipStartPadding() {
        return this.f25969j0;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        return this.O;
    }

    public float getChipStrokeWidth() {
        return this.P;
    }

    public void getChipTouchBounds(@NonNull RectF rectF) {
        O(getBounds(), rectF);
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable = this.Y;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        return this.f25962c0;
    }

    public float getCloseIconEndPadding() {
        return this.f25975p0;
    }

    public float getCloseIconSize() {
        return this.f25961b0;
    }

    public float getCloseIconStartPadding() {
        return this.f25974o0;
    }

    @NonNull
    public int[] getCloseIconState() {
        return this.M0;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        return this.f25960a0;
    }

    public void getCloseIconTouchBounds(@NonNull RectF rectF) {
        Q(getBounds(), rectF);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.I0;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.Q0;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.f25968i0;
    }

    public float getIconEndPadding() {
        return this.f25971l0;
    }

    public float getIconStartPadding() {
        return this.f25970k0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f25969j0 + N() + this.f25972m0 + this.f25984y0.getTextWidth(getText().toString()) + this.f25973n0 + R() + this.f25976q0), this.S0);
    }

    @Px
    public int getMaxWidth() {
        return this.S0;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.T0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.N);
        } else {
            outline.setRoundRect(bounds, this.N);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.Q;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.f25967h0;
    }

    @Nullable
    public CharSequence getText() {
        return this.R;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.f25984y0.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.f25973n0;
    }

    public float getTextStartPadding() {
        return this.f25972m0;
    }

    public boolean getUseCompatRipple() {
        return this.N0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.f25963d0;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.f25964e0;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.S;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return k0(this.Y);
    }

    public boolean isCloseIconVisible() {
        return this.X;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (j0(this.K) || j0(this.L) || j0(this.O)) {
            return true;
        }
        return (this.N0 && j0(this.O0)) || l0(this.f25984y0.getTextAppearance()) || V() || k0(this.T) || k0(this.f25965f0) || j0(this.K0);
    }

    protected void n0() {
        Delegate delegate = (Delegate) this.P0.get();
        if (delegate != null) {
            delegate.onChipDrawableSizeChange();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (u0()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.T, i10);
        }
        if (t0()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f25965f0, i10);
        }
        if (v0()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.Y, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (u0()) {
            zOnLevelChange |= this.T.setLevel(i10);
        }
        if (t0()) {
            zOnLevelChange |= this.f25965f0.setLevel(i10);
        }
        if (v0()) {
            zOnLevelChange |= this.Y.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.T0) {
            super.onStateChange(iArr);
        }
        return o0(iArr, getCloseIconState());
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        n0();
        invalidateSelf();
    }

    boolean p0(boolean z10) {
        if (this.Y != null) {
            return setCloseIconState(z10 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : U0);
        }
        return false;
    }

    void r0(boolean z10) {
        this.R0 = z10;
    }

    boolean s0() {
        return this.R0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.H0 != i10) {
            this.H0 = i10;
            invalidateSelf();
        }
    }

    public void setCheckable(boolean z10) {
        if (this.f25963d0 != z10) {
            this.f25963d0 = z10;
            float fN = N();
            if (!z10 && this.F0) {
                this.F0 = false;
            }
            float fN2 = N();
            invalidateSelf();
            if (fN != fN2) {
                n0();
            }
        }
    }

    public void setCheckableResource(@BoolRes int i10) {
        setCheckable(this.f25977r0.getResources().getBoolean(i10));
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        if (this.f25965f0 != drawable) {
            float fN = N();
            this.f25965f0 = drawable;
            float fN2 = N();
            w0(this.f25965f0);
            L(this.f25965f0);
            invalidateSelf();
            if (fN != fN2) {
                n0();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i10) {
        setCheckedIconVisible(this.f25977r0.getResources().getBoolean(i10));
    }

    public void setCheckedIconResource(@DrawableRes int i10) {
        setCheckedIcon(AppCompatResources.getDrawable(this.f25977r0, i10));
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f25966g0 != colorStateList) {
            this.f25966g0 = colorStateList;
            if (V()) {
                this.f25965f0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i10) {
        setCheckedIconTint(AppCompatResources.getColorStateList(this.f25977r0, i10));
    }

    public void setCheckedIconVisible(@BoolRes int i10) {
        setCheckedIconVisible(this.f25977r0.getResources().getBoolean(i10));
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i10) {
        setChipBackgroundColor(AppCompatResources.getColorStateList(this.f25977r0, i10));
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        if (this.N != f10) {
            this.N = f10;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f10));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i10) {
        setChipCornerRadius(this.f25977r0.getResources().getDimension(i10));
    }

    public void setChipEndPadding(float f10) {
        if (this.f25976q0 != f10) {
            this.f25976q0 = f10;
            invalidateSelf();
            n0();
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i10) {
        setChipEndPadding(this.f25977r0.getResources().getDimension(i10));
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float fN = N();
            this.T = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            float fN2 = N();
            w0(chipIcon);
            if (u0()) {
                L(this.T);
            }
            invalidateSelf();
            if (fN != fN2) {
                n0();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(@DrawableRes int i10) {
        setChipIcon(AppCompatResources.getDrawable(this.f25977r0, i10));
    }

    public void setChipIconSize(float f10) {
        if (this.V != f10) {
            float fN = N();
            this.V = f10;
            float fN2 = N();
            invalidateSelf();
            if (fN != fN2) {
                n0();
            }
        }
    }

    public void setChipIconSizeResource(@DimenRes int i10) {
        setChipIconSize(this.f25977r0.getResources().getDimension(i10));
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        this.W = true;
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (u0()) {
                this.T.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipIconTintResource(@ColorRes int i10) {
        setChipIconTint(AppCompatResources.getColorStateList(this.f25977r0, i10));
    }

    public void setChipIconVisible(@BoolRes int i10) {
        setChipIconVisible(this.f25977r0.getResources().getBoolean(i10));
    }

    public void setChipMinHeight(float f10) {
        if (this.M != f10) {
            this.M = f10;
            invalidateSelf();
            n0();
        }
    }

    public void setChipMinHeightResource(@DimenRes int i10) {
        setChipMinHeight(this.f25977r0.getResources().getDimension(i10));
    }

    public void setChipStartPadding(float f10) {
        if (this.f25969j0 != f10) {
            this.f25969j0 = f10;
            invalidateSelf();
            n0();
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i10) {
        setChipStartPadding(this.f25977r0.getResources().getDimension(i10));
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (this.T0) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i10) {
        setChipStrokeColor(AppCompatResources.getColorStateList(this.f25977r0, i10));
    }

    public void setChipStrokeWidth(float f10) {
        if (this.P != f10) {
            this.P = f10;
            this.f25978s0.setStrokeWidth(f10);
            if (this.T0) {
                super.setStrokeWidth(f10);
            }
            invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i10) {
        setChipStrokeWidth(this.f25977r0.getResources().getDimension(i10));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            float fR = R();
            this.Y = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            y0();
            float fR2 = R();
            w0(closeIcon);
            if (v0()) {
                L(this.Y);
            }
            invalidateSelf();
            if (fR != fR2) {
                n0();
            }
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        if (this.f25962c0 != charSequence) {
            this.f25962c0 = BidiFormatter.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        if (this.f25975p0 != f10) {
            this.f25975p0 = f10;
            invalidateSelf();
            if (v0()) {
                n0();
            }
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i10) {
        setCloseIconEndPadding(this.f25977r0.getResources().getDimension(i10));
    }

    public void setCloseIconResource(@DrawableRes int i10) {
        setCloseIcon(AppCompatResources.getDrawable(this.f25977r0, i10));
    }

    public void setCloseIconSize(float f10) {
        if (this.f25961b0 != f10) {
            this.f25961b0 = f10;
            invalidateSelf();
            if (v0()) {
                n0();
            }
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i10) {
        setCloseIconSize(this.f25977r0.getResources().getDimension(i10));
    }

    public void setCloseIconStartPadding(float f10) {
        if (this.f25974o0 != f10) {
            this.f25974o0 = f10;
            invalidateSelf();
            if (v0()) {
                n0();
            }
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i10) {
        setCloseIconStartPadding(this.f25977r0.getResources().getDimension(i10));
    }

    public boolean setCloseIconState(@NonNull int[] iArr) {
        if (Arrays.equals(this.M0, iArr)) {
            return false;
        }
        this.M0 = iArr;
        if (v0()) {
            return o0(getState(), iArr);
        }
        return false;
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f25960a0 != colorStateList) {
            this.f25960a0 = colorStateList;
            if (v0()) {
                this.Y.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCloseIconTintResource(@ColorRes int i10) {
        setCloseIconTint(AppCompatResources.getColorStateList(this.f25977r0, i10));
    }

    public void setCloseIconVisible(@BoolRes int i10) {
        setCloseIconVisible(this.f25977r0.getResources().getBoolean(i10));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.I0 != colorFilter) {
            this.I0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setDelegate(@Nullable Delegate delegate) {
        this.P0 = new WeakReference(delegate);
    }

    public void setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
        this.Q0 = truncateAt;
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f25968i0 = motionSpec;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        setHideMotionSpec(MotionSpec.createFromResource(this.f25977r0, i10));
    }

    public void setIconEndPadding(float f10) {
        if (this.f25971l0 != f10) {
            float fN = N();
            this.f25971l0 = f10;
            float fN2 = N();
            invalidateSelf();
            if (fN != fN2) {
                n0();
            }
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i10) {
        setIconEndPadding(this.f25977r0.getResources().getDimension(i10));
    }

    public void setIconStartPadding(float f10) {
        if (this.f25970k0 != f10) {
            float fN = N();
            this.f25970k0 = f10;
            float fN2 = N();
            invalidateSelf();
            if (fN != fN2) {
                n0();
            }
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i10) {
        setIconStartPadding(this.f25977r0.getResources().getDimension(i10));
    }

    public void setMaxWidth(@Px int i10) {
        this.S0 = i10;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            x0();
            onStateChange(getState());
        }
    }

    public void setRippleColorResource(@ColorRes int i10) {
        setRippleColor(AppCompatResources.getColorStateList(this.f25977r0, i10));
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f25967h0 = motionSpec;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        setShowMotionSpec(MotionSpec.createFromResource(this.f25977r0, i10));
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.R, charSequence)) {
            return;
        }
        this.R = charSequence;
        this.f25984y0.setTextWidthDirty(true);
        invalidateSelf();
        n0();
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        this.f25984y0.setTextAppearance(textAppearance, this.f25977r0);
    }

    public void setTextAppearanceResource(@StyleRes int i10) {
        setTextAppearance(new TextAppearance(this.f25977r0, i10));
    }

    public void setTextColor(@ColorInt int i10) {
        setTextColor(ColorStateList.valueOf(i10));
    }

    public void setTextEndPadding(float f10) {
        if (this.f25973n0 != f10) {
            this.f25973n0 = f10;
            invalidateSelf();
            n0();
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i10) {
        setTextEndPadding(this.f25977r0.getResources().getDimension(i10));
    }

    public void setTextResource(@StringRes int i10) {
        setText(this.f25977r0.getResources().getString(i10));
    }

    public void setTextSize(@Dimension float f10) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextSize(f10);
            this.f25984y0.getTextPaint().setTextSize(f10);
            onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f10) {
        if (this.f25972m0 != f10) {
            this.f25972m0 = f10;
            invalidateSelf();
            n0();
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i10) {
        setTextStartPadding(this.f25977r0.getResources().getDimension(i10));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.L0 != mode) {
            this.L0 = mode;
            this.J0 = DrawableUtils.updateTintFilter(this, this.K0, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z10) {
        if (this.N0 != z10) {
            this.N0 = z10;
            x0();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (u0()) {
            visible |= this.T.setVisible(z10, z11);
        }
        if (t0()) {
            visible |= this.f25965f0.setVisible(z10, z11);
        }
        if (v0()) {
            visible |= this.Y.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        if (this.f25964e0 != z10) {
            boolean zT0 = t0();
            this.f25964e0 = z10;
            boolean zT02 = t0();
            if (zT0 != zT02) {
                if (zT02) {
                    L(this.f25965f0);
                } else {
                    w0(this.f25965f0);
                }
                invalidateSelf();
                n0();
            }
        }
    }

    public void setChipIconVisible(boolean z10) {
        if (this.S != z10) {
            boolean zU0 = u0();
            this.S = z10;
            boolean zU02 = u0();
            if (zU0 != zU02) {
                if (zU02) {
                    L(this.T);
                } else {
                    w0(this.T);
                }
                invalidateSelf();
                n0();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        if (this.X != z10) {
            boolean zV0 = v0();
            this.X = z10;
            boolean zV02 = v0();
            if (zV0 != zV02) {
                if (zV02) {
                    L(this.Y);
                } else {
                    w0(this.Y);
                }
                invalidateSelf();
                n0();
            }
        }
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextColor(colorStateList);
            invalidateSelf();
        }
    }
}

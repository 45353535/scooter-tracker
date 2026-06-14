package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CollapsingTextHelper {
    public static final int SEMITRANSPARENT_MAGENTA = 1090453759;
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private Typeface D;
    private CancelableFontCallback E;
    private CancelableFontCallback F;
    private CharSequence H;
    private CharSequence I;
    private boolean J;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private int Q;
    private int R;
    private int[] S;
    private boolean T;
    private final TextPaint U;
    private final TextPaint V;
    private TimeInterpolator W;
    private TimeInterpolator X;
    private float Y;
    private float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f26695a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f26696a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f26697b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ColorStateList f26698b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26699c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f26700c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f26701d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f26702d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f26703e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f26704e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26705f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private ColorStateList f26706f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f26707g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f26708g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f26709h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f26710h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f26711i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f26712i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f26713j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private StaticLayout f26714j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f26716k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f26718l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f26720m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private CharSequence f26722n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f26723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f26725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f26727q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f26729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f26731s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f26733t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private StaticLayoutBuilderConfigurer f26734t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f26735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f26737v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f26739w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f26740w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f26741x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Typeface f26742y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Typeface f26743z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f26715k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26717l = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f26719m = 15.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f26721n = 15.0f;
    private TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
    private boolean K = true;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f26724o0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f26726p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f26728q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f26730r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f26732s0 = StaticLayoutBuilderCompat.f26845o;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f26736u0 = -1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f26738v0 = -1;

    public CollapsingTextHelper(View view) {
        this.f26695a = view;
        TextPaint textPaint = new TextPaint(129);
        this.U = textPaint;
        this.V = new TextPaint(textPaint);
        this.f26709h = new Rect();
        this.f26707g = new Rect();
        this.f26713j = new RectF();
        this.f26703e = e();
        maybeUpdateFontWeightAdjustment(view.getContext().getResources().getConfiguration());
    }

    private boolean A(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.F;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.f26743z == typeface) {
            return false;
        }
        this.f26743z = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.f26695a.getContext().getResources().getConfiguration(), typeface);
        this.f26742y = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.f26743z;
        }
        this.f26741x = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    private void B(float f10) {
        this.f26720m0 = f10;
        this.f26695a.postInvalidateOnAnimation();
    }

    private boolean C(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.E;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.C == typeface) {
            return false;
        }
        this.C = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.f26695a.getContext().getResources().getConfiguration(), typeface);
        this.B = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.C;
        }
        this.A = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    private void D(float f10) {
        h(f10);
        this.f26695a.postInvalidateOnAnimation();
    }

    private boolean E() {
        if (this.f26724o0 > 1 || this.f26726p0 > 1) {
            return !this.J || this.f26699c;
        }
        return false;
    }

    private boolean F() {
        return this.f26726p0 == 1;
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        float fX;
        i(1.0f, z10);
        if (this.I != null && this.f26714j0 != null) {
            this.f26722n0 = F() ? TextUtils.ellipsize(this.I, this.U, this.f26714j0.getWidth(), this.G) : this.I;
        }
        CharSequence charSequence = this.f26722n0;
        if (charSequence != null) {
            this.f26716k0 = x(this.U, charSequence);
        } else {
            this.f26716k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f26717l, this.J ? 1 : 0);
        Rect rect = this.f26711i;
        if (rect == null) {
            rect = this.f26709h;
        }
        int i10 = absoluteGravity & 112;
        if (i10 == 48) {
            this.f26731s = rect.top;
        } else if (i10 != 80) {
            this.f26731s = rect.centerY() - ((this.U.descent() - this.U.ascent()) / 2.0f);
        } else {
            this.f26731s = rect.bottom + this.U.ascent();
        }
        int i11 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i11 == 1) {
            this.f26735u = rect.centerX() - (this.f26716k0 / 2.0f);
        } else if (i11 != 5) {
            this.f26735u = rect.left;
        } else {
            this.f26735u = rect.right - this.f26716k0;
        }
        if (this.f26716k0 <= this.f26709h.width()) {
            float f10 = this.f26735u;
            float fMax = f10 + Math.max(0.0f, this.f26709h.left - f10);
            this.f26735u = fMax;
            this.f26735u = fMax + Math.min(0.0f, this.f26709h.right - (this.f26716k0 + fMax));
        }
        if (getCollapsedFullSingleLineHeight() <= this.f26709h.height()) {
            float f11 = this.f26731s;
            float fMax2 = f11 + Math.max(0.0f, this.f26709h.top - f11);
            this.f26731s = fMax2;
            this.f26731s = fMax2 + Math.min(0.0f, this.f26709h.bottom - (getCollapsedTextHeight() + fMax2));
        }
        i(0.0f, z10);
        float height = this.f26714j0 != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f26714j0;
        if (staticLayout == null || this.f26724o0 <= 1) {
            CharSequence charSequence2 = this.I;
            fX = charSequence2 != null ? x(this.U, charSequence2) : 0.0f;
        } else {
            fX = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f26714j0;
        this.f26727q = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f26715k, this.J ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        if (i12 == 48) {
            this.f26729r = this.f26707g.top;
        } else if (i12 != 80) {
            this.f26729r = this.f26707g.centerY() - (height / 2.0f);
        } else {
            this.f26729r = (this.f26707g.bottom - height) + (this.f26740w0 ? this.U.descent() : 0.0f);
        }
        int i13 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i13 == 1) {
            this.f26733t = this.f26707g.centerX() - (fX / 2.0f);
        } else if (i13 != 5) {
            this.f26733t = this.f26707g.left;
        } else {
            this.f26733t = this.f26707g.right - fX;
        }
        D(this.f26697b);
    }

    private void c() {
        g(this.f26697b);
    }

    private float d(float f10) {
        float f11 = this.f26703e;
        return f10 <= f11 ? AnimationUtils.lerp(1.0f, 0.0f, this.f26701d, f11, f10) : AnimationUtils.lerp(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f26701d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean zU = u();
        return this.K ? v(charSequence, zU) : zU;
    }

    private void g(float f10) {
        float f11;
        s(f10);
        if (!this.f26699c) {
            this.f26737v = w(this.f26733t, this.f26735u, f10, this.W);
            this.f26739w = w(this.f26729r, this.f26731s, f10, this.W);
            D(f10);
            f11 = f10;
        } else if (f10 < this.f26703e) {
            this.f26737v = this.f26733t;
            this.f26739w = this.f26729r;
            D(0.0f);
            f11 = 0.0f;
        } else {
            this.f26737v = this.f26735u;
            this.f26739w = this.f26731s - Math.max(0, this.f26705f);
            D(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        z(1.0f - w(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        B(w(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f26725p != this.f26723o) {
            this.U.setColor(a(o(), getCurrentCollapsedTextColor(), f11));
        } else {
            this.U.setColor(getCurrentCollapsedTextColor());
        }
        float f12 = this.f26708g0;
        float f13 = this.f26710h0;
        if (f12 != f13) {
            this.U.setLetterSpacing(w(f13, f12, f10, timeInterpolator));
        } else {
            this.U.setLetterSpacing(f12);
        }
        this.N = w(this.f26700c0, this.Y, f10, null);
        this.O = w(this.f26702d0, this.Z, f10, null);
        this.P = w(this.f26704e0, this.f26696a0, f10, null);
        int iA = a(n(this.f26706f0), n(this.f26698b0), f10);
        this.Q = iA;
        this.U.setShadowLayer(this.N, this.O, this.P, iA);
        if (this.f26699c) {
            this.U.setAlpha((int) (d(f10) * this.U.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, MaterialColors.compositeARGBWithAlpha(this.Q, textPaint.getAlpha()));
            }
        }
        this.f26695a.postInvalidateOnAnimation();
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        Typeface typeface;
        float f11;
        float f12;
        if (this.H == null) {
            return;
        }
        float fWidth = this.f26709h.width();
        float fWidth2 = this.f26707g.width();
        if (t(f10, 1.0f)) {
            f11 = F() ? this.f26721n : this.f26719m;
            f12 = F() ? this.f26708g0 : this.f26710h0;
            this.L = F() ? 1.0f : w(this.f26719m, this.f26721n, f10, this.X) / this.f26719m;
            if (!F()) {
                fWidth = fWidth2;
            }
            typeface = this.f26741x;
            fWidth2 = fWidth;
        } else {
            float f13 = this.f26719m;
            float f14 = this.f26710h0;
            typeface = this.A;
            if (t(f10, 0.0f)) {
                this.L = 1.0f;
            } else {
                this.L = w(this.f26719m, this.f26721n, f10, this.X) / this.f26719m;
            }
            float f15 = this.f26721n / this.f26719m;
            float f16 = fWidth2 * f15;
            if (!z10 && !this.f26699c && f16 > fWidth && F()) {
                fWidth2 = Math.min(fWidth / f15, fWidth2);
            }
            f11 = f13;
            f12 = f14;
        }
        int i10 = f10 < 0.5f ? this.f26724o0 : this.f26726p0;
        if (fWidth2 > 0.0f) {
            boolean z11 = this.M != f11;
            boolean z12 = this.f26712i0 != f12;
            boolean z13 = this.D != typeface;
            StaticLayout staticLayout = this.f26714j0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || (this.R != i10) || this.T;
            this.M = f11;
            this.f26712i0 = f12;
            this.D = typeface;
            this.T = false;
            this.R = i10;
            this.U.setLinearText(this.L != 1.0f);
            z = z14;
        }
        if (this.I == null || z) {
            this.U.setTextSize(this.M);
            this.U.setTypeface(this.D);
            this.U.setLetterSpacing(this.f26712i0);
            this.J = f(this.H);
            StaticLayout staticLayoutJ = j(E() ? i10 : 1, this.U, this.H, fWidth2 * (F() ? 1.0f : this.L), this.J);
            this.f26714j0 = staticLayoutJ;
            this.I = staticLayoutJ.getText();
        }
    }

    private StaticLayout j(int i10, TextPaint textPaint, CharSequence charSequence, float f10, boolean z10) {
        StaticLayout staticLayoutBuild;
        try {
            staticLayoutBuild = StaticLayoutBuilderCompat.obtain(charSequence, textPaint, (int) f10).setEllipsize(this.G).setIsRtl(z10).setAlignment(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : p()).setIncludePad(false).setMaxLines(i10).setLineSpacing(this.f26728q0, this.f26730r0).setHyphenationFrequency(this.f26732s0).setStaticLayoutBuilderConfigurer(this.f26734t0).build();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
            staticLayoutBuild = null;
        }
        return (StaticLayout) Preconditions.checkNotNull(staticLayoutBuild);
    }

    private void k(Canvas canvas, float f10, float f11) {
        int alpha = this.U.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f26699c) {
            this.U.setAlpha((int) (this.f26720m0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, MaterialColors.compositeARGBWithAlpha(this.Q, textPaint.getAlpha()));
            }
            this.f26714j0.draw(canvas);
        }
        if (!this.f26699c) {
            this.U.setAlpha((int) (this.f26718l0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.U;
            textPaint2.setShadowLayer(this.N, this.O, this.P, MaterialColors.compositeARGBWithAlpha(this.Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f26714j0.getLineBaseline(0);
        CharSequence charSequence = this.f26722n0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.U);
        if (i10 >= 31) {
            this.U.setShadowLayer(this.N, this.O, this.P, this.Q);
        }
        if (this.f26699c) {
            return;
        }
        String strTrim = this.f26722n0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.U.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f26714j0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.U);
    }

    private float l(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f26716k0 / 2.0f) : ((i11 & GravityCompat.END) == 8388613 || (i11 & 5) == 5) ? this.J ? this.f26709h.left : this.f26709h.right - this.f26716k0 : this.J ? this.f26709h.right - this.f26716k0 : this.f26709h.left;
    }

    private float m(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f26716k0 / 2.0f) : ((i11 & GravityCompat.END) == 8388613 || (i11 & 5) == 5) ? this.J ? rectF.left + this.f26716k0 : this.f26709h.right : this.J ? this.f26709h.right : rectF.left + this.f26716k0;
    }

    private int n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int o() {
        return n(this.f26723o);
    }

    private Layout.Alignment p() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f26715k, this.J ? 1 : 0) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? this.J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void q(TextPaint textPaint) {
        textPaint.setTextSize(this.f26721n);
        textPaint.setTypeface(this.f26741x);
        textPaint.setLetterSpacing(this.f26708g0);
    }

    private void r(TextPaint textPaint) {
        textPaint.setTextSize(this.f26719m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.f26710h0);
    }

    private void s(float f10) {
        if (this.f26699c) {
            this.f26713j.set(f10 < this.f26703e ? this.f26707g : this.f26709h);
            return;
        }
        this.f26713j.left = w(this.f26707g.left, this.f26709h.left, f10, this.W);
        this.f26713j.top = w(this.f26729r, this.f26731s, f10, this.W);
        this.f26713j.right = w(this.f26707g.right, this.f26709h.right, f10, this.W);
        this.f26713j.bottom = w(this.f26707g.bottom, this.f26709h.bottom, f10, this.W);
    }

    private static boolean t(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean u() {
        return this.f26695a.getLayoutDirection() == 1;
    }

    private boolean v(CharSequence charSequence, boolean z10) {
        return (z10 ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    private static float w(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return AnimationUtils.lerp(f10, f11, f12);
    }

    private float x(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean y(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void z(float f10) {
        this.f26718l0 = f10;
        this.f26695a.postInvalidateOnAnimation();
    }

    public void draw(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.I == null || this.f26713j.width() <= 0.0f || this.f26713j.height() <= 0.0f) {
            return;
        }
        this.U.setTextSize(this.M);
        float f10 = this.f26737v;
        float f11 = this.f26739w;
        float f12 = this.L;
        if (f12 != 1.0f && !this.f26699c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (E() && F() && (!this.f26699c || this.f26697b > this.f26703e)) {
            k(canvas, this.f26737v - this.f26714j0.getLineStart(0), f11);
        } else {
            canvas.translate(f10, f11);
            this.f26714j0.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public float getCollapsedFullSingleLineHeight() {
        q(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public float getCollapsedSingleLineHeight() {
        q(this.V);
        return -this.V.ascent();
    }

    public void getCollapsedTextBottomTextBounds(@NonNull RectF rectF, int i10, int i11) {
        this.J = f(this.H);
        rectF.left = Math.max(l(i10, i11), this.f26709h.left);
        rectF.top = this.f26709h.top;
        rectF.right = Math.min(m(rectF, i10, i11), this.f26709h.right);
        rectF.bottom = this.f26709h.top + getCollapsedTextHeight();
        if (this.f26714j0 == null || F()) {
            return;
        }
        float lineWidth = this.f26714j0.getLineWidth(r4.getLineCount() - 1) * (this.f26721n / this.f26719m);
        if (this.J) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    public ColorStateList getCollapsedTextColor() {
        return this.f26725p;
    }

    public int getCollapsedTextGravity() {
        return this.f26717l;
    }

    public float getCollapsedTextHeight() {
        int i10 = this.f26736u0;
        return i10 != -1 ? i10 : getCollapsedSingleLineHeight();
    }

    public float getCollapsedTextSize() {
        return this.f26721n;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.f26741x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @ColorInt
    public int getCurrentCollapsedTextColor() {
        return n(this.f26725p);
    }

    public int getExpandedLineCount() {
        return this.f26727q;
    }

    public int getExpandedMaxLines() {
        return this.f26724o0;
    }

    public ColorStateList getExpandedTextColor() {
        return this.f26723o;
    }

    public float getExpandedTextFullSingleLineHeight() {
        r(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public int getExpandedTextGravity() {
        return this.f26715k;
    }

    public float getExpandedTextHeight() {
        int i10 = this.f26738v0;
        return i10 != -1 ? i10 : getExpandedTextSingleLineHeight();
    }

    public float getExpandedTextSingleLineHeight() {
        r(this.V);
        return -this.V.ascent();
    }

    public float getExpandedTextSize() {
        return this.f26719m;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float getExpansionFraction() {
        return this.f26697b;
    }

    public float getFadeModeThresholdFraction() {
        return this.f26703e;
    }

    @RequiresApi(23)
    public int getHyphenationFrequency() {
        return this.f26732s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f26714j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RequiresApi(23)
    public float getLineSpacingAdd() {
        return this.f26714j0.getSpacingAdd();
    }

    @RequiresApi(23)
    public float getLineSpacingMultiplier() {
        return this.f26714j0.getSpacingMultiplier();
    }

    @Nullable
    public TimeInterpolator getPositionInterpolator() {
        return this.W;
    }

    @Nullable
    public CharSequence getText() {
        return this.H;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.G;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.K;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f26725p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f26723o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void maybeUpdateFontWeightAdjustment(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f26743z;
            if (typeface != null) {
                this.f26742y = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface2);
            }
            Typeface typeface3 = this.f26742y;
            if (typeface3 == null) {
                typeface3 = this.f26743z;
            }
            this.f26741x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            recalculate(true);
        }
    }

    public void recalculate() {
        recalculate(false);
    }

    public void setCollapsedAndExpandedTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f26725p == colorStateList && this.f26723o == colorStateList) {
            return;
        }
        this.f26725p = colorStateList;
        this.f26723o = colorStateList;
        recalculate();
    }

    public void setCollapsedBounds(int i10, int i11, int i12, int i13) {
        if (y(this.f26709h, i10, i11, i12, i13)) {
            return;
        }
        this.f26709h.set(i10, i11, i12, i13);
        this.T = true;
    }

    public void setCollapsedBoundsForOffsets(int i10, int i11, int i12, int i13) {
        if (this.f26711i == null) {
            this.f26711i = new Rect(i10, i11, i12, i13);
            this.T = true;
        }
        if (y(this.f26711i, i10, i11, i12, i13)) {
            return;
        }
        this.f26711i.set(i10, i11, i12, i13);
        this.T = true;
    }

    public void setCollapsedMaxLines(int i10) {
        if (i10 != this.f26726p0) {
            this.f26726p0 = i10;
            recalculate();
        }
    }

    public void setCollapsedTextAppearance(int i10) {
        TextAppearance textAppearance = new TextAppearance(this.f26695a.getContext(), i10);
        if (textAppearance.getTextColor() != null) {
            this.f26725p = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.f26721n = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.f26698b0 = colorStateList;
        }
        this.Z = textAppearance.shadowDx;
        this.f26696a0 = textAppearance.shadowDy;
        this.Y = textAppearance.shadowRadius;
        this.f26708g0 = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.F;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.F = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.1
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setCollapsedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.f26695a.getContext(), this.F);
        recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.f26725p != colorStateList) {
            this.f26725p = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedTextGravity(int i10) {
        if (this.f26717l != i10) {
            this.f26717l = i10;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f10) {
        if (this.f26721n != f10) {
            this.f26721n = f10;
            recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (A(typeface)) {
            recalculate();
        }
    }

    public void setCurrentOffsetY(int i10) {
        this.f26705f = i10;
    }

    public void setExpandedBounds(int i10, int i11, int i12, int i13, boolean z10) {
        if (y(this.f26707g, i10, i11, i12, i13) && z10 == this.f26740w0) {
            return;
        }
        this.f26707g.set(i10, i11, i12, i13);
        this.T = true;
        this.f26740w0 = z10;
    }

    public void setExpandedLetterSpacing(float f10) {
        if (this.f26710h0 != f10) {
            this.f26710h0 = f10;
            recalculate();
        }
    }

    public void setExpandedMaxLines(int i10) {
        if (i10 != this.f26724o0) {
            this.f26724o0 = i10;
            recalculate();
        }
    }

    public void setExpandedTextAppearance(int i10) {
        TextAppearance textAppearance = new TextAppearance(this.f26695a.getContext(), i10);
        if (textAppearance.getTextColor() != null) {
            this.f26723o = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.f26719m = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.f26706f0 = colorStateList;
        }
        this.f26702d0 = textAppearance.shadowDx;
        this.f26704e0 = textAppearance.shadowDy;
        this.f26700c0 = textAppearance.shadowRadius;
        this.f26710h0 = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.E;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.E = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.2
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setExpandedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.f26695a.getContext(), this.E);
        recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.f26723o != colorStateList) {
            this.f26723o = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextGravity(int i10) {
        if (this.f26715k != i10) {
            this.f26715k = i10;
            recalculate();
        }
    }

    public void setExpandedTextSize(float f10) {
        if (this.f26719m != f10) {
            this.f26719m = f10;
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (C(typeface)) {
            recalculate();
        }
    }

    public void setExpansionFraction(float f10) {
        float fClamp = MathUtils.clamp(f10, 0.0f, 1.0f);
        if (fClamp != this.f26697b) {
            this.f26697b = fClamp;
            c();
        }
    }

    public void setFadeModeEnabled(boolean z10) {
        this.f26699c = z10;
    }

    public void setFadeModeStartFraction(float f10) {
        this.f26701d = f10;
        this.f26703e = e();
    }

    @RequiresApi(23)
    public void setHyphenationFrequency(int i10) {
        this.f26732s0 = i10;
    }

    @RequiresApi(23)
    public void setLineSpacingAdd(float f10) {
        this.f26728q0 = f10;
    }

    @RequiresApi(23)
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f10) {
        this.f26730r0 = f10;
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.W = timeInterpolator;
        recalculate();
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.K = z10;
    }

    public final boolean setState(int[] iArr) {
        this.S = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    @RequiresApi(23)
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        if (this.f26734t0 != staticLayoutBuilderConfigurer) {
            this.f26734t0 = staticLayoutBuilderConfigurer;
            recalculate(true);
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.I = null;
            recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        recalculate();
    }

    public void setTitleTextEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.G = truncateAt;
        recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        boolean zA = A(typeface);
        boolean zC = C(typeface);
        if (zA || zC) {
            recalculate();
        }
    }

    public void updateTextHeights(int i10) {
        q(this.V);
        float f10 = i10;
        this.f26736u0 = j(this.f26726p0, this.V, this.H, f10 * (this.f26721n / this.f26719m), this.J).getHeight();
        r(this.V);
        this.f26738v0 = j(this.f26724o0, this.V, this.H, f10, this.J).getHeight();
    }

    public void recalculate(boolean z10) {
        if ((this.f26695a.getHeight() <= 0 || this.f26695a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void setCollapsedBounds(@NonNull Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setExpandedBounds(int i10, int i11, int i12, int i13) {
        setExpandedBounds(i10, i11, i12, i13, true);
    }

    public void setExpandedBounds(@NonNull Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }
}

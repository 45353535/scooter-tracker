package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@OptIn(markerClass = {ExperimentalBadgeUtils.class})
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public static final int BADGE_CONTENT_NOT_TRUNCATED = -2;
    public static final int BADGE_FIXED_EDGE_END = 1;
    public static final int BADGE_FIXED_EDGE_START = 0;

    @Deprecated
    public static final int BOTTOM_END = 8388693;

    @Deprecated
    public static final int BOTTOM_START = 8388691;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f25420o = R.style.Widget_MaterialComponents_Badge;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f25421p = R.attr.badgeStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f25422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaterialShapeDrawable f25423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextDrawableHelper f25424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f25425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BadgeState f25426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f25427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f25428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f25430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f25431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f25432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference f25433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference f25434n;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    private BadgeDrawable(Context context, int i10, int i11, int i12, BadgeState.State state) {
        this.f25422b = new WeakReference(context);
        ThemeEnforcement.checkMaterialTheme(context);
        this.f25425e = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f25424d = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i10, i11, i12, state);
        this.f25426f = badgeState;
        this.f25423c = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context, s() ? badgeState.o() : badgeState.k(), s() ? badgeState.n() : badgeState.j()).build());
        E();
    }

    private void A() {
        J();
        this.f25424d.setTextSizeDirty(true);
        I();
        invalidateSelf();
    }

    private void B() {
        if (hasText()) {
            return;
        }
        v();
    }

    private void C() {
        v();
    }

    private void D() {
        setVisible(this.f25426f.I(), false);
    }

    private void E() {
        x();
        y();
        A();
        v();
        t();
        u();
        z();
        w();
        I();
        D();
    }

    private static void H(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void I() {
        Context context = (Context) this.f25422b.get();
        WeakReference weakReference = this.f25433m;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f25425e);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f25434n;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        c(rect2, view);
        BadgeUtils.updateBadgeBounds(this.f25425e, this.f25427g, this.f25428h, this.f25431k, this.f25432l);
        float f10 = this.f25430j;
        if (f10 != -1.0f) {
            this.f25423c.setCornerSize(f10);
        }
        if (rect.equals(this.f25425e)) {
            return;
        }
        this.f25423c.setBounds(this.f25425e);
    }

    private void J() {
        if (getMaxCharacterCount() != -2) {
            this.f25429i = ((int) Math.pow(10.0d, ((double) getMaxCharacterCount()) - 1.0d)) - 1;
        } else {
            this.f25429i = getMaxNumber();
        }
    }

    private void a(View view) {
        ViewParent customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            customBadgeParent = view.getParent();
        }
        if ((customBadgeParent instanceof View) && (customBadgeParent.getParent() instanceof View)) {
            b(view, (View) customBadgeParent.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(View view, View view2) {
        float y10;
        float x10;
        ViewParent parent;
        boolean z10;
        FrameLayout customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            float y11 = view.getY();
            x10 = view.getX();
            parent = view.getParent();
            y10 = y11;
        } else {
            y10 = 0.0f;
            x10 = 0.0f;
            parent = customBadgeParent;
        }
        while (true) {
            z10 = parent instanceof View;
            if (!z10 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y10 += view3.getY();
            x10 += view3.getX();
            parent = parent.getParent();
        }
        if (z10) {
            float fP = p(y10);
            float fI = i(x10);
            View view4 = (View) parent;
            float fG = g(view4.getHeight(), y10);
            float fL = l(view4.getWidth(), x10);
            if (fP < 0.0f) {
                this.f25428h += Math.abs(fP);
            }
            if (fI < 0.0f) {
                this.f25427g += Math.abs(fI);
            }
            if (fG > 0.0f) {
                this.f25428h -= Math.abs(fG);
            }
            if (fL > 0.0f) {
                this.f25427g -= Math.abs(fL);
            }
        }
    }

    private void c(Rect rect, View view) {
        float f10 = s() ? this.f25426f.f25438d : this.f25426f.f25437c;
        this.f25430j = f10;
        if (f10 != -1.0f) {
            this.f25431k = f10;
            this.f25432l = f10;
        } else {
            this.f25431k = Math.round((s() ? this.f25426f.f25441g : this.f25426f.f25439e) / 2.0f);
            this.f25432l = Math.round((s() ? this.f25426f.f25442h : this.f25426f.f25440f) / 2.0f);
        }
        if (s()) {
            String strF = f();
            this.f25431k = Math.max(this.f25431k, (this.f25424d.getTextWidth(strF) / 2.0f) + this.f25426f.i());
            float fMax = Math.max(this.f25432l, (this.f25424d.getTextHeight(strF) / 2.0f) + this.f25426f.m());
            this.f25432l = fMax;
            this.f25431k = Math.max(this.f25431k, fMax);
        }
        int iR = r();
        int iH = this.f25426f.h();
        if (iH == 8388691 || iH == 8388693) {
            this.f25428h = rect.bottom - iR;
        } else {
            this.f25428h = rect.top + iR;
        }
        int iQ = q();
        int iH2 = this.f25426f.h();
        if (iH2 == 8388659 || iH2 == 8388691) {
            this.f25427g = this.f25426f.f25446l == 0 ? view.getLayoutDirection() == 0 ? (rect.left + this.f25431k) - ((this.f25432l * 2.0f) - iQ) : (rect.right - this.f25431k) + ((this.f25432l * 2.0f) - iQ) : view.getLayoutDirection() == 0 ? (rect.left - this.f25431k) + iQ : (rect.right + this.f25431k) - iQ;
        } else {
            this.f25427g = this.f25426f.f25446l == 0 ? view.getLayoutDirection() == 0 ? (rect.right + this.f25431k) - iQ : (rect.left - this.f25431k) + iQ : view.getLayoutDirection() == 0 ? (rect.right - this.f25431k) + ((this.f25432l * 2.0f) - iQ) : (rect.left + this.f25431k) - ((this.f25432l * 2.0f) - iQ);
        }
        if (this.f25426f.H()) {
            a(view);
        } else {
            b(view, null);
        }
    }

    @NonNull
    public static BadgeDrawable create(@NonNull Context context) {
        return new BadgeDrawable(context, 0, f25421p, f25420o, null);
    }

    @NonNull
    public static BadgeDrawable createFromResource(@NonNull Context context, @XmlRes int i10) {
        return new BadgeDrawable(context, i10, f25421p, f25420o, null);
    }

    static BadgeDrawable d(Context context, BadgeState.State state) {
        return new BadgeDrawable(context, 0, f25421p, f25420o, state);
    }

    private void e(Canvas canvas) {
        String strF = f();
        if (strF != null) {
            Rect rect = new Rect();
            this.f25424d.getTextPaint().getTextBounds(strF, 0, strF.length(), rect);
            float fExactCenterY = this.f25428h - rect.exactCenterY();
            canvas.drawText(strF, this.f25427g, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f25424d.getTextPaint());
        }
    }

    private String f() {
        if (hasText()) {
            return n();
        }
        if (hasNumber()) {
            return j();
        }
        return null;
    }

    private float g(float f10, float f11) {
        return ((this.f25428h + this.f25432l) - f10) + f11;
    }

    private CharSequence h() {
        return this.f25426f.r();
    }

    private float i(float f10) {
        return (this.f25427g - this.f25431k) + f10;
    }

    private String j() {
        if (this.f25429i == -2 || getNumber() <= this.f25429i) {
            return NumberFormat.getInstance(this.f25426f.z()).format(getNumber());
        }
        Context context = (Context) this.f25422b.get();
        return context == null ? "" : String.format(this.f25426f.z(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f25429i), "+");
    }

    private String k() {
        Context context;
        if (this.f25426f.s() == 0 || (context = (Context) this.f25422b.get()) == null) {
            return null;
        }
        return (this.f25429i == -2 || getNumber() <= this.f25429i) ? context.getResources().getQuantityString(this.f25426f.s(), getNumber(), Integer.valueOf(getNumber())) : context.getString(this.f25426f.p(), Integer.valueOf(this.f25429i));
    }

    private float l(float f10, float f11) {
        return ((this.f25427g + this.f25431k) - f10) + f11;
    }

    private String n() {
        String text = getText();
        int maxCharacterCount = getMaxCharacterCount();
        if (maxCharacterCount == -2 || text == null || text.length() <= maxCharacterCount) {
            return text;
        }
        Context context = (Context) this.f25422b.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), text.substring(0, maxCharacterCount - 1), "…");
    }

    private CharSequence o() {
        CharSequence charSequenceQ = this.f25426f.q();
        return charSequenceQ != null ? charSequenceQ : getText();
    }

    private float p(float f10) {
        return (this.f25428h - this.f25432l) + f10;
    }

    private int q() {
        int iT = s() ? this.f25426f.t() : this.f25426f.u();
        if (this.f25426f.f25445k == 1) {
            iT += s() ? this.f25426f.f25444j : this.f25426f.f25443i;
        }
        return iT + this.f25426f.d();
    }

    private int r() {
        int iE = this.f25426f.E();
        if (s()) {
            iE = this.f25426f.D();
            Context context = (Context) this.f25422b.get();
            if (context != null) {
                iE = AnimationUtils.lerp(iE, iE - this.f25426f.v(), AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context) - 1.0f));
            }
        }
        if (this.f25426f.f25445k == 0) {
            iE -= Math.round(this.f25432l);
        }
        return iE + this.f25426f.e();
    }

    private boolean s() {
        return hasText() || hasNumber();
    }

    private void t() {
        this.f25424d.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void u() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f25426f.g());
        if (this.f25423c.getFillColor() != colorStateListValueOf) {
            this.f25423c.setFillColor(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void v() {
        this.f25424d.setTextSizeDirty(true);
        x();
        I();
        invalidateSelf();
    }

    private void w() {
        WeakReference weakReference = this.f25433m;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f25433m.get();
        WeakReference weakReference2 = this.f25434n;
        updateBadgeCoordinates(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private void x() {
        Context context = (Context) this.f25422b.get();
        if (context == null) {
            return;
        }
        this.f25423c.setShapeAppearanceModel(ShapeAppearanceModel.builder(context, s() ? this.f25426f.o() : this.f25426f.k(), s() ? this.f25426f.n() : this.f25426f.j()).build());
        invalidateSelf();
    }

    private void y() {
        TextAppearance textAppearance;
        Context context = (Context) this.f25422b.get();
        if (context == null || this.f25424d.getTextAppearance() == (textAppearance = new TextAppearance(context, this.f25426f.C()))) {
            return;
        }
        this.f25424d.setTextAppearance(textAppearance, context);
        z();
        I();
        invalidateSelf();
    }

    private void z() {
        this.f25424d.getTextPaint().setColor(this.f25426f.l());
        invalidateSelf();
    }

    void F(int i10) {
        this.f25426f.K(i10);
        I();
    }

    void G(int i10) {
        this.f25426f.L(i10);
        I();
    }

    public void clearNumber() {
        if (this.f25426f.F()) {
            this.f25426f.a();
            B();
        }
    }

    public void clearText() {
        if (this.f25426f.G()) {
            this.f25426f.b();
            C();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f25423c.draw(canvas);
        if (s()) {
            e(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f25426f.f();
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.f25423c.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.f25426f.h();
    }

    @NonNull
    public Locale getBadgeNumberLocale() {
        return this.f25426f.z();
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.f25424d.getTextPaint().getColor();
    }

    @Nullable
    public CharSequence getContentDescription() {
        if (isVisible()) {
            return hasText() ? o() : hasNumber() ? k() : h();
        }
        return null;
    }

    @Nullable
    public FrameLayout getCustomBadgeParent() {
        WeakReference weakReference = this.f25434n;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.f25426f.u();
    }

    @Px
    public int getHorizontalOffsetWithText() {
        return this.f25426f.t();
    }

    @Px
    public int getHorizontalOffsetWithoutText() {
        return this.f25426f.u();
    }

    @Px
    public int getHorizontalPadding() {
        return this.f25426f.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f25425e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f25425e.width();
    }

    @Px
    public int getLargeFontVerticalOffsetAdjustment() {
        return this.f25426f.v();
    }

    public int getMaxCharacterCount() {
        return this.f25426f.w();
    }

    public int getMaxNumber() {
        return this.f25426f.x();
    }

    public int getNumber() {
        if (this.f25426f.F()) {
            return this.f25426f.y();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Nullable
    public String getText() {
        return this.f25426f.B();
    }

    public int getVerticalOffset() {
        return this.f25426f.E();
    }

    @Px
    public int getVerticalOffsetWithText() {
        return this.f25426f.D();
    }

    @Px
    public int getVerticalOffsetWithoutText() {
        return this.f25426f.E();
    }

    @Px
    public int getVerticalPadding() {
        return this.f25426f.m();
    }

    public boolean hasNumber() {
        return !this.f25426f.G() && this.f25426f.F();
    }

    public boolean hasText() {
        return this.f25426f.G();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    BadgeState.State m() {
        return this.f25426f.A();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onTextSizeChange() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f25426f.M(i10);
        t();
    }

    @Deprecated
    public void setAutoAdjustToWithinGrandparentBounds(boolean z10) {
        if (this.f25426f.H() == z10) {
            return;
        }
        this.f25426f.N(z10);
        WeakReference weakReference = this.f25433m;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        a((View) this.f25433m.get());
    }

    public void setBackgroundColor(@ColorInt int i10) {
        this.f25426f.O(i10);
        u();
    }

    public void setBadgeFixedEdge(int i10) {
        BadgeState badgeState = this.f25426f;
        if (badgeState.f25446l != i10) {
            badgeState.f25446l = i10;
            I();
        }
    }

    public void setBadgeGravity(int i10) {
        if (i10 == 8388691 || i10 == 8388693) {
            Log.w("Badge", "Bottom badge gravities are deprecated; please use a top gravity instead.");
        }
        if (this.f25426f.h() != i10) {
            this.f25426f.P(i10);
            w();
        }
    }

    public void setBadgeNumberLocale(@NonNull Locale locale) {
        if (locale.equals(this.f25426f.z())) {
            return;
        }
        this.f25426f.h0(locale);
        invalidateSelf();
    }

    public void setBadgeTextColor(@ColorInt int i10) {
        if (this.f25424d.getTextPaint().getColor() != i10) {
            this.f25426f.T(i10);
            z();
        }
    }

    public void setBadgeWithTextShapeAppearance(@StyleRes int i10) {
        this.f25426f.W(i10);
        x();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(@StyleRes int i10) {
        this.f25426f.V(i10);
        x();
    }

    public void setBadgeWithoutTextShapeAppearance(@StyleRes int i10) {
        this.f25426f.S(i10);
        x();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(@StyleRes int i10) {
        this.f25426f.R(i10);
        x();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i10) {
        this.f25426f.X(i10);
    }

    public void setContentDescriptionForText(@Nullable CharSequence charSequence) {
        this.f25426f.Y(charSequence);
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.f25426f.Z(charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i10) {
        this.f25426f.a0(i10);
    }

    public void setHorizontalOffset(int i10) {
        setHorizontalOffsetWithoutText(i10);
        setHorizontalOffsetWithText(i10);
    }

    public void setHorizontalOffsetWithText(@Px int i10) {
        this.f25426f.b0(i10);
        I();
    }

    public void setHorizontalOffsetWithoutText(@Px int i10) {
        this.f25426f.c0(i10);
        I();
    }

    public void setHorizontalPadding(@Px int i10) {
        if (i10 != this.f25426f.i()) {
            this.f25426f.Q(i10);
            I();
        }
    }

    public void setLargeFontVerticalOffsetAdjustment(@Px int i10) {
        this.f25426f.d0(i10);
        I();
    }

    public void setMaxCharacterCount(int i10) {
        if (this.f25426f.w() != i10) {
            this.f25426f.e0(i10);
            A();
        }
    }

    public void setMaxNumber(int i10) {
        if (this.f25426f.x() != i10) {
            this.f25426f.f0(i10);
            A();
        }
    }

    public void setNumber(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f25426f.y() != iMax) {
            this.f25426f.g0(iMax);
            B();
        }
    }

    public void setText(@Nullable String str) {
        if (TextUtils.equals(this.f25426f.B(), str)) {
            return;
        }
        this.f25426f.i0(str);
        C();
    }

    public void setTextAppearance(@StyleRes int i10) {
        this.f25426f.j0(i10);
        y();
    }

    public void setVerticalOffset(int i10) {
        setVerticalOffsetWithoutText(i10);
        setVerticalOffsetWithText(i10);
    }

    public void setVerticalOffsetWithText(@Px int i10) {
        this.f25426f.k0(i10);
        I();
    }

    public void setVerticalOffsetWithoutText(@Px int i10) {
        this.f25426f.l0(i10);
        I();
    }

    public void setVerticalPadding(@Px int i10) {
        if (i10 != this.f25426f.m()) {
            this.f25426f.U(i10);
            I();
        }
    }

    public void setVisible(boolean z10) {
        this.f25426f.m0(z10);
        D();
    }

    @Deprecated
    public void updateBadgeCoordinates(@NonNull View view, @Nullable ViewGroup viewGroup) {
        if (!(viewGroup instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        updateBadgeCoordinates(view, (FrameLayout) viewGroup);
    }

    public void updateBadgeCoordinates(@NonNull View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    public void updateBadgeCoordinates(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.f25433m = new WeakReference(view);
        this.f25434n = new WeakReference(frameLayout);
        H(view);
        I();
        invalidateSelf();
    }
}

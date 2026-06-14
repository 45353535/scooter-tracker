package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.BaselineLayout;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements NavigationBarMenuItemView {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int[] f26974k0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final ActiveIndicatorTransform f26975l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final ActiveIndicatorTransform f26976m0;
    private TextView A;
    private BaselineLayout B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private ColorStateList H;
    private boolean I;
    private MenuItemImpl J;
    private ColorStateList K;
    private Drawable L;
    private Drawable M;
    private ValueAnimator N;
    private ActiveIndicatorTransform O;
    private float P;
    private boolean Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f26977a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26978b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private BadgeDrawable f26979b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorStateList f26980c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f26981c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Drawable f26982d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f26983d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26984e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f26985e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26986f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f26987f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26988g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f26989g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26990h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f26991h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f26992i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f26993i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f26994j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Rect f26995j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f26996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f26997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f26998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f26999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f27001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final LinearLayout f27002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final LinearLayout f27003r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f27004s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FrameLayout f27005t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ImageView f27006u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final BaselineLayout f27007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TextView f27008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final TextView f27009x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BaselineLayout f27010y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TextView f27011z;

    private static class ActiveIndicatorTransform {
        private ActiveIndicatorTransform() {
        }

        protected float a(float f10, float f11) {
            return AnimationUtils.lerp(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10);
        }

        protected float b(float f10) {
            return AnimationUtils.lerp(0.4f, 1.0f, f10);
        }

        protected float c(float f10) {
            return 1.0f;
        }

        public void updateForProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, @NonNull View view) {
            view.setScaleX(b(f10));
            view.setScaleY(c(f10));
            view.setAlpha(a(f10, f11));
        }
    }

    private static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        private ActiveIndicatorUnlabeledTransform() {
            super();
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        protected float c(float f10) {
            return b(f10);
        }
    }

    static {
        f26975l0 = new ActiveIndicatorTransform();
        f26976m0 = new ActiveIndicatorUnlabeledTransform();
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.f26978b = false;
        this.C = -1;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.I = false;
        this.O = f26975l0;
        this.P = 0.0f;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        this.T = -2;
        this.U = 0;
        this.V = false;
        this.W = 0;
        this.f26977a0 = 0;
        this.f26983d0 = 0;
        this.f26985e0 = 49;
        this.f26987f0 = false;
        this.f26989g0 = false;
        this.f26991h0 = false;
        this.f26993i0 = false;
        this.f26995j0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f27002q = (LinearLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_inner_content_container);
        this.f27003r = linearLayout;
        this.f27004s = findViewById(com.google.android.material.R.id.navigation_bar_item_active_indicator_view);
        this.f27005t = (FrameLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_container);
        this.f27006u = (ImageView) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_labels_group);
        this.f27007v = baselineLayout;
        TextView textView = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_small_label_view);
        this.f27008w = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_large_label_view);
        this.f27009x = textView2;
        h();
        this.B = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f26984e = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f26986f = baselineLayout.getPaddingBottom();
        this.f26988g = 0;
        this.f26990h = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.f27011z.setImportantForAccessibility(2);
        this.A.setImportantForAccessibility(2);
        setFocusable(true);
        d();
        this.U = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                NavigationBarItemView.a(this.f27092b, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    private void A(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        r(textView, i10);
        d();
        textView.setMinimumHeight(MaterialResources.getUnscaledLineHeight(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.H;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        z();
    }

    private void B(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        r(textView, i10);
        d();
        textView.setMinimumHeight(MaterialResources.getUnscaledLineHeight(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.H;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private void C() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f26983d0 = 0;
        this.B = this.f27007v;
        int i16 = 8;
        if (this.f26981c0 == 1) {
            if (this.f27010y.getParent() == null) {
                c();
            }
            Rect rect = this.f26995j0;
            int i17 = rect.left;
            int i18 = rect.right;
            int i19 = rect.top;
            i10 = rect.bottom;
            this.f26983d0 = 1;
            int i20 = this.f26977a0;
            this.B = this.f27010y;
            i14 = i19;
            i13 = i18;
            i12 = i17;
            i11 = i20;
            i15 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 8;
            i16 = 0;
        }
        this.f27007v.setVisibility(i16);
        this.f27010y.setVisibility(i15);
        ((FrameLayout.LayoutParams) this.f27002q.getLayoutParams()).gravity = this.f26985e0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f27003r.getLayoutParams();
        layoutParams.leftMargin = i12;
        layoutParams.rightMargin = i13;
        layoutParams.topMargin = i14;
        layoutParams.bottomMargin = i10;
        setPadding(i11, 0, i11, 0);
        updateActiveIndicatorLayoutParams(getWidth());
    }

    private static void D(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    private void E() {
        MenuItemImpl menuItemImpl = this.J;
        if (menuItemImpl != null) {
            setVisibility((!menuItemImpl.isVisible() || (!this.f26987f0 && this.f26989g0)) ? 8 : 0);
        }
    }

    public static /* synthetic */ void a(NavigationBarItemView navigationBarItemView, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        if (navigationBarItemView.f27006u.getVisibility() == 0) {
            navigationBarItemView.x(navigationBarItemView.f27006u);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) navigationBarItemView.f27003r.getLayoutParams();
        int i18 = (i12 - i10) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i19 = (i13 - i11) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z11 = true;
        if (navigationBarItemView.f26981c0 == 1 && navigationBarItemView.T == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) navigationBarItemView.f27004s.getLayoutParams();
            if (navigationBarItemView.T != -2 || navigationBarItemView.f27004s.getMeasuredWidth() == i18) {
                z10 = false;
            } else {
                layoutParams2.width = Math.max(i18, Math.min(navigationBarItemView.R, navigationBarItemView.getMeasuredWidth() - (navigationBarItemView.W * 2)));
                z10 = true;
            }
            if (navigationBarItemView.f27004s.getMeasuredHeight() < i19) {
                layoutParams2.height = i19;
            } else {
                z11 = z10;
            }
            if (z11) {
                navigationBarItemView.f27004s.setLayoutParams(layoutParams2);
            }
        }
    }

    private void c() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f27003r.addView(this.f27010y, layoutParams);
        o();
    }

    private void d() {
        float textSize = this.f27008w.getTextSize();
        float textSize2 = this.f27009x.getTextSize();
        this.f26992i = textSize - textSize2;
        this.f26994j = (textSize2 * 1.0f) / textSize;
        this.f26996k = (textSize * 1.0f) / textSize2;
        float textSize3 = this.f27011z.getTextSize();
        float textSize4 = this.A.getTextSize();
        this.f26997l = textSize3 - textSize4;
        this.f26998m = (textSize4 * 1.0f) / textSize3;
        this.f26999n = (textSize3 * 1.0f) / textSize4;
    }

    private static Drawable f(ColorStateList colorStateList) {
        return new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), null, null);
    }

    private boolean g() {
        return this.f26979b0 != null;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.f26979b0;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.f26979b0.getHorizontalOffset();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f27005t.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f27006u.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private void h() {
        float dimension = getResources().getDimension(com.google.android.material.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.google.android.material.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.f27010y = baselineLayout;
        baselineLayout.setVisibility(8);
        this.f27010y.setDuplicateParentStateEnabled(true);
        this.f27010y.setMeasurePaddingFromBaseline(this.f26991h0);
        TextView textView = new TextView(getContext());
        this.f27011z = textView;
        textView.setMaxLines(1);
        TextView textView2 = this.f27011z;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f27011z.setDuplicateParentStateEnabled(true);
        this.f27011z.setIncludeFontPadding(false);
        this.f27011z.setGravity(16);
        this.f27011z.setTextSize(dimension);
        TextView textView3 = new TextView(getContext());
        this.A = textView3;
        textView3.setMaxLines(1);
        this.A.setEllipsize(truncateAt);
        this.A.setDuplicateParentStateEnabled(true);
        this.A.setVisibility(4);
        this.A.setIncludeFontPadding(false);
        this.A.setGravity(16);
        this.A.setTextSize(dimension2);
        this.f27010y.addView(this.f27011z);
        this.f27010y.addView(this.A);
    }

    private boolean i() {
        return this.V && this.f27000o == 2;
    }

    private void j(final float f10) {
        if (!this.Q || !this.f26978b || !isAttachedToWindow()) {
            n(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.P, f10);
        this.N = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NavigationBarItemView.this.n(((Float) valueAnimator2.getAnimatedValue()).floatValue(), f10);
            }
        });
        this.N.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        this.N.setDuration(MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationLong2, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
        this.N.start();
    }

    private void k() {
        MenuItemImpl menuItemImpl = this.J;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    private void l() {
        Drawable drawableF = this.f26982d;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (this.f26980c != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.Q && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.f26980c), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawableF == null) {
                drawableF = f(this.f26980c);
            }
        }
        this.f27005t.setPadding(0, 0, 0, 0);
        this.f27005t.setForeground(rippleDrawable);
        setBackground(drawableF);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(float f10, float f11) {
        this.O.updateForProgress(f10, f11, this.f27004s);
        this.P = f10;
    }

    private void o() {
        int i10 = this.f27006u.getLayoutParams().width > 0 ? this.f26990h : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f27010y.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i10 : 0;
        }
    }

    private void p(View view, View view2, float f10, float f11) {
        t(this.f27002q, this.f26981c0 == 0 ? (int) (this.f26984e + f11) : 0, 0, this.f26985e0);
        LinearLayout linearLayout = this.f27003r;
        int i10 = this.f26981c0;
        t(linearLayout, i10 == 0 ? 0 : this.f26995j0.top, i10 == 0 ? 0 : this.f26995j0.bottom, i10 == 0 ? 17 : NavigationBarView.ITEM_GRAVITY_START_CENTER);
        D(this.f27007v, this.f26986f);
        this.B.setVisibility(0);
        u(view, 1.0f, 1.0f, 0);
        u(view2, f10, f10, 4);
    }

    private void q() {
        LinearLayout linearLayout = this.f27002q;
        int i10 = this.f26984e;
        t(linearLayout, i10, i10, this.f26981c0 == 0 ? 17 : this.f26985e0);
        t(this.f27003r, 0, 0, 17);
        D(this.f27007v, 0);
        this.B.setVisibility(8);
    }

    private void r(TextView textView, int i10) {
        if (this.f26993i0) {
            TextViewCompat.setTextAppearance(textView, i10);
        } else {
            s(textView, i10);
        }
    }

    private static void s(TextView textView, int i10) {
        TextViewCompat.setTextAppearance(textView, i10);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i10, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    private static void t(View view, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i11;
        layoutParams.gravity = i12;
        view.setLayoutParams(layoutParams);
    }

    private static void u(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private void v(View view) {
        if (g() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.f26979b0, view);
        }
    }

    private void w(View view) {
        if (g()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(this.f26979b0, view);
            }
            this.f26979b0 = null;
        }
    }

    private void x(View view) {
        if (g()) {
            BadgeUtils.setBadgeDrawableBounds(this.f26979b0, view, null);
        }
    }

    private void y() {
        if (i()) {
            this.O = f26976m0;
        } else {
            this.O = f26975l0;
        }
    }

    private void z() {
        TextView textView = this.f27009x;
        textView.setTypeface(textView.getTypeface(), this.I ? 1 : 0);
        TextView textView2 = this.A;
        textView2.setTypeface(textView2.getTypeface(), this.I ? 1 : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.Q) {
            this.f27005t.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    void e() {
        m();
        this.J = null;
        this.P = 0.0f;
        this.f26978b = false;
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        return this.f27004s.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.f26979b0;
    }

    @NonNull
    public BaselineLayout getExpandedLabelGroup() {
        return this.f27010y;
    }

    @DrawableRes
    protected int getItemBackgroundResId() {
        return com.google.android.material.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.J;
    }

    @DimenRes
    protected int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.C;
    }

    @NonNull
    public BaselineLayout getLabelGroup() {
        return this.f27007v;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f27002q.getLayoutParams();
        return this.f27002q.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        if (this.f26981c0 == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f27003r.getLayoutParams();
            return this.f27003r.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f27007v.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams2.leftMargin + this.f27007v.getMeasuredWidth() + layoutParams2.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i10) {
        this.J = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        CharSequence tooltipText = !TextUtils.isEmpty(menuItemImpl.getTooltipText()) ? menuItemImpl.getTooltipText() : menuItemImpl.getTitle();
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, tooltipText);
        }
        E();
        this.f26978b = true;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isExpanded() {
        return this.f26987f0;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isOnlyVisibleWhenExpanded() {
        return this.f26989g0;
    }

    void m() {
        w(this.f27006u);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        MenuItemImpl menuItemImpl = this.J;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.J.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26974k0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f26979b0;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.J.getTitle();
            if (!TextUtils.isEmpty(this.J.getContentDescription())) {
                title = this.J.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f26979b0.getContentDescription()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(com.google.android.material.R.string.item_view_role_description));
    }

    @Override // android.view.View
    protected void onSizeChanged(final int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
            @Override // java.lang.Runnable
            public void run() {
                NavigationBarItemView.this.updateActiveIndicatorLayoutParams(i10);
            }
        });
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        this.f27004s.setBackground(drawable);
        l();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.Q = z10;
        l();
        this.f27004s.setVisibility(z10 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i10) {
        this.U = i10;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(@Px int i10) {
        this.f26977a0 = i10;
        if (this.f26981c0 == 1) {
            setPadding(i10, 0, i10, 0);
        }
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(@NonNull Rect rect) {
        this.f26995j0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i10) {
        this.T = i10;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorHeight(int i10) {
        this.S = i10;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f26988g != i10) {
            this.f26988g = i10;
            ((LinearLayout.LayoutParams) this.f27007v.getLayoutParams()).topMargin = i10;
            if (this.f27010y.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f27010y.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
                if (getLayoutDirection() == 1) {
                    i10 = 0;
                }
                layoutParams.leftMargin = i10;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i10) {
        this.W = i10;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.V = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.R = i10;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        if (this.f26979b0 == badgeDrawable) {
            return;
        }
        if (g() && this.f27006u != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            w(this.f27006u);
        }
        this.f26979b0 = badgeDrawable;
        badgeDrawable.setBadgeFixedEdge(this.f26983d0);
        ImageView imageView = this.f27006u;
        if (imageView != null) {
            v(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z10) {
        setLabelPivots(this.f27009x);
        setLabelPivots(this.f27008w);
        setLabelPivots(this.A);
        setLabelPivots(this.f27011z);
        j(z10 ? 1.0f : 0.0f);
        TextView textView = this.f27009x;
        TextView textView2 = this.f27008w;
        float f10 = this.f26992i;
        float f11 = this.f26994j;
        float f12 = this.f26996k;
        if (this.f26981c0 == 1) {
            textView = this.A;
            textView2 = this.f27011z;
            f10 = this.f26997l;
            f11 = this.f26998m;
            f12 = this.f26999n;
        }
        int i10 = this.f27000o;
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        q();
                    }
                } else if (z10) {
                    p(textView, textView2, f11, f10);
                } else {
                    p(textView2, textView, f12, 0.0f);
                }
            } else if (z10) {
                p(textView, textView2, f11, 0.0f);
            } else {
                q();
            }
        } else if (this.f27001p) {
            if (z10) {
                p(textView, textView2, f11, 0.0f);
            } else {
                q();
            }
        } else if (z10) {
            p(textView, textView2, f11, f10);
        } else {
            p(textView2, textView, f12, 0.0f);
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f27008w.setEnabled(z10);
        this.f27009x.setEnabled(z10);
        this.f27011z.setEnabled(z10);
        this.A.setEnabled(z10);
        this.f27006u.setEnabled(z10);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setExpanded(boolean z10) {
        this.f26987f0 = z10;
        E();
    }

    public void setHorizontalTextAppearanceActive(@StyleRes int i10) {
        this.F = i10;
        TextView textView = this.A;
        if (i10 == 0) {
            i10 = this.D;
        }
        A(textView, i10);
    }

    public void setHorizontalTextAppearanceInactive(@StyleRes int i10) {
        this.G = i10;
        TextView textView = this.f27011z;
        if (i10 == 0) {
            i10 = this.E;
        }
        B(textView, i10);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.L) {
            return;
        }
        this.L = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            this.M = drawable;
            ColorStateList colorStateList = this.K;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f27006u.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        if (this.f26990h != i10) {
            this.f26990h = i10;
            o();
            requestLayout();
        }
    }

    public void setIconSize(int i10) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f27006u.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f27006u.setLayoutParams(layoutParams);
        o();
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.K = colorStateList;
        if (this.J == null || (drawable = this.M) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.M.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : getContext().getDrawable(i10));
    }

    public void setItemGravity(int i10) {
        this.f26985e0 = i10;
        requestLayout();
    }

    public void setItemIconGravity(int i10) {
        if (this.f26981c0 != i10) {
            this.f26981c0 = i10;
            C();
            l();
        }
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f26986f != i10) {
            this.f26986f = i10;
            k();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f26984e != i10) {
            this.f26984e = i10;
            k();
        }
    }

    public void setItemPosition(int i10) {
        this.C = i10;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f26980c = colorStateList;
        l();
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f26993i0 = z10;
        setTextAppearanceActive(this.D);
        setTextAppearanceInactive(this.E);
        setHorizontalTextAppearanceActive(this.F);
        setHorizontalTextAppearanceInactive(this.G);
    }

    public void setLabelMaxLines(int i10) {
        this.f27008w.setMaxLines(i10);
        this.f27009x.setMaxLines(i10);
        this.f27011z.setMaxLines(i10);
        this.A.setMaxLines(i10);
        if (Build.VERSION.SDK_INT > 34) {
            this.f27008w.setGravity(17);
            this.f27009x.setGravity(17);
        } else if (i10 > 1) {
            this.f27008w.setEllipsize(null);
            this.f27009x.setEllipsize(null);
            this.f27008w.setGravity(17);
            this.f27009x.setGravity(17);
        } else {
            this.f27008w.setGravity(16);
            this.f27009x.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f27000o != i10) {
            this.f27000o = i10;
            y();
            updateActiveIndicatorLayoutParams(getWidth());
            k();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f26991h0 = z10;
        this.f27007v.setMeasurePaddingFromBaseline(z10);
        this.f27008w.setIncludeFontPadding(z10);
        this.f27009x.setIncludeFontPadding(z10);
        this.f27010y.setMeasurePaddingFromBaseline(z10);
        this.f27011z.setIncludeFontPadding(z10);
        this.A.setIncludeFontPadding(z10);
        requestLayout();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f26989g0 = z10;
        E();
    }

    public void setShifting(boolean z10) {
        if (this.f27001p != z10) {
            this.f27001p = z10;
            k();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z10, char c10) {
    }

    public void setTextAppearanceActive(@StyleRes int i10) {
        this.D = i10;
        A(this.f27009x, i10);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        this.I = z10;
        setTextAppearanceActive(this.D);
        setHorizontalTextAppearanceActive(this.F);
        z();
    }

    public void setTextAppearanceInactive(@StyleRes int i10) {
        this.E = i10;
        B(this.f27008w, i10);
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.H = colorStateList;
        if (colorStateList != null) {
            this.f27008w.setTextColor(colorStateList);
            this.f27009x.setTextColor(colorStateList);
            this.f27011z.setTextColor(colorStateList);
            this.A.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
        this.f27008w.setText(charSequence);
        this.f27009x.setText(charSequence);
        this.f27011z.setText(charSequence);
        this.A.setText(charSequence);
        MenuItemImpl menuItemImpl = this.J;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.J;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.J.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, charSequence);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public void updateActiveIndicatorLayoutParams(int i10) {
        if (i10 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.R, i10 - (this.W * 2));
            int iMax = this.S;
            if (this.f26981c0 == 1) {
                int measuredWidth = i10 - (this.f26977a0 * 2);
                int i11 = this.T;
                if (i11 != -1) {
                    measuredWidth = i11 == -2 ? this.f27002q.getMeasuredWidth() : Math.min(i11, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.U, this.f27003r.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f27004s.getLayoutParams();
            if (i()) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            this.f27004s.setLayoutParams(layoutParams);
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f26982d = drawable;
        l();
    }
}

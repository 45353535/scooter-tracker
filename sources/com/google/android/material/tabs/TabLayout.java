package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f27845b0 = R.style.Widget_Design_TabLayout;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Pools.Pool f27846c0 = new Pools.SynchronizedPool(16);
    private int A;
    int B;
    int C;
    int D;
    int E;
    boolean F;
    boolean G;
    int H;
    int I;
    boolean J;
    private TabIndicatorInterpolator K;
    private final TimeInterpolator L;
    private BaseOnTabSelectedListener M;
    private final ArrayList N;
    private BaseOnTabSelectedListener O;
    private ValueAnimator P;
    ViewPager Q;
    private PagerAdapter R;
    private DataSetObserver S;
    private TabLayoutOnPageChangeListener T;
    private AdapterChangeListener U;
    private boolean V;
    private int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Pools.Pool f27847a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f27848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f27849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Tab f27850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SlidingTabIndicator f27851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f27852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f27853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f27854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f27855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f27856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f27857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ColorStateList f27859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ColorStateList f27860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ColorStateList f27861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Drawable f27862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    PorterDuff.Mode f27864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f27865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f27866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    float f27867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final int f27868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f27869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f27870x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f27871y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f27872z;

    private class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f27874a;

        AdapterChangeListener() {
        }

        void a(boolean z10) {
            this.f27874a = z10;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.Q == viewPager) {
                tabLayout.A(pagerAdapter2, this.f27874a);
            }
        }
    }

    @Deprecated
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void onTabReselected(T t10);

        void onTabSelected(T t10);

        void onTabUnselected(T t10);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    private class PagerAdapterObserver extends DataSetObserver {
        PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.x();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.x();
        }
    }

    class SlidingTabIndicator extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ValueAnimator f27877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27878c;

        SlidingTabIndicator(Context context) {
            super(context);
            this.f27878c = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f27848b == -1) {
                tabLayout.f27848b = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f27848b);
        }

        private void f(int i10) {
            if (TabLayout.this.W == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.K;
                TabLayout tabLayout = TabLayout.this;
                tabIndicatorInterpolator.c(tabLayout, childAt, tabLayout.f27862p);
                TabLayout.this.f27848b = i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f27862p;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f27862p.getBounds().bottom);
            } else {
                TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.K;
                TabLayout tabLayout = TabLayout.this;
                tabIndicatorInterpolator.d(tabLayout, view, view2, f10, tabLayout.f27862p);
            }
            postInvalidateOnAnimation();
        }

        private void k(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f27848b == i10) {
                return;
            }
            final View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            final View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f27848b = i10;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    SlidingTabIndicator.this.j(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (!z10) {
                this.f27877b.removeAllUpdateListeners();
                this.f27877b.addUpdateListener(animatorUpdateListener);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27877b = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.L);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(animatorUpdateListener);
            valueAnimator.start();
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f27877b;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f27848b != i10) {
                this.f27877b.cancel();
            }
            k(true, i10, i11);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f27862p.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f27862p.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.D;
            if (i10 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    iHeight = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f27862p.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f27862p.getBounds();
                TabLayout.this.f27862p.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f27862p.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int i10, float f10) {
            TabLayout.this.f27848b = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f27877b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f27877b.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        void i(int i10) {
            Rect bounds = TabLayout.this.f27862p.getBounds();
            TabLayout.this.f27862p.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f27877b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.B == 1 || tabLayout.E == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.B = 0;
                    tabLayout2.F(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabIndicatorGravity {
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f27891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27893c;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f27891a = new WeakReference(tabLayout);
        }

        void a() {
            this.f27893c = 0;
            this.f27892b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            this.f27892b = this.f27893c;
            this.f27893c = i10;
            TabLayout tabLayout = (TabLayout) this.f27891a.get();
            if (tabLayout != null) {
                tabLayout.G(this.f27893c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
            boolean z10;
            TabLayout tabLayout = (TabLayout) this.f27891a.get();
            if (tabLayout != null) {
                int i12 = this.f27893c;
                boolean z11 = true;
                if (i12 != 2 || this.f27892b == 1) {
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                if (i12 == 2 && this.f27892b == 0) {
                    z10 = false;
                }
                tabLayout.B(i10, f10, z11, z10, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            TabLayout tabLayout = (TabLayout) this.f27891a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f27893c;
            tabLayout.selectTab(tabLayout.getTabAt(i10), i11 == 0 || (i11 == 2 && this.f27892b == 0));
        }
    }

    public final class TabView extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Tab f27894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f27895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f27896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f27897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private BadgeDrawable f27898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private View f27899g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private TextView f27900h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ImageView f27901i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Drawable f27902j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f27903k;

        public TabView(@NonNull Context context) {
            super(context);
            this.f27903k = 2;
            u(context);
            setPaddingRelative(TabLayout.this.f27852f, TabLayout.this.f27853g, TabLayout.this.f27854h, TabLayout.this.f27855i);
            setGravity(17);
            setOrientation(!TabLayout.this.F ? 1 : 0);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        private void g(final View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    if (view.getVisibility() == 0) {
                        TabView.this.s(view);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public BadgeDrawable getBadge() {
            return this.f27898f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            if (this.f27898f == null) {
                this.f27898f = BadgeDrawable.create(getContext());
            }
            r();
            BadgeDrawable badgeDrawable = this.f27898f;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private float h(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private void i(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(Canvas canvas) {
            Drawable drawable = this.f27902j;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f27902j.draw(canvas);
            }
        }

        private boolean k() {
            return this.f27898f != null;
        }

        private void l() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
            this.f27896d = imageView;
            addView(imageView, 0);
        }

        private void m() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
            this.f27895c = textView;
            addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n() {
            if (this.f27897e != null) {
                q();
            }
            this.f27898f = null;
        }

        private void p(View view) {
            if (k() && view != null) {
                i(false);
                BadgeUtils.attachBadgeDrawable(this.f27898f, view, (FrameLayout) null);
                this.f27897e = view;
            }
        }

        private void q() {
            if (k()) {
                i(true);
                View view = this.f27897e;
                if (view != null) {
                    BadgeUtils.detachBadgeDrawable(this.f27898f, view);
                    this.f27897e = null;
                }
            }
        }

        private void r() {
            Tab tab;
            Tab tab2;
            if (k()) {
                if (this.f27899g != null) {
                    q();
                    return;
                }
                if (this.f27896d != null && (tab2 = this.f27894b) != null && tab2.getIcon() != null) {
                    View view = this.f27897e;
                    ImageView imageView = this.f27896d;
                    if (view == imageView) {
                        s(imageView);
                        return;
                    } else {
                        q();
                        p(this.f27896d);
                        return;
                    }
                }
                if (this.f27895c == null || (tab = this.f27894b) == null || tab.getTabLabelVisibility() != 1) {
                    q();
                    return;
                }
                View view2 = this.f27897e;
                TextView textView = this.f27895c;
                if (view2 == textView) {
                    s(textView);
                } else {
                    q();
                    p(this.f27895c);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(View view) {
            if (k() && view == this.f27897e) {
                BadgeUtils.setBadgeDrawableBounds(this.f27898f, view, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u(Context context) {
            int i10 = TabLayout.this.f27868v;
            if (i10 != 0) {
                Drawable drawable = AppCompatResources.getDrawable(context, i10);
                this.f27902j = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.f27902j.setState(getDrawableState());
                }
            } else {
                this.f27902j = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable rippleDrawable = gradientDrawable;
            if (TabLayout.this.f27861o != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListConvertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(TabLayout.this.f27861o);
                boolean z10 = TabLayout.this.J;
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (z10) {
                    gradientDrawable3 = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable3, z10 ? null : gradientDrawable2);
            }
            setBackground(rippleDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void x(android.widget.TextView r8, android.widget.ImageView r9, boolean r10) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.x(android.widget.TextView, android.widget.ImageView, boolean):void");
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f27902j;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f27902j.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f27895c, this.f27896d, this.f27899g};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f27895c, this.f27896d, this.f27899g};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        @Nullable
        public Tab getTab() {
            return this.f27894b;
        }

        void o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f27898f;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfoCompatWrap.setContentDescription(this.f27898f.getContentDescription());
            }
            accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.f27894b.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                accessibilityNodeInfoCompatWrap.setClickable(false);
                accessibilityNodeInfoCompatWrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
            accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f27869w, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f27895c != null) {
                float f10 = TabLayout.this.f27865s;
                if (isSelected() && TabLayout.this.f27858l != -1) {
                    f10 = TabLayout.this.f27866t;
                }
                int i12 = this.f27903k;
                ImageView imageView = this.f27896d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f27895c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f27867u;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f27895c.getTextSize();
                int lineCount = this.f27895c.getLineCount();
                int maxLines = this.f27895c.getMaxLines();
                if (f10 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                    if (TabLayout.this.E != 1 || f10 <= textSize || lineCount != 1 || ((layout = this.f27895c.getLayout()) != null && h(layout, 0, f10) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f27895c.setTextSize(0, f10);
                        this.f27895c.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f27894b == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f27894b.select();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f27895c;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f27896d;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f27899g;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(@Nullable Tab tab) {
            if (tab != this.f27894b) {
                this.f27894b = tab;
                t();
            }
        }

        final void t() {
            w();
            Tab tab = this.f27894b;
            setSelected(tab != null && tab.isSelected());
        }

        final void v() {
            setOrientation(!TabLayout.this.F ? 1 : 0);
            TextView textView = this.f27900h;
            if (textView == null && this.f27901i == null) {
                x(this.f27895c, this.f27896d, true);
            } else {
                x(textView, this.f27901i, false);
            }
        }

        final void w() {
            ViewParent parent;
            Tab tab = this.f27894b;
            View customView = tab != null ? tab.getCustomView() : null;
            if (customView != null) {
                ViewParent parent2 = customView.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(customView);
                    }
                    View view = this.f27899g;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f27899g);
                    }
                    addView(customView);
                }
                this.f27899g = customView;
                TextView textView = this.f27895c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f27896d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f27896d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) customView.findViewById(android.R.id.text1);
                this.f27900h = textView2;
                if (textView2 != null) {
                    this.f27903k = textView2.getMaxLines();
                }
                this.f27901i = (ImageView) customView.findViewById(android.R.id.icon);
            } else {
                View view2 = this.f27899g;
                if (view2 != null) {
                    removeView(view2);
                    this.f27899g = null;
                }
                this.f27900h = null;
                this.f27901i = null;
            }
            if (this.f27899g == null) {
                if (this.f27896d == null) {
                    l();
                }
                if (this.f27895c == null) {
                    m();
                    this.f27903k = this.f27895c.getMaxLines();
                }
                TextViewCompat.setTextAppearance(this.f27895c, TabLayout.this.f27856j);
                if (!isSelected() || TabLayout.this.f27858l == -1) {
                    TextViewCompat.setTextAppearance(this.f27895c, TabLayout.this.f27857k);
                } else {
                    TextViewCompat.setTextAppearance(this.f27895c, TabLayout.this.f27858l);
                }
                ColorStateList colorStateList = TabLayout.this.f27859m;
                if (colorStateList != null) {
                    this.f27895c.setTextColor(colorStateList);
                }
                x(this.f27895c, this.f27896d, true);
                r();
                g(this.f27896d);
                g(this.f27895c);
            } else {
                TextView textView3 = this.f27900h;
                if (textView3 != null || this.f27901i != null) {
                    x(textView3, this.f27901i, false);
                }
            }
            if (tab == null || TextUtils.isEmpty(tab.f27886d)) {
                return;
            }
            setContentDescription(tab.f27886d);
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager f27907a;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.f27907a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull Tab tab) {
            this.f27907a.setCurrentItem(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    private void C(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.Q;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.T;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.U;
            if (adapterChangeListener != null) {
                this.Q.removeOnAdapterChangeListener(adapterChangeListener);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.O;
        if (baseOnTabSelectedListener != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener);
            this.O = null;
        }
        if (viewPager != null) {
            this.Q = viewPager;
            if (this.T == null) {
                this.T = new TabLayoutOnPageChangeListener(this);
            }
            this.T.a();
            viewPager.addOnPageChangeListener(this.T);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.O = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener((BaseOnTabSelectedListener) viewPagerOnTabSelectedListener);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                A(adapter, z10);
            }
            if (this.U == null) {
                this.U = new AdapterChangeListener();
            }
            this.U.a(z10);
            viewPager.addOnAdapterChangeListener(this.U);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.Q = null;
            A(null, false);
        }
        this.V = z11;
    }

    private void D() {
        int size = this.f27849c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Tab) this.f27849c.get(i10)).g();
        }
    }

    private void E(LinearLayout.LayoutParams layoutParams) {
        if (this.E == 1 && this.B == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private void g(TabItem tabItem) {
        Tab tabNewTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            tabNewTab.setText(charSequence);
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            tabNewTab.setIcon(drawable);
        }
        int i10 = tabItem.customLayout;
        if (i10 != 0) {
            tabNewTab.setCustomView(i10);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            tabNewTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(tabNewTab);
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int size = this.f27849c.size();
        for (int i10 = 0; i10 < size; i10++) {
            Tab tab = (Tab) this.f27849c.get(i10);
            if (tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText())) {
                return !this.F ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f27870x;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.E;
        if (i11 == 0 || i11 == 2) {
            return this.f27872z;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f27851e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h(Tab tab) {
        TabView tabView = tab.view;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f27851e.addView(tabView, tab.getPosition(), p());
    }

    private void i(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        g((TabItem) view);
    }

    private void j(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !isLaidOut() || this.f27851e.d()) {
            setScrollPosition(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iM = m(i10, 0.0f);
        if (scrollX != iM) {
            v();
            this.P.setIntValues(scrollX, iM);
            this.P.start();
        }
        this.f27851e.c(i10, this.C);
    }

    private void k(int i10) {
        if (i10 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f27851e.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f27851e.setGravity(GravityCompat.START);
    }

    private void l() {
        int i10 = this.E;
        this.f27851e.setPaddingRelative((i10 == 0 || i10 == 2) ? Math.max(0, this.A - this.f27852f) : 0, 0, 0, 0);
        int i11 = this.E;
        if (i11 == 0) {
            k(this.B);
        } else if (i11 == 1 || i11 == 2) {
            if (this.B == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f27851e.setGravity(1);
        }
        F(true);
    }

    private int m(int i10, float f10) {
        View childAt;
        int i11 = this.E;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f27851e.getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f27851e.getChildCount() ? this.f27851e.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return getLayoutDirection() == 0 ? left + i13 : left - i13;
    }

    private void n(Tab tab, int i10) {
        tab.f(i10);
        this.f27849c.add(i10, tab);
        int size = this.f27849c.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (((Tab) this.f27849c.get(i12)).getPosition() == this.f27848b) {
                i11 = i12;
            }
            ((Tab) this.f27849c.get(i12)).f(i12);
        }
        this.f27848b = i11;
    }

    private static ColorStateList o(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private LinearLayout.LayoutParams p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        E(layoutParams);
        return layoutParams;
    }

    private TabView r(Tab tab) {
        Pools.Pool pool = this.f27847a0;
        TabView tabView = pool != null ? (TabView) pool.acquire() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.f27886d)) {
            tabView.setContentDescription(tab.f27885c);
            return tabView;
        }
        tabView.setContentDescription(tab.f27886d);
        return tabView;
    }

    private void s(Tab tab) {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            ((BaseOnTabSelectedListener) this.N.get(size)).onTabReselected(tab);
        }
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f27851e.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f27851e.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).w();
                    }
                }
                i11++;
            }
        }
    }

    private void t(Tab tab) {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            ((BaseOnTabSelectedListener) this.N.get(size)).onTabSelected(tab);
        }
    }

    private void u(Tab tab) {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            ((BaseOnTabSelectedListener) this.N.get(size)).onTabUnselected(tab);
        }
    }

    private void v() {
        if (this.P == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.P = valueAnimator;
            valueAnimator.setInterpolator(this.L);
            this.P.setDuration(this.C);
            this.P.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private boolean w() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void z(int i10) {
        TabView tabView = (TabView) this.f27851e.getChildAt(i10);
        this.f27851e.removeViewAt(i10);
        if (tabView != null) {
            tabView.o();
            this.f27847a0.release(tabView);
        }
        requestLayout();
    }

    void A(PagerAdapter pagerAdapter, boolean z10) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.R;
        if (pagerAdapter2 != null && (dataSetObserver = this.S) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.R = pagerAdapter;
        if (z10 && pagerAdapter != null) {
            if (this.S == null) {
                this.S = new PagerAdapterObserver();
            }
            pagerAdapter.registerDataSetObserver(this.S);
        }
        x();
    }

    void B(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        int iRound = Math.round(i10 + f10);
        if (iRound < 0 || iRound >= this.f27851e.getChildCount()) {
            return;
        }
        if (z11) {
            this.f27851e.h(i10, f10);
        }
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.P.cancel();
        }
        int iM = m(i10, f10);
        int scrollX = getScrollX();
        boolean z13 = (i10 < getSelectedTabPosition() && iM >= scrollX) || (i10 > getSelectedTabPosition() && iM <= scrollX) || i10 == getSelectedTabPosition();
        if (getLayoutDirection() == 1) {
            z13 = (i10 < getSelectedTabPosition() && iM <= scrollX) || (i10 > getSelectedTabPosition() && iM >= scrollX) || i10 == getSelectedTabPosition();
        }
        if (z13 || this.W == 1 || z12) {
            if (i10 < 0) {
                iM = 0;
            }
            scrollTo(iM, 0);
        }
        if (z10) {
            setSelectedTabView(iRound);
        }
    }

    void F(boolean z10) {
        for (int i10 = 0; i10 < this.f27851e.getChildCount(); i10++) {
            View childAt = this.f27851e.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            E((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    void G(int i10) {
        this.W = i10;
    }

    public void addOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        addOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab) {
        addTab(tab, this.f27849c.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        i(view);
    }

    public void clearOnTabSelectedListeners() {
        this.N.clear();
    }

    public int getSelectedTabPosition() {
        Tab tab = this.f27850d;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    @Nullable
    public Tab getTabAt(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return (Tab) this.f27849c.get(i10);
    }

    public int getTabCount() {
        return this.f27849c.size();
    }

    public int getTabGravity() {
        return this.B;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f27860n;
    }

    public int getTabIndicatorAnimationMode() {
        return this.I;
    }

    public int getTabIndicatorGravity() {
        return this.D;
    }

    int getTabMaxWidth() {
        return this.f27869w;
    }

    public int getTabMode() {
        return this.E;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f27861o;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f27862p;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f27859m;
    }

    public boolean hasUnboundedRipple() {
        return this.J;
    }

    public boolean isInlineLabel() {
        return this.F;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.G;
    }

    @NonNull
    public Tab newTab() {
        Tab tabQ = q();
        tabQ.parent = this;
        tabQ.view = r(tabQ);
        if (tabQ.f27890h != -1) {
            tabQ.view.setId(tabQ.f27890h);
        }
        return tabQ;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.Q == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                C((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.V) {
            setupWithViewPager(null);
            this.V = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f27851e.getChildCount(); i10++) {
            View childAt = this.f27851e.getChildAt(i10);
            if (childAt instanceof TabView) {
                ((TabView) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return w() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.ViewUtils.dpToPx(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f27871y
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.ViewUtils.dpToPx(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f27869w = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.E
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || w()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    protected Tab q() {
        Tab tab = (Tab) f27846c0.acquire();
        return tab == null ? new Tab() : tab;
    }

    public void removeAllTabs() {
        for (int childCount = this.f27851e.getChildCount() - 1; childCount >= 0; childCount--) {
            z(childCount);
        }
        Iterator it = this.f27849c.iterator();
        while (it.hasNext()) {
            Tab tab = (Tab) it.next();
            it.remove();
            tab.e();
            y(tab);
        }
        this.f27850d = null;
    }

    public void removeOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        removeOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void removeTab(@NonNull Tab tab) {
        if (tab.parent != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        removeTabAt(tab.getPosition());
    }

    public void removeTabAt(int i10) {
        Tab tab = this.f27850d;
        int position = tab != null ? tab.getPosition() : 0;
        z(i10);
        Tab tab2 = (Tab) this.f27849c.remove(i10);
        if (tab2 != null) {
            tab2.e();
            y(tab2);
        }
        int size = this.f27849c.size();
        int i11 = -1;
        for (int i12 = i10; i12 < size; i12++) {
            if (((Tab) this.f27849c.get(i12)).getPosition() == this.f27848b) {
                i11 = i12;
            }
            ((Tab) this.f27849c.get(i12)).f(i12);
        }
        this.f27848b = i11;
        if (position == i10) {
            selectTab(this.f27849c.isEmpty() ? null : (Tab) this.f27849c.get(Math.max(0, i10 - 1)));
        }
    }

    public void selectTab(@Nullable Tab tab) {
        selectTab(tab, true);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        MaterialShapeUtils.setElevation(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            for (int i10 = 0; i10 < this.f27851e.getChildCount(); i10++) {
                View childAt = this.f27851e.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).v();
                }
            }
            l();
        }
    }

    public void setInlineLabelResource(@BoolRes int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        v();
        this.P.addListener(animatorListener);
    }

    public void setScrollPosition(int i10, float f10, boolean z10) {
        setScrollPosition(i10, f10, z10, true);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        this.f27862p = drawableMutate;
        DrawableUtils.setTint(drawableMutate, this.f27863q);
        int intrinsicHeight = this.H;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f27862p.getIntrinsicHeight();
        }
        this.f27851e.i(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i10) {
        this.f27863q = i10;
        DrawableUtils.setTint(this.f27862p, i10);
        F(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.D != i10) {
            this.D = i10;
            this.f27851e.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.H = i10;
        this.f27851e.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.B != i10) {
            this.B = i10;
            l();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f27860n != colorStateList) {
            this.f27860n = colorStateList;
            D();
        }
    }

    public void setTabIconTintResource(@ColorRes int i10) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.I = i10;
        if (i10 == 0) {
            this.K = new TabIndicatorInterpolator();
            return;
        }
        if (i10 == 1) {
            this.K = new ElasticTabIndicatorInterpolator();
        } else {
            if (i10 == 2) {
                this.K = new FadeTabIndicatorInterpolator();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.G = z10;
        this.f27851e.g();
        this.f27851e.postInvalidateOnAnimation();
    }

    public void setTabMode(int i10) {
        if (i10 != this.E) {
            this.E = i10;
            l();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f27861o != colorStateList) {
            this.f27861o = colorStateList;
            for (int i10 = 0; i10 < this.f27851e.getChildCount(); i10++) {
                View childAt = this.f27851e.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i10) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i10));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f27859m != colorStateList) {
            this.f27859m = colorStateList;
            D();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        A(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            for (int i10 = 0; i10 < this.f27851e.getChildCount(); i10++) {
                View childAt = this.f27851e.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    void x() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.R;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                addTab(newTab().setText(this.R.getPageTitle(i10)), false);
            }
            ViewPager viewPager = this.Q;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            selectTab(getTabAt(currentItem));
        }
    }

    protected boolean y(Tab tab) {
        return f27846c0.release(tab);
    }

    public static class Tab {
        public static final int INVALID_POSITION = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f27883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Drawable f27884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f27885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f27886d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f27888f;

        @Nullable
        public TabLayout parent;

        @NonNull
        public TabView view;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f27887e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f27889g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27890h = -1;

        void e() {
            this.parent = null;
            this.view = null;
            this.f27883a = null;
            this.f27884b = null;
            this.f27890h = -1;
            this.f27885c = null;
            this.f27886d = null;
            this.f27887e = -1;
            this.f27888f = null;
        }

        void f(int i10) {
            this.f27887e = i10;
        }

        void g() {
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.t();
            }
        }

        @Nullable
        public BadgeDrawable getBadge() {
            return this.view.getBadge();
        }

        @Nullable
        public CharSequence getContentDescription() {
            TabView tabView = this.view;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @Nullable
        public View getCustomView() {
            return this.f27888f;
        }

        @Nullable
        public Drawable getIcon() {
            return this.f27884b;
        }

        public int getId() {
            return this.f27890h;
        }

        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            return this.view.getOrCreateBadge();
        }

        public int getPosition() {
            return this.f27887e;
        }

        public int getTabLabelVisibility() {
            return this.f27889g;
        }

        @Nullable
        public Object getTag() {
            return this.f27883a;
        }

        @Nullable
        public CharSequence getText() {
            return this.f27885c;
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f27887e;
        }

        public void removeBadge() {
            this.view.n();
        }

        public void select() {
            TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.selectTab(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setContentDescription(@StringRes int i10) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setContentDescription(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setCustomView(@Nullable View view) {
            this.f27888f = view;
            g();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setIcon(@Nullable Drawable drawable) {
            this.f27884b = drawable;
            TabLayout tabLayout = this.parent;
            if (tabLayout.B == 1 || tabLayout.E == 2) {
                tabLayout.F(true);
            }
            g();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setId(int i10) {
            this.f27890h = i10;
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.setId(i10);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setTabLabelVisibility(int i10) {
            this.f27889g = i10;
            TabLayout tabLayout = this.parent;
            if (tabLayout.B == 1 || tabLayout.E == 2) {
                tabLayout.F(true);
            }
            g();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setTag(@Nullable Object obj) {
            this.f27883a = obj;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setText(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f27886d) && !TextUtils.isEmpty(charSequence)) {
                this.view.setContentDescription(charSequence);
            }
            this.f27885c = charSequence;
            g();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setCustomView(@LayoutRes int i10) {
            return setCustomView(LayoutInflater.from(this.view.getContext()).inflate(i10, (ViewGroup) this.view, false));
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setContentDescription(@Nullable CharSequence charSequence) {
            this.f27886d = charSequence;
            g();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setIcon(@DrawableRes int i10) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setIcon(AppCompatResources.getDrawable(tabLayout.getContext(), i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setText(@StringRes int i10) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setText(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Deprecated
    public void addOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        if (this.N.contains(baseOnTabSelectedListener)) {
            return;
        }
        this.N.add(baseOnTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab, int i10) {
        addTab(tab, i10, this.f27849c.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        i(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        this.N.remove(baseOnTabSelectedListener);
    }

    public void selectTab(@Nullable Tab tab, boolean z10) {
        Tab tab2 = this.f27850d;
        if (tab2 == tab) {
            if (tab2 != null) {
                s(tab);
                j(tab.getPosition());
                return;
            }
            return;
        }
        int position = tab != null ? tab.getPosition() : -1;
        if (z10) {
            if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                j(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.f27850d = tab;
        if (tab2 != null && tab2.parent != null) {
            u(tab2);
        }
        if (tab != null) {
            t(tab);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.M;
        if (baseOnTabSelectedListener2 != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener2);
        }
        this.M = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            addOnTabSelectedListener(baseOnTabSelectedListener);
        }
    }

    public void setScrollPosition(int i10, float f10, boolean z10, boolean z11) {
        B(i10, f10, z10, z11, true);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager, boolean z10) {
        C(viewPager, z10, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f27845b0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f27848b = -1;
        this.f27849c = new ArrayList();
        this.f27858l = -1;
        this.f27863q = 0;
        this.f27869w = Integer.MAX_VALUE;
        this.H = -1;
        this.N = new ArrayList();
        this.f27847a0 = new Pools.SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.f27851e = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = R.styleable.TabLayout;
        int i12 = R.styleable.TabLayout_tabTextAppearance;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, iArr, i10, i11, i12);
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(getBackground());
        if (colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListOrNull);
            materialShapeDrawable.initializeElevationOverlay(context2);
            materialShapeDrawable.setElevation(getElevation());
            setBackground(materialShapeDrawable);
        }
        setSelectedTabIndicator(MaterialResources.getDrawable(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayObtainStyledAttributes.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
        slidingTabIndicator.i(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.f27855i = dimensionPixelSize;
        this.f27854h = dimensionPixelSize;
        this.f27853g = dimensionPixelSize;
        this.f27852f = dimensionPixelSize;
        this.f27852f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f27853g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, this.f27853g);
        this.f27854h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, this.f27854h);
        this.f27855i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, this.f27855i);
        if (ThemeEnforcement.isMaterial3Theme(context2)) {
            this.f27856j = R.attr.textAppearanceTitleSmall;
        } else {
            this.f27856j = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(i12, R.style.TextAppearance_Design_Tab);
        this.f27857k = resourceId;
        int[] iArr2 = androidx.appcompat.R.styleable.TextAppearance;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i13 = androidx.appcompat.R.styleable.TextAppearance_android_textSize;
            this.f27865s = typedArrayObtainStyledAttributes2.getDimensionPixelSize(i13, 0);
            int i14 = androidx.appcompat.R.styleable.TextAppearance_android_textColor;
            this.f27859m = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes2, i14);
            typedArrayObtainStyledAttributes2.recycle();
            int i15 = R.styleable.TabLayout_tabSelectedTextAppearance;
            if (typedArrayObtainStyledAttributes.hasValue(i15)) {
                this.f27858l = typedArrayObtainStyledAttributes.getResourceId(i15, resourceId);
            }
            int i16 = this.f27858l;
            if (i16 != -1) {
                typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i16, iArr2);
                try {
                    this.f27866t = typedArrayObtainStyledAttributes2.getDimensionPixelSize(i13, (int) this.f27865s);
                    ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes2, i14);
                    if (colorStateList != null) {
                        this.f27859m = o(this.f27859m.getDefaultColor(), colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor()));
                    }
                } finally {
                }
            }
            int i17 = R.styleable.TabLayout_tabTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i17)) {
                this.f27859m = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i17);
            }
            int i18 = R.styleable.TabLayout_tabSelectedTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i18)) {
                this.f27859m = o(this.f27859m.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(i18, 0));
            }
            this.f27860n = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabIconTint);
            this.f27864r = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIconTintMode, -1), null);
            this.f27861o = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabRippleColor);
            this.C = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.L = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.f27870x = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
            this.f27871y = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
            this.f27868v = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabBackground, 0);
            this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
            this.E = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabMode, 1);
            this.B = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabGravity, 0);
            this.F = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabInlineLabel, false);
            this.J = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabUnboundedRipple, false);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f27867u = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f27872z = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            l();
        } finally {
        }
    }

    public void addTab(@NonNull Tab tab, boolean z10) {
        addTab(tab, this.f27849c.size(), z10);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }

    public void addTab(@NonNull Tab tab, int i10, boolean z10) {
        if (tab.parent == this) {
            n(tab, i10);
            h(tab);
            if (z10) {
                tab.select();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }

    public void setTabTextColors(int i10, int i11) {
        setTabTextColors(o(i10, i11));
    }

    public void setSelectedTabIndicator(@DrawableRes int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}

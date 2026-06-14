package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int M = R.style.Widget_Design_CollapsingToolbar;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;
    private int A;
    private AppBarLayout.OnOffsetChangedListener B;
    int C;
    private int D;
    private int E;
    WindowInsetsCompat F;
    private int G;
    private boolean H;
    private int I;
    private int J;
    private boolean K;
    private int L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f25354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f25355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f25356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Rect f25362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final CollapsingTextHelper f25363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final CollapsingTextHelper f25364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final ElevationOverlayProvider f25365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f25366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f25368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Drawable f25369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Drawable f25370t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f25371u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f25372v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ValueAnimator f25373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f25374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final TimeInterpolator f25375y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final TimeInterpolator f25376z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface CollapsedTitleGravityMode {
    }

    private class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i10) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.C = i10;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.F;
            int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelperL = CollapsingToolbarLayout.l(childAt);
                int i12 = layoutParams.f25379a;
                if (i12 == 1) {
                    viewOffsetHelperL.setTopAndBottomOffset(MathUtils.clamp(-i10, 0, CollapsingToolbarLayout.this.i(childAt)));
                } else if (i12 == 2) {
                    viewOffsetHelperL.setTopAndBottomOffset(Math.round((-i10) * layoutParams.f25380b));
                }
            }
            CollapsingToolbarLayout.this.v();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f25370t != null && systemWindowInsetTop > 0) {
                collapsingToolbarLayout2.postInvalidateOnAnimation();
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int minimumHeight = (height - CollapsingToolbarLayout.this.getMinimumHeight()) - systemWindowInsetTop;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            int i13 = CollapsingToolbarLayout.this.C + minimumHeight;
            float f10 = minimumHeight;
            float fAbs = Math.abs(i10) / f10;
            float f11 = scrimVisibleHeightTrigger / f10;
            CollapsingToolbarLayout.this.f25363m.setFadeModeStartFraction(Math.min(1.0f, f11));
            CollapsingToolbarLayout.this.f25363m.setCurrentOffsetY(i13);
            CollapsingToolbarLayout.this.f25363m.setExpansionFraction(fAbs);
            CollapsingToolbarLayout.this.f25364n.setFadeModeStartFraction(Math.min(1.0f, f11));
            CollapsingToolbarLayout.this.f25364n.setCurrentOffsetY(i13);
            CollapsingToolbarLayout.this.f25364n.setExpansionFraction(fAbs);
        }
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void a(int i10) {
        d();
        ValueAnimator valueAnimator = this.f25373w;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f25373w = valueAnimator2;
            valueAnimator2.setInterpolator(i10 > this.f25371u ? this.f25375y : this.f25376z);
            this.f25373w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator3) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.f25373w.cancel();
        }
        this.f25373w.setDuration(this.f25374x);
        this.f25373w.setIntValues(this.f25371u, i10);
        this.f25373w.start();
    }

    private TextUtils.TruncateAt b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    private void c(AppBarLayout appBarLayout) {
        if (m()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void d() {
        if (this.f25352b) {
            ViewGroup viewGroup = null;
            this.f25354d = null;
            this.f25355e = null;
            int i10 = this.f25353c;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.f25354d = viewGroup2;
                if (viewGroup2 != null) {
                    this.f25355e = e(viewGroup2);
                }
            }
            if (this.f25354d == null) {
                int childCount = getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i11);
                    if (n(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i11++;
                }
                this.f25354d = viewGroup;
            }
            u();
            this.f25352b = false;
        }
    }

    private View e(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    @ColorInt
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorSurfaceContainer);
        if (colorStateListOrNull != null) {
            return colorStateListOrNull.getDefaultColor();
        }
        return this.f25365o.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(R.dimen.design_appbar_elevation));
    }

    private static int h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getSubtitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getSubtitle();
        }
        return null;
    }

    private static CharSequence k(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    static ViewOffsetHelper l(View view) {
        int i10 = R.id.view_offset_helper;
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(i10);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(i10, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    private boolean m() {
        return this.E == 1;
    }

    private static boolean n(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean o(View view) {
        View view2 = this.f25355e;
        return (view2 == null || view2 == this) ? view == this.f25354d : view == view2;
    }

    private void q(boolean z10) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.f25355e;
        if (view == null) {
            view = this.f25354d;
        }
        int i10 = i(view);
        DescendantOffsetUtils.getDescendantRect(this, this.f25356f, this.f25362l);
        ViewGroup viewGroup = this.f25354d;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        }
        Rect rect = this.f25362l;
        int i11 = rect.left + (z10 ? titleMarginEnd : titleMarginStart);
        int i12 = rect.right - (z10 ? titleMarginStart : titleMarginEnd);
        int i13 = rect.top + i10 + titleMarginTop;
        int i14 = (rect.bottom + i10) - titleMarginBottom;
        int collapsedFullSingleLineHeight = (int) (i14 - this.f25364n.getCollapsedFullSingleLineHeight());
        int collapsedFullSingleLineHeight2 = (int) (i13 + this.f25363m.getCollapsedFullSingleLineHeight());
        if (TextUtils.isEmpty(this.f25364n.getText())) {
            this.f25363m.setCollapsedBounds(i11, i13, i12, i14);
        } else {
            this.f25363m.setCollapsedBounds(i11, i13, i12, collapsedFullSingleLineHeight);
            this.f25364n.setCollapsedBounds(i11, collapsedFullSingleLineHeight2, i12, i14);
        }
        if (this.f25368r == 0) {
            DescendantOffsetUtils.getDescendantRect(this, this, this.f25362l);
            Rect rect2 = this.f25362l;
            int i15 = rect2.left + (z10 ? titleMarginEnd : titleMarginStart);
            int i16 = rect2.right;
            if (!z10) {
                titleMarginStart = titleMarginEnd;
            }
            int i17 = i16 - titleMarginStart;
            if (TextUtils.isEmpty(this.f25364n.getText())) {
                this.f25363m.setCollapsedBoundsForOffsets(i15, i13, i17, i14);
            } else {
                this.f25363m.setCollapsedBoundsForOffsets(i15, i13, i17, collapsedFullSingleLineHeight);
                this.f25364n.setCollapsedBoundsForOffsets(i15, collapsedFullSingleLineHeight2, i17, i14);
            }
        }
    }

    private void r() {
        setContentDescription(getTitle());
    }

    private void s(Drawable drawable, int i10, int i11) {
        t(drawable, this.f25354d, i10, i11);
    }

    private void t(Drawable drawable, View view, int i10, int i11) {
        if (m() && view != null && this.f25366p) {
            i11 = view.getBottom();
        }
        drawable.setBounds(0, 0, i10, i11);
    }

    private void u() {
        View view;
        if (!this.f25366p && (view = this.f25356f) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f25356f);
            }
        }
        if (!this.f25366p || this.f25354d == null) {
            return;
        }
        if (this.f25356f == null) {
            this.f25356f = new View(getContext());
        }
        if (this.f25356f.getParent() == null) {
            this.f25354d.addView(this.f25356f, -1, -1);
        }
    }

    private void w(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        if (!this.f25366p || (view = this.f25356f) == null) {
            return;
        }
        boolean z11 = view.isAttachedToWindow() && this.f25356f.getVisibility() == 0;
        this.f25367q = z11;
        if (z11 || z10) {
            boolean z12 = getLayoutDirection() == 1;
            q(z12);
            int i14 = z12 ? this.f25359i : this.f25357g;
            int i15 = this.f25362l.top + this.f25358h;
            int i16 = (i12 - i10) - (z12 ? this.f25357g : this.f25359i);
            int i17 = (i13 - i11) - this.f25360j;
            if (TextUtils.isEmpty(this.f25364n.getText())) {
                this.f25363m.setExpandedBounds(i14, i15, i16, i17);
                this.f25363m.recalculate(z10);
            } else {
                this.f25363m.setExpandedBounds(i14, i15, i16, (int) ((i17 - (this.f25364n.getExpandedTextFullSingleLineHeight() + this.J)) - this.f25361k), false);
                this.f25364n.setExpandedBounds(i14, (int) (i15 + this.f25363m.getExpandedTextFullSingleLineHeight() + this.I + this.f25361k), i16, i17, false);
                this.f25363m.recalculate(z10);
                this.f25364n.recalculate(z10);
            }
        }
    }

    private void x() {
        ViewGroup viewGroup = this.f25354d;
        if (viewGroup == null || !this.f25366p) {
            return;
        }
        CharSequence charSequenceK = k(viewGroup);
        if (TextUtils.isEmpty(this.f25363m.getText()) && !TextUtils.isEmpty(charSequenceK)) {
            setTitle(charSequenceK);
        }
        CharSequence charSequenceJ = j(this.f25354d);
        if (!TextUtils.isEmpty(this.f25364n.getText()) || TextUtils.isEmpty(charSequenceJ)) {
            return;
        }
        setSubtitle(charSequenceJ);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        d();
        if (this.f25354d == null && (drawable = this.f25369s) != null && this.f25371u > 0) {
            drawable.mutate().setAlpha(this.f25371u);
            this.f25369s.draw(canvas);
        }
        if (this.f25366p && this.f25367q) {
            if (this.f25354d == null || this.f25369s == null || this.f25371u <= 0 || !m() || this.f25363m.getExpansionFraction() >= this.f25363m.getFadeModeThresholdFraction()) {
                this.f25363m.draw(canvas);
                this.f25364n.draw(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f25369s.getBounds(), Region.Op.DIFFERENCE);
                this.f25363m.draw(canvas);
                this.f25364n.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f25370t == null || this.f25371u <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.F;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f25370t.setBounds(0, -this.C, getWidth(), systemWindowInsetTop - this.C);
            this.f25370t.mutate().setAlpha(this.f25371u);
            this.f25370t.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (this.f25369s == null || this.f25371u <= 0 || !o(view)) {
            z10 = false;
        } else {
            t(this.f25369s, view, getWidth(), getHeight());
            this.f25369s.mutate().setAlpha(this.f25371u);
            this.f25369s.draw(canvas);
            z10 = true;
        }
        return super.drawChild(canvas, view, j10) || z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f25370t;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f25369s;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.f25363m;
        if (collapsingTextHelper != null) {
            state |= collapsingTextHelper.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public float getCollapsedSubtitleTextSize() {
        return this.f25364n.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedSubtitleTypeface() {
        return this.f25364n.getCollapsedTypeface();
    }

    public int getCollapsedTitleGravity() {
        return this.f25363m.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.f25363m.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.f25363m.getCollapsedTypeface();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.f25369s;
    }

    public float getExpandedSubtitleTextSize() {
        return this.f25364n.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedSubtitleTypeface() {
        return this.f25364n.getExpandedTypeface();
    }

    public int getExpandedTitleGravity() {
        return this.f25363m.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f25360j;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f25359i;
    }

    public int getExpandedTitleMarginStart() {
        return this.f25357g;
    }

    public int getExpandedTitleMarginTop() {
        return this.f25358h;
    }

    public int getExpandedTitleSpacing() {
        return this.f25361k;
    }

    public float getExpandedTitleTextSize() {
        return this.f25363m.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.f25363m.getExpandedTypeface();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f25363m.getHyphenationFrequency();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.f25363m.getLineCount();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f25363m.getLineSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f25363m.getLineSpacingMultiplier();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f25363m.getExpandedMaxLines();
    }

    int getScrimAlpha() {
        return this.f25371u;
    }

    public long getScrimAnimationDuration() {
        return this.f25374x;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.A;
        if (i10 >= 0) {
            return i10 + this.G + this.I + this.J + this.L;
        }
        WindowInsetsCompat windowInsetsCompat = this.F;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.f25370t;
    }

    @Nullable
    public CharSequence getSubtitle() {
        if (this.f25366p) {
            return this.f25364n.getText();
        }
        return null;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.f25366p) {
            return this.f25363m.getText();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.E;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f25363m.getPositionInterpolator();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f25363m.getTitleTextEllipsize();
    }

    final int i(View view) {
        return ((getHeight() - l(view).getLayoutTop()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isExtraMultilineHeightEnabled() {
        return this.K;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isForceApplySystemWindowInsetTop() {
        return this.H;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.f25363m.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.f25366p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.B == null) {
                this.B = new OffsetUpdateListener();
            }
            appBarLayout.addOnOffsetChangedListener(this.B);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f25363m.maybeUpdateFontWeightAdjustment(configuration);
        if (this.D != configuration.orientation && this.K && this.f25363m.getExpansionFraction() == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.D = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.B;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        WindowInsetsCompat windowInsetsCompat = this.F;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < systemWindowInsetTop) {
                    ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            l(getChildAt(i15)).b();
        }
        w(i10, i11, i12, i13, false);
        x();
        v();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            l(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        d();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        WindowInsetsCompat windowInsetsCompat = this.F;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if ((mode == 0 || this.H) && systemWindowInsetTop > 0) {
            this.G = systemWindowInsetTop;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + systemWindowInsetTop, 1073741824));
        }
        x();
        if (!this.f25366p || TextUtils.isEmpty(this.f25363m.getText())) {
            collapsingToolbarLayout = this;
        } else {
            int measuredHeight = getMeasuredHeight();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.w(0, 0, getMeasuredWidth(), measuredHeight, true);
            int expandedTextFullSingleLineHeight = (int) (collapsingToolbarLayout.G + collapsingToolbarLayout.f25358h + collapsingToolbarLayout.f25363m.getExpandedTextFullSingleLineHeight() + (TextUtils.isEmpty(collapsingToolbarLayout.f25364n.getText()) ? 0.0f : collapsingToolbarLayout.f25361k + collapsingToolbarLayout.f25364n.getExpandedTextFullSingleLineHeight()) + collapsingToolbarLayout.f25360j);
            if (expandedTextFullSingleLineHeight > measuredHeight) {
                collapsingToolbarLayout.L = expandedTextFullSingleLineHeight - measuredHeight;
            } else {
                collapsingToolbarLayout.L = 0;
            }
            if (collapsingToolbarLayout.K) {
                if (collapsingToolbarLayout.f25363m.getExpandedMaxLines() > 1) {
                    int expandedLineCount = collapsingToolbarLayout.f25363m.getExpandedLineCount();
                    if (expandedLineCount > 1) {
                        collapsingToolbarLayout.I = Math.round(collapsingToolbarLayout.f25363m.getExpandedTextFullSingleLineHeight()) * (expandedLineCount - 1);
                    } else {
                        collapsingToolbarLayout.I = 0;
                    }
                }
                if (collapsingToolbarLayout.f25364n.getExpandedMaxLines() > 1) {
                    int expandedLineCount2 = collapsingToolbarLayout.f25364n.getExpandedLineCount();
                    if (expandedLineCount2 > 1) {
                        collapsingToolbarLayout.J = Math.round(collapsingToolbarLayout.f25364n.getExpandedTextFullSingleLineHeight()) * (expandedLineCount2 - 1);
                    } else {
                        collapsingToolbarLayout.J = 0;
                    }
                }
            }
            int i12 = collapsingToolbarLayout.L;
            int i13 = collapsingToolbarLayout.I;
            int i14 = collapsingToolbarLayout.J;
            if (i12 + i13 + i14 > 0) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(measuredHeight + i12 + i13 + i14, 1073741824));
            }
        }
        ViewGroup viewGroup = collapsingToolbarLayout.f25354d;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.f25355e;
            if (view == null || view == collapsingToolbarLayout) {
                setMinimumHeight(h(viewGroup));
            } else {
                setMinimumHeight(h(view));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f25369s;
        if (drawable != null) {
            s(drawable, i10, i11);
        }
    }

    WindowInsetsCompat p(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = getFitsSystemWindows() ? windowInsetsCompat : null;
        if (!ObjectsCompat.equals(this.F, windowInsetsCompat2)) {
            this.F = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    public void setCollapsedSubtitleTextAppearance(@StyleRes int i10) {
        this.f25364n.setCollapsedTextAppearance(i10);
    }

    public void setCollapsedSubtitleTextColor(@ColorInt int i10) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedSubtitleTextSize(float f10) {
        this.f25364n.setCollapsedTextSize(f10);
    }

    public void setCollapsedSubtitleTypeface(@Nullable Typeface typeface) {
        this.f25364n.setCollapsedTypeface(typeface);
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f25363m.setCollapsedTextGravity(i10);
        this.f25364n.setCollapsedTextGravity(i10);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i10) {
        this.f25363m.setCollapsedTextAppearance(i10);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextSize(float f10) {
        this.f25363m.setCollapsedTextSize(f10);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.f25363m.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f25369s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f25369s = drawableMutate;
            if (drawableMutate != null) {
                s(drawableMutate, getWidth(), getHeight());
                this.f25369s.setCallback(this);
                this.f25369s.setAlpha(this.f25371u);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(@ColorInt int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(@DrawableRes int i10) {
        setContentScrim(getContext().getDrawable(i10));
    }

    public void setExpandedSubtitleColor(@ColorInt int i10) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedSubtitleTextAppearance(@StyleRes int i10) {
        this.f25364n.setExpandedTextAppearance(i10);
    }

    public void setExpandedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f25364n.setExpandedTextColor(colorStateList);
    }

    public void setExpandedSubtitleTextSize(float f10) {
        this.f25364n.setExpandedTextSize(f10);
    }

    public void setExpandedSubtitleTypeface(@Nullable Typeface typeface) {
        this.f25364n.setExpandedTypeface(typeface);
    }

    public void setExpandedTitleColor(@ColorInt int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.f25363m.setExpandedTextGravity(i10);
        this.f25364n.setExpandedTextGravity(i10);
    }

    public void setExpandedTitleMargin(int i10, int i11, int i12, int i13) {
        this.f25357g = i10;
        this.f25358h = i11;
        this.f25359i = i12;
        this.f25360j = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f25360j = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f25359i = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f25357g = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f25358h = i10;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i10) {
        this.f25361k = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i10) {
        this.f25363m.setExpandedTextAppearance(i10);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f25363m.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTextSize(float f10) {
        this.f25363m.setExpandedTextSize(f10);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.f25363m.setExpandedTypeface(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.K = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.H = z10;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i10) {
        this.f25363m.setHyphenationFrequency(i10);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f10) {
        this.f25363m.setLineSpacingAdd(f10);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f10) {
        this.f25363m.setLineSpacingMultiplier(f10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i10) {
        this.f25363m.setExpandedMaxLines(i10);
        this.f25364n.setExpandedMaxLines(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f25363m.setRtlTextDirectionHeuristicsEnabled(z10);
    }

    void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f25371u) {
            if (this.f25369s != null && (viewGroup = this.f25354d) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.f25371u = i10;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j10) {
        this.f25374x = j10;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i10) {
        if (this.A != i10) {
            this.A = i10;
            v();
        }
    }

    public void setScrimsShown(boolean z10) {
        setScrimsShown(z10, isLaidOut() && !isInEditMode());
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.f25363m.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f25370t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f25370t = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f25370t.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f25370t, getLayoutDirection());
                this.f25370t.setVisible(getVisibility() == 0, false);
                this.f25370t.setCallback(this);
                this.f25370t.setAlpha(this.f25371u);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(@DrawableRes int i10) {
        setStatusBarScrim(getContext().getDrawable(i10));
    }

    public void setSubtitle(@Nullable CharSequence charSequence) {
        this.f25364n.setText(charSequence);
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f25363m.setText(charSequence);
        r();
    }

    public void setTitleCollapseMode(int i10) {
        this.E = i10;
        boolean zM = m();
        this.f25363m.setFadeModeEnabled(zM);
        this.f25364n.setFadeModeEnabled(zM);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (zM && this.f25369s == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.f25363m.setTitleTextEllipsize(truncateAt);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f25366p) {
            this.f25366p = z10;
            r();
            u();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f25363m.setPositionInterpolator(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f25370t;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f25370t.setVisible(z10, false);
        }
        Drawable drawable2 = this.f25369s;
        if (drawable2 == null || drawable2.isVisible() == z10) {
            return;
        }
        this.f25369s.setVisible(z10, false);
    }

    final void v() {
        if (this.f25369s == null && this.f25370t == null) {
            return;
        }
        setScrimsShown(getHeight() + this.C < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f25369s || drawable == this.f25370t;
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f25364n.setCollapsedTextColor(colorStateList);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f25363m.setCollapsedTextColor(colorStateList);
    }

    public void setScrimsShown(boolean z10, boolean z11) {
        if (this.f25372v != z10) {
            if (z11) {
                a(z10 ? 255 : 0);
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.f25372v = z10;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = M;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f25352b = true;
        this.f25362l = new Rect();
        this.A = -1;
        this.G = 0;
        this.I = 0;
        this.J = 0;
        this.L = 0;
        Context context2 = getContext();
        this.D = getResources().getConfiguration().orientation;
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.f25363m = collapsingTextHelper;
        TimeInterpolator timeInterpolator = AnimationUtils.DECELERATE_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(false);
        this.f25365o = new ElevationOverlayProvider(context2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.CollapsingToolbarLayout, i10, i11, new int[0]);
        int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, NavigationBarView.ITEM_GRAVITY_START_CENTER);
        this.f25368r = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_collapsedTitleGravityMode, 1);
        collapsingTextHelper.setExpandedTextGravity(i12);
        collapsingTextHelper.setCollapsedTextGravity(i13);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f25360j = dimensionPixelSize;
        this.f25359i = dimensionPixelSize;
        this.f25358h = dimensionPixelSize;
        this.f25357g = dimensionPixelSize;
        int i14 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f25357g = typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, 0);
        }
        int i15 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f25359i = typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, 0);
        }
        int i16 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            this.f25358h = typedArrayObtainStyledAttributes.getDimensionPixelSize(i16, 0);
        }
        int i17 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            this.f25360j = typedArrayObtainStyledAttributes.getDimensionPixelSize(i17, 0);
        }
        int i18 = R.styleable.CollapsingToolbarLayout_expandedTitleSpacing;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            this.f25361k = typedArrayObtainStyledAttributes.getDimensionPixelSize(i18, 0);
        }
        this.f25366p = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(R.styleable.CollapsingToolbarLayout_title));
        collapsingTextHelper.setExpandedTextAppearance(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        collapsingTextHelper.setCollapsedTextAppearance(androidx.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        int i19 = R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            collapsingTextHelper.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(i19, 0));
        }
        int i20 = R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i20)) {
            collapsingTextHelper.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(i20, 0));
        }
        int i21 = R.styleable.CollapsingToolbarLayout_titleTextEllipsize;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            setTitleEllipsize(b(typedArrayObtainStyledAttributes.getInt(i21, -1)));
        }
        int i22 = R.styleable.CollapsingToolbarLayout_expandedTitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            collapsingTextHelper.setExpandedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i22));
        }
        int i23 = R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            collapsingTextHelper.setCollapsedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i23));
        }
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        int i24 = R.styleable.CollapsingToolbarLayout_titleMaxLines;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            collapsingTextHelper.setExpandedMaxLines(typedArrayObtainStyledAttributes.getInt(i24, 1));
        } else {
            int i25 = R.styleable.CollapsingToolbarLayout_maxLines;
            if (typedArrayObtainStyledAttributes.hasValue(i25)) {
                collapsingTextHelper.setExpandedMaxLines(typedArrayObtainStyledAttributes.getInt(i25, 1));
            }
        }
        int i26 = R.styleable.CollapsingToolbarLayout_titlePositionInterpolator;
        if (typedArrayObtainStyledAttributes.hasValue(i26)) {
            collapsingTextHelper.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(i26, 0)));
        }
        CollapsingTextHelper collapsingTextHelper2 = new CollapsingTextHelper(this);
        this.f25364n = collapsingTextHelper2;
        collapsingTextHelper2.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper2.setRtlTextDirectionHeuristicsEnabled(false);
        int i27 = R.styleable.CollapsingToolbarLayout_subtitle;
        if (typedArrayObtainStyledAttributes.hasValue(i27)) {
            setSubtitle(typedArrayObtainStyledAttributes.getText(i27));
        }
        collapsingTextHelper2.setExpandedTextGravity(i12);
        collapsingTextHelper2.setCollapsedTextGravity(i13);
        collapsingTextHelper2.setExpandedTextAppearance(androidx.appcompat.R.style.TextAppearance_AppCompat_Headline);
        collapsingTextHelper2.setCollapsedTextAppearance(androidx.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        int i28 = R.styleable.CollapsingToolbarLayout_expandedSubtitleTextAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i28)) {
            collapsingTextHelper2.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(i28, 0));
        }
        int i29 = R.styleable.CollapsingToolbarLayout_collapsedSubtitleTextAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i29)) {
            collapsingTextHelper2.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(i29, 0));
        }
        int i30 = R.styleable.CollapsingToolbarLayout_expandedSubtitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i30)) {
            collapsingTextHelper2.setExpandedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i30));
        }
        int i31 = R.styleable.CollapsingToolbarLayout_collapsedSubtitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i31)) {
            collapsingTextHelper2.setCollapsedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i31));
        }
        int i32 = R.styleable.CollapsingToolbarLayout_subtitleMaxLines;
        if (typedArrayObtainStyledAttributes.hasValue(i32)) {
            collapsingTextHelper2.setExpandedMaxLines(typedArrayObtainStyledAttributes.getInt(i32, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(i26)) {
            collapsingTextHelper2.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(i26, 0)));
        }
        this.f25374x = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        int i33 = R.attr.motionEasingStandardInterpolator;
        this.f25375y = MotionUtils.resolveThemeInterpolator(context2, i33, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        this.f25376z = MotionUtils.resolveThemeInterpolator(context2, i33, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.f25353c = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.H = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
                return CollapsingToolbarLayout.this.p(windowInsetsCompat);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f25380b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f25379a = 0;
            this.f25380b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
            this.f25379a = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(typedArrayObtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.f25379a;
        }

        public float getParallaxMultiplier() {
            return this.f25380b;
        }

        public void setCollapseMode(int i10) {
            this.f25379a = i10;
        }

        public void setParallaxMultiplier(float f10) {
            this.f25380b = f10;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f25379a = 0;
            this.f25380b = 0.5f;
        }

        public LayoutParams(int i10, int i11, int i12) {
            super(i10, i11, i12);
            this.f25379a = 0;
            this.f25380b = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f25379a = 0;
            this.f25380b = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f25379a = 0;
            this.f25380b = 0.5f;
        }

        public LayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f25379a = 0;
            this.f25380b = 0.5f;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.f25379a = 0;
            this.f25380b = 0.5f;
            this.f25379a = layoutParams.f25379a;
            this.f25380b = layoutParams.f25380b;
        }
    }
}

package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes9.dex */
public class SearchBar extends Toolbar {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f27296y = R.style.Widget_Material3_SearchBar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f27297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f27298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FrameLayout f27299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f27300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ColorStateList f27302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f27303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f27304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SearchBarAnimationHelper f27305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Drawable f27306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f27307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f27308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f27309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f27310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f27311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f27313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MaterialShapeDrawable f27314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f27315t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f27316u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ActionMenuView f27317v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ImageButton f27318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AppBarLayout.LiftOnScrollProgressListener f27319x;

    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchBar.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f27321b;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f27321b);
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27321b = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    private void e() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists == null || this.f27302g == null) {
            return;
        }
        appBarLayoutParentIfExists.addLiftOnScrollProgressListener(this.f27319x);
    }

    private int f(int i10, int i11) {
        return i10 == 0 ? i11 : i10;
    }

    private ActionMenuView g() {
        if (this.f27317v == null) {
            this.f27317v = ToolbarUtils.getActionMenuView(this);
        }
        return this.f27317v;
    }

    @Nullable
    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private ImageButton h() {
        if (this.f27318w == null) {
            this.f27318w = ToolbarUtils.getNavigationIconButton(this);
        }
        return this.f27318w;
    }

    private void i(ShapeAppearanceModel shapeAppearanceModel, int i10, float f10, float f11, int i11) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        this.f27314s = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.f27314s.setElevation(f10);
        if (f11 >= 0.0f) {
            this.f27314s.setStroke(f11, i11);
        }
        int color = MaterialColors.getColor(this, androidx.appcompat.R.attr.colorControlHighlight);
        this.f27314s.setFillColor(ColorStateList.valueOf(i10));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        MaterialShapeDrawable materialShapeDrawable2 = this.f27314s;
        setBackground(new RippleDrawable(colorStateListValueOf, materialShapeDrawable2, materialShapeDrawable2));
    }

    private void j() {
        setNavigationIcon(getNavigationIcon() == null ? this.f27306k : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    private void k(int i10, String str, String str2) {
        if (i10 != -1) {
            TextViewCompat.setTextAppearance(this.f27297b, i10);
            TextViewCompat.setTextAppearance(this.f27298c, i10);
        }
        setText(str);
        setHint(str2);
        setTextCentered(this.f27315t);
    }

    private void l(View view, int i10, int i11, int i12, int i13) {
        if (getLayoutDirection() == 1) {
            view.layout(getMeasuredWidth() - i12, i11, getMeasuredWidth() - i10, i13);
        } else {
            view.layout(i10, i11, i12, i13);
        }
    }

    private void m() {
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f27299d.getMeasuredWidth() / 2);
        int measuredWidth2 = this.f27299d.getMeasuredWidth() + measuredWidth;
        int measuredHeight = (getMeasuredHeight() / 2) - (this.f27299d.getMeasuredHeight() / 2);
        int measuredHeight2 = this.f27299d.getMeasuredHeight() + measuredHeight;
        boolean z10 = getLayoutDirection() == 1;
        View viewG = g();
        ImageButton imageButtonH = h();
        int measuredWidth3 = (this.f27299d.getMeasuredWidth() / 2) - (this.f27297b.getMeasuredWidth() / 2);
        int measuredWidth4 = this.f27297b.getMeasuredWidth() + measuredWidth3;
        int i10 = measuredWidth3 + measuredWidth;
        int i11 = measuredWidth4 + measuredWidth;
        View view = z10 ? viewG : imageButtonH;
        if (z10) {
            viewG = imageButtonH;
        }
        int iMax = view != null ? Math.max(view.getRight() - i10, 0) : 0;
        int i12 = i10 + iMax;
        int i13 = i11 + iMax;
        int iMax2 = viewG != null ? Math.max(i13 - viewG.getLeft(), 0) : 0;
        int i14 = i12 - iMax2;
        int i15 = i13 - iMax2;
        int iMax3 = ((iMax - iMax2) + Math.max(Math.max(getPaddingLeft() - i14, getContentInsetLeft() - i14), 0)) - Math.max(Math.max(i15 - (getMeasuredWidth() - getPaddingRight()), i15 - (getMeasuredWidth() - getContentInsetRight())), 0);
        this.f27299d.layout(measuredWidth + iMax3, measuredHeight, measuredWidth2 + iMax3, measuredHeight2);
    }

    private void n(View view) {
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i10 = measuredWidth2 + measuredWidth;
        int measuredHeight = view.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        l(view, measuredWidth2, measuredHeight2, i10, measuredHeight2 + measuredHeight);
    }

    private Drawable o(Drawable drawable) {
        int color;
        if (!this.f27307l || drawable == null) {
            return drawable;
        }
        Integer num = this.f27310o;
        if (num != null) {
            color = num.intValue();
        } else {
            color = MaterialColors.getColor(this, drawable == this.f27306k ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        drawableWrap.setTint(color);
        return drawableWrap;
    }

    private void p(int i10, int i11) {
        View view = this.f27309n;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    private void q() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.removeLiftOnScrollProgressListener(this.f27319x);
        }
    }

    private void r() {
        if (this.f27304i && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = f(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = f(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = f(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = f(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void s() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z10 = getLayoutDirection() == 1;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        int width = (navigationIconButton == null || !navigationIconButton.isClickable()) ? 0 : z10 ? getWidth() - navigationIconButton.getLeft() : navigationIconButton.getRight();
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this);
        int right = actionMenuView != null ? z10 ? actionMenuView.getRight() : getWidth() - actionMenuView.getLeft() : 0;
        float f10 = -(z10 ? right : width);
        if (!z10) {
            width = right;
        }
        setHandwritingBoundsOffsets(f10, 0.0f, -width, 0.0f);
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        navigationIconButton.setClickable(!z10);
        navigationIconButton.setFocusable(!z10);
        Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.f27311p = background;
        }
        navigationIconButton.setBackgroundDrawable(z10 ? null : this.f27311p);
        s();
    }

    private void t() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.f27313r) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    private void u(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    public void addCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f27305j.h(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f27305j.i(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        this.f27305j.j(onLoadAnimationCallback);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f27303h && this.f27309n == null && !(view instanceof ActionMenuView)) {
            this.f27309n = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public void clearText() {
        this.f27297b.setText("");
        this.f27298c.setText("");
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view) {
        return collapse(view, null);
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view) {
        return expand(view, null);
    }

    @Nullable
    public View getCenterView() {
        return this.f27309n;
    }

    float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.f27314s;
        return materialShapeDrawable != null ? materialShapeDrawable.getElevation() : getElevation();
    }

    public float getCornerSize() {
        return this.f27314s.getTopLeftCornerResolvedSize();
    }

    @DimenRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    @Nullable
    public CharSequence getHint() {
        return this.f27297b.getHint();
    }

    @Px
    public int getMaxWidth() {
        return this.f27316u;
    }

    int getMenuResId() {
        return this.f27312q;
    }

    TextView getPlaceholderTextView() {
        return this.f27298c;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.f27314s.getStrokeColor().getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f27314s.getStrokeWidth();
    }

    @NonNull
    public CharSequence getText() {
        return this.f27297b.getText();
    }

    public boolean getTextCentered() {
        return this.f27315t;
    }

    @NonNull
    public TextView getTextView() {
        return this.f27297b;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@MenuRes int i10) {
        super.inflateMenu(i10);
        this.f27312q = i10;
    }

    public boolean isCollapsing() {
        return this.f27305j.x();
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.f27313r;
    }

    public boolean isExpanding() {
        return this.f27305j.y();
    }

    public boolean isLiftOnScroll() {
        return this.f27301f;
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.f27305j.z();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.f27314s);
        r();
        t();
        if (this.f27301f) {
            e();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f27309n;
        if (view != null) {
            n(view);
        }
        s();
        if (this.f27297b == null || !this.f27315t) {
            return;
        }
        m();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12 = this.f27316u;
        if (i12 >= 0 && i12 < View.MeasureSpec.getSize(i10)) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f27316u, View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        p(i10, i11);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f27321b);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f27321b = text == null ? null : text.toString();
        return savedState;
    }

    public boolean removeCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f27305j.A(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f27305j.B(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.f27305j.C(onLoadAnimationCallback);
    }

    public void setCenterView(@Nullable View view) {
        View view2 = this.f27309n;
        if (view2 != null) {
            removeView(view2);
            this.f27309n = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f27313r = z10;
        t();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        MaterialShapeDrawable materialShapeDrawable = this.f27314s;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f10);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f27297b.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f27301f = z10;
        if (z10) {
            e();
        } else {
            q();
        }
    }

    public void setMaxWidth(@Px int i10) {
        if (this.f27316u != i10) {
            this.f27316u = i10;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(o(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f27308m) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        this.f27305j.D(z10);
    }

    void setPlaceholderText(String str) {
        this.f27298c.setText(str);
    }

    public void setStrokeColor(@ColorInt int i10) {
        if (getStrokeColor() != i10) {
            this.f27314s.setStrokeColor(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(@Dimension float f10) {
        if (getStrokeWidth() != f10) {
            this.f27314s.setStrokeWidth(f10);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.f27297b.setText(charSequence);
        this.f27298c.setText(charSequence);
    }

    public void setTextCentered(boolean z10) {
        this.f27315t = z10;
        TextView textView = this.f27297b;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z10) {
            layoutParams.gravity = 1;
            this.f27297b.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            this.f27297b.setGravity(0);
        }
        this.f27297b.setLayoutParams(layoutParams);
        this.f27298c.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void startOnLoadAnimation() {
        post(new Runnable() { // from class: com.google.android.material.search.b
            @Override // java.lang.Runnable
            public final void run() {
                SearchBar searchBar = this.f27394b;
                searchBar.f27305j.G(searchBar);
            }
        });
    }

    public void stopOnLoadAnimation() {
        this.f27305j.H(this);
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f27322i;

        public ScrollingViewBehavior() {
            this.f27322i = false;
        }

        private void m(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        protected boolean h() {
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            boolean zOnDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.f27322i && (view2 instanceof AppBarLayout)) {
                this.f27322i = true;
                m((AppBarLayout) view2);
            }
            return zOnDependentViewChanged;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27322i = false;
        }
    }

    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    public void setHint(@StringRes int i10) {
        this.f27297b.setHint(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f27296y;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f27312q = -1;
        this.f27319x = new AppBarLayout.LiftOnScrollProgressListener() { // from class: com.google.android.material.search.SearchBar.1
            @Override // com.google.android.material.appbar.AppBarLayout.LiftOnScrollProgressListener
            public void onUpdate(float f10, int i12, float f11) {
                if (SearchBar.this.f27302g != null) {
                    SearchBar.this.f27314s.setFillColor(ColorStateList.valueOf(MaterialColors.layer(SearchBar.this.f27300e, SearchBar.this.f27302g.getDefaultColor(), f11)));
                }
            }
        };
        Context context2 = getContext();
        u(attributeSet);
        this.f27306k = AppCompatResources.getDrawable(context2, getDefaultNavigationIconResource());
        this.f27305j = new SearchBarAnimationHelper();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.SearchBar, i10, i11, new int[0]);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i10, i11).build();
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SearchBar_backgroundTint, 0);
        this.f27300e = color;
        this.f27302g = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.SearchBar_liftOnScrollColor);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.SearchBar_elevation, 0.0f);
        this.f27304i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_defaultMarginsEnabled, true);
        this.f27313r = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_hideNavigationIcon, false);
        this.f27308m = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.f27307l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_tintNavigationIcon, true);
        int i12 = R.styleable.SearchBar_navigationIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f27310o = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i12, -1));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SearchBar_android_textAppearance, -1);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SearchBar_android_text);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.SearchBar_android_hint);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.SearchBar_strokeWidth, -1.0f);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.SearchBar_strokeColor, 0);
        this.f27315t = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_textCentered, false);
        this.f27301f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_liftOnScroll, false);
        this.f27316u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SearchBar_android_maxWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (!z10) {
            j();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.f27303h = true;
        this.f27297b = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.f27298c = (TextView) findViewById(R.id.open_search_bar_placeholder_text_view);
        this.f27299d = (FrameLayout) findViewById(R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        k(resourceId, string, string2);
        i(shapeAppearanceModelBuild, color, dimension, dimension2, color2);
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z10) {
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        this.f27305j.E(this, view, appBarLayout, z10);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z10) {
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        this.f27305j.F(this, view, appBarLayout, z10);
        return true;
    }

    public void setText(@StringRes int i10) {
        this.f27297b.setText(i10);
        this.f27298c.setText(i10);
    }
}

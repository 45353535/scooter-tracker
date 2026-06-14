package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior, MaterialBackHandler {
    private static final int F = R.style.Widget_Material3_SearchView;
    private final int A;
    private boolean B;
    private boolean C;
    private TransitionState D;
    private Map E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final View f27342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ClippableRoundedCornerLayout f27343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f27344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final View f27345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final FrameLayout f27346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final FrameLayout f27347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final MaterialToolbar f27348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Toolbar f27349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final TextView f27350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final LinearLayout f27351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final EditText f27352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ImageButton f27353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final View f27354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final TouchObserverFrameLayout f27355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f27356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SearchViewAnimationHelper f27357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final MaterialBackOrchestrator f27358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f27359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ElevationOverlayProvider f27360t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Set f27361u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private SearchBar f27362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f27364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f27365y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f27366z;

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchView.SavedState.1
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
        String f27368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27369c;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f27368b);
            parcel.writeInt(this.f27369c);
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27368b = parcel.readString();
            this.f27369c = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface TransitionListener {
        void onStateChanged(@NonNull SearchView searchView, @NonNull TransitionState transitionState, @NonNull TransitionState transitionState2);
    }

    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private void A(TransitionState transitionState) {
        if (this.f27362v == null || !this.f27359s) {
            return;
        }
        if (transitionState.equals(TransitionState.SHOWN)) {
            this.f27358r.startListeningForBackCallbacks();
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            this.f27358r.stopListeningForBackCallbacks();
        }
    }

    private void B(TransitionState transitionState) {
        if (transitionState == TransitionState.SHOWN) {
            setModalForAccessibility(true);
        } else if (transitionState == TransitionState.HIDDEN) {
            setModalForAccessibility(false);
        }
    }

    private void C() {
        MaterialToolbar materialToolbar = this.f27348h;
        if (materialToolbar == null || m(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.f27362v == null) {
            this.f27348h.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(AppCompatResources.getDrawable(getContext(), defaultNavigationIconResource).mutate());
        if (this.f27348h.getNavigationIconTint() != null) {
            drawableWrap.setTint(this.f27348h.getNavigationIconTint().intValue());
        }
        DrawableCompat.setLayoutDirection(drawableWrap, getLayoutDirection());
        this.f27348h.setNavigationIcon(new FadeThroughDrawable(this.f27362v.getNavigationIcon(), drawableWrap));
        D();
    }

    private void D() {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.f27348h);
        if (navigationIconButton == null) {
            return;
        }
        int i10 = this.f27343c.getVisibility() == 0 ? 1 : 0;
        Drawable drawableUnwrap = DrawableCompat.unwrap(navigationIconButton.getDrawable());
        if (drawableUnwrap instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawableUnwrap).setProgress(i10);
        }
        if (drawableUnwrap instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawableUnwrap).setProgress(i10);
        }
    }

    public static /* synthetic */ WindowInsetsCompat b(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        marginLayoutParams.leftMargin = i10 + insets.left;
        marginLayoutParams.rightMargin = i11 + insets.right;
        return windowInsetsCompat;
    }

    public static /* synthetic */ boolean c(SearchView searchView, View view, MotionEvent motionEvent) {
        if (!searchView.k()) {
            return false;
        }
        searchView.clearFocusAndHideKeyboard();
        return false;
    }

    public static /* synthetic */ void d(SearchView searchView) {
        searchView.f27352l.clearFocus();
        ViewUtils.hideKeyboard(searchView.f27352l, searchView.B);
    }

    public static /* synthetic */ void e(SearchView searchView) {
        if (searchView.f27352l.requestFocus()) {
            searchView.f27352l.sendAccessibilityEvent(8);
        }
        ViewUtils.showKeyboard(searchView.f27352l, searchView.B);
    }

    public static /* synthetic */ void f(SearchView searchView, View view) {
        searchView.clearText();
        searchView.n();
    }

    public static /* synthetic */ WindowInsetsCompat g(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(searchView.f27348h);
        int i10 = zIsLayoutRtl ? relativePadding.end : relativePadding.start;
        int i11 = zIsLayoutRtl ? relativePadding.start : relativePadding.end;
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        searchView.f27348h.setPadding(i10 + insets.left, relativePadding.top, i11 + insets.right, relativePadding.bottom);
        return windowInsetsCompat;
    }

    @Nullable
    private Window getActivityWindow() {
        Activity activity = ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f27362v;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static /* synthetic */ WindowInsetsCompat h(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat) {
        searchView.getClass();
        int i10 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout()).top;
        searchView.setUpStatusBarSpacer(i10);
        if (!searchView.C) {
            searchView.setStatusBarSpacerEnabledInternal(i10 > 0);
        }
        return windowInsetsCompat;
    }

    public static /* synthetic */ boolean i(View view, MotionEvent motionEvent) {
        return true;
    }

    private boolean l() {
        return this.D.equals(TransitionState.HIDDEN) || this.D.equals(TransitionState.HIDING);
    }

    private boolean m(Toolbar toolbar) {
        return DrawableCompat.unwrap(toolbar.getNavigationIcon()) instanceof DrawerArrowDrawable;
    }

    private void o(TransitionState transitionState, boolean z10) {
        if (this.D.equals(transitionState)) {
            return;
        }
        if (z10) {
            B(transitionState);
        }
        TransitionState transitionState2 = this.D;
        this.D = transitionState;
        Iterator it = new LinkedHashSet(this.f27361u).iterator();
        while (it.hasNext()) {
            ((TransitionListener) it.next()).onStateChanged(this, transitionState2, transitionState);
        }
        A(transitionState);
        SearchBar searchBar = this.f27362v;
        if (searchBar == null || transitionState != TransitionState.HIDDEN) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    private void p(boolean z10, boolean z11) {
        if (z11) {
            this.f27348h.setNavigationIcon((Drawable) null);
            return;
        }
        this.f27348h.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27414b.hide();
            }
        });
        if (z10) {
            DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
            drawerArrowDrawable.setColor(MaterialColors.getColor(this, R.attr.colorOnSurface));
            this.f27348h.setNavigationIcon(drawerArrowDrawable);
        }
    }

    private void q() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void r() {
        this.f27353m.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.f(this.f27417b, view);
            }
        });
        this.f27352l.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                SearchView.this.f27353m.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }
        });
    }

    private void s() {
        this.f27355o.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.v
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.c(this.f27426b, view, motionEvent);
            }
        });
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f27345e.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        ElevationOverlayProvider elevationOverlayProvider = this.f27360t;
        if (elevationOverlayProvider == null || this.f27344d == null) {
            return;
        }
        this.f27344d.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(this.A, f10));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f27346f, false));
        }
    }

    private void setUpStatusBarSpacer(@Px int i10) {
        if (this.f27345e.getLayoutParams().height != i10) {
            this.f27345e.getLayoutParams().height = i10;
            this.f27345e.requestLayout();
        }
    }

    private void t() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f27354n.getLayoutParams();
        final int i10 = marginLayoutParams.leftMargin;
        final int i11 = marginLayoutParams.rightMargin;
        ViewCompat.setOnApplyWindowInsetsListener(this.f27354n, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.o
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.b(marginLayoutParams, i10, i11, view, windowInsetsCompat);
            }
        });
    }

    private void u(int i10, String str, String str2) {
        if (i10 != -1) {
            TextViewCompat.setTextAppearance(this.f27352l, i10);
        }
        this.f27352l.setText(str);
        this.f27352l.setHint(str2);
    }

    private void v() {
        y();
        t();
        x();
    }

    private void w() {
        this.f27343c.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.u
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.i(view, motionEvent);
            }
        });
    }

    private void x() {
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.setOnApplyWindowInsetsListener(this.f27345e, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.r
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.h(this.f27423b, view, windowInsetsCompat);
            }
        });
    }

    private void y() {
        ViewUtils.doOnApplyWindowInsets(this.f27348h, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.q
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                return SearchView.g(this.f27422a, view, windowInsetsCompat, relativePadding);
            }
        });
    }

    private void z(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f27343c.getId()) != null) {
                    z((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.E.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    Map map = this.E;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.E.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    public void addHeaderView(@NonNull View view) {
        this.f27346f.addView(view);
        this.f27346f.setVisibility(0);
    }

    public void addTransitionListener(@NonNull TransitionListener transitionListener) {
        this.f27361u.add(transitionListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f27356p) {
            this.f27355o.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        if (l() || this.f27362v == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f27357q.cancelBackProgress();
    }

    public void clearFocusAndHideKeyboard() {
        this.f27352l.post(new Runnable() { // from class: com.google.android.material.search.l
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.d(this.f27415b);
            }
        });
    }

    public void clearText() {
        this.f27352l.setText("");
    }

    @VisibleForTesting
    MaterialMainContainerBackHelper getBackHelper() {
        return this.f27357q.x();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.D;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    @NonNull
    public EditText getEditText() {
        return this.f27352l;
    }

    @Nullable
    public CharSequence getHint() {
        return this.f27352l.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f27350j;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.f27350j.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f27363w;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f27352l.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f27348h;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        if (l()) {
            return;
        }
        BackEventCompat backEventCompatOnHandleBackInvoked = this.f27357q.onHandleBackInvoked();
        if (Build.VERSION.SDK_INT < 34 || this.f27362v == null || backEventCompatOnHandleBackInvoked == null) {
            hide();
        } else {
            this.f27357q.finishBackProgress();
        }
    }

    public void hide() {
        if (this.D.equals(TransitionState.HIDDEN) || this.D.equals(TransitionState.HIDING)) {
            return;
        }
        SearchBar searchBar = this.f27362v;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            this.f27357q.W();
            return;
        }
        this.f27362v.setPlaceholderText(this.f27352l.getText().toString());
        SearchBar searchBar2 = this.f27362v;
        final SearchViewAnimationHelper searchViewAnimationHelper = this.f27357q;
        Objects.requireNonNull(searchViewAnimationHelper);
        searchBar2.post(new Runnable() { // from class: com.google.android.material.search.m
            @Override // java.lang.Runnable
            public final void run() {
                searchViewAnimationHelper.W();
            }
        });
    }

    public void inflateMenu(@MenuRes int i10) {
        this.f27348h.inflateMenu(i10);
    }

    public boolean isAnimatedNavigationIcon() {
        return this.f27364x;
    }

    public boolean isAutoShowKeyboard() {
        return this.f27366z;
    }

    public boolean isMenuItemsAnimated() {
        return this.f27365y;
    }

    public boolean isSetupWithSearchBar() {
        return this.f27362v != null;
    }

    public boolean isShowing() {
        return this.D.equals(TransitionState.SHOWN) || this.D.equals(TransitionState.SHOWING);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isUseWindowInsetsController() {
        return this.B;
    }

    boolean k() {
        return this.f27363w == 48;
    }

    void n() {
        if (this.f27366z) {
            requestFocusAndShowKeyboard();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        TransitionState currentTransitionState = getCurrentTransitionState();
        B(currentTransitionState);
        A(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.f27358r.stopListeningForBackCallbacks();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f27368b);
        setVisible(savedState.f27369c == 0);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f27368b = text == null ? null : text.toString();
        savedState.f27369c = this.f27343c.getVisibility();
        return savedState;
    }

    public void removeAllHeaderViews() {
        this.f27346f.removeAllViews();
        this.f27346f.setVisibility(8);
    }

    public void removeHeaderView(@NonNull View view) {
        this.f27346f.removeView(view);
        if (this.f27346f.getChildCount() == 0) {
            this.f27346f.setVisibility(8);
        }
    }

    public void removeTransitionListener(@NonNull TransitionListener transitionListener) {
        this.f27361u.remove(transitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        this.f27352l.postDelayed(new Runnable() { // from class: com.google.android.material.search.p
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.e(this.f27421b);
            }
        }, 100L);
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f27364x = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f27366z = z10;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f27352l.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f27365y = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.E = new HashMap(viewGroup.getChildCount());
        }
        z(viewGroup, z10);
        if (z10) {
            return;
        }
        this.E = null;
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.f27348h.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        this.f27350j.setText(charSequence);
        this.f27350j.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z10) {
        this.C = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence) {
        this.f27352l.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f27348h.setTouchscreenBlocksFocus(z10);
    }

    void setTransitionState(@NonNull TransitionState transitionState) {
        o(transitionState, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z10) {
        this.B = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = this.f27343c.getVisibility() == 0;
        this.f27343c.setVisibility(z10 ? 0 : 8);
        D();
        o(z10 ? TransitionState.SHOWN : TransitionState.HIDDEN, z11 != z10);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar) {
        this.f27362v = searchBar;
        this.f27357q.d0(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f27424b.show();
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: com.google.android.material.search.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f27425b.show();
                        }
                    });
                    this.f27352l.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        C();
        q();
        A(getCurrentTransitionState());
    }

    public void show() {
        if (this.D.equals(TransitionState.SHOWN) || this.D.equals(TransitionState.SHOWING)) {
            return;
        }
        this.f27357q.f0();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        SearchBar searchBar;
        if (l() || (searchBar = this.f27362v) == null) {
            return;
        }
        if (searchBar != null) {
            searchBar.setPlaceholderText(this.f27352l.getText().toString());
        }
        this.f27357q.g0(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (l() || this.f27362v == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f27357q.updateBackProgress(backEventCompat);
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f27363w = activityWindow.getAttributes().softInputMode;
        }
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public void setHint(@StringRes int i10) {
        this.f27352l.setHint(i10);
    }

    public void setText(@StringRes int i10) {
        this.f27352l.setText(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = F;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f27358r = new MaterialBackOrchestrator(this);
        this.f27361u = new LinkedHashSet();
        this.f27363w = 16;
        this.D = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.SearchView, i10, i11, new int[0]);
        this.A = typedArrayObtainStyledAttributes.getColor(R.styleable.SearchView_backgroundTint, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SearchView_headerLayout, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SearchView_android_textAppearance, -1);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SearchView_android_text);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.SearchView_android_hint);
        String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.SearchView_searchPrefixText);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_useDrawerArrowDrawable, false);
        this.f27364x = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_animateNavigationIcon, true);
        this.f27365y = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_animateMenuItems, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_hideNavigationIcon, false);
        this.f27366z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_autoShowKeyboard, true);
        this.f27359s = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_backHandlingEnabled, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.f27356p = true;
        this.f27342b = findViewById(R.id.open_search_view_scrim);
        this.f27343c = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.f27344d = findViewById(R.id.open_search_view_background);
        this.f27345e = findViewById(R.id.open_search_view_status_bar_spacer);
        this.f27346f = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.f27347g = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        this.f27348h = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.f27349i = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.f27350j = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.f27351k = (LinearLayout) findViewById(R.id.open_search_view_text_container);
        this.f27352l = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.f27353m = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.f27354n = findViewById(R.id.open_search_view_divider);
        this.f27355o = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.f27357q = new SearchViewAnimationHelper(this);
        this.f27360t = new ElevationOverlayProvider(context2);
        w();
        q();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        u(resourceId2, string, string2);
        p(z10, z11);
        r();
        s();
        v();
    }
}

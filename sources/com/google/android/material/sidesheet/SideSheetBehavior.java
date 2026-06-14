package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements Sheet<SideSheetCallback> {
    private static final int A = R.string.side_sheet_accessibility_pane_title;
    private static final int B = R.style.Widget_Material3_SideSheet;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SheetDelegate f27647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f27648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaterialShapeDrawable f27649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f27650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ShapeAppearanceModel f27651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateSettlingTracker f27652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f27653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f27654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewDragHelper f27657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f27658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f27659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f27664s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private WeakReference f27665t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f27666u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private VelocityTracker f27667v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private MaterialSideContainerBackHelper f27668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f27669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Set f27670y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ViewDragHelper.Callback f27671z;

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f27674b;

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f27674b);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27674b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f27674b = ((SideSheetBehavior) sideSheetBehavior).f27655j;
        }
    }

    class StateSettlingTracker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f27677c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.StateSettlingTracker.a(this.f27691b);
            }
        };

        StateSettlingTracker() {
        }

        public static /* synthetic */ void a(StateSettlingTracker stateSettlingTracker) {
            stateSettlingTracker.f27676b = false;
            if (SideSheetBehavior.this.f27657l != null && SideSheetBehavior.this.f27657l.continueSettling(true)) {
                stateSettlingTracker.b(stateSettlingTracker.f27675a);
            } else if (SideSheetBehavior.this.f27655j == 2) {
                SideSheetBehavior.this.R(stateSettlingTracker.f27675a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f27664s == null || SideSheetBehavior.this.f27664s.get() == null) {
                return;
            }
            this.f27675a = i10;
            if (this.f27676b) {
                return;
            }
            ((View) SideSheetBehavior.this.f27664s.get()).postOnAnimation(this.f27677c);
            this.f27676b = true;
        }
    }

    public SideSheetBehavior() {
        this.f27652g = new StateSettlingTracker();
        this.f27654i = true;
        this.f27655j = 5;
        this.f27656k = 5;
        this.f27659n = 0.1f;
        this.f27666u = -1;
        this.f27670y = new LinkedHashSet();
        this.f27671z = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
                return MathUtils.clamp(i10, SideSheetBehavior.this.f27647b.g(), SideSheetBehavior.this.f27647b.f());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i10, int i11) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(@NonNull View view) {
                return SideSheetBehavior.this.f27660o + SideSheetBehavior.this.z();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i10) {
                if (i10 == 1 && SideSheetBehavior.this.f27654i) {
                    SideSheetBehavior.this.R(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i10, int i11, int i12, int i13) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.f27647b.o(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.s(view, i10);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@NonNull View view, float f10, float f11) {
                int iO = SideSheetBehavior.this.o(view, f10, f11);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.V(view, iO, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i10) {
                return (SideSheetBehavior.this.f27655j == 1 || SideSheetBehavior.this.f27664s == null || SideSheetBehavior.this.f27664s.get() != view) ? false : true;
            }
        };
    }

    private CoordinatorLayout.LayoutParams E() {
        View view;
        WeakReference weakReference = this.f27664s;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return null;
        }
        return (CoordinatorLayout.LayoutParams) view.getLayoutParams();
    }

    private boolean F() {
        CoordinatorLayout.LayoutParams layoutParamsE = E();
        return layoutParamsE != null && ((ViewGroup.MarginLayoutParams) layoutParamsE).leftMargin > 0;
    }

    private boolean G() {
        CoordinatorLayout.LayoutParams layoutParamsE = E();
        return layoutParamsE != null && ((ViewGroup.MarginLayoutParams) layoutParamsE).rightMargin > 0;
    }

    private boolean H(MotionEvent motionEvent) {
        return S() && n((float) this.f27669x, motionEvent.getX()) > ((float) this.f27657l.getTouchSlop());
    }

    private boolean I(float f10) {
        return this.f27647b.j(f10);
    }

    private boolean J(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    private boolean K(View view, int i10, boolean z10) {
        int iA = A(i10);
        ViewDragHelper viewDragHelperD = D();
        if (viewDragHelperD != null) {
            return z10 ? viewDragHelperD.settleCapturedViewAt(iA, view.getTop()) : viewDragHelperD.smoothSlideViewTo(view, iA, view.getTop());
        }
        return false;
    }

    private void L(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f27665t != null || (i10 = this.f27666u) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f27665t = new WeakReference(viewFindViewById);
    }

    private void M(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i10) {
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, q(i10));
    }

    private void N() {
        VelocityTracker velocityTracker = this.f27667v;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f27667v = null;
        }
    }

    private void O(View view, Runnable runnable) {
        if (J(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void P(int i10) {
        SheetDelegate sheetDelegate = this.f27647b;
        if (sheetDelegate == null || sheetDelegate.i() != i10) {
            if (i10 == 0) {
                this.f27647b = new RightSheetDelegate(this);
                if (this.f27651f == null || G()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder = this.f27651f.toBuilder();
                builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                Y(builder.build());
                return;
            }
            if (i10 == 1) {
                this.f27647b = new LeftSheetDelegate(this);
                if (this.f27651f == null || F()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder2 = this.f27651f.toBuilder();
                builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                Y(builder2.build());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private void Q(View view, int i10) {
        P(Gravity.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) view.getLayoutParams()).gravity, i10) == 3 ? 1 : 0);
    }

    private boolean S() {
        if (this.f27657l != null) {
            return this.f27654i || this.f27655j == 1;
        }
        return false;
    }

    private boolean U(View view) {
        return (view.isShown() || ViewCompat.getAccessibilityPaneTitle(view) != null) && this.f27654i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(View view, int i10, boolean z10) {
        if (!K(view, i10, z10)) {
            R(i10);
        } else {
            R(2);
            this.f27652g.b(i10);
        }
    }

    private void W() {
        View view;
        WeakReference weakReference = this.f27664s;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (this.f27655j != 5) {
            M(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        if (this.f27655j != 3) {
            M(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    private void X() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.f27664s;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f27664s.get();
        View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return;
        }
        this.f27647b.n(marginLayoutParams, (int) ((this.f27660o * view.getScaleX()) + this.f27663r));
        coplanarSiblingView.requestLayout();
    }

    private void Y(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.f27649d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    private void Z(View view) {
        int i10 = this.f27655j == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    public static /* synthetic */ boolean a(SideSheetBehavior sideSheetBehavior, int i10, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        sideSheetBehavior.setState(i10);
        return true;
    }

    public static /* synthetic */ void b(SideSheetBehavior sideSheetBehavior, int i10) {
        View view = (View) sideSheetBehavior.f27664s.get();
        if (view != null) {
            sideSheetBehavior.V(view, i10, false);
        }
    }

    public static /* synthetic */ void c(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f27647b.n(marginLayoutParams, AnimationUtils.lerp(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    @NonNull
    public static <V extends View> SideSheetBehavior<V> from(@NonNull V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }

    private int m(int i10, View view) {
        int i11 = this.f27655j;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f27647b.h(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f27647b.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f27655j);
    }

    private float n(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o(View view, float f10, float f11) {
        if (I(f10)) {
            return 3;
        }
        if (T(view, f10)) {
            return (this.f27647b.l(f10, f11) || this.f27647b.k(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && SheetUtils.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - getExpandedOffset()) < Math.abs(left - this.f27647b.e()) ? 3 : 5;
    }

    private void p() {
        WeakReference weakReference = this.f27665t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f27665t = null;
    }

    private AccessibilityViewCommand q(final int i10) {
        return new AccessibilityViewCommand() { // from class: com.google.android.material.sidesheet.c
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return SideSheetBehavior.a(this.f27685a, i10, view, commandArguments);
            }
        };
    }

    private void r(Context context) {
        if (this.f27651f == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f27651f);
        this.f27649d = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.f27650e;
        if (colorStateList != null) {
            this.f27649d.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.f27649d.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(View view, int i10) {
        if (this.f27670y.isEmpty()) {
            return;
        }
        float fB = this.f27647b.b(i10);
        Iterator it = this.f27670y.iterator();
        while (it.hasNext()) {
            ((SheetCallback) it.next()).onSlide(view, fB);
        }
    }

    private void t(View view) {
        if (ViewCompat.getAccessibilityPaneTitle(view) == null) {
            ViewCompat.setAccessibilityPaneTitle(view, view.getResources().getString(A));
        }
    }

    private int u(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private ValueAnimator.AnimatorUpdateListener w() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return null;
        }
        final int iC = this.f27647b.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.c(this.f27687b, marginLayoutParams, iC, coplanarSiblingView, valueAnimator);
            }
        };
    }

    private int x() {
        SheetDelegate sheetDelegate = this.f27647b;
        return (sheetDelegate == null || sheetDelegate.i() == 0) ? 5 : 3;
    }

    int A(int i10) {
        if (i10 == 3) {
            return getExpandedOffset();
        }
        if (i10 == 5) {
            return this.f27647b.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int B() {
        return this.f27662q;
    }

    int C() {
        return this.f27661p;
    }

    ViewDragHelper D() {
        return this.f27657l;
    }

    void R(int i10) {
        View view;
        if (this.f27655j == i10) {
            return;
        }
        this.f27655j = i10;
        if (i10 == 3 || i10 == 5) {
            this.f27656k = i10;
        }
        WeakReference weakReference = this.f27664s;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Z(view);
        Iterator it = this.f27670y.iterator();
        while (it.hasNext()) {
            ((SheetCallback) it.next()).onStateChanged(view, i10);
        }
        W();
    }

    boolean T(View view, float f10) {
        return this.f27647b.m(view, f10);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.f27668w;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.cancelBackProgress();
    }

    public void expand() {
        setState(3);
    }

    @Nullable
    public View getCoplanarSiblingView() {
        WeakReference weakReference = this.f27665t;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.f27647b.d();
    }

    public float getHideFriction() {
        return this.f27659n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.f27656k;
    }

    int getSignificantVelocityThreshold() {
        return 500;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.f27655j;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.f27668w;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompatOnHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        if (backEventCompatOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
        } else {
            this.f27668w.finishBackProgress(backEventCompatOnHandleBackInvoked, x(), new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SideSheetBehavior.this.R(5);
                    if (SideSheetBehavior.this.f27664s == null || SideSheetBehavior.this.f27664s.get() == null) {
                        return;
                    }
                    ((View) SideSheetBehavior.this.f27664s.get()).requestLayout();
                }
            }, w());
        }
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.f27654i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f27664s = null;
        this.f27657l = null;
        this.f27668w = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f27664s = null;
        this.f27657l = null;
        this.f27668w = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!U(v10)) {
            this.f27658m = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            N();
        }
        if (this.f27667v == null) {
            this.f27667v = VelocityTracker.obtain();
        }
        this.f27667v.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f27669x = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f27658m) {
            this.f27658m = false;
            return false;
        }
        return (this.f27658m || (viewDragHelper = this.f27657l) == null || !viewDragHelper.shouldInterceptTouchEvent(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !v10.getFitsSystemWindows()) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f27664s == null) {
            this.f27664s = new WeakReference(v10);
            this.f27668w = new MaterialSideContainerBackHelper(v10);
            MaterialShapeDrawable materialShapeDrawable = this.f27649d;
            if (materialShapeDrawable != null) {
                v10.setBackground(materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f27649d;
                float elevation = this.f27653h;
                if (elevation == -1.0f) {
                    elevation = v10.getElevation();
                }
                materialShapeDrawable2.setElevation(elevation);
            } else {
                ColorStateList colorStateList = this.f27650e;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v10, colorStateList);
                }
            }
            Z(v10);
            W();
            if (v10.getImportantForAccessibility() == 0) {
                v10.setImportantForAccessibility(1);
            }
            t(v10);
        }
        Q(v10, i10);
        if (this.f27657l == null) {
            this.f27657l = ViewDragHelper.create(coordinatorLayout, this.f27671z);
        }
        int iH = this.f27647b.h(v10);
        coordinatorLayout.onLayoutChild(v10, i10);
        this.f27661p = coordinatorLayout.getWidth();
        this.f27662q = this.f27647b.getParentInnerEdge(coordinatorLayout);
        this.f27660o = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        this.f27663r = marginLayoutParams != null ? this.f27647b.a(marginLayoutParams) : 0;
        ViewCompat.offsetLeftAndRight(v10, m(iH, v10));
        L(coordinatorLayout);
        for (SheetCallback sheetCallback : this.f27670y) {
            if (sheetCallback instanceof SideSheetCallback) {
                ((SideSheetCallback) sheetCallback).a(v10);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(u(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), u(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v10, savedState.getSuperState());
        }
        int i10 = savedState.f27674b;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f27655j = i10;
        this.f27656k = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v10), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f27655j == 1 && actionMasked == 0) {
            return true;
        }
        if (S()) {
            this.f27657l.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            N();
        }
        if (this.f27667v == null) {
            this.f27667v = VelocityTracker.obtain();
        }
        this.f27667v.addMovement(motionEvent);
        if (S() && actionMasked == 2 && !this.f27658m && H(motionEvent)) {
            this.f27657l.captureChildView(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f27658m;
    }

    public void setCoplanarSiblingView(@Nullable View view) {
        this.f27666u = -1;
        if (view == null) {
            p();
            return;
        }
        this.f27665t = new WeakReference(view);
        WeakReference weakReference = this.f27664s;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            if (view2.isLaidOut()) {
                view2.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(@IdRes int i10) {
        this.f27666u = i10;
        p();
        WeakReference weakReference = this.f27664s;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 == -1 || !view.isLaidOut()) {
                return;
            }
            view.requestLayout();
        }
    }

    public void setDraggable(boolean z10) {
        this.f27654i = z10;
    }

    public void setHideFriction(float f10) {
        this.f27659n = f10;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference weakReference = this.f27664s;
        if (weakReference == null || weakReference.get() == null) {
            R(i10);
        } else {
            O((View) this.f27664s.get(), new Runnable() { // from class: com.google.android.material.sidesheet.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.b(this.f27683b, i10);
                }
            });
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.f27668w;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.f27668w;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.updateBackProgress(backEventCompat, x());
        X();
    }

    int v() {
        return this.f27660o;
    }

    float y() {
        return 0.5f;
    }

    int z() {
        return this.f27663r;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.f27670y.add(sideSheetCallback);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void removeCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.f27670y.remove(sideSheetCallback);
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27652g = new StateSettlingTracker();
        this.f27654i = true;
        this.f27655j = 5;
        this.f27656k = 5;
        this.f27659n = 0.1f;
        this.f27666u = -1;
        this.f27670y = new LinkedHashSet();
        this.f27671z = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
                return MathUtils.clamp(i10, SideSheetBehavior.this.f27647b.g(), SideSheetBehavior.this.f27647b.f());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i10, int i11) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(@NonNull View view) {
                return SideSheetBehavior.this.f27660o + SideSheetBehavior.this.z();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i10) {
                if (i10 == 1 && SideSheetBehavior.this.f27654i) {
                    SideSheetBehavior.this.R(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i10, int i11, int i12, int i13) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.f27647b.o(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.s(view, i10);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@NonNull View view, float f10, float f11) {
                int iO = SideSheetBehavior.this.o(view, f10, f11);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.V(view, iO, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i10) {
                return (SideSheetBehavior.this.f27655j == 1 || SideSheetBehavior.this.f27664s == null || SideSheetBehavior.this.f27664s.get() != view) ? false : true;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        int i10 = R.styleable.SideSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f27650e = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f27651f = ShapeAppearanceModel.builder(context, attributeSet, 0, B).build();
        }
        int i11 = R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            setCoplanarSiblingViewId(typedArrayObtainStyledAttributes.getResourceId(i11, -1));
        }
        r(context);
        this.f27653h = typedArrayObtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f27648c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

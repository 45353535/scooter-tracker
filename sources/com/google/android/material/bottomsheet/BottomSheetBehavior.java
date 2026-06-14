package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements MaterialBackHandler {
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f25602m0 = R.style.Widget_Design_BottomSheet_Modal;
    private ShapeAppearanceModel A;
    private boolean B;
    private final StateSettlingTracker C;
    private ValueAnimator D;
    int E;
    int F;
    int G;
    float H;
    int I;
    float J;
    boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    int P;
    int Q;
    ViewDragHelper R;
    private boolean S;
    private int T;
    private boolean U;
    private float V;
    private int W;
    int X;
    int Y;
    WeakReference Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    WeakReference f25603a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25604b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    WeakReference f25605b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25606c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    WeakReference f25607c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25608d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final ArrayList f25609d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f25610e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private VelocityTracker f25611e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25612f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    MaterialBottomContainerBackHelper f25613f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25614g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    int f25615g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25616h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f25617h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25618i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    boolean f25619i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25620j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Map f25621j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaterialShapeDrawable f25622k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    final SparseIntArray f25623k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f25624l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final ViewDragHelper.Callback f25625l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f25627n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25628o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f25629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f25631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f25632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f25633t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f25634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f25635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f25636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f25637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f25638y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f25639z;

    public static abstract class BottomSheetCallback {
        void a(View view) {
        }

        public abstract void onSlide(@NonNull View view, float f10);

        public abstract void onStateChanged(@NonNull View view, int i10);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SaveFlags {
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
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
        final int f25651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f25653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f25654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f25655f;

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f25651b);
            parcel.writeInt(this.f25652c);
            parcel.writeInt(this.f25653d ? 1 : 0);
            parcel.writeInt(this.f25654e ? 1 : 0);
            parcel.writeInt(this.f25655f ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f25651b = parcel.readInt();
            this.f25652c = parcel.readInt();
            this.f25653d = parcel.readInt() == 1;
            this.f25654e = parcel.readInt() == 1;
            this.f25655f = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f25651b = bottomSheetBehavior.P;
            this.f25652c = ((BottomSheetBehavior) bottomSheetBehavior).f25614g;
            this.f25653d = ((BottomSheetBehavior) bottomSheetBehavior).f25606c;
            this.f25654e = bottomSheetBehavior.K;
            this.f25655f = ((BottomSheetBehavior) bottomSheetBehavior).L;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f25651b = i10;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface State {
    }

    private class StateSettlingTracker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f25658c;

        private StateSettlingTracker() {
            this.f25658c = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.f25657b = false;
                    ViewDragHelper viewDragHelper = BottomSheetBehavior.this.R;
                    if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.c(stateSettlingTracker.f25656a);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.P == 2) {
                        bottomSheetBehavior.W(stateSettlingTracker2.f25656a);
                    }
                }
            };
        }

        void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.Z;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f25656a = i10;
            if (this.f25657b) {
                return;
            }
            ((View) BottomSheetBehavior.this.Z.get()).postOnAnimation(this.f25658c);
            this.f25657b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f25604b = 0;
        this.f25606c = true;
        this.f25608d = false;
        this.f25626m = -1;
        this.f25627n = -1;
        this.C = new StateSettlingTracker();
        this.H = 0.5f;
        this.J = -1.0f;
        this.M = true;
        this.N = true;
        this.P = 4;
        this.Q = 4;
        this.V = 0.1f;
        this.f25609d0 = new ArrayList();
        this.f25617h0 = -1;
        this.f25623k0 = new SparseIntArray();
        this.f25625l0 = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f25647a;

            private boolean a(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.Y + bottomSheetBehavior.getExpandedOffset()) / 2;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i10, int i11) {
                return MathUtils.clamp(i10, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(@NonNull View view) {
                return BottomSheetBehavior.this.A() ? BottomSheetBehavior.this.Y : BottomSheetBehavior.this.I;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i10) {
                if (i10 == 1 && BottomSheetBehavior.this.M) {
                    BottomSheetBehavior.this.W(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i10, int i11, int i12, int i13) {
                BottomSheetBehavior.this.F(i11);
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onViewReleased(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
                /*
                    Method dump skipped, instruction units count: 308
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass5.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i10) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i11 = bottomSheetBehavior.P;
                if (i11 == 1 || bottomSheetBehavior.f25619i0) {
                    return false;
                }
                if (i11 == 3 && bottomSheetBehavior.f25615g0 == i10) {
                    WeakReference weakReference = bottomSheetBehavior.f25607c0;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.f25647a = SystemClock.uptimeMillis();
                WeakReference weakReference2 = BottomSheetBehavior.this.Z;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A() {
        return isHideable() && isHideableWhenDragging();
    }

    private void B(View view, int i10) {
        if (view == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 524288);
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, 1048576);
        int i11 = this.f25623k0.get(i10, -1);
        if (i11 != -1) {
            ViewCompat.removeAccessibilityAction(view, i11);
            this.f25623k0.delete(i10);
        }
    }

    private AccessibilityViewCommand C(final int i10) {
        return new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                BottomSheetBehavior.this.setState(i10);
                return true;
            }
        };
    }

    private void D(Context context) {
        if (this.A == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.A);
        this.f25622k = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.f25624l;
        if (colorStateList != null) {
            this.f25622k.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.f25622k.setTint(typedValue.data);
    }

    private void E() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.D = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.D.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.f25622k != null) {
                    BottomSheetBehavior.this.f25622k.setInterpolation(fFloatValue);
                }
            }
        });
    }

    private int H(int i10, int i11, int i12, int i13) {
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

    private int J(int i10) {
        if (i10 == 3) {
            return getExpandedOffset();
        }
        if (i10 == 4) {
            return this.I;
        }
        if (i10 == 5) {
            return this.Y;
        }
        if (i10 == 6) {
            return this.G;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float K() {
        VelocityTracker velocityTracker = this.f25611e0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f25610e);
        return this.f25611e0.getYVelocity(this.f25615g0);
    }

    private boolean L() {
        WeakReference weakReference = this.Z;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.Z.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean M() {
        if (this.P == 3) {
            return this.f25639z || L();
        }
        return false;
    }

    private boolean N(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    private boolean O(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f25605b0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.isPointInChildBounds(view, i10, i11);
    }

    private boolean P(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f25607c0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.isPointInChildBounds(view, i10, i11);
    }

    private void Q(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i10) {
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, C(i10));
    }

    private void R() {
        this.f25615g0 = -1;
        this.f25617h0 = -1;
        VelocityTracker velocityTracker = this.f25611e0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f25611e0 = null;
        }
    }

    private void S(SavedState savedState) {
        int i10 = this.f25604b;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f25614g = savedState.f25652c;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f25606c = savedState.f25653d;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.K = savedState.f25654e;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.L = savedState.f25655f;
        }
    }

    private void T(View view, Runnable runnable) {
        if (N(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void X(View view) {
        final boolean z10 = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.f25616h) ? false : true;
        if (this.f25630q || this.f25631r || this.f25632s || this.f25634u || this.f25635v || this.f25636w || z10) {
            ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
                @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r11, androidx.core.view.WindowInsetsCompat r12, com.google.android.material.internal.ViewUtils.RelativePadding r13) {
                    /*
                        Method dump skipped, instruction units count: 207
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.onApplyWindowInsets(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.ViewUtils$RelativePadding):androidx.core.view.WindowInsetsCompat");
                }
            });
        }
    }

    private boolean Y() {
        if (this.R != null) {
            return this.M || this.P == 1;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(View view, int i10, boolean z10) {
        int iJ = J(i10);
        ViewDragHelper viewDragHelper = this.R;
        if (viewDragHelper == null || (!z10 ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), iJ) : viewDragHelper.settleCapturedViewAt(view.getLeft(), iJ))) {
            W(i10);
            return;
        }
        W(2);
        d0(i10, true);
        this.C.c(i10);
    }

    private void b0() {
        WeakReference weakReference = this.Z;
        if (weakReference != null) {
            c0((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f25603a0;
        if (weakReference2 != null) {
            c0((View) weakReference2.get(), 1);
        }
    }

    private void c0(View view, int i10) {
        if (view == null) {
            return;
        }
        B(view, i10);
        if (!this.f25606c && this.P != 6) {
            this.f25623k0.put(i10, t(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.K && isHideableWhenDragging() && this.P != 5) {
            Q(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        int i11 = this.P;
        if (i11 == 3) {
            Q(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, this.f25606c ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            Q(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, this.f25606c ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            Q(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
            Q(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    private void d0(int i10, boolean z10) {
        boolean zM;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.B == (zM = M()) || this.f25622k == null) {
            return;
        }
        this.B = zM;
        if (!z10 || (valueAnimator = this.D) == null) {
            ValueAnimator valueAnimator2 = this.D;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.D.cancel();
            }
            this.f25622k.setInterpolation(this.B ? x() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.D.reverse();
        } else {
            this.D.setFloatValues(this.f25622k.getInterpolation(), zM ? x() : 1.0f);
            this.D.start();
        }
    }

    private void e0(boolean z10) {
        Map map;
        WeakReference weakReference = this.Z;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f25621j0 != null) {
                    return;
                } else {
                    this.f25621j0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.Z.get()) {
                    if (z10) {
                        this.f25621j0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f25608d) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f25608d && (map = this.f25621j0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f25621j0.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f25621j0 = null;
            } else if (this.f25608d) {
                ((View) this.Z.get()).sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(boolean z10) {
        View view;
        if (this.Z != null) {
            u();
            if (this.P != 4 || (view = (View) this.Z.get()) == null) {
                return;
            }
            if (z10) {
                setState(4);
            } else {
                view.requestLayout();
            }
        }
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int t(View view, int i10, int i11) {
        return ViewCompat.addAccessibilityAction(view, view.getResources().getString(i10), C(i11));
    }

    private void u() {
        int iY = y();
        if (this.f25606c) {
            this.I = Math.max(this.Y - iY, this.F);
        } else {
            this.I = this.Y - iY;
        }
    }

    private float v(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    private void w() {
        this.G = (int) (this.Y * (1.0f - this.H));
    }

    private float x() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f25622k == null || (weakReference = this.Z) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.Z.get();
        if (!L() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(v(this.f25622k.getTopLeftCornerResolvedSize(), rootWindowInsets.getRoundedCorner(0)), v(this.f25622k.getTopRightCornerResolvedSize(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int y() {
        int i10;
        return this.f25616h ? Math.min(Math.max(this.f25618i, this.Y - ((this.X * 9) / 16)), this.W) + this.f25637x : (this.f25629p || this.f25630q || (i10 = this.f25628o) <= 0) ? this.f25614g + this.f25637x : Math.max(this.f25614g, i10 + this.f25620j);
    }

    private float z(int i10) {
        float f10;
        float expandedOffset;
        int i11 = this.I;
        if (i10 > i11 || i11 == getExpandedOffset()) {
            int i12 = this.I;
            f10 = i12 - i10;
            expandedOffset = this.Y - i12;
        } else {
            int i13 = this.I;
            f10 = i13 - i10;
            expandedOffset = i13 - getExpandedOffset();
        }
        return f10 / expandedOffset;
    }

    void F(int i10) {
        View view = (View) this.Z.get();
        if (view == null || this.f25609d0.isEmpty()) {
            return;
        }
        float fZ = z(i10);
        for (int i11 = 0; i11 < this.f25609d0.size(); i11++) {
            ((BottomSheetCallback) this.f25609d0.get(i11)).onSlide(view, fZ);
        }
    }

    View G(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewG = G(viewGroup.getChildAt(i10));
                if (viewG != null) {
                    return viewG;
                }
            }
        }
        return null;
    }

    MaterialShapeDrawable I() {
        return this.f25622k;
    }

    void U(View view) {
        WeakReference weakReference;
        if (view != null || (weakReference = this.f25603a0) == null) {
            this.f25603a0 = new WeakReference(view);
            c0(view, 1);
        } else {
            B((View) weakReference.get(), 1);
            this.f25603a0 = null;
        }
    }

    void V(BottomSheetDragHandleView bottomSheetDragHandleView) {
        this.f25605b0 = bottomSheetDragHandleView != null ? new WeakReference(bottomSheetDragHandleView) : null;
    }

    void W(int i10) {
        View view;
        if (this.P == i10) {
            return;
        }
        this.P = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.K && i10 == 5)) {
            this.Q = i10;
        }
        WeakReference weakReference = this.Z;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            e0(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            e0(false);
        }
        d0(i10, true);
        for (int i11 = 0; i11 < this.f25609d0.size(); i11++) {
            ((BottomSheetCallback) this.f25609d0.get(i11)).onStateChanged(view, i10);
        }
        b0();
    }

    boolean Z(View view, float f10) {
        if (this.L) {
            return true;
        }
        if (isHideableWhenDragging() && view.getTop() >= this.I) {
            return Math.abs((((float) view.getTop()) + (f10 * this.V)) - ((float) this.I)) / ((float) y()) > 0.5f;
        }
        return false;
    }

    public void addBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        if (this.f25609d0.contains(bottomSheetCallback)) {
            return;
        }
        this.f25609d0.add(bottomSheetCallback);
    }

    public float calculateSlideOffset() {
        WeakReference weakReference = this.Z;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return z(((View) this.Z.get()).getTop());
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.f25613f0;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void disableShapeAnimations() {
        this.D = null;
    }

    public int getExpandedOffset() {
        if (this.f25606c) {
            return this.F;
        }
        return Math.max(this.E, this.f25633t ? 0 : this.f25638y);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getHalfExpandedRatio() {
        return this.H;
    }

    public float getHideFriction() {
        return this.V;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.Q;
    }

    @Px
    public int getMaxHeight() {
        return this.f25627n;
    }

    @Px
    public int getMaxWidth() {
        return this.f25626m;
    }

    public int getPeekHeight() {
        if (this.f25616h) {
            return -1;
        }
        return this.f25614g;
    }

    public int getSaveFlags() {
        return this.f25604b;
    }

    public int getSignificantVelocityThreshold() {
        return this.f25612f;
    }

    public boolean getSkipCollapsed() {
        return this.L;
    }

    public int getState() {
        return this.P;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.f25613f0;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompatOnHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        if (backEventCompatOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(this.K ? 5 : 4);
        } else if (this.K) {
            this.f25613f0.finishBackProgressNotPersistent(backEventCompatOnHandleBackInvoked, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    BottomSheetBehavior.this.W(5);
                    WeakReference weakReference = BottomSheetBehavior.this.Z;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    ((View) BottomSheetBehavior.this.Z.get()).requestLayout();
                }
            });
        } else {
            this.f25613f0.finishBackProgressPersistent(backEventCompatOnHandleBackInvoked, null);
            setState(4);
        }
    }

    public boolean isDraggable() {
        return this.M;
    }

    public boolean isDraggableOnNestedScroll() {
        return this.N;
    }

    public boolean isFitToContents() {
        return this.f25606c;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.f25629p;
    }

    public boolean isHideable() {
        return this.K;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isHideableWhenDragging() {
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.f25639z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.Z = null;
        this.R = null;
        this.f25613f0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.Z = null;
        this.R = null;
        this.f25613f0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        int i10;
        ViewDragHelper viewDragHelper;
        if (!v10.isShown() || !this.M) {
            this.S = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            R();
        }
        if (this.f25611e0 == null) {
            this.f25611e0 = VelocityTracker.obtain();
        }
        this.f25611e0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            this.f25617h0 = y10;
            if (this.P != 2 && P(coordinatorLayout, x10, y10)) {
                this.f25615g0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!O(coordinatorLayout, x10, this.f25617h0)) {
                    this.f25619i0 = true;
                }
            }
            this.S = this.f25615g0 == -1 && !coordinatorLayout.isPointInChildBounds(v10, x10, this.f25617h0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f25619i0 = false;
            this.f25615g0 = -1;
            if (this.S) {
                this.S = false;
                return false;
            }
        }
        if (!this.S && (viewDragHelper = this.R) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        WeakReference weakReference = this.f25607c0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return (actionMasked != 2 || view == null || this.S || this.P == 1 || coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.R == null || (i10 = this.f25617h0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.R.getTouchSlop())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !v10.getFitsSystemWindows()) {
            v10.setFitsSystemWindows(true);
        }
        if (this.Z == null) {
            this.f25618i = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            X(v10);
            ViewCompat.setWindowInsetsAnimationCallback(v10, new InsetsAnimationCallback(v10));
            this.Z = new WeakReference(v10);
            this.f25613f0 = new MaterialBottomContainerBackHelper(v10);
            MaterialShapeDrawable materialShapeDrawable = this.f25622k;
            if (materialShapeDrawable != null) {
                v10.setBackground(materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f25622k;
                float elevation = this.J;
                if (elevation == -1.0f) {
                    elevation = v10.getElevation();
                }
                materialShapeDrawable2.setElevation(elevation);
            } else {
                ColorStateList colorStateList = this.f25624l;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v10, colorStateList);
                }
            }
            b0();
            if (v10.getImportantForAccessibility() == 0) {
                v10.setImportantForAccessibility(1);
            }
        }
        if (this.R == null) {
            this.R = ViewDragHelper.create(coordinatorLayout, this.f25625l0);
        }
        int top = v10.getTop();
        coordinatorLayout.onLayoutChild(v10, i10);
        this.X = coordinatorLayout.getWidth();
        this.Y = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.W = height;
        int iMin = this.Y;
        int i11 = iMin - height;
        int i12 = this.f25638y;
        if (i11 < i12) {
            if (this.f25633t) {
                int i13 = this.f25627n;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.W = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f25627n;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.W = iMin2;
            }
        }
        this.F = Math.max(0, this.Y - this.W);
        w();
        u();
        int i15 = this.P;
        if (i15 == 3) {
            ViewCompat.offsetTopAndBottom(v10, getExpandedOffset());
        } else if (i15 == 6) {
            ViewCompat.offsetTopAndBottom(v10, this.G);
        } else if (this.K && i15 == 5) {
            ViewCompat.offsetTopAndBottom(v10, this.Y);
        } else if (i15 == 4) {
            ViewCompat.offsetTopAndBottom(v10, this.I);
        } else if (i15 == 1 || i15 == 2) {
            ViewCompat.offsetTopAndBottom(v10, top - v10.getTop());
        }
        d0(this.P, false);
        this.f25607c0 = new WeakReference(G(v10));
        for (int i16 = 0; i16 < this.f25609d0.size(); i16++) {
            ((BottomSheetCallback) this.f25609d0.get(i16)).a(v10);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(H(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f25626m, marginLayoutParams.width), H(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f25627n, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, float f10, float f11) {
        WeakReference weakReference;
        return isNestedScrollingCheckEnabled() && (weakReference = this.f25607c0) != null && view == weakReference.get() && (!(this.P == 3 || this.O) || super.onNestedPreFling(coordinatorLayout, v10, view, f10, f11));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f25607c0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top = v10.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (!this.U && !this.N && view == view2 && view.canScrollVertically(1)) {
                    this.O = true;
                    return;
                }
                if (i13 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    ViewCompat.offsetTopAndBottom(v10, -expandedOffset);
                    W(3);
                } else {
                    if (!this.M) {
                        return;
                    }
                    iArr[1] = i11;
                    ViewCompat.offsetTopAndBottom(v10, -i11);
                    W(1);
                }
            } else if (i11 < 0) {
                boolean zCanScrollVertically = view.canScrollVertically(-1);
                if (!this.U && !this.N && view == view2 && zCanScrollVertically) {
                    this.O = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i13 > this.I && !A()) {
                        int i14 = top - this.I;
                        iArr[1] = i14;
                        ViewCompat.offsetTopAndBottom(v10, -i14);
                        W(4);
                    } else {
                        if (!this.M) {
                            return;
                        }
                        iArr[1] = i11;
                        ViewCompat.offsetTopAndBottom(v10, -i11);
                        W(1);
                    }
                }
            }
            F(v10.getTop());
            this.T = i11;
            this.U = true;
            this.O = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v10, savedState.getSuperState());
        S(savedState);
        int i10 = savedState.f25651b;
        if (i10 == 1 || i10 == 2) {
            this.P = 4;
            this.Q = 4;
        } else {
            this.P = i10;
            this.Q = i10;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10, int i11) {
        this.T = 0;
        this.U = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.W(r0)
            return
        Lf:
            boolean r3 = r2.isNestedScrollingCheckEnabled()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f25607c0
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.U
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.T
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f25606c
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.G
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.K
            if (r3 == 0) goto L49
            float r3 = r2.K()
            boolean r3 = r2.Z(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.T
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f25606c
            if (r1 == 0) goto L68
            int r5 = r2.F
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.I
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.G
            if (r3 >= r1) goto L7e
            int r1 = r2.I
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.shouldSkipHalfExpandedStateWhenDragging()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.I
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f25606c
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.G
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.I
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.a0(r4, r0, r3)
            r2.U = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.P == 1 && actionMasked == 0) {
            return true;
        }
        if (Y()) {
            this.R.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            R();
        }
        if (this.f25611e0 == null) {
            this.f25611e0 = VelocityTracker.obtain();
        }
        this.f25611e0.addMovement(motionEvent);
        if (Y() && actionMasked == 2 && !this.S && Math.abs(this.f25617h0 - motionEvent.getY()) > this.R.getTouchSlop()) {
            this.R.captureChildView(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.S;
    }

    public void removeBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        this.f25609d0.remove(bottomSheetCallback);
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f25609d0.clear();
        if (bottomSheetCallback != null) {
            this.f25609d0.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z10) {
        this.M = z10;
    }

    public void setDraggableOnNestedScroll(boolean z10) {
        this.N = z10;
    }

    public void setExpandedOffset(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.E = i10;
        d0(this.P, true);
    }

    public void setFitToContents(boolean z10) {
        if (this.f25606c == z10) {
            return;
        }
        this.f25606c = z10;
        if (this.Z != null) {
            u();
        }
        W((this.f25606c && this.P == 6) ? 3 : this.P);
        d0(this.P, true);
        b0();
    }

    public void setGestureInsetBottomIgnored(boolean z10) {
        this.f25629p = z10;
    }

    public void setHalfExpandedRatio(@FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.H = f10;
        if (this.Z != null) {
            w();
        }
    }

    public void setHideFriction(float f10) {
        this.V = f10;
    }

    public void setHideable(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            if (!z10 && this.P == 5) {
                setState(4);
            }
            b0();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHideableInternal(boolean z10) {
        this.K = z10;
    }

    public void setMaxHeight(@Px int i10) {
        this.f25627n = i10;
    }

    public void setMaxWidth(@Px int i10) {
        this.f25626m = i10;
    }

    public void setPeekHeight(int i10) {
        setPeekHeight(i10, false);
    }

    public void setSaveFlags(int i10) {
        this.f25604b = i10;
    }

    public void setShouldRemoveExpandedCorners(boolean z10) {
        if (this.f25639z != z10) {
            this.f25639z = z10;
            d0(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i10) {
        this.f25612f = i10;
    }

    public void setSkipCollapsed(boolean z10) {
        this.L = z10;
    }

    public void setState(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.K && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        final int i11 = (i10 == 6 && this.f25606c && J(i10) <= this.F) ? 3 : i10;
        WeakReference weakReference = this.Z;
        if (weakReference == null || weakReference.get() == null) {
            W(i10);
        } else {
            final View view = (View) this.Z.get();
            T(view, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.a0(view, i11, false);
                }
            });
        }
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z10) {
        this.f25608d = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldExpandOnUpwardDrag(long j10, @FloatRange(from = 0.0d, to = TextSelectionMouseDetectorKt.ClicksSlop) float f10) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.f25613f0;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.f25613f0;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(backEventCompat);
    }

    public final void setPeekHeight(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f25616h) {
                return;
            } else {
                this.f25616h = true;
            }
        } else {
            if (!this.f25616h && this.f25614g == i10) {
                return;
            }
            this.f25616h = false;
            this.f25614g = Math.max(0, i10);
        }
        f0(z10);
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f25604b = 0;
        this.f25606c = true;
        this.f25608d = false;
        this.f25626m = -1;
        this.f25627n = -1;
        this.C = new StateSettlingTracker();
        this.H = 0.5f;
        this.J = -1.0f;
        this.M = true;
        this.N = true;
        this.P = 4;
        this.Q = 4;
        this.V = 0.1f;
        this.f25609d0 = new ArrayList();
        this.f25617h0 = -1;
        this.f25623k0 = new SparseIntArray();
        this.f25625l0 = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f25647a;

            private boolean a(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.Y + bottomSheetBehavior.getExpandedOffset()) / 2;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i102, int i11) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i102, int i11) {
                return MathUtils.clamp(i102, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(@NonNull View view) {
                return BottomSheetBehavior.this.A() ? BottomSheetBehavior.this.Y : BottomSheetBehavior.this.I;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i102) {
                if (i102 == 1 && BottomSheetBehavior.this.M) {
                    BottomSheetBehavior.this.W(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i102, int i11, int i12, int i13) {
                BottomSheetBehavior.this.F(i11);
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onViewReleased(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
                /*
                    Method dump skipped, instruction units count: 308
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass5.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i102) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i11 = bottomSheetBehavior.P;
                if (i11 == 1 || bottomSheetBehavior.f25619i0) {
                    return false;
                }
                if (i11 == 3 && bottomSheetBehavior.f25615g0 == i102) {
                    WeakReference weakReference = bottomSheetBehavior.f25607c0;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.f25647a = SystemClock.uptimeMillis();
                WeakReference weakReference2 = BottomSheetBehavior.this.Z;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        this.f25620j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        int i11 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f25624l = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.A = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, f25602m0).build();
        }
        D(context);
        E();
        this.J = typedArrayObtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i12 = R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            setPeekHeight(i10);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setDraggableOnNestedScroll(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggableOnNestedScroll, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i15 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            setExpandedOffset(typedValuePeekValue2.data);
        } else {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        setSignificantVelocityThreshold(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.f25630q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f25631r = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f25632s = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f25633t = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f25634u = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f25635v = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f25636w = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.f25639z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f25610e = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

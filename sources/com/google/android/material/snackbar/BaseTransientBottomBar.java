package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.compose.material.TextFieldImplKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarManager;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f27768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f27769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f27770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f27771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f27772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final SnackbarBaseLayout f27773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.material.snackbar.ContentViewCallback f27774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27775k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Anchor f27777m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27780p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27781q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27782r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f27783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27784t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f27785u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f27786v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f27787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Behavior f27788x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AccessibilityManager f27789y;
    private static final TimeInterpolator A = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    private static final TimeInterpolator B = AnimationUtils.LINEAR_INTERPOLATOR;
    private static final TimeInterpolator C = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
    private static final int[] E = {R.attr.snackbarStyle};
    private static final String F = BaseTransientBottomBar.class.getSimpleName();
    static final Handler D = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).R();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).G(message.arg1);
            return true;
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27778n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f27779o = new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.2
        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f27773i == null || baseTransientBottomBar.f27772h == null) {
                return;
            }
            int iHeight = (WindowUtils.getCurrentWindowBounds(BaseTransientBottomBar.this.f27772h).height() - BaseTransientBottomBar.this.E()) + ((int) BaseTransientBottomBar.this.f27773i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f27784t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f27785u = baseTransientBottomBar2.f27784t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f27773i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.F, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f27785u = baseTransientBottomBar3.f27784t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f27784t - iHeight;
            BaseTransientBottomBar.this.f27773i.requestLayout();
        }
    };

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    SnackbarManager.Callback f27790z = new SnackbarManager.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.5
        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public void dismiss(int i10) {
            Handler handler = BaseTransientBottomBar.D;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public void show() {
            Handler handler = BaseTransientBottomBar.D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    };

    static class Anchor implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f27808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference f27809c;

        private Anchor(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.f27808b = new WeakReference(baseTransientBottomBar);
            this.f27809c = new WeakReference(view);
        }

        static Anchor a(BaseTransientBottomBar baseTransientBottomBar, View view) {
            Anchor anchor = new Anchor(baseTransientBottomBar, view);
            if (view.isAttachedToWindow()) {
                ViewUtils.addOnGlobalLayoutListener(view, anchor);
            }
            view.addOnAttachStateChangeListener(anchor);
            return anchor;
        }

        private boolean d() {
            if (this.f27808b.get() != null) {
                return false;
            }
            c();
            return true;
        }

        View b() {
            return (View) this.f27809c.get();
        }

        void c() {
            if (this.f27809c.get() != null) {
                ((View) this.f27809c.get()).removeOnAttachStateChangeListener(this);
                ViewUtils.removeOnGlobalLayoutListener((View) this.f27809c.get(), this);
            }
            this.f27809c.clear();
            this.f27808b.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d() || !((BaseTransientBottomBar) this.f27808b.get()).f27778n) {
                return;
            }
            ((BaseTransientBottomBar) this.f27808b.get()).N();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            ViewUtils.addOnGlobalLayoutListener(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            ViewUtils.removeOnGlobalLayoutListener(view, this);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AnimationMode {
    }

    public static abstract class BaseCallback<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface DismissEvent {
        }

        public void onDismissed(B b10, int i10) {
        }

        public void onShown(B b10) {
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final BehaviorDelegate f27810m = new BehaviorDelegate(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void h(BaseTransientBottomBar baseTransientBottomBar) {
            this.f27810m.setBaseTransientBottomBar(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view) {
            return this.f27810m.canSwipeDismissView(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.f27810m.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BehaviorDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SnackbarManager.Callback f27811a;

        public BehaviorDelegate(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.setStartAlphaSwipeDistance(0.1f);
            swipeDismissBehavior.setEndAlphaSwipeDistance(0.6f);
            swipeDismissBehavior.setSwipeDirection(0);
        }

        public boolean canSwipeDismissView(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    SnackbarManager.b().pauseTimeout(this.f27811a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                SnackbarManager.b().restoreTimeoutIfPaused(this.f27811a);
            }
        }

        public void setBaseTransientBottomBar(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f27811a = baseTransientBottomBar.f27790z;
        }
    }

    @Deprecated
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @IntRange(from = -2)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Duration {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected static class SnackbarBaseLayout extends FrameLayout {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final View.OnTouchListener f27812m = new View.OnTouchListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BaseTransientBottomBar f27813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ShapeAppearanceModel f27814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f27815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f27816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f27817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f27818g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f27819h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ColorStateList f27820i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private PorterDuff.Mode f27821j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Rect f27822k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f27823l;

        protected SnackbarBaseLayout(Context context) {
            this(context, null);
        }

        private Drawable d() {
            int iLayer = MaterialColors.layer(this, R.attr.colorSurface, R.attr.colorOnSurface, getBackgroundOverlayColorAlpha());
            ShapeAppearanceModel shapeAppearanceModel = this.f27814c;
            Drawable drawableX = shapeAppearanceModel != null ? BaseTransientBottomBar.x(iLayer, shapeAppearanceModel) : BaseTransientBottomBar.w(iLayer, getResources());
            if (this.f27820i == null) {
                return DrawableCompat.wrap(drawableX);
            }
            Drawable drawableWrap = DrawableCompat.wrap(drawableX);
            drawableWrap.setTintList(this.f27820i);
            return drawableWrap;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f27822k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f27813b = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f27823l = true;
            viewGroup.addView(this);
            this.f27823l = false;
        }

        float getActionTextColorAlpha() {
            return this.f27817f;
        }

        int getAnimationMode() {
            return this.f27815d;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f27816e;
        }

        int getMaxInlineActionWidth() {
            return this.f27819h;
        }

        int getMaxWidth() {
            return this.f27818g;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f27813b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.I();
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f27813b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.J();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar baseTransientBottomBar = this.f27813b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.K();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f27818g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f27818g;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f27815d = i10;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f27820i != null) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                drawable.setTintList(this.f27820i);
                drawable.setTintMode(this.f27821j);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f27820i = colorStateList;
            if (getBackground() != null) {
                Drawable drawableWrap = DrawableCompat.wrap(getBackground().mutate());
                drawableWrap.setTintList(colorStateList);
                drawableWrap.setTintMode(this.f27821j);
                if (drawableWrap != getBackground()) {
                    super.setBackgroundDrawable(drawableWrap);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f27821j = mode;
            if (getBackground() != null) {
                Drawable drawableWrap = DrawableCompat.wrap(getBackground().mutate());
                drawableWrap.setTintMode(mode);
                if (drawableWrap != getBackground()) {
                    super.setBackgroundDrawable(drawableWrap);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f27823l || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.f27813b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.X();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f27812m);
            super.setOnClickListener(onClickListener);
        }

        protected SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(MaterialThemeOverlay.wrap(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_elevation)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.f27815d = typedArrayObtainStyledAttributes.getInt(R.styleable.SnackbarLayout_animationMode, 0);
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f27814c = ShapeAppearanceModel.builder(context2, attributeSet, 0, 0).build();
            }
            this.f27816e = typedArrayObtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f27817f = typedArrayObtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f27818g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.f27819h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f27812m);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(d());
            }
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (contentViewCallback == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f27771g = viewGroup;
        this.f27774j = contentViewCallback;
        this.f27772h = context;
        ThemeEnforcement.checkAppCompatTheme(context);
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(C(), viewGroup, false);
        this.f27773i = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.a(snackbarBaseLayout.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        snackbarBaseLayout.setAccessibilityLiveRegion(1);
        snackbarBaseLayout.setImportantForAccessibility(1);
        snackbarBaseLayout.setFitsSystemWindows(true);
        ViewCompat.setOnApplyWindowInsetsListener(snackbarBaseLayout, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(View view2, @NonNull WindowInsetsCompat windowInsetsCompat) {
                BaseTransientBottomBar.this.f27780p = windowInsetsCompat.getSystemWindowInsetBottom();
                BaseTransientBottomBar.this.f27781q = windowInsetsCompat.getSystemWindowInsetLeft();
                BaseTransientBottomBar.this.f27782r = windowInsetsCompat.getSystemWindowInsetRight();
                BaseTransientBottomBar.this.X();
                return windowInsetsCompat;
            }
        });
        ViewCompat.setAccessibilityDelegate(snackbarBaseLayout, new AccessibilityDelegateCompat() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.4
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.addAction(1048576);
                accessibilityNodeInfoCompat.setDismissable(true);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view2, int i10, Bundle bundle) {
                if (i10 != 1048576) {
                    return super.performAccessibilityAction(view2, i10, bundle);
                }
                BaseTransientBottomBar.this.dismiss();
                return true;
            }
        });
        this.f27789y = (AccessibilityManager) context.getSystemService("accessibility");
        int i10 = R.attr.motionDurationLong2;
        this.f27767c = MotionUtils.resolveThemeDuration(context, i10, 250);
        this.f27765a = MotionUtils.resolveThemeDuration(context, i10, TextFieldImplKt.AnimationDuration);
        this.f27766b = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium1, 75);
        int i11 = R.attr.motionEasingEmphasizedInterpolator;
        this.f27768d = MotionUtils.resolveThemeInterpolator(context, i11, B);
        this.f27770f = MotionUtils.resolveThemeInterpolator(context, i11, C);
        this.f27769e = MotionUtils.resolveThemeInterpolator(context, i11, A);
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f27770f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.12
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseTransientBottomBar.this.f27773i.setScaleX(fFloatValue);
                BaseTransientBottomBar.this.f27773i.setScaleY(fFloatValue);
            }
        });
        return valueAnimatorOfFloat;
    }

    private int D() {
        int height = this.f27773i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f27773i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E() {
        int[] iArr = new int[2];
        this.f27773i.getLocationInWindow(iArr);
        return iArr[1] + this.f27773i.getHeight();
    }

    private boolean H() {
        ViewGroup.LayoutParams layoutParams = this.f27773i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof SwipeDismissBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        this.f27783s = v();
        X();
    }

    private void O(CoordinatorLayout.LayoutParams layoutParams) {
        SwipeDismissBehavior swipeDismissBehaviorA = this.f27788x;
        if (swipeDismissBehaviorA == null) {
            swipeDismissBehaviorA = A();
        }
        if (swipeDismissBehaviorA instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorA).h(this);
        }
        swipeDismissBehaviorA.setListener(new SwipeDismissBehavior.OnDismissListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.7
            @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
            public void onDismiss(@NonNull View view) {
                if (view.getParent() != null) {
                    view.setVisibility(8);
                }
                BaseTransientBottomBar.this.y(0);
            }

            @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
            public void onDragStateChanged(int i10) {
                if (i10 == 0) {
                    SnackbarManager.b().restoreTimeoutIfPaused(BaseTransientBottomBar.this.f27790z);
                } else if (i10 == 1 || i10 == 2) {
                    SnackbarManager.b().pauseTimeout(BaseTransientBottomBar.this.f27790z);
                }
            }
        });
        layoutParams.setBehavior(swipeDismissBehaviorA);
        if (getAnchorView() == null) {
            layoutParams.insetEdge = 80;
        }
    }

    private boolean Q() {
        return this.f27784t > 0 && !this.f27776l && H();
    }

    private void S() {
        if (P()) {
            t();
            return;
        }
        if (this.f27773i.getParent() != null) {
            this.f27773i.setVisibility(0);
        }
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        ValueAnimator valueAnimatorZ = z(0.0f, 1.0f);
        ValueAnimator valueAnimatorB = B(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorZ, valueAnimatorB);
        animatorSet.setDuration(this.f27765a);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.M();
            }
        });
        animatorSet.start();
    }

    private void U(final int i10) {
        ValueAnimator valueAnimatorZ = z(1.0f, 0.0f);
        valueAnimatorZ.setDuration(this.f27766b);
        valueAnimatorZ.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.L(i10);
            }
        });
        valueAnimatorZ.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        int iD = D();
        this.f27773i.setTranslationY(iD);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iD, 0);
        valueAnimator.setInterpolator(this.f27769e);
        valueAnimator.setDuration(this.f27767c);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.13
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.M();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f27774j.animateContentIn(BaseTransientBottomBar.this.f27767c - BaseTransientBottomBar.this.f27765a, BaseTransientBottomBar.this.f27765a);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.14
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                BaseTransientBottomBar.this.f27773i.setTranslationY(((Integer) valueAnimator2.getAnimatedValue()).intValue());
            }
        });
        valueAnimator.start();
    }

    private void W(final int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, D());
        valueAnimator.setInterpolator(this.f27769e);
        valueAnimator.setDuration(this.f27767c);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.15
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.L(i10);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f27774j.animateContentOut(0, BaseTransientBottomBar.this.f27766b);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.16
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                BaseTransientBottomBar.this.f27773i.setTranslationY(((Integer) valueAnimator2.getAnimatedValue()).intValue());
            }
        });
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        ViewGroup.LayoutParams layoutParams = this.f27773i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(F, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f27773i.f27822k == null) {
            Log.w(F, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f27773i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f27773i.f27822k.bottom + (getAnchorView() != null ? this.f27783s : this.f27780p);
        int i11 = this.f27773i.f27822k.left + this.f27781q;
        int i12 = this.f27773i.f27822k.right + this.f27782r;
        int i13 = this.f27773i.f27822k.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f27773i.requestLayout();
        }
        if ((z10 || this.f27785u != this.f27784t) && Build.VERSION.SDK_INT >= 29 && Q()) {
            this.f27773i.removeCallbacks(this.f27779o);
            this.f27773i.post(this.f27779o);
        }
    }

    private void u(int i10) {
        if (this.f27773i.getAnimationMode() == 1) {
            U(i10);
        } else {
            W(i10);
        }
    }

    private int v() {
        if (getAnchorView() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        getAnchorView().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f27771g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f27771g.getHeight()) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable w(int i10, Resources resources) {
        float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaterialShapeDrawable x(int i10, ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(i10));
        return materialShapeDrawable;
    }

    private ValueAnimator z(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f27768d);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                BaseTransientBottomBar.this.f27773i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    protected SwipeDismissBehavior A() {
        return new Behavior();
    }

    protected int C() {
        return F() ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar;
    }

    protected boolean F() {
        TypedArray typedArrayObtainStyledAttributes = this.f27772h.obtainStyledAttributes(E);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void G(int i10) {
        if (P() && this.f27773i.getVisibility() == 0) {
            u(i10);
        } else {
            L(i10);
        }
    }

    void I() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f27773i.getRootWindowInsets()) == null) {
            return;
        }
        this.f27784t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        X();
    }

    void J() {
        if (isShownOrQueued()) {
            D.post(new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.6
                @Override // java.lang.Runnable
                public void run() {
                    BaseTransientBottomBar.this.L(3);
                }
            });
        }
    }

    void K() {
        if (this.f27786v) {
            S();
            this.f27786v = false;
        }
    }

    void L(int i10) {
        SnackbarManager.b().onDismissed(this.f27790z);
        List list = this.f27787w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.f27787w.get(size)).onDismissed(this, i10);
            }
        }
        ViewParent parent = this.f27773i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f27773i);
        }
    }

    void M() {
        SnackbarManager.b().onShown(this.f27790z);
        List list = this.f27787w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.f27787w.get(size)).onShown(this);
            }
        }
    }

    boolean P() {
        AccessibilityManager accessibilityManager = this.f27789y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    final void R() {
        if (this.f27773i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f27773i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                O((CoordinatorLayout.LayoutParams) layoutParams);
            }
            this.f27773i.c(this.f27771g);
            N();
            this.f27773i.setVisibility(4);
        }
        if (this.f27773i.isLaidOut()) {
            S();
        } else {
            this.f27786v = true;
        }
    }

    @NonNull
    public B addCallback(@Nullable BaseCallback<B> baseCallback) {
        if (baseCallback == null) {
            return this;
        }
        if (this.f27787w == null) {
            this.f27787w = new ArrayList();
        }
        this.f27787w.add(baseCallback);
        return this;
    }

    public void dismiss() {
        y(3);
    }

    @Nullable
    public View getAnchorView() {
        Anchor anchor = this.f27777m;
        if (anchor == null) {
            return null;
        }
        return anchor.b();
    }

    public int getAnimationMode() {
        return this.f27773i.getAnimationMode();
    }

    public Behavior getBehavior() {
        return this.f27788x;
    }

    @NonNull
    public Context getContext() {
        return this.f27772h;
    }

    public int getDuration() {
        return this.f27775k;
    }

    @NonNull
    public View getView() {
        return this.f27773i;
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
        return this.f27778n;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.f27776l;
    }

    public boolean isShown() {
        return SnackbarManager.b().isCurrent(this.f27790z);
    }

    public boolean isShownOrQueued() {
        return SnackbarManager.b().isCurrentOrNext(this.f27790z);
    }

    @NonNull
    public B removeCallback(@Nullable BaseCallback<B> baseCallback) {
        List list;
        if (baseCallback == null || (list = this.f27787w) == null) {
            return this;
        }
        list.remove(baseCallback);
        return this;
    }

    @NonNull
    public B setAnchorView(@Nullable View view) {
        Anchor anchor = this.f27777m;
        if (anchor != null) {
            anchor.c();
        }
        this.f27777m = view == null ? null : Anchor.a(this, view);
        return this;
    }

    public void setAnchorViewLayoutListenerEnabled(boolean z10) {
        this.f27778n = z10;
    }

    @NonNull
    public B setAnimationMode(int i10) {
        this.f27773i.setAnimationMode(i10);
        return this;
    }

    @NonNull
    public B setBehavior(Behavior behavior) {
        this.f27788x = behavior;
        return this;
    }

    @NonNull
    public B setDuration(int i10) {
        this.f27775k = i10;
        return this;
    }

    @NonNull
    public B setGestureInsetBottomIgnored(boolean z10) {
        this.f27776l = z10;
        return this;
    }

    public void show() {
        SnackbarManager.b().show(getDuration(), this.f27790z);
    }

    void t() {
        this.f27773i.post(new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.8
            @Override // java.lang.Runnable
            public void run() {
                SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f27773i;
                if (snackbarBaseLayout == null) {
                    return;
                }
                if (snackbarBaseLayout.getParent() != null) {
                    BaseTransientBottomBar.this.f27773i.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.f27773i.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.T();
                } else {
                    BaseTransientBottomBar.this.V();
                }
            }
        });
    }

    protected void y(int i10) {
        SnackbarManager.b().dismiss(this.f27790z, i10);
    }

    @NonNull
    public B setAnchorView(@IdRes int i10) {
        View viewFindViewById = this.f27771g.findViewById(i10);
        if (viewFindViewById != null) {
            return (B) setAnchorView(viewFindViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i10);
    }
}

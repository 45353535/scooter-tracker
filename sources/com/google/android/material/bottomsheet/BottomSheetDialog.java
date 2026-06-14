package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class BottomSheetDialog extends AppCompatDialog {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BottomSheetBehavior f25661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f25662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CoordinatorLayout f25663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FrameLayout f25664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f25665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f25666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private EdgeToEdgeCallback f25669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MaterialBackOrchestrator f25671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private BottomSheetBehavior.BottomSheetCallback f25672m;

    private static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Boolean f25678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WindowInsetsCompat f25679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Window f25680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f25681d;

        private void b(View view) {
            if (view.getTop() < this.f25679b.getSystemWindowInsetTop()) {
                Window window = this.f25680c;
                if (window != null) {
                    Boolean bool = this.f25678a;
                    EdgeToEdgeUtils.setLightStatusBar(window, bool == null ? this.f25681d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f25679b.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f25680c;
                if (window2 != null) {
                    EdgeToEdgeUtils.setLightStatusBar(window2, this.f25681d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        void a(View view) {
            b(view);
        }

        void c(Window window) {
            if (this.f25680c == window) {
                return;
            }
            this.f25680c = window;
            if (window != null) {
                this.f25681d = WindowCompat.getInsetsController(window, window.getDecorView()).isAppearanceLightStatusBars();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f10) {
            b(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i10) {
            b(view);
        }

        private EdgeToEdgeCallback(View view, WindowInsetsCompat windowInsetsCompat) {
            this.f25679b = windowInsetsCompat;
            MaterialShapeDrawable materialShapeDrawableI = BottomSheetBehavior.from(view).I();
            ColorStateList fillColor = materialShapeDrawableI != null ? materialShapeDrawableI.getFillColor() : view.getBackgroundTintList();
            if (fillColor != null) {
                this.f25678a = Boolean.valueOf(MaterialColors.isColorLight(fillColor.getDefaultColor()));
                return;
            }
            Integer backgroundColor = ViewUtils.getBackgroundColor(view);
            if (backgroundColor != null) {
                this.f25678a = Boolean.valueOf(MaterialColors.isColorLight(backgroundColor.intValue()));
            } else {
                this.f25678a = null;
            }
        }
    }

    public BottomSheetDialog(@NonNull Context context) {
        this(context, 0);
        g();
    }

    private FrameLayout f() {
        if (this.f25662c == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f25662c = frameLayout;
            this.f25663d = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f25662c.findViewById(R.id.design_bottom_sheet);
            this.f25664e = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout2);
            this.f25661b = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.addBottomSheetCallback(this.f25672m);
            this.f25661b.setHideable(this.f25666g);
            this.f25671l = new MaterialBackOrchestrator(this.f25661b, this.f25664e);
        }
        return this.f25662c;
    }

    private void g() {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.f25670k = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static int getThemeResId(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
    }

    private void j() {
        MaterialBackOrchestrator materialBackOrchestrator = this.f25671l;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.f25666g) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private View k(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f25662c.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f25670k) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f25662c, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    if (BottomSheetDialog.this.f25669j != null) {
                        BottomSheetDialog.this.f25661b.removeBottomSheetCallback(BottomSheetDialog.this.f25669j);
                    }
                    if (windowInsetsCompat != null) {
                        BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                        bottomSheetDialog.f25669j = new EdgeToEdgeCallback(bottomSheetDialog.f25664e, windowInsetsCompat);
                        BottomSheetDialog.this.f25669j.c(BottomSheetDialog.this.getWindow());
                        BottomSheetDialog.this.f25661b.addBottomSheetCallback(BottomSheetDialog.this.f25669j);
                    }
                    return windowInsetsCompat;
                }
            });
        }
        this.f25664e.removeAllViews();
        if (layoutParams == null) {
            this.f25664e.addView(view);
        } else {
            this.f25664e.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.f25666g && bottomSheetDialog.isShowing() && BottomSheetDialog.this.i()) {
                    BottomSheetDialog.this.cancel();
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(this.f25664e, new AccessibilityDelegateCompat() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.3
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (!BottomSheetDialog.this.f25666g) {
                    accessibilityNodeInfoCompat.setDismissable(false);
                } else {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view2, int i11, Bundle bundle) {
                if (i11 == 1048576) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    if (bottomSheetDialog.f25666g) {
                        bottomSheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view2, i11, bundle);
            }
        });
        this.f25664e.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.f25662c;
    }

    @Deprecated
    public static void setLightStatusBar(@NonNull View view, boolean z10) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z10 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (!this.f25665f || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.f25661b == null) {
            f();
        }
        return this.f25661b;
    }

    public boolean getDismissWithAnimation() {
        return this.f25665f;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.f25670k;
    }

    void h() {
        this.f25661b.removeBottomSheetCallback(this.f25672m);
    }

    boolean i() {
        if (!this.f25668i) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.f25667h = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f25668i = true;
        }
        return this.f25667h;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f25670k && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f25662c;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f25663d;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            WindowCompat.setDecorFitsSystemWindows(window, !z10);
            EdgeToEdgeCallback edgeToEdgeCallback = this.f25669j;
            if (edgeToEdgeCallback != null) {
                edgeToEdgeCallback.c(window);
            }
        }
        j();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        EdgeToEdgeCallback edgeToEdgeCallback = this.f25669j;
        if (edgeToEdgeCallback != null) {
            edgeToEdgeCallback.c(null);
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.f25671l;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f25661b;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.f25661b.setState(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f25666g != z10) {
            this.f25666g = z10;
            BottomSheetBehavior bottomSheetBehavior = this.f25661b;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z10);
            }
            if (getWindow() != null) {
                j();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f25666g) {
            this.f25666g = true;
        }
        this.f25667h = z10;
        this.f25668i = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i10) {
        super.setContentView(k(i10, null, null));
    }

    public void setDismissWithAnimation(boolean z10) {
        this.f25665f = z10;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(k(0, view, null));
    }

    public BottomSheetDialog(@NonNull Context context, @StyleRes int i10) {
        super(context, getThemeResId(context, i10));
        this.f25666g = true;
        this.f25667h = true;
        this.f25672m = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.5
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(@NonNull View view, float f10) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(@NonNull View view, int i11) {
                if (i11 == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
        g();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(k(0, view, layoutParams));
    }
}

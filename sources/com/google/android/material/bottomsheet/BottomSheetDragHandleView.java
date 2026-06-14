package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes9.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f25684l = R.style.Widget_Material3_BottomSheet_DragHandle;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AccessibilityManager f25685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BottomSheetBehavior f25686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GestureDetector f25687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f25692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final BottomSheetBehavior.BottomSheetCallback f25693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final GestureDetector.OnGestureListener f25694k;

    public BottomSheetDragHandleView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        boolean z10 = false;
        if (!h()) {
            return false;
        }
        if (!this.f25686c.isFitToContents() && !this.f25686c.shouldSkipHalfExpandedStateWhenDragging()) {
            z10 = true;
        }
        int state = this.f25686c.getState();
        int i10 = 6;
        int i11 = 3;
        if (state == 4) {
            if (!z10) {
                i10 = i11;
            }
        } else if (state != 3) {
            if (!this.f25688e) {
                i11 = 4;
            }
            i10 = i11;
        } else if (!z10) {
            i10 = 4;
        }
        this.f25686c.setState(i10);
        return true;
    }

    private BottomSheetBehavior f() {
        View viewG = this;
        while (true) {
            viewG = g(viewG);
            if (viewG == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = viewG.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) behavior;
                }
            }
        }
    }

    private static View g(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    private boolean h() {
        return this.f25686c != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i10) {
        if (i10 == 4) {
            this.f25688e = true;
        } else if (i10 == 3) {
            this.f25688e = false;
        }
        ViewCompat.replaceAccessibilityAction(this, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK, this.f25688e ? this.f25691h : this.f25692i, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.a
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return this.f25702a.e();
            }
        });
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.f25686c;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(this.f25693j);
            this.f25686c.U(null);
            this.f25686c.V(null);
        }
        this.f25686c = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.U(this);
            this.f25686c.V(this);
            i(this.f25686c.getState());
            this.f25686c.addBottomSheetCallback(this.f25693j);
        }
        setClickable(h());
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z10) {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(f());
        AccessibilityManager accessibilityManager = this.f25685b;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.f25685b.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f25685b;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f25690g || this.f25689f) ? super.onTouchEvent(motionEvent) : this.f25687d.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f25690g = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f25689f = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, f25684l), attributeSet, i10);
        this.f25689f = false;
        this.f25690g = false;
        this.f25691h = getResources().getString(R.string.bottomsheet_action_expand);
        this.f25692i = getResources().getString(R.string.bottomsheet_action_collapse);
        this.f25693j = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(@NonNull View view, float f10) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(@NonNull View view, int i11) {
                BottomSheetDragHandleView.this.i(i11);
            }
        };
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(@NonNull MotionEvent motionEvent) {
                if (BottomSheetDragHandleView.this.f25686c == null || !BottomSheetDragHandleView.this.f25686c.isHideable()) {
                    return super.onDoubleTap(motionEvent);
                }
                BottomSheetDragHandleView.this.f25686c.setState(5);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(@NonNull MotionEvent motionEvent) {
                return BottomSheetDragHandleView.this.isClickable();
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(@NonNull MotionEvent motionEvent) {
                return BottomSheetDragHandleView.this.e();
            }
        };
        this.f25694k = simpleOnGestureListener;
        Context context2 = getContext();
        this.f25687d = new GestureDetector(context2, simpleOnGestureListener, new Handler(Looper.getMainLooper()));
        this.f25685b = (AccessibilityManager) context2.getSystemService("accessibility");
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.3
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView.this.e();
                }
            }
        });
    }
}

package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* JADX INFO: loaded from: classes9.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ViewDragHelper f25517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    OnDismissListener f25518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25520e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25522g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f25521f = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f25523h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f25524i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f25525j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f25526k = 0.5f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ViewDragHelper.Callback f25527l = new ViewDragHelper.Callback() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25529b = -1;

        private boolean a(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f25528a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f25524i);
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f25523h;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                return z10 ? f10 < 0.0f : f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z10) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = view.getLayoutDirection() == 1;
            int i12 = SwipeDismissBehavior.this.f25523h;
            if (i12 == 0) {
                if (z10) {
                    width = this.f25528a - view.getWidth();
                    width2 = this.f25528a;
                } else {
                    width = this.f25528a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f25528a - view.getWidth();
                width2 = view.getWidth() + this.f25528a;
            } else if (z10) {
                width = this.f25528a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f25528a - view.getWidth();
                width2 = this.f25528a;
            }
            return SwipeDismissBehavior.c(width, i10, width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(@NonNull View view, int i10) {
            this.f25529b = i10;
            this.f25528a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f25520e = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f25520e = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i10) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.f25518c;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i10);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(@NonNull View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f25525j;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f25526k;
            float fAbs = Math.abs(i10 - this.f25528a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.b(0.0f, 1.0f - SwipeDismissBehavior.e(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onViewReleased(@androidx.annotation.NonNull android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f25529b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.a(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.f25528a
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.f25528a
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.f25528a
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                androidx.customview.widget.ViewDragHelper r5 = r5.f25517b
                int r1 = r3.getTop()
                boolean r5 = r5.settleCapturedViewAt(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$SettleRunnable r5 = new com.google.android.material.behavior.SwipeDismissBehavior$SettleRunnable
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                r3.postOnAnimation(r5)
                return
            L3f:
                if (r4 == 0) goto L4a
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener r4 = r4.f25518c
                if (r4 == 0) goto L4a
                r4.onDismiss(r3)
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass1.onViewReleased(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i10) {
            int i11 = this.f25529b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i10);
    }

    private class SettleRunnable implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f25532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f25533c;

        SettleRunnable(View view, boolean z10) {
            this.f25532b = view;
            this.f25533c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f25517b;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                this.f25532b.postOnAnimation(this);
            } else {
                if (!this.f25533c || (onDismissListener = SwipeDismissBehavior.this.f25518c) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.f25532b);
            }
        }
    }

    static float b(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int c(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void d(ViewGroup viewGroup) {
        if (this.f25517b == null) {
            this.f25517b = this.f25522g ? ViewDragHelper.create(viewGroup, this.f25521f, this.f25527l) : ViewDragHelper.create(viewGroup, this.f25527l);
        }
    }

    static float e(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void f(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (canSwipeDismissView(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new AccessibilityViewCommand() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean perform(@NonNull View view2, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    boolean z10 = view2.getLayoutDirection() == 1;
                    int i10 = SwipeDismissBehavior.this.f25523h;
                    ViewCompat.offsetLeftAndRight(view2, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view2.getWidth() : -view2.getWidth());
                    view2.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.f25518c;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    public int getDragState() {
        ViewDragHelper viewDragHelper = this.f25517b;
        if (viewDragHelper != null) {
            return viewDragHelper.getViewDragState();
        }
        return 0;
    }

    @Nullable
    @VisibleForTesting
    public OnDismissListener getListener() {
        return this.f25518c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.f25519d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f25519d = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f25519d = false;
        }
        if (zIsPointInChildBounds) {
            d(coordinatorLayout);
            if (!this.f25520e && this.f25517b.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v10, i10);
        if (v10.getImportantForAccessibility() == 0) {
            v10.setImportantForAccessibility(1);
            f(v10);
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f25517b == null) {
            return false;
        }
        if (this.f25520e && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f25517b.processTouchEvent(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f10) {
        this.f25524i = b(0.0f, f10, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f10) {
        this.f25526k = b(0.0f, f10, 1.0f);
    }

    public void setListener(@Nullable OnDismissListener onDismissListener) {
        this.f25518c = onDismissListener;
    }

    public void setSensitivity(float f10) {
        this.f25521f = f10;
        this.f25522g = true;
    }

    public void setStartAlphaSwipeDistance(float f10) {
        this.f25525j = b(0.0f, f10, 1.0f);
    }

    public void setSwipeDirection(int i10) {
        this.f25523h = i10;
    }
}

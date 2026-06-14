package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;

/* JADX INFO: loaded from: classes9.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f25382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    OverScroller f25383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private VelocityTracker f25388k;

    private class FlingRunnable implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CoordinatorLayout f25389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f25390c;

        FlingRunnable(CoordinatorLayout coordinatorLayout, View view) {
            this.f25389b = coordinatorLayout;
            this.f25390c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f25390c == null || (overScroller = HeaderBehavior.this.f25383f) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                HeaderBehavior.this.h(this.f25389b, this.f25390c);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.j(this.f25389b, this.f25390c, headerBehavior.f25383f.getCurrY());
            this.f25390c.postOnAnimation(this);
        }
    }

    public HeaderBehavior() {
        this.f25385h = -1;
        this.f25387j = -1;
    }

    private void c() {
        if (this.f25388k == null) {
            this.f25388k = VelocityTracker.obtain();
        }
    }

    boolean b(View view) {
        return false;
    }

    final boolean d(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f25382e;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f25382e = null;
        }
        if (this.f25383f == null) {
            this.f25383f = new OverScroller(view.getContext());
        }
        this.f25383f.fling(0, getTopAndBottomOffset(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f25383f.computeScrollOffset()) {
            h(coordinatorLayout, view);
            return false;
        }
        FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, view);
        this.f25382e = flingRunnable;
        view.postOnAnimation(flingRunnable);
        return true;
    }

    int e(View view) {
        return -view.getHeight();
    }

    int f(View view) {
        return view.getHeight();
    }

    int g() {
        return getTopAndBottomOffset();
    }

    void h(CoordinatorLayout coordinatorLayout, View view) {
    }

    final int i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return k(coordinatorLayout, view, g() - i10, i11, i12);
    }

    int j(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return k(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        int iClamp;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i11 == 0 || topAndBottomOffset < i11 || topAndBottomOffset > i12 || topAndBottomOffset == (iClamp = MathUtils.clamp(i10, i11, i12))) {
            return 0;
        }
        setTopAndBottomOffset(iClamp);
        return topAndBottomOffset - iClamp;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f25387j < 0) {
            this.f25387j = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f25384g) {
            int i10 = this.f25385h;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f25386i) > this.f25387j) {
                this.f25386i = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f25385h = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = b(v10) && coordinatorLayout.isPointInChildBounds(v10, x10, y11);
            this.f25384g = z10;
            if (z10) {
                this.f25386i = y11;
                this.f25385h = motionEvent.getPointerId(0);
                c();
                OverScroller overScroller = this.f25383f;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f25383f.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f25388k;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r10, @androidx.annotation.NonNull V r11, @androidx.annotation.NonNull android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 1
            r8 = 0
            if (r1 == r7) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = r7
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.f25385h = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.f25386i = r1
            goto L4b
        L2d:
            int r1 = r9.f25385h
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r8
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.f25386i
            int r3 = r3 - r1
            r9.f25386i = r1
            int r4 = r9.e(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.i(r1, r2, r3, r4, r5)
        L4b:
            r1 = r8
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.f25388k
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.f25388k
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.f25388k
            int r3 = r9.f25385h
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.f(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.d(r1, r2, r3, r4, r5)
            r1 = r7
            goto L72
        L71:
            r1 = r8
        L72:
            r9.f25384g = r8
            r9.f25385h = r6
            android.view.VelocityTracker r2 = r9.f25388k
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.f25388k = r2
        L80:
            android.view.VelocityTracker r2 = r9.f25388k
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.f25384g
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r8
        L8f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25385h = -1;
        this.f25387j = -1;
    }
}

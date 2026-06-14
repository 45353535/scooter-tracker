package com.yandex.div.internal.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes11.dex */
public class NestedHorizontalScrollCompanion {
    private boolean mCanDispatchNestedScroll;
    private float mDownX;
    private float mDownY;
    private final float mSlop;
    private final View mTarget;

    public NestedHorizontalScrollCompanion(@NonNull View view) {
        this(view, getScaledTouchSlop(view));
    }

    private static int getScaledTouchSlop(@NonNull View view) {
        return ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    public void dispatchOnOverScrolled(boolean z10) {
        if (this.mCanDispatchNestedScroll && z10) {
            ViewCompat.dispatchNestedScroll(this.mTarget, 0, 0, 1, 0, null);
        }
    }

    public void dispatchOnScrollChanged() {
        this.mCanDispatchNestedScroll = false;
    }

    public void dispatchTouchEventAfterSuperCall(@NonNull MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getX();
            this.mDownY = motionEvent.getY();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.mDownX);
                float fAbs2 = Math.abs(motionEvent.getY() - this.mDownY);
                if (this.mCanDispatchNestedScroll || fAbs < this.mSlop || fAbs <= fAbs2) {
                    return;
                }
                this.mCanDispatchNestedScroll = true;
                ViewCompat.startNestedScroll(this.mTarget, 1);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.mCanDispatchNestedScroll = false;
        ViewCompat.stopNestedScroll(this.mTarget);
    }

    @VisibleForTesting
    NestedHorizontalScrollCompanion(@NonNull View view, float f10) {
        this.mTarget = view;
        ViewCompat.setNestedScrollingEnabled(view, true);
        this.mSlop = f10;
    }

    public NestedHorizontalScrollCompanion(@NonNull ViewPager viewPager) {
        this(viewPager, getScaledTouchSlop(viewPager));
    }
}

package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.widget.ViewDragHelper;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.internal.util.NestedHorizontalScrollCompanion;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class ScrollableViewPager extends RtlViewPager {

    @Nullable
    private Set<Integer> mDisabledPages;
    private boolean mIsEdgeScrollEnabled;
    private boolean mIsScrollEnabled;
    private boolean mIsScrollLocked;
    private boolean mIsSwipeLocked;
    private final NestedHorizontalScrollCompanion mNestedScrollCompanion;

    @Nullable
    private OnInterceptTouchEventListener mOnInterceptTouchEventListener;

    @Nullable
    private ViewDragHelper mViewDragHelper;

    public ScrollableViewPager(@NonNull Context context) {
        this(context, null);
    }

    private boolean processTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!this.mIsEdgeScrollEnabled && this.mViewDragHelper != null) {
            if ((motionEvent.getAction() & 255) == 0) {
                this.mIsSwipeLocked = false;
            }
            this.mViewDragHelper.processTouchEvent(motionEvent);
        }
        Set<Integer> set = this.mDisabledPages;
        if (set != null) {
            this.mIsScrollLocked = this.mIsScrollEnabled && set.contains(Integer.valueOf(getCurrentItem()));
        }
        return (this.mIsSwipeLocked || this.mIsScrollLocked || !this.mIsScrollEnabled) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.mNestedScrollCompanion.dispatchTouchEventAfterSuperCall(motionEvent);
        return zDispatchTouchEvent;
    }

    @Nullable
    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.mOnInterceptTouchEventListener;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.mOnInterceptTouchEventListener;
        if (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent) : false) {
            return true;
        }
        return processTouchEvent(motionEvent) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        this.mNestedScrollCompanion.dispatchOnScrollChanged();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return processTouchEvent(motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setDisabledScrollPages(@Nullable Set<Integer> set) {
        this.mDisabledPages = set;
    }

    public void setEdgeScrollEnabled(boolean z10) {
        this.mIsEdgeScrollEnabled = z10;
        if (z10) {
            return;
        }
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(this, new ViewDragHelper.Callback() { // from class: com.yandex.div.internal.widget.tabs.ScrollableViewPager.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onEdgeDragStarted(int i10, int i11) {
                super.onEdgeDragStarted(i10, i11);
                ScrollableViewPager scrollableViewPager = ScrollableViewPager.this;
                boolean z11 = true;
                if ((i10 & 2) == 0 && (i10 & 1) == 0) {
                    z11 = false;
                }
                scrollableViewPager.mIsSwipeLocked = z11;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i10) {
                return false;
            }
        });
        this.mViewDragHelper = viewDragHelperCreate;
        viewDragHelperCreate.setEdgeTrackingEnabled(3);
    }

    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.mOnInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setScrollEnabled(boolean z10) {
        this.mIsScrollEnabled = z10;
    }

    public ScrollableViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mNestedScrollCompanion = new NestedHorizontalScrollCompanion((ViewPager) this);
        this.mIsScrollEnabled = true;
        this.mIsEdgeScrollEnabled = true;
        this.mIsSwipeLocked = false;
        this.mIsScrollLocked = false;
    }
}

package com.pubmatic.sdk.webrendering.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;

/* JADX INFO: loaded from: classes11.dex */
public class POBViewabilityTracker implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnWindowFocusChangeListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f63468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnViewabilityChangedListener f63469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f63470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f63472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f63473f;

    public interface OnViewabilityChangedListener {
        void onViewabilityChanged(boolean z10);
    }

    public POBViewabilityTracker(@NonNull View view) {
        this.f63468a = view;
        this.f63473f = false;
        this.f63472e = false;
        view.addOnAttachStateChangeListener(this);
    }

    private void a() {
        if (this.f63468a.getViewTreeObserver().isAlive()) {
            this.f63468a.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        }
    }

    private void b() {
        if (this.f63468a.getViewTreeObserver().isAlive()) {
            this.f63468a.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f63468a.getViewTreeObserver().addOnScrollChangedListener(this);
        }
    }

    private void c() {
        if (this.f63468a.getViewTreeObserver().isAlive()) {
            this.f63468a.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }

    private void d() {
        if (this.f63468a.getViewTreeObserver().isAlive()) {
            this.f63468a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f63468a.getViewTreeObserver().removeOnScrollChangedListener(this);
        }
    }

    private void e() {
        int i10 = this.f63471d;
        boolean z10 = false;
        if (i10 != 0) {
            if (POBUtils.isViewVisible(this.f63468a, i10) && this.f63468a.hasWindowFocus()) {
                z10 = true;
            }
            OnViewabilityChangedListener onViewabilityChangedListener = this.f63469b;
            if (onViewabilityChangedListener != null) {
                onViewabilityChangedListener.onViewabilityChanged(z10);
            }
            this.f63473f = z10;
            return;
        }
        if (POBUtils.getVisiblePercent(this.f63468a) >= this.f63470c && this.f63468a.hasWindowFocus()) {
            z10 = true;
        }
        if (this.f63473f != z10) {
            OnViewabilityChangedListener onViewabilityChangedListener2 = this.f63469b;
            if (onViewabilityChangedListener2 != null) {
                onViewabilityChangedListener2.onViewabilityChanged(z10);
            }
            this.f63473f = z10;
        }
    }

    public void destroy() {
        d();
        c();
        this.f63468a.removeOnAttachStateChangeListener(this);
    }

    public boolean isViewable() {
        return this.f63473f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        e();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        a();
        if (this.f63472e) {
            b();
        }
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
        c();
        e();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z10) {
        e();
    }

    public void setAllowViewTreeObserverRegistration(boolean z10) {
        this.f63472e = z10;
    }

    public void setOnExposureChangeWithThresholdListener(@Nullable OnViewabilityChangedListener onViewabilityChangedListener) {
        this.f63469b = onViewabilityChangedListener;
    }

    public POBViewabilityTracker(@NonNull View view, float f10) {
        this(view);
        this.f63470c = f10;
    }

    public POBViewabilityTracker(@NonNull View view, int i10) {
        this(view);
        this.f63471d = i10;
    }
}

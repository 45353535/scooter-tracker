package com.mobilefuse.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes10.dex */
public class AdRendererContainer extends RelativeLayout {
    private Runnable attachedToWindowCallback;
    private Runnable delayedProgressBarTask;
    private Runnable detachedFromWindowCallback;
    private Handler handler;
    private ProgressBar progressBar;

    public AdRendererContainer(@NonNull Context context) {
        super(context);
        this.handler = new Handler(Looper.getMainLooper());
        this.delayedProgressBarTask = new Runnable() { // from class: com.mobilefuse.sdk.i
            @Override // java.lang.Runnable
            public final void run() {
                AdRendererContainer.a(this.f53379b);
            }
        };
    }

    public static /* synthetic */ void a(AdRendererContainer adRendererContainer) {
        adRendererContainer.getClass();
        try {
            adRendererContainer.showProgressBar();
        } catch (Throwable th2) {
            StabilityHelper.logException(adRendererContainer, th2);
        }
    }

    public Runnable getAttachedToWindowCallback() {
        return this.attachedToWindowCallback;
    }

    public Runnable getDetachedFromWindowCallback() {
        return this.detachedFromWindowCallback;
    }

    public void hideProgressBar() throws Throwable {
        this.handler.removeCallbacks(this.delayedProgressBarTask);
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            return;
        }
        removeView(progressBar);
        this.progressBar = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Log.d("MF sdk", "onAttachedToWindow");
        super.onAttachedToWindow();
        try {
            Runnable runnable = this.attachedToWindowCallback;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        Log.d("MF sdk", "onDetachedFromWindow");
        try {
            Runnable runnable = this.detachedFromWindowCallback;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
        super.onDetachedFromWindow();
    }

    public void setAttachedToWindowCallback(Runnable runnable) throws Throwable {
        this.attachedToWindowCallback = runnable;
    }

    public void setDetachedFromWindowCallback(Runnable runnable) {
        this.detachedFromWindowCallback = runnable;
    }

    public void showProgressBar() throws Throwable {
        this.handler.removeCallbacks(this.delayedProgressBarTask);
        if (this.progressBar != null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.progressBar = progressBar;
        addView(progressBar, layoutParams);
    }

    public void showProgressBarWithDelay(long j10) throws Throwable {
        this.handler.postDelayed(this.delayedProgressBarTask, j10);
    }

    public AdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.handler = new Handler(Looper.getMainLooper());
        this.delayedProgressBarTask = new Runnable() { // from class: com.mobilefuse.sdk.i
            @Override // java.lang.Runnable
            public final void run() {
                AdRendererContainer.a(this.f53379b);
            }
        };
    }

    public AdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.handler = new Handler(Looper.getMainLooper());
        this.delayedProgressBarTask = new Runnable() { // from class: com.mobilefuse.sdk.i
            @Override // java.lang.Runnable
            public final void run() {
                AdRendererContainer.a(this.f53379b);
            }
        };
    }

    @RequiresApi(api = 21)
    public AdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.handler = new Handler(Looper.getMainLooper());
        this.delayedProgressBarTask = new Runnable() { // from class: com.mobilefuse.sdk.i
            @Override // java.lang.Runnable
            public final void run() {
                AdRendererContainer.a(this.f53379b);
            }
        };
    }
}

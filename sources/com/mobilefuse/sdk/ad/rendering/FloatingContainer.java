package com.mobilefuse.sdk.ad.rendering;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresApi;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.internal.Callback;

/* JADX INFO: loaded from: classes10.dex */
public class FloatingContainer extends RelativeLayout {
    private View.OnTouchListener floatingTouchListener;
    private Callback<Boolean> onTouchInteractionEnabledChanged;
    private boolean touchInteractionEnabled;

    public FloatingContainer(Context context) throws Throwable {
        super(context);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.touchInteractionEnabled) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean isTouchInteractionEnabled() {
        return this.touchInteractionEnabled;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            View.OnTouchListener onTouchListener = this.floatingTouchListener;
            if (onTouchListener == null) {
                return false;
            }
            onTouchListener.onTouch(this, motionEvent);
            return false;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return false;
        }
    }

    public void setFloatingTouchListener(View.OnTouchListener onTouchListener) {
        this.floatingTouchListener = onTouchListener;
    }

    public void setOnTouchInteractionEnabledChanged(Callback<Boolean> callback) {
        this.onTouchInteractionEnabledChanged = callback;
    }

    public void setTouchInteractionEnabled(boolean z10) {
        this.touchInteractionEnabled = z10;
        Callback<Boolean> callback = this.onTouchInteractionEnabledChanged;
        if (callback != null) {
            try {
                callback.call(Boolean.valueOf(z10));
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
            }
        }
    }

    public FloatingContainer(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }

    public FloatingContainer(Context context, AttributeSet attributeSet, int i10) throws Throwable {
        super(context, attributeSet, i10);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }

    @RequiresApi(api = 21)
    public FloatingContainer(Context context, AttributeSet attributeSet, int i10, int i11) throws Throwable {
        super(context, attributeSet, i10, i11);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }
}

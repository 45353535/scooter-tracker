package com.bytedance.sdk.openadsdk.core.mo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class mo extends FrameLayout {
    private boolean jpc;
    private Drawable lnr;
    private Drawable mml;
    private boolean mo;
    private Drawable mzz;
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17326ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private ValueAnimator f17327wd;

    public mo(Context context) {
        super(context);
        this.qdl = 100;
    }

    private void qdl() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.f17327wd = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.f17327wd.setRepeatCount(-1);
        this.f17327wd.setInterpolator(new LinearInterpolator());
        this.f17327wd.setRepeatMode(1);
        this.f17327wd.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.mo.mo.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                mo.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f17327wd.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mo = true;
        if (this.mzz != null) {
            qdl();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mo = false;
        ValueAnimator valueAnimator = this.f17327wd;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17327wd.removeAllUpdateListeners();
            this.f17327wd = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            ValueAnimator valueAnimator = this.f17327wd;
            if (valueAnimator == null || this.jpc) {
                return;
            }
            this.jpc = true;
            valueAnimator.pause();
            return;
        }
        if (this.jpc) {
            this.jpc = false;
            ValueAnimator valueAnimator2 = this.f17327wd;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                qdl();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.mzz = drawable;
        setProgressDrawable(drawable);
        if (this.mo && this.f17327wd == null) {
            qdl();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(tvp.qdl(this, layoutParams));
    }

    public void setMax(int i10) {
        this.qdl = i10;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setProgress(int i10) {
        this.f17326ud = i10;
        Drawable drawable = this.lnr;
        if (drawable != null) {
            drawable.setLevel((int) ((i10 * 10000.0f) / this.qdl));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.mml = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.mml;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable3 = ((LayerDrawable) this.mml).getDrawable(i10);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.lnr = drawable3;
                }
            }
        }
        Drawable drawable4 = this.mml;
        if (drawable4 instanceof RotateDrawable) {
            this.lnr = drawable4;
        }
    }

    public mo(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.qdl = 100;
    }
}

package com.mbridge.msdk.dycreator.baseview.cusview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ObjectAnimator f47892a;

    public MBridgeTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f47892a;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f47892a;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f47892a = objectAnimator;
    }

    public MBridgeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}

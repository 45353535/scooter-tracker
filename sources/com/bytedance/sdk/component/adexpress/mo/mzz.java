package com.bytedance.sdk.component.adexpress.mo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
public class mzz extends FrameLayout {
    private ImageView qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private AnimatorSet f16429ud;

    public mzz(Context context) {
        super(context);
        lnr();
        mml();
    }

    private void lnr() {
        ImageView imageView = new ImageView(getContext());
        this.qdl = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.ljh.mml(getContext(), "tt_white_hand"));
        int iQdl = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iQdl, iQdl);
        layoutParams.gravity = 17;
        addView(this.qdl, layoutParams);
    }

    private void mml() {
        this.f16429ud = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.qdl, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.qdl, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f16429ud.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void qdl() {
        AnimatorSet animatorSet = this.f16429ud;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public void ud() {
        AnimatorSet animatorSet = this.f16429ud;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}

package com.bytedance.sdk.component.adexpress.mo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.taurusx.tax.ui.CircularProgressBar;

/* JADX INFO: loaded from: classes6.dex */
public class oth extends RelativeLayout {
    private AnimatorSet jpc;
    private ImageView lnr;
    private TextView mml;
    private AnimatorSet mo;
    private TextView mzz;
    private ImageView qdl;
    private int rq;
    private String to;
    private AnimatorSet tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private ImageView f16430ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private AnimatorSet f16431wd;

    public oth(Context context) {
        super(context);
        this.mo = new AnimatorSet();
        this.f16431wd = new AnimatorSet();
        this.jpc = new AnimatorSet();
        this.tvp = new AnimatorSet();
        this.rq = 100;
        qdl(context);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.mo;
    }

    public void lnr() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.qdl, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.qdl, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.qdl, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), -this.rq));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), this.rq));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.mo.oth.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (oth.this.lnr != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) oth.this.lnr.getLayoutParams();
                    layoutParams.height = num.intValue();
                    oth.this.lnr.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.lnr, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.lnr, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f16430ud, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f16430ud, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f16430ud, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.f16430ud, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.f16430ud, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), -this.rq));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.f16431wd.setDuration(50L);
        this.tvp.setDuration(CircularProgressBar.E);
        this.jpc.setDuration(50L);
        this.f16431wd.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.jpc.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.tvp.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.mo.playSequentially(this.jpc, this.tvp, this.f16431wd);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ud();
    }

    public void setGuideText(String str) {
        TextView textView = this.mml;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.mzz != null) {
            if (TextUtils.isEmpty(str)) {
                this.mzz.setText("");
            } else {
                this.mzz.setText(str);
            }
        }
    }

    protected void qdl(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.mml.qdl();
        }
        if ("5".equals(this.to)) {
            addView(com.bytedance.sdk.component.adexpress.lnr.qdl.mo(context));
            this.rq = (int) (((double) this.rq) * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.lnr.qdl.mzz(context));
        }
        this.qdl = (ImageView) findViewById(2097610734);
        this.f16430ud = (ImageView) findViewById(2097610735);
        this.mml = (TextView) findViewById(2097610730);
        this.lnr = (ImageView) findViewById(2097610733);
        this.mzz = (TextView) findViewById(2097610731);
    }

    public void ud() {
        try {
            AnimatorSet animatorSet = this.mo;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.jpc;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.f16431wd;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.tvp;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public oth(Context context, String str) {
        super(context);
        this.mo = new AnimatorSet();
        this.f16431wd = new AnimatorSet();
        this.jpc = new AnimatorSet();
        this.tvp = new AnimatorSet();
        this.rq = 100;
        setClipChildren(false);
        this.to = str;
        qdl(context);
    }

    public void qdl() {
        lnr();
        this.mo.start();
        this.mo.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.mo.oth.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                oth.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mo.oth.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        oth.this.mo.start();
                    }
                }, 200L);
            }
        });
    }
}

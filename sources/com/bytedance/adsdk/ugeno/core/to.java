package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.core.qdl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class to {
    private AnimatorSet lnr = new AnimatorSet();
    private View mml;
    private int mo;
    private int mzz;
    Paint qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private qdl f16158ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private String f16159wd;

    public to(View view, qdl qdlVar) {
        this.mml = view;
        this.f16158ud = qdlVar;
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setAntiAlias(true);
    }

    public void ud() {
        AnimatorSet animatorSet = this.lnr;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void qdl() {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        List<qdl.C0206qdl> listLnr = this.f16158ud.lnr();
        if (listLnr == null || listLnr.size() <= 0) {
            return;
        }
        for (qdl.C0206qdl c0206qdl : listLnr) {
            if (c0206qdl != null) {
                objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0206qdl.qdl());
                if (TextUtils.equals(c0206qdl.mzz(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0206qdl.mzz(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0206qdl.mzz());
                }
                objectAnimator.setStartDelay(c0206qdl.mml());
                objectAnimator.setTarget(this.mml);
                if (TextUtils.equals(c0206qdl.mzz(), "backgroundColor")) {
                    objectAnimator.setIntValues((int) c0206qdl.mo(), (int) c0206qdl.wd());
                    Log.d("UGenAnimation", "playAnimation: from = " + c0206qdl.mo() + "; to=" + c0206qdl.wd());
                } else {
                    objectAnimator.setFloatValues(c0206qdl.mo(), c0206qdl.wd());
                }
                int iUd = (int) this.f16158ud.ud();
                if (iUd != 0) {
                    objectAnimator.setRepeatCount(iUd);
                } else {
                    objectAnimator.setRepeatCount((int) c0206qdl.ud());
                }
                if (TextUtils.equals(c0206qdl.mzz(), "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String strMo = this.f16158ud.mo();
                if (TextUtils.isEmpty(strMo)) {
                    strMo = c0206qdl.lnr();
                }
                if (TextUtils.equals(strMo, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0206qdl.jpc() != null && c0206qdl.jpc().length > 0) {
                    objectAnimator.setFloatValues(c0206qdl.jpc());
                }
                if (TextUtils.equals(c0206qdl.mzz(), "rotationX")) {
                    this.mml.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.to.1
                        @Override // java.lang.Runnable
                        public void run() {
                            to.this.mml.setPivotX(to.this.mml.getWidth() / 2.0f);
                            to.this.mml.setPivotY(to.this.mml.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0206qdl.mzz(), "ripple")) {
                    this.f16159wd = c0206qdl.to();
                }
                String strTvp = c0206qdl.tvp();
                strTvp.getClass();
                switch (strTvp) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.f16158ud.mml() != 0) {
            this.lnr.setDuration(this.f16158ud.mml());
        }
        this.lnr.setStartDelay(this.f16158ud.mzz());
        if (TextUtils.equals(this.f16158ud.qdl(), "sequentially")) {
            this.lnr.playSequentially(arrayList);
        } else {
            this.lnr.playTogether(arrayList);
        }
        this.lnr.start();
    }

    public void qdl(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.f16159wd)) {
                return;
            }
            this.qdl.setColor(com.bytedance.adsdk.ugeno.wd.qdl.qdl(this.f16159wd));
            this.qdl.setAlpha(90);
            ((ViewGroup) this.mml.getParent()).setClipChildren(true);
            canvas.drawCircle(this.mzz, this.mo, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.qdl);
        } catch (Throwable th2) {
            Log.d("UGenAnimation", "ripple animation error " + th2.getMessage());
        }
    }

    public void qdl(int i10, int i11) {
        this.mzz = i10 / 2;
        this.mo = i11 / 2;
    }
}

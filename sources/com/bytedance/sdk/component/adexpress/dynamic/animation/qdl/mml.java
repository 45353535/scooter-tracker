package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hzv;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mml implements hzv {
    public View lnr;
    private Set<ScheduledFuture<?>> mml = new HashSet();
    public List<ObjectAnimator> qdl = qdl();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.mml.qdl f16298ud;

    public class qdl implements Runnable {
        ObjectAnimator qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        ScheduledFuture<?> f16301ud;

        qdl(ObjectAnimator objectAnimator) {
            this.qdl = objectAnimator;
        }

        public void qdl(ScheduledFuture<?> scheduledFuture) {
            this.f16301ud = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr() != null) {
                com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().lnr().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml.qdl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        qdl.this.qdl.resume();
                    }
                });
                if (this.f16301ud != null) {
                    mml.this.mml.remove(this.f16301ud);
                }
            }
        }
    }

    public mml(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        this.lnr = view;
        this.f16298ud = qdlVar;
    }

    public void lnr() {
        List<ObjectAnimator> list = this.qdl;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.f16298ud.yt() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        qdl qdlVar = mml.this.new qdl(objectAnimator);
                        ScheduledFuture<?> scheduledFutureQdl = com.bytedance.sdk.component.adexpress.mml.mml.qdl(qdlVar, (long) (mml.this.f16298ud.yt() * 1000.0d), TimeUnit.MILLISECONDS);
                        qdlVar.qdl(scheduledFutureQdl);
                        mml.this.mml.add(scheduledFutureQdl);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    abstract List<ObjectAnimator> qdl();

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hzv
    public void ud() {
        List<ObjectAnimator> list = this.qdl;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.mml.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    ObjectAnimator qdl(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f16298ud.rdp() * 1000.0d));
        if (this.f16298ud.bjy() > 0) {
            objectAnimator.setRepeatCount(this.f16298ud.bjy() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!Constants.NORMAL.equals(this.f16298ud.jtx())) {
            if (SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE.equals(this.f16298ud.jtx()) || "alternate-reverse".equals(this.f16298ud.jtx())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.f16298ud.exu())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f16298ud.jtx())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f16298ud.jtx())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    mml.this.lnr.setVisibility(0);
                    if (mml.this.lnr.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo) {
                        ((View) mml.this.lnr.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}

package sg.bigo.ads.common.utils;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import sg.bigo.ads.common.utils.AnimationUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @RequiresApi(api = 19)
    public static class a extends ChangeBounds implements ValueAnimator.AnimatorUpdateListener {
        protected void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
        }

        @Override // android.transition.ChangeBounds, android.transition.Transition
        public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            try {
                a(transitionValues, transitionValues2);
            } catch (Exception unused) {
            }
            Animator animatorCreateAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
            if (animatorCreateAnimator instanceof ValueAnimator) {
                ((ValueAnimator) animatorCreateAnimator).addUpdateListener(this);
            }
            return animatorCreateAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
                a(objectAnimator.getTarget(), objectAnimator.getAnimatedValue());
            }
        }

        protected void a(Object obj, Object obj2) {
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.utils.b$b, reason: collision with other inner class name */
    public static class InterpolatorC1271b implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f102787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f102788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f102789c;

        public InterpolatorC1271b(long j10, long j11, long j12) {
            long j13 = j10 + j11;
            long j14 = j12 + j13;
            this.f102787a = j14;
            this.f102788b = (j11 * 1.0f) / j14;
            this.f102789c = (j13 * 1.0f) / j14;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = this.f102788b;
            if (f10 < f11) {
                return 0.0f;
            }
            float f12 = this.f102789c;
            if (f10 > f12) {
                return 1.0f;
            }
            return (f10 - f11) / (f12 - f11);
        }
    }

    public static class c implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static class d implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public static class e implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @NonNull
    public static Interpolator a(@AnimationUtils.AnimationEffect int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? new LinearInterpolator() : new AccelerateDecelerateInterpolator() : new DecelerateInterpolator(1.5f) : new AccelerateInterpolator(1.5f);
    }

    public static void a(final View view) {
        if (view == null) {
            return;
        }
        final int iA = sg.bigo.ads.common.utils.e.a(view.getContext(), 40);
        view.setVisibility(4);
        view.post(new Runnable() { // from class: sg.bigo.ads.common.utils.b.1
            @Override // java.lang.Runnable
            public final void run() {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, view.getTranslationY() + iA, view.getTranslationY());
                translateAnimation.setDuration(300L);
                translateAnimation.setInterpolator(b.a(2));
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setInterpolator(b.a(2));
                AnimationSet animationSet = new AnimationSet(false);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(translateAnimation);
                animationSet.setAnimationListener(new d() { // from class: sg.bigo.ads.common.utils.b.1.1
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                        view.setVisibility(0);
                    }
                });
                view.startAnimation(animationSet);
            }
        });
    }
}

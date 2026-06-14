package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.compose.material.TextFieldImplKt;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: loaded from: classes9.dex */
class ClearTextEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f27924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f27925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f27926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f27927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EditText f27928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f27929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f27930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AnimatorSet f27931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ValueAnimator f27932m;

    ClearTextEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f27929j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClearTextEndIconDelegate.q(this.f28104b, view);
            }
        };
        this.f27930k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ClearTextEndIconDelegate clearTextEndIconDelegate = this.f28105a;
                clearTextEndIconDelegate.v(clearTextEndIconDelegate.z());
            }
        };
        Context context = endCompoundLayout.getContext();
        int i10 = R.attr.motionDurationShort3;
        this.f27924e = MotionUtils.resolveThemeDuration(context, i10, 100);
        this.f27925f = MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), i10, TextFieldImplKt.AnimationDuration);
        this.f27926g = MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.f27927h = MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    public static /* synthetic */ void q(ClearTextEndIconDelegate clearTextEndIconDelegate, View view) {
        EditText editText = clearTextEndIconDelegate.f27928i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        clearTextEndIconDelegate.m();
    }

    public static /* synthetic */ void s(ClearTextEndIconDelegate clearTextEndIconDelegate, ValueAnimator valueAnimator) {
        clearTextEndIconDelegate.getClass();
        clearTextEndIconDelegate.f27984d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void t(ClearTextEndIconDelegate clearTextEndIconDelegate, ValueAnimator valueAnimator) {
        clearTextEndIconDelegate.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        clearTextEndIconDelegate.f27984d.setScaleX(fFloatValue);
        clearTextEndIconDelegate.f27984d.setScaleY(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(boolean z10) {
        boolean z11 = this.f27982b.I() == z10;
        if (z10 && !this.f27931l.isRunning()) {
            this.f27932m.cancel();
            this.f27931l.start();
            if (z11) {
                this.f27931l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f27931l.cancel();
        this.f27932m.start();
        if (z11) {
            this.f27932m.end();
        }
    }

    private ValueAnimator w(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f27926g);
        valueAnimatorOfFloat.setDuration(this.f27924e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClearTextEndIconDelegate.s(this.f28106b, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator x() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f27927h);
        valueAnimatorOfFloat.setDuration(this.f27925f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClearTextEndIconDelegate.t(this.f28108b, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void y() {
        ValueAnimator valueAnimatorX = x();
        ValueAnimator valueAnimatorW = w(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f27931l = animatorSet;
        animatorSet.playTogether(valueAnimatorX, valueAnimatorW);
        this.f27931l.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ClearTextEndIconDelegate.this.f27982b.f0(true);
            }
        });
        ValueAnimator valueAnimatorW2 = w(1.0f, 0.0f);
        this.f27932m = valueAnimatorW2;
        valueAnimatorW2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ClearTextEndIconDelegate.this.f27982b.f0(false);
            }
        });
    }

    private boolean z() {
        EditText editText = this.f27928i;
        if (editText != null) {
            return (editText.hasFocus() || this.f27984d.hasFocus()) && this.f27928i.getText().length() > 0;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void afterEditTextChanged(Editable editable) {
        if (this.f27982b.y() != null) {
            return;
        }
        v(z());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int b() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int c() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    View.OnFocusChangeListener d() {
        return this.f27930k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    View.OnClickListener e() {
        return this.f27929j;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    View.OnFocusChangeListener f() {
        return this.f27930k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void l(boolean z10) {
        if (this.f27982b.y() == null) {
            return;
        }
        v(z10);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void n() {
        y();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(@Nullable EditText editText) {
        this.f27928i = editText;
        this.f27981a.setEndIconVisible(z());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void p() {
        EditText editText = this.f27928i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28107b.v(true);
                }
            });
        }
    }
}

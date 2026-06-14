package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class IndicatorViewController {
    private ColorStateList A;
    private Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f27988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f27989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f27990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f27991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextInputLayout f27992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f27993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f27995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animator f27996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f27997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f28000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f28001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f28002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f28003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28004t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f28005u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ColorStateList f28006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f28007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f28008x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f28009y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f28010z;

    public IndicatorViewController(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f27991g = context;
        this.f27992h = textInputLayout;
        this.f27997m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        int i10 = R.attr.motionDurationShort4;
        this.f27985a = MotionUtils.resolveThemeDuration(context, i10, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
        this.f27986b = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium4, 167);
        this.f27987c = MotionUtils.resolveThemeDuration(context, i10, 167);
        int i11 = R.attr.motionEasingEmphasizedDecelerateInterpolator;
        this.f27988d = MotionUtils.resolveThemeInterpolator(context, i11, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        this.f27989e = MotionUtils.resolveThemeInterpolator(context, i11, timeInterpolator);
        this.f27990f = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingLinearInterpolator, timeInterpolator);
    }

    private void D(int i10, int i11) {
        TextView textViewM;
        TextView textViewM2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM2 = m(i11)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM = m(i10)) != null) {
            textViewM.setVisibility(4);
            if (i10 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f27998n = i11;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        if (this.f27992h.isLaidOut() && this.f27992h.isEnabled()) {
            return (this.f27999o == this.f27998n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void S(final int i10, final int i11, boolean z10) {
        IndicatorViewController indicatorViewController;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f27996l = animatorSet;
            ArrayList arrayList = new ArrayList();
            indicatorViewController = this;
            indicatorViewController.i(arrayList, this.f28008x, this.f28009y, 2, i10, i11);
            indicatorViewController.i(arrayList, indicatorViewController.f28001q, indicatorViewController.f28002r, 1, i10, i11);
            AnimatorSetCompat.playTogether(animatorSet, arrayList);
            final TextView textViewM = m(i10);
            final TextView textViewM2 = m(i11);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.IndicatorViewController.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IndicatorViewController.this.f27998n = i11;
                    IndicatorViewController.this.f27996l = null;
                    TextView textView = textViewM;
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i10 == 1 && IndicatorViewController.this.f28002r != null) {
                            IndicatorViewController.this.f28002r.setText((CharSequence) null);
                        }
                    }
                    TextView textView2 = textViewM2;
                    if (textView2 != null) {
                        textView2.setTranslationY(0.0f);
                        textViewM2.setAlpha(1.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    TextView textView = textViewM2;
                    if (textView != null) {
                        textView.setVisibility(0);
                        textViewM2.setAlpha(0.0f);
                    }
                }
            });
            animatorSet.start();
        } else {
            indicatorViewController = this;
            D(i10, i11);
        }
        indicatorViewController.f27992h.k0();
        indicatorViewController.f27992h.q0(z10);
        indicatorViewController.f27992h.w0();
    }

    private boolean g() {
        return (this.f27993i == null || this.f27992h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f27987c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f27987c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f27986b : this.f27987c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f27989e : this.f27990f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f27997m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f27985a);
        objectAnimatorOfFloat.setInterpolator(this.f27988d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f28002r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f28009y;
    }

    private int v(boolean z10, int i10, int i11) {
        return z10 ? this.f27991g.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean y(int i10) {
        return (i10 != 1 || this.f28002r == null || TextUtils.isEmpty(this.f28000p)) ? false : true;
    }

    boolean A() {
        return this.f28001q;
    }

    boolean B() {
        return this.f28008x;
    }

    void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f27993i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f27995k) == null) {
            this.f27993i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f27994j - 1;
        this.f27994j = i11;
        O(this.f27993i, i11);
    }

    void E(int i10) {
        this.f28004t = i10;
        TextView textView = this.f28002r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i10);
        }
    }

    void F(CharSequence charSequence) {
        this.f28003s = charSequence;
        TextView textView = this.f28002r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z10) {
        if (this.f28001q == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f27991g);
            this.f28002r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            this.f28002r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f28002r.setTypeface(typeface);
            }
            H(this.f28005u);
            I(this.f28006v);
            F(this.f28003s);
            E(this.f28004t);
            this.f28002r.setVisibility(4);
            e(this.f28002r, 0);
        } else {
            w();
            C(this.f28002r, 0);
            this.f28002r = null;
            this.f27992h.k0();
            this.f27992h.w0();
        }
        this.f28001q = z10;
    }

    void H(int i10) {
        this.f28005u = i10;
        TextView textView = this.f28002r;
        if (textView != null) {
            this.f27992h.W(textView, i10);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f28006v = colorStateList;
        TextView textView = this.f28002r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i10) {
        this.f28010z = i10;
        TextView textView = this.f28009y;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i10);
        }
    }

    void K(boolean z10) {
        if (this.f28008x == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f27991g);
            this.f28009y = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            this.f28009y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f28009y.setTypeface(typeface);
            }
            this.f28009y.setVisibility(4);
            this.f28009y.setAccessibilityLiveRegion(1);
            J(this.f28010z);
            L(this.A);
            e(this.f28009y, 1);
            this.f28009y.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.google.android.material.textfield.IndicatorViewController.2
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    EditText editText = IndicatorViewController.this.f27992h.getEditText();
                    if (editText != null) {
                        accessibilityNodeInfo.setLabeledBy(editText);
                    }
                }
            });
        } else {
            x();
            C(this.f28009y, 1);
            this.f28009y = null;
            this.f27992h.k0();
            this.f27992h.w0();
        }
        this.f28008x = z10;
    }

    void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f28009y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f28002r, typeface);
            M(this.f28009y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.f28000p = charSequence;
        this.f28002r.setText(charSequence);
        int i10 = this.f27998n;
        if (i10 != 1) {
            this.f27999o = 1;
        }
        S(i10, this.f27999o, P(this.f28002r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f28007w = charSequence;
        this.f28009y.setText(charSequence);
        int i10 = this.f27998n;
        if (i10 != 2) {
            this.f27999o = 2;
        }
        S(i10, this.f27999o, P(this.f28009y, charSequence));
    }

    void e(TextView textView, int i10) {
        if (this.f27993i == null && this.f27995k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f27991g);
            this.f27993i = linearLayout;
            linearLayout.setOrientation(0);
            this.f27992h.addView(this.f27993i, -1, -2);
            this.f27995k = new FrameLayout(this.f27991g);
            this.f27993i.addView(this.f27995k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f27992h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f27995k.setVisibility(0);
            this.f27995k.addView(textView);
        } else {
            this.f27993i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f27993i.setVisibility(0);
        this.f27994j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f27992h.getEditText();
            boolean zIsFontScaleAtLeast1_3 = MaterialResources.isFontScaleAtLeast1_3(this.f27991g);
            LinearLayout linearLayout = this.f27993i;
            int i10 = R.dimen.material_helper_text_font_1_3_padding_horizontal;
            linearLayout.setPaddingRelative(v(zIsFontScaleAtLeast1_3, i10, editText.getPaddingStart()), v(zIsFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_top, this.f27991g.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), v(zIsFontScaleAtLeast1_3, i10, editText.getPaddingEnd()), 0);
        }
    }

    void h() {
        Animator animator = this.f27996l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f27999o);
    }

    int n() {
        return this.f28004t;
    }

    CharSequence o() {
        return this.f28003s;
    }

    CharSequence p() {
        return this.f28000p;
    }

    int q() {
        TextView textView = this.f28002r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f28002r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f28007w;
    }

    View t() {
        return this.f28009y;
    }

    int u() {
        TextView textView = this.f28009y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f28000p = null;
        h();
        if (this.f27998n == 1) {
            if (!this.f28008x || TextUtils.isEmpty(this.f28007w)) {
                this.f27999o = 0;
            } else {
                this.f27999o = 2;
            }
        }
        S(this.f27998n, this.f27999o, P(this.f28002r, ""));
    }

    void x() {
        h();
        int i10 = this.f27998n;
        if (i10 == 2) {
            this.f27999o = 0;
        }
        S(i10, this.f27999o, P(this.f28009y, ""));
    }

    boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}

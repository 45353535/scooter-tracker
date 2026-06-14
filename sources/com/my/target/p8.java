package com.my.target;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;
import com.my.target.common.views.StarsRatingView;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.nativeads.views.MediaAdView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class p8 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f60522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fb f60523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f60524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f60525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StarsRatingView f60526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f60527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f60528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f60529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ma f60530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kb f60531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f60532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f60533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f60534m;

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p8.this.f60524c.setVisibility(8);
            p8.this.f60522a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (p8.this.f60525d.isEnabled()) {
                p8.this.f60525d.setVisibility(8);
            }
            if (p8.this.f60528g.isEnabled()) {
                p8.this.f60528g.setVisibility(8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public p8(Context context, kb kbVar) {
        super(context);
        this.f60531j = kbVar;
        Button button = new Button(context);
        this.f60529h = button;
        kb.b(button, "cta_button");
        ma maVar = new ma(context);
        this.f60530i = maVar;
        kb.b(maVar, "icon_image");
        this.f60523b = new fb(context);
        TextView textView = new TextView(context);
        this.f60522a = textView;
        kb.b(textView, "description_text");
        TextView textView2 = new TextView(context);
        this.f60524c = textView2;
        kb.b(textView2, "disclaimer_text");
        this.f60525d = new LinearLayout(context);
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f60526e = starsRatingView;
        kb.b(starsRatingView, "stars_view");
        TextView textView3 = new TextView(context);
        this.f60527f = textView3;
        kb.b(textView3, "votes_text");
        TextView textView4 = new TextView(context);
        this.f60528g = textView4;
        kb.b(textView4, "domain_text");
        this.f60532k = kbVar.b(16);
        this.f60534m = kbVar.b(8);
        this.f60533l = kbVar.b(64);
    }

    public void a() {
        setBackgroundColor(1711276032);
        this.f60522a.setTextColor(-2236963);
        TextView textView = this.f60522a;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.f60528g.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f60528g.setVisibility(8);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(1, -3355444);
        this.f60524c.setPadding(this.f60531j.b(4), this.f60531j.b(4), this.f60531j.b(4), this.f60531j.b(4));
        this.f60524c.setBackgroundDrawable(gradientDrawable);
        this.f60524c.setTextSize(2, 12.0f);
        this.f60524c.setTextColor(-3355444);
        this.f60524c.setVisibility(8);
        this.f60525d.setOrientation(0);
        this.f60525d.setGravity(16);
        this.f60525d.setVisibility(8);
        this.f60527f.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f60527f.setGravity(16);
        this.f60527f.setTextSize(2, 14.0f);
        this.f60529h.setPadding(this.f60531j.b(15), 0, this.f60531j.b(15), 0);
        this.f60529h.setMinimumWidth(this.f60531j.b(100));
        this.f60529h.setTransformationMethod(null);
        this.f60529h.setTextSize(2, 22.0f);
        this.f60529h.setMaxEms(10);
        this.f60529h.setSingleLine();
        this.f60529h.setEllipsize(truncateAt);
        r0 rightBorderedView = this.f60523b.getRightBorderedView();
        rightBorderedView.a(1, -7829368);
        rightBorderedView.setPadding(this.f60531j.b(2), 0, 0, 0);
        rightBorderedView.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        rightBorderedView.a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.f60531j.b(3));
        rightBorderedView.setBackgroundColor(1711276032);
        this.f60526e.setStarSize(this.f60531j.b(12));
        this.f60525d.addView(this.f60526e);
        this.f60525d.addView(this.f60527f);
        this.f60525d.setVisibility(8);
        this.f60528g.setVisibility(8);
        addView(this.f60523b);
        addView(this.f60525d);
        addView(this.f60528g);
        addView(this.f60522a);
        addView(this.f60524c);
        addView(this.f60530i);
        addView(this.f60529h);
    }

    public void b(View... viewArr) {
        if (getVisibility() == 0) {
            d(viewArr);
        }
    }

    public final void c(View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(this.f60529h, (Property<Button, Float>) property, 1.0f));
        Property property2 = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(this.f60529h, (Property<Button, Float>) property2, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60530i, (Property<ma, Float>) property, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60530i, (Property<ma, Float>) property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.f60522a, (Property<TextView, Float>) property3, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60524c, (Property<TextView, Float>) property3, 1.0f));
        if (this.f60525d.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(this.f60525d, (Property<LinearLayout, Float>) property3, 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<p8, Float>) property3, 1.0f));
        Property property4 = View.TRANSLATION_X;
        arrayList.add(ObjectAnimator.ofFloat(this.f60523b, (Property<fb, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60525d, (Property<LinearLayout, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60528g, (Property<TextView, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60522a, (Property<TextView, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60524c, (Property<TextView, Float>) property4, 0.0f));
        Property property5 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<p8, Float>) property5, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60529h, (Property<Button, Float>) property5, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60530i, (Property<ma, Float>) property5, 0.0f));
        for (View view : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property5, 0.0f));
        }
        if (!TextUtils.isEmpty(this.f60524c.getText().toString())) {
            this.f60524c.setVisibility(0);
        }
        this.f60522a.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new b());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void d(View... viewArr) {
        a(0, viewArr);
    }

    public void e(View... viewArr) {
        c(viewArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = this.f60530i.getMeasuredHeight();
        int measuredWidth2 = this.f60530i.getMeasuredWidth();
        int i14 = (measuredHeight - measuredHeight2) / 2;
        ma maVar = this.f60530i;
        int i15 = this.f60532k;
        maVar.layout(i15, i14, i15 + measuredWidth2, measuredHeight2 + i14);
        int measuredWidth3 = this.f60529h.getMeasuredWidth();
        int measuredHeight3 = this.f60529h.getMeasuredHeight();
        int i16 = (measuredHeight - measuredHeight3) / 2;
        int i17 = this.f60532k;
        this.f60529h.layout((measuredWidth - measuredWidth3) - i17, i16, measuredWidth - i17, measuredHeight3 + i16);
        int i18 = this.f60532k;
        int i19 = measuredWidth2 + i18 + i18;
        fb fbVar = this.f60523b;
        fbVar.layout(i19, this.f60534m, fbVar.getMeasuredWidth() + i19, this.f60534m + this.f60523b.getMeasuredHeight());
        this.f60525d.layout(i19, this.f60523b.getBottom(), this.f60525d.getMeasuredWidth() + i19, this.f60523b.getBottom() + this.f60525d.getMeasuredHeight());
        this.f60528g.layout(i19, this.f60523b.getBottom(), this.f60528g.getMeasuredWidth() + i19, this.f60523b.getBottom() + this.f60528g.getMeasuredHeight());
        this.f60522a.layout(i19, this.f60523b.getBottom(), this.f60522a.getMeasuredWidth() + i19, this.f60523b.getBottom() + this.f60522a.getMeasuredHeight());
        this.f60524c.layout(i19, this.f60522a.getBottom(), this.f60524c.getMeasuredWidth() + i19, this.f60522a.getBottom() + this.f60524c.getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11) / 4;
        int i12 = size - (this.f60532k * 2);
        int i13 = size2 - (this.f60534m * 2);
        int iMin = Math.min(i13, this.f60533l);
        this.f60530i.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        this.f60529h.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iMin - (this.f60534m * 2), 1073741824));
        int measuredWidth = ((i12 - this.f60530i.getMeasuredWidth()) - this.f60529h.getMeasuredWidth()) - (this.f60532k * 2);
        this.f60523b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE));
        this.f60525d.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE));
        this.f60528g.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE));
        this.f60522a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i13 - this.f60523b.getMeasuredHeight(), Integer.MIN_VALUE));
        this.f60524c.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE));
        int measuredHeight = this.f60523b.getMeasuredHeight() + Math.max(this.f60522a.getMeasuredHeight(), this.f60525d.getMeasuredHeight()) + (this.f60534m * 2);
        if (this.f60524c.getVisibility() == 0) {
            measuredHeight += this.f60524c.getMeasuredHeight();
        }
        setMeasuredDimension(size, Math.max(this.f60529h.getMeasuredHeight(), Math.max(this.f60530i.getMeasuredHeight(), measuredHeight)) + (this.f60534m * 2));
    }

    public void setBanner(@NonNull o4 o4Var) {
        this.f60523b.getLeftText().setText(o4Var.A());
        this.f60522a.setText(o4Var.k());
        String strL = o4Var.l();
        if (TextUtils.isEmpty(strL)) {
            this.f60524c.setVisibility(8);
        } else {
            this.f60524c.setVisibility(0);
            this.f60524c.setText(strL);
        }
        ImageData imageDataQ = o4Var.q();
        if (imageDataQ != null) {
            this.f60530i.setVisibility(0);
            this.f60530i.setImageData(imageDataQ);
        } else {
            this.f60530i.setVisibility(8);
        }
        this.f60529h.setText(o4Var.i());
        if ("".equals(o4Var.c())) {
            this.f60523b.getRightBorderedView().setVisibility(8);
        } else {
            this.f60523b.getRightBorderedView().setText(o4Var.c());
        }
        kb.b(this.f60529h, -16733198, -16746839, this.f60531j.b(2));
        this.f60529h.setTextColor(-1);
        if ("store".equals(o4Var.t())) {
            if (o4Var.F() == 0 || o4Var.w() <= 0.0f) {
                this.f60525d.setEnabled(false);
                this.f60525d.setVisibility(8);
            } else {
                this.f60525d.setEnabled(true);
                this.f60526e.setRating(o4Var.w());
                this.f60527f.setText(String.valueOf(o4Var.F()));
            }
            this.f60528g.setEnabled(false);
        } else {
            String strN = o4Var.n();
            if (TextUtils.isEmpty(strN)) {
                this.f60528g.setEnabled(false);
                this.f60528g.setVisibility(8);
            } else {
                this.f60528g.setEnabled(true);
                this.f60528g.setText(strN);
            }
            this.f60525d.setEnabled(false);
        }
        if (o4Var.V() == null || !o4Var.V().h0()) {
            this.f60525d.setVisibility(8);
            this.f60528g.setVisibility(8);
        }
    }

    public void a(d1 d1Var, final m8 m8Var) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: k5.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86119b.a(m8Var, view);
            }
        };
        if (d1Var.f59463m) {
            setOnClickListener(onClickListener);
            this.f60529h.setOnClickListener(onClickListener);
            return;
        }
        if (d1Var.f59457g) {
            this.f60529h.setOnClickListener(onClickListener);
        } else {
            this.f60529h.setEnabled(false);
        }
        if (d1Var.f59462l) {
            setOnClickListener(onClickListener);
        } else {
            setOnClickListener(null);
        }
        if (d1Var.f59451a) {
            this.f60523b.getLeftText().setOnClickListener(onClickListener);
        } else {
            this.f60523b.getLeftText().setOnClickListener(null);
        }
        if (d1Var.f59458h) {
            this.f60523b.getRightBorderedView().setOnClickListener(onClickListener);
        } else {
            this.f60523b.getRightBorderedView().setOnClickListener(null);
        }
        if (d1Var.f59453c) {
            this.f60530i.setOnClickListener(onClickListener);
        } else {
            this.f60530i.setOnClickListener(null);
        }
        if (d1Var.f59452b) {
            this.f60522a.setOnClickListener(onClickListener);
        } else {
            this.f60522a.setOnClickListener(null);
        }
        if (d1Var.f59455e) {
            this.f60526e.setOnClickListener(onClickListener);
        } else {
            this.f60526e.setOnClickListener(null);
        }
        if (d1Var.f59456f) {
            this.f60527f.setOnClickListener(onClickListener);
        } else {
            this.f60527f.setOnClickListener(null);
        }
        if (d1Var.f59460j) {
            this.f60528g.setOnClickListener(onClickListener);
        } else {
            this.f60528g.setOnClickListener(null);
        }
    }

    public final /* synthetic */ void a(m8 m8Var, View view) {
        m8Var.a(view, view == this.f60529h ? 2 : 1);
    }

    public void a(View... viewArr) {
        if (getVisibility() == 0) {
            a(300, viewArr);
        }
    }

    public final void a(int i10, View... viewArr) {
        int height = this.f60530i.getHeight();
        int height2 = getHeight();
        int width = this.f60529h.getWidth();
        int height3 = this.f60529h.getHeight();
        int width2 = this.f60530i.getWidth();
        this.f60530i.setPivotX(0.0f);
        this.f60530i.setPivotY(height / 2.0f);
        this.f60529h.setPivotX(width);
        this.f60529h.setPivotY(height3 / 2.0f);
        float f10 = height2 * 0.3f;
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(this.f60529h, (Property<Button, Float>) property, 0.7f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(this.f60529h, (Property<Button, Float>) property2, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60530i, (Property<ma, Float>) property, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60530i, (Property<ma, Float>) property2, 0.7f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.f60522a, (Property<TextView, Float>) property3, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f60524c, (Property<TextView, Float>) property3, 0.0f));
        if (this.f60525d.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(this.f60525d, (Property<LinearLayout, Float>) property3, 1.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<p8, Float>) property3, 0.6f));
        float f11 = -(width2 * 0.3f);
        Property property4 = View.TRANSLATION_X;
        arrayList.add(ObjectAnimator.ofFloat(this.f60523b, (Property<fb, Float>) property4, f11));
        arrayList.add(ObjectAnimator.ofFloat(this.f60525d, (Property<LinearLayout, Float>) property4, f11));
        arrayList.add(ObjectAnimator.ofFloat(this.f60528g, (Property<TextView, Float>) property4, f11));
        arrayList.add(ObjectAnimator.ofFloat(this.f60522a, (Property<TextView, Float>) property4, f11));
        arrayList.add(ObjectAnimator.ofFloat(this.f60524c, (Property<TextView, Float>) property4, f11));
        Property property5 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<p8, Float>) property5, f10));
        float f12 = (-f10) / 2.0f;
        arrayList.add(ObjectAnimator.ofFloat(this.f60529h, (Property<Button, Float>) property5, f12));
        arrayList.add(ObjectAnimator.ofFloat(this.f60530i, (Property<ma, Float>) property5, f12));
        for (View view : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property5, f10));
        }
        if (this.f60525d.isEnabled()) {
            this.f60525d.setVisibility(0);
        }
        if (this.f60528g.isEnabled()) {
            this.f60528g.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new a());
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(i10);
        animatorSet.start();
    }
}

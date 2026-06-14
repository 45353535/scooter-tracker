package com.appodeal.ads.nativead;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.appodeal.ads.R$styleable;
import com.appodeal.ads.ext.DensityExtKt;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j extends NativeAdView {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f13882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f13883t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f13884u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f13885v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13886w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13887x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Lazy f13888y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13882s = i11;
        this.f13886w = SupportMenu.CATEGORY_MASK;
        this.f13887x = ViewCompat.MEASURED_STATE_MASK;
        this.f13888y = lf.i.a(new Function0() { // from class: com.appodeal.ads.nativead.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.a(this.f13881b);
            }
        });
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f11847j, i10, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f13886w = typedArrayObtainStyledAttributes.getColor(R$styleable.f11848k, this.f13886w);
            this.f13887x = typedArrayObtainStyledAttributes.getColor(R$styleable.f11849l, this.f13887x);
            this.f13882s = typedArrayObtainStyledAttributes.getInteger(R$styleable.f11852o, i11);
            this.f13883t = typedArrayObtainStyledAttributes.getFloat(R$styleable.f11853p, this.f13883t);
            this.f13884u = typedArrayObtainStyledAttributes.getFloat(R$styleable.f11851n, this.f13884u);
            this.f13885v = typedArrayObtainStyledAttributes.getFloat(R$styleable.f11850m, this.f13885v);
        }
        b(getRelativeLayout());
        g.a(this);
    }

    public static final RelativeLayout a(j jVar) {
        jVar.getClass();
        RelativeLayout relativeLayout = new RelativeLayout(jVar.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        int i10 = k.f13889a;
        layoutParams.setMargins(i10, i10, i10, i10);
        relativeLayout.setLayoutParams(layoutParams);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setAlpha(100);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ColorDrawable(0));
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        relativeLayout.setBackground(stateListDrawable);
        jVar.addView(relativeLayout);
        return relativeLayout;
    }

    private final RelativeLayout getRelativeLayout() {
        return (RelativeLayout) this.f13888y.getValue();
    }

    public void b(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "relativeLayout");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NativeIconView nativeIconView = new NativeIconView(context, null, 0, 0, 14, null);
        setIconView(nativeIconView);
        TextView textView = new TextView(getContext());
        setTitleView(textView);
        TextView textView2 = new TextView(getContext());
        setDescriptionView(textView2);
        Button button = new Button(getContext());
        setCallToActionView(button);
        TextView textView3 = new TextView(getContext());
        setAdAttributionView(textView3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(DensityExtKt.getToPx(this.f13882s), DensityExtKt.getToPx(this.f13882s));
        int i10 = k.f13889a;
        layoutParams.setMargins(0, 0, i10, 0);
        layoutParams.addRule(20);
        layoutParams.addRule(10);
        nativeIconView.setLayoutParams(layoutParams);
        nativeIconView.setId(View.generateViewId());
        relativeLayout.addView(nativeIconView);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, DensityExtKt.getToPx(40));
        layoutParams2.setMargins(i10, (DensityExtKt.getToPx(this.f13882s) - DensityExtKt.getToPx(40)) / 2, 0, 0);
        button.setPadding(DensityExtKt.getToPx(12), 0, DensityExtKt.getToPx(12), 0);
        layoutParams2.addRule(21);
        button.setLayoutParams(layoutParams2);
        button.setId(View.generateViewId());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(8.0f);
        gradientDrawable.setColor(0);
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, button.getCurrentTextColor());
        button.setBackground(gradientDrawable);
        float f10 = this.f13885v;
        if (f10 == 0.0f) {
            button.setTextAppearance(button.getContext(), R.style.TextAppearance.Material.Small);
        } else {
            button.setTextSize(f10);
        }
        relativeLayout.addView(button);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, i10, i10, 0);
        layoutParams3.addRule(21);
        layoutParams3.addRule(3, button.getId());
        textView3.setLayoutParams(layoutParams3);
        textView3.setTextAppearance(textView3.getContext(), R.style.TextAppearance.Material.Caption);
        setAdAttributionBackground(this.f13886w);
        setAdAttributionTextColor(this.f13887x);
        textView3.setId(View.generateViewId());
        relativeLayout.addView(textView3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(i10, 0, i10, 0);
        layoutParams4.addRule(10);
        layoutParams4.addRule(17, nativeIconView.getId());
        layoutParams4.addRule(16, button.getId());
        textView.setLayoutParams(layoutParams4);
        float f11 = this.f13883t;
        if (f11 == 0.0f) {
            textView.setTextAppearance(textView.getContext(), R.style.TextAppearance.Material.Medium);
        } else {
            textView.setTextSize(f11);
        }
        textView.setMinLines(1);
        textView.setMaxLines(2);
        textView.setId(View.generateViewId());
        relativeLayout.addView(textView);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.setMargins(i10, 0, i10, 0);
        layoutParams5.addRule(3, textView.getId());
        layoutParams5.addRule(17, nativeIconView.getId());
        layoutParams5.addRule(16, button.getId());
        textView2.setLayoutParams(layoutParams5);
        float f12 = this.f13884u;
        if (f12 == 0.0f) {
            textView2.setTextAppearance(textView2.getContext(), R.style.TextAppearance.Material.Small);
        } else {
            textView2.setTextSize(f12);
        }
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMinLines(1);
        textView2.setMaxLines(3);
        textView2.setId(View.generateViewId());
        relativeLayout.addView(textView2);
    }

    public final int getAdAttributionBackgroundColor$core_release() {
        return this.f13886w;
    }

    public final int getAdAttributionTextColor$core_release() {
        return this.f13887x;
    }

    @Override // com.appodeal.ads.nativead.NativeAdView
    public final boolean isViewValid() {
        return true;
    }

    public final void setAdAttributionBackgroundColor$core_release(int i10) {
        this.f13886w = i10;
    }

    public final void setAdAttributionTextColor$core_release(int i10) {
        this.f13887x = i10;
    }
}

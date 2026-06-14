package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.media3.common.C;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class BaitClickView extends ComponentRelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f47368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f47369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f47370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f47371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f47372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f47373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f47376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Animation f47377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animation f47378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animation f47379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animation f47380m;

    class a implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f47381a;

        a(int i10) {
            this.f47381a = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f47369b.setImageResource(this.f47381a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.f47369b.setImageBitmap(bitmap);
        }
    }

    class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f47383a;

        b(int i10) {
            this.f47383a = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f47368a.setImageResource(this.f47383a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.f47368a.setImageBitmap(bitmap);
        }
    }

    class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (BaitClickView.this.f47369b != null) {
                BaitClickView.this.f47369b.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (BaitClickView.this.f47369b != null) {
                BaitClickView.this.f47369b.setVisibility(0);
            }
        }
    }

    class d implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimationSet f47386a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f47369b != null) {
                    BaitClickView.this.f47369b.startAnimation(d.this.f47386a);
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f47368a != null) {
                    BaitClickView.this.f47368a.startAnimation(BaitClickView.this.f47377j);
                }
            }
        }

        d(AnimationSet animationSet) {
            this.f47386a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new b(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 550L);
        }
    }

    class e implements Animation.AnimationListener {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f47368a != null) {
                    BaitClickView.this.f47368a.startAnimation(BaitClickView.this.f47377j);
                }
            }
        }

        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public BaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47371d = "";
        this.f47372e = "";
        this.f47373f = "Click now for details";
        this.f47374g = 1;
        this.f47375h = C.ENCODING_PCM_24BIT_BIG_ENDIAN;
        this.f47376i = 0;
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f47377j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f47377j.setRepeatCount(-1);
        this.f47377j.setRepeatMode(2);
        ImageView imageView = this.f47368a;
        if (imageView != null) {
            imageView.startAnimation(this.f47377j);
        }
    }

    private void e() {
        ImageView imageView = this.f47369b;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f47377j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f47377j.setRepeatCount(1);
        this.f47377j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f47378k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f47378k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f47379l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f47379l.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f47378k);
        animationSet.addAnimation(this.f47379l);
        this.f47378k.setAnimationListener(new c());
        this.f47377j.setAnimationListener(new d(animationSet));
        ImageView imageView2 = this.f47368a;
        if (imageView2 != null) {
            imageView2.startAnimation(this.f47377j);
        }
    }

    private void getDefaultClickText() {
        try {
            this.f47373f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th2) {
            q0.b("BaitClickView", th2.getMessage());
        }
    }

    public void init(int i10) {
        this.f47374g = i10;
        init();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f47377j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f47378k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f47379l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f47380m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("radius");
            if (obj instanceof String) {
                this.f47376i = Integer.parseInt(obj.toString());
            }
            init();
        } catch (Exception e10) {
            q0.b("BaitClickView", e10.getMessage());
        }
    }

    public void startAnimation() {
        int i10 = this.f47374g;
        if (i10 == 2) {
            this.f47369b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f47369b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f47377j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f47377j.setRepeatCount(1);
        this.f47377j.setAnimationListener(new e());
        ImageView imageView = this.f47368a;
        if (imageView != null) {
            imageView.startAnimation(this.f47377j);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f47377j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f47377j.setRepeatCount(-1);
        this.f47377j.setRepeatMode(2);
        ImageView imageView = this.f47368a;
        if (imageView != null) {
            imageView.startAnimation(this.f47377j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f47378k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f47378k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f47379l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f47379l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f47378k);
        animationSet.addAnimation(this.f47379l);
        ImageView imageView2 = this.f47369b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f47380m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f47380m.setRepeatMode(2);
        this.f47380m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f47378k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f47378k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f47379l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f47379l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f47378k);
        animationSet.addAnimation(this.f47379l);
        ImageView imageView = this.f47368a;
        if (imageView != null) {
            imageView.startAnimation(this.f47380m);
        }
        ImageView imageView2 = this.f47369b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    public void init(int i10, int i11) {
        this.f47375h = i10;
        this.f47374g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f47375h = i10;
        this.f47374g = i11;
        this.f47371d = str;
        this.f47372e = str2;
        this.f47373f = str3;
        init();
    }

    public void init() {
        try {
            if (this.f47376i == 0) {
                setBackgroundColor(this.f47375h);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.f47375h);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(v0.a(getContext(), this.f47376i));
                setBackground(gradientDrawable);
            }
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iA = v0.a(getContext(), 55.0f);
            int iA2 = v0.a(getContext(), 33.0f);
            this.f47369b = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, 0, 0);
            this.f47369b.setLayoutParams(layoutParams);
            int iA3 = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f47372e)) {
                this.f47369b.setImageResource(iA3);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f47371d, new a(iA3));
            }
            int iA4 = v0.a(getContext(), 108.0f);
            int iA5 = v0.a(getContext(), 35.0f);
            int iA6 = v0.a(getContext(), 43.0f);
            this.f47368a = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA4, iA4);
            layoutParams2.setMargins(iA5, iA6, 0, 0);
            this.f47368a.setLayoutParams(layoutParams2);
            int iA7 = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f47371d)) {
                this.f47368a.setImageResource(iA7);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f47371d, new b(iA7));
            }
            relativeLayout.addView(this.f47369b);
            relativeLayout.addView(this.f47368a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f47370c = new TextView(getContext());
            this.f47370c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f47370c.setText(this.f47373f);
            this.f47370c.setTextColor(-1);
            this.f47370c.setGravity(14);
            linearLayout.addView(this.f47370c);
            addView(linearLayout);
        } catch (Throwable th2) {
            q0.b("BaitClickView", th2.getMessage());
        }
    }
}

package com.mbridge.msdk.splash.view.nativeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.tools.v0;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;

/* JADX INFO: loaded from: classes10.dex */
public class MBSplashClickView extends RelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f51006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f51007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f51008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f51009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f51010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f51011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f51012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f51013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f51014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f51015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView f51016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f51017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RectF f51018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Paint f51019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Paint f51020r;

    class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f51021a;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$a$a, reason: collision with other inner class name */
        class RunnableC0575a implements Runnable {
            RunnableC0575a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f51017o.startAnimation(a.this.f51021a);
            }
        }

        a(ScaleAnimation scaleAnimation) {
            this.f51021a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f51017o.setVisibility(4);
            MBSplashClickView.this.f51017o.postDelayed(new RunnableC0575a(), 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f51017o.setVisibility(0);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f51024a;

        b(ScaleAnimation scaleAnimation) {
            this.f51024a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashClickView.this.f51017o.startAnimation(this.f51024a);
        }
    }

    class c implements Animation.AnimationListener {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Animation f51027a;

            a(Animation animation) {
                this.f51027a = animation;
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f51016n.startAnimation(this.f51027a);
            }
        }

        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f51016n.setVisibility(4);
            MBSplashClickView.this.f51016n.postDelayed(new a(animation), 2000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f51016n.setVisibility(0);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f51003a = "浏览第三方应用";
        this.f51004b = "View";
        this.f51005c = "打开第三方应用";
        this.f51006d = "Open";
        this.f51007e = "下载第三方应用";
        this.f51008f = "Install";
        this.f51009g = "mbridge_splash_btn_arrow_right";
        this.f51010h = "mbridge_splash_btn_circle";
        this.f51011i = "mbridge_splash_btn_finger";
        this.f51012j = "mbridge_splash_btn_go";
        this.f51013k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f51018p = new RectF();
        this.f51019q = new Paint();
        this.f51020r = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new a(scaleAnimation2));
        this.f51017o.setVisibility(4);
        this.f51016n.startAnimation(scaleAnimation);
        this.f51017o.postDelayed(new b(scaleAnimation2), 500L);
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f51016n.startAnimation(scaleAnimation);
    }

    private void e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new c());
        this.f51016n.startAnimation(translateAnimation);
    }

    private void setBgDrawable(int i10) {
        int color = Color.parseColor("#666666");
        int color2 = Color.parseColor("#8FC31F");
        int color3 = Color.parseColor(POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i10 == 2) {
            gradientDrawable.setColor(color2);
        } else {
            gradientDrawable.setColor(color3);
            gradientDrawable.setStroke(2, color);
        }
        gradientDrawable.setCornerRadius(200);
        setBackground(gradientDrawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f51018p, this.f51020r, 31);
        canvas.drawRoundRect(this.f51018p, 200.0f, 200.0f, this.f51020r);
        canvas.saveLayer(this.f51018p, this.f51019q, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.f51014l = str;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f51015m;
        if (i10 == 2) {
            d();
        } else if (i10 == 1) {
            e();
        } else if (i10 == 3) {
            c();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f51018p.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f51019q.setAntiAlias(true);
        this.f51019q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f51020r.setAntiAlias(true);
        this.f51020r.setColor(-1);
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int identifier;
        if (!a(this.f51014l)) {
            boolean zContains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f51014l)) {
                this.f51014l = zContains ? "浏览第三方应用" : "View";
            }
            this.f51015m = 2;
        }
        setBgDrawable(this.f51015m);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f51014l);
        this.f51016n = new ImageView(getContext());
        int i10 = this.f51015m;
        if (i10 == 2) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 35.0f), v0.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v0.a(getContext(), 10.0f);
        } else if (i10 == 1) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v0.a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i10 == 3) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 25.0f), v0.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams.topMargin = v0.a(getContext(), 18.0f);
            this.f51017o = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v0.a(getContext(), 30.0f), v0.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams4.topMargin = v0.a(getContext(), 5.0f);
            this.f51017o.setLayoutParams(layoutParams4);
            this.f51017o.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            addView(this.f51017o);
        } else {
            layoutParams = null;
            identifier = 0;
        }
        this.f51016n.setLayoutParams(layoutParams);
        this.f51016n.setImageResource(identifier);
        addView(textView);
        addView(this.f51016n);
        invalidate();
    }

    private boolean a(String str) {
        str.getClass();
        switch (str) {
            case "Install":
            case "下载第三方应用":
                this.f51015m = 3;
                return true;
            case "Open":
            case "打开第三方应用":
                this.f51015m = 1;
                return true;
            case "View":
            case "浏览第三方应用":
                this.f51015m = 2;
                return true;
            default:
                return false;
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51003a = "浏览第三方应用";
        this.f51004b = "View";
        this.f51005c = "打开第三方应用";
        this.f51006d = "Open";
        this.f51007e = "下载第三方应用";
        this.f51008f = "Install";
        this.f51009g = "mbridge_splash_btn_arrow_right";
        this.f51010h = "mbridge_splash_btn_circle";
        this.f51011i = "mbridge_splash_btn_finger";
        this.f51012j = "mbridge_splash_btn_go";
        this.f51013k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f51018p = new RectF();
        this.f51019q = new Paint();
        this.f51020r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f51003a = "浏览第三方应用";
        this.f51004b = "View";
        this.f51005c = "打开第三方应用";
        this.f51006d = "Open";
        this.f51007e = "下载第三方应用";
        this.f51008f = "Install";
        this.f51009g = "mbridge_splash_btn_arrow_right";
        this.f51010h = "mbridge_splash_btn_circle";
        this.f51011i = "mbridge_splash_btn_finger";
        this.f51012j = "mbridge_splash_btn_go";
        this.f51013k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f51018p = new RectF();
        this.f51019q = new Paint();
        this.f51020r = new Paint();
        a();
    }

    @RequiresApi(api = 21)
    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f51003a = "浏览第三方应用";
        this.f51004b = "View";
        this.f51005c = "打开第三方应用";
        this.f51006d = "Open";
        this.f51007e = "下载第三方应用";
        this.f51008f = "Install";
        this.f51009g = "mbridge_splash_btn_arrow_right";
        this.f51010h = "mbridge_splash_btn_circle";
        this.f51011i = "mbridge_splash_btn_finger";
        this.f51012j = "mbridge_splash_btn_go";
        this.f51013k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f51018p = new RectF();
        this.f51019q = new Paint();
        this.f51020r = new Paint();
    }
}

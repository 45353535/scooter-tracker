package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBridgeDyImageView f47837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBridgeDyImageView f47838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f47839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f47840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f47841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f47842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Animation f47845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Animation f47846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animation f47847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animation f47848l;

    public MBridgeBaitClickView(@NonNull Context context) {
        super(context);
        this.f47840d = "";
        this.f47841e = "";
        this.f47842f = "Click now for details";
        this.f47843g = 1;
        this.f47844h = C.ENCODING_PCM_24BIT_BIG_ENDIAN;
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f47845i = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f47845i.setRepeatCount(-1);
        this.f47845i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f47837a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f47845i);
        }
    }

    private void e() {
        MBridgeDyImageView mBridgeDyImageView = this.f47838b;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f47845i = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f47845i.setRepeatCount(1);
        this.f47845i.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f47846j = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f47846j.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f47847k = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f47847k.setRepeatCount(0);
        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f47846j);
        animationSet.addAnimation(this.f47847k);
        this.f47846j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (MBridgeBaitClickView.this.f47838b != null) {
                    MBridgeBaitClickView.this.f47838b.setVisibility(4);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (MBridgeBaitClickView.this.f47838b != null) {
                    MBridgeBaitClickView.this.f47838b.setVisibility(0);
                }
            }
        });
        this.f47845i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f47837a != null) {
                            MBridgeBaitClickView.this.f47837a.startAnimation(MBridgeBaitClickView.this.f47845i);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f47838b != null) {
                            MBridgeBaitClickView.this.f47838b.startAnimation(animationSet);
                        }
                    }
                }, 550L);
            }
        });
        MBridgeDyImageView mBridgeDyImageView2 = this.f47837a;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(this.f47845i);
        }
    }

    private void getDefaultClickText() {
        try {
            this.f47842f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th2) {
            q0.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public void init(int i10) {
        this.f47843g = i10;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f47845i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f47846j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f47847k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f47848l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i10 = this.f47843g;
        if (i10 == 2) {
            this.f47838b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f47838b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f47845i = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f47845i.setRepeatCount(1);
        this.f47845i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f47837a != null) {
                            MBridgeBaitClickView.this.f47837a.startAnimation(MBridgeBaitClickView.this.f47845i);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        MBridgeDyImageView mBridgeDyImageView = this.f47837a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f47845i);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f47845i = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f47845i.setRepeatCount(-1);
        this.f47845i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f47837a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f47845i);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f47846j = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f47846j.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f47847k = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f47847k.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f47846j);
        animationSet.addAnimation(this.f47847k);
        MBridgeDyImageView mBridgeDyImageView2 = this.f47838b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f47848l = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f47848l.setRepeatMode(2);
        this.f47848l.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f47846j = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f47846j.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f47847k = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f47847k.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f47846j);
        animationSet.addAnimation(this.f47847k);
        MBridgeDyImageView mBridgeDyImageView = this.f47837a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f47848l);
        }
        MBridgeDyImageView mBridgeDyImageView2 = this.f47838b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    public void init(int i10, int i11) {
        this.f47844h = i10;
        this.f47843g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f47844h = i10;
        this.f47843g = i11;
        this.f47840d = str;
        this.f47841e = str2;
        this.f47842f = str3;
        init();
    }

    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47840d = "";
        this.f47841e = "";
        this.f47842f = "Click now for details";
        this.f47843g = 1;
        this.f47844h = C.ENCODING_PCM_24BIT_BIG_ENDIAN;
    }

    public void init() {
        try {
            setBackgroundColor(this.f47844h);
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iA = v0.a(getContext(), 55.0f);
            int iA2 = v0.a(getContext(), 33.0f);
            this.f47838b = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, 0, 0);
            this.f47838b.setLayoutParams(layoutParams);
            final int iA3 = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f47841e)) {
                this.f47838b.setImageResource(iA3);
            } else {
                b.a(c.n().d()).a(this.f47840d, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f47838b.setImageResource(iA3);
                    }

                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.f47838b.setImageBitmap(bitmap);
                    }
                });
            }
            int iA4 = v0.a(getContext(), 108.0f);
            int iA5 = v0.a(getContext(), 35.0f);
            int iA6 = v0.a(getContext(), 43.0f);
            this.f47837a = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA4, iA4);
            layoutParams2.setMargins(iA5, iA6, 0, 0);
            this.f47837a.setLayoutParams(layoutParams2);
            final int iA7 = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f47840d)) {
                this.f47837a.setImageResource(iA7);
            } else {
                b.a(c.n().d()).a(this.f47840d, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f47837a.setImageResource(iA7);
                    }

                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.f47837a.setImageBitmap(bitmap);
                    }
                });
            }
            relativeLayout.addView(this.f47838b);
            relativeLayout.addView(this.f47837a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f47839c = new TextView(getContext());
            this.f47839c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f47839c.setText(this.f47842f);
            this.f47839c.setTextColor(-1);
            this.f47839c.setGravity(14);
            linearLayout.addView(this.f47839c);
            addView(linearLayout);
        } catch (Throwable th2) {
            q0.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47840d = "";
        this.f47841e = "";
        this.f47842f = "Click now for details";
        this.f47843g = 1;
        this.f47844h = C.ENCODING_PCM_24BIT_BIG_ENDIAN;
    }

    @RequiresApi(api = 21)
    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f47840d = "";
        this.f47841e = "";
        this.f47842f = "Click now for details";
        this.f47843g = 1;
        this.f47844h = C.ENCODING_PCM_24BIT_BIG_ENDIAN;
    }
}

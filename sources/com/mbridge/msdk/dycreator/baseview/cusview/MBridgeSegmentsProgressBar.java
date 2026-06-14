package com.mbridge.msdk.dycreator.baseview.cusview;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeSegmentsProgressBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<ProgressBar> f47887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f47888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f47889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f47890l;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f47879a = "MBridgeSegmentsProgressBar";
        this.f47881c = 1;
        this.f47882d = 20;
        this.f47883e = 10;
        this.f47884f = 1;
        this.f47885g = -1711276033;
        this.f47886h = -1;
        this.f47887i = new ArrayList();
        this.f47890l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.f47890l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        try {
            if (this.f47881c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f47889k)) {
                    this.f47889k = this.f47890l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f47881c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f47889k)) {
                    this.f47889k = this.f47890l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f47887i.clear();
            removeAllViews();
            setBackground(getBackgroundDrawable());
            TextView textView = new TextView(getContext());
            this.f47888j = textView;
            textView.setTextColor(-1);
            this.f47888j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f47888j.setLayoutParams(layoutParams);
            if (this.f47881c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f47888j;
                int i10 = this.f47882d;
                textView2.setPadding(i10 / 2, 15, i10 / 2, 5);
            }
            if (this.f47881c == 2) {
                this.f47888j.setGravity(16);
                TextView textView3 = this.f47888j;
                int i11 = this.f47882d;
                textView3.setPadding(i11 / 2, 0, i11 / 2, 0);
            }
            try {
                int iA = i0.a(getContext(), "mbridge_reward_video_icon", "drawable");
                if (i0.a(iA) && (drawable = getContext().getResources().getDrawable(iA)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f47888j.setCompoundDrawables(drawable, null, null, null);
                    this.f47888j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th3) {
                q0.b("MBridgeSegmentsProgressBar", th3.getMessage());
            }
            this.f47888j.setText(a(this.f47884f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i12 = 0; i12 < this.f47880b; i12++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(getSegmentLayerDrawable());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i13 = this.f47882d;
                layoutParams3.leftMargin = i13 / 2;
                layoutParams3.rightMargin = i13 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f47887i.add(progressBar);
            }
            int i14 = this.f47881c;
            if (i14 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f47888j);
                addView(linearLayout);
            } else {
                if (i14 != 2) {
                    addView(linearLayout);
                    return;
                }
                setPadding(15, 0, 15, 25);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                addView(linearLayout);
                addView(this.f47888j);
            }
        } catch (Throwable th4) {
            q0.b("MBridgeSegmentsProgressBar", th4.getMessage());
        }
    }

    private GradientDrawable getBackgroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    private LayerDrawable getSegmentLayerDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f47883e);
        gradientDrawable.setColor(this.f47885g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f47883e);
        gradientDrawable2.setColor(this.f47886h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public void init(int i10, int i11) {
        this.f47880b = i10;
        this.f47881c = i11;
        a();
    }

    public void setIndicatorText(String str) {
        this.f47889k = str;
    }

    public void setProgress(int i10, int i11) {
        try {
            if (this.f47887i.size() == 0) {
                return;
            }
            if (i11 < this.f47887i.size()) {
                this.f47887i.get(i11).setProgress(i10);
            }
            int i12 = i11 + 1;
            if (i12 > this.f47884f) {
                this.f47884f = i12;
                TextView textView = this.f47888j;
                if (textView != null) {
                    textView.setText(a(i12));
                }
            }
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
    }

    public void init(int i10, int i11, int i12, int i13) {
        this.f47880b = i10;
        this.f47881c = i11;
        this.f47886h = i12;
        this.f47885g = i13;
        a();
    }

    public void init(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f47880b = i10;
        this.f47881c = i11;
        this.f47886h = i12;
        this.f47885g = i13;
        this.f47882d = i14;
        this.f47883e = i15;
        a();
    }

    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47879a = "MBridgeSegmentsProgressBar";
        this.f47881c = 1;
        this.f47882d = 20;
        this.f47883e = 10;
        this.f47884f = 1;
        this.f47885g = -1711276033;
        this.f47886h = -1;
        this.f47887i = new ArrayList();
        this.f47890l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47879a = "MBridgeSegmentsProgressBar";
        this.f47881c = 1;
        this.f47882d = 20;
        this.f47883e = 10;
        this.f47884f = 1;
        this.f47885g = -1711276033;
        this.f47886h = -1;
        this.f47887i = new ArrayList();
        this.f47890l = false;
    }

    @RequiresApi(api = 21)
    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f47879a = "MBridgeSegmentsProgressBar";
        this.f47881c = 1;
        this.f47882d = 20;
        this.f47883e = 10;
        this.f47884f = 1;
        this.f47885g = -1711276033;
        this.f47886h = -1;
        this.f47887i = new ArrayList();
        this.f47890l = false;
    }

    private StringBuilder a(int i10) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(String.format(this.f47889k, Integer.valueOf(i10), Integer.valueOf(this.f47880b)));
            return sb2;
        } catch (Throwable th2) {
            sb2.append(this.f47880b);
            sb2.append("videos, the");
            sb2.append(i10);
            sb2.append(" is playing.");
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
            return sb2;
        }
    }
}

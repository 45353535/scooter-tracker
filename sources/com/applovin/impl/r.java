package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes6.dex */
public class r extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f10265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f10266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f10267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RelativeLayout f10268d;

    public r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f10265a = viewGroup;
        this.f10266b = size;
        this.f10267c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f10268d.removeView(this.f10265a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f10267c, this.f10266b.getWidth()), AppLovinSdkUtils.dpToPx(this.f10267c, this.f10266b.getHeight()));
        layoutParams.addRule(13);
        this.f10265a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f10267c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f10267c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f10267c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.vd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11149b.a(view);
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f10267c);
        this.f10268d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f10268d.setBackgroundColor(Integer.MIN_VALUE);
        this.f10268d.addView(imageButton);
        this.f10268d.addView(this.f10265a);
        this.f10268d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.wd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11237b.b(view);
            }
        });
        setContentView(this.f10268d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }
}

package com.taurusx.tax.o;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66547a = "com.taurusx.action.interstitial.dismiss";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f66548f = 8.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f66549g = 50.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66550n = "com.taurusx.action.interstitial.click";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66551o = "com.taurusx.action.interstitial.fail";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66552s = "com.taurusx.action.interstitial.show";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final IntentFilter f66553t = y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66554c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RelativeLayout f66555w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f66556y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f66557z;

    public enum w {
        WEB_VIEW_DID_APPEAR("javascript:webviewDidAppear();"),
        WEB_VIEW_DID_CLOSE("javascript:webviewDidClose();");


        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f66559z;

        w(String str) {
            this.f66559z = str;
        }

        public String z() {
            return this.f66559z;
        }
    }

    public class z implements View.OnClickListener {
        public z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y.this.finish();
        }
    }

    private void c() {
        this.f66557z = new ImageButton(this);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842919}, s.INTERSTITIAL_CLOSE_BUTTON_NORMAL.decodeImage(this));
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, s.INTERSTITIAL_CLOSE_BUTTON_PRESSED.decodeImage(this));
        this.f66557z.setImageDrawable(stateListDrawable);
        this.f66557z.setBackgroundDrawable(null);
        this.f66557z.setOnClickListener(new z());
        int i10 = this.f66556y;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(11);
        int i11 = this.f66554c;
        layoutParams.setMargins(i11, 0, i11, 0);
        this.f66555w.addView(this.f66557z, layoutParams);
    }

    public static IntentFilter y() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f66551o);
        intentFilter.addAction(f66552s);
        intentFilter.addAction(f66547a);
        intentFilter.addAction(f66550n);
        return intentFilter;
    }

    public void a() {
        this.f66557z.setVisibility(0);
    }

    public abstract View o();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        this.f66556y = o.w(50.0f, this);
        this.f66554c = o.w(8.0f, this);
        this.f66555w = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f66555w.addView(o(), layoutParams);
        setContentView(this.f66555w);
        c();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f66555w.removeAllViews();
        super.onDestroy();
    }

    public void s() {
        this.f66557z.setVisibility(4);
    }

    public void z(String str) {
        sendBroadcast(new Intent(str));
    }
}

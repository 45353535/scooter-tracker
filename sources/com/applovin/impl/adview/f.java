package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.e;
import com.applovin.impl.n1;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes6.dex */
class f extends Dialog implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f8335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f8338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f8339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f8340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f8341g;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f8341g.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f8336b = kVar;
        this.f8337c = kVar.O();
        this.f8335a = activity;
        this.f8338d = bVar;
        this.f8339e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private void g() {
        this.f8335a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8347b.f();
            }
        });
    }

    @Override // com.applovin.impl.n1
    public void dismiss(String str) {
        this.f8335a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8346b.e();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f8338d.a("javascript:al_onBackPressed();");
        dismiss("expanded_ad_dialog_back_button");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f8335a.getWindow().getAttributes().flags, this.f8335a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f8337c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8337c.a("ExpandedAdDialog", "Setting window flags failed.", th2);
            }
        }
    }

    private void a() {
        this.f8338d.a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f8341g.isClickable()) {
            this.f8341g.performClick();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f8338d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f8335a);
        this.f8340f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f8340f.setBackgroundColor(-1157627904);
        this.f8340f.addView(this.f8338d);
        if (!this.f8339e.l1()) {
            a(this.f8339e.f1());
            g();
        }
        setContentView(this.f8340f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f8340f.removeView(this.f8338d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f8341g == null) {
                a();
            }
            this.f8341g.setVisibility(0);
            this.f8341g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f8341g.startAnimation(alphaAnimation);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8337c.a("ExpandedAdDialog", "Unable to fade in close button", th2);
            }
            a();
        }
    }

    public b c() {
        return this.f8338d;
    }

    private void a(e.a aVar) {
        if (this.f8341g != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8337c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e eVarA = e.a(aVar, this.f8335a);
        this.f8341g = eVarA;
        eVarA.setVisibility(8);
        this.f8341g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8334b.a(view);
            }
        });
        this.f8341g.setClickable(false);
        int iA = a(((Integer) this.f8336b.a(x4.f11473z1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.k kVar = this.f8336b;
        x4 x4Var = x4.C1;
        layoutParams.addRule(((Boolean) kVar.a(x4Var)).booleanValue() ? 9 : 11);
        this.f8341g.a(iA);
        int iA2 = a(((Integer) this.f8336b.a(x4.B1)).intValue());
        int iA3 = a(((Integer) this.f8336b.a(x4.A1)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.f8340f.addView(this.f8341g, layoutParams);
        this.f8341g.bringToFront();
        int iA4 = a(((Integer) this.f8336b.a(x4.D1)).intValue());
        View view = new View(this.f8335a);
        view.setBackgroundColor(0);
        int i10 = iA + iA4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f8336b.a(x4Var)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8343b.b(view2);
            }
        });
        this.f8340f.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f8339e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.f8335a, i10);
    }
}

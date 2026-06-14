package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.ironsource.C4240b4;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class za extends w7 implements View.OnClickListener {
    public long E;
    public vd F;
    public boolean H;
    public boolean I;
    public Runnable J;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WebView f65681v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RelativeLayout f65682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageButton f65683x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ag f65685z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f65684y = 0;
    public boolean A = true;
    public boolean B = false;
    public int C = 0;
    public boolean D = false;
    public y0 G = new ya(this);
    public final oa K = new oa(this);
    public final pa L = new pa(this);
    public final qa M = new qa(this);

    @Override // com.startapp.sdk.internal.w7
    public void a(Bundle bundle) {
        zb.a(this.f65429a).a(this.f65431c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        if (bundle != null) {
            if (bundle.containsKey("postrollHtml")) {
                a(bundle.getString("postrollHtml"));
            }
            this.B = bundle.getBoolean("videoCompletedBroadcastSent", false);
            this.C = bundle.getInt("replayNum");
        }
    }

    @Override // com.startapp.sdk.internal.w7
    public final void b(Bundle bundle) {
        String str = this.f65440l;
        if (str != null) {
            bundle.putString("postrollHtml", str);
        }
        bundle.putBoolean("videoCompletedBroadcastSent", this.B);
        bundle.putInt("replayNum", this.C);
    }

    @Override // com.startapp.sdk.internal.w7
    public boolean c() {
        if (this.G.c()) {
            return true;
        }
        if (this.f65448t != null && SystemClock.uptimeMillis() - this.E < this.f65448t.longValue()) {
            return true;
        }
        i();
        ih.f64695a.getClass();
        ag agVar = this.f65685z;
        if (agVar == null) {
            return false;
        }
        agVar.a("AD_CLOSED_TOO_QUICKLY", null);
        return false;
    }

    @Override // com.startapp.sdk.internal.w7
    public final void d() {
        this.G.e();
    }

    @Override // com.startapp.sdk.internal.w7
    public final void e() {
        super.e();
        vd vdVar = this.F;
        if (vdVar != null) {
            AdSession adSession = vdVar.f65397a;
            if (adSession != null) {
                adSession.finish();
            }
            this.F = null;
        }
        WebView webView = this.f65681v;
        long jN = MetaData.E().N();
        WeakHashMap weakHashMap = vi.f65408a;
        new Handler(Looper.getMainLooper()).postDelayed(new ri(webView), jN);
    }

    @Override // com.startapp.sdk.internal.w7
    public void f() {
        this.H = false;
        this.I = true;
        this.G.f();
        ag agVar = this.f65685z;
        if (agVar != null) {
            agVar.a();
        }
        WebView webView = this.f65681v;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // com.startapp.sdk.internal.w7
    public void g() {
        this.H = true;
        this.I = false;
        Ad ad2 = this.f65439k;
        if (ad2 instanceof na ? ((na) ad2).hasAdCacheTtlPassed() : false) {
            b();
        } else {
            ih.f64695a.getClass();
            WebView webView = this.f65681v;
            if (webView == null) {
                RelativeLayout relativeLayout = new RelativeLayout(this.f65429a);
                this.f65682w = relativeLayout;
                relativeLayout.setFitsSystemWindows(true);
                this.f65682w.setContentDescription("StartApp Ad");
                this.f65682w.setId(i0.f64668h);
                this.f65429a.setContentView(this.f65682w);
                try {
                    this.f65681v = ((tk) com.startapp.sdk.components.a.a(this.f65429a).f64175b.a()).c();
                    this.f65684y = SystemClock.uptimeMillis();
                    this.f65681v.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                    this.f65429a.getWindow().getDecorView().findViewById(R.id.content).setBackgroundColor(7829367);
                    this.f65681v.setVerticalScrollBarEnabled(false);
                    this.f65681v.setHorizontalScrollBarEnabled(false);
                    this.f65681v.getSettings().setJavaScriptEnabled(true);
                    q0.a(this.f65681v);
                    if (this.f65449u) {
                        this.f65681v.setLayerType(1, null);
                    }
                    this.f65681v.setOnLongClickListener(new ra());
                    this.f65681v.setLongClickable(false);
                    this.f65681v.addJavascriptInterface(l(), "startappwall");
                    a(this.f65681v);
                    this.f65681v.setWebViewClient(new xa(this));
                    this.f65681v.setWebChromeClient(new sa());
                    vi.a(this.f65681v, this.f65440l);
                    Log.println(2, "StartAppSDK", "Interstitial start rendering the ad content");
                    this.D = "true".equals(vi.a(this.f65440l, "@jsTag@", "@jsTag@"));
                    this.f65682w.addView(this.f65681v, new RelativeLayout.LayoutParams(-1, -1));
                    a(this.f65682w);
                } catch (Throwable th2) {
                    g9.a(th2);
                    b();
                }
            } else {
                webView.onResume();
                ag agVar = this.f65685z;
                if (agVar != null) {
                    agVar.c();
                }
            }
        }
        this.G.g();
    }

    public void i() {
        String str;
        String[] strArr = this.f65432d;
        if (strArr == null || strArr.length <= 0 || (str = strArr[0]) == null) {
            return;
        }
        h0.a(this.f65429a, str, new CloseTrackingParams(this.f65443o, k()));
    }

    public final void j() {
        try {
            RelativeLayout relativeLayout = new RelativeLayout(this.f65429a);
            ImageButton imageButton = new ImageButton(this.f65429a);
            this.f65683x = imageButton;
            imageButton.setBackgroundColor(0);
            this.f65683x.setOnClickListener(this);
            int iA = li.a(this.f65429a, 50);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.addRule(13);
            relativeLayout.addView(this.f65683x, layoutParams);
            this.G.a(relativeLayout);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f65682w.addView(relativeLayout, layoutParams2);
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    public long k() {
        return (SystemClock.uptimeMillis() - this.f65684y) / 1000;
    }

    public fb l() {
        OverlayActivity overlayActivity = this.f65429a;
        oa oaVar = this.K;
        pa paVar = this.L;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.f65443o, k());
        boolean[] zArr = this.f65434f;
        boolean z10 = (zArr == null || zArr.length <= 0) ? true : zArr[0];
        fb fbVar = new fb(overlayActivity, oaVar, closeTrackingParams);
        fbVar.f64495b = z10;
        fbVar.f64497d = oaVar;
        fbVar.f64498e = paVar;
        return fbVar;
    }

    public long m() {
        Long l10 = this.f65444p;
        return l10 != null ? TimeUnit.SECONDS.toMillis(l10.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
    }

    public TrackingParams n() {
        TrackingParams trackingParams = new TrackingParams(this.f65443o);
        y0 y0Var = this.G;
        y0Var.getClass();
        trackingParams.a(y0Var instanceof xc);
        return trackingParams;
    }

    public boolean o() {
        return this.G.b();
    }

    public void onClick(View view) {
        this.G.d();
    }

    public void p() {
        ag agVar = this.f65685z;
        if (agVar != null) {
            agVar.c();
        }
    }

    public void q() {
        a(this.f65683x);
        this.E = SystemClock.uptimeMillis();
    }

    public void r() {
    }

    public final void s() {
        if (o() && !this.B && this.C == 0) {
            this.B = true;
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            intent.putExtra("dParam", a());
            zb.a(this.f65429a).a(intent);
            r();
        }
    }

    public final void t() {
        try {
            if (this.f65683x != null) {
                this.f65683x.setImageDrawable(l2.a(this.f65429a.getResources()));
                this.f65683x.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f65683x.setVisibility(0);
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v2 */
    public final void b(String str, int i10, boolean z10) {
        String str2;
        Boolean bool;
        boolean zP = MetaData.E().p();
        OverlayActivity overlayActivity = this.f65429a;
        String[] strArr = this.f65437i;
        boolean z11 = true;
        String[] strArr2 = i10 < strArr.length ? new String[]{strArr[i10]} : null;
        String[] strArr3 = this.f65438j;
        if (i10 < strArr3.length) {
            str2 = strArr3[i10];
            bool = null;
        } else {
            str2 = null;
            bool = null;
        }
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.f65443o, k());
        long jY = AdsCommonMetaData.k().y();
        long jX = AdsCommonMetaData.k().x();
        boolean[] zArr = this.f65434f;
        if (zArr != null && i10 >= 0 && i10 < zArr.length) {
            z11 = zArr[i10];
        }
        Boolean[] boolArr = this.f65445q;
        h0.a(overlayActivity, str, strArr2, str2, closeTrackingParams, jY, jX, z11, (boolArr == null || i10 < 0 || i10 >= boolArr.length) ? bool : boolArr[i10], z10, zP ? new va(this) : bool);
    }

    public void a(WebView webView) {
        this.A = false;
        webView.setOnTouchListener(new ta(this));
        webView.setBackgroundColor(0);
    }

    public void a(ImageButton imageButton) {
        AdInformationView adInformationView;
        if (MetaData.E().j0()) {
            try {
                vd vdVar = new vd(this.f65681v);
                this.F = vdVar;
                AdSession adSession = vdVar.f65397a;
                if (adSession != null) {
                    if (adSession != null) {
                        adSession.start();
                    }
                    com.startapp.sdk.adsbase.adinformation.a aVar = this.f65430b;
                    if (aVar != null && (adInformationView = aVar.f63976b) != null) {
                        vd vdVar2 = this.F;
                        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                        AdSession adSession2 = vdVar2.f65397a;
                        if (adSession2 != null) {
                            adSession2.addFriendlyObstruction(adInformationView, friendlyObstructionPurpose, null);
                        }
                    }
                    if (imageButton != null) {
                        vd vdVar3 = this.F;
                        FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.CLOSE_AD;
                        AdSession adSession3 = vdVar3.f65397a;
                        if (adSession3 != null) {
                            adSession3.addFriendlyObstruction(imageButton, friendlyObstructionPurpose2, null);
                        }
                    }
                    vd vdVar4 = this.F;
                    WebView webView = this.f65681v;
                    AdSession adSession4 = vdVar4.f65397a;
                    if (adSession4 != null) {
                        adSession4.registerAdView(webView);
                    }
                    vd vdVar5 = this.F;
                    if (vdVar5.f65398b != null && vdVar5.f65401e.compareAndSet(false, true)) {
                        vdVar5.f65398b.loaded();
                    }
                    this.F.a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.startapp.sdk.internal.w7
    public void b() {
        super.b();
        ih.f64695a.getClass();
        ag agVar = this.f65685z;
        if (agVar != null) {
            agVar.a("AD_CLOSED_TOO_QUICKLY", null);
        }
        this.f65429a.runOnUiThread(new wa(this));
    }

    public boolean a(String str, boolean z10) {
        this.G.a();
        ag agVar = this.f65685z;
        if (agVar != null) {
            agVar.a(null, null);
        }
        Context contextA = x0.a(this.f65429a);
        if (contextA == null) {
            contextA = this.f65429a;
        }
        boolean zA = h0.a(contextA);
        if (this.G.a(str)) {
            try {
                String[] strArrSplit = str.split(C4240b4.j.f42670c);
                int i10 = Integer.parseInt(strArrSplit[strArrSplit.length - 1].split(C4240b4.j.f42668b)[1]);
                if (this.f65433e[i10] && !zA) {
                    b(str, i10, z10);
                } else {
                    a(str, i10, z10);
                }
            } catch (Throwable th2) {
                g9.a(th2);
                return false;
            }
        } else if (this.f65433e[0] && !zA) {
            b(str, 0, z10);
        } else {
            a(str, 0, z10);
        }
        return true;
    }

    public final void a(String str, int i10, boolean z10) {
        boolean z11;
        String str2;
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        intent.putExtra("dParam", a());
        zb.a(this.f65429a).a(intent);
        Context contextA = x0.a(this.f65429a);
        if (contextA == null) {
            contextA = this.f65429a;
        }
        boolean zA = h0.a(contextA);
        OverlayActivity overlayActivity = this.f65429a;
        String[] strArr = this.f65437i;
        boolean z12 = true;
        String[] strArr2 = i10 < strArr.length ? new String[]{strArr[i10]} : null;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.f65443o, k());
        boolean[] zArr = this.f65434f;
        if (!((zArr == null || i10 < 0 || i10 >= zArr.length) ? true : zArr[i10]) || zA) {
            z12 = false;
            z11 = z10;
            str2 = str;
        } else {
            str2 = str;
            z11 = z10;
        }
        h0.a(overlayActivity, str2, strArr2, closeTrackingParams, z12, z11);
        if (MetaData.E().p()) {
            b();
        }
    }
}

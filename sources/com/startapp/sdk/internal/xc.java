package com.startapp.sdk.internal;

import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class xc extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f65542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MraidState f65543b = MraidState.LOADING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wc f65544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zc f65545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ad f65546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ed f65547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f65548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f65549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f65550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f65551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Handler f65552k;

    public xc(za zaVar) {
        this.f65542a = zaVar;
    }

    @Override // com.startapp.sdk.internal.y0
    public final void a() {
        MraidState mraidState = MraidState.HIDDEN;
        this.f65543b = mraidState;
        vi.a(this.f65542a.f65681v, true, "mraid.fireStateChangeEvent", mraidState.toString());
    }

    @Override // com.startapp.sdk.internal.y0
    public final boolean b(WebView webView, String str) {
        if (this.f65547f == null) {
            this.f65547f = new ed(h(), null);
        }
        return this.f65547f.shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.startapp.sdk.internal.y0
    public final boolean c() {
        return !(this.f65542a.k() >= ((long) this.f65542a.f65446r));
    }

    @Override // com.startapp.sdk.internal.y0
    public final void d() {
        if (this.f65542a.k() >= this.f65542a.f65446r) {
            h().close();
        }
    }

    @Override // com.startapp.sdk.internal.y0
    public final void e() {
        i();
    }

    @Override // com.startapp.sdk.internal.y0
    public final void f() {
        this.f65551j = false;
        if (this.f65543b == MraidState.DEFAULT) {
            h().fireViewableChangeEvent();
        }
    }

    @Override // com.startapp.sdk.internal.y0
    public final void g() {
        if (this.f65552k == null && this.f65542a.o()) {
            this.f65552k = new Handler(Looper.getMainLooper());
        }
        this.f65551j = true;
        if (this.f65543b == MraidState.DEFAULT) {
            h().fireViewableChangeEvent();
        }
    }

    public final wc h() {
        if (this.f65544c == null) {
            this.f65544c = new wc(this, new uc(this));
        }
        return this.f65544c;
    }

    public final void i() {
        za zaVar = this.f65542a;
        OverlayActivity overlayActivity = zaVar.f65429a;
        WebView webView = zaVar.f65681v;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            overlayActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            float f10 = i11;
            vi.a(webView, true, "mraid.setScreenSize", Integer.valueOf(li.b(overlayActivity, i10)), Integer.valueOf(Math.round(f10 / overlayActivity.getResources().getDisplayMetrics().density)));
            vi.a(webView, true, "mraid.setMaxSize", Integer.valueOf(li.b(overlayActivity, i10)), Integer.valueOf(Math.round(f10 / overlayActivity.getResources().getDisplayMetrics().density)));
            tc.a(overlayActivity, 0, 0, i10, i11, webView);
            tc.b(overlayActivity, 0, 0, i10, i11, webView);
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    @Override // com.startapp.sdk.internal.y0
    public final void a(RelativeLayout relativeLayout) {
        if (this.f65542a.o()) {
            za zaVar = this.f65542a;
            if (zaVar.f65447s) {
                return;
            }
            OverlayActivity overlayActivity = zaVar.f65429a;
            int iA = li.a(overlayActivity, 32);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.addRule(13);
            ImageView imageView = new ImageView(overlayActivity);
            this.f65549h = imageView;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(ViewCompat.MEASURED_STATE_MASK);
            gradientDrawable.setStroke(2, -1);
            int iA2 = li.a(this.f65542a.f65429a, 32);
            gradientDrawable.setSize(iA2, iA2);
            imageView.setImageDrawable(gradientDrawable);
            this.f65549h.setScaleType(ImageView.ScaleType.FIT_CENTER);
            relativeLayout.addView(this.f65549h, layoutParams);
            TextView textView = new TextView(overlayActivity);
            this.f65548g = textView;
            textView.setTextColor(-1);
            this.f65548g.setGravity(17);
            relativeLayout.addView(this.f65548g, layoutParams);
        }
    }

    @Override // com.startapp.sdk.internal.y0
    public final boolean b() {
        return this.f65542a.f65446r > 0;
    }

    @Override // com.startapp.sdk.internal.y0
    public final void a(WebView webView, String str) {
        webView.getContext();
        WeakHashMap weakHashMap = vi.f65408a;
        Log.println(2, "StartAppSDK", "Mraid received callback onPageFinished()");
        if (this.f65547f == null) {
            this.f65547f = new ed(h(), null);
        }
        this.f65547f.onPageFinished(webView, str);
        if (this.f65543b == MraidState.LOADING) {
            vi.a(webView, true, "mraid.setPlacementType", "interstitial");
            OverlayActivity overlayActivity = this.f65542a.f65429a;
            if (this.f65545d == null) {
                this.f65545d = new zc(overlayActivity);
            }
            yc.a(overlayActivity, webView, this.f65545d);
            i();
            this.f65542a.j();
            vi.a(webView, true, "gClientInterface.onPageFinished", Boolean.TRUE);
            if (!this.f65550i) {
                this.f65542a.t();
            }
            MraidState mraidState = MraidState.DEFAULT;
            this.f65543b = mraidState;
            vi.a(webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
            vi.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
            if (this.f65551j) {
                h().fireViewableChangeEvent();
            }
            Handler handler = this.f65552k;
            if (handler != null) {
                handler.post(new vc(this));
            }
            this.f65542a.q();
        }
    }
}

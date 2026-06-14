package com.taurusx.tax.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.taurusx.tax.core.AdSize;
import com.taurusx.tax.g.m;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.a.w;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.o.z;
import com.taurusx.tax.w.s.c;
import com.taurusx.tax.w.s.s;
import com.taurusx.tax.w.y;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TaurusXBannerAds extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f65813a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65814c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f65815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Activity f65816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f65817g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w f65818i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y.z f65819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f65820m;
    public s mTaxCustomEvent;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f65821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f65822o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f65823p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public OnTaurusXBannerListener f65824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f65825t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y f65826v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f65827w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AdSize f65828y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f65829z;

    public TaurusXBannerAds(Activity activity) {
        this(activity, null);
    }

    public void destroy() {
        this.f65821n = true;
        this.f65825t = true;
        w wVar = this.f65818i;
        if (wVar != null) {
            wVar.m();
        }
        m.w(this.f65815e);
    }

    public AdSize getAdSize() {
        return this.f65828y;
    }

    public View getAdView() {
        return this.f65818i.f();
    }

    public float getPrice() {
        y.z zVar = this.f65819l;
        if (zVar != null) {
            return zVar.e();
        }
        return 0.0f;
    }

    public void loadBanner() {
        if (this.f65813a || this.f65821n || this.f65816f.isDestroyed()) {
            return;
        }
        this.f65813a = true;
        String appId = TaurusXAds.getAppId();
        this.f65822o = appId;
        if (!TextUtils.isEmpty(appId) && !TextUtils.isEmpty(this.f65814c)) {
            this.f65820m = System.currentTimeMillis();
            this.mTaxCustomEvent = s.z(this.f65814c);
            w(com.taurusx.tax.a.z.w.z(this.f65827w));
        } else {
            try {
                LogUtil.d("TaurusXBannerAds", "Appid or unitid is empty");
                throw new RuntimeException("Appid or unitid is empty");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void loadBannerFromBid(String str) {
        try {
            String string = new JSONObject(com.taurusx.tax.c.w.z(Base64.decode(str, 2), 1)).getString(z.f67457y);
            y yVarZ = y.z(new JSONObject(string));
            this.f65826v = yVarZ;
            this.mTaxCustomEvent = s.z(yVarZ);
            z(string);
        } catch (Exception unused) {
        }
    }

    public void notifyLoss(float f10, String str, int i10) {
        w wVar = this.f65818i;
        if (wVar != null) {
            wVar.z(this.f65827w, f10, str, i10);
        }
    }

    public void notifyWin(float f10, String str) {
        w wVar = this.f65818i;
        if (wVar != null) {
            wVar.z(this.f65827w, f10, str);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.f65828y = adSize;
    }

    public void setAdUnitId(String str) {
        this.f65814c = str;
    }

    public void setAutoRefresh(boolean z10) {
        this.f65817g = z10;
    }

    public void setListener(OnTaurusXBannerListener onTaurusXBannerListener) {
        this.f65824s = onTaurusXBannerListener;
    }

    public TaurusXBannerAds(Activity activity, AttributeSet attributeSet) {
        this(activity, attributeSet, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        y.z zVar = this.f65819l;
        if (zVar != null) {
            c.z(this.f65827w, zVar.k(), com.taurusx.tax.w.s.w.f67541z, this.f65823p - this.f65820m, this.f65826v);
            m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXBannerAds.2
                @Override // java.lang.Runnable
                public void run() {
                    if (TaurusXBannerAds.this.f65824s != null) {
                        TaurusXBannerAds.this.f65824s.onAdLoaded();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXBannerAds.4
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXBannerAds.this.f65824s != null) {
                    TaurusXBannerAds.this.f65824s.onAdShown();
                }
            }
        });
    }

    private void y() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXBannerAds.5
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXBannerAds.this.f65824s != null) {
                    TaurusXBannerAds.this.f65824s.onAdClosed();
                }
            }
        });
    }

    public TaurusXBannerAds(Activity activity, AttributeSet attributeSet, int i10) {
        super(activity.getApplicationContext(), attributeSet, i10);
        this.f65829z = "TaurusXBannerAds";
        this.f65817g = true;
        this.f65815e = new Runnable() { // from class: com.taurusx.tax.api.TaurusXBannerAds.8
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXBannerAds.this.f65825t) {
                    return;
                }
                LogUtil.d("TaurusXBannerAds", "Auto Request");
                TaurusXBannerAds.this.loadBanner();
            }
        };
        this.f65827w = activity.getApplicationContext();
        this.f65816f = activity;
        this.f65828y = AdSize.Banner_320_50;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXBannerAds.3
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXBannerAds.this.f65824s != null) {
                    TaurusXBannerAds.this.f65824s.onAdClicked();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.api.TaurusXBannerAds.w(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(final TaurusXAdError taurusXAdError) {
        if (taurusXAdError == null || taurusXAdError.getCode() != 3) {
            c.z(this.f65827w, com.taurusx.tax.w.s.w.f67539w, taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis() - this.f65820m), this.f65822o, this.f65814c);
        }
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXBannerAds.1
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXBannerAds.this.f65824s != null) {
                    TaurusXBannerAds.this.f65824s.onAdFailedToLoad(taurusXAdError);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        int height;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f65826v == null && !TextUtils.isEmpty(str)) {
                this.f65826v = y.z(new JSONObject(str));
            }
            y yVar = this.f65826v;
            if (yVar == null) {
                z(TaurusXAdError.parseError("response is null"));
                return;
            }
            y.w.C0823w c0823wW = yVar.c().w();
            s sVar = this.mTaxCustomEvent;
            if (sVar != null) {
                sVar.w(this.f65826v);
                AdSize adSize = this.f65828y;
                AdSize adSize2 = AdSize.Banner_320_50;
                if ((adSize == adSize2 && c0823wW.w() != 5) || (this.f65828y == AdSize.Banner_300_250 && c0823wW.w() != 8)) {
                    this.mTaxCustomEvent.z(this.f65828y == adSize2 ? 5 : 8, c0823wW.w());
                    if (c0823wW.K()) {
                        z(TaurusXAdError.parseError("adtype not matched"));
                        return;
                    }
                }
                this.mTaxCustomEvent.s();
            }
            this.f65819l = this.f65826v.w();
            w wVar = new w(this.f65814c, this.f65826v, new FrameLayout(this.f65816f));
            this.f65818i = wVar;
            wVar.z(this.mTaxCustomEvent);
            int width = getAdSize().getWidth();
            int height2 = getAdSize().getHeight();
            if (c0823wW.w() == 5) {
                AdSize adSize3 = AdSize.Banner_320_50;
                width = adSize3.getWidth();
                height = adSize3.getHeight();
            } else {
                if (c0823wW.w() == 8) {
                    AdSize adSize4 = AdSize.Banner_300_250;
                    width = adSize4.getWidth();
                    height = adSize4.getHeight();
                }
                this.f65818i.z(new y.w().z(width, height2).z());
                this.f65818i.z(new com.taurusx.tax.w.a.c() { // from class: com.taurusx.tax.api.TaurusXBannerAds.7
                    @Override // com.taurusx.tax.w.a.c
                    public void onAdClicked() {
                        TaurusXBannerAds.this.w();
                    }

                    @Override // com.taurusx.tax.w.a.c
                    public void onAdClosed() {
                        TaurusXBannerAds.this.f65825t = true;
                    }

                    @Override // com.taurusx.tax.w.a.c
                    public void onAdImpression() {
                        TaurusXBannerAds.this.o();
                        TaurusXBannerAds.this.f65825t = false;
                        if (TaurusXBannerAds.this.f65817g) {
                            TaurusXBannerAds.this.z();
                        }
                    }

                    @Override // com.taurusx.tax.w.a.c
                    public void onAdLoadFailed(com.taurusx.tax.w.w wVar2) {
                        TaurusXAdError taurusXAdErrorConvertToTaurusXAdError = wVar2.convertToTaurusXAdError();
                        Log.v("TaurusXBannerAds", "taxInnerBannerAd onAdLoadFailed code:" + taurusXAdErrorConvertToTaurusXAdError.getCode() + " msg:" + taurusXAdErrorConvertToTaurusXAdError.getMessage());
                        TaurusXBannerAds.this.z(taurusXAdErrorConvertToTaurusXAdError);
                        s sVar2 = TaurusXBannerAds.this.mTaxCustomEvent;
                        if (sVar2 != null) {
                            sVar2.w(System.currentTimeMillis() - jCurrentTimeMillis, wVar2.getCode(), wVar2.getMessageCompatibility());
                        }
                        if (TaurusXBannerAds.this.f65817g) {
                            TaurusXBannerAds.this.z();
                        }
                    }

                    @Override // com.taurusx.tax.w.a.c
                    public void onAdLoaded() {
                        TaurusXBannerAds.this.c();
                        s sVar2 = TaurusXBannerAds.this.mTaxCustomEvent;
                        if (sVar2 != null) {
                            sVar2.w(System.currentTimeMillis() - jCurrentTimeMillis, com.taurusx.tax.w.w.SUCCESS.getCode(), "");
                        }
                    }
                });
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.f65823p = jCurrentTimeMillis2;
                this.f65818i.z(jCurrentTimeMillis2);
                this.f65818i.y();
            }
            height2 = height;
            this.f65818i.z(new y.w().z(width, height2).z());
            this.f65818i.z(new com.taurusx.tax.w.a.c() { // from class: com.taurusx.tax.api.TaurusXBannerAds.7
                @Override // com.taurusx.tax.w.a.c
                public void onAdClicked() {
                    TaurusXBannerAds.this.w();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdClosed() {
                    TaurusXBannerAds.this.f65825t = true;
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdImpression() {
                    TaurusXBannerAds.this.o();
                    TaurusXBannerAds.this.f65825t = false;
                    if (TaurusXBannerAds.this.f65817g) {
                        TaurusXBannerAds.this.z();
                    }
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoadFailed(com.taurusx.tax.w.w wVar2) {
                    TaurusXAdError taurusXAdErrorConvertToTaurusXAdError = wVar2.convertToTaurusXAdError();
                    Log.v("TaurusXBannerAds", "taxInnerBannerAd onAdLoadFailed code:" + taurusXAdErrorConvertToTaurusXAdError.getCode() + " msg:" + taurusXAdErrorConvertToTaurusXAdError.getMessage());
                    TaurusXBannerAds.this.z(taurusXAdErrorConvertToTaurusXAdError);
                    s sVar2 = TaurusXBannerAds.this.mTaxCustomEvent;
                    if (sVar2 != null) {
                        sVar2.w(System.currentTimeMillis() - jCurrentTimeMillis, wVar2.getCode(), wVar2.getMessageCompatibility());
                    }
                    if (TaurusXBannerAds.this.f65817g) {
                        TaurusXBannerAds.this.z();
                    }
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoaded() {
                    TaurusXBannerAds.this.c();
                    s sVar2 = TaurusXBannerAds.this.mTaxCustomEvent;
                    if (sVar2 != null) {
                        sVar2.w(System.currentTimeMillis() - jCurrentTimeMillis, com.taurusx.tax.w.w.SUCCESS.getCode(), "");
                    }
                }
            });
            long jCurrentTimeMillis22 = System.currentTimeMillis();
            this.f65823p = jCurrentTimeMillis22;
            this.f65818i.z(jCurrentTimeMillis22);
            this.f65818i.y();
        } catch (Exception e10) {
            z(TaurusXAdError.internalError("PARSE_AD_ERROR"));
            if (this.mTaxCustomEvent != null) {
                com.taurusx.tax.w.w message = com.taurusx.tax.w.w.INTERNAL_ERROR.setMessage("Ad imp parse exception: " + e10.getMessage());
                this.mTaxCustomEvent.w(System.currentTimeMillis() - jCurrentTimeMillis, message.getCode(), message.getMessageCompatibility());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        m.w(this.f65815e, 30000L);
    }
}

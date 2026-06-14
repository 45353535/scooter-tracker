package com.taurusx.tax.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.taurusx.tax.c.w;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.m;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.c;
import com.taurusx.tax.w.s.s;
import com.taurusx.tax.w.y;
import com.taurusx.tax.w.z;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TaurusXInterstitialAds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y.z f65876a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65877c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f65878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f65879g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y f65880i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f65881m;
    public s mTaxCustomEvent;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y.w.C0823w f65882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OnTaurusXInterstitialListener f65883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.taurusx.tax.w.a.s f65884p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f65885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f65886t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f65887w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f65888y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f65889z = "TaurusXInterstitialAds";

    public TaurusXInterstitialAds(Context context) {
        this.f65887w = context != null ? context.getApplicationContext() : TaurusXAds.getContext();
    }

    public void destroy() {
    }

    public float getPrice() {
        y.z zVar = this.f65876a;
        if (zVar != null) {
            return zVar.e();
        }
        return 0.0f;
    }

    public boolean isReady() {
        if (!this.f65886t) {
            return false;
        }
        z zVarT = z.t();
        y.w.C0823w c0823w = this.f65882n;
        return !zVarT.z(c0823w != null ? c0823w.z() : 0L, this.f65878f);
    }

    public void loadInterstitial() {
        if (this.f65885s) {
            w(TaurusXAdError.internalError("request is ongoing"));
            return;
        }
        if (isReady()) {
            y();
            return;
        }
        this.f65885s = true;
        String appId = TaurusXAds.getAppId();
        this.f65877c = appId;
        if (!TextUtils.isEmpty(appId) && !TextUtils.isEmpty(this.f65888y)) {
            this.mTaxCustomEvent = s.z(this.f65888y);
            this.f65879g = System.currentTimeMillis();
            o();
        } else {
            try {
                LogUtil.d("TaurusXInterstitialAds", "Appid or unitid is empty");
                throw new RuntimeException("Appid or unitid is empty");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void loadInterstitialFromBid(String str) {
        try {
            String string = new JSONObject(w.z(Base64.decode(str, 2), 1)).getString(com.taurusx.tax.w.o.z.f67457y);
            y yVarZ = y.z(new JSONObject(string));
            this.f65880i = yVarZ;
            this.mTaxCustomEvent = s.z(yVarZ);
            z(string);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void notifyLoss(float f10, String str, int i10) {
        com.taurusx.tax.w.a.s sVar = this.f65884p;
        if (sVar != null) {
            sVar.z(this.f65887w, f10, str, i10);
        }
    }

    public void notifyWin(float f10, String str) {
        com.taurusx.tax.w.a.s sVar = this.f65884p;
        if (sVar != null) {
            sVar.z(this.f65887w, f10, str);
        }
    }

    public void setAdUnitId(String str) {
        this.f65888y = str;
    }

    public void setListener(OnTaurusXInterstitialListener onTaurusXInterstitialListener) {
        this.f65883o = onTaurusXInterstitialListener;
    }

    public void setMute(boolean z10) {
        this.f65881m = z10;
    }

    public void show() {
        int i10;
        com.taurusx.tax.w.w wVar = com.taurusx.tax.w.w.UNKNOWN_ERROR;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f65878f;
        if (isReady()) {
            com.taurusx.tax.w.a.s sVar = this.f65884p;
            if (sVar != null) {
                sVar.w(System.currentTimeMillis());
                this.f65884p.o();
                this.f65886t = false;
                this.f65878f = 0L;
                wVar = com.taurusx.tax.w.w.SUCCESS;
            }
        } else {
            z(TaurusXAdError.showFailedError("SHOW_FAILED_INTERSTITIAL_NOT_READY"));
            wVar = com.taurusx.tax.w.w.AD_SHOW_WITH_NOT_READY;
        }
        y.w.C0823w c0823w = this.f65882n;
        if (c0823w == null || !c0823w.Q()) {
            i10 = 1;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.taurusx.tax.g.n0.z.z(TaurusXAds.getContext()).getPath());
            sb2.append("/");
            sb2.append(j0.z(this.f65882n.v()));
            i10 = new File(sb2.toString()).exists() ? 2 : 3;
        }
        int i11 = i10;
        s sVar2 = this.mTaxCustomEvent;
        if (sVar2 != null) {
            sVar2.z(jCurrentTimeMillis, i11, wVar.getCode(), wVar.getMessageCompatibility());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInterstitialAds.6
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInterstitialAds.this.f65883o != null) {
                    TaurusXInterstitialAds.this.f65883o.onAdShown();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void o() {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.api.TaurusXInterstitialAds.o():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        y.z zVar = this.f65876a;
        if (zVar != null) {
            c.z(this.f65887w, zVar.k(), com.taurusx.tax.w.s.w.f67541z, this.f65878f - this.f65879g, this.f65880i);
            m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInterstitialAds.5
                @Override // java.lang.Runnable
                public void run() {
                    TaurusXInterstitialAds.this.f65886t = true;
                    if (TaurusXInterstitialAds.this.f65883o != null) {
                        TaurusXInterstitialAds.this.f65883o.onAdLoaded();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(final TaurusXAdError taurusXAdError) {
        if (taurusXAdError == null || taurusXAdError.getCode() != 3) {
            c.z(this.f65887w, com.taurusx.tax.w.s.w.f67539w, taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis() - this.f65879g), this.f65877c, this.f65888y);
        }
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInterstitialAds.4
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInterstitialAds.this.f65883o != null) {
                    if (taurusXAdError.getCode() == 9) {
                        TaurusXInterstitialAds.this.f65883o.onAdFailedToLoad(TaurusXAdError.downloadError("download error"));
                    } else {
                        TaurusXInterstitialAds.this.f65883o.onAdFailedToLoad(taurusXAdError);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f65880i == null && !TextUtils.isEmpty(str)) {
                this.f65880i = y.z(new JSONObject(str));
            }
            y yVar = this.f65880i;
            if (yVar == null) {
                w(TaurusXAdError.parseError("response is null"));
                return;
            }
            this.f65882n = yVar.c().w();
            s sVar = this.mTaxCustomEvent;
            if (sVar != null) {
                sVar.w(this.f65880i);
                if (this.f65882n.w() != 3) {
                    this.mTaxCustomEvent.z(3, this.f65882n.w());
                    if (this.f65882n.K()) {
                        w(TaurusXAdError.parseError("adtype not matched"));
                        return;
                    }
                }
                this.mTaxCustomEvent.s();
            }
            this.f65876a = this.f65880i.w();
            com.taurusx.tax.w.a.s sVar2 = new com.taurusx.tax.w.a.s(this.f65888y, this.f65880i);
            this.f65884p = sVar2;
            sVar2.z(this.mTaxCustomEvent);
            this.f65884p.z(new y.w().z(this.f65881m).z());
            this.f65884p.z(new com.taurusx.tax.w.a.c() { // from class: com.taurusx.tax.api.TaurusXInterstitialAds.2
                @Override // com.taurusx.tax.w.a.c
                public void onAdClicked() {
                    TaurusXInterstitialAds.this.z();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdClosed() {
                    TaurusXInterstitialAds.this.w();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdImpression() {
                    TaurusXInterstitialAds.this.c();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoadFailed(com.taurusx.tax.w.w wVar) {
                    TaurusXAdError taurusXAdErrorConvertToTaurusXAdError = wVar.convertToTaurusXAdError();
                    TaurusXInterstitialAds.this.w(taurusXAdErrorConvertToTaurusXAdError);
                    s sVar3 = TaurusXInterstitialAds.this.mTaxCustomEvent;
                    if (sVar3 == null || taurusXAdErrorConvertToTaurusXAdError == null) {
                        return;
                    }
                    sVar3.w(System.currentTimeMillis() - jCurrentTimeMillis, wVar.getCode(), wVar.getMessageCompatibility());
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoaded() {
                    if (TaurusXInterstitialAds.this.f65882n != null && TaurusXInterstitialAds.this.f65882n.Q() && !TextUtils.isEmpty(TaurusXInterstitialAds.this.f65882n.v())) {
                        com.taurusx.tax.g.o0.z.z(2, TaurusXInterstitialAds.this.f65882n.v(), new com.taurusx.tax.g.o0.w() { // from class: com.taurusx.tax.api.TaurusXInterstitialAds.2.1
                            @Override // com.taurusx.tax.g.o0.w
                            public void downloadEnd(com.taurusx.tax.w.w wVar, long j10) {
                                s sVar3 = TaurusXInterstitialAds.this.mTaxCustomEvent;
                                if (sVar3 != null) {
                                    sVar3.w(System.currentTimeMillis() - jCurrentTimeMillis, wVar.getCode(), wVar.getMessageCompatibility());
                                }
                                TaurusXInterstitialAds.this.y();
                            }

                            @Override // com.taurusx.tax.g.o0.w
                            public void downloadStart() {
                            }
                        });
                        return;
                    }
                    TaurusXInterstitialAds.this.y();
                    s sVar3 = TaurusXInterstitialAds.this.mTaxCustomEvent;
                    if (sVar3 != null) {
                        sVar3.w(System.currentTimeMillis() - jCurrentTimeMillis, com.taurusx.tax.w.w.SUCCESS.getCode(), "");
                    }
                }
            });
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f65878f = jCurrentTimeMillis2;
            this.f65884p.z(jCurrentTimeMillis2);
            this.f65884p.y();
        } catch (Exception e10) {
            e10.printStackTrace();
            if (this.mTaxCustomEvent != null) {
                com.taurusx.tax.w.w message = com.taurusx.tax.w.w.INTERNAL_ERROR.setMessage("Ad imp parse exception: " + e10.getMessage());
                this.mTaxCustomEvent.w(System.currentTimeMillis() - jCurrentTimeMillis, message.getCode(), message.getMessageCompatibility());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInterstitialAds.8
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInterstitialAds.this.f65883o != null) {
                    TaurusXInterstitialAds.this.f65883o.onAdClosed();
                }
            }
        });
    }

    private void z(final TaurusXAdError taurusXAdError) {
        c.z(this.f65887w, com.taurusx.tax.w.s.w.f67540y, taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), "", this.f65877c, this.f65888y);
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInterstitialAds.3
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInterstitialAds.this.f65883o != null) {
                    TaurusXInterstitialAds.this.f65883o.onAdShowFailed(taurusXAdError);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInterstitialAds.7
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInterstitialAds.this.f65883o != null) {
                    TaurusXInterstitialAds.this.f65883o.onAdClicked();
                }
            }
        });
    }
}

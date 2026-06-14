package com.taurusx.tax.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.taurusx.tax.c.w;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.m;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.a.n;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.c;
import com.taurusx.tax.w.s.s;
import com.taurusx.tax.w.y;
import com.taurusx.tax.w.z;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TaurusXAppOpenAds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y.z f65787a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65788c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f65789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f65790g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y f65791i;
    public s mTaxCustomEvent;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y.w.C0823w f65793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OnTaurusXAppOpenAdListener f65794o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n f65795p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f65796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f65797t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f65798w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f65799y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f65800z = "TaurusXAppOpenAds";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f65792m = true;

    public TaurusXAppOpenAds(Context context) {
        this.f65798w = context != null ? context.getApplicationContext() : TaurusXAds.getContext();
    }

    public void destroy() {
    }

    public float getPrice() {
        y.z zVar = this.f65787a;
        if (zVar != null) {
            return zVar.e();
        }
        return 0.0f;
    }

    public boolean isReady() {
        if (!this.f65797t) {
            return false;
        }
        z zVarT = z.t();
        y.w.C0823w c0823w = this.f65793n;
        return !zVarT.z(c0823w != null ? c0823w.z() : 0L, this.f65789f);
    }

    public void loadAd() {
        if (this.f65796s) {
            w(TaurusXAdError.internalError("request is ongoing"));
            return;
        }
        if (isReady()) {
            y();
            return;
        }
        this.f65796s = true;
        String appId = TaurusXAds.getAppId();
        this.f65788c = appId;
        if (!TextUtils.isEmpty(appId) && !TextUtils.isEmpty(this.f65799y)) {
            this.f65790g = System.currentTimeMillis();
            this.mTaxCustomEvent = s.z(this.f65799y);
            o();
        } else {
            try {
                LogUtil.d("TaurusXAppOpenAds", "Appid or unitid is empty");
                throw new RuntimeException("Appid or unitid is empty");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void loadAdFromBid(String str) {
        try {
            String string = new JSONObject(w.z(Base64.decode(str, 2), 1)).getString(com.taurusx.tax.w.o.z.f67457y);
            y yVarZ = y.z(new JSONObject(string));
            this.f65791i = yVarZ;
            this.mTaxCustomEvent = s.z(yVarZ);
            z(string);
        } catch (Exception unused) {
        }
    }

    public void notifyLoss(float f10, String str, int i10) {
        n nVar = this.f65795p;
        if (nVar != null) {
            nVar.z(this.f65798w, f10, str, i10);
        }
    }

    public void notifyWin(float f10, String str) {
        n nVar = this.f65795p;
        if (nVar != null) {
            nVar.z(this.f65798w, f10, str);
        }
    }

    public void setAdUnitId(String str) {
        this.f65799y = str;
    }

    public void setListener(OnTaurusXAppOpenAdListener onTaurusXAppOpenAdListener) {
        this.f65794o = onTaurusXAppOpenAdListener;
    }

    public void setMute(boolean z10) {
        this.f65792m = z10;
    }

    public void show() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f65789f;
        int i10 = 1;
        boolean z10 = false;
        if (isReady()) {
            n nVar = this.f65795p;
            if (nVar != null) {
                nVar.w(System.currentTimeMillis());
                this.f65795p.o();
                this.f65797t = false;
                this.f65789f = 0L;
                z10 = true;
            }
        } else {
            z(TaurusXAdError.showFailedError("SHOW_FAILED_SPLASH_NOT_READY"));
        }
        y.w.C0823w c0823w = this.f65793n;
        if (c0823w != null && c0823w.Q()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.taurusx.tax.g.n0.z.z(TaurusXAds.getContext()).getPath());
            sb2.append("/");
            sb2.append(j0.z(this.f65793n.v()));
            i10 = new File(sb2.toString()).exists() ? 2 : 3;
        }
        int i11 = i10;
        com.taurusx.tax.w.w wVar = z10 ? com.taurusx.tax.w.w.SUCCESS : com.taurusx.tax.w.w.AD_SHOW_WITH_NOT_READY;
        s sVar = this.mTaxCustomEvent;
        if (sVar != null) {
            sVar.z(jCurrentTimeMillis, i11, wVar.getCode(), wVar.getMessageCompatibility());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXAppOpenAds.6
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXAppOpenAds.this.f65794o != null) {
                    TaurusXAppOpenAds.this.f65794o.onAdShown();
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
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.api.TaurusXAppOpenAds.o():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        y.z zVar = this.f65787a;
        if (zVar != null) {
            c.z(this.f65798w, zVar.k(), com.taurusx.tax.w.s.w.f67541z, this.f65789f - this.f65790g, this.f65791i);
            m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXAppOpenAds.5
                @Override // java.lang.Runnable
                public void run() {
                    TaurusXAppOpenAds.this.f65797t = true;
                    if (TaurusXAppOpenAds.this.f65794o != null) {
                        TaurusXAppOpenAds.this.f65794o.onAdLoaded();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(final TaurusXAdError taurusXAdError) {
        if (taurusXAdError == null || taurusXAdError.getCode() != 3) {
            c.z(this.f65798w, com.taurusx.tax.w.s.w.f67539w, taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis() - this.f65790g), this.f65788c, this.f65799y);
        }
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXAppOpenAds.4
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXAppOpenAds.this.f65794o != null) {
                    if (taurusXAdError.getCode() == 9) {
                        TaurusXAppOpenAds.this.f65794o.onAdFailedToLoad(TaurusXAdError.downloadError("download error"));
                    } else {
                        TaurusXAppOpenAds.this.f65794o.onAdFailedToLoad(taurusXAdError);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f65791i == null && !TextUtils.isEmpty(str)) {
                this.f65791i = y.z(new JSONObject(str));
            }
            y yVar = this.f65791i;
            if (yVar == null) {
                w(TaurusXAdError.parseError("response is null"));
                return;
            }
            this.f65793n = yVar.c().w();
            s sVar = this.mTaxCustomEvent;
            if (sVar != null) {
                sVar.w(this.f65791i);
                if (this.f65793n.w() != 6) {
                    this.mTaxCustomEvent.z(6, this.f65793n.w());
                    if (this.f65793n.K()) {
                        w(TaurusXAdError.parseError("adtype not matched"));
                        return;
                    }
                }
                this.mTaxCustomEvent.s();
            }
            this.f65787a = this.f65791i.w();
            n nVar = new n(this.f65799y, this.f65791i);
            this.f65795p = nVar;
            nVar.z(this.mTaxCustomEvent);
            this.f65795p.z(new y.w().z(this.f65792m).z());
            this.f65795p.z(new com.taurusx.tax.w.a.c() { // from class: com.taurusx.tax.api.TaurusXAppOpenAds.2
                @Override // com.taurusx.tax.w.a.c
                public void onAdClicked() {
                    TaurusXAppOpenAds.this.z();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdClosed() {
                    TaurusXAppOpenAds.this.w();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdImpression() {
                    TaurusXAppOpenAds.this.c();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoadFailed(com.taurusx.tax.w.w wVar) {
                    TaurusXAdError taurusXAdErrorConvertToTaurusXAdError = wVar.convertToTaurusXAdError();
                    TaurusXAppOpenAds.this.w(taurusXAdErrorConvertToTaurusXAdError);
                    s sVar2 = TaurusXAppOpenAds.this.mTaxCustomEvent;
                    if (sVar2 == null || taurusXAdErrorConvertToTaurusXAdError == null) {
                        return;
                    }
                    sVar2.w(System.currentTimeMillis() - jCurrentTimeMillis, wVar.getCode(), wVar.getMessageCompatibility());
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoaded() {
                    if (TaurusXAppOpenAds.this.f65793n != null && TaurusXAppOpenAds.this.f65793n.Q() && !TextUtils.isEmpty(TaurusXAppOpenAds.this.f65793n.v())) {
                        com.taurusx.tax.g.o0.z.z(2, TaurusXAppOpenAds.this.f65793n.v(), new com.taurusx.tax.g.o0.w() { // from class: com.taurusx.tax.api.TaurusXAppOpenAds.2.1
                            @Override // com.taurusx.tax.g.o0.w
                            public void downloadEnd(com.taurusx.tax.w.w wVar, long j10) {
                                TaurusXAppOpenAds.this.y();
                                s sVar2 = TaurusXAppOpenAds.this.mTaxCustomEvent;
                                if (sVar2 != null) {
                                    sVar2.w(System.currentTimeMillis() - jCurrentTimeMillis, wVar.getCode(), wVar.getMessageCompatibility());
                                }
                            }

                            @Override // com.taurusx.tax.g.o0.w
                            public void downloadStart() {
                            }
                        });
                        return;
                    }
                    TaurusXAppOpenAds.this.y();
                    s sVar2 = TaurusXAppOpenAds.this.mTaxCustomEvent;
                    if (sVar2 != null) {
                        sVar2.w(System.currentTimeMillis() - jCurrentTimeMillis, com.taurusx.tax.w.w.SUCCESS.getCode(), "");
                    }
                }
            });
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f65789f = jCurrentTimeMillis2;
            this.f65795p.z(jCurrentTimeMillis2);
            this.f65795p.y();
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
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXAppOpenAds.8
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXAppOpenAds.this.f65794o != null) {
                    TaurusXAppOpenAds.this.f65794o.onAdClosed();
                }
            }
        });
    }

    private void z(final TaurusXAdError taurusXAdError) {
        c.z(this.f65798w, com.taurusx.tax.w.s.w.f67540y, taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), "", this.f65788c, this.f65799y);
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXAppOpenAds.3
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXAppOpenAds.this.f65794o != null) {
                    TaurusXAppOpenAds.this.f65794o.onAdShowFailed(taurusXAdError);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXAppOpenAds.7
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXAppOpenAds.this.f65794o != null) {
                    TaurusXAppOpenAds.this.f65794o.onAdClicked();
                }
            }
        });
    }
}

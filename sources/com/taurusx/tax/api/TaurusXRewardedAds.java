package com.taurusx.tax.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.taurusx.tax.c.w;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.m;
import com.taurusx.tax.w.a.s;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.c;
import com.taurusx.tax.w.y;
import com.taurusx.tax.w.z;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TaurusXRewardedAds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f65923a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65924c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f65925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f65926g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y.w.C0823w f65927i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s f65928m;
    public com.taurusx.tax.w.s.s mTaxCustomEvent;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f65929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f65930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y.z f65931p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public OnTaurusXRewardListener f65932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f65933t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y f65934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f65935w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f65936y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f65937z = "TaurusXRewardedAds";

    public static class RewardItem {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f65954w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f65955z;

        public RewardItem(String str, int i10) {
            this.f65955z = str;
            this.f65954w = i10;
        }

        public int getAmount() {
            return this.f65954w;
        }

        public String getType() {
            return this.f65955z;
        }

        public String toString() {
            return "RewardItem type is " + this.f65955z + ", amount is " + this.f65954w;
        }
    }

    public TaurusXRewardedAds(Context context) {
        this.f65935w = context != null ? context.getApplicationContext() : TaurusXAds.getContext();
    }

    public String getCustomData() {
        return this.f65930o;
    }

    public float getPrice() {
        y.z zVar = this.f65931p;
        if (zVar != null) {
            return zVar.e();
        }
        return 0.0f;
    }

    public boolean isReady() {
        if (!this.f65929n) {
            return false;
        }
        z zVarT = z.t();
        y.w.C0823w c0823w = this.f65927i;
        return !zVarT.z(c0823w != null ? c0823w.z() : 0L, this.f65926g);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadReward() {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.api.TaurusXRewardedAds.loadReward():void");
    }

    public void loadRewardFromBid(String str) {
        try {
            String string = new JSONObject(w.z(Base64.decode(str, 2), 1)).getString(com.taurusx.tax.w.o.z.f67457y);
            y yVarZ = y.z(new JSONObject(string));
            this.f65934v = yVarZ;
            this.mTaxCustomEvent = com.taurusx.tax.w.s.s.z(yVarZ);
            z(string);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void notifyLoss(float f10, String str, int i10) {
        s sVar = this.f65928m;
        if (sVar != null) {
            sVar.z(this.f65935w, f10, str, i10);
        }
    }

    public void notifyWin(float f10, String str) {
        s sVar = this.f65928m;
        if (sVar != null) {
            sVar.z(this.f65935w, f10, str);
        }
    }

    public void setAdUnitId(String str) {
        this.f65936y = str;
    }

    public void setCustomData(String str) {
        this.f65930o = str;
    }

    public void setListener(OnTaurusXRewardListener onTaurusXRewardListener) {
        this.f65932s = onTaurusXRewardListener;
    }

    public void setMute(boolean z10) {
        this.f65925f = z10;
    }

    public void showReward() {
        com.taurusx.tax.w.w wVar;
        int i10;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f65926g;
        com.taurusx.tax.w.w wVar2 = com.taurusx.tax.w.w.SUCCESS;
        if (isReady()) {
            this.f65928m.w(System.currentTimeMillis());
            this.f65928m.o();
            this.f65929n = false;
            this.f65926g = 0L;
            wVar = com.taurusx.tax.w.w.SUCCESS;
        } else {
            z(TaurusXAdError.showFailedError("SHOW_ERROR_REWARD_NOT_READY"));
            wVar = com.taurusx.tax.w.w.AD_SHOW_WITH_NOT_READY;
        }
        y.w.C0823w c0823w = this.f65927i;
        if (c0823w == null || !c0823w.Q()) {
            i10 = 1;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.taurusx.tax.g.n0.z.z(TaurusXAds.getContext()).getPath());
            sb2.append("/");
            sb2.append(j0.z(this.f65927i.v()));
            i10 = new File(sb2.toString()).exists() ? 2 : 3;
        }
        int i11 = i10;
        com.taurusx.tax.w.s.s sVar = this.mTaxCustomEvent;
        if (sVar != null) {
            sVar.z(jCurrentTimeMillis, i11, wVar.getCode(), wVar.getMessageCompatibility());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.7
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXRewardedAds.this.f65932s != null) {
                    TaurusXRewardedAds.this.f65932s.onVideoCompleted();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.9
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXRewardedAds.this.f65932s != null) {
                    TaurusXRewardedAds.this.f65932s.onRewardFailed();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.6
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXRewardedAds.this.f65932s != null) {
                    TaurusXRewardedAds.this.f65932s.onVideoStart();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.8
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXRewardedAds.this.f65932s == null || TaurusXRewardedAds.this.f65927i == null) {
                    return;
                }
                TaurusXRewardedAds.this.f65932s.onRewarded(new RewardItem(TaurusXRewardedAds.this.f65927i.B(), TaurusXRewardedAds.this.f65927i.A()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.10
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXRewardedAds.this.f65932s != null) {
                    TaurusXRewardedAds.this.f65932s.onAdShown();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        y.z zVar = this.f65931p;
        if (zVar != null) {
            c.z(this.f65935w, zVar.k(), com.taurusx.tax.w.s.w.f67541z, this.f65926g - this.f65933t, this.f65934v);
            m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.4
                @Override // java.lang.Runnable
                public void run() {
                    TaurusXRewardedAds.this.f65929n = true;
                    TaurusXRewardedAds.this.f65923a = false;
                    if (TaurusXRewardedAds.this.f65932s != null) {
                        TaurusXRewardedAds.this.f65932s.onAdLoaded();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(final TaurusXAdError taurusXAdError) {
        if (taurusXAdError == null || taurusXAdError.getCode() != 3) {
            c.z(this.f65935w, com.taurusx.tax.w.s.w.f67539w, taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis() - this.f65933t), this.f65924c, this.f65936y);
        }
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.5
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXRewardedAds.this.f65932s != null) {
                    if (taurusXAdError.getCode() == 9) {
                        TaurusXRewardedAds.this.f65932s.onAdFailedToLoad(TaurusXAdError.downloadError("download error"));
                    } else {
                        TaurusXRewardedAds.this.f65932s.onAdFailedToLoad(taurusXAdError);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f65934v == null && !TextUtils.isEmpty(str)) {
                this.f65934v = y.z(new JSONObject(str));
            }
            y yVar = this.f65934v;
            if (yVar == null) {
                w(TaurusXAdError.parseError("response is null"));
                return;
            }
            this.f65927i = yVar.c().w();
            com.taurusx.tax.w.s.s sVar = this.mTaxCustomEvent;
            if (sVar != null) {
                sVar.w(this.f65934v);
                if (this.f65927i.w() != 2) {
                    this.mTaxCustomEvent.z(2, this.f65927i.w());
                    if (this.f65927i.K()) {
                        w(TaurusXAdError.parseError("adtype not matched"));
                        return;
                    }
                }
                this.mTaxCustomEvent.s();
            }
            this.f65931p = this.f65934v.w();
            s sVar2 = new s(this.f65936y, this.f65934v);
            this.f65928m = sVar2;
            sVar2.z(this.mTaxCustomEvent);
            this.f65928m.z(new y.w().z(1).z(this.f65925f).w(this.f65930o).z());
            this.f65928m.z(new com.taurusx.tax.w.a.c() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.2
                @Override // com.taurusx.tax.w.a.c
                public void onAdClicked() {
                    TaurusXRewardedAds.this.z();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdClosed() {
                    TaurusXRewardedAds.this.w();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdImpression() {
                    TaurusXRewardedAds.this.s();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoadFailed(com.taurusx.tax.w.w wVar) {
                    TaurusXAdError taurusXAdErrorConvertToTaurusXAdError = wVar.convertToTaurusXAdError();
                    com.taurusx.tax.w.s.s sVar3 = TaurusXRewardedAds.this.mTaxCustomEvent;
                    if (sVar3 != null && taurusXAdErrorConvertToTaurusXAdError != null) {
                        sVar3.w(System.currentTimeMillis() - jCurrentTimeMillis, wVar.getCode(), wVar.getMessageCompatibility());
                    }
                    TaurusXRewardedAds.this.w(taurusXAdErrorConvertToTaurusXAdError);
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoaded() {
                    if (TaurusXRewardedAds.this.f65927i != null && TaurusXRewardedAds.this.f65927i.Q() && !TextUtils.isEmpty(TaurusXRewardedAds.this.f65927i.v())) {
                        com.taurusx.tax.g.o0.z.z(2, TaurusXRewardedAds.this.f65927i.v(), new com.taurusx.tax.g.o0.w() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.2.1
                            @Override // com.taurusx.tax.g.o0.w
                            public void downloadEnd(com.taurusx.tax.w.w wVar, long j10) {
                                com.taurusx.tax.w.s.s sVar3 = TaurusXRewardedAds.this.mTaxCustomEvent;
                                if (sVar3 != null) {
                                    sVar3.w(System.currentTimeMillis() - jCurrentTimeMillis, wVar.getCode(), wVar.getMessageCompatibility());
                                }
                                TaurusXRewardedAds.this.y();
                            }

                            @Override // com.taurusx.tax.g.o0.w
                            public void downloadStart() {
                            }
                        });
                        return;
                    }
                    com.taurusx.tax.w.s.s sVar3 = TaurusXRewardedAds.this.mTaxCustomEvent;
                    if (sVar3 != null) {
                        sVar3.w(System.currentTimeMillis() - jCurrentTimeMillis, com.taurusx.tax.w.w.SUCCESS.getCode(), "");
                    }
                    TaurusXRewardedAds.this.y();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdReward() {
                    TaurusXRewardedAds.this.o();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdRewardFailed() {
                    TaurusXRewardedAds.this.c();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdVideoEnd() {
                    TaurusXRewardedAds.this.a();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdVideoStart() {
                    TaurusXRewardedAds.this.n();
                }
            });
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f65926g = jCurrentTimeMillis2;
            this.f65928m.z(jCurrentTimeMillis2);
            this.f65928m.y();
        } catch (Exception e10) {
            w(TaurusXAdError.parseError("parse error"));
            e10.printStackTrace();
            if (this.mTaxCustomEvent != null) {
                com.taurusx.tax.w.w message = com.taurusx.tax.w.w.INTERNAL_ERROR.setMessage("Ad imp parse exception: " + e10.getMessage());
                this.mTaxCustomEvent.w(System.currentTimeMillis() - jCurrentTimeMillis, message.getCode(), message.getMessageCompatibility());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.12
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXRewardedAds.this.f65932s != null) {
                    TaurusXRewardedAds.this.f65932s.onAdClosed();
                }
            }
        });
    }

    private void z(final TaurusXAdError taurusXAdError) {
        c.z(this.f65935w, com.taurusx.tax.w.s.w.f67540y, taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), "", this.f65924c, this.f65936y);
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.3
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXRewardedAds.this.f65932s != null) {
                    TaurusXRewardedAds.this.f65932s.onAdShowFailed(taurusXAdError);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.11
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXRewardedAds.this.f65932s != null) {
                    TaurusXRewardedAds.this.f65932s.onAdClicked();
                }
            }
        });
    }
}

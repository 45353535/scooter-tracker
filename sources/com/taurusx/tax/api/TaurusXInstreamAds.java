package com.taurusx.tax.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import com.taurusx.tax.c.w;
import com.taurusx.tax.g.m;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.a.o;
import com.taurusx.tax.w.a.t;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.c;
import com.taurusx.tax.w.s.s;
import com.taurusx.tax.w.y;
import com.taurusx.tax.w.z;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TaurusXInstreamAds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y.z f65840a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65841c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f65842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f65843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f65844g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f65845i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f65847l;
    public s mTaxCustomEvent;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y.w.C0823w f65849n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OnTaurusXInstreamListener f65850o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o f65851p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f65852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f65853t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y f65854v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f65855w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f65856y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f65857z = "TaurusXInstreamAds";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f65848m = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f65846k = false;

    public enum InstreamTypes {
        PRE_ROLL,
        PAUSE_OVERLAY,
        PLAY_OVERLAY;

        public static InstreamTypes int2Type(int i10) {
            if (i10 == 1) {
                return PRE_ROLL;
            }
            if (i10 == 2) {
                return PAUSE_OVERLAY;
            }
            if (i10 != 3) {
                return null;
            }
            return PLAY_OVERLAY;
        }
    }

    public TaurusXInstreamAds(Context context) {
        this.f65855w = context != null ? context.getApplicationContext() : TaurusXAds.getContext();
    }

    public void destroy() {
        o oVar = this.f65851p;
        if (oVar != null) {
            oVar.t();
        }
    }

    public float getPrice() {
        y.z zVar = this.f65840a;
        if (zVar != null) {
            return zVar.e();
        }
        return 0.0f;
    }

    public boolean isReady() {
        if (!this.f65853t) {
            return false;
        }
        z zVarT = z.t();
        y.w.C0823w c0823w = this.f65849n;
        return !zVarT.z(c0823w != null ? c0823w.z() : 0L, this.f65843f);
    }

    public void loadInstream() {
        if (this.f65852s || this.f65845i) {
            w(TaurusXAdError.internalError("request is ongoing"));
            return;
        }
        if (isReady()) {
            w();
            return;
        }
        this.f65852s = true;
        String appId = TaurusXAds.getAppId();
        this.f65841c = appId;
        if (!TextUtils.isEmpty(appId) && !TextUtils.isEmpty(this.f65856y)) {
            this.f65844g = System.currentTimeMillis();
            this.mTaxCustomEvent = s.z(this.f65856y);
            a();
        } else {
            try {
                LogUtil.d("TaurusXInstreamAds", "Appid or unitid is empty");
                throw new RuntimeException("Appid or unitid is empty");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void loadInstreamFromBid(String str) {
        try {
            String string = new JSONObject(w.z(Base64.decode(str, 2), 1)).getString(com.taurusx.tax.w.o.z.f67457y);
            y yVarZ = y.z(new JSONObject(string));
            this.f65854v = yVarZ;
            this.mTaxCustomEvent = s.z(yVarZ);
            z(string);
        } catch (Exception unused) {
        }
    }

    public void notifyLoss(float f10, String str, int i10) {
        o oVar = this.f65851p;
        if (oVar != null) {
            oVar.z(this.f65855w, f10, str, i10);
        }
    }

    public void notifyWin(float f10, String str) {
        o oVar = this.f65851p;
        if (oVar != null) {
            oVar.z(this.f65855w, f10, str);
        }
    }

    public void pause() {
        o oVar;
        if (!this.f65842e || (oVar = this.f65851p) == null || this.f65847l) {
            return;
        }
        oVar.f();
        this.f65847l = true;
    }

    public void resume() {
        o oVar;
        if (this.f65842e && (oVar = this.f65851p) != null && this.f65847l) {
            oVar.e();
            this.f65847l = false;
        }
    }

    public void setAdUnitId(String str) {
        this.f65856y = str;
    }

    public void setListener(OnTaurusXInstreamListener onTaurusXInstreamListener) {
        this.f65850o = onTaurusXInstreamListener;
    }

    public void setMute(Boolean bool) {
        this.f65848m = bool;
    }

    public void show(ViewGroup viewGroup) {
        if (viewGroup == null) {
            z(TaurusXAdError.showFailedError("SHOW_FAILED_CONTAINER_IS_NULL"));
            return;
        }
        if (!isReady()) {
            z(TaurusXAdError.showFailedError("SHOW_FAILED_INSTREAM_NOT_READY"));
            return;
        }
        o oVar = this.f65851p;
        if (oVar != null) {
            this.f65846k = true;
            oVar.w(viewGroup);
        }
    }

    public void start() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f65843f;
        com.taurusx.tax.w.w wVar = com.taurusx.tax.w.w.UNKNOWN_ERROR;
        if (!this.f65846k) {
            wVar = com.taurusx.tax.w.w.AD_START_WITH_NOT_SHOW;
        } else if (isReady()) {
            o oVar = this.f65851p;
            if (oVar != null) {
                if (this.f65842e) {
                    wVar = com.taurusx.tax.w.w.AD_START_WITH_ALREADY_START;
                } else {
                    oVar.u();
                    this.f65842e = true;
                    this.f65853t = false;
                    this.f65843f = 0L;
                    wVar = com.taurusx.tax.w.w.SUCCESS;
                }
            }
        } else {
            wVar = com.taurusx.tax.w.w.AD_SHOW_WITH_NOT_READY;
            z(TaurusXAdError.showFailedError("SHOW_FAILED_INSTREAM_NOT_READY"));
        }
        s sVar = this.mTaxCustomEvent;
        if (sVar != null) {
            sVar.z(jCurrentTimeMillis, 1, wVar.getCode(), wVar.getMessageCompatibility());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.api.TaurusXInstreamAds.a():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInstreamAds.9
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInstreamAds.this.f65850o != null) {
                    TaurusXInstreamAds.this.f65850o.onPlayStart();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInstreamAds.7
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInstreamAds.this.f65850o != null) {
                    TaurusXInstreamAds.this.f65850o.onAdShown();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInstreamAds.11
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInstreamAds.this.f65850o != null) {
                    TaurusXInstreamAds.this.f65850o.onSkip();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInstreamAds.10
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInstreamAds.this.f65850o != null) {
                    TaurusXInstreamAds.this.f65850o.onPlayEnd();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(final TaurusXAdError taurusXAdError) {
        if (taurusXAdError == null || taurusXAdError.getCode() != 3) {
            c.z(this.f65855w, com.taurusx.tax.w.s.w.f67539w, taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis() - this.f65844g), this.f65841c, this.f65856y);
        }
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInstreamAds.5
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInstreamAds.this.f65850o != null) {
                    if (taurusXAdError.getCode() == 9) {
                        TaurusXInstreamAds.this.f65850o.onAdFailedToLoad(TaurusXAdError.downloadError("download error"));
                    } else {
                        TaurusXInstreamAds.this.f65850o.onAdFailedToLoad(taurusXAdError);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        y yVar;
        InstreamTypes instreamTypesInt2Type;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f65854v == null && !TextUtils.isEmpty(str)) {
                this.f65854v = y.z(new JSONObject(str));
            }
            y yVar2 = this.f65854v;
            if (yVar2 == null) {
                w(TaurusXAdError.parseError("response is null"));
                return;
            }
            this.f65849n = yVar2.c().w();
            s sVar = this.mTaxCustomEvent;
            if (sVar != null) {
                sVar.w(this.f65854v);
                if (this.f65849n.w() != 7) {
                    this.mTaxCustomEvent.z(7, this.f65849n.w());
                    if (this.f65849n.K()) {
                        w(TaurusXAdError.parseError("adtype not matched"));
                        return;
                    }
                }
                this.mTaxCustomEvent.s();
            }
            this.f65840a = this.f65854v.w();
            o oVar = new o(this.f65856y, this.f65854v);
            this.f65851p = oVar;
            oVar.z(this.mTaxCustomEvent);
            if (this.f65848m == null && (yVar = this.f65854v) != null && yVar.c() != null && this.f65854v.c().w() != null && (instreamTypesInt2Type = InstreamTypes.int2Type(this.f65854v.c().w().j())) != null) {
                this.f65848m = Boolean.valueOf(instreamTypesInt2Type != InstreamTypes.PRE_ROLL);
            }
            if (this.f65848m == null) {
                this.f65848m = Boolean.FALSE;
            }
            this.f65851p.z(new y.w().z(this.f65848m.booleanValue()).z());
            this.f65851p.z(new t() { // from class: com.taurusx.tax.api.TaurusXInstreamAds.2
                @Override // com.taurusx.tax.w.a.t
                public void onPlayEnd() {
                    TaurusXInstreamAds.this.y();
                }

                @Override // com.taurusx.tax.w.a.t
                public void onPlayFailed() {
                    TaurusXInstreamAds.this.z(TaurusXAdError.showFailedError("SHOW_FAILED_INSTREAM"));
                }

                @Override // com.taurusx.tax.w.a.t
                public void onPlayProgress(int i10) {
                }

                @Override // com.taurusx.tax.w.a.t
                public void onPlayStart() {
                    long jCurrentTimeMillis2;
                    long jCurrentTimeMillis3;
                    TaurusXInstreamAds.this.c();
                    TaurusXInstreamAds taurusXInstreamAds = TaurusXInstreamAds.this;
                    if (taurusXInstreamAds.mTaxCustomEvent != null) {
                        if (taurusXInstreamAds.f65851p != null) {
                            jCurrentTimeMillis3 = System.currentTimeMillis() - TaurusXInstreamAds.this.f65851p.z();
                            jCurrentTimeMillis2 = System.currentTimeMillis() - TaurusXInstreamAds.this.f65851p.w();
                        } else {
                            jCurrentTimeMillis2 = 0;
                            jCurrentTimeMillis3 = 0;
                        }
                        TaurusXInstreamAds.this.mTaxCustomEvent.z(jCurrentTimeMillis2, jCurrentTimeMillis3, false, com.taurusx.tax.w.w.SUCCESS.getCode(), "");
                    }
                }

                @Override // com.taurusx.tax.w.a.t
                public void onProgress(int i10, int i11) {
                    TaurusXInstreamAds.this.z(i10, i11);
                }

                @Override // com.taurusx.tax.w.a.t
                public void onSkip() {
                    TaurusXInstreamAds.this.s();
                }
            });
            this.f65851p.z(new com.taurusx.tax.w.a.c() { // from class: com.taurusx.tax.api.TaurusXInstreamAds.3
                @Override // com.taurusx.tax.w.a.c
                public void onAdClicked() {
                    TaurusXInstreamAds.this.z();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdClosed() {
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdImpression() {
                    TaurusXInstreamAds.this.o();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoadFailed(com.taurusx.tax.w.w wVar) {
                    TaurusXInstreamAds.this.f65845i = false;
                    TaurusXAdError taurusXAdErrorConvertToTaurusXAdError = wVar.convertToTaurusXAdError();
                    s sVar2 = TaurusXInstreamAds.this.mTaxCustomEvent;
                    if (sVar2 != null && taurusXAdErrorConvertToTaurusXAdError != null) {
                        sVar2.w(System.currentTimeMillis() - jCurrentTimeMillis, wVar.getCode(), wVar.getMessageCompatibility());
                    }
                    TaurusXInstreamAds.this.w(taurusXAdErrorConvertToTaurusXAdError);
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoaded() {
                    TaurusXInstreamAds.this.f65845i = false;
                    s sVar2 = TaurusXInstreamAds.this.mTaxCustomEvent;
                    if (sVar2 != null) {
                        sVar2.w(System.currentTimeMillis() - jCurrentTimeMillis, com.taurusx.tax.w.w.SUCCESS.getCode(), "");
                    }
                    TaurusXInstreamAds.this.w();
                }
            });
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f65843f = jCurrentTimeMillis2;
            this.f65851p.z(jCurrentTimeMillis2);
            this.f65845i = true;
            this.f65851p.y();
        } catch (Exception e10) {
            this.f65845i = false;
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
        y.z zVar = this.f65840a;
        if (zVar != null) {
            c.z(this.f65855w, zVar.k(), com.taurusx.tax.w.s.w.f67541z, this.f65843f - this.f65844g, this.f65854v);
            m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInstreamAds.6
                @Override // java.lang.Runnable
                public void run() {
                    TaurusXInstreamAds.this.f65853t = true;
                    if (TaurusXInstreamAds.this.f65850o != null) {
                        TaurusXInstreamAds.this.f65850o.onAdLoaded();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(final TaurusXAdError taurusXAdError) {
        c.z(this.f65855w, com.taurusx.tax.w.s.w.f67540y, taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), "", this.f65841c, this.f65856y);
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInstreamAds.4
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInstreamAds.this.f65850o != null) {
                    TaurusXInstreamAds.this.f65850o.onAdShowFailed(taurusXAdError);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInstreamAds.8
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInstreamAds.this.f65850o != null) {
                    TaurusXInstreamAds.this.f65850o.onAdClicked();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(final int i10, final int i11) {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXInstreamAds.12
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXInstreamAds.this.f65850o != null) {
                    TaurusXInstreamAds.this.f65850o.onProgress(i10, i11);
                }
            }
        });
    }
}

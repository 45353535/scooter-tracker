package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class MBBidInterstitialVideoHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f49252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f49255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f49256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f49257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f49258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f49259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f49260i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f49261j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f49262k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f49263l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f49264m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f49265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f49266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f49267p;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.n().d() == null && context != null) {
            c.n().b(context);
        }
        a(str, str2);
    }

    private void a(String str, String str2) {
        String strE = v0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            v0.c(str2, strE);
        }
        this.f49253b = str2;
        this.f49254c = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f49252a == null) {
                a aVar = new a();
                this.f49252a = aVar;
                aVar.d(true);
                this.f49252a.e(true);
                this.f49252a.c(str, str2);
            }
        } catch (Throwable th2) {
            q0.b("MBBidRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f49252a;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f49252a;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f49252a;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        a();
        a aVar = this.f49252a;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f49252a != null) {
            this.f49252a.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f49253b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.f49252a != null) {
            this.f49252a.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f49253b, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f49260i = i10;
        a aVar = this.f49252a;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f49255d = str;
        this.f49256e = str2;
        this.f49257f = str3;
        this.f49258g = str4;
        this.f49262k = true;
        this.f49263l = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f49253b, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f49265n = i10;
        this.f49266o = i11;
        this.f49267p = com.mbridge.msdk.foundation.same.a.K;
        this.f49264m = true;
        b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f49259h = interstitialVideoListener;
        this.f49261j = true;
        a aVar = this.f49252a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f49252a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f49253b, true));
        this.f49261j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f49259h = interstitialVideoListener;
        this.f49261j = true;
        a aVar = this.f49252a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f49252a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f49253b, true));
        this.f49261j = false;
    }

    public void showFromBid() {
        a();
        if (this.f49252a != null) {
            this.f49252a.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f49253b, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f49265n = i10;
        this.f49266o = (int) (d10 * 100.0d);
        this.f49267p = com.mbridge.msdk.foundation.same.a.J;
        this.f49264m = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f49252a == null) {
            b(this.f49254c, this.f49253b);
        }
        if (this.f49261j) {
            a aVar2 = this.f49252a;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f49259h, this.f49253b, true));
            }
            this.f49261j = false;
        }
        if (this.f49262k) {
            a aVar3 = this.f49252a;
            if (aVar3 != null) {
                aVar3.a(this.f49255d, this.f49256e, this.f49257f, this.f49258g);
            }
            this.f49262k = false;
        }
        if (!this.f49264m || (aVar = this.f49252a) == null) {
            return;
        }
        aVar.a(this.f49265n, this.f49267p, this.f49266o);
        this.f49264m = false;
    }

    private void b() {
        a aVar = this.f49252a;
        if (aVar != null) {
            aVar.a(this.f49265n, this.f49267p, this.f49266o);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}

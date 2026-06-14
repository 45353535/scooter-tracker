package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f49994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f49995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f49996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NewInterstitialListener f49997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49998h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f49999i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f50000j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f50001k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f50002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f50003m;
    public String mUnitId;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f50004n;

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
        this.mUnitId = str2;
        this.f49991a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f49996f == null) {
                a aVar = new a();
                this.f49996f = aVar;
                aVar.d(true);
                this.f49996f.e(true);
                this.f49996f.c(str, str2);
            }
        } catch (Throwable th2) {
            q0.b("MBBidInterstitialVideoHandler", th2.getMessage(), th2);
        }
    }

    private void c() {
        a aVar = this.f49996f;
        if (aVar != null) {
            aVar.a(this.f50002l, this.f50004n, this.f50003m);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f49996f;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f49996f;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f49996f;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        a();
        a aVar = this.f49996f;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f49996f != null) {
            this.f49996f.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.f49996f != null) {
            this.f49996f.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f49998h = i10;
        a aVar = this.f49996f;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f49993c = str;
        this.f49992b = str2;
        this.f49994d = str3;
        this.f49995e = str4;
        this.f50000j = true;
        MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.n().a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f50002l = i10;
        this.f50003m = i11;
        this.f50004n = com.mbridge.msdk.foundation.same.a.K;
        this.f50001k = true;
        c();
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f49997g = newInterstitialListener;
        this.f49999i = true;
        a aVar = this.f49996f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f49996f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f49999i = false;
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f49997g = newInterstitialListener;
        this.f49999i = true;
        a aVar = this.f49996f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f49996f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f49999i = false;
    }

    public void showFromBid() {
        a();
        if (this.f49996f != null) {
            this.f49996f.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f50002l = i10;
        this.f50003m = (int) (d10 * 100.0d);
        this.f50004n = com.mbridge.msdk.foundation.same.a.J;
        this.f50001k = true;
        c();
    }

    private void a() {
        if (this.f49996f == null) {
            b(this.f49991a, this.mUnitId);
        }
        b();
    }

    private void b() {
        a aVar;
        if (this.f49999i) {
            a aVar2 = this.f49996f;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.newinterstitial.listener.a(this.f49997g));
            }
            this.f49999i = false;
        }
        if (this.f50000j) {
            a aVar3 = this.f49996f;
            if (aVar3 != null) {
                aVar3.a(this.f49993c, this.f49992b, this.f49994d, this.f49995e);
            }
            this.f50000j = false;
        }
        if (!this.f50001k || (aVar = this.f49996f) == null) {
            return;
        }
        aVar.a(this.f50002l, this.f50004n, this.f50003m);
        this.f50001k = false;
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}

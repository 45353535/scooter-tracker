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
import com.mbridge.msdk.setting.h;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class MBInterstitialVideoHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f49269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f49271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f49272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f49273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f49274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f49275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f49276i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f49277j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f49278k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f49279l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f49280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f49281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f49282o;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
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
        this.f49270c = str2;
        this.f49268a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f49269b == null) {
                a aVar = new a();
                this.f49269b = aVar;
                aVar.d(true);
                this.f49269b.c(str, str2);
                h.b().g(str2);
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f49269b;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f49269b;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f49269b;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isReady() {
        a();
        a aVar = this.f49269b;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void load() {
        a();
        if (this.f49269b != null) {
            this.f49269b.a(true, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f49270c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f49269b != null) {
            this.f49269b.a(false, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f49270c, true, 1));
        }
    }

    public void playVideoMute(int i10) {
        this.f49276i = i10;
        a aVar = this.f49269b;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f49271d = str;
        this.f49272e = str2;
        this.f49273f = str3;
        this.f49274g = str4;
        this.f49278k = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f49270c, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f49280m = i10;
        this.f49281n = i11;
        this.f49282o = com.mbridge.msdk.foundation.same.a.K;
        this.f49279l = true;
        b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f49275h = interstitialVideoListener;
        this.f49277j = true;
        a aVar = this.f49269b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f49269b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f49277j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f49275h = interstitialVideoListener;
        this.f49277j = true;
        a aVar = this.f49269b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f49269b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f49277j = false;
    }

    public void show() {
        a();
        if (this.f49269b != null) {
            this.f49269b.a((String) null, (String) null, (String) null, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f49270c, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f49280m = i10;
        this.f49281n = (int) (d10 * 100.0d);
        this.f49282o = com.mbridge.msdk.foundation.same.a.J;
        this.f49279l = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f49269b == null) {
            b(this.f49268a, this.f49270c);
        }
        if (this.f49277j) {
            this.f49269b.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f49275h, this.f49270c, false));
            this.f49277j = false;
        }
        if (this.f49278k) {
            this.f49269b.a(this.f49271d, this.f49272e, this.f49273f, this.f49274g);
            this.f49278k = false;
        }
        if (!this.f49279l || (aVar = this.f49269b) == null) {
            return;
        }
        aVar.a(this.f49280m, this.f49282o, this.f49281n);
        this.f49279l = false;
    }

    private void b() {
        a aVar = this.f49269b;
        if (aVar != null) {
            aVar.a(this.f49280m, this.f49282o, this.f49281n);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}

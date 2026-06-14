package com.mbridge.msdk.splash.middle;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBSplashShowListener f50848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f50849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f50850c;

    public d(c cVar, MBSplashShowListener mBSplashShowListener, CampaignEx campaignEx) {
        this.f50850c = cVar;
        this.f50848a = mBSplashShowListener;
        this.f50849b = campaignEx;
    }

    public void a(MBridgeIds mBridgeIds, String str) {
        c cVar = this.f50850c;
        if (cVar != null) {
            cVar.f50841x = false;
        }
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50849b, mBridgeIds.getUnitId(), str);
        MBSplashShowListener mBSplashShowListener = this.f50848a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(mBridgeIds, str);
        }
    }

    public void b(MBridgeIds mBridgeIds) {
        c cVar = this.f50850c;
        if (cVar != null) {
            cVar.f50841x = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_to", this.f50850c.e());
            jSONObject.put("allow_skip", this.f50850c.f() ? 1 : 0);
            jSONObject.put("countdown", this.f50850c.d());
        } catch (JSONException e10) {
            q0.b("SplashShowListenerImpl", "e:" + e10.getMessage());
        }
        j.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50849b, mBridgeIds.getUnitId(), jSONObject.toString());
        MBSplashShowListener mBSplashShowListener = this.f50848a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowSuccessed(mBridgeIds);
        }
    }

    public void a(MBridgeIds mBridgeIds) {
        MBSplashShowListener mBSplashShowListener = this.f50848a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdClicked(mBridgeIds);
        }
    }

    public void a(MBridgeIds mBridgeIds, int i10) {
        MBSplashShowListener mBSplashShowListener = this.f50848a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onDismiss(mBridgeIds, i10);
        }
        c cVar = this.f50850c;
        if (cVar != null) {
            cVar.f50841x = false;
        }
        if (i10 == 6 || i10 == 4 || i10 == 5) {
            com.mbridge.msdk.splash.report.a.a(this.f50849b, mBridgeIds.getUnitId(), i10);
        }
    }

    public void a(MBridgeIds mBridgeIds, long j10) {
        MBSplashShowListener mBSplashShowListener = this.f50848a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdTick(mBridgeIds, j10);
        }
    }

    public void a(MBridgeIds mBridgeIds, int i10, int i11, int i12) {
        MBSplashShowListener mBSplashShowListener = this.f50848a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayStart(mBridgeIds);
        }
        com.mbridge.msdk.splash.report.a.a(this.f50849b, mBridgeIds.getUnitId(), i10, i11, i12);
    }
}

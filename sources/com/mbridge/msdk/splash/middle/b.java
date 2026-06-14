package com.mbridge.msdk.splash.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBSplashLoadListener f50813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f50814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MBridgeIds f50817e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f50814b = cVar;
        this.f50817e = mBridgeIds;
        if (mBridgeIds != null) {
            this.f50815c = mBridgeIds.getUnitId();
        }
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        this.f50813a = mBSplashLoadListener;
    }

    public void a(String str) {
        this.f50816d = str;
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        c cVar2 = this.f50814b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        MBSplashLoadListener mBSplashLoadListener = this.f50813a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadSuccessed(this.f50817e, i10);
            this.f50813a.isSupportZoomOut(this.f50817e, campaignEx.getFlb() == 1);
        }
        this.f50814b.b(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.f50815c, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f50814b) == null) {
            return;
        }
        cVar.b(campaignEx, 0, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f50814b;
        if (cVar == null || !cVar.g()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String strL = bVar.l();
            if (!TextUtils.isEmpty(strL)) {
                str = strL;
            }
        }
        MBSplashLoadListener mBSplashLoadListener = this.f50813a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadFailed(this.f50817e, str, i10);
        }
        this.f50814b.b(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.f50815c, !TextUtils.isEmpty(this.f50816d), bVar != null ? bVar.d() : null);
    }
}

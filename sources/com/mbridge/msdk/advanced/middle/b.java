package com.mbridge.msdk.advanced.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeAdvancedAdListener f46353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f46354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f46355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46357e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f46354b = cVar;
        this.f46355c = mBridgeIds;
        this.f46356d = mBridgeIds.getUnitId();
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f46353a = nativeAdvancedAdListener;
    }

    public void a(String str) {
        this.f46357e = str;
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        q0.b("NativeAdvancedLoadManager", "onLoadSuccessed: " + i10);
        c cVar2 = this.f46354b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f46353a;
        if (nativeAdvancedAdListener != null && this.f46354b != null) {
            nativeAdvancedAdListener.onLoadSuccessed(this.f46355c);
        }
        this.f46354b.a(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.f46356d, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f46354b) == null) {
            return;
        }
        cVar.a(campaignEx, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f46354b;
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
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f46353a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f46355c, str);
        }
        this.f46354b.a(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.f46356d, !TextUtils.isEmpty(this.f46357e), bVar != null ? bVar.d() : null);
    }
}

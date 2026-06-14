package com.mbridge.msdk.foundation.same.report.campaignreport;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.tracker.e;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f48782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected h f48783b;

    public a(h hVar) {
        this.f48783b = hVar;
        Context contextD = c.n().d();
        this.f48782a = contextD;
        if (this.f48783b == null || contextD == null) {
            return;
        }
        int iS = m0.s(contextD);
        this.f48783b.c(iS);
        this.f48783b.a(m0.a(this.f48782a, iS));
    }

    public void a() {
        if (this.f48783b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time", this.f48783b.f());
                jSONObject.put(CampaignEx.JSON_KEY_HB, this.f48783b.i());
                jSONObject.put("fb", this.f48783b.b());
                jSONObject.put("num", this.f48783b.e());
                jSONObject.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, this.f48783b.a());
                jSONObject.put("timeout", this.f48783b.g());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f48783b.h());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", this.f48783b.d());
                    jSONObject.put("network_str", this.f48783b.c());
                }
                e eVar = new e("2000006");
                eVar.a(0);
                eVar.b(0);
                eVar.a(jSONObject);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
                d.b().d().d(eVar);
            } catch (Throwable unused) {
            }
        }
    }

    public void b(int i10) {
        h hVar = this.f48783b;
        if (hVar != null) {
            hVar.a(i10);
        }
    }

    public void c(int i10) {
        h hVar = this.f48783b;
        if (hVar != null) {
            hVar.b(i10);
        }
    }

    public void b(String str) {
        h hVar = this.f48783b;
        if (hVar != null) {
            hVar.c(str);
        }
    }

    public void a(int i10) {
        h hVar = this.f48783b;
        if (hVar != null) {
            hVar.d(i10);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f48783b.b(str);
    }
}

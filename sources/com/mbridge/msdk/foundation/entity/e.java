package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f48438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f48439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f48440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f48441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f48442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f48443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f48444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f48445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f48446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f48447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f48448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f48449q;

    public String a() {
        return this.f48433a;
    }

    public String b() {
        return this.f48435c;
    }

    public int c() {
        return this.f48436d;
    }

    public String d() {
        return this.f48434b;
    }

    public void e(int i10) {
        this.f48445m = i10;
    }

    public void f(int i10) {
        this.f48448p = i10;
    }

    public String g() {
        return this.f48439g;
    }

    public void h(String str) {
        this.f48444l = str;
    }

    public void i(String str) {
        this.f48446n = str;
    }

    public String j() {
        return this.f48442j;
    }

    public void k(String str) {
        this.f48449q = str;
    }

    public String l() {
        return this.f48444l;
    }

    public int m() {
        return this.f48445m;
    }

    public String n() {
        return this.f48446n;
    }

    public String o() {
        return this.f48447o;
    }

    public int p() {
        return this.f48448p;
    }

    public String q() {
        return this.f48449q;
    }

    public String toString() {
        return "ClickTime [campaignId=" + this.f48433a + ", click_duration=" + this.f48434b + ", lastUrl=" + this.f48442j + ", code=" + this.f48437e + ", excepiton=" + this.f48439g + ", header=" + this.f48440h + ", content=" + this.f48438f + ", type=" + this.f48448p + ", click_type=" + this.f48436d + C4240b4.j.f42674e;
    }

    public void a(int i10) {
        this.f48436d = i10;
    }

    public void b(String str) {
        this.f48435c = str;
    }

    public void c(int i10) {
        this.f48441i = i10;
    }

    public void d(int i10) {
        this.f48443k = i10;
    }

    public int e() {
        return this.f48437e;
    }

    public String f() {
        return this.f48438f;
    }

    public void g(String str) {
        this.f48442j = str;
    }

    public String h() {
        return this.f48440h;
    }

    public int i() {
        return this.f48441i;
    }

    public void j(String str) {
        this.f48447o = str;
    }

    public int k() {
        return this.f48443k;
    }

    public void a(String str) {
        this.f48433a = str;
    }

    public void b(int i10) {
        this.f48437e = i10;
    }

    public void c(String str) {
        this.f48434b = str;
    }

    public void d(String str) {
        this.f48438f = str;
    }

    public void e(String str) {
        this.f48439g = str;
    }

    public void f(String str) {
        this.f48440h = str;
    }

    public static JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String strJ = eVar.j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rid", eVar.n());
            jSONObject.put("rid_n", eVar.o());
            jSONObject.put("click_type", eVar.c());
            jSONObject.put("type", eVar.p());
            jSONObject.put("cid", eVar.a());
            jSONObject.put("click_duration", eVar.d());
            jSONObject.put(C4240b4.i.W, "2000012");
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
            jSONObject.put("last_url", strJ);
            jSONObject.put("code", eVar.e());
            jSONObject.put("exception", eVar.g());
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
            jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
            jSONObject.put("click_time", eVar.b());
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("network_type", eVar.m());
                jSONObject.put("network_str", eVar.l());
            }
            return jSONObject;
        } catch (Throwable th2) {
            q0.b("ClickTime", th2.getMessage());
            return null;
        }
    }

    public static ArrayList<JSONObject> a(List<e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (e eVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", eVar.n());
                jSONObject.put("rid_n", eVar.o());
                jSONObject.put("cid", eVar.a());
                jSONObject.put("click_type", eVar.c());
                jSONObject.put("type", eVar.p());
                jSONObject.put("click_duration", eVar.d());
                jSONObject.put(C4240b4.i.W, "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
                jSONObject.put("last_url", eVar.j());
                jSONObject.put("content", eVar.f());
                jSONObject.put("code", eVar.e());
                jSONObject.put("exception", eVar.g());
                jSONObject.put(POBCTAOverlayData.KEY_CTA_HEADER, eVar.h());
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
                jSONObject.put("click_time", eVar.b());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", eVar.m());
                    jSONObject.put("network_str", eVar.l());
                }
                String strQ = eVar.q();
                if (!TextUtils.isEmpty(strQ)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f48255r.get(strQ);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th2) {
                q0.b("ClickTime", th2.getMessage());
            }
        }
        return arrayList;
    }
}

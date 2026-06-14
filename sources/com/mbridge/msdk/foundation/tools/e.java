package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DTBAdLoader;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import net.pubnative.lite.sdk.models.AdExperience;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f48965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f48966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f48967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f48968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f48969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f48970h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f48972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f48973k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f48976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f48977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f48978p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f48980r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f48981s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f48982t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f48984v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f48979q = "android";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f48971i = m0.t();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f48983u = m0.q();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f48974l = g.d();

    public e(Context context) {
        int iS = m0.s(context);
        this.f48976n = String.valueOf(iS);
        this.f48977o = m0.a(context, iS);
        this.f48972j = m0.l(context);
        this.f48967e = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f48966d = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f48982t = String.valueOf(v0.g(context));
        this.f48981s = String.valueOf(v0.f(context));
        this.f48980r = String.valueOf(v0.d(context));
        this.f48984v = com.mbridge.msdk.foundation.controller.c.n().k().toString();
        this.f48969g = m0.s();
        this.f48975m = v0.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f48978p = "landscape";
        } else {
            this.f48978p = "portrait";
        }
        this.f48968f = com.mbridge.msdk.foundation.same.a.V;
        this.f48970h = com.mbridge.msdk.foundation.same.a.f48595g;
        this.f48973k = m0.u();
        this.f48965c = g.e();
        this.f48963a = g.a();
        this.f48964b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C4240b4.i.G, this.f48971i);
                jSONObject.put("system_version", this.f48983u);
                jSONObject.put("network_type", this.f48976n);
                jSONObject.put("network_type_str", this.f48977o);
                jSONObject.put("device_ua", this.f48972j);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.E());
                jSONObject.put("opensdk_ver", m0.B() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put(AdExperience.BRAND, this.f48969g);
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f48963a);
                jSONObject.put("adid_limit_dev", this.f48964b);
            }
            jSONObject.put("plantform", this.f48979q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f48974l);
                jSONObject.put("az_aid_info", this.f48965c);
            }
            jSONObject.put(DTBAdLoader.APS_VIDEO_APP_KEY, this.f48967e);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f48966d);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f48982t);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f48981s);
            jSONObject.put("orientation", this.f48978p);
            jSONObject.put("scale", this.f48980r);
            jSONObject.put("b", this.f48968f);
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, this.f48970h);
            jSONObject.put("web_env", this.f48984v);
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f48973k);
            jSONObject.put("misk_spt", this.f48975m);
            if (m0.y() != 0) {
                jSONObject.put("tun", m0.y());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f48759f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f48963a);
                jSONObject2.put("adid_limit_dev", this.f48964b);
                jSONObject.put("dvi", k0.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
                return jSONObject;
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}

package com.mbridge.msdk.advanced.common;

import android.content.Context;
import com.amazon.device.ads.DTBAdLoader;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f46230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f46231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f46232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f46233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f46234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f46235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f46236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f46237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f46238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f46239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f46240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f46241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f46242q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46228c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46226a = m0.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46227b = m0.q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46229d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f46230e = String.valueOf(iS);
        this.f46231f = m0.a(context, iS);
        this.f46232g = m0.l(context);
        this.f46233h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f46234i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f46235j = String.valueOf(v0.g(context));
        this.f46236k = String.valueOf(v0.f(context));
        this.f46238m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f46237l = "landscape";
        } else {
            this.f46237l = "portrait";
        }
        this.f46239n = m0.u();
        this.f46240o = g.e();
        this.f46241p = g.a();
        this.f46242q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C4240b4.i.G, this.f46226a);
                jSONObject.put("system_version", this.f46227b);
                jSONObject.put("network_type", this.f46230e);
                jSONObject.put("network_type_str", this.f46231f);
                jSONObject.put("device_ua", this.f46232g);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.E());
                jSONObject.put("opensdk_ver", m0.B() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f46241p);
                jSONObject.put("adid_limit_dev", this.f46242q);
            }
            jSONObject.put("plantform", this.f46228c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f46229d);
                jSONObject.put("az_aid_info", this.f46240o);
            }
            jSONObject.put(DTBAdLoader.APS_VIDEO_APP_KEY, this.f46233h);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f46234i);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f46235j);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f46236k);
            jSONObject.put("orientation", this.f46237l);
            jSONObject.put("scale", this.f46238m);
            if (m0.y() != 0) {
                jSONObject.put("tun", m0.y());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f46239n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
                return jSONObject;
            }
        } catch (JSONException e10) {
            q0.b("BaseDeviceInfo", e10.getMessage());
        }
        return jSONObject;
    }
}

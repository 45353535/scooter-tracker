package com.mbridge.msdk.splash.common;

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
    public String f50650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f50651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f50652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f50653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f50654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f50655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f50656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f50657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f50658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f50659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f50660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f50661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f50662q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f50648c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f50646a = m0.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f50647b = m0.q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f50649d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f50650e = String.valueOf(iS);
        this.f50651f = m0.a(context, iS);
        this.f50652g = m0.l(context);
        this.f50653h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f50654i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f50655j = String.valueOf(v0.g(context));
        this.f50656k = String.valueOf(v0.f(context));
        this.f50658m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f50657l = "landscape";
        } else {
            this.f50657l = "portrait";
        }
        this.f50659n = m0.u();
        this.f50660o = g.e();
        this.f50661p = g.a();
        this.f50662q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C4240b4.i.G, this.f50646a);
                jSONObject.put("system_version", this.f50647b);
                jSONObject.put("network_type", this.f50650e);
                jSONObject.put("network_type_str", this.f50651f);
                jSONObject.put("device_ua", this.f50652g);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.E());
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f50661p);
                jSONObject.put("adid_limit_dev", this.f50662q);
            }
            jSONObject.put("plantform", this.f50648c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f50649d);
                jSONObject.put("az_aid_info", this.f50660o);
            }
            jSONObject.put(DTBAdLoader.APS_VIDEO_APP_KEY, this.f50653h);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f50654i);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f50655j);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f50656k);
            jSONObject.put("orientation", this.f50657l);
            jSONObject.put("scale", this.f50658m);
            if (m0.y() != 0) {
                jSONObject.put("tun", m0.y());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f50659n);
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

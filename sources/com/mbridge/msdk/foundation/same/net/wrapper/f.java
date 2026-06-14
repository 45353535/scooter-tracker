package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.N6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import net.pubnative.lite.sdk.models.AdExperience;

/* JADX INFO: loaded from: classes10.dex */
public class f {
    public static void a(e eVar, Context context) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", m0.C() + "");
            eVar.a("has_wx", m0.D(context) + "");
            eVar.a("integrated_wx", m0.E() + "");
            eVar.a("opensdk_ver", m0.B() + "");
            eVar.a("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
            eVar.a("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
            eVar.a("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
            String strJ = m0.j();
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("hardware", strJ);
            }
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().d() == 1) {
                eVar.a("dnt", "1");
            }
            eVar.a(e.f48759f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.g.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
            eVar.a("emu", String.valueOf(m0.D()));
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.f48757d, t0.c() + "");
            eVar.a(e.f48758e, t0.a() + "");
            eVar.a(e.f48763j, m0.u());
        }
        eVar.a("pkg_source", m0.a(m0.t(context), context));
        if (com.mbridge.msdk.foundation.controller.c.n().k() != null) {
            eVar.a("web_env", com.mbridge.msdk.foundation.controller.c.n().k().toString());
        }
        eVar.a("http_req", "2");
        g.a(eVar, context);
        g(eVar);
    }

    public static void b(e eVar) {
        eVar.a("api_version", com.mbridge.msdk.foundation.same.a.f48592d);
    }

    public static void c(e eVar) {
        String str = com.mbridge.msdk.util.c.f52064b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        eVar.a("cronet_env", str);
    }

    public static void d(e eVar) {
        eVar.a("dyview_type", com.mbridge.msdk.foundation.same.a.f48611w);
    }

    public static void e(e eVar) {
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = com.mbridge.msdk.setting.h.b().a();
        }
        if (gVarD.D() == 1) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e() + "");
        } else if (gVarD.F0()) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e() + "");
        }
        String strF = com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().f();
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        eVar.a("tc_string", strF);
    }

    public static void f(e eVar) {
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b");
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                eVar.a("b", com.mbridge.msdk.foundation.same.a.V);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f48595g)) {
                com.mbridge.msdk.foundation.same.a.f48595g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f48595g)) {
                return;
            }
            eVar.a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f48595g);
        } catch (Exception e10) {
            q0.b("CommonRequestParamsForAdd", e10.getMessage());
        }
    }

    public static void g(e eVar) {
        a(eVar, true);
        i(eVar);
        f(eVar);
        e(eVar);
        a(eVar);
        c(eVar);
        g.a(eVar);
    }

    public static void h(e eVar) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", m0.C() + "");
            eVar.a("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()) + "");
            eVar.a("integrated_wx", m0.E() + "");
            eVar.a("opensdk_ver", m0.B() + "");
            eVar.a("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
            eVar.a("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
            eVar.a("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
            String strJ = m0.j();
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("hardware", strJ);
            }
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.g.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.f48763j, m0.u());
        }
        g.b(eVar);
        a(eVar, false);
        i(eVar);
        f(eVar);
        a(eVar);
        c(eVar);
    }

    public static void i(e eVar) {
        int iA = m0.A();
        if (iA != -1) {
            eVar.a("unknown_source", iA + "");
        }
    }

    public static void j(e eVar) {
        if (m0.y() == 0) {
            return;
        }
        eVar.a("tun", m0.y() + "");
    }

    public static void k(e eVar) {
        if (eVar != null) {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a("model");
                eVar.a(AdExperience.BRAND);
                eVar.a("screen_size");
                eVar.a("sub_ip");
                eVar.a("network_type");
                eVar.a("useragent");
                eVar.a(N6.f41375d0);
                eVar.a("language");
                eVar.a("network_str");
                eVar.a(CommonUrlParts.OS_VERSION);
                eVar.a("country_code");
                eVar.a("cronet_env");
                eVar.a("adid_limit");
                eVar.a("adid_limit_dev");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVar.a(e.f48757d);
                eVar.a(e.f48758e);
                eVar.a("power_rate");
                eVar.a("charging");
                eVar.a("timezone");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                eVar.a(N6.V0);
                eVar.a("gaid2");
                eVar.a("az_aid_info");
            }
            g.c(eVar);
        }
    }

    public static void a(e eVar, boolean z10) {
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (gVarD != null) {
            if (!TextUtils.isEmpty(gVarD.a()) && z10) {
                eVar.a("a_stid", gVarD.a());
            }
            try {
                g.a(eVar, contextD, z10, gVarD);
            } catch (Exception e10) {
                q0.b("CommonRequestParamsForAdd", e10.getMessage());
            }
        }
    }

    public static void a(e eVar) {
        String strB = com.mbridge.msdk.foundation.tools.g.b();
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        eVar.a("az_aid_info", strB);
    }
}

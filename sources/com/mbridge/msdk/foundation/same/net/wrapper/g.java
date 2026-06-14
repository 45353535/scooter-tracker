package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f48767a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f48768b = "";

    public static void a(e eVar) {
    }

    public static void b(e eVar) {
    }

    public static void c(e eVar) {
    }

    public static void a(e eVar, Context context) {
    }

    public static void a(e eVar, Context context, boolean z10, com.mbridge.msdk.setting.g gVar) {
        if (eVar == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("dmt", m0.v() + "");
                jSONObject.put("dmf", m0.h());
                jSONObject.put("adid_limit", com.mbridge.msdk.foundation.tools.g.a() + "");
                jSONObject.put("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
            }
            if (gVar.t0() == 1 && !TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.g.e()) && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("az_aid_info", com.mbridge.msdk.foundation.tools.g.e());
            }
            if (TextUtils.isEmpty(jSONObject.toString())) {
                return;
            }
            if (!jSONObject.equals(f48768b)) {
                f48767a = k0.b(jSONObject.toString());
            }
            if (TextUtils.isEmpty(f48767a)) {
                return;
            }
            eVar.a("dvi", f48767a);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonRequestParamsForAddDiff", e10.getMessage());
            }
        }
    }
}

package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f42142a = "Y4";

    public static JSONObject a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(f42142a, "add AID");
                jSONObject.put("deviceIds" + C4240b4.j.f42672d + C4240b4.j.L + C4240b4.j.f42674e, SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(f42142a, "add LAT");
                jSONObject.put(C4240b4.j.M, Boolean.parseBoolean(limitAdTracking));
                return jSONObject;
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObject;
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        d(context, jSONObject);
        c(jSONObject);
        b(context, jSONObject);
        g(context, jSONObject);
        e(context, jSONObject);
        b(jSONObject);
        f(context, jSONObject);
        c(context, jSONObject);
        a(context, jSONObject);
        h(context, jSONObject);
        return jSONObject;
    }

    private static void c(JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42709y), SDKUtils.encodeString(String.valueOf(Ib.U().i().h())));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void d(Context context, JSONObject jSONObject) {
        try {
            String strB = Y3.b(context);
            String strD = Y3.d(context);
            if (!TextUtils.isEmpty(strD)) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strD));
            }
            if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
            }
            jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42706v), Y3.e(context));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void e(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C4240b4.j.P), Z4.b(context).a(context));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void f(Context context, JSONObject jSONObject) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        try {
            if (a(C4240b4.j.f42687k0)) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42687k0), interfaceC4634y7I.C(context));
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void g(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(N6.Z0), Ib.U().i().J(context));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void h(Context context, JSONObject jSONObject) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        try {
            if (a(C4240b4.j.f42693n0)) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42693n0), interfaceC4634y7I.h(context));
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void c(Context context, JSONObject jSONObject) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        try {
            if (a(C4240b4.j.f42689l0)) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42689l0), interfaceC4634y7I.D(context));
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C4240b4.j.Y), Ib.U().i().k(context));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public static JSONObject c(Context context) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        Z4 z4B = Z4.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String strD = z4B.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = z4B.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
            }
            String strE = z4B.e();
            if (strE != null) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42690m), SDKUtils.encodeString(strE));
            }
            String strF = z4B.f();
            if (strF != null) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42692n), strF.replaceAll("[^0-9/.]", ""));
            }
            String strF2 = z4B.f();
            if (strF2 != null) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42694o), SDKUtils.encodeString(strF2));
            }
            jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42696p), String.valueOf(z4B.a()));
            jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42698q), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (z4B.b() != null && z4B.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42700r), SDKUtils.encodeString(z4B.b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42708x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (a(C4240b4.j.f42685j0)) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42685j0), SDKUtils.encodeString(String.valueOf(interfaceC4634y7I.q(context))));
            }
            String strG = B1.g(context);
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
            }
            String strValueOf = String.valueOf(interfaceC4634y7I.r());
            if (!TextUtils.isEmpty(strValueOf)) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.K), SDKUtils.encodeString(strValueOf));
            }
            String strValueOf2 = String.valueOf(interfaceC4634y7I.p());
            if (!TextUtils.isEmpty(strValueOf2)) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.O), SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), Yc.e(context));
            jSONObject.put("mcc", X3.b(context));
            jSONObject.put("mnc", X3.c(context));
            jSONObject.put(SDKUtils.encodeString(C4240b4.j.S), X3.f(context));
            jSONObject.put(SDKUtils.encodeString(C4240b4.j.R), SDKUtils.encodeString(X3.g(context)));
            jSONObject.put(SDKUtils.encodeString(C4240b4.j.V), B1.f(context));
            jSONObject.put(SDKUtils.encodeString(C4240b4.j.X), B1.d(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(B1.b(context)));
            jSONObject.put(SDKUtils.encodeString("stid"), Yc.d(context));
            String strE2 = B1.e(context);
            if (!TextUtils.isEmpty(strE2)) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42671c0), SDKUtils.encodeString(strE2));
            }
            jSONObject.put(C4240b4.j.f42673d0, SDKUtils.encodeString(String.valueOf(interfaceC4634y7I.a())));
            jSONObject.put(C4240b4.j.f42675e0, SDKUtils.encodeString(String.valueOf(interfaceC4634y7I.m())));
            String strG2 = interfaceC4634y7I.G(context);
            if (!TextUtils.isEmpty(strG2)) {
                jSONObject.put("icc", strG2);
            }
            String strD2 = interfaceC4634y7I.d();
            if (!TextUtils.isEmpty(strD2)) {
                jSONObject.put("tz", SDKUtils.encodeString(strD2));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            return jSONObject;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void b(JSONObject jSONObject) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        try {
            if (a(C4240b4.j.f42683i0)) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42683i0), interfaceC4634y7I.j());
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static boolean a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    private static void a(JSONObject jSONObject) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        try {
            a(jSONObject, C4240b4.j.H, String.valueOf(interfaceC4634y7I.k()));
            a(jSONObject, C4240b4.j.I, String.valueOf(interfaceC4634y7I.c()));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        try {
            if (a(C4240b4.j.f42691m0)) {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42691m0), interfaceC4634y7I.e(context));
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}

package x4;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C4240b4;
import com.ktwapps.speedometer.R;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class x {
    public static boolean A(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("hudClock", 1) == 1;
    }

    public static boolean B(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("hudDistance", 1) == 1;
    }

    public static boolean C(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("keepAlert", 1) == 1;
    }

    public static boolean D(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("pauseTimeAtZero", 0) == 1;
    }

    public static int E(Context context) {
        context.getSharedPreferences("pref_files", 0).getInt("premium", -1);
        return 1;
    }

    public static boolean F(Context context) {
        context.getSharedPreferences("pref_files", 0).getInt("tracking", -1);
        return 1 != 0;
    }

    public static boolean G(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("vibrate", 1) == 1;
    }

    public static void H(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.remove("sessionsInfo");
        editorEdit.remove("sessionsRoutes");
        editorEdit.remove("sessionsSpeeds");
        editorEdit.apply();
    }

    public static void I(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.remove("floatingSize");
        editorEdit.remove("floatingBackgroundColor");
        editorEdit.remove("floatingFont");
        editorEdit.remove("floatingTextColor");
        editorEdit.remove("floatingWarningColor");
        editorEdit.apply();
    }

    public static void J(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("adCounter", i10);
        editorEdit.apply();
    }

    public static void K(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("analog", i10);
        editorEdit.apply();
    }

    public static void L(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putString("color", str);
        editorEdit.apply();
    }

    public static void M(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putString("floatingBackgroundColor", str);
        editorEdit.apply();
    }

    public static void N(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("floatingFont", i10);
        editorEdit.apply();
    }

    public static void O(Context context, Point point) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("floatingPointX", point.x);
        editorEdit.putInt("floatingPointY", point.y);
        editorEdit.apply();
    }

    public static void P(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("floatingSize", i10);
        editorEdit.apply();
    }

    public static void Q(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putString("floatingTextColor", str);
        editorEdit.apply();
    }

    public static void R(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putString("floatingWarningColor", str);
        editorEdit.apply();
    }

    public static void S(Context context, long j10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putLong("lastAdDisplayTime", j10);
        editorEdit.apply();
    }

    public static void T(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt(C4240b4.a.f42515t, i10);
        editorEdit.apply();
    }

    public static void U(Context context, float f10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putFloat("odometer", f10);
        editorEdit.apply();
    }

    public static void V(Context context, float f10, int i10) {
        if (i10 == 5) {
            f10 *= 1.60934f;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putFloat("odometer", f10);
        editorEdit.apply();
    }

    public static void W(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("odometerUnit", i10);
        editorEdit.apply();
    }

    public static void X(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("premium", i10);
        editorEdit.apply();
    }

    public static void Y(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("resolution", i10);
        editorEdit.apply();
    }

    public static void Z(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("ringtone", i10);
        editorEdit.apply();
    }

    public static void a(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putBoolean("HUD", false);
        editorEdit.apply();
    }

    public static void a0(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putString("sessionsInfo", str);
        editorEdit.putString("sessionsRoutes", str2);
        editorEdit.putString("sessionsSpeeds", str3);
        editorEdit.apply();
    }

    public static int b(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("adCounter", 3);
    }

    public static void b0(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("speedLimit", i10);
        editorEdit.apply();
    }

    public static int c(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("analog", 0);
    }

    public static void c0(Context context, long j10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putLong("trial", j10);
        editorEdit.apply();
    }

    public static String d(Context context) {
        return context.getSharedPreferences("pref_files", 0).getString("color", "RED");
    }

    public static void d0(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("unit", i10);
        editorEdit.apply();
    }

    public static String e(Context context) {
        return context.getSharedPreferences("pref_files", 0).getString("floatingBackgroundColor", POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR);
    }

    public static void e0(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("unitDistance", i10);
        editorEdit.apply();
    }

    public static int f(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("floatingFont", 1);
    }

    public static boolean f0(Context context) {
        return context.getSharedPreferences("pref_files", 0).getBoolean("HUD", true);
    }

    public static Point g(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref_files", 0);
        return new Point(sharedPreferences.getInt("floatingPointX", 0), sharedPreferences.getInt("floatingPointY", 0));
    }

    public static void g0(Context context) {
        boolean zW = w(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("clock", !zW ? 1 : 0);
        editorEdit.apply();
    }

    public static int h(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("floatingSize", context.getResources().getBoolean(R.bool.isTablet) ? 16 : 4);
    }

    public static void h0(Context context) {
        boolean zX = x(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("deviceScreen", !zX ? 1 : 0);
        editorEdit.apply();
    }

    public static String i(Context context) {
        return context.getSharedPreferences("pref_files", 0).getString("floatingTextColor", "#E0E0E0");
    }

    public static void i0(Context context) {
        boolean z10 = z(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("hudBattery", !z10 ? 1 : 0);
        editorEdit.apply();
    }

    public static String j(Context context) {
        return context.getSharedPreferences("pref_files", 0).getString("floatingWarningColor", "#FF454A");
    }

    public static void j0(Context context) {
        boolean zA = A(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("hudClock", !zA ? 1 : 0);
        editorEdit.apply();
    }

    public static long k(Context context) {
        return context.getSharedPreferences("pref_files", 0).getLong("lastAdDisplayTime", 0L);
    }

    public static void k0(Context context) {
        boolean zB = B(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("hudDistance", !zB ? 1 : 0);
        editorEdit.apply();
    }

    public static int l(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt(C4240b4.a.f42515t, 0);
    }

    public static void l0(Context context) {
        boolean zC = C(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("keepAlert", !zC ? 1 : 0);
        editorEdit.apply();
    }

    public static float m(Context context) {
        return context.getSharedPreferences("pref_files", 0).getFloat("odometer", 0.0f);
    }

    public static void m0(Context context) {
        boolean zD = D(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("pauseTimeAtZero", !zD ? 1 : 0);
        editorEdit.apply();
    }

    public static int n(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("odometerUnit", 2);
    }

    public static void n0(Context context) {
        boolean zF = F(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("tracking", !zF ? 1 : 0);
        editorEdit.apply();
    }

    public static int o(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("resolution", 5);
    }

    public static void o0(Context context) {
        boolean zG = G(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref_files", 0).edit();
        editorEdit.putInt("vibrate", !zG ? 1 : 0);
        editorEdit.apply();
    }

    public static int p(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("ringtone", 1);
    }

    public static List q(Context context) {
        String string = context.getSharedPreferences("pref_files", 0).getString("sessionsRoutes", null);
        ArrayList arrayList = new ArrayList();
        if (string != null && !string.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.optString(i10, ""));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return arrayList;
    }

    public static w4.f r(Context context) {
        String string = context.getSharedPreferences("pref_files", 0).getString("sessionsInfo", null);
        if (string != null && !string.isEmpty() && !string.equals(JsonUtils.EMPTY_JSON)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                return new w4.f(jSONObject.optLong("duration", 0L), jSONObject.optLong("startDate", 0L), jSONObject.optLong("endDate", 0L), (float) jSONObject.optDouble("distance", 0.0d), (float) jSONObject.optDouble("maximum", 0.0d), (float) jSONObject.optDouble("average", 0.0d), jSONObject.optInt("speeding", 0), jSONObject.optString("startAddress", ""), jSONObject.optString("endAddress", ""));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static int s(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("speedLimit", 120);
    }

    public static long t(Context context) {
        return context.getSharedPreferences("pref_files", 0).getLong("trial", 0L);
    }

    public static int u(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("unit", 2);
    }

    public static int v(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("unitDistance", 2);
    }

    public static boolean w(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("clock", 1) == 1;
    }

    public static boolean x(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("deviceScreen", -1) == 1;
    }

    public static boolean y(Context context) {
        return context.getSharedPreferences("pref_files", 0).contains("floatingPointX");
    }

    public static boolean z(Context context) {
        return context.getSharedPreferences("pref_files", 0).getInt("hudBattery", 1) == 1;
    }
}

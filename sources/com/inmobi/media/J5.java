package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import com.inmobi.media.J5;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class J5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f37101c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static JSONObject f37104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Integer f37105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Float f37106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f37107i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L5 f37099a = new L5(0, 0, 2.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I5 f37100b = new I5(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static float f37102d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f37103e = true;

    static {
        C4148x5.f39893a.getClass();
        f37107i = C4148x5.u();
    }

    public static String a() {
        Display displayA;
        Context context = Ji.f37157a;
        if (context == null || (displayA = a(context)) == null) {
            return "0x0";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        return displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
    }

    public static float b() {
        Display displayA;
        if (f37102d == -1.0f) {
            Context context = Ji.f37157a;
            if (context == null || (displayA = a(context)) == null) {
                return 2.0f;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayA.getMetrics(displayMetrics);
            float f10 = displayMetrics.density;
            if (f10 == 0.0f) {
                return 2.0f;
            }
            f37102d = f10;
        }
        return f37102d;
    }

    public static HashMap c() {
        HashMap map = new HashMap();
        try {
            map.put("d-device-screen-density", String.valueOf(b()));
            map.put("d-device-screen-size", e());
            map.put("d-density-dependent-screen-size", a());
            map.put("d-orientation", String.valueOf((int) g()));
            Float f10 = f37106h;
            map.put("d-textsize", String.valueOf(f10 != null ? f10.floatValue() : 37.0f));
            return map;
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("J5", "TAG");
            e10.getMessage();
            return map;
        }
    }

    public static L5 d() {
        Context context = Ji.f37157a;
        if (context == null) {
            return f37099a;
        }
        Display displayA = a(context);
        if (displayA == null) {
            return f37099a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new L5((int) (displayMetrics.widthPixels / f10), (int) (displayMetrics.heightPixels / f10), f10);
    }

    public static String e() {
        L5 l5D = d();
        return l5D.f37265a + "X" + l5D.f37266b;
    }

    public static Integer f() {
        Context context = Ji.f37157a;
        if (context == null) {
            return null;
        }
        int i10 = Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", -1);
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return i10 != 2 ? null : 1;
    }

    public static byte g() {
        Display displayA;
        int rotation;
        Context context = Ji.f37157a;
        if (context == null || (displayA = a(context)) == null || (rotation = displayA.getRotation()) == 0) {
            return (byte) 1;
        }
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation == 2) {
            return (byte) 2;
        }
        if (rotation == 3) {
            return (byte) 4;
        }
        Intrinsics.checkNotNullExpressionValue("J5", "TAG");
        return (byte) 1;
    }

    public static L5 h() {
        Context context = Ji.f37157a;
        if (context == null) {
            return f37099a;
        }
        Display displayA = a(context);
        if (displayA == null) {
            return f37099a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getRealMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new L5((int) (displayMetrics.widthPixels / f10), (int) (displayMetrics.heightPixels / f10), f10);
    }

    public static void i() {
        if (f37107i) {
            if (f() != null) {
                Intrinsics.checkNotNullExpressionValue("J5", "TAG");
                return;
            }
            Context context = Ji.f37157a;
            if (context == null) {
                return;
            }
            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
            Ea eaA = Da.a(context, "display_info_store");
            Intrinsics.checkNotNullParameter("nav_bar_type", C4240b4.i.W);
            int i10 = eaA.f36783a.getInt("nav_bar_type", -1);
            Integer numValueOf = Integer.valueOf(i10);
            f37105g = numValueOf;
            if (i10 == -1) {
                numValueOf = null;
            }
            f37105g = numValueOf;
            Intrinsics.checkNotNullExpressionValue("J5", "TAG");
        }
    }

    public static void j() {
        Context context;
        if (f37107i && (context = Ji.f37157a) != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
            Ea eaA = Da.a(context, "display_info_store");
            Intrinsics.checkNotNullParameter("safe_area", C4240b4.i.W);
            JSONObject jSONObject = null;
            String string = eaA.f36783a.getString("safe_area", null);
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    Intrinsics.checkNotNullExpressionValue("J5", "TAG");
                }
            }
            f37104f = jSONObject;
            Intrinsics.checkNotNullExpressionValue("J5", "TAG");
            Objects.toString(f37104f);
        }
    }

    public static final void b(WindowInsets windowInsets, Context context) {
        try {
            String string = windowInsets.getSystemGestureInsets().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String[] strArr = (String[]) new Regex("Insets").j(string, 0).toArray(new String[0]);
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr.length > 1) {
                String[] strArr2 = (String[]) new Regex(StringUtils.COMMA).j(new Regex("[^0-9,=a-zA-Z]*").replace(strArr[1], ""), 0).toArray(new String[0]);
                stringBuffer.append("{");
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String[] strArr3 = (String[]) new Regex(C4240b4.j.f42668b).j(strArr2[i10], 0).toArray(new String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append("\"" + strArr3[0] + "\"");
                        stringBuffer.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        stringBuffer.append(F3.b(((float) Integer.parseInt(strArr3[1])) / b()));
                        if (i10 < strArr2.length - 1) {
                            stringBuffer.append(", ");
                        }
                    }
                }
                stringBuffer.append("}");
            }
            if (stringBuffer.length() > 0) {
                f37101c = stringBuffer.toString();
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Intrinsics.checkNotNull(context);
                Da.a(context, "display_info_store").a("gesture_margin", stringBuffer.toString(), false);
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("J5", "TAG");
        }
    }

    public static void a(final Integer num) {
        final Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: w3.a2
            @Override // java.lang.Runnable
            public final void run() {
                J5.a(num, context);
            }
        };
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final void c(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (f37103e || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(rootWindowInsets, context);
    }

    public static void a(final LinkedHashMap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        final Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: w3.z1
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                J5.a(value, context);
            }
        };
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static void a(final WindowInsets insets, final Context context) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (f37103e) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: w3.b2
            @Override // java.lang.Runnable
            public final void run() {
                J5.b(insets, context);
            }
        };
        Context context2 = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static Display a(Context context) {
        C4148x5.f39893a.getClass();
        Object systemService = context.getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        if (displayManager != null) {
            return displayManager.getDisplay(0);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.view.WindowInsets r3) {
        /*
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.inmobi.media.x5 r0 = com.inmobi.media.C4148x5.f39893a
            r0.getClass()
            boolean r0 = com.inmobi.media.C4148x5.r()
            if (r0 == 0) goto L60
            byte r0 = g()
            com.inmobi.media.Df r0 = com.inmobi.media.Ef.a(r0)
            int r1 = androidx.core.view.WindowInsetsCompat.Type.systemGestures()
            android.graphics.Insets r3 = androidx.core.view.v1.a(r3, r1)
            java.lang.String r1 = "getInsets(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L54
            if (r0 == r1) goto L47
            r2 = 2
            if (r0 == r2) goto L54
            r2 = 3
            if (r0 != r2) goto L41
            int r0 = androidx.appcompat.widget.l.a(r3)
            if (r0 != 0) goto L61
            int r3 = androidx.appcompat.widget.m.a(r3)
            if (r3 != 0) goto L61
            goto L60
        L41:
            lf.m r3 = new lf.m
            r3.<init>()
            throw r3
        L47:
            int r0 = androidx.appcompat.widget.j.a(r3)
            if (r0 != 0) goto L61
            int r3 = androidx.appcompat.widget.m.a(r3)
            if (r3 != 0) goto L61
            goto L60
        L54:
            int r0 = androidx.appcompat.widget.j.a(r3)
            if (r0 != 0) goto L61
            int r3 = androidx.appcompat.widget.l.a(r3)
            if (r3 != 0) goto L61
        L60:
            r1 = 0
        L61:
            java.lang.String r3 = "J5"
            java.lang.String r0 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.J5.a(android.view.WindowInsets):int");
    }

    public static final void a(Map map, Context context) throws JSONException {
        Intrinsics.checkNotNullExpressionValue("J5", "TAG");
        Objects.toString(map);
        if (f37104f == null) {
            f37104f = new JSONObject();
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            JSONObject jSONObject = f37104f;
            if (jSONObject != null) {
                jSONObject.put(String.valueOf(iIntValue), map.get(Integer.valueOf(iIntValue)));
            }
        }
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Ea eaA = Da.a(context, "display_info_store");
        JSONObject jSONObject2 = f37104f;
        eaA.a("safe_area", jSONObject2 != null ? jSONObject2.toString() : null, false);
    }

    public static I5 b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Display displayA = a(context);
        if (displayA == null) {
            return f37100b;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getRealMetrics(displayMetrics);
        return new I5(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static final void a(Integer num, Context context) {
        Intrinsics.checkNotNullExpressionValue("J5", "TAG");
        f37105g = num;
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Da.a(context, "display_info_store").a("nav_bar_type", num != null ? num.intValue() : -1, false);
    }
}

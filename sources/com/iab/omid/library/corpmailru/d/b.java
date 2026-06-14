package com.iab.omid.library.corpmailru.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.corpmailru.walking.a;
import com.ironsource.C4240b4;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WindowManager f34935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f34936c = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static float f34934a = Resources.getSystem().getDisplayMetrics().density;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f34937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f34938b;

        a(float f10, float f11) {
            this.f34937a = f10;
            this.f34938b = f11;
        }
    }

    static float a(int i10) {
        return i10 / f34934a;
    }

    private static a b(JSONObject jSONObject) {
        float fA;
        float fA2;
        if (f34935b != null) {
            Point point = new Point(0, 0);
            f34935b.getDefaultDisplay().getRealSize(point);
            fA = a(point.x);
            fA2 = a(point.y);
        } else {
            fA = 0.0f;
            fA2 = 0.0f;
        }
        return new a(fA, fA2);
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f34936c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!jSONArrayOptJSONArray.optString(i10, "").equals(jSONArrayOptJSONArray2.optString(i10, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!b(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i10));
            jSONObject.put("y", a(i11));
            jSONObject.put("width", a(i12));
            jSONObject.put("height", a(i13));
            return jSONObject;
        } catch (JSONException e10) {
            c.a("Error with creating viewStateObject", e10);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            c.a("Error with setting not visible reason", e10);
        }
    }

    public static void a(Context context) {
        if (context != null) {
            f34934a = context.getResources().getDisplayMetrics().density;
            f34935b = (WindowManager) context.getSystemService("window");
        }
    }

    public static boolean b(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && c(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && f(jSONObject, jSONObject2);
    }

    public static void a(JSONObject jSONObject) {
        a aVarB = b(jSONObject);
        try {
            jSONObject.put("width", aVarB.f34937a);
            jSONObject.put("height", aVarB.f34938b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void a(JSONObject jSONObject, a.C0390a c0390a) {
        com.iab.omid.library.corpmailru.b.c cVarA = c0390a.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = c0390a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", cVarA.b());
            jSONObject.put("friendlyObstructionPurpose", cVarA.c());
            jSONObject.put("friendlyObstructionReason", cVarA.d());
        } catch (JSONException e10) {
            c.a("Error with setting friendly obstruction", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            c.a("Error with setting ad session id", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e10) {
            c.a("JSONException during JSONObject.put for name [" + str + C4240b4.j.f42674e, e10);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}

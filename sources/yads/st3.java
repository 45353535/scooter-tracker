package yads;

import android.content.res.Resources;
import android.graphics.Point;
import android.util.Log;
import android.view.WindowManager;
import com.ironsource.C4240b4;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class st3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WindowManager f115944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f115945b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static float f115946c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i10 / f115946c);
            jSONObject.put("y", i11 / f115946c);
            jSONObject.put("width", i12 / f115946c);
            jSONObject.put("height", i13 / f115946c);
            return jSONObject;
        } catch (JSONException e10) {
            au3.a("Error with creating viewStateObject", e10);
            return jSONObject;
        }
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!(jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) && (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray.length() != jSONArrayOptJSONArray2.length())) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!c(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            r0 = 1
            if (r9 != 0) goto L6
            if (r10 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r9 == 0) goto Lab
            if (r10 != 0) goto Ld
            goto Lab
        Ld:
            java.lang.String[] r2 = yads.st3.f115945b
            r3 = r1
        L10:
            r4 = 4
            if (r3 >= r4) goto L26
            r4 = r2[r3]
            double r5 = r9.optDouble(r4)
            double r7 = r10.optDouble(r4)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L23
            goto Lab
        L23:
            int r3 = r3 + 1
            goto L10
        L26:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.optString(r2, r3)
            java.lang.String r2 = r10.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lab
            java.lang.String r2 = "noOutputDevice"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r10.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lab
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r10.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lab
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r2)
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            if (r4 != 0) goto L77
            if (r2 != 0) goto L77
            goto La4
        L77:
            if (r4 != 0) goto L7c
            if (r2 != 0) goto L7c
            goto L8b
        L7c:
            if (r4 == 0) goto Lab
            if (r2 != 0) goto L81
            goto Lab
        L81:
            int r5 = r4.length()
            int r6 = r2.length()
            if (r5 != r6) goto Lab
        L8b:
            r5 = r1
        L8c:
            int r6 = r4.length()
            if (r5 >= r6) goto La4
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto La1
            goto Lab
        La1:
            int r5 = r5 + 1
            goto L8c
        La4:
            boolean r9 = b(r9, r10)
            if (r9 == 0) goto Lab
            return r0
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.st3.c(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            Log.e("OMIDLIB", "JSONException during JSONObject.put for name [" + str + C4240b4.j.f42674e, e10);
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
        } catch (JSONException unused) {
        }
    }

    public static void a(JSONObject jSONObject) {
        float f10;
        float f11;
        if (f115944a != null) {
            Point point = new Point(0, 0);
            f115944a.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = f115946c;
            f10 = f12 / f13;
            f11 = point.y / f13;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException unused) {
        }
    }
}

package com.appodeal.ads.segments;

import android.content.Context;
import com.adjust.sdk.purchase.ADJPConstants;
import com.appodeal.ads.jc;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.Version;
import com.google.common.base.Ascii;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f14507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14509d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public r(JSONObject jSONObject) throws JSONException {
        Object objValueOf;
        j jVar;
        int i10;
        Object version;
        Object[] objArr;
        this.f14506a = jSONObject.getString("name");
        String string = jSONObject.getString("op");
        j[] jVarArrValues = j.values();
        int length = jVarArrValues.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objValueOf = null;
            if (i12 >= length) {
                jVar = null;
                break;
            }
            jVar = jVarArrValues[i12];
            if (jVar.f14481b.equals(string)) {
                break;
            } else {
                i12++;
            }
        }
        this.f14507b = jVar;
        String str = this.f14506a;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1561358613:
                if (str.equals("bought_inapps")) {
                    b10 = 0;
                }
                break;
            case -1542869117:
                if (str.equals(CommonUrlParts.DEVICE_TYPE)) {
                    b10 = 1;
                }
                break;
            case -901870406:
                if (str.equals("app_version")) {
                    b10 = 2;
                }
                break;
            case -686246186:
                if (str.equals("session_time")) {
                    b10 = 3;
                }
                break;
            case -376724013:
                if (str.equals(ADJPConstants.KEY_SDK_VERSION)) {
                    b10 = 4;
                }
                break;
            case 96801:
                if (str.equals("app")) {
                    b10 = 5;
                }
                break;
            case 185691686:
                if (str.equals("session_count")) {
                    b10 = 6;
                }
                break;
            case 672836989:
                if (str.equals(CommonUrlParts.OS_VERSION)) {
                    b10 = 7;
                }
                break;
            case 731866107:
                if (str.equals("connection_type")) {
                    b10 = 8;
                }
                break;
            case 957831062:
                if (str.equals("country")) {
                    b10 = 9;
                }
                break;
            case 1335099163:
                if (str.equals("inapp_amount")) {
                    b10 = 10;
                }
                break;
            case 1660689696:
                if (str.equals("part_of_audience")) {
                    b10 = Ascii.VT;
                }
                break;
            case 1818604305:
                if (str.equals("average_session_length")) {
                    b10 = Ascii.FF;
                }
                break;
        }
        switch (b10) {
            case 0:
                i10 = 8;
                break;
            case 1:
                i10 = 3;
                break;
            case 2:
            case 7:
                i10 = 1;
                break;
            case 3:
                i10 = 9;
                break;
            case 4:
                i10 = 2;
                break;
            case 5:
            case 8:
            case 9:
                i10 = 4;
                break;
            case 6:
            case 11:
            case 12:
                i10 = 5;
                break;
            case 10:
                i10 = 7;
                break;
            default:
                i10 = 10;
                break;
        }
        this.f14509d = i10;
        switch (jc.a(i10)) {
            case 0:
                version = new Version(jSONObject.getString("value"));
                break;
            case 1:
                version = new com.appodeal.ads.utils.i(jSONObject.getString("value"));
                break;
            case 2:
            case 8:
            case 9:
                objValueOf = jSONObject.get("value");
                version = objValueOf;
                break;
            case 3:
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("value");
                objArr = new String[jSONArrayOptJSONArray.length()];
                while (i11 < jSONArrayOptJSONArray.length()) {
                    objArr[i11] = jSONArrayOptJSONArray.getString(i11);
                    i11++;
                }
                objValueOf = objArr;
                version = objValueOf;
                break;
            case 4:
                objValueOf = Integer.valueOf(jSONObject.getInt("value"));
                version = objValueOf;
                break;
            case 5:
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("value");
                objArr = new Integer[jSONArrayOptJSONArray2.length()];
                while (i11 < jSONArrayOptJSONArray2.length()) {
                    objArr[i11] = Integer.valueOf(jSONArrayOptJSONArray2.getString(i11));
                    i11++;
                }
                objValueOf = objArr;
                version = objValueOf;
                break;
            case 6:
                objValueOf = Float.valueOf(jSONObject.getString("value"));
                version = objValueOf;
                break;
            case 7:
                objValueOf = Boolean.valueOf(jSONObject.getString("value"));
                version = objValueOf;
                break;
            default:
                version = objValueOf;
                break;
        }
        this.f14508c = version;
    }

    public final boolean a(Context context) {
        Object objA;
        j jVar;
        if (g0.f14471c == null) {
            g0.f14471c = new g0();
        }
        g0 g0Var = g0.f14471c;
        String str = this.f14506a;
        g0Var.getClass();
        Object objValueOf = null;
        if (str == null) {
            objA = null;
        } else {
            try {
                t tVar = (t) g0.f14475g.get(str);
                objA = tVar != null ? tVar.a(context, g0Var) : null;
                if (objA == null) {
                    HashMap map = g0.f14472d;
                    if (map.containsKey(str)) {
                        objA = map.get(str);
                    }
                }
            } catch (Throwable th2) {
                Log.log(th2);
                objA = null;
            }
        }
        if (objA == null) {
            return false;
        }
        if (this.f14509d == 10) {
            int i10 = objA instanceof Integer ? 5 : objA instanceof Float ? 7 : objA instanceof Boolean ? 8 : objA instanceof String ? 3 : 10;
            this.f14509d = i10;
            if (i10 == 5) {
                Object obj = this.f14508c;
                if (obj instanceof String) {
                    objValueOf = Integer.valueOf((String) obj);
                } else if (obj instanceof Integer) {
                    objValueOf = (Integer) obj;
                }
                this.f14508c = objValueOf;
            } else if (i10 == 7) {
                Object obj2 = this.f14508c;
                if (obj2 instanceof String) {
                    objValueOf = Float.valueOf((String) obj2);
                } else if (obj2 instanceof Integer) {
                    objValueOf = Float.valueOf(((Integer) obj2).floatValue());
                } else if (obj2 instanceof Float) {
                    objValueOf = (Float) obj2;
                }
                this.f14508c = objValueOf;
            } else if (i10 == 8) {
                Object obj3 = this.f14508c;
                if (obj3 instanceof String) {
                    objValueOf = Boolean.valueOf((String) obj3);
                } else if (obj3 instanceof Boolean) {
                    objValueOf = (Boolean) obj3;
                }
                this.f14508c = objValueOf;
            }
        }
        if (this.f14509d == 10 || (jVar = this.f14507b) == null) {
            return false;
        }
        return jVar.f14482c.a(this, objA);
    }
}

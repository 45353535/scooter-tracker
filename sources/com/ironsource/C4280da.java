package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C4240b4;
import com.ironsource.C4500q8;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4280da {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f42910b = "da";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f42911c = "supersonic_shared_preferen";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f42912d = "version";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f42913e = "back_button_state";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f42914f = "search_keys";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f42915g = "^\\d+_\\d+$";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static C4280da f42916h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f42917a;

    private C4280da(Context context) {
        this.f42917a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized C4280da a(Context context) {
        try {
            if (f42916h == null) {
                f42916h = new C4280da(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f42916h;
    }

    public static synchronized C4280da e() {
        return f42916h;
    }

    public C4500q8.a b() {
        int i10 = Integer.parseInt(this.f42917a.getString(f42913e, "2"));
        return i10 == 0 ? C4500q8.a.None : i10 == 1 ? C4500q8.a.Device : i10 == 2 ? C4500q8.a.Controller : C4500q8.a.Controller;
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.f42917a.edit();
        editorEdit.putString(f42913e, str);
        editorEdit.apply();
    }

    public List<String> d() {
        String string = this.f42917a.getString(f42914f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            Yd yd2 = new Yd(string);
            if (yd2.a(C4240b4.i.R)) {
                try {
                    arrayList.addAll(yd2.a((JSONArray) yd2.b(C4240b4.i.R)));
                    return arrayList;
                } catch (JSONException e10) {
                    C4462o4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = this.f42917a.edit();
        editorEdit.putString(f42914f, str);
        editorEdit.apply();
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f42917a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public String c() {
        return this.f42917a.getString("version", X1.f42014f);
    }

    public String a(String str) {
        String string = this.f42917a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    private boolean b(String str) {
        return str.matches(f42915g);
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.f42917a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor editorEdit = this.f42917a.edit();
            editorEdit.putString("ssaUserData", jSONObject.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f42917a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f42917a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.f42917a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }
}

package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
abstract class AbstractC4286e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42941a = "eventId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42942b = "timestamp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42943c = "InterstitialEvents";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f42944d = "events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f42945e = "events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    JSONObject f42946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f42947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f42948h;

    AbstractC4286e() {
    }

    private String a(int i10) {
        return i10 != 2 ? "events" : "InterstitialEvents";
    }

    protected abstract String a();

    public abstract String a(ArrayList<C4649z5> arrayList, JSONObject jSONObject);

    String b() {
        return TextUtils.isEmpty(this.f42948h) ? a() : this.f42948h;
    }

    public abstract String c();

    JSONObject a(C4649z5 c4649z5) {
        JSONObject jSONObject;
        try {
            String strA = c4649z5.a();
            if (!TextUtils.isEmpty(strA)) {
                jSONObject = new JSONObject(strA);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("eventId", c4649z5.c());
            jSONObject.put("timestamp", c4649z5.d());
            return jSONObject;
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    String a(JSONArray jSONArray) {
        try {
            if (this.f42946f == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f42946f.toString());
            jSONObject.put("timestamp", IronSourceUtils.e());
            jSONObject.put(a(this.f42947g), jSONArray);
            return jSONObject.toString();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }

    void a(String str) {
        this.f42948h = str;
    }
}

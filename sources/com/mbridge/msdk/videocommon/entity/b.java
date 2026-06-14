package com.mbridge.msdk.videocommon.entity;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f53261c;

    public b(int i10, int i11, a aVar) {
        this.f53259a = i10;
        this.f53260b = i11;
        this.f53261c = aVar;
    }

    public int a() {
        return this.f53259a;
    }

    public int b() {
        return this.f53260b;
    }

    public static List<b> a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    int iOptInt = jSONObjectOptJSONObject.optInt("id");
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("timeout");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("params");
                    arrayList.add(new b(iOptInt, iOptInt2, jSONObjectOptJSONObject2 != null ? a.a(jSONObjectOptJSONObject2) : null));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}

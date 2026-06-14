package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20246d;

    public g(int i10, int i11, int i12, long j10) {
        this.f20246d = j10;
        this.f20243a = i10;
        this.f20244b = i11;
        this.f20245c = i12;
    }

    public final JSONObject a(boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            try {
                jSONObject.put("time", this.f20246d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f20243a);
        if (z11) {
            jSONObject.put("com", this.f20245c);
        }
        jSONObject.put("cli", this.f20244b);
        return jSONObject;
    }

    public static g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        long jOptLong = jSONObject.optLong("time");
        int iOptInt = jSONObject.optInt("cli", -1);
        int iOptInt2 = jSONObject.optInt("imp", -1);
        int iOptInt3 = jSONObject.optInt("com", -1);
        if (jOptLong == 0 || iOptInt < 0 || iOptInt2 < 0 || iOptInt3 < 0) {
            return null;
        }
        return new g(iOptInt2, iOptInt, iOptInt3, jOptLong);
    }
}

package com.startapp.sdk.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class oi implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f65045a;

    public oi(JSONObject jSONObject) {
        this.f65045a = jSONObject;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a(Object obj) {
        try {
            return this.f65045a.getJSONObject(((Integer) obj).toString());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}

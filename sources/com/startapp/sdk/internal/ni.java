package com.startapp.sdk.internal;

import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public final class ni implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f64968a;

    public ni(JSONArray jSONArray) {
        this.f64968a = jSONArray;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a(Object obj) {
        try {
            return this.f64968a.getJSONObject(((Integer) obj).intValue());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}

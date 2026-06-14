package com.startapp.sdk.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class mh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mh f64940b = new mh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f64941a;

    public mh() {
        this.f64941a = new JSONObject();
    }

    public final void a(int i10, Object obj) {
        try {
            this.f64941a.put(String.valueOf(i10), obj);
        } catch (JSONException unused) {
        }
    }

    public final String a(int i10) {
        Object objOpt = this.f64941a.opt(String.valueOf(i10));
        if (objOpt != null) {
            return objOpt.toString();
        }
        return null;
    }

    public mh(JSONObject jSONObject) {
        this.f64941a = jSONObject;
    }
}

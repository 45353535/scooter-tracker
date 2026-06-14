package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5146hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f77307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y7 f77308c;

    public C5146hf(String str, JSONObject jSONObject, Y7 y72) {
        this.f77306a = str;
        this.f77307b = jSONObject;
        this.f77308c = y72;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f77306a + "', additionalParams=" + this.f77307b + ", source=" + this.f77308c + '}';
    }
}

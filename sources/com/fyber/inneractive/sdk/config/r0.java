package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.c1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f20435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f20436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p0 f20437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f20438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f20439g;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "id", this.f20433a);
        c1.a(jSONObject, "spotId", this.f20434b);
        c1.a(jSONObject, "display", this.f20435c);
        c1.a(jSONObject, "monitor", this.f20436d);
        c1.a(jSONObject, "native", this.f20437e);
        c1.a(jSONObject, "video", this.f20438f);
        c1.a(jSONObject, "viewability", this.f20439g);
        return jSONObject.toString();
    }
}

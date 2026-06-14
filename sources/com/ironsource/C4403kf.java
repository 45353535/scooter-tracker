package com.ironsource;

import com.ironsource.C4240b4;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4403kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f43477a;

    public C4403kf(JSONObject jSONObject) {
        this.f43477a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.f43477a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f43477a.optBoolean(C4240b4.a.f42510o, false);
    }

    public boolean c() {
        return this.f43477a.optBoolean(C4240b4.a.f42511p, false);
    }

    public boolean d() {
        return this.f43477a.optBoolean(C4240b4.a.f42507l, false);
    }

    public boolean e() {
        return this.f43477a.optBoolean(C4240b4.a.f42509n, false);
    }
}

package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f40926c;

    public Fe(String str, String str2, JSONObject jSONObject) {
        this.f40924a = str;
        this.f40925b = str2;
        this.f40926c = jSONObject;
    }

    public JSONObject a() {
        return this.f40926c;
    }

    public String b() {
        return this.f40925b;
    }

    public String c() {
        return this.f40924a;
    }
}

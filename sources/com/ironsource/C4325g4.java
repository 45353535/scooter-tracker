package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4325g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f43147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f43149d;

    public C4325g4(String str) {
        this.f43146a = str;
    }

    public String a() {
        return this.f43149d;
    }

    public String b() {
        return this.f43146a;
    }

    public JSONObject c() {
        return this.f43147b;
    }

    public String d() {
        return this.f43148c;
    }

    public C4325g4(String str, JSONObject jSONObject) {
        this.f43146a = str;
        this.f43147b = jSONObject;
    }

    public C4325g4(String str, String str2, String str3) {
        this.f43146a = str;
        this.f43148c = str2;
        this.f43149d = str3;
    }

    public C4325g4(String str, JSONObject jSONObject, String str2, String str3) {
        this.f43146a = str;
        this.f43147b = jSONObject;
        this.f43148c = str2;
        this.f43149d = str3;
    }
}

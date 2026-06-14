package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4405l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IronSource.a f43496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NetworkSettings f43498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f43501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f43502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f43504i;

    public C4405l0(IronSource.a aVar, String str, int i10, JSONObject jSONObject, String str2, int i11, String str3, NetworkSettings networkSettings, int i12) {
        this.f43496a = aVar;
        this.f43497b = str;
        this.f43500e = i10;
        this.f43501f = jSONObject;
        this.f43502g = str2;
        this.f43503h = i11;
        this.f43504i = str3;
        this.f43498c = networkSettings;
        this.f43499d = i12;
    }

    public IronSource.a a() {
        return this.f43496a;
    }

    public String b() {
        return this.f43504i;
    }

    public String c() {
        return this.f43502g;
    }

    public int d() {
        return this.f43503h;
    }

    public JSONObject e() {
        return this.f43501f;
    }

    public int f() {
        return this.f43499d;
    }

    public NetworkSettings g() {
        return this.f43498c;
    }

    public int h() {
        return this.f43500e;
    }

    public String i() {
        return this.f43497b;
    }
}

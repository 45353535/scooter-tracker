package com.mbridge.msdk.mbbanner.common.data;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49317c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49319e;

    public b(String str, String str2, int i10, int i11) {
        this.f49315a = str;
        this.f49316b = str2;
        this.f49318d = i10;
        this.f49319e = i11;
    }

    public void a(int i10) {
        this.f49318d = i10;
    }

    public void b(String str) {
        this.f49316b = str;
    }

    public int c() {
        return this.f49318d;
    }

    public String d() {
        return this.f49316b;
    }

    public String a() {
        return this.f49317c;
    }

    public int b() {
        return this.f49319e;
    }

    public void a(String str) {
        this.f49317c = str;
    }
}

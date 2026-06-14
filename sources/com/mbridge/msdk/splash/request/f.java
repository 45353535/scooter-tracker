package com.mbridge.msdk.splash.request;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50866e;

    public void a(String str) {
        this.f50863b = str;
    }

    public int b() {
        return this.f50865d;
    }

    public int c() {
        return this.f50864c;
    }

    public int d() {
        return this.f50862a;
    }

    public String e() {
        return this.f50863b;
    }

    @NonNull
    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f50862a + ", session_id='" + this.f50863b + "', offset=" + this.f50864c + ", expectWidth=" + this.f50865d + ", expectHeight=" + this.f50866e + '}';
    }

    public int a() {
        return this.f50866e;
    }

    public void b(int i10) {
        this.f50865d = i10;
    }

    public void c(int i10) {
        this.f50864c = i10;
    }

    public void d(int i10) {
        this.f50862a = i10;
    }

    public void a(int i10) {
        this.f50866e = i10;
    }
}

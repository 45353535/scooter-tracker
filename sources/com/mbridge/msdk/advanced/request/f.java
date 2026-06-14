package com.mbridge.msdk.advanced.request;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46397e;

    public void a(String str) {
        this.f46394b = str;
    }

    public int b() {
        return this.f46396d;
    }

    public int c() {
        return this.f46395c;
    }

    public int d() {
        return this.f46393a;
    }

    public String e() {
        return this.f46394b;
    }

    @NonNull
    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f46393a + ", session_id='" + this.f46394b + "', offset=" + this.f46395c + ", expectWidth=" + this.f46396d + ", expectHeight=" + this.f46397e + '}';
    }

    public int a() {
        return this.f46397e;
    }

    public void b(int i10) {
        this.f46396d = i10;
    }

    public void c(int i10) {
        this.f46395c = i10;
    }

    public void d(int i10) {
        this.f46393a = i10;
    }

    public void a(int i10) {
        this.f46397e = i10;
    }
}

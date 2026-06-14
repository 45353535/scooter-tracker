package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4312f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43100c;

    public C4312f8() {
        this.f43098a = 0;
        this.f43099b = 0;
        this.f43100c = "";
    }

    public int a() {
        return this.f43099b;
    }

    public String b() {
        return this.f43100c;
    }

    public int c() {
        return this.f43098a;
    }

    public boolean d() {
        return this.f43099b > 0 && this.f43098a > 0;
    }

    public boolean e() {
        return this.f43099b == 0 && this.f43098a == 0;
    }

    public String toString() {
        return this.f43100c;
    }

    public C4312f8(int i10, int i11, String str) {
        this.f43098a = i10;
        this.f43099b = i11;
        this.f43100c = str;
    }
}

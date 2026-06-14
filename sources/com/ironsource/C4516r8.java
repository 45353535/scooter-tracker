package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4516r8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44823c = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44825b;

    public C4516r8(int i10, String str) {
        this.f44825b = i10;
        this.f44824a = str == null ? "" : str;
    }

    public int a() {
        return this.f44825b;
    }

    public String b() {
        return this.f44824a;
    }

    public String toString() {
        return "error - code:" + this.f44825b + ", message:" + this.f44824a;
    }
}

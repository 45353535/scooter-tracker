package com.my.tracker.obfuscated;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f61872b;

    public w(int i10) {
        this.f61871a = i10;
        g();
    }

    @Override // com.my.tracker.obfuscated.n2, com.my.tracker.obfuscated.e2
    public int a() {
        return this.f61871a;
    }

    @Override // com.my.tracker.obfuscated.u, com.my.tracker.obfuscated.v
    public int d() {
        return this.f61872b;
    }

    @Override // com.my.tracker.obfuscated.u
    public void f() {
        this.f61872b++;
    }

    public void g() {
        this.f61872b = 0;
    }

    public String toString() {
        return "[CountBased TS] id = " + this.f61871a + ", count = " + this.f61872b;
    }
}

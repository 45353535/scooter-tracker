package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public class y9 extends t6 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f61106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f61107j;

    public y9(String str, float f10, int i10, boolean z10) {
        super("playheadViewabilityValue", str, f10, i10, z10, 2);
    }

    public static y9 a(String str, float f10, int i10, boolean z10) {
        return new y9(str, f10, i10, z10);
    }

    public void b(int i10) {
        this.f61106i = i10;
    }

    public int f() {
        return this.f61107j;
    }

    public int g() {
        return this.f61106i;
    }

    public void a(int i10) {
        this.f61107j = i10;
    }
}

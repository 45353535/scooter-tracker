package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public class x9 extends ya {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f61048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f61049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f61050f;

    public x9(String str) {
        super("playheadTimerValue", str);
        this.f61050f = 1;
    }

    public static x9 a(String str) {
        return new x9(str);
    }

    public void b(int i10) {
        this.f61050f = i10;
    }

    public void c(int i10) {
        this.f61048d = i10;
    }

    public int d() {
        return this.f61049e;
    }

    public int e() {
        return this.f61050f;
    }

    public int f() {
        return this.f61048d;
    }

    public void a(int i10) {
        this.f61049e = i10;
    }
}

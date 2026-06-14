package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public class t4 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e4 f60833b;

    public static t4 d() {
        return new t4();
    }

    public void a(e4 e4Var) {
        this.f60833b = e4Var;
    }

    public e4 c() {
        return this.f60833b;
    }

    @Override // com.my.target.t
    public int a() {
        return this.f60833b == null ? 0 : 1;
    }
}

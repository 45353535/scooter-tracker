package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public class u3 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r3 f60888b;

    public static u3 d() {
        return new u3();
    }

    public void a(r3 r3Var) {
        this.f60888b = r3Var;
    }

    public r3 c() {
        return this.f60888b;
    }

    @Override // com.my.target.t
    public int a() {
        return this.f60888b != null ? 1 : 0;
    }
}

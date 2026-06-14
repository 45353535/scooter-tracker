package com.my.target;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes11.dex */
public class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f60494c = new p(o.f60433i);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f60495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60496b;

    public p(o oVar) {
        this.f60495a = oVar;
        this.f60496b = "";
    }

    public static p a(o oVar) {
        return new p(oVar);
    }

    public void b(int i10, String str) {
        this.f60495a.c(0, i10, b(str));
    }

    public p c(int i10) {
        return new p(this.f60495a, this.f60496b + C4240b4.j.f42672d + i10 + C4240b4.j.f42674e);
    }

    public void d(int i10) {
        this.f60495a.c(0, i10, b(""));
    }

    public p a(String str) {
        if (!this.f60496b.isEmpty()) {
            str = this.f60496b + "." + str;
        }
        return new p(this.f60495a, str);
    }

    public void b(int i10) {
        this.f60495a.b(0, i10, b(""));
    }

    public final String b(String str) {
        String str2 = this.f60496b;
        if (str2.isEmpty()) {
            return str;
        }
        if (str.isEmpty()) {
            return str2;
        }
        return str2 + ": " + str;
    }

    public p(o oVar, String str) {
        this.f60495a = oVar;
        this.f60496b = str;
    }

    public i0 a(h0 h0Var) {
        return i0.a(h0Var, this.f60496b, true);
    }

    public void a(int i10) {
        this.f60495a.a(0, i10, b(""));
    }

    public void a(int i10, String str) {
        this.f60495a.a(0, i10, b(str));
    }
}

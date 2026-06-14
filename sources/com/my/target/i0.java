package com.my.target;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes11.dex */
public class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static i0 f59838d = new i0(h0.f59787e, "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f59839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59841c;

    public i0(h0 h0Var, String str, boolean z10) {
        this.f59839a = h0Var;
        this.f59840b = str;
        this.f59841c = z10;
    }

    public static i0 a(h0 h0Var, String str, boolean z10) {
        return new i0(h0Var, str, z10);
    }

    public i0 b(int i10) {
        return new i0(this.f59839a, this.f59840b + C4240b4.j.f42672d + i10 + C4240b4.j.f42674e, this.f59841c);
    }

    public void c(int i10) {
        this.f59839a.c(0, i10, b(""));
    }

    public i0 a(String str) {
        if (!this.f59840b.isEmpty()) {
            str = this.f59840b + "." + str;
        }
        return new i0(this.f59839a, str, this.f59841c);
    }

    public i0 b() {
        return new i0(this.f59839a, this.f59840b, false);
    }

    public void b(int i10, String str) {
        this.f59839a.c(0, i10, b(str));
    }

    public boolean a() {
        return this.f59841c;
    }

    public final String b(String str) {
        String str2 = this.f59840b;
        if (str.isEmpty()) {
            return str2;
        }
        return str2 + ": " + str;
    }

    public void a(int i10) {
        this.f59839a.a(0, i10, b(""));
    }

    public void a(int i10, String str) {
        this.f59839a.a(0, i10, b(str));
    }
}

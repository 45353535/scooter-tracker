package com.my.tracker.obfuscated;

import androidx.collection.SieveCacheKt;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u1 f61565a = new v1(0, SieveCacheKt.NodeMetaAndPreviousMask);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final d2 f61566b = new f2(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f61567c = 0;

    public void a(int i10) {
        if (i10 == 0) {
            x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
            this.f61567c = 0;
            return;
        }
        x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
        this.f61567c = 1;
    }

    public void b(long j10) {
        if (this.f61567c == 1) {
            this.f61565a.b(j10);
        }
    }

    public void c(long j10) {
        this.f61565a.b(j10);
    }

    public void d(long j10) {
        f(j10);
    }

    public void e(long j10) {
        if (this.f61567c == 1) {
            f(j10);
        }
    }

    void f(long j10) {
        long jE = j10 - this.f61565a.e();
        if (x2.a()) {
            long jB = this.f61567c == 3 ? this.f61566b.b() : this.f61566b.c();
            x2.a("TimeSpentCore: AppTimeManager: " + a() + "slicing app TimeSpent, " + jB + "(existed ms) + " + jE + "(add ms) = " + (jB + jE) + "(total ms), timestamp = " + j10);
        }
        int i10 = this.f61567c;
        if (i10 == 1) {
            this.f61566b.a(jE);
        } else if (i10 != 3) {
            x2.a("TimeSpentCore: AppTimeManager: trying to slice app time, but now is useless background state - skip");
        } else {
            this.f61566b.c(jE);
        }
    }

    public void g(long j10) {
        f(j10);
        x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
        this.f61567c = 0;
    }

    public void h(long j10) {
        this.f61565a.b(j10);
        x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
        this.f61567c = 1;
    }

    public boolean c() {
        return this.f61567c == 3;
    }

    public void d() {
        x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[FOREGROUND]"));
        this.f61567c = 3;
    }

    public boolean b() {
        int i10 = this.f61567c;
        return i10 == 1 || i10 == 0;
    }

    public e2 a(long j10) {
        x2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: start collecting app TimeSpent");
        if (this.f61567c != 0) {
            f(j10);
            this.f61565a.b(j10);
        }
        d2 d2VarM7436clone = this.f61566b.m7436clone();
        this.f61566b.g();
        x2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: collected app TimeSpent (foregroundMs = " + d2VarM7436clone.b() + ", usefulBackgroundMs = " + d2VarM7436clone.c() + ")");
        if (d2VarM7436clone.b() == 0 && d2VarM7436clone.c() == 0) {
            return null;
        }
        return d2VarM7436clone;
    }

    private String a(String str, String str2) {
        return "app state changed " + str + "-> " + str2;
    }

    private String a() {
        int i10 = this.f61567c;
        if (i10 == 0) {
            return "[BACKGROUND(useless)] ";
        }
        if (i10 == 1) {
            return "[BACKGROUND(useful)] ";
        }
        if (i10 != 3) {
            return "";
        }
        return "[FOREGROUND] ";
    }
}

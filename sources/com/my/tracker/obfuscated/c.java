package com.my.tracker.obfuscated;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class c extends g2 {
    public void a(int i10, long j10, boolean z10) {
        this.f61531a.put(i10, new v1(i10, j10));
        x2.c("TimeSpent: " + a(z10) + "registered new anytime TimeSpent with id = " + i10);
    }

    public void b(int i10, long j10, boolean z10) throws Exception {
        u1 u1Var = (u1) this.f61531a.get(i10);
        if (u1Var == null) {
            x2.c("TimeSpent: " + a(z10) + "can't stop anytime TimeSpent with id = " + i10 + " (reason: not found)");
            throw new Exception();
        }
        a(j10, u1Var, z10);
        this.f61531a.remove(i10);
        x2.c("TimeSpent: " + a(z10) + "stopped anytime TimeSpent, id = " + i10);
    }

    public void c(long j10) {
        x2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(true) + "updating all running anytime TimeSpents timestamps (size = " + this.f61531a.size() + ", new timestamp = " + j10 + ")");
        a(j10);
    }

    public void d(long j10) {
        b(j10, true);
    }

    public void e(long j10) {
        b(j10, false);
    }

    public ArrayList a(long j10, boolean z10) {
        x2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z10) + "onTick: start collecting anytime TimeSpents");
        b(j10, z10);
        a(j10);
        ArrayList arrayListA = a();
        this.f61532b.clear();
        x2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z10) + "onTick: collected " + arrayListA.size() + " anytime TimeSpents");
        return arrayListA;
    }

    public void b(long j10) {
        x2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(false) + "updating all running anytime TimeSpents timestamps (size = " + this.f61531a.size() + ", new timestamp = " + j10 + ")");
        a(j10);
    }

    void a(long j10, u1 u1Var, boolean z10) {
        d2 d2VarA = a(u1Var.a());
        long jE = j10 - u1Var.e();
        if (x2.a()) {
            long jB = z10 ? d2VarA.b() : d2VarA.c();
            x2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z10) + "slicing anytime TimeSpent, id = " + u1Var.a() + ", " + jB + "(existed ms) + " + jE + "(add ms) = " + (jB + jE) + "(total ms), timestamp = " + j10);
        }
        if (z10) {
            d2VarA.c(jE);
        } else {
            d2VarA.a(jE);
        }
    }

    void b(long j10, boolean z10) {
        x2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z10) + "slicing all running anytime TimeSpents (size = " + this.f61531a.size() + ")");
        for (int i10 = 0; i10 < this.f61531a.size(); i10++) {
            a(j10, (u1) this.f61531a.valueAt(i10), z10);
        }
    }
}

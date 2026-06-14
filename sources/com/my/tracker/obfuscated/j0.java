package com.my.tracker.obfuscated;

import androidx.collection.SieveCacheKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class j0 extends g2 {
    public void a(int i10, long j10, boolean z10) {
        if (!z10) {
            j10 = SieveCacheKt.NodeMetaAndPreviousMask;
        }
        this.f61531a.put(i10, new v1(i10, j10));
        x2.c("TimeSpent: " + a(z10) + "registered new foreground TimeSpent with id = " + i10);
    }

    public void b(long j10) {
    }

    public void c(long j10) {
        x2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "updating all running foreground TimeSpents timestamps (size = " + this.f61531a.size() + ", new timestamp = " + j10 + ")");
        a(j10);
    }

    public void d(long j10) {
        f(j10);
    }

    public void e(long j10) {
    }

    void f(long j10) {
        x2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "slicing all running foreground TimeSpents (size = " + this.f61531a.size() + ")");
        for (int i10 = 0; i10 < this.f61531a.size(); i10++) {
            a(j10, (u1) this.f61531a.valueAt(i10));
        }
    }

    public void b(int i10, long j10, boolean z10) throws Exception {
        u1 u1Var = (u1) this.f61531a.get(i10);
        if (u1Var == null) {
            x2.c("TimeSpent: " + a(z10) + " can't stop foreground TimeSpent with id = " + i10 + " (reason: not found)");
            throw new Exception();
        }
        if (z10) {
            a(j10, u1Var);
        }
        this.f61531a.remove(i10);
        x2.c("TimeSpent: " + a(z10) + "stopped foreground TimeSpent, id = " + i10);
    }

    public ArrayList a(long j10, boolean z10) {
        x2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(z10) + "onTick: start collecting foreground TimeSpents");
        if (z10) {
            f(j10);
            a(j10);
        }
        ArrayList arrayListA = a();
        this.f61532b.clear();
        x2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(z10) + "onTick: collected " + arrayListA.size() + " foreground TimeSpents");
        return arrayListA;
    }

    void a(long j10, u1 u1Var) {
        d2 d2VarA = a(u1Var.a());
        long jE = j10 - u1Var.e();
        if (x2.a()) {
            long jB = d2VarA.b();
            x2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "slicing foreground TimeSpent, id = " + u1Var.a() + ", " + jB + "(existed ms) + " + jE + "(add ms) = " + (jB + jE) + "(total ms), timestamp = " + j10);
        }
        d2VarA.c(jE);
    }
}

package com.my.tracker.obfuscated;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r2 {
    public static boolean a(q2 q2Var) {
        e2 e2VarA = q2Var.a();
        if (e2VarA != null && e2VarA.b() > 0) {
            return true;
        }
        e2[] e2VarArrD = q2Var.d();
        if (e2VarArrD != null && e2VarArrD.length > 0) {
            return true;
        }
        v[] vVarArrB = q2Var.b();
        return vVarArrB != null && vVarArrB.length > 0;
    }

    private static boolean b(q2 q2Var) {
        e2 e2VarA = q2Var.a();
        if (e2VarA == null) {
            return true;
        }
        return !(((e2VarA.c() > 0L ? 1 : (e2VarA.c() == 0L ? 0 : -1)) > 0) && (q2Var.d() == null || q2Var.d().length == 0)) && e2VarA.a() == 0;
    }

    public static boolean c(q2 q2Var) {
        if (a(q2Var.c())) {
            return b(q2Var);
        }
        return false;
    }

    private static boolean a(long j10) {
        if (j10 > 0) {
            return true;
        }
        x2.a("TimeSpentTickDtoValidator: dto timestamp should be > 0, actual = " + j10);
        return false;
    }
}

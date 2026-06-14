package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kw implements g63 {
    public static sw b(df1 df1Var, cw cwVar) {
        int iOrdinal;
        String str = cwVar.f109618b;
        if (str == null) {
            return null;
        }
        try {
            iOrdinal = cwVar.ordinal();
        } catch (ClassCastException unused) {
        }
        if (iOrdinal == 0) {
            return new ow(((ff1) df1Var).c(str));
        }
        if (iOrdinal == 1) {
            return new pw(((ff1) df1Var).c(str));
        }
        if (iOrdinal == 2) {
            return new nw(((ff1) df1Var).a(str, false));
        }
        if (iOrdinal == 3) {
            return new qw(((ff1) df1Var).c(str));
        }
        if (iOrdinal == 4) {
            return new rw(((ff1) df1Var).c(str));
        }
        if (iOrdinal == 5) {
            return null;
        }
        throw new lf.m();
    }

    @Override // yads.g63
    public final sw a(df1 df1Var, String str) {
        cw cwVar;
        ff1 ff1Var = (ff1) df1Var;
        if (!ff1Var.a(str)) {
            str = null;
        }
        if (str != null) {
            cw.f109616d.getClass();
            cw[] cwVarArrValues = cw.values();
            int length = cwVarArrValues.length;
            for (int i10 = 0; i10 < length; i10++) {
                cwVar = cwVarArrValues[i10];
                if (Intrinsics.areEqual(cwVar.f109618b, str)) {
                    break;
                }
            }
            cwVar = null;
        } else {
            cwVar = null;
        }
        if (cwVar != null) {
            return b(ff1Var, cwVar);
        }
        return null;
    }

    @Override // yads.g63
    public final sw a(df1 df1Var, cw cwVar) {
        String str = cwVar.f109618b;
        if (str == null || !((ff1) df1Var).a(str)) {
            cwVar = null;
        }
        if (cwVar != null) {
            return b(df1Var, cwVar);
        }
        return null;
    }
}

package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lw implements g63 {
    public static sw b(df1 df1Var, cw cwVar) {
        String str = cwVar.f109619c;
        try {
            int iOrdinal = cwVar.ordinal();
            if (iOrdinal == 0) {
                return new ow(((ff1) df1Var).c(str));
            }
            boolean z10 = true;
            if (iOrdinal == 1) {
                int iA = ((ff1) df1Var).a(-1, str);
                Integer numValueOf = Integer.valueOf(iA);
                if (iA == -1) {
                    numValueOf = null;
                }
                return new pw(numValueOf != null ? String.valueOf(numValueOf.intValue()) : null);
            }
            if (iOrdinal == 2) {
                if (((ff1) df1Var).a(-1, str) == -1) {
                    z10 = false;
                }
                return new nw(z10);
            }
            if (iOrdinal == 3) {
                return new qw(((ff1) df1Var).c(str));
            }
            if (iOrdinal == 4) {
                return new rw(((ff1) df1Var).c(str));
            }
            if (iOrdinal == 5) {
                return new mw(((ff1) df1Var).c(str));
            }
            throw new lf.m();
        } catch (ClassCastException unused) {
            return null;
        }
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
                if (Intrinsics.areEqual(cwVar.f109619c, str)) {
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
        ff1 ff1Var = (ff1) df1Var;
        if (!ff1Var.a(cwVar.f109619c)) {
            cwVar = null;
        }
        if (cwVar != null) {
            return b(ff1Var, cwVar);
        }
        return null;
    }
}

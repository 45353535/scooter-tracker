package com.my.target;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class ta extends s {
    public static ta a() {
        return new ta();
    }

    @Override // com.my.target.s
    public ua a(ua uaVar, j jVar, n nVar, Context context) {
        na naVarC = uaVar.c();
        if (naVarC == null) {
            x5 x5VarB = uaVar.b();
            if (x5VarB == null || !x5VarB.b()) {
                nVar.a(m.f60113r);
                return null;
            }
        } else {
            c cVarA = naVarC.a();
            if (cVarA != null) {
                a3.a(cVarA.c()).a(jVar.i(), naVarC.r()).a(context);
                return uaVar;
            }
        }
        return uaVar;
    }
}

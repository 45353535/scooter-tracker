package o0;

import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96256a = c.a.a("nm", "p", "s", "r", "hd");

    static l0.l a(p0.c cVar, d0.i iVar) {
        String strNextString = null;
        k0.o oVarB = null;
        k0.f fVarI = null;
        k0.b bVarE = null;
        boolean zM = false;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96256a);
            if (iQ == 0) {
                strNextString = cVar.nextString();
            } else if (iQ == 1) {
                oVarB = a.b(cVar, iVar);
            } else if (iQ == 2) {
                fVarI = d.i(cVar, iVar);
            } else if (iQ == 3) {
                bVarE = d.e(cVar, iVar);
            } else if (iQ != 4) {
                cVar.skipValue();
            } else {
                zM = cVar.m();
            }
        }
        return new l0.l(strNextString, oVarB, fVarI, bVarE, zM);
    }
}

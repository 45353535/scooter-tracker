package o0;

import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96260a = c.a.a("nm", "p", "s", "hd", "d");

    static l0.b a(p0.c cVar, d0.i iVar, int i10) {
        boolean z10 = i10 == 3;
        boolean zM = false;
        String strNextString = null;
        k0.o oVarB = null;
        k0.f fVarI = null;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96260a);
            if (iQ == 0) {
                strNextString = cVar.nextString();
            } else if (iQ == 1) {
                oVarB = a.b(cVar, iVar);
            } else if (iQ == 2) {
                fVarI = d.i(cVar, iVar);
            } else if (iQ == 3) {
                zM = cVar.m();
            } else if (iQ != 4) {
                cVar.s();
                cVar.skipValue();
            } else {
                z10 = cVar.nextInt() == 3;
            }
        }
        return new l0.b(strNextString, oVarB, fVarI, z10, zM);
    }
}

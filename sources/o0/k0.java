package o0;

import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static c.a f96283a = c.a.a("nm", "ind", "ks", "hd");

    static l0.r a(p0.c cVar, d0.i iVar) {
        String strNextString = null;
        int iNextInt = 0;
        boolean zM = false;
        k0.h hVarK = null;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96283a);
            if (iQ == 0) {
                strNextString = cVar.nextString();
            } else if (iQ == 1) {
                iNextInt = cVar.nextInt();
            } else if (iQ == 2) {
                hVarK = d.k(cVar, iVar);
            } else if (iQ != 3) {
                cVar.skipValue();
            } else {
                zM = cVar.m();
            }
        }
        return new l0.r(strNextString, iNextInt, hVarK, zM);
    }
}

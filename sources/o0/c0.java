package o0;

import l0.k;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96255a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    static l0.k a(p0.c cVar, d0.i iVar, int i10) {
        boolean zM = false;
        boolean z10 = i10 == 3;
        String strNextString = null;
        k.a aVarG = null;
        k0.b bVarF = null;
        k0.o oVarB = null;
        k0.b bVarF2 = null;
        k0.b bVarE = null;
        k0.b bVarE2 = null;
        k0.b bVarF3 = null;
        k0.b bVarF4 = null;
        while (cVar.hasNext()) {
            switch (cVar.q(f96255a)) {
                case 0:
                    strNextString = cVar.nextString();
                    break;
                case 1:
                    aVarG = k.a.g(cVar.nextInt());
                    break;
                case 2:
                    bVarF = d.f(cVar, iVar, false);
                    break;
                case 3:
                    oVarB = a.b(cVar, iVar);
                    break;
                case 4:
                    bVarF2 = d.f(cVar, iVar, false);
                    break;
                case 5:
                    bVarE2 = d.e(cVar, iVar);
                    break;
                case 6:
                    bVarF4 = d.f(cVar, iVar, false);
                    break;
                case 7:
                    bVarE = d.e(cVar, iVar);
                    break;
                case 8:
                    bVarF3 = d.f(cVar, iVar, false);
                    break;
                case 9:
                    zM = cVar.m();
                    break;
                case 10:
                    z10 = cVar.nextInt() == 3;
                    break;
                default:
                    cVar.s();
                    cVar.skipValue();
                    break;
            }
        }
        return new l0.k(strNextString, aVarG, bVarF, oVarB, bVarF2, bVarE, bVarE2, bVarF3, bVarF4, zM, z10);
    }
}

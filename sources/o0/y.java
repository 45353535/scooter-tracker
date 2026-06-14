package o0;

import l0.j;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96313a = c.a.a("nm", "mm", "hd");

    static l0.j a(p0.c cVar) {
        String strNextString = null;
        boolean zM = false;
        j.a aVarG = null;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96313a);
            if (iQ == 0) {
                strNextString = cVar.nextString();
            } else if (iQ == 1) {
                aVarG = j.a.g(cVar.nextInt());
            } else if (iQ != 2) {
                cVar.s();
                cVar.skipValue();
            } else {
                zM = cVar.m();
            }
        }
        return new l0.j(strNextString, aVarG, zM);
    }
}

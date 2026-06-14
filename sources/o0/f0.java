package o0;

import p0.c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96261a = c.a.a("nm", "r", "hd");

    static l0.n a(p0.c cVar, d0.i iVar) {
        boolean zM = false;
        String strNextString = null;
        k0.b bVarF = null;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96261a);
            if (iQ == 0) {
                strNextString = cVar.nextString();
            } else if (iQ == 1) {
                bVarF = d.f(cVar, iVar, true);
            } else if (iQ != 2) {
                cVar.skipValue();
            } else {
                zM = cVar.m();
            }
        }
        if (zM) {
            return null;
        }
        return new l0.n(strNextString, bVarF);
    }
}

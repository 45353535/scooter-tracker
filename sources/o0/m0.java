package o0;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import l0.t;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96289a = c.a.a("s", EidRequestBuilder.REQUEST_FIELD_EMAIL, "o", "nm", "m", "hd");

    static l0.t a(p0.c cVar, d0.i iVar) {
        String strNextString = null;
        t.a aVarG = null;
        k0.b bVarF = null;
        k0.b bVarF2 = null;
        k0.b bVarF3 = null;
        boolean zM = false;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96289a);
            if (iQ == 0) {
                bVarF = d.f(cVar, iVar, false);
            } else if (iQ == 1) {
                bVarF2 = d.f(cVar, iVar, false);
            } else if (iQ == 2) {
                bVarF3 = d.f(cVar, iVar, false);
            } else if (iQ == 3) {
                strNextString = cVar.nextString();
            } else if (iQ == 4) {
                aVarG = t.a.g(cVar.nextInt());
            } else if (iQ != 5) {
                cVar.skipValue();
            } else {
                zM = cVar.m();
            }
        }
        return new l0.t(strNextString, aVarG, bVarF, bVarF2, bVarF3, zM);
    }
}

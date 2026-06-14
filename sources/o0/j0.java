package o0;

import java.util.ArrayList;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96275a = c.a.a("nm", "hd", "it");

    static l0.q a(p0.c cVar, d0.i iVar) {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zM = false;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96275a);
            if (iQ == 0) {
                strNextString = cVar.nextString();
            } else if (iQ == 1) {
                zM = cVar.m();
            } else if (iQ != 2) {
                cVar.skipValue();
            } else {
                cVar.beginArray();
                while (cVar.hasNext()) {
                    l0.c cVarA = h.a(cVar, iVar);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                cVar.endArray();
            }
        }
        return new l0.q(strNextString, arrayList, zM);
    }
}

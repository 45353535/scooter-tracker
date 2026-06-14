package o0;

import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96257a = c.a.a("ef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c.a f96258b = c.a.a("ty", "v");

    private static l0.a a(p0.c cVar, d0.i iVar) {
        cVar.beginObject();
        l0.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (cVar.hasNext()) {
                int iQ = cVar.q(f96258b);
                if (iQ != 0) {
                    if (iQ != 1) {
                        cVar.s();
                        cVar.skipValue();
                    } else if (z10) {
                        aVar = new l0.a(d.e(cVar, iVar));
                    } else {
                        cVar.skipValue();
                    }
                } else if (cVar.nextInt() == 0) {
                    z10 = true;
                }
            }
            cVar.endObject();
            return aVar;
        }
    }

    static l0.a b(p0.c cVar, d0.i iVar) {
        l0.a aVar = null;
        while (cVar.hasNext()) {
            if (cVar.q(f96257a) != 0) {
                cVar.s();
                cVar.skipValue();
            } else {
                cVar.beginArray();
                while (cVar.hasNext()) {
                    l0.a aVarA = a(cVar, iVar);
                    if (aVarA != null) {
                        aVar = aVarA;
                    }
                }
                cVar.endArray();
            }
        }
        return aVar;
    }
}

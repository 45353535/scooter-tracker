package o0;

import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96290a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    static j0.c a(p0.c cVar) {
        cVar.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        float fNextDouble = 0.0f;
        String strNextString3 = null;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96290a);
            if (iQ == 0) {
                strNextString = cVar.nextString();
            } else if (iQ == 1) {
                strNextString3 = cVar.nextString();
            } else if (iQ == 2) {
                strNextString2 = cVar.nextString();
            } else if (iQ != 3) {
                cVar.s();
                cVar.skipValue();
            } else {
                fNextDouble = (float) cVar.nextDouble();
            }
        }
        cVar.endObject();
        return new j0.c(strNextString, strNextString3, strNextString2, fNextDouble);
    }
}

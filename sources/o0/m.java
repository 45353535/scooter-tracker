package o0;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96287a = c.a.a("ch", "size", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "style", "fFamily", "data");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c.a f96288b = c.a.a("shapes");

    static j0.d a(p0.c cVar, d0.i iVar) {
        ArrayList arrayList = new ArrayList();
        cVar.beginObject();
        double dNextDouble = 0.0d;
        String strNextString = null;
        String strNextString2 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96287a);
            if (iQ == 0) {
                cCharAt = cVar.nextString().charAt(0);
            } else if (iQ == 1) {
                dNextDouble2 = cVar.nextDouble();
            } else if (iQ == 2) {
                dNextDouble = cVar.nextDouble();
            } else if (iQ == 3) {
                strNextString = cVar.nextString();
            } else if (iQ == 4) {
                strNextString2 = cVar.nextString();
            } else if (iQ != 5) {
                cVar.s();
                cVar.skipValue();
            } else {
                cVar.beginObject();
                while (cVar.hasNext()) {
                    if (cVar.q(f96288b) != 0) {
                        cVar.s();
                        cVar.skipValue();
                    } else {
                        cVar.beginArray();
                        while (cVar.hasNext()) {
                            arrayList.add((l0.q) h.a(cVar, iVar));
                        }
                        cVar.endArray();
                    }
                }
                cVar.endObject();
            }
        }
        cVar.endObject();
        return new j0.d(arrayList, cCharAt, dNextDouble2, dNextDouble, strNextString, strNextString2);
    }
}

package o0;

import l0.i;

/* JADX INFO: loaded from: classes5.dex */
abstract class x {
    static l0.i a(p0.c cVar, d0.i iVar) {
        String strNextName;
        cVar.beginObject();
        i.a aVar = null;
        k0.h hVarK = null;
        k0.d dVarH = null;
        boolean zM = false;
        while (cVar.hasNext()) {
            strNextName = cVar.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "o":
                    dVarH = d.h(cVar, iVar);
                    break;
                case "pt":
                    hVarK = d.k(cVar, iVar);
                    break;
                case "inv":
                    zM = cVar.m();
                    break;
                case "mode":
                    String strNextString = cVar.nextString();
                    strNextString.getClass();
                    switch (strNextString) {
                        case "a":
                            aVar = i.a.MASK_MODE_ADD;
                            break;
                        case "i":
                            iVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = i.a.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            aVar = i.a.MASK_MODE_NONE;
                            break;
                        case "s":
                            aVar = i.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            q0.g.c("Unknown mask mode " + strNextName + ". Defaulting to Add.");
                            aVar = i.a.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    cVar.skipValue();
                    break;
            }
        }
        cVar.endObject();
        return new l0.i(aVar, hVarK, dVarH, zM);
    }
}

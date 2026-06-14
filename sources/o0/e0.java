package o0;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96259a = c.a.a("nm", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "o", "tr", "hd");

    static l0.m a(p0.c cVar, d0.i iVar) {
        String strNextString = null;
        k0.b bVarF = null;
        k0.b bVarF2 = null;
        k0.n nVarG = null;
        boolean zM = false;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96259a);
            if (iQ == 0) {
                strNextString = cVar.nextString();
            } else if (iQ == 1) {
                bVarF = d.f(cVar, iVar, false);
            } else if (iQ == 2) {
                bVarF2 = d.f(cVar, iVar, false);
            } else if (iQ == 3) {
                nVarG = c.g(cVar, iVar);
            } else if (iQ != 4) {
                cVar.skipValue();
            } else {
                zM = cVar.m();
            }
        }
        return new l0.m(strNextString, bVarF, bVarF2, nVarG, zM);
    }
}

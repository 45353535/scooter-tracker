package o0;

import android.graphics.Path;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.Collections;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96269a = c.a.a("nm", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "o", "fillEnabled", "r", "hd");

    static l0.p a(p0.c cVar, d0.i iVar) {
        k0.d dVar = null;
        String strNextString = null;
        k0.a aVarC = null;
        boolean zM = false;
        boolean zM2 = false;
        int iNextInt = 1;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96269a);
            if (iQ == 0) {
                strNextString = cVar.nextString();
            } else if (iQ == 1) {
                aVarC = d.c(cVar, iVar);
            } else if (iQ == 2) {
                dVar = d.h(cVar, iVar);
            } else if (iQ == 3) {
                zM = cVar.m();
            } else if (iQ == 4) {
                iNextInt = cVar.nextInt();
            } else if (iQ != 5) {
                cVar.s();
                cVar.skipValue();
            } else {
                zM2 = cVar.m();
            }
        }
        if (dVar == null) {
            dVar = new k0.d(Collections.singletonList(new r0.a(100)));
        }
        return new l0.p(strNextString, zM, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarC, dVar, zM2);
    }
}

package o0;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.Collections;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96249a = c.a.a("s", "a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c.a f96250b = c.a.a("s", EidRequestBuilder.REQUEST_FIELD_EMAIL, "o", "r");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c.a f96251c = c.a.a("fc", "sc", "sw", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "o");

    public static k0.k a(p0.c cVar, d0.i iVar) {
        cVar.beginObject();
        k0.m mVarC = null;
        k0.l lVarB = null;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96249a);
            if (iQ == 0) {
                lVarB = b(cVar, iVar);
            } else if (iQ != 1) {
                cVar.s();
                cVar.skipValue();
            } else {
                mVarC = c(cVar, iVar);
            }
        }
        cVar.endObject();
        return new k0.k(mVarC, lVarB);
    }

    private static k0.l b(p0.c cVar, d0.i iVar) {
        cVar.beginObject();
        k0.d dVar = null;
        k0.d dVarH = null;
        k0.d dVarH2 = null;
        l0.u uVar = null;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96250b);
            if (iQ == 0) {
                dVar = d.h(cVar, iVar);
            } else if (iQ == 1) {
                dVarH = d.h(cVar, iVar);
            } else if (iQ == 2) {
                dVarH2 = d.h(cVar, iVar);
            } else if (iQ != 3) {
                cVar.s();
                cVar.skipValue();
            } else {
                int iNextInt = cVar.nextInt();
                if (iNextInt == 1 || iNextInt == 2) {
                    uVar = iNextInt == 1 ? l0.u.PERCENT : l0.u.INDEX;
                } else {
                    iVar.a("Unsupported text range units: " + iNextInt);
                    uVar = l0.u.INDEX;
                }
            }
        }
        cVar.endObject();
        if (dVar == null && dVarH != null) {
            dVar = new k0.d(Collections.singletonList(new r0.a(0)));
        }
        return new k0.l(dVar, dVarH, dVarH2, uVar);
    }

    private static k0.m c(p0.c cVar, d0.i iVar) {
        cVar.beginObject();
        k0.a aVarC = null;
        k0.a aVarC2 = null;
        k0.b bVarE = null;
        k0.b bVarE2 = null;
        k0.d dVarH = null;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96251c);
            if (iQ == 0) {
                aVarC = d.c(cVar, iVar);
            } else if (iQ == 1) {
                aVarC2 = d.c(cVar, iVar);
            } else if (iQ == 2) {
                bVarE = d.e(cVar, iVar);
            } else if (iQ == 3) {
                bVarE2 = d.e(cVar, iVar);
            } else if (iQ != 4) {
                cVar.s();
                cVar.skipValue();
            } else {
                dVarH = d.h(cVar, iVar);
            }
        }
        cVar.endObject();
        return new k0.m(aVarC, aVarC2, bVarE, bVarE2, dVarH);
    }
}

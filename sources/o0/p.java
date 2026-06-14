package o0;

import android.graphics.Path;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.Collections;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96292a = c.a.a("nm", "g", "o", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "s", EidRequestBuilder.REQUEST_FIELD_EMAIL, "r", "hd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c.a f96293b = c.a.a("p", CampaignEx.JSON_KEY_AD_K);

    static l0.e a(p0.c cVar, d0.i iVar) {
        k0.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        l0.g gVar = null;
        k0.c cVarG = null;
        k0.f fVarI = null;
        k0.f fVarI2 = null;
        boolean zM = false;
        while (cVar.hasNext()) {
            switch (cVar.q(f96292a)) {
                case 0:
                    strNextString = cVar.nextString();
                    break;
                case 1:
                    cVar.beginObject();
                    int iNextInt = -1;
                    while (cVar.hasNext()) {
                        int iQ = cVar.q(f96293b);
                        if (iQ == 0) {
                            iNextInt = cVar.nextInt();
                        } else if (iQ != 1) {
                            cVar.s();
                            cVar.skipValue();
                        } else {
                            cVarG = d.g(cVar, iVar, iNextInt);
                        }
                    }
                    cVar.endObject();
                    break;
                case 2:
                    dVar = d.h(cVar, iVar);
                    break;
                case 3:
                    gVar = cVar.nextInt() == 1 ? l0.g.LINEAR : l0.g.RADIAL;
                    break;
                case 4:
                    fVarI = d.i(cVar, iVar);
                    break;
                case 5:
                    fVarI2 = d.i(cVar, iVar);
                    break;
                case 6:
                    fillType = cVar.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zM = cVar.m();
                    break;
                default:
                    cVar.s();
                    cVar.skipValue();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new k0.d(Collections.singletonList(new r0.a(100)));
        }
        return new l0.e(strNextString, gVar, fillType, cVarG, dVar, fVarI, fVarI2, null, null, zM);
    }
}

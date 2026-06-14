package o0;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Collections;
import l0.s;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96294a = c.a.a("nm", "g", "o", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "s", EidRequestBuilder.REQUEST_FIELD_EMAIL, POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c.a f96295b = c.a.a("p", CampaignEx.JSON_KEY_AD_K);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c.a f96296c = c.a.a("n", "v");

    static l0.f a(p0.c cVar, d0.i iVar) {
        l0.g gVar;
        k0.d dVar;
        ArrayList arrayList = new ArrayList();
        l0.g gVar2 = null;
        String strNextString = null;
        k0.c cVarG = null;
        k0.f fVarI = null;
        k0.f fVarI2 = null;
        k0.b bVarE = null;
        s.a aVar = null;
        s.b bVar = null;
        k0.b bVar2 = null;
        float fNextDouble = 0.0f;
        boolean zM = false;
        k0.d dVarH = null;
        while (cVar.hasNext()) {
            switch (cVar.q(f96294a)) {
                case 0:
                    strNextString = cVar.nextString();
                    break;
                case 1:
                    gVar = gVar2;
                    dVar = dVarH;
                    cVar.beginObject();
                    int iNextInt = -1;
                    while (cVar.hasNext()) {
                        int iQ = cVar.q(f96295b);
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
                    dVarH = dVar;
                    gVar2 = gVar;
                    break;
                case 2:
                    dVarH = d.h(cVar, iVar);
                    break;
                case 3:
                    k0.d dVar2 = dVarH;
                    gVar2 = cVar.nextInt() == 1 ? l0.g.LINEAR : l0.g.RADIAL;
                    dVarH = dVar2;
                    break;
                case 4:
                    fVarI = d.i(cVar, iVar);
                    break;
                case 5:
                    fVarI2 = d.i(cVar, iVar);
                    break;
                case 6:
                    bVarE = d.e(cVar, iVar);
                    break;
                case 7:
                    gVar = gVar2;
                    dVar = dVarH;
                    aVar = s.a.values()[cVar.nextInt() - 1];
                    dVarH = dVar;
                    gVar2 = gVar;
                    break;
                case 8:
                    gVar = gVar2;
                    dVar = dVarH;
                    bVar = s.b.values()[cVar.nextInt() - 1];
                    dVarH = dVar;
                    gVar2 = gVar;
                    break;
                case 9:
                    gVar = gVar2;
                    dVar = dVarH;
                    fNextDouble = (float) cVar.nextDouble();
                    dVarH = dVar;
                    gVar2 = gVar;
                    break;
                case 10:
                    gVar = gVar2;
                    zM = cVar.m();
                    gVar2 = gVar;
                    break;
                case 11:
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        cVar.beginObject();
                        String strNextString2 = null;
                        k0.b bVarE2 = null;
                        while (cVar.hasNext()) {
                            int iQ2 = cVar.q(f96296c);
                            if (iQ2 != 0) {
                                l0.g gVar3 = gVar2;
                                if (iQ2 != 1) {
                                    cVar.s();
                                    cVar.skipValue();
                                } else {
                                    bVarE2 = d.e(cVar, iVar);
                                }
                                gVar2 = gVar3;
                            } else {
                                strNextString2 = cVar.nextString();
                            }
                        }
                        l0.g gVar4 = gVar2;
                        cVar.endObject();
                        if (strNextString2.equals("o")) {
                            bVar2 = bVarE2;
                        } else {
                            if (strNextString2.equals("d") || strNextString2.equals("g")) {
                                iVar.u(true);
                                arrayList.add(bVarE2);
                            }
                            gVar2 = gVar4;
                        }
                        gVar2 = gVar4;
                    }
                    gVar = gVar2;
                    cVar.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add((k0.b) arrayList.get(0));
                    }
                    gVar2 = gVar;
                    break;
                default:
                    cVar.s();
                    cVar.skipValue();
                    break;
            }
        }
        l0.g gVar5 = gVar2;
        k0.d dVar3 = dVarH;
        if (dVar3 == null) {
            dVar3 = new k0.d(Collections.singletonList(new r0.a(100)));
        }
        return new l0.f(strNextString, gVar5, cVarG, dVar3, fVarI, fVarI2, bVarE, aVar, bVar, fNextDouble, arrayList, bVar2, zM);
    }
}

package o0;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m0.e;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96309a = c.a.a(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "ip", "op", "fr", "v", "layers", POBCoreNativeConstants.NATIVE_ASSETS, "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static c.a f96310b = c.a.a("id", "layers", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "p", ApsMetricsDataMap.APSMETRICS_FIELD_URL);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c.a f96311c = c.a.a("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c.a f96312d = c.a.a("cm", "tm", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE);

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    public static d0.i a(p0.c cVar) {
        float f10;
        p0.c cVar2 = cVar;
        float fE = q0.p.e();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        d0.i iVar = new d0.i();
        cVar2.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextDouble = 0;
        int iNextDouble2 = 0;
        while (cVar2.hasNext()) {
            switch (cVar2.q(f96309a)) {
                case 0:
                    f10 = fE;
                    iNextDouble2 = (int) cVar.nextDouble();
                    cVar2 = cVar;
                    fE = f10;
                    break;
                case 1:
                    f10 = fE;
                    iNextDouble = (int) cVar.nextDouble();
                    cVar2 = cVar;
                    fE = f10;
                    break;
                case 2:
                    f10 = fE;
                    fNextDouble = (float) cVar.nextDouble();
                    cVar2 = cVar;
                    fE = f10;
                    break;
                case 3:
                    f10 = fE;
                    fNextDouble2 = ((float) cVar.nextDouble()) - 0.01f;
                    cVar2 = cVar;
                    fE = f10;
                    break;
                case 4:
                    f10 = fE;
                    fNextDouble3 = (float) cVar.nextDouble();
                    cVar2 = cVar;
                    fE = f10;
                    break;
                case 5:
                    String[] strArrSplit = cVar2.nextString().split("\\.");
                    if (!q0.p.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        iVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    cVar2 = cVar;
                    break;
                case 6:
                    e(cVar2, iVar, arrayList, longSparseArray);
                    cVar2 = cVar;
                    break;
                case 7:
                    b(cVar2, iVar, map, map2);
                    cVar2 = cVar;
                    break;
                case 8:
                    d(cVar2, map3);
                    cVar2 = cVar;
                    break;
                case 9:
                    c(cVar2, iVar, sparseArrayCompat);
                    cVar2 = cVar;
                    break;
                case 10:
                    f(cVar2, arrayList2);
                    cVar2 = cVar;
                    break;
                default:
                    cVar2.s();
                    cVar2.skipValue();
                    cVar2 = cVar;
                    break;
            }
        }
        float f11 = fE;
        iVar.s(new Rect(0, 0, (int) (iNextDouble2 * f11), (int) (iNextDouble * f11)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, longSparseArray, map, map2, q0.p.e(), sparseArrayCompat, map3, arrayList2, iNextDouble2, iNextDouble);
        return iVar;
    }

    private static void b(p0.c cVar, d0.i iVar, Map map, Map map2) {
        cVar.beginArray();
        while (cVar.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            cVar.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            while (cVar.hasNext()) {
                int iQ = cVar.q(f96310b);
                if (iQ == 0) {
                    strNextString = cVar.nextString();
                } else if (iQ == 1) {
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        m0.e eVarB = v.b(cVar, iVar);
                        longSparseArray.put(eVarB.e(), eVarB);
                        arrayList.add(eVarB);
                    }
                    cVar.endArray();
                } else if (iQ == 2) {
                    iNextInt = cVar.nextInt();
                } else if (iQ == 3) {
                    iNextInt2 = cVar.nextInt();
                } else if (iQ == 4) {
                    strNextString2 = cVar.nextString();
                } else if (iQ != 5) {
                    cVar.s();
                    cVar.skipValue();
                } else {
                    strNextString3 = cVar.nextString();
                }
            }
            cVar.endObject();
            if (strNextString2 != null) {
                d0.v vVar = new d0.v(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3);
                map2.put(vVar.e(), vVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        cVar.endArray();
    }

    private static void c(p0.c cVar, d0.i iVar, SparseArrayCompat sparseArrayCompat) {
        cVar.beginArray();
        while (cVar.hasNext()) {
            j0.d dVarA = m.a(cVar, iVar);
            sparseArrayCompat.put(dVarA.hashCode(), dVarA);
        }
        cVar.endArray();
    }

    private static void d(p0.c cVar, Map map) {
        cVar.beginObject();
        while (cVar.hasNext()) {
            if (cVar.q(f96311c) != 0) {
                cVar.s();
                cVar.skipValue();
            } else {
                cVar.beginArray();
                while (cVar.hasNext()) {
                    j0.c cVarA = n.a(cVar);
                    map.put(cVarA.b(), cVarA);
                }
                cVar.endArray();
            }
        }
        cVar.endObject();
    }

    private static void e(p0.c cVar, d0.i iVar, List list, LongSparseArray longSparseArray) {
        cVar.beginArray();
        int i10 = 0;
        while (cVar.hasNext()) {
            m0.e eVarB = v.b(cVar, iVar);
            if (eVarB.g() == e.a.IMAGE) {
                i10++;
            }
            list.add(eVarB);
            longSparseArray.put(eVarB.e(), eVarB);
            if (i10 > 4) {
                q0.g.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.endArray();
    }

    private static void f(p0.c cVar, List list) {
        cVar.beginArray();
        while (cVar.hasNext()) {
            cVar.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (cVar.hasNext()) {
                int iQ = cVar.q(f96312d);
                if (iQ == 0) {
                    strNextString = cVar.nextString();
                } else if (iQ == 1) {
                    fNextDouble = (float) cVar.nextDouble();
                } else if (iQ != 2) {
                    cVar.s();
                    cVar.skipValue();
                } else {
                    fNextDouble2 = (float) cVar.nextDouble();
                }
            }
            cVar.endObject();
            list.add(new j0.h(strNextString, fNextDouble, fNextDouble2));
        }
        cVar.endArray();
    }
}

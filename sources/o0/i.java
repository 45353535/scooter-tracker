package o0;

import android.graphics.PointF;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import j0.b;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
public class i implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f96267a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c.a f96268b = c.a.a(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, InneractiveMediationDefs.GENDER_FEMALE, "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private i() {
    }

    @Override // o0.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j0.b a(p0.c cVar, float f10) {
        b.a aVar = b.a.CENTER;
        cVar.beginObject();
        b.a aVar2 = aVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zM = true;
        while (cVar.hasNext()) {
            switch (cVar.q(f96268b)) {
                case 0:
                    strNextString = cVar.nextString();
                    break;
                case 1:
                    strNextString2 = cVar.nextString();
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = cVar.nextInt();
                    aVar2 = b.a.CENTER;
                    if (iNextInt2 <= aVar2.ordinal() && iNextInt2 >= 0) {
                        aVar2 = b.a.values()[iNextInt2];
                    }
                    break;
                case 4:
                    iNextInt = cVar.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) cVar.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) cVar.nextDouble();
                    break;
                case 7:
                    iD = s.d(cVar);
                    break;
                case 8:
                    iD2 = s.d(cVar);
                    break;
                case 9:
                    fNextDouble4 = (float) cVar.nextDouble();
                    break;
                case 10:
                    zM = cVar.m();
                    break;
                case 11:
                    cVar.beginArray();
                    PointF pointF3 = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                    cVar.endArray();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.beginArray();
                    PointF pointF4 = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                    cVar.endArray();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.s();
                    cVar.skipValue();
                    break;
            }
        }
        cVar.endObject();
        return new j0.b(strNextString, strNextString2, fNextDouble, aVar2, iNextInt, fNextDouble2, fNextDouble3, iD, iD2, fNextDouble4, zM, pointF, pointF2);
    }
}

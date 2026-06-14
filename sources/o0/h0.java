package o0;

import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
public class h0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f96265a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c.a f96266b = c.a.a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "v", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "o");

    private h0() {
    }

    @Override // o0.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0.o a(p0.c cVar, float f10) {
        if (cVar.o() == c.b.BEGIN_ARRAY) {
            cVar.beginArray();
        }
        cVar.beginObject();
        List listF = null;
        List listF2 = null;
        List listF3 = null;
        boolean zM = false;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96266b);
            if (iQ == 0) {
                zM = cVar.m();
            } else if (iQ == 1) {
                listF = s.f(cVar, f10);
            } else if (iQ == 2) {
                listF2 = s.f(cVar, f10);
            } else if (iQ != 3) {
                cVar.s();
                cVar.skipValue();
            } else {
                listF3 = s.f(cVar, f10);
            }
        }
        cVar.endObject();
        if (cVar.o() == c.b.END_ARRAY) {
            cVar.endArray();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new l0.o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listF.size();
        PointF pointF = (PointF) listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = (PointF) listF.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new j0.a(q0.l.a((PointF) listF.get(i11), (PointF) listF3.get(i11)), q0.l.a(pointF2, (PointF) listF2.get(i10)), pointF2));
        }
        if (zM) {
            PointF pointF3 = (PointF) listF.get(0);
            int i12 = size - 1;
            arrayList.add(new j0.a(q0.l.a((PointF) listF.get(i12), (PointF) listF3.get(i12)), q0.l.a(pointF3, (PointF) listF2.get(0)), pointF3));
        }
        return new l0.o(pointF, zM, arrayList);
    }
}

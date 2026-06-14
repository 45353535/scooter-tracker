package o0;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.lang.ref.WeakReference;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SparseArrayCompat f96301b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Interpolator f96300a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static c.a f96302c = c.a.a(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "s", EidRequestBuilder.REQUEST_FIELD_EMAIL, "o", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "h", TypedValues.TransitionType.S_TO, "ti");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static c.a f96303d = c.a.a("x", "y");

    private static WeakReference a(int i10) {
        WeakReference weakReference;
        synchronized (t.class) {
            weakReference = (WeakReference) g().get(i10);
        }
        return weakReference;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorCreate;
        pointF.x = q0.l.b(pointF.x, -1.0f, 1.0f);
        pointF.y = q0.l.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = q0.l.b(pointF2.x, -1.0f, 1.0f);
        float fB = q0.l.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int i10 = q0.p.i(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference weakReferenceA = d0.e.e() ? null : a(i10);
        Interpolator interpolator = weakReferenceA != null ? (Interpolator) weakReferenceA.get() : null;
        if (weakReferenceA != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorCreate = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            interpolatorCreate = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!d0.e.e()) {
            try {
                h(i10, new WeakReference(interpolatorCreate));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorCreate;
    }

    static r0.a c(p0.c cVar, d0.i iVar, float f10, n0 n0Var, boolean z10, boolean z11) {
        return (z10 && z11) ? e(iVar, cVar, f10, n0Var) : z10 ? d(iVar, cVar, f10, n0Var) : f(cVar, f10, n0Var);
    }

    private static r0.a d(d0.i iVar, p0.c cVar, float f10, n0 n0Var) {
        Interpolator interpolatorB;
        Object obj;
        cVar.beginObject();
        PointF pointFE = null;
        Object objA = null;
        Object objA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fNextDouble = 0.0f;
        boolean z10 = false;
        PointF pointFE4 = null;
        while (cVar.hasNext()) {
            switch (cVar.q(f96302c)) {
                case 0:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 1:
                    objA2 = n0Var.a(cVar, f10);
                    break;
                case 2:
                    objA = n0Var.a(cVar, f10);
                    break;
                case 3:
                    pointFE = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    z10 = cVar.nextInt() == 1;
                    break;
                case 6:
                    pointFE2 = s.e(cVar, f10);
                    break;
                case 7:
                    pointFE3 = s.e(cVar, f10);
                    break;
                default:
                    cVar.skipValue();
                    break;
            }
        }
        cVar.endObject();
        if (z10) {
            interpolatorB = f96300a;
            obj = objA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? f96300a : b(pointFE, pointFE4);
            obj = objA;
        }
        r0.a aVar = new r0.a(iVar, objA2, obj, interpolatorB, fNextDouble, null);
        aVar.f99199o = pointFE2;
        aVar.f99200p = pointFE3;
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static r0.a e(d0.i r21, p0.c r22, float r23, o0.n0 r24) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.t.e(d0.i, p0.c, float, o0.n0):r0.a");
    }

    private static r0.a f(p0.c cVar, float f10, n0 n0Var) {
        return new r0.a(n0Var.a(cVar, f10));
    }

    private static SparseArrayCompat g() {
        if (f96301b == null) {
            f96301b = new SparseArrayCompat();
        }
        return f96301b;
    }

    private static void h(int i10, WeakReference weakReference) {
        synchronized (t.class) {
            f96301b.put(i10, weakReference);
        }
    }
}

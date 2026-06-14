package com.bytedance.adsdk.ud.mzz;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
class aaj {
    private static final Interpolator qdl = new LinearInterpolator();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static SparseArray<WeakReference<Interpolator>> f16073ud;

    aaj() {
    }

    private static SparseArray<WeakReference<Interpolator>> qdl() {
        if (f16073ud == null) {
            f16073ud = new SparseArray<>();
        }
        return f16073ud;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> com.bytedance.adsdk.ud.wd.qdl<T> ud(com.bytedance.adsdk.ud.wd r26, android.util.JsonReader r27, float r28, com.bytedance.adsdk.ud.mzz.wc<T> r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.mzz.aaj.ud(com.bytedance.adsdk.ud.wd, android.util.JsonReader, float, com.bytedance.adsdk.ud.mzz.wc):com.bytedance.adsdk.ud.wd.qdl");
    }

    private static WeakReference<Interpolator> qdl(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (aaj.class) {
            weakReference = qdl().get(i10);
        }
        return weakReference;
    }

    private static void qdl(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (aaj.class) {
            f16073ud.put(i10, weakReference);
        }
    }

    static <T> com.bytedance.adsdk.ud.wd.qdl<T> qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, float f10, wc<T> wcVar, boolean z10, boolean z11) throws IOException {
        if (z10 && z11) {
            return ud(wdVar, jsonReader, f10, wcVar);
        }
        if (z10) {
            return qdl(wdVar, jsonReader, f10, wcVar);
        }
        return qdl(jsonReader, f10, wcVar);
    }

    private static <T> com.bytedance.adsdk.ud.wd.qdl<T> qdl(com.bytedance.adsdk.ud.wd wdVar, JsonReader jsonReader, float f10, wc<T> wcVar) throws IOException {
        Interpolator interpolatorQdl;
        jsonReader.beginObject();
        PointF pointFUd = null;
        T tUd = null;
        T tUd2 = null;
        PointF pointFUd2 = null;
        PointF pointFUd3 = null;
        float fNextDouble = 0.0f;
        boolean z10 = false;
        PointF pointFUd4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tUd = wcVar.ud(jsonReader, f10);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                    break;
                case "i":
                    pointFUd4 = exc.ud(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFUd = exc.ud(jsonReader, 1.0f);
                    break;
                case "s":
                    tUd2 = wcVar.ud(jsonReader, f10);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFUd3 = exc.ud(jsonReader, f10);
                    break;
                case "to":
                    pointFUd2 = exc.ud(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z10) {
            if (pointFUd != null && pointFUd4 != null) {
                interpolatorQdl = qdl(pointFUd, pointFUd4);
            }
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar = new com.bytedance.adsdk.ud.wd.qdl<>(wdVar, tUd2, tUd, interpolatorQdl, fNextDouble, null);
            qdlVar.jpc = pointFUd2;
            qdlVar.tvp = pointFUd3;
            return qdlVar;
        }
        tUd = tUd2;
        interpolatorQdl = qdl;
        com.bytedance.adsdk.ud.wd.qdl<T> qdlVar2 = new com.bytedance.adsdk.ud.wd.qdl<>(wdVar, tUd2, tUd, interpolatorQdl, fNextDouble, null);
        qdlVar2.jpc = pointFUd2;
        qdlVar2.tvp = pointFUd3;
        return qdlVar2;
    }

    private static Interpolator qdl(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.ud.mo.mzz.ud(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.ud.mo.mzz.ud(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.ud.mo.mzz.ud(pointF2.x, -1.0f, 1.0f);
        float fUd = com.bytedance.adsdk.ud.mo.mzz.ud(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fUd;
        int iQdl = com.bytedance.adsdk.ud.mo.mo.qdl(pointF.x, pointF.y, pointF2.x, fUd);
        WeakReference<Interpolator> weakReferenceQdl = com.bytedance.adsdk.ud.mzz.qdl() ? null : qdl(iQdl);
        Interpolator interpolator = weakReferenceQdl != null ? weakReferenceQdl.get() : null;
        if (weakReferenceQdl != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.ud.yt.qdl(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.ud.yt.qdl(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.ud.mzz.qdl()) {
            try {
                qdl(iQdl, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.ud.wd.qdl<T> qdl(JsonReader jsonReader, float f10, wc<T> wcVar) throws IOException {
        return new com.bytedance.adsdk.ud.wd.qdl<>(wcVar.ud(jsonReader, f10));
    }
}

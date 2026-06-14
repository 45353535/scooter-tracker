package com.bytedance.adsdk.ud.mo;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.ud.lnr.ud.rdp;

/* JADX INFO: loaded from: classes6.dex */
public class mzz {
    private static final PointF qdl = new PointF();

    public static boolean lnr(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    public static float qdl(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    private static int ud(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    public static int qdl(int i10, int i11, float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static PointF qdl(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float ud(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static void qdl(rdp rdpVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFQdl = rdpVar.qdl();
        path.moveTo(pointFQdl.x, pointFQdl.y);
        qdl.set(pointFQdl.x, pointFQdl.y);
        int i10 = 0;
        while (i10 < rdpVar.lnr().size()) {
            com.bytedance.adsdk.ud.lnr.qdl qdlVar = rdpVar.lnr().get(i10);
            PointF pointFQdl2 = qdlVar.qdl();
            PointF pointFUd = qdlVar.ud();
            PointF pointFLnr = qdlVar.lnr();
            PointF pointF = qdl;
            if (pointFQdl2.equals(pointF) && pointFUd.equals(pointFLnr)) {
                path.lineTo(pointFLnr.x, pointFLnr.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFQdl2.x, pointFQdl2.y, pointFUd.x, pointFUd.y, pointFLnr.x, pointFLnr.y);
            }
            pointF.set(pointFLnr.x, pointFLnr.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (rdpVar.ud()) {
            path3.close();
        }
    }

    static int qdl(float f10, float f11) {
        return qdl((int) f10, (int) f11);
    }

    private static int qdl(int i10, int i11) {
        return i10 - (i11 * ud(i10, i11));
    }

    public static int qdl(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }
}

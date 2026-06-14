package g0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class j extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f72068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f72069j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f72070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PathMeasure f72071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i f72072m;

    public j(List list) {
        super(list);
        this.f72068i = new PointF();
        this.f72069j = new float[2];
        this.f72070k = new float[2];
        this.f72071l = new PathMeasure();
    }

    @Override // g0.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(r0.a aVar, float f10) {
        float f11;
        i iVar = (i) aVar;
        Path pathK = iVar.k();
        r0.c cVar = this.f72042e;
        if (cVar == null || aVar.f99192h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) cVar.b(iVar.f99191g, iVar.f99192h.floatValue(), (PointF) iVar.f99186b, (PointF) iVar.f99187c, e(), f11, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathK == null) {
            return (PointF) aVar.f99186b;
        }
        if (this.f72072m != iVar) {
            this.f72071l.setPath(pathK, false);
            this.f72072m = iVar;
        }
        float length = this.f72071l.getLength();
        float f12 = f11 * length;
        this.f72071l.getPosTan(f12, this.f72069j, this.f72070k);
        PointF pointF2 = this.f72068i;
        float[] fArr = this.f72069j;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            PointF pointF3 = this.f72068i;
            float[] fArr2 = this.f72070k;
            pointF3.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            PointF pointF4 = this.f72068i;
            float[] fArr3 = this.f72070k;
            float f13 = f12 - length;
            pointF4.offset(fArr3[0] * f13, fArr3[1] * f13);
        }
        return this.f72068i;
    }
}

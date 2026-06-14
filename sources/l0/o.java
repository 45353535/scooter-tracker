package l0;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f93816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f93817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f93818c;

    public o(PointF pointF, boolean z10, List list) {
        this.f93817b = pointF;
        this.f93818c = z10;
        this.f93816a = new ArrayList(list);
    }

    public List a() {
        return this.f93816a;
    }

    public PointF b() {
        return this.f93817b;
    }

    public void c(o oVar, o oVar2, float f10) {
        if (this.f93817b == null) {
            this.f93817b = new PointF();
        }
        this.f93818c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            q0.g.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f93816a.size() < iMin) {
            for (int size = this.f93816a.size(); size < iMin; size++) {
                this.f93816a.add(new j0.a());
            }
        } else if (this.f93816a.size() > iMin) {
            for (int size2 = this.f93816a.size() - 1; size2 >= iMin; size2--) {
                List list = this.f93816a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(q0.l.i(pointFB.x, pointFB2.x, f10), q0.l.i(pointFB.y, pointFB2.y, f10));
        for (int size3 = this.f93816a.size() - 1; size3 >= 0; size3--) {
            j0.a aVar = (j0.a) oVar.a().get(size3);
            j0.a aVar2 = (j0.a) oVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            ((j0.a) this.f93816a.get(size3)).d(q0.l.i(pointFA.x, pointFA2.x, f10), q0.l.i(pointFA.y, pointFA2.y, f10));
            ((j0.a) this.f93816a.get(size3)).e(q0.l.i(pointFB3.x, pointFB4.x, f10), q0.l.i(pointFB3.y, pointFB4.y, f10));
            ((j0.a) this.f93816a.get(size3)).f(q0.l.i(pointFC.x, pointFC2.x, f10), q0.l.i(pointFC.y, pointFC2.y, f10));
        }
    }

    public boolean d() {
        return this.f93818c;
    }

    public void e(boolean z10) {
        this.f93818c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f93817b == null) {
            this.f93817b = new PointF();
        }
        this.f93817b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f93816a.size() + "closed=" + this.f93818c + '}';
    }

    public o() {
        this.f93816a = new ArrayList();
    }
}

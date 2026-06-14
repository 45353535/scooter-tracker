package g0;

import android.graphics.PointF;
import g0.a;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public class n extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f72080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final PointF f72081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f72082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f72083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected r0.c f72084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected r0.c f72085n;

    public n(a aVar, a aVar2) {
        super(Collections.EMPTY_LIST);
        this.f72080i = new PointF();
        this.f72081j = new PointF();
        this.f72082k = aVar;
        this.f72083l = aVar2;
        n(f());
    }

    @Override // g0.a
    public void n(float f10) {
        this.f72082k.n(f10);
        this.f72083l.n(f10);
        this.f72080i.set(((Float) this.f72082k.h()).floatValue(), ((Float) this.f72083l.h()).floatValue());
        for (int i10 = 0; i10 < this.f72038a.size(); i10++) {
            ((a.b) this.f72038a.get(i10)).f();
        }
    }

    @Override // g0.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF i(r0.a aVar, float f10) {
        Float f11;
        r0.a aVarB;
        r0.a aVarB2;
        Float f12 = null;
        if (this.f72084m == null || (aVarB2 = this.f72082k.b()) == null) {
            f11 = null;
        } else {
            Float f13 = aVarB2.f99192h;
            r0.c cVar = this.f72084m;
            float f14 = aVarB2.f99191g;
            f11 = (Float) cVar.b(f14, f13 == null ? f14 : f13.floatValue(), (Float) aVarB2.f99186b, (Float) aVarB2.f99187c, this.f72082k.d(), this.f72082k.e(), this.f72082k.f());
        }
        if (this.f72085n != null && (aVarB = this.f72083l.b()) != null) {
            Float f15 = aVarB.f99192h;
            r0.c cVar2 = this.f72085n;
            float f16 = aVarB.f99191g;
            f12 = (Float) cVar2.b(f16, f15 == null ? f16 : f15.floatValue(), (Float) aVarB.f99186b, (Float) aVarB.f99187c, this.f72083l.d(), this.f72083l.e(), this.f72083l.f());
        }
        if (f11 == null) {
            this.f72081j.set(this.f72080i.x, 0.0f);
        } else {
            this.f72081j.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            PointF pointF = this.f72081j;
            pointF.set(pointF.x, this.f72080i.y);
        } else {
            PointF pointF2 = this.f72081j;
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return this.f72081j;
    }

    public void t(r0.c cVar) {
        r0.c cVar2 = this.f72084m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f72084m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void u(r0.c cVar) {
        r0.c cVar2 = this.f72085n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f72085n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}

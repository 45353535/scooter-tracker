package g0;

import android.graphics.Path;
import f0.s;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class m extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l0.o f72075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f72076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f72077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Path f72078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f72079m;

    public m(List list) {
        super(list);
        this.f72075i = new l0.o();
        this.f72076j = new Path();
    }

    @Override // g0.a
    protected boolean p() {
        List list = this.f72079m;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // g0.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Path i(r0.a aVar, float f10) {
        l0.o oVar = (l0.o) aVar.f99186b;
        l0.o oVar2 = (l0.o) aVar.f99187c;
        this.f72075i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        l0.o oVarA = this.f72075i;
        List list = this.f72079m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVarA = ((s) this.f72079m.get(size)).a(oVarA);
            }
        }
        q0.l.h(oVarA, this.f72076j);
        if (this.f72042e == null) {
            return this.f72076j;
        }
        if (this.f72077k == null) {
            this.f72077k = new Path();
            this.f72078l = new Path();
        }
        q0.l.h(oVar, this.f72077k);
        if (oVar2 != null) {
            q0.l.h(oVar2, this.f72078l);
        }
        r0.c cVar = this.f72042e;
        float f11 = aVar.f99191g;
        float fFloatValue = aVar.f99192h.floatValue();
        Path path = this.f72077k;
        return (Path) cVar.b(f11, fFloatValue, path, oVar2 == null ? path : this.f72078l, f10, e(), f());
    }

    public void s(List list) {
        this.f72079m = list;
    }
}

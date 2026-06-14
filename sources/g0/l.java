package g0;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class l extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r0.d f72074i;

    public l(List list) {
        super(list);
        this.f72074i = new r0.d();
    }

    @Override // g0.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public r0.d i(r0.a aVar, float f10) {
        Object obj;
        float f11;
        Object obj2 = aVar.f99186b;
        if (obj2 == null || (obj = aVar.f99187c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        r0.d dVar = (r0.d) obj2;
        r0.d dVar2 = (r0.d) obj;
        r0.c cVar = this.f72042e;
        if (cVar != null) {
            f11 = f10;
            r0.d dVar3 = (r0.d) cVar.b(aVar.f99191g, aVar.f99192h.floatValue(), dVar, dVar2, f11, e(), f());
            if (dVar3 != null) {
                return dVar3;
            }
        } else {
            f11 = f10;
        }
        this.f72074i.d(q0.l.i(dVar.b(), dVar2.b(), f11), q0.l.i(dVar.c(), dVar2.c(), f11));
        return this.f72074i;
    }
}

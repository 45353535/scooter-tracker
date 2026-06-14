package g0;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b extends g {
    public b(List list) {
        super(list);
    }

    public int r() {
        return s(b(), d());
    }

    public int s(r0.a aVar, float f10) {
        float f11;
        Float f12;
        if (aVar.f99186b == null || aVar.f99187c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        r0.c cVar = this.f72042e;
        if (cVar == null || (f12 = aVar.f99192h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) cVar.b(aVar.f99191g, f12.floatValue(), (Integer) aVar.f99186b, (Integer) aVar.f99187c, f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return q0.e.c(q0.l.b(f11, 0.0f, 1.0f), ((Integer) aVar.f99186b).intValue(), ((Integer) aVar.f99187c).intValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer i(r0.a aVar, float f10) {
        return Integer.valueOf(s(aVar, f10));
    }
}

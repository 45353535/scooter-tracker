package g0;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class f extends g {
    public f(List list) {
        super(list);
    }

    int r(r0.a aVar, float f10) {
        float f11;
        if (aVar.f99186b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iH = aVar.f99187c == null ? aVar.h() : aVar.e();
        r0.c cVar = this.f72042e;
        if (cVar != null) {
            f11 = f10;
            Integer num = (Integer) cVar.b(aVar.f99191g, aVar.f99192h.floatValue(), (Integer) aVar.f99186b, Integer.valueOf(iH), f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f11 = f10;
        }
        return q0.l.j(aVar.h(), iH, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(r0.a aVar, float f10) {
        return Integer.valueOf(r(aVar, f10));
    }
}

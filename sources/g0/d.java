package g0;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d extends g {
    public d(List list) {
        super(list);
    }

    public float r() {
        return s(b(), d());
    }

    float s(r0.a aVar, float f10) {
        float f11;
        if (aVar.f99186b == null || aVar.f99187c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        r0.c cVar = this.f72042e;
        if (cVar != null) {
            f11 = f10;
            Float f12 = (Float) cVar.b(aVar.f99191g, aVar.f99192h.floatValue(), (Float) aVar.f99186b, (Float) aVar.f99187c, f11, e(), f());
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        return q0.l.i(aVar.g(), aVar.d(), f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float i(r0.a aVar, float f10) {
        return Float.valueOf(s(aVar, f10));
    }
}

package o0;

import android.graphics.PointF;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
public class b0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f96252a = new b0();

    private b0() {
    }

    @Override // o0.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(p0.c cVar, float f10) {
        c.b bVarO = cVar.o();
        if (bVarO == c.b.BEGIN_ARRAY) {
            return s.e(cVar, f10);
        }
        if (bVarO == c.b.BEGIN_OBJECT) {
            return s.e(cVar, f10);
        }
        if (bVarO == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
            while (cVar.hasNext()) {
                cVar.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarO);
    }
}

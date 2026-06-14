package o0;

import android.graphics.Color;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
public class g implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f96262a = new g();

    private g() {
    }

    @Override // o0.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(p0.c cVar, float f10) {
        boolean z10 = cVar.o() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.beginArray();
        }
        double dNextDouble = cVar.nextDouble();
        double dNextDouble2 = cVar.nextDouble();
        double dNextDouble3 = cVar.nextDouble();
        double dNextDouble4 = cVar.o() == c.b.NUMBER ? cVar.nextDouble() : 1.0d;
        if (z10) {
            cVar.endArray();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}

package o0;

import p0.c;

/* JADX INFO: loaded from: classes5.dex */
public class g0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f96263a = new g0();

    private g0() {
    }

    @Override // o0.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r0.d a(p0.c cVar, float f10) {
        boolean z10 = cVar.o() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.beginArray();
        }
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        if (z10) {
            cVar.endArray();
        }
        return new r0.d((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}

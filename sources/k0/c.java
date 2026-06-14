package k0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c extends p {
    public c(List list) {
        super(d(list));
    }

    private static r0.a c(r0.a aVar) {
        l0.d dVar = (l0.d) aVar.f99186b;
        l0.d dVar2 = (l0.d) aVar.f99187c;
        if (dVar == null || dVar2 == null || dVar.e().length == dVar2.e().length) {
            return aVar;
        }
        float[] fArrE = e(dVar.e(), dVar2.e());
        return aVar.b(dVar.b(fArrE), dVar2.b(fArrE));
    }

    private static List d(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, c((r0.a) list.get(i10)));
        }
        return list;
    }

    static float[] e(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // k0.o
    public g0.a a() {
        return new g0.e(this.f85950a);
    }

    @Override // k0.p, k0.o
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // k0.p, k0.o
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // k0.p
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}

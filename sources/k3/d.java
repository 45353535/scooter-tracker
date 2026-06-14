package k3;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes7.dex */
public class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f85979c = j3.d.c().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f85980d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f85981e = 1.2f;

    @Override // k3.c
    public void d() {
        int size = this.f85971b.size();
        float f10 = 2.0f;
        float width = this.f85970a.f85978g.getWidth() / 2.0f;
        b bVar = this.f85970a;
        int i10 = bVar.f85972a;
        float f11 = bVar.f85975d;
        float f12 = bVar.f85973b;
        float f13 = bVar.f85974c;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            float f14 = i11;
            float f15 = i10;
            float f16 = (f14 / (i10 - 1)) * f12;
            float fMax = Math.max(1.5f + f11, (i11 == 0 ? 0.0f : ((f14 - (f15 / f10)) / f15) * this.f85981e * f13) + f13);
            int iMin = Math.min(e(f16, fMax), i10 * 2);
            int i13 = 0;
            while (i13 < iMin) {
                float f17 = f13;
                int i14 = i11;
                double d10 = iMin;
                float f18 = width;
                double d11 = ((((double) i13) * 6.283185307179586d) / d10) + ((3.141592653589793d / d10) * ((double) ((i14 + 1) % 2)));
                double d12 = f16;
                float fCos = f18 + ((float) (d12 * Math.cos(d11)));
                float fSin = f18 + ((float) (d12 * Math.sin(d11)));
                float[] fArr = this.f85980d;
                fArr[0] = (float) ((180.0d * d11) / 3.141592653589793d);
                fArr[1] = f16 / f12;
                fArr[2] = this.f85970a.f85977f;
                this.f85979c.setColor(Color.HSVToColor(fArr));
                this.f85979c.setAlpha(f());
                this.f85970a.f85978g.drawCircle(fCos, fSin, fMax - f11, this.f85979c);
                if (i12 >= size) {
                    this.f85971b.add(new i3.b(fCos, fSin, this.f85980d));
                } else {
                    ((i3.b) this.f85971b.get(i12)).e(fCos, fSin, this.f85980d);
                }
                i12++;
                i13++;
                i11 = i14;
                f13 = f17;
                width = f18;
            }
            i11++;
            f10 = 2.0f;
        }
    }
}

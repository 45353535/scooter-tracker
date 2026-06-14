package k3;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes7.dex */
public class e extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f85982c = j3.d.c().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f85983d = new float[3];

    @Override // k3.c
    public void d() {
        int size = this.f85971b.size();
        float width = this.f85970a.f85978g.getWidth() / 2.0f;
        b bVar = this.f85970a;
        int i10 = bVar.f85972a;
        float f10 = bVar.f85973b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = (i12 / (i10 - 1)) * f10;
            float f12 = this.f85970a.f85974c;
            int iE = e(f11, f12);
            int i13 = 0;
            while (i13 < iE) {
                double d10 = iE;
                float f13 = width;
                float f14 = f10;
                double d11 = ((((double) i13) * 6.283185307179586d) / d10) + ((3.141592653589793d / d10) * ((double) ((i12 + 1) % 2)));
                double d12 = f11;
                float fCos = f13 + ((float) (Math.cos(d11) * d12));
                float fSin = f13 + ((float) (d12 * Math.sin(d11)));
                float[] fArr = this.f85983d;
                fArr[0] = (float) ((d11 * 180.0d) / 3.141592653589793d);
                fArr[1] = f11 / f14;
                fArr[2] = this.f85970a.f85977f;
                this.f85982c.setColor(Color.HSVToColor(fArr));
                this.f85982c.setAlpha(f());
                b bVar2 = this.f85970a;
                bVar2.f85978g.drawCircle(fCos, fSin, f12 - bVar2.f85975d, this.f85982c);
                if (i11 >= size) {
                    this.f85971b.add(new i3.b(fCos, fSin, this.f85983d));
                } else {
                    ((i3.b) this.f85971b.get(i11)).e(fCos, fSin, this.f85983d);
                }
                i11++;
                i13++;
                width = f13;
                f10 = f14;
            }
        }
    }
}

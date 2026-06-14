package na;

import android.opengl.Matrix;
import q9.i0;
import q9.p;

/* JADX INFO: loaded from: classes12.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f95686a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f95687b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0 f95688c = new i0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f95689d;

    public static void a(float[] fArr, float[] fArr2) {
        p.k(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / fSqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12 / fSqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            p.k(fArr);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArr2 = (float[]) this.f95688c.j(j10);
        if (fArr2 == null) {
            return false;
        }
        b(this.f95687b, fArr2);
        if (!this.f95689d) {
            a(this.f95686a, this.f95687b);
            this.f95689d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f95686a, 0, this.f95687b, 0);
        return true;
    }

    public void d() {
        this.f95688c.c();
        this.f95689d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f95688c.a(j10, fArr);
    }
}

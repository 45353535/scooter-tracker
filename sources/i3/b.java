package i3;

import android.graphics.Color;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f73931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f73932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f73933c = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f73934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f73935e;

    public b(float f10, float f11, float[] fArr) {
        e(f10, f11, fArr);
    }

    public float[] a() {
        return this.f73933c;
    }

    public float[] b(float f10) {
        if (this.f73934d == null) {
            this.f73934d = (float[]) this.f73933c.clone();
        }
        float[] fArr = this.f73934d;
        float[] fArr2 = this.f73933c;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = f10;
        return fArr;
    }

    public float c() {
        return this.f73931a;
    }

    public float d() {
        return this.f73932b;
    }

    public void e(float f10, float f11, float[] fArr) {
        this.f73931a = f10;
        this.f73932b = f11;
        float[] fArr2 = this.f73933c;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        this.f73935e = Color.HSVToColor(fArr2);
    }

    public double f(float f10, float f11) {
        double d10 = this.f73931a - f10;
        double d11 = this.f73932b - f11;
        return (d10 * d10) + (d11 * d11);
    }
}

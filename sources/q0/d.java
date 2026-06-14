package q0;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import q0.o;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f98605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f98606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f98607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f98608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f98609e = null;

    public d(float f10, float f11, float f12, int i10) {
        this.f98605a = f10;
        this.f98606b = f11;
        this.f98607c = f12;
        this.f98608d = i10;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f98608d) > 0) {
            paint.setShadowLayer(Math.max(this.f98605a, Float.MIN_VALUE), this.f98606b, this.f98607c, this.f98608d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(o.a aVar) {
        if (Color.alpha(this.f98608d) > 0) {
            aVar.f98663d = this;
        } else {
            aVar.f98663d = null;
        }
    }

    public void c(int i10, Paint paint) {
        int iL = p.l(Color.alpha(this.f98608d), l.c(i10, 0, 255));
        if (iL <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f98605a, Float.MIN_VALUE), this.f98606b, this.f98607c, Color.argb(iL, Color.red(this.f98608d), Color.green(this.f98608d), Color.blue(this.f98608d)));
        }
    }

    public void d(int i10, o.a aVar) {
        d dVar = new d(this);
        aVar.f98663d = dVar;
        dVar.i(i10);
    }

    public int e() {
        return this.f98608d;
    }

    public float f() {
        return this.f98606b;
    }

    public float g() {
        return this.f98607c;
    }

    public float h() {
        return this.f98605a;
    }

    public void i(int i10) {
        this.f98608d = Color.argb(Math.round((Color.alpha(this.f98608d) * l.c(i10, 0, 255)) / 255.0f), Color.red(this.f98608d), Color.green(this.f98608d), Color.blue(this.f98608d));
    }

    public boolean j(d dVar) {
        return this.f98605a == dVar.f98605a && this.f98606b == dVar.f98606b && this.f98607c == dVar.f98607c && this.f98608d == dVar.f98608d;
    }

    public void k(Matrix matrix) {
        if (this.f98609e == null) {
            this.f98609e = new float[2];
        }
        float[] fArr = this.f98609e;
        fArr[0] = this.f98606b;
        fArr[1] = this.f98607c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f98609e;
        this.f98606b = fArr2[0];
        this.f98607c = fArr2[1];
        this.f98605a = matrix.mapRadius(this.f98605a);
    }

    public d(d dVar) {
        this.f98605a = 0.0f;
        this.f98606b = 0.0f;
        this.f98607c = 0.0f;
        this.f98608d = 0;
        this.f98605a = dVar.f98605a;
        this.f98606b = dVar.f98606b;
        this.f98607c = dVar.f98607c;
        this.f98608d = dVar.f98608d;
    }
}

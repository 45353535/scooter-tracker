package j0;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f85415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f85416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f85417c;

    public a() {
        this.f85415a = new PointF();
        this.f85416b = new PointF();
        this.f85417c = new PointF();
    }

    public PointF a() {
        return this.f85415a;
    }

    public PointF b() {
        return this.f85416b;
    }

    public PointF c() {
        return this.f85417c;
    }

    public void d(float f10, float f11) {
        this.f85415a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f85416b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f85417c.set(f10, f11);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f85417c.x), Float.valueOf(this.f85417c.y), Float.valueOf(this.f85415a.x), Float.valueOf(this.f85415a.y), Float.valueOf(this.f85416b.x), Float.valueOf(this.f85416b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f85415a = pointF;
        this.f85416b = pointF2;
        this.f85417c = pointF3;
    }
}

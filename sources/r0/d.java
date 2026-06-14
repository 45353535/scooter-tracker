package r0;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f99211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f99212b;

    public d(float f10, float f11) {
        this.f99211a = f10;
        this.f99212b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f99211a == f10 && this.f99212b == f11;
    }

    public float b() {
        return this.f99211a;
    }

    public float c() {
        return this.f99212b;
    }

    public void d(float f10, float f11) {
        this.f99211a = f10;
        this.f99212b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}

package q0;

/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f98631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f98632b;

    public void a(float f10) {
        float f11 = this.f98631a + f10;
        this.f98631a = f11;
        int i10 = this.f98632b + 1;
        this.f98632b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f98631a = f11 / 2.0f;
            this.f98632b = i10 / 2;
        }
    }
}

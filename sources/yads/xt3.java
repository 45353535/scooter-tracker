package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class xt3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cu3 f117965b;

    public xt3(cu3 cu3Var) {
        this.f117965b = cu3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        cu3 cu3Var = this.f117965b;
        int streamVolume = cu3Var.f109601c.getStreamVolume(3);
        int streamMaxVolume = cu3Var.f109601c.getStreamMaxVolume(3);
        cu3Var.f109602d.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f10 = 0.0f;
        } else {
            f10 = streamVolume / streamMaxVolume;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
        }
        this.f117965b.f109605g.set(false);
        if (((Float) this.f117965b.f109604f.getAndSet(Float.valueOf(f10))).floatValue() != f10) {
            this.f117965b.f109599a.post(new vt3(this, f10));
        }
    }
}

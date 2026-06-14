package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class rd3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sd3 f115409b;

    public rd3(sd3 sd3Var) {
        this.f115409b = sd3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sd3 sd3Var = this.f115409b;
        if (sd3Var.f115766d || !sd3Var.f115763a.a()) {
            this.f115409b.f115765c.postDelayed(this, 200L);
            return;
        }
        ((md3) this.f115409b.f115764b).a();
        sd3 sd3Var2 = this.f115409b;
        sd3Var2.f115766d = true;
        sd3Var2.f115765c.removeCallbacksAndMessages(null);
        sd3Var2.f115767e = false;
    }
}

package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class id3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jd3 f111968b;

    public id3(jd3 jd3Var) {
        this.f111968b = jd3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long adPosition = this.f111968b.f112324a.getAdPosition();
        this.f111968b.f112325b.a(this.f111968b.f112324a.c(), adPosition);
        jd3 jd3Var = this.f111968b;
        if (jd3Var.f112327d) {
            jd3Var.f112326c.postDelayed(this, 200L);
        }
    }
}

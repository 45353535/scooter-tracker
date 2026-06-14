package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class cg1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f109397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final us f109398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg1 f109399d;

    public cg1(dg1 dg1Var, long j10, jv1 jv1Var) {
        this.f109399d = dg1Var;
        this.f109397b = j10;
        this.f109398c = jv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        us usVar = this.f109398c;
        if (usVar.f116750b == ts.f116350b) {
            ((jv1) usVar).run();
            this.f109399d.f109920a.postDelayed(this, this.f109397b);
        }
    }
}

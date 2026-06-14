package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class kl2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r52 f112751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pl2 f112752c;

    public kl2(r52 r52Var, pl2 pl2Var) {
        this.f112751b = r52Var;
        this.f112752c = pl2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f112751b.f115324b.setVisibility(4);
        this.f112752c.f114700a.setVisibility(0);
    }
}

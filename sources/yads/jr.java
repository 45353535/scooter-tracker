package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class jr implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km2 f112436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kr f112437c;

    public jr(kr krVar, km2 km2Var) {
        this.f112437c = krVar;
        this.f112436b = km2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f112437c.f112810c.put(this.f112436b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

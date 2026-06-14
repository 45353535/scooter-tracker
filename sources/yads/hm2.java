package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class hm2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f111635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f111636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2 f111637d;

    public hm2(km2 km2Var, String str, long j10) {
        this.f111637d = km2Var;
        this.f111635b = str;
        this.f111636c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f111637d.f112762b.a(this.f111635b, this.f111636c);
        km2 km2Var = this.f111637d;
        qj3 qj3Var = km2Var.f112762b;
        km2Var.toString();
        qj3Var.a();
    }
}

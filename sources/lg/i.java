package lg;

import eg.h0;

/* JADX INFO: loaded from: classes3.dex */
final class i extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f94282d;

    public i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f94282d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f94282d.run();
    }

    public String toString() {
        return "Task[" + h0.a(this.f94282d) + '@' + h0.b(this.f94282d) + ", " + this.f94280b + ", " + j.c(this.f94281c) + ']';
    }
}

package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class F3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f85029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f85030b;

    public F3(Runnable runnable, Runnable runnable2) {
        this.f85029a = runnable;
        this.f85030b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f85030b;
        try {
            this.f85029a.run();
            runnable.run();
        } catch (Throwable th2) {
            try {
                runnable.run();
            } catch (Throwable th3) {
                try {
                    th2.addSuppressed(th3);
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }
}

package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class hy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f111800a;

    public hy() {
        this(0);
    }

    public final synchronized void a() {
        while (!this.f111800a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f111800a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        return this.f111800a;
    }

    public final synchronized boolean d() {
        if (this.f111800a) {
            return false;
        }
        this.f111800a = true;
        notifyAll();
        return true;
    }

    public hy(int i10) {
    }
}

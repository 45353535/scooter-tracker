package q9;

/* JADX INFO: loaded from: classes12.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f98809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f98810b;

    public k() {
        this(h.f98789a);
    }

    public synchronized void a() {
        while (!this.f98810b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f98810b) {
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

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f98810b;
        this.f98810b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f98810b;
    }

    public synchronized boolean e() {
        if (this.f98810b) {
            return false;
        }
        this.f98810b = true;
        notifyAll();
        return true;
    }

    public k(h hVar) {
        this.f98809a = hVar;
    }
}

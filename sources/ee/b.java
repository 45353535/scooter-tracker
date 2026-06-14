package ee;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f69090b = new AtomicBoolean(false);

    public boolean a() {
        return this.f69090b.get();
    }

    public abstract void b();

    public void d(boolean z10) {
        this.f69090b.set(z10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            return;
        }
        b();
    }
}

package wd;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements Runnable, pd.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f107908b = new AtomicBoolean(false);

    public void a(boolean z10) {
        this.f107908b.set(z10);
    }

    public boolean b() {
        return this.f107908b.get();
    }

    public abstract void d();

    @Override // java.lang.Runnable
    public void run() {
        if (b()) {
            return;
        }
        d();
    }
}

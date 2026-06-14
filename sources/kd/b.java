package kd;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements Runnable, jd.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f93154b = new AtomicBoolean(false);

    @Override // jd.a
    public void a(boolean z10) {
        this.f93154b.set(z10);
    }

    public boolean b() {
        return this.f93154b.get();
    }

    public abstract void d();

    @Override // java.lang.Runnable
    public final void run() {
        if (b()) {
            return;
        }
        d();
    }
}

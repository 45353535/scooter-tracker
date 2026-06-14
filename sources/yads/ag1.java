package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ag1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bg1 f108682a = new bg1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p33 f108683b = new p33();

    public final void a(Runnable runnable) {
        this.f108683b.getClass();
        if (p33.a()) {
            runnable.run();
        } else {
            this.f108682a.f108997a.post(runnable);
        }
    }

    public final void a() {
        this.f108682a.f108997a.removeCallbacksAndMessages(null);
    }
}

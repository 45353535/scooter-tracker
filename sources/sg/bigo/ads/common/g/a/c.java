package sg.bigo.ads.common.g.a;

import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.common.n.e;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final LinkedList<Runnable> f102425a = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f102426b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e f102427c;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CountDownLatch f102431a = new CountDownLatch(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f102432b = new Runnable() { // from class: sg.bigo.ads.common.g.a.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.f102431a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f102433c;

        public a(Runnable runnable) {
            this.f102433c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f102433c.run();
            this.f102431a.countDown();
        }
    }

    public c() {
        e eVar = new e("Waitable", 1, 1);
        this.f102427c = eVar;
        eVar.allowCoreThreadTimeOut(true);
    }
}

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f7512a;

    class a implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f7513b;

        a(Handler handler) {
            this.f7513b = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f7513b.post(runnable);
        }
    }

    private static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f7515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p f7516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Runnable f7517d;

        public b(n nVar, p pVar, Runnable runnable) {
            this.f7515b = nVar;
            this.f7516c = pVar;
            this.f7517d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7515b.isCanceled()) {
                this.f7515b.finish("canceled-at-delivery");
                return;
            }
            if (this.f7516c.b()) {
                this.f7515b.deliverResponse(this.f7516c.f7541a);
            } else {
                this.f7515b.deliverError(this.f7516c.f7543c);
            }
            if (this.f7516c.f7544d) {
                this.f7515b.addMarker("intermediate-response");
            } else {
                this.f7515b.finish("done");
            }
            Runnable runnable = this.f7517d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f7512a = new a(handler);
    }

    @Override // com.android.volley.q
    public void a(n nVar, p pVar) {
        b(nVar, pVar, null);
    }

    @Override // com.android.volley.q
    public void b(n nVar, p pVar, Runnable runnable) {
        nVar.markDelivered();
        nVar.addMarker("post-response");
        this.f7512a.execute(new b(nVar, pVar, runnable));
    }

    @Override // com.android.volley.q
    public void c(n nVar, u uVar) {
        nVar.addMarker("post-error");
        this.f7512a.execute(new b(nVar, p.a(uVar), null));
    }

    public f(Executor executor) {
        this.f7512a = executor;
    }
}

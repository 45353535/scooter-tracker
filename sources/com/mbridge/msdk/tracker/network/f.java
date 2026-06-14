package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class f implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f51871a;

    class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f51872a;

        a(Handler handler) {
            this.f51872a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f51872a.post(runnable);
        }
    }

    private static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f51874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f51875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f51876c;

        public b(t tVar, v vVar, Runnable runnable) {
            this.f51874a = tVar;
            this.f51875b = vVar;
            this.f51876c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f51874a.v()) {
                this.f51874a.c("canceled-at-delivery");
                return;
            }
            if (this.f51875b.a()) {
                this.f51874a.a(this.f51875b.f51992a);
            } else {
                this.f51874a.b(this.f51875b.f51994c);
            }
            if (this.f51875b.f51995d) {
                this.f51874a.a("intermediate-response");
            } else {
                this.f51874a.c("done");
            }
            Runnable runnable = this.f51876c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f51871a = new a(handler);
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.f51871a.execute(new b(tVar, vVar, runnable));
    }

    public f(Executor executor) {
        this.f51871a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a("post-error");
        this.f51871a.execute(new b(tVar, v.a(b0Var), null));
    }
}

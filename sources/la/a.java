package la;

import java.util.concurrent.Executor;
import q9.l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: la.a$a, reason: collision with other inner class name */
    class C1076a implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f94081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f94082c;

        C1076a(Executor executor, l lVar) {
            this.f94081b = executor;
            this.f94082c = lVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f94081b.execute(runnable);
        }

        @Override // la.b
        public void release() {
            this.f94082c.accept(this.f94081b);
        }
    }

    public static b a(Executor executor, l lVar) {
        return new C1076a(executor, lVar);
    }
}

package io.bidmachine;

import android.content.Context;
import io.bidmachine.SessionManager;
import io.bidmachine.e4;
import io.bidmachine.g4;
import io.bidmachine.protobuf.InitResponse;
import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f80101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f80102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f80103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final SessionManager.a f80104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    e4 f80105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f80106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    e4.c f80107g;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InitResponse f80108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f80109b;

        public b(InitResponse initResponse, String str) {
            this.f80108a = initResponse;
            this.f80109b = str;
        }

        public InitResponse a() {
            return this.f80108a;
        }

        public String b() {
            return this.f80109b;
        }
    }

    private class c implements e4.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f80110a;

        public c(String str) {
            this.f80110a = str;
        }

        @Override // io.bidmachine.core.b.InterfaceC0975b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFail(ae.a aVar) {
            g4 g4Var = g4.this;
            final d dVar = g4Var.f80103c;
            Objects.requireNonNull(dVar);
            g4Var.g(new Executable() { // from class: io.bidmachine.h4
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    dVar.b((g4.b) obj);
                }
            });
        }

        @Override // io.bidmachine.core.b.InterfaceC0975b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InitResponse initResponse) {
            g4.this.d();
            if (initResponse == null) {
                return;
            }
            n2.Q(g4.this.f80101a, initResponse, this.f80110a);
            g4.this.f80103c.a(new b(initResponse, this.f80110a));
        }
    }

    interface d {
        void a(b bVar);

        void b(b bVar);

        void c(b bVar);
    }

    private class e implements SessionManager.a {
        private e() {
        }

        @Override // io.bidmachine.SessionManager.a
        public void a(SessionManager.b bVar) {
            if (bVar != SessionManager.b.START) {
                return;
            }
            g4.this.e();
        }
    }

    g4(Context context, String str, d dVar) {
        e eVar = new e();
        this.f80104d = eVar;
        this.f80105e = null;
        this.f80106f = new Object();
        SessionManager sessionManager = SessionManager.get();
        this.f80101a = context;
        this.f80102b = str;
        this.f80103c = dVar;
        this.f80107g = new c(sessionManager.getSessionId());
        sessionManager.addObserver(eVar);
    }

    e4 c() {
        return new e4(this.f80101a, this.f80102b, UrlProvider.getInitUrlQueue());
    }

    void d() {
        synchronized (this.f80106f) {
            try {
                e4 e4Var = this.f80105e;
                if (e4Var == null) {
                    return;
                }
                e4Var.p();
                this.f80105e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void e() {
        synchronized (this.f80106f) {
            d();
            e4 e4VarC = c();
            this.f80105e = e4VarC;
            e4VarC.s(this.f80107g);
            this.f80105e.r();
        }
    }

    void f() {
        final d dVar = this.f80103c;
        Objects.requireNonNull(dVar);
        g(new Executable() { // from class: io.bidmachine.f4
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                dVar.c((g4.b) obj);
            }
        });
    }

    void g(Executable executable) {
        InitResponse initResponseJ = n2.j(this.f80101a);
        String strK = n2.k(this.f80101a);
        if (initResponseJ != null) {
            executable.execute(new b(initResponseJ, strK));
        }
    }
}

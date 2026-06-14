package io.sentry.cache;

import io.sentry.cache.tape.c;
import io.sentry.cache.tape.d;
import io.sentry.g7;
import io.sentry.k4;
import io.sentry.p8;
import io.sentry.protocol.x;
import io.sentry.util.q;
import io.sentry.v7;
import io.sentry.y0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends k4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f83339c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v7 f83340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.q f83341b = new io.sentry.util.q(new q.a() { // from class: io.sentry.cache.i
        @Override // io.sentry.util.q.a
        public final Object a() {
            return q.k(this.f83324a);
        }
    });

    class a implements c.a {
        a() {
        }

        @Override // io.sentry.cache.tape.c.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public io.sentry.e b(byte[] bArr) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), q.f83339c));
                try {
                    io.sentry.e eVar = (io.sentry.e) q.this.f83340a.getSerializer().c(bufferedReader, io.sentry.e.class);
                    bufferedReader.close();
                    return eVar;
                } finally {
                }
            } catch (Throwable th2) {
                q.this.f83340a.getLogger().b(g7.ERROR, th2, "Error reading entity from scope cache", new Object[0]);
                return null;
            }
        }

        @Override // io.sentry.cache.tape.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(io.sentry.e eVar, OutputStream outputStream) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, q.f83339c));
            try {
                q.this.f83340a.getSerializer().a(eVar, bufferedWriter);
                bufferedWriter.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public q(v7 v7Var) {
        this.f83340a = v7Var;
    }

    public static /* synthetic */ void a(q qVar, p8 p8Var, y0 y0Var) {
        if (p8Var != null) {
            qVar.v(p8Var, "trace.json");
        } else {
            qVar.getClass();
            qVar.v(y0Var.B().g(), "trace.json");
        }
    }

    public static /* synthetic */ void c(q qVar) {
        qVar.getClass();
        try {
            ((io.sentry.cache.tape.c) qVar.f83341b.a()).clear();
        } catch (IOException e10) {
            qVar.f83340a.getLogger().a(g7.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
    }

    public static /* synthetic */ void d(q qVar, String str) {
        if (str == null) {
            qVar.q("transaction.json");
        } else {
            qVar.v(str, "transaction.json");
        }
    }

    public static /* synthetic */ io.sentry.cache.tape.c k(q qVar) {
        io.sentry.cache.tape.d dVarA;
        File fileB = d.b(qVar.f83340a, ".scope-cache");
        if (fileB == null) {
            qVar.f83340a.getLogger().c(g7.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return io.sentry.cache.tape.c.o();
        }
        File file = new File(fileB, "breadcrumbs.json");
        try {
            try {
                dVarA = new d.a(file).b(qVar.f83340a.getMaxBreadcrumbs()).a();
            } catch (IOException unused) {
                file.delete();
                dVarA = new d.a(file).b(qVar.f83340a.getMaxBreadcrumbs()).a();
            }
            return io.sentry.cache.tape.c.n(dVarA, qVar.new a());
        } catch (IOException e10) {
            qVar.f83340a.getLogger().a(g7.ERROR, "Failed to create breadcrumbs queue", e10);
            return io.sentry.cache.tape.c.o();
        }
    }

    public static /* synthetic */ void l(q qVar, Runnable runnable) {
        qVar.getClass();
        try {
            runnable.run();
        } catch (Throwable th2) {
            qVar.f83340a.getLogger().a(g7.ERROR, "Serialization task failed", th2);
        }
    }

    public static /* synthetic */ void n(q qVar, io.sentry.e eVar) {
        qVar.getClass();
        try {
            ((io.sentry.cache.tape.c) qVar.f83341b.a()).e(eVar);
        } catch (IOException e10) {
            qVar.f83340a.getLogger().a(g7.ERROR, "Failed to add breadcrumb to file queue", e10);
        }
    }

    private void q(String str) {
        d.a(this.f83340a, ".scope-cache", str);
    }

    private void t(final Runnable runnable) {
        if (this.f83340a.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    this.f83340a.getLogger().a(g7.ERROR, "Serialization task failed", th2);
                    return;
                }
            }
            try {
                this.f83340a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.l(this.f83330b, runnable);
                    }
                });
            } catch (Throwable th3) {
                this.f83340a.getLogger().a(g7.ERROR, "Serialization task could not be scheduled", th3);
            }
        }
    }

    public static void u(v7 v7Var, Object obj, String str) {
        d.d(v7Var, obj, ".scope-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(Object obj, String str) {
        u(this.f83340a, obj, str);
    }

    @Override // io.sentry.z0
    public void e(final io.sentry.e eVar) {
        t(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                q.n(this.f83325b, eVar);
            }
        });
    }

    @Override // io.sentry.k4, io.sentry.z0
    public void f(Collection collection) {
        if (collection.isEmpty()) {
            t(new Runnable() { // from class: io.sentry.cache.k
                @Override // java.lang.Runnable
                public final void run() {
                    q.c(this.f83327b);
                }
            });
        }
    }

    @Override // io.sentry.k4, io.sentry.z0
    public void g(final x xVar) {
        t(new Runnable() { // from class: io.sentry.cache.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f83335b.v(xVar, "replay.json");
            }
        });
    }

    @Override // io.sentry.k4, io.sentry.z0
    public void h(final io.sentry.protocol.c cVar) {
        t(new Runnable() { // from class: io.sentry.cache.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f83337b.v(cVar, "contexts.json");
            }
        });
    }

    @Override // io.sentry.z0
    public void i(final p8 p8Var, final y0 y0Var) {
        t(new Runnable() { // from class: io.sentry.cache.n
            @Override // java.lang.Runnable
            public final void run() {
                q.a(this.f83332b, p8Var, y0Var);
            }
        });
    }

    @Override // io.sentry.k4, io.sentry.z0
    public void j(final String str) {
        t(new Runnable() { // from class: io.sentry.cache.l
            @Override // java.lang.Runnable
            public final void run() {
                q.d(this.f83328b, str);
            }
        });
    }

    public Object r(v7 v7Var, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return d.c(v7Var, ".scope-cache", str, cls, null);
        }
        try {
            return cls.cast(((io.sentry.cache.tape.c) this.f83341b.a()).m());
        } catch (IOException unused) {
            v7Var.getLogger().c(g7.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public void s() {
        try {
            ((io.sentry.cache.tape.c) this.f83341b.a()).clear();
        } catch (IOException e10) {
            this.f83340a.getLogger().a(g7.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
        q("user.json");
        q("level.json");
        q("request.json");
        q("fingerprint.json");
        q("contexts.json");
        q("extras.json");
        q("tags.json");
        q("trace.json");
        q("transaction.json");
    }
}

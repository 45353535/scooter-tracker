package io.sentry;

import io.sentry.util.m;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends t implements r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b1 f83258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h1 f83259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ILogger f83260g;

    public b0(b1 b1Var, h1 h1Var, ILogger iLogger, long j10, int i10) {
        super(b1Var, iLogger, j10, i10);
        this.f83258e = (b1) io.sentry.util.w.c(b1Var, "Scopes are required.");
        this.f83259f = (h1) io.sentry.util.w.c(h1Var, "Serializer is required.");
        this.f83260g = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(b0 b0Var, io.sentry.hints.i iVar) {
        b0Var.getClass();
        if (iVar.h()) {
            return;
        }
        b0Var.f83260g.c(g7.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    public static /* synthetic */ void g(b0 b0Var, File file, io.sentry.hints.k kVar) {
        b0Var.getClass();
        if (kVar.b()) {
            b0Var.f83260g.c(g7.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            b0Var.i(file, "after trying to capture it");
            b0Var.f83260g.c(g7.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    public static /* synthetic */ void h(b0 b0Var, Throwable th2, File file, io.sentry.hints.k kVar) {
        b0Var.getClass();
        kVar.d(false);
        b0Var.f83260g.b(g7.INFO, th2, "File '%s' won't retry.", file.getAbsolutePath());
    }

    private void i(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f83260g.c(g7.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th2) {
            this.f83260g.b(g7.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.r0
    public void a(String str, i0 i0Var) {
        io.sentry.util.w.c(str, "Path is required.");
        e(new File(str), i0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.t
    public boolean c(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.t
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.t
    protected void e(final File file, i0 i0Var) {
        ILogger iLogger;
        m.a aVar;
        if (!file.isFile()) {
            this.f83260g.c(g7.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!c(file.getName())) {
            this.f83260g.c(g7.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f83260g.c(g7.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        u5 u5VarE = this.f83259f.e(bufferedInputStream);
                        if (u5VarE == null) {
                            this.f83260g.c(g7.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f83258e.w(u5VarE, i0Var);
                        }
                        io.sentry.util.m.m(i0Var, io.sentry.hints.i.class, this.f83260g, new m.a() { // from class: io.sentry.y
                            @Override // io.sentry.util.m.a
                            public final void accept(Object obj) {
                                b0.f(this.f84458a, (io.sentry.hints.i) obj);
                            }
                        });
                        bufferedInputStream.close();
                        io.sentry.util.m.m(i0Var, io.sentry.hints.k.class, this.f83260g, new m.a() { // from class: io.sentry.z
                            @Override // io.sentry.util.m.a
                            public final void accept(Object obj) {
                                b0.g(this.f84500a, file, (io.sentry.hints.k) obj);
                            }
                        });
                    } catch (Throwable th2) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException e10) {
                    this.f83260g.b(g7.ERROR, e10, "File '%s' cannot be found.", file.getAbsolutePath());
                    iLogger = this.f83260g;
                    aVar = new m.a() { // from class: io.sentry.z
                        @Override // io.sentry.util.m.a
                        public final void accept(Object obj) {
                            b0.g(this.f84500a, file, (io.sentry.hints.k) obj);
                        }
                    };
                    io.sentry.util.m.m(i0Var, io.sentry.hints.k.class, iLogger, aVar);
                } catch (Throwable th4) {
                    this.f83260g.b(g7.ERROR, th4, "Failed to capture cached envelope %s", file.getAbsolutePath());
                    io.sentry.util.m.m(i0Var, io.sentry.hints.k.class, this.f83260g, new m.a() { // from class: io.sentry.a0
                        @Override // io.sentry.util.m.a
                        public final void accept(Object obj) {
                            b0.h(this.f82219a, th4, file, (io.sentry.hints.k) obj);
                        }
                    });
                    iLogger = this.f83260g;
                    aVar = new m.a() { // from class: io.sentry.z
                        @Override // io.sentry.util.m.a
                        public final void accept(Object obj) {
                            b0.g(this.f84500a, file, (io.sentry.hints.k) obj);
                        }
                    };
                    io.sentry.util.m.m(i0Var, io.sentry.hints.k.class, iLogger, aVar);
                }
            } catch (IOException e11) {
                this.f83260g.b(g7.ERROR, e11, "I/O on file '%s' failed.", file.getAbsolutePath());
                iLogger = this.f83260g;
                aVar = new m.a() { // from class: io.sentry.z
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        b0.g(this.f84500a, file, (io.sentry.hints.k) obj);
                    }
                };
                io.sentry.util.m.m(i0Var, io.sentry.hints.k.class, iLogger, aVar);
            }
        } catch (Throwable th5) {
            io.sentry.util.m.m(i0Var, io.sentry.hints.k.class, this.f83260g, new m.a() { // from class: io.sentry.z
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    b0.g(this.f84500a, file, (io.sentry.hints.k) obj);
                }
            });
            throw th5;
        }
    }
}

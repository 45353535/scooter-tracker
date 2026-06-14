package io.sentry;

import io.sentry.util.m;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class r3 extends t implements r0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Charset f84087i = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b1 f84088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q0 f84089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h1 f84090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ILogger f84091h;

    public r3(b1 b1Var, q0 q0Var, h1 h1Var, ILogger iLogger, long j10, int i10) {
        super(b1Var, iLogger, j10, i10);
        this.f84088e = (b1) io.sentry.util.w.c(b1Var, "Scopes are required.");
        this.f84089f = (q0) io.sentry.util.w.c(q0Var, "Envelope reader is required.");
        this.f84090g = (h1) io.sentry.util.w.c(h1Var, "Serializer is required.");
        this.f84091h = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(r3 r3Var, File file, io.sentry.hints.k kVar) {
        r3Var.getClass();
        if (kVar.b()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            r3Var.f84091h.c(g7.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e10) {
            r3Var.f84091h.b(g7.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    private d9 h(b9 b9Var) {
        String strB;
        if (b9Var != null && (strB = b9Var.b()) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(strB));
                if (io.sentry.util.a0.h(dValueOf, false)) {
                    String strA = b9Var.a();
                    if (strA != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(strA));
                        if (io.sentry.util.a0.h(dValueOf2, false)) {
                            return new d9(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return io.sentry.util.a0.a(new d9(Boolean.TRUE, dValueOf));
                }
                this.f84091h.c(g7.ERROR, "Invalid sample rate parsed from TraceContext: %s", strB);
            } catch (Exception unused) {
                this.f84091h.c(g7.ERROR, "Unable to parse sample rate from TraceContext: %s", strB);
            }
        }
        return new d9(Boolean.TRUE);
    }

    private void i(u6 u6Var, int i10) {
        this.f84091h.c(g7.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i10), u6Var.J().b());
    }

    private void j(int i10) {
        this.f84091h.c(g7.DEBUG, "Item %d is being captured.", Integer.valueOf(i10));
    }

    private void k(io.sentry.protocol.x xVar) {
        this.f84091h.c(g7.WARNING, "Timed out waiting for event id submission: %s", xVar);
    }

    private void l(u5 u5Var, io.sentry.protocol.x xVar, int i10) {
        this.f84091h.c(g7.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i10), u5Var.b().a(), xVar);
    }

    private void m(u5 u5Var, i0 i0Var) {
        BufferedReader bufferedReader;
        Object objG;
        this.f84091h.c(g7.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(io.sentry.util.c.e(u5Var.c())));
        int i10 = 0;
        for (u6 u6Var : u5Var.c()) {
            i10++;
            if (u6Var.J() == null) {
                this.f84091h.c(g7.ERROR, "Item %d has no header", Integer.valueOf(i10));
            } else if (f7.Event.equals(u6Var.J().b())) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(u6Var.I()), f84087i));
                } catch (Throwable th2) {
                    this.f84091h.a(g7.ERROR, "Item failed to process.", th2);
                }
                try {
                    w6 w6Var = (w6) this.f84090g.c(bufferedReader, w6.class);
                    if (w6Var == null) {
                        i(u6Var, i10);
                    } else {
                        if (w6Var.L() != null) {
                            io.sentry.util.m.o(i0Var, w6Var.L().e());
                        }
                        if (u5Var.b().a() == null || u5Var.b().a().equals(w6Var.G())) {
                            this.f84088e.I(w6Var, i0Var);
                            j(i10);
                            if (!n(i0Var)) {
                                k(w6Var.G());
                                bufferedReader.close();
                                return;
                            }
                        } else {
                            l(u5Var, w6Var.G(), i10);
                            bufferedReader.close();
                        }
                    }
                    bufferedReader.close();
                    objG = io.sentry.util.m.g(i0Var);
                    if (!(objG instanceof io.sentry.hints.p) && !((io.sentry.hints.p) objG).isSuccess()) {
                        this.f84091h.c(g7.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i10));
                        return;
                    }
                    io.sentry.util.m.k(i0Var, io.sentry.hints.j.class, new m.a() { // from class: io.sentry.q3
                        @Override // io.sentry.util.m.a
                        public final void accept(Object obj) {
                            ((io.sentry.hints.j) obj).reset();
                        }
                    });
                } finally {
                }
            } else {
                if (f7.Transaction.equals(u6Var.J().b())) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(u6Var.I()), f84087i));
                        try {
                            io.sentry.protocol.e0 e0Var = (io.sentry.protocol.e0) this.f84090g.c(bufferedReader, io.sentry.protocol.e0.class);
                            if (e0Var == null) {
                                i(u6Var, i10);
                            } else if (u5Var.b().a() == null || u5Var.b().a().equals(e0Var.G())) {
                                b9 b9VarC = u5Var.b().c();
                                if (e0Var.C().j() != null) {
                                    e0Var.C().j().u(h(b9VarC));
                                }
                                this.f84088e.D(e0Var, b9VarC, i0Var);
                                j(i10);
                                if (!n(i0Var)) {
                                    k(e0Var.G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                l(u5Var, e0Var.G(), i10);
                                bufferedReader.close();
                            }
                            bufferedReader.close();
                        } finally {
                        }
                    } catch (Throwable th3) {
                        this.f84091h.a(g7.ERROR, "Item failed to process.", th3);
                    }
                } else {
                    this.f84088e.w(new u5(u5Var.b().a(), u5Var.b().b(), u6Var), i0Var);
                    this.f84091h.c(g7.DEBUG, "%s item %d is being captured.", u6Var.J().b().getItemType(), Integer.valueOf(i10));
                    if (!n(i0Var)) {
                        this.f84091h.c(g7.WARNING, "Timed out waiting for item type submission: %s", u6Var.J().b().getItemType());
                        return;
                    }
                }
                objG = io.sentry.util.m.g(i0Var);
                if (!(objG instanceof io.sentry.hints.p)) {
                }
                io.sentry.util.m.k(i0Var, io.sentry.hints.j.class, new m.a() { // from class: io.sentry.q3
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.j) obj).reset();
                    }
                });
            }
        }
    }

    private boolean n(i0 i0Var) {
        Object objG = io.sentry.util.m.g(i0Var);
        if (objG instanceof io.sentry.hints.i) {
            return ((io.sentry.hints.i) objG).h();
        }
        io.sentry.util.u.a(io.sentry.hints.i.class, objG, this.f84091h);
        return true;
    }

    @Override // io.sentry.r0
    public void a(String str, i0 i0Var) {
        io.sentry.util.w.c(str, "Path is required.");
        e(new File(str), i0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.t
    public boolean c(String str) {
        return (str == null || str.startsWith(com.taurusx.tax.g.b.f66095s) || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.t
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.t
    protected void e(final File file, i0 i0Var) {
        io.sentry.util.w.c(file, "File is required.");
        try {
            if (!c(file.getName())) {
                this.f84091h.c(g7.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                u5 u5VarA = this.f84089f.a(bufferedInputStream);
                if (u5VarA == null) {
                    this.f84091h.c(g7.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                } else {
                    m(u5VarA, i0Var);
                    this.f84091h.c(g7.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                }
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f84091h.a(g7.ERROR, "Error processing envelope.", e10);
        } finally {
            io.sentry.util.m.m(i0Var, io.sentry.hints.k.class, this.f84091h, new m.a() { // from class: io.sentry.p3
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    r3.f(this.f83796a, file, (io.sentry.hints.k) obj);
                }
            });
        }
    }
}

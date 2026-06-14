package io.sentry;

import io.sentry.h4;
import io.sentry.k8;
import io.sentry.v7;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q5 implements e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f84075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.transport.r f84076c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.logger.b f84078e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f84077d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f84074a = true;

    private static final class b implements Comparator {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            return eVar.p().compareTo(eVar2.p());
        }
    }

    public q5(v7 v7Var) {
        this.f84075b = (v7) io.sentry.util.w.c(v7Var, "SentryOptions is required.");
        n1 transportFactory = v7Var.getTransportFactory();
        if (transportFactory instanceof j3) {
            transportFactory = new io.sentry.a();
            v7Var.setTransportFactory(transportFactory);
        }
        this.f84076c = transportFactory.a(v7Var, new f4(v7Var).a());
        if (v7Var.getLogs().a()) {
            this.f84078e = new io.sentry.logger.e(v7Var, this);
        } else {
            this.f84078e = io.sentry.logger.f.a();
        }
    }

    private b9 A(y0 y0Var, i0 i0Var, n5 n5Var, String str) {
        if (io.sentry.util.m.h(i0Var, io.sentry.hints.c.class)) {
            if (n5Var != null) {
                return d.c(n5Var, str, this.f84075b).J();
            }
            return null;
        }
        if (y0Var == null) {
            return null;
        }
        l1 transaction = y0Var.getTransaction();
        return transaction != null ? transaction.j() : io.sentry.util.h0.g(y0Var, this.f84075b).h();
    }

    private b9 B(y0 y0Var, i0 i0Var, w6 w6Var) {
        return A(y0Var, i0Var, w6Var, w6Var != null ? w6Var.y0() : null);
    }

    private w6 C(w6 w6Var, i0 i0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d0 d0Var = (d0) it.next();
            try {
                boolean z10 = d0Var instanceof c;
                boolean zH = io.sentry.util.m.h(i0Var, io.sentry.hints.c.class);
                if (zH && z10) {
                    w6Var = d0Var.d(w6Var, i0Var);
                } else if (!zH && !z10) {
                    w6Var = d0Var.d(w6Var, i0Var);
                }
            } catch (Throwable th2) {
                this.f84075b.getLogger().b(g7.ERROR, th2, "An exception occurred while processing event by processor: %s", d0Var.getClass().getName());
            }
            if (w6Var == null) {
                this.f84075b.getLogger().c(g7.DEBUG, "Event was dropped by a processor: %s", d0Var.getClass().getName());
                this.f84075b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, k.Error);
                break;
            }
        }
        return w6Var;
    }

    private w7 D(w7 w7Var, i0 i0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d0 d0Var = (d0) it.next();
            try {
                w7Var = d0Var.c(w7Var, i0Var);
            } catch (Throwable th2) {
                this.f84075b.getLogger().b(g7.ERROR, th2, "An exception occurred while processing replay event by processor: %s", d0Var.getClass().getName());
            }
            if (w7Var == null) {
                this.f84075b.getLogger().c(g7.DEBUG, "Replay event was dropped by a processor: %s", d0Var.getClass().getName());
                this.f84075b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, k.Replay);
                break;
            }
        }
        return w7Var;
    }

    private io.sentry.protocol.e0 E(io.sentry.protocol.e0 e0Var, i0 i0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d0 d0Var = (d0) it.next();
            int size = e0Var.q0().size();
            try {
                e0Var = d0Var.e(e0Var, i0Var);
            } catch (Throwable th2) {
                this.f84075b.getLogger().b(g7.ERROR, th2, "An exception occurred while processing transaction by processor: %s", d0Var.getClass().getName());
            }
            int size2 = e0Var == null ? 0 : e0Var.q0().size();
            if (e0Var == null) {
                this.f84075b.getLogger().c(g7.DEBUG, "Transaction was dropped by a processor: %s", d0Var.getClass().getName());
                io.sentry.clientreport.h clientReportRecorder = this.f84075b.getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
                clientReportRecorder.a(fVar, k.Transaction);
                this.f84075b.getClientReportRecorder().b(fVar, k.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i10 = size - size2;
                this.f84075b.getLogger().c(g7.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i10), d0Var.getClass().getName());
                this.f84075b.getClientReportRecorder().b(io.sentry.clientreport.f.EVENT_PROCESSOR, k.Span, i10);
            }
        }
        return e0Var;
    }

    private boolean F() {
        io.sentry.util.z zVarA = this.f84075b.getSampleRate() == null ? null : io.sentry.util.b0.a();
        return this.f84075b.getSampleRate() == null || zVarA == null || this.f84075b.getSampleRate().doubleValue() >= zVarA.h();
    }

    private io.sentry.protocol.x G(u5 u5Var, i0 i0Var) {
        v7.b beforeEnvelopeCallback = this.f84075b.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                beforeEnvelopeCallback.d(u5Var, i0Var);
            } catch (Throwable th2) {
                this.f84075b.getLogger().a(g7.ERROR, "The BeforeEnvelope callback threw an exception.", th2);
            }
        }
        e7.d().c(this.f84075b.getLogger());
        if (i0Var == null) {
            this.f84076c.o0(u5Var);
        } else {
            this.f84076c.k(u5Var, i0Var);
        }
        io.sentry.protocol.x xVarA = u5Var.b().a();
        return xVarA != null ? xVarA : io.sentry.protocol.x.f84062c;
    }

    private boolean H(n5 n5Var, i0 i0Var) {
        if (io.sentry.util.m.q(i0Var)) {
            return true;
        }
        this.f84075b.getLogger().c(g7.DEBUG, "Event was cached so not applying scope: %s", n5Var.G());
        return false;
    }

    private boolean I(k8 k8Var, k8 k8Var2) {
        if (k8Var2 == null) {
            return false;
        }
        if (k8Var == null) {
            return true;
        }
        k8.b bVarL = k8Var2.l();
        k8.b bVar = k8.b.Crashed;
        if (bVarL != bVar || k8Var.l() == bVar) {
            return k8Var2.e() > 0 && k8Var.e() <= 0;
        }
        return true;
    }

    private void J(n5 n5Var, Collection collection) {
        List listB = n5Var.B();
        if (listB == null || collection.isEmpty()) {
            return;
        }
        listB.addAll(collection);
        Collections.sort(listB, this.f84077d);
    }

    public static /* synthetic */ void h(k8 k8Var) {
    }

    public static /* synthetic */ void i(q5 q5Var, w6 w6Var, i0 i0Var, k8 k8Var) {
        if (k8Var == null) {
            q5Var.f84075b.getLogger().c(g7.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        q5Var.getClass();
        String strD = null;
        k8.b bVar = w6Var.A0() ? k8.b.Crashed : null;
        boolean z10 = k8.b.Crashed == bVar || w6Var.B0();
        String str = (w6Var.K() == null || w6Var.K().l() == null || !w6Var.K().l().containsKey("user-agent")) ? null : (String) w6Var.K().l().get("user-agent");
        Object objG = io.sentry.util.m.g(i0Var);
        if (objG instanceof io.sentry.hints.a) {
            strD = ((io.sentry.hints.a) objG).d();
            bVar = k8.b.Abnormal;
        }
        if (k8Var.q(bVar, str, z10, strD) && k8Var.m()) {
            k8Var.c();
        }
    }

    private void k(y0 y0Var, i0 i0Var) {
        if (y0Var != null) {
            i0Var.a(y0Var.C());
        }
    }

    private n5 l(n5 n5Var, y0 y0Var) {
        if (y0Var != null) {
            if (n5Var.K() == null) {
                n5Var.c0(y0Var.getRequest());
            }
            if (n5Var.Q() == null) {
                n5Var.h0(y0Var.getUser());
            }
            if (n5Var.N() == null) {
                n5Var.g0(new HashMap(y0Var.j()));
            } else {
                for (Map.Entry entry : y0Var.j().entrySet()) {
                    if (!n5Var.N().containsKey(entry.getKey())) {
                        n5Var.N().put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (n5Var.B() == null) {
                n5Var.T(new ArrayList(y0Var.h()));
            } else {
                J(n5Var, y0Var.h());
            }
            if (n5Var.H() == null) {
                n5Var.Z(new HashMap(y0Var.getExtras()));
            } else {
                for (Map.Entry entry2 : y0Var.getExtras().entrySet()) {
                    if (!n5Var.H().containsKey(entry2.getKey())) {
                        n5Var.H().put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            io.sentry.protocol.c cVarC = n5Var.C();
            for (Map.Entry entry3 : new io.sentry.protocol.c(y0Var.k()).b()) {
                if (!cVarC.a(entry3.getKey())) {
                    cVarC.l((String) entry3.getKey(), entry3.getValue());
                }
            }
        }
        return n5Var;
    }

    private w6 m(w6 w6Var, y0 y0Var, i0 i0Var) {
        io.sentry.protocol.g featureFlags;
        if (y0Var == null) {
            return w6Var;
        }
        l(w6Var, y0Var);
        if (w6Var.y0() == null) {
            w6Var.J0(y0Var.A());
        }
        if (w6Var.s0() == null) {
            w6Var.D0(y0Var.z());
        }
        if (y0Var.getLevel() != null) {
            w6Var.E0(y0Var.getLevel());
        }
        j1 j1VarW = y0Var.w();
        if (w6Var.C().j() == null) {
            if (j1VarW == null) {
                w6Var.C().z(e9.x(y0Var.B()));
            } else {
                w6Var.C().z(j1VarW.e());
            }
        }
        if (w6Var.C().f() == null && (featureFlags = y0Var.getFeatureFlags()) != null) {
            w6Var.C().r(featureFlags);
        }
        return C(w6Var, i0Var, y0Var.t());
    }

    private w7 n(w7 w7Var, y0 y0Var) {
        if (y0Var != null) {
            if (w7Var.K() == null) {
                w7Var.c0(y0Var.getRequest());
            }
            if (w7Var.Q() == null) {
                w7Var.h0(y0Var.getUser());
            }
            if (w7Var.N() == null) {
                w7Var.g0(new HashMap(y0Var.j()));
            } else {
                for (Map.Entry entry : y0Var.j().entrySet()) {
                    if (!w7Var.N().containsKey(entry.getKey())) {
                        w7Var.N().put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            io.sentry.protocol.c cVarC = w7Var.C();
            for (Map.Entry entry2 : new io.sentry.protocol.c(y0Var.k()).b()) {
                if (!cVarC.a(entry2.getKey())) {
                    cVarC.l((String) entry2.getKey(), entry2.getValue());
                }
            }
            j1 j1VarW = y0Var.w();
            if (w7Var.C().j() == null) {
                if (j1VarW == null) {
                    w7Var.C().z(e9.x(y0Var.B()));
                    return w7Var;
                }
                w7Var.C().z(j1VarW.e());
            }
        }
        return w7Var;
    }

    private u5 o(n5 n5Var, List list, k8 k8Var, b9 b9Var, y3 y3Var) {
        io.sentry.protocol.x xVar;
        ArrayList arrayList = new ArrayList();
        if (n5Var != null) {
            arrayList.add(u6.B(this.f84075b.getSerializer(), n5Var));
            xVar = n5Var.G();
        } else {
            xVar = null;
        }
        if (k8Var != null) {
            arrayList.add(u6.G(this.f84075b.getSerializer(), k8Var));
        }
        if (y3Var != null) {
            arrayList.add(u6.E(y3Var, this.f84075b.getMaxTraceFileSize(), this.f84075b.getSerializer()));
            if (xVar == null) {
                xVar = new io.sentry.protocol.x(y3Var.B());
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(u6.z(this.f84075b.getSerializer(), this.f84075b.getLogger(), (io.sentry.b) it.next(), this.f84075b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new u5(new v5(xVar, this.f84075b.getSdkVersion(), b9Var), arrayList);
    }

    private u5 p(k7 k7Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(u6.C(this.f84075b.getSerializer(), k7Var));
        return new u5(new v5(null, this.f84075b.getSdkVersion(), null), arrayList);
    }

    private u5 q(w7 w7Var, d4 d4Var, b9 b9Var, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(u6.F(this.f84075b.getSerializer(), this.f84075b.getLogger(), w7Var, d4Var, z10));
        return new u5(new v5(w7Var.G(), this.f84075b.getSessionReplay().j(), b9Var), arrayList);
    }

    private w6 r(w6 w6Var, i0 i0Var) {
        v7.c beforeSend = this.f84075b.getBeforeSend();
        if (beforeSend == null) {
            return w6Var;
        }
        try {
            return beforeSend.a(w6Var, i0Var);
        } catch (Throwable th2) {
            this.f84075b.getLogger().a(g7.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
            return null;
        }
    }

    private w7 s(w7 w7Var, i0 i0Var) {
        this.f84075b.getBeforeSendReplay();
        return w7Var;
    }

    private io.sentry.protocol.e0 t(io.sentry.protocol.e0 e0Var, i0 i0Var) {
        this.f84075b.getBeforeSendTransaction();
        return e0Var;
    }

    private List x(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            io.sentry.b bVar = (io.sentry.b) it.next();
            if (bVar.k()) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private void y(y0 y0Var, i0 i0Var) {
        l1 transaction = y0Var.getTransaction();
        if (transaction == null || !io.sentry.util.m.h(i0Var, io.sentry.hints.q.class)) {
            return;
        }
        Object objG = io.sentry.util.m.g(i0Var);
        if (!(objG instanceof io.sentry.hints.f)) {
            transaction.a(w8.ABORTED, false, null);
        } else {
            ((io.sentry.hints.f) objG).g(transaction.getEventId());
            transaction.a(w8.ABORTED, false, i0Var);
        }
    }

    private List z(i0 i0Var) {
        List listE = i0Var.e();
        io.sentry.b bVarG = i0Var.g();
        if (bVarG != null) {
            listE.add(bVarG);
        }
        io.sentry.b bVarI = i0Var.i();
        if (bVarI != null) {
            listE.add(bVarI);
        }
        io.sentry.b bVarH = i0Var.h();
        if (bVarH != null) {
            listE.add(bVarH);
        }
        return listE;
    }

    k8 K(final w6 w6Var, final i0 i0Var, y0 y0Var) {
        if (io.sentry.util.m.q(i0Var)) {
            if (y0Var != null) {
                return y0Var.i(new h4.b() { // from class: io.sentry.p5
                    @Override // io.sentry.h4.b
                    public final void a(k8 k8Var) {
                        q5.i(this.f83799a, w6Var, i0Var, k8Var);
                    }
                });
            }
            this.f84075b.getLogger().c(g7.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.x a(u3 u3Var, y0 y0Var) {
        io.sentry.util.w.c(u3Var, "profileChunk is required.");
        this.f84075b.getLogger().c(g7.DEBUG, "Capturing profile chunk: %s", u3Var.n());
        io.sentry.protocol.x xVarN = u3Var.n();
        io.sentry.protocol.d dVarC = io.sentry.protocol.d.c(u3Var.o(), this.f84075b);
        if (dVarC != null) {
            u3Var.r(dVarC);
        }
        try {
            return G(new u5(new v5(xVarN, this.f84075b.getSdkVersion(), null), Collections.singletonList(u6.D(u3Var, this.f84075b.getSerializer(), this.f84075b.getProfilerConverter()))), null);
        } catch (io.sentry.exception.b | IOException e10) {
            this.f84075b.getLogger().b(g7.WARNING, e10, "Capturing profile chunk %s failed.", xVarN);
            return io.sentry.protocol.x.f84062c;
        }
    }

    @Override // io.sentry.e1
    public void b(boolean z10) {
        long shutdownTimeoutMillis;
        this.f84075b.getLogger().c(g7.INFO, "Closing SentryClient.", new Object[0]);
        if (z10) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = this.f84075b.getShutdownTimeoutMillis();
            } catch (IOException e10) {
                this.f84075b.getLogger().a(g7.WARNING, "Failed to close the connection to the Sentry Server.", e10);
            }
        }
        j(shutdownTimeoutMillis);
        this.f84078e.b(z10);
        this.f84076c.b(z10);
        for (d0 d0Var : this.f84075b.getEventProcessors()) {
            if (d0Var instanceof Closeable) {
                try {
                    ((Closeable) d0Var).close();
                } catch (IOException e11) {
                    this.f84075b.getLogger().c(g7.WARNING, "Failed to close the event processor {}.", d0Var, e11);
                }
            }
        }
        this.f84074a = false;
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.x c(w7 w7Var, y0 y0Var, i0 i0Var) {
        io.sentry.util.w.c(w7Var, "SessionReplay is required.");
        if (i0Var == null) {
            i0Var = new i0();
        }
        if (H(w7Var, i0Var)) {
            n(w7Var, y0Var);
        }
        ILogger logger = this.f84075b.getLogger();
        g7 g7Var = g7.DEBUG;
        logger.c(g7Var, "Capturing session replay: %s", w7Var.G());
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
        io.sentry.protocol.x xVarG = w7Var.G() != null ? w7Var.G() : xVar;
        w7 w7VarD = D(w7Var, i0Var, this.f84075b.getEventProcessors());
        if (w7VarD != null && (w7VarD = s(w7VarD, i0Var)) == null) {
            this.f84075b.getLogger().c(g7Var, "Event was dropped by beforeSendReplay", new Object[0]);
            this.f84075b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, k.Replay);
        }
        if (w7VarD == null) {
            return xVar;
        }
        try {
            u5 u5VarQ = q(w7VarD, i0Var.f(), A(y0Var, i0Var, w7VarD, null), io.sentry.util.m.h(i0Var, io.sentry.hints.c.class));
            i0Var.b();
            this.f84076c.k(u5VarQ, i0Var);
            return xVarG;
        } catch (IOException e10) {
            this.f84075b.getLogger().b(g7.WARNING, e10, "Capturing event %s failed.", xVarG);
            return io.sentry.protocol.x.f84062c;
        }
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.x d(io.sentry.protocol.e0 e0Var, b9 b9Var, y0 y0Var, i0 i0Var, y3 y3Var) {
        io.sentry.util.w.c(e0Var, "Transaction is required.");
        i0 i0Var2 = i0Var == null ? new i0() : i0Var;
        if (H(e0Var, i0Var2)) {
            k(y0Var, i0Var2);
        }
        ILogger logger = this.f84075b.getLogger();
        g7 g7Var = g7.DEBUG;
        logger.c(g7Var, "Capturing transaction: %s", e0Var.G());
        if (io.sentry.util.h0.f(this.f84075b.getIgnoredTransactions(), e0Var.r0())) {
            this.f84075b.getLogger().c(g7Var, "Transaction was dropped as transaction name %s is ignored", e0Var.r0());
            io.sentry.clientreport.h clientReportRecorder = this.f84075b.getClientReportRecorder();
            io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
            clientReportRecorder.a(fVar, k.Transaction);
            this.f84075b.getClientReportRecorder().b(fVar, k.Span, e0Var.q0().size() + 1);
            return io.sentry.protocol.x.f84062c;
        }
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
        io.sentry.protocol.x xVarG = e0Var.G() != null ? e0Var.G() : xVar;
        if (H(e0Var, i0Var2)) {
            e0Var = (io.sentry.protocol.e0) l(e0Var, y0Var);
            if (e0Var != null && y0Var != null) {
                e0Var = E(e0Var, i0Var2, y0Var.t());
            }
            if (e0Var == null) {
                this.f84075b.getLogger().c(g7Var, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (e0Var != null) {
            e0Var = E(e0Var, i0Var2, this.f84075b.getEventProcessors());
        }
        if (e0Var == null) {
            this.f84075b.getLogger().c(g7Var, "Transaction was dropped by Event processors.", new Object[0]);
            return xVar;
        }
        int size = e0Var.q0().size();
        io.sentry.protocol.e0 e0VarT = t(e0Var, i0Var2);
        int size2 = e0VarT == null ? 0 : e0VarT.q0().size();
        if (e0VarT == null) {
            this.f84075b.getLogger().c(g7Var, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            io.sentry.clientreport.h clientReportRecorder2 = this.f84075b.getClientReportRecorder();
            io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.BEFORE_SEND;
            clientReportRecorder2.a(fVar2, k.Transaction);
            this.f84075b.getClientReportRecorder().b(fVar2, k.Span, size + 1);
            return xVar;
        }
        if (size2 < size) {
            int i10 = size - size2;
            this.f84075b.getLogger().c(g7Var, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i10));
            this.f84075b.getClientReportRecorder().b(io.sentry.clientreport.f.BEFORE_SEND, k.Span, i10);
        }
        try {
            u5 u5VarO = o(e0VarT, x(z(i0Var2)), null, b9Var, y3Var);
            i0Var2.b();
            return u5VarO != null ? G(u5VarO, i0Var2) : xVarG;
        } catch (io.sentry.exception.b | IOException e10) {
            this.f84075b.getLogger().b(g7.WARNING, e10, "Capturing transaction %s failed.", xVarG);
            return io.sentry.protocol.x.f84062c;
        }
    }

    @Override // io.sentry.e1
    public void e(k8 k8Var, i0 i0Var) {
        io.sentry.util.w.c(k8Var, "Session is required.");
        if (k8Var.h() == null || k8Var.h().isEmpty()) {
            this.f84075b.getLogger().c(g7.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            w(u5.a(this.f84075b.getSerializer(), k8Var, this.f84075b.getSdkVersion()), i0Var);
        } catch (IOException e10) {
            this.f84075b.getLogger().a(g7.ERROR, "Failed to capture session.", e10);
        }
    }

    @Override // io.sentry.e1
    public void f(k7 k7Var) {
        try {
            G(p(k7Var), null);
        } catch (IOException e10) {
            this.f84075b.getLogger().b(g7.WARNING, e10, "Capturing log failed.", new Object[0]);
        }
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.x g(w6 w6Var, y0 y0Var, i0 i0Var) {
        w6 w6Var2;
        q5 q5Var;
        io.sentry.util.w.c(w6Var, "SentryEvent is required.");
        if (i0Var == null) {
            i0Var = new i0();
        }
        if (H(w6Var, i0Var)) {
            k(y0Var, i0Var);
        }
        ILogger logger = this.f84075b.getLogger();
        g7 g7Var = g7.DEBUG;
        logger.c(g7Var, "Capturing event: %s", w6Var.G());
        Throwable thO = w6Var.O();
        if (thO != null && io.sentry.util.g.b(this.f84075b.getIgnoredExceptionsForType(), thO)) {
            this.f84075b.getLogger().c(g7Var, "Event was dropped as the exception %s is ignored", thO.getClass());
            this.f84075b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, k.Error);
            return io.sentry.protocol.x.f84062c;
        }
        if (io.sentry.util.e.a(this.f84075b.getIgnoredErrors(), w6Var)) {
            this.f84075b.getLogger().c(g7Var, "Event was dropped as it matched a string/pattern in ignoredErrors", w6Var.u0());
            this.f84075b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, k.Error);
            return io.sentry.protocol.x.f84062c;
        }
        if (H(w6Var, i0Var) && (w6Var = m(w6Var, y0Var, i0Var)) == null) {
            this.f84075b.getLogger().c(g7Var, "Event was dropped by applyScope", new Object[0]);
            return io.sentry.protocol.x.f84062c;
        }
        w6 w6VarC = C(w6Var, i0Var, this.f84075b.getEventProcessors());
        if (w6VarC != null && (w6VarC = r(w6VarC, i0Var)) == null) {
            this.f84075b.getLogger().c(g7Var, "Event was dropped by beforeSend", new Object[0]);
            this.f84075b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, k.Error);
        }
        if (w6VarC == null) {
            return io.sentry.protocol.x.f84062c;
        }
        k8 k8VarI = y0Var != null ? y0Var.i(new h4.b() { // from class: io.sentry.o5
            @Override // io.sentry.h4.b
            public final void a(k8 k8Var) {
                q5.h(k8Var);
            }
        }) : null;
        k8 k8VarK = (k8VarI == null || !k8VarI.m()) ? K(w6VarC, i0Var, y0Var) : null;
        if (F()) {
            w6Var2 = w6VarC;
        } else {
            this.f84075b.getLogger().c(g7Var, "Event %s was dropped due to sampling decision.", w6VarC.G());
            this.f84075b.getClientReportRecorder().a(io.sentry.clientreport.f.SAMPLE_RATE, k.Error);
            w6Var2 = null;
        }
        boolean zI = I(k8VarI, k8VarK);
        if (w6Var2 == null && !zI) {
            this.f84075b.getLogger().c(g7Var, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.x.f84062c;
        }
        io.sentry.protocol.x xVarG = io.sentry.protocol.x.f84062c;
        if (w6Var2 != null && w6Var2.G() != null) {
            xVarG = w6Var2.G();
        }
        boolean zH = io.sentry.util.m.h(i0Var, io.sentry.hints.c.class);
        boolean z10 = io.sentry.util.m.h(i0Var, io.sentry.hints.e.class) && !io.sentry.util.m.h(i0Var, io.sentry.hints.b.class);
        if (w6Var2 != null && !zH && !z10 && (w6Var2.B0() || w6Var2.A0())) {
            this.f84075b.getReplayController().n(Boolean.valueOf(w6Var2.A0()));
        }
        try {
            q5Var = this;
        } catch (io.sentry.exception.b | IOException e10) {
            e = e10;
            q5Var = this;
        }
        try {
            u5 u5VarO = q5Var.o(w6Var2, w6Var2 != null ? z(i0Var) : null, k8VarK, B(y0Var, i0Var, w6Var2), null);
            i0Var.b();
            if (u5VarO != null) {
                xVarG = G(u5VarO, i0Var);
            }
        } catch (io.sentry.exception.b e11) {
            e = e11;
            q5Var.f84075b.getLogger().b(g7.WARNING, e, "Capturing event %s failed.", xVarG);
            xVarG = io.sentry.protocol.x.f84062c;
        } catch (IOException e12) {
            e = e12;
            q5Var.f84075b.getLogger().b(g7.WARNING, e, "Capturing event %s failed.", xVarG);
            xVarG = io.sentry.protocol.x.f84062c;
        }
        if (y0Var != null) {
            y(y0Var, i0Var);
        }
        return xVarG;
    }

    @Override // io.sentry.e1
    public boolean isEnabled() {
        return this.f84074a;
    }

    @Override // io.sentry.e1
    public void j(long j10) {
        this.f84078e.j(j10);
        this.f84076c.j(j10);
    }

    @Override // io.sentry.e1
    public boolean u() {
        return this.f84076c.u();
    }

    @Override // io.sentry.e1
    public io.sentry.transport.b0 v() {
        return this.f84076c.v();
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.x w(u5 u5Var, i0 i0Var) {
        io.sentry.util.w.c(u5Var, "SentryEnvelope is required.");
        if (i0Var == null) {
            i0Var = new i0();
        }
        try {
            i0Var.b();
            return G(u5Var, i0Var);
        } catch (IOException e10) {
            this.f84075b.getLogger().a(g7.ERROR, "Failed to capture envelope.", e10);
            return io.sentry.protocol.x.f84062c;
        }
    }
}

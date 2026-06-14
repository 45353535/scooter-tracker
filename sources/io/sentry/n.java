package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f83739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v7 f83740g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.a f83734a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Timer f83735b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f83736c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f83741h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f83742i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f83737d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f83738e = new ArrayList();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Iterator it = n.this.f83737d.iterator();
            while (it.hasNext()) {
                ((w0) it.next()).c();
            }
        }
    }

    class b extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f83744b;

        b(List list) {
            this.f83744b = list;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - n.this.f83742i <= 10) {
                return;
            }
            this.f83744b.clear();
            n.this.f83742i = jCurrentTimeMillis;
            s3 s3Var = new s3(n.this.f83740g.getDateProvider().a().g());
            Iterator it = n.this.f83737d.iterator();
            while (it.hasNext()) {
                ((w0) it.next()).d(s3Var);
            }
            for (c cVar : n.this.f83736c.values()) {
                if (cVar.c(s3Var) && cVar.f83747b != null) {
                    this.f83744b.add(cVar.f83747b);
                }
            }
            Iterator it2 = this.f83744b.iterator();
            while (it2.hasNext()) {
                n.this.c((l1) it2.next());
            }
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f83746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l1 f83747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f83748c;

        /* synthetic */ c(n nVar, l1 l1Var, a aVar) {
            this(l1Var);
        }

        boolean c(s3 s3Var) {
            this.f83746a.add(s3Var);
            return this.f83747b != null && n.this.f83740g.getDateProvider().a().g() > this.f83748c + TimeUnit.MILLISECONDS.toNanos(30000L);
        }

        private c(l1 l1Var) {
            this.f83746a = new ArrayList();
            this.f83747b = l1Var;
            this.f83748c = n.this.f83740g.getDateProvider().a().g();
        }
    }

    public n(v7 v7Var) {
        boolean z10 = false;
        this.f83740g = (v7) io.sentry.util.w.c(v7Var, "The options object is required.");
        for (u0 u0Var : v7Var.getPerformanceCollectors()) {
            if (u0Var instanceof w0) {
                this.f83737d.add((w0) u0Var);
            }
            if (u0Var instanceof v0) {
                this.f83738e.add((v0) u0Var);
            }
        }
        if (this.f83737d.isEmpty() && this.f83738e.isEmpty()) {
            z10 = true;
        }
        this.f83739f = z10;
    }

    @Override // io.sentry.i
    public void a(j1 j1Var) {
        Iterator it = this.f83738e.iterator();
        while (it.hasNext()) {
            ((v0) it.next()).a(j1Var);
        }
    }

    @Override // io.sentry.i
    public void b(j1 j1Var) {
        Iterator it = this.f83738e.iterator();
        while (it.hasNext()) {
            ((v0) it.next()).b(j1Var);
        }
    }

    @Override // io.sentry.i
    public List c(l1 l1Var) {
        this.f83740g.getLogger().c(g7.DEBUG, "stop collecting performance info for transactions %s (%s)", l1Var.getName(), l1Var.e().p().toString());
        Iterator it = this.f83738e.iterator();
        while (it.hasNext()) {
            ((v0) it.next()).a(l1Var);
        }
        return e(l1Var.getEventId().toString());
    }

    @Override // io.sentry.i
    public void close() {
        this.f83740g.getLogger().c(g7.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f83736c.clear();
        Iterator it = this.f83738e.iterator();
        while (it.hasNext()) {
            ((v0) it.next()).clear();
        }
        if (this.f83741h.getAndSet(false)) {
            g1 g1VarD = this.f83734a.d();
            try {
                if (this.f83735b != null) {
                    this.f83735b.cancel();
                    this.f83735b = null;
                }
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } catch (Throwable th2) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.i
    public void d(l1 l1Var) {
        if (this.f83739f) {
            this.f83740g.getLogger().c(g7.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f83738e.iterator();
        while (it.hasNext()) {
            ((v0) it.next()).b(l1Var);
        }
        String string = l1Var.getEventId().toString();
        if (!this.f83736c.containsKey(string)) {
            this.f83736c.put(string, new c(this, l1Var, null));
        }
        f(string);
    }

    @Override // io.sentry.i
    public List e(String str) {
        c cVar = (c) this.f83736c.remove(str);
        this.f83740g.getLogger().c(g7.DEBUG, "stop collecting performance info for " + str, new Object[0]);
        if (this.f83736c.isEmpty()) {
            close();
        }
        if (cVar != null) {
            return cVar.f83746a;
        }
        return null;
    }

    @Override // io.sentry.i
    public void f(String str) {
        if (this.f83739f) {
            this.f83740g.getLogger().c(g7.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f83736c.containsKey(str)) {
            this.f83736c.put(str, new c(this, null, 0 == true ? 1 : 0));
        }
        if (this.f83741h.getAndSet(true)) {
            return;
        }
        g1 g1VarD = this.f83734a.d();
        try {
            if (this.f83735b == null) {
                this.f83735b = new Timer(true);
            }
            this.f83735b.schedule(new a(), 0L);
            this.f83735b.scheduleAtFixedRate(new b(new ArrayList()), 100L, 100L);
            if (g1VarD != null) {
                g1VarD.close();
            }
        } finally {
        }
    }
}

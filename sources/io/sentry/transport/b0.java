package io.sentry.transport;

import io.sentry.g1;
import io.sentry.g7;
import io.sentry.i0;
import io.sentry.u5;
import io.sentry.u6;
import io.sentry.util.m;
import io.sentry.v7;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f84204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v7 f84205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f84206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f84207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Timer f84208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.util.a f84209g;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            b0.this.y();
        }
    }

    public interface b {
        void o(b0 b0Var);
    }

    public b0(p pVar, v7 v7Var) {
        this.f84206d = new ConcurrentHashMap();
        this.f84207e = new CopyOnWriteArrayList();
        this.f84208f = null;
        this.f84209g = new io.sentry.util.a();
        this.f84204b = pVar;
        this.f84205c = v7Var;
    }

    public static /* synthetic */ void e(b0 b0Var, io.sentry.hints.f fVar) {
        b0Var.getClass();
        fVar.a();
        b0Var.f84205c.getLogger().c(g7.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
    }

    private void m(io.sentry.k kVar, Date date) {
        Date date2 = (Date) this.f84206d.get(kVar);
        if (date2 == null || date.after(date2)) {
            this.f84206d.put(kVar, date);
            y();
            g1 g1VarD = this.f84209g.d();
            try {
                if (this.f84208f == null) {
                    this.f84208f = new Timer(true);
                }
                this.f84208f.schedule(new a(), date);
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

    private List o(String str) {
        str.getClass();
        switch (str) {
            case "attachment":
                return Collections.singletonList(io.sentry.k.Attachment);
            case "replay_video":
                return Collections.singletonList(io.sentry.k.Replay);
            case "profile_chunk":
                return Arrays.asList(io.sentry.k.ProfileChunkUi, io.sentry.k.ProfileChunk);
            case "profile":
                return Collections.singletonList(io.sentry.k.Profile);
            case "feedback":
                return Collections.singletonList(io.sentry.k.Feedback);
            case "log":
                return Collections.singletonList(io.sentry.k.LogItem);
            case "event":
                return Collections.singletonList(io.sentry.k.Error);
            case "check_in":
                return Collections.singletonList(io.sentry.k.Monitor);
            case "session":
                return Collections.singletonList(io.sentry.k.Session);
            case "transaction":
                return Collections.singletonList(io.sentry.k.Transaction);
            default:
                return Collections.singletonList(io.sentry.k.Unknown);
        }
    }

    private boolean s(String str) {
        Iterator it = o(str).iterator();
        while (it.hasNext()) {
            if (p((io.sentry.k) it.next())) {
                return true;
            }
        }
        return false;
    }

    private void w(i0 i0Var, final boolean z10) {
        io.sentry.util.m.k(i0Var, io.sentry.hints.p.class, new m.a() { // from class: io.sentry.transport.y
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.p) obj).c(false);
            }
        });
        io.sentry.util.m.k(i0Var, io.sentry.hints.k.class, new m.a() { // from class: io.sentry.transport.z
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.k) obj).d(z10);
            }
        });
        io.sentry.util.m.k(i0Var, io.sentry.hints.f.class, new m.a() { // from class: io.sentry.transport.a0
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                b0.e(this.f84202a, (io.sentry.hints.f) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        Iterator it = this.f84207e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).o(this);
        }
    }

    private long z(String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            return 60000L;
        }
    }

    public void M(b bVar) {
        this.f84207e.remove(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[PHI: r2
  0x009b: PHI (r2v5 int) = (r2v4 int), (r2v4 int), (r2v7 int) binds: [B:7:0x0024, B:9:0x002d, B:47:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void R(java.lang.String r18, java.lang.String r19, int r20) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.b0.R(java.lang.String, java.lang.String, int):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g1 g1VarD = this.f84209g.d();
        try {
            Timer timer = this.f84208f;
            if (timer != null) {
                timer.cancel();
                this.f84208f = null;
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
            this.f84207e.clear();
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

    public void h(b bVar) {
        this.f84207e.add(bVar);
    }

    public u5 n(u5 u5Var, i0 i0Var) {
        ArrayList arrayList = null;
        for (u6 u6Var : u5Var.c()) {
            if (s(u6Var.J().b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(u6Var);
                this.f84205c.getClientReportRecorder().c(io.sentry.clientreport.f.RATELIMIT_BACKOFF, u6Var);
            }
        }
        if (arrayList == null) {
            return u5Var;
        }
        this.f84205c.getLogger().c(g7.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (u6 u6Var2 : u5Var.c()) {
            if (!arrayList.contains(u6Var2)) {
                arrayList2.add(u6Var2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new u5(u5Var.b(), arrayList2);
        }
        this.f84205c.getLogger().c(g7.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
        w(i0Var, false);
        return null;
    }

    public boolean p(io.sentry.k kVar) {
        Date date;
        Date date2 = new Date(this.f84204b.getCurrentTimeMillis());
        Date date3 = (Date) this.f84206d.get(io.sentry.k.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (io.sentry.k.Unknown.equals(kVar) || (date = (Date) this.f84206d.get(kVar)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean q() {
        Date date = new Date(this.f84204b.getCurrentTimeMillis());
        Iterator it = this.f84206d.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = (Date) this.f84206d.get((io.sentry.k) it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    public b0(v7 v7Var) {
        this(n.a(), v7Var);
    }
}

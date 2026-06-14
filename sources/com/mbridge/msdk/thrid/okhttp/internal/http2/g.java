package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.http2.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements Closeable, AutoCloseable {
    static final /* synthetic */ boolean A = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final ExecutorService f51396z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f51397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j f51398b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f51400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f51401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f51402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f51403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f51404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ExecutorService f51405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http2.l f51406j;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    long f51415s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final m f51417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final Socket f51418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http2.j f51419w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final l f51420x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final Set<Integer> f51421y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.i> f51399c = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f51407k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f51408l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f51409m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f51410n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f51411o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f51412p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f51413q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f51414r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    m f51416t = new m();

    class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f51423c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f51422b = i10;
            this.f51423c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.b(this.f51422b, this.f51423c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f51426c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f51425b = i10;
            this.f51426c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.f51419w.a(this.f51425b, this.f51426c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(false, 2, 0);
        }
    }

    class d extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f51430c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f51429b = i10;
            this.f51430c = list;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            if (g.this.f51406j.a(this.f51429b, this.f51430c)) {
                try {
                    g.this.f51419w.a(this.f51429b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                    synchronized (g.this) {
                        g.this.f51421y.remove(Integer.valueOf(this.f51429b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    class e extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f51433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f51434d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f51432b = i10;
            this.f51433c = list;
            this.f51434d = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean zA = g.this.f51406j.a(this.f51432b, this.f51433c, this.f51434d);
            if (zA) {
                try {
                    g.this.f51419w.a(this.f51432b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zA || this.f51434d) {
                synchronized (g.this) {
                    g.this.f51421y.remove(Integer.valueOf(this.f51432b));
                }
            }
        }
    }

    class f extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okio.c f51437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f51438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f51439e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okio.c cVar, int i11, boolean z10) {
            super(str, objArr);
            this.f51436b = i10;
            this.f51437c = cVar;
            this.f51438d = i11;
            this.f51439e = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                boolean zA = g.this.f51406j.a(this.f51436b, this.f51437c, this.f51438d, this.f51439e);
                if (zA) {
                    g.this.f51419w.a(this.f51436b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                }
                if (zA || this.f51439e) {
                    synchronized (g.this) {
                        g.this.f51421y.remove(Integer.valueOf(this.f51436b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$g, reason: collision with other inner class name */
    class C0578g extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f51442c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0578g(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f51441b = i10;
            this.f51442c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.f51406j.a(this.f51441b, this.f51442c);
            synchronized (g.this) {
                g.this.f51421y.remove(Integer.valueOf(this.f51441b));
            }
        }
    }

    final class i extends com.mbridge.msdk.thrid.okhttp.internal.b {
        i() {
            super("OkHttp %s ping", g.this.f51400d);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean z10;
            synchronized (g.this) {
                if (g.this.f51408l < g.this.f51407k) {
                    z10 = true;
                } else {
                    g.e(g.this);
                    z10 = false;
                }
            }
            if (z10) {
                g.this.h();
            } else {
                g.this.a(false, 1, 0);
            }
        }
    }

    public static abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f51453a = new a();

        static class a extends j {
            a() {
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
            public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
                iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException;
    }

    final class k extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f51454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f51455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f51456d;

        k(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", g.this.f51400d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f51454b = z10;
            this.f51455c = i10;
            this.f51456d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(this.f51454b, this.f51455c, this.f51456d);
        }
    }

    class l extends com.mbridge.msdk.thrid.okhttp.internal.b implements h.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.mbridge.msdk.thrid.okhttp.internal.http2.h f51458b;

        class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.i f51460b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) {
                super(str, objArr);
                this.f51460b = iVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                try {
                    g.this.f51398b.a(this.f51460b);
                } catch (IOException e10) {
                    com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Http2Connection.Listener failure for " + g.this.f51400d, e10);
                    try {
                        this.f51460b.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f51462b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m f51463c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Object[] objArr, boolean z10, m mVar) {
                super(str, objArr);
                this.f51462b = z10;
                this.f51463c = mVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                l.this.b(this.f51462b, this.f51463c);
            }
        }

        class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
            c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                g gVar = g.this;
                gVar.f51398b.a(gVar);
            }
        }

        l(com.mbridge.msdk.thrid.okhttp.internal.http2.h hVar) {
            super("OkHttp %s", g.this.f51400d);
            this.f51458b = hVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        protected void b() throws Throwable {
            Throwable th2;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.INTERNAL_ERROR;
            try {
                try {
                    this.f51458b.a(this);
                    while (this.f51458b.a(false, (h.b) this)) {
                    }
                    bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR;
                } catch (IOException unused) {
                    bVar = bVar2;
                } catch (Throwable th3) {
                    th2 = th3;
                    bVar = bVar2;
                    try {
                        g.this.a(bVar, bVar2);
                    } catch (IOException unused2) {
                    }
                    com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f51458b);
                    throw th2;
                }
                try {
                    try {
                        g.this.a(bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                    } catch (Throwable th4) {
                        th2 = th4;
                        g.this.a(bVar, bVar2);
                        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f51458b);
                        throw th2;
                    }
                } catch (IOException unused3) {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar3 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
                    g.this.a(bVar3, bVar3);
                }
            } catch (IOException unused4) {
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f51458b);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, int i12, boolean z10) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11) throws IOException {
            if (g.this.b(i10)) {
                g.this.a(i10, eVar, i11, z10);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA == null) {
                g.this.c(i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                long j10 = i11;
                g.this.g(j10);
                eVar.skip(j10);
                return;
            }
            iVarA.a(eVar, i11);
            if (z10) {
                iVarA.i();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
            if (g.this.b(i10)) {
                g.this.b(i10, list, z10);
                return;
            }
            synchronized (g.this) {
                try {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
                    if (iVarA == null) {
                        if (g.this.f51403g) {
                            return;
                        }
                        g gVar = g.this;
                        if (i10 <= gVar.f51401e) {
                            return;
                        }
                        if (i10 % 2 == gVar.f51402f % 2) {
                            return;
                        }
                        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i10, g.this, false, z10, com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
                        g gVar2 = g.this;
                        gVar2.f51401e = i10;
                        gVar2.f51399c.put(Integer.valueOf(i10), iVar);
                        g.f51396z.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f51400d, Integer.valueOf(i10)}, iVar));
                        return;
                    }
                    iVarA.a(list);
                    if (z10) {
                        iVarA.i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b(boolean z10, m mVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            long j10;
            synchronized (g.this.f51419w) {
                synchronized (g.this) {
                    try {
                        int iC = g.this.f51417u.c();
                        if (z10) {
                            g.this.f51417u.a();
                        }
                        g.this.f51417u.a(mVar);
                        int iC2 = g.this.f51417u.c();
                        iVarArr = null;
                        if (iC2 == -1 || iC2 == iC) {
                            j10 = 0;
                        } else {
                            j10 = iC2 - iC;
                            if (!g.this.f51399c.isEmpty()) {
                                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f51399c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f51399c.size()]);
                            }
                        }
                    } finally {
                    }
                }
                try {
                    g gVar = g.this;
                    gVar.f51419w.a(gVar.f51417u);
                } catch (IOException unused) {
                    g.this.h();
                }
            }
            if (iVarArr != null) {
                for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j10);
                    }
                }
            }
            g.f51396z.execute(new c("OkHttp %s settings", g.this.f51400d));
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            if (g.this.b(i10)) {
                g.this.a(i10, bVar);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarC = g.this.c(i10);
            if (iVarC != null) {
                iVarC.d(bVar);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, m mVar) {
            try {
                g.this.f51404h.execute(new b("OkHttp %s ACK Settings", new Object[]{g.this.f51400d}, z10, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11) {
            if (!z10) {
                try {
                    g.this.f51404h.execute(g.this.new k(true, i10, i11));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (g.this) {
                try {
                    if (i10 == 1) {
                        g.c(g.this);
                    } else if (i10 == 2) {
                        g.h(g.this);
                    } else if (i10 == 3) {
                        g.i(g.this);
                        g.this.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okio.f fVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            fVar.j();
            synchronized (g.this) {
                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f51399c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f51399c.size()]);
                g.this.f51403g = true;
            }
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                if (iVar.c() > i10 && iVar.f()) {
                    iVar.d(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                    g.this.c(iVar.c());
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, long j10) {
            if (i10 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f51415s += j10;
                    gVar.notifyAll();
                }
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA != null) {
                synchronized (iVarA) {
                    iVarA.a(j10);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) throws Throwable {
            g.this.a(i11, list);
        }
    }

    g(h hVar) {
        m mVar = new m();
        this.f51417u = mVar;
        this.f51421y = new LinkedHashSet();
        this.f51406j = hVar.f51449f;
        boolean z10 = hVar.f51450g;
        this.f51397a = z10;
        this.f51398b = hVar.f51448e;
        int i10 = z10 ? 1 : 2;
        this.f51402f = i10;
        if (z10) {
            this.f51402f = i10 + 2;
        }
        if (z10) {
            this.f51416t.a(7, 16777216);
        }
        String str = hVar.f51445b;
        this.f51400d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Writer", str), false));
        this.f51404h = scheduledThreadPoolExecutor;
        if (hVar.f51451h != 0) {
            i iVar = new i();
            long j10 = hVar.f51451h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j10, j10, TimeUnit.MILLISECONDS);
        }
        this.f51405i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Push Observer", str), true));
        mVar.a(7, 65535);
        mVar.a(5, 16384);
        this.f51415s = mVar.c();
        this.f51418v = hVar.f51444a;
        this.f51419w = new com.mbridge.msdk.thrid.okhttp.internal.http2.j(hVar.f51447d, z10);
        this.f51420x = new l(new com.mbridge.msdk.thrid.okhttp.internal.http2.h(hVar.f51446c, z10));
    }

    static /* synthetic */ long c(g gVar) {
        long j10 = gVar.f51408l;
        gVar.f51408l = 1 + j10;
        return j10;
    }

    static /* synthetic */ long e(g gVar) {
        long j10 = gVar.f51407k;
        gVar.f51407k = 1 + j10;
        return j10;
    }

    static /* synthetic */ long h(g gVar) {
        long j10 = gVar.f51410n;
        gVar.f51410n = 1 + j10;
        return j10;
    }

    static /* synthetic */ long i(g gVar) {
        long j10 = gVar.f51412p;
        gVar.f51412p = 1 + j10;
        return j10;
    }

    boolean b(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
    }

    public void flush() throws IOException {
        this.f51419w.flush();
    }

    public synchronized int k() {
        return this.f51417u.b(Integer.MAX_VALUE);
    }

    void l() {
        synchronized (this) {
            try {
                long j10 = this.f51410n;
                long j11 = this.f51409m;
                if (j10 < j11) {
                    return;
                }
                this.f51409m = j11 + 1;
                this.f51413q = System.nanoTime() + 1000000000;
                try {
                    this.f51404h.execute(new c("OkHttp %s ping", this.f51400d));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m() throws IOException {
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
            a(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i c(int i10) {
        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarRemove;
        iVarRemove = this.f51399c.remove(Integer.valueOf(i10));
        notifyAll();
        return iVarRemove;
    }

    public synchronized boolean f(long j10) {
        if (this.f51403g) {
            return false;
        }
        if (this.f51410n < this.f51409m) {
            if (j10 >= this.f51413q) {
                return false;
            }
        }
        return true;
    }

    synchronized void g(long j10) {
        long j11 = this.f51414r + j10;
        this.f51414r = j11;
        if (j11 >= this.f51416t.c() / 2) {
            a(0, this.f51414r);
            this.f51414r = 0L;
        }
    }

    synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10) {
        return this.f51399c.get(Integer.valueOf(i10));
    }

    void b(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        this.f51419w.a(i10, bVar);
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Socket f51444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f51445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.mbridge.msdk.thrid.okio.e f51446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.mbridge.msdk.thrid.okio.d f51447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        j f51448e = j.f51453a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.internal.http2.l f51449f = com.mbridge.msdk.thrid.okhttp.internal.http2.l.f51516a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f51450g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f51451h;

        public h(boolean z10) {
            this.f51450g = z10;
        }

        public h a(Socket socket, String str, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
            this.f51444a = socket;
            this.f51445b = str;
            this.f51446c = eVar;
            this.f51447d = dVar;
            return this;
        }

        public h a(j jVar) {
            this.f51448e = jVar;
            return this;
        }

        public h a(int i10) {
            this.f51451h = i10;
            return this;
        }

        public g a() {
            return new g(this);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http2.i a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws IOException {
        return a(0, list, z10);
    }

    void b(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) {
        try {
            try {
                a(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f51400d, Integer.valueOf(i10)}, i10, list, z10));
            } catch (RejectedExecutionException unused) {
            }
        } catch (RejectedExecutionException unused2) {
        }
    }

    void c(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        try {
            this.f51404h.execute(new a("OkHttp %s stream %d", new Object[]{this.f51400d, Integer.valueOf(i10)}, i10, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    private com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws Throwable {
        Throwable th2;
        boolean z11 = !z10;
        synchronized (this.f51419w) {
            try {
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                try {
                } catch (Throwable th4) {
                    th = th4;
                }
                synchronized (this) {
                    try {
                        if (this.f51402f > 1073741823) {
                            try {
                                a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                            } catch (Throwable th5) {
                                th2 = th5;
                            }
                        }
                        if (!this.f51403g) {
                            int i11 = this.f51402f;
                            this.f51402f = i11 + 2;
                            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i11, this, z11, false, null);
                            boolean z12 = !z10 || this.f51415s == 0 || iVar.f51479b == 0;
                            if (iVar.g()) {
                                this.f51399c.put(Integer.valueOf(i11), iVar);
                            }
                            if (i10 == 0) {
                                this.f51419w.a(z11, i11, i10, list);
                            } else if (!this.f51397a) {
                                this.f51419w.a(i10, i11, list);
                            } else {
                                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                            }
                            if (z12) {
                                this.f51419w.flush();
                            }
                            return iVar;
                        }
                        throw new com.mbridge.msdk.thrid.okhttp.internal.http2.a();
                    } catch (Throwable th6) {
                        th = th6;
                        th2 = th;
                    }
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f51419w.h());
        r6 = r2;
        r8.f51415s -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r9, boolean r10, com.mbridge.msdk.thrid.okio.c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r12 = r8.f51419w
            r12.a(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r4 = r8.f51415s     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            java.util.Map<java.lang.Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.i> r2 = r8.f51399c     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            goto L12
        L28:
            r9 = move-exception
            goto L65
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
        L32:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L28
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L28
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r4 = r8.f51419w     // Catch: java.lang.Throwable -> L28
            int r4 = r4.h()     // Catch: java.lang.Throwable -> L28
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.f51415s     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.f51415s = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r4 = r8.f51419w
            if (r10 == 0) goto L53
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = r3
        L54:
            r4.a(r5, r9, r11, r2)
            goto Ld
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
            r9.interrupt()     // Catch: java.lang.Throwable -> L28
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.g.a(int, boolean, com.mbridge.msdk.thrid.okio.c, long):void");
    }

    void a(int i10, long j10) {
        try {
            this.f51404h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f51400d, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    void a(boolean z10, int i10, int i11) {
        try {
            this.f51419w.a(z10, i10, i11);
        } catch (IOException unused) {
            h();
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        synchronized (this.f51419w) {
            synchronized (this) {
                if (this.f51403g) {
                    return;
                }
                this.f51403g = true;
                this.f51419w.a(this.f51401e, bVar, com.mbridge.msdk.thrid.okhttp.internal.c.f51201a);
            }
        }
    }

    void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2) throws IOException {
        if (!A && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr = null;
        try {
            a(bVar);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        synchronized (this) {
            try {
                if (!this.f51399c.isEmpty()) {
                    iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) this.f51399c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[this.f51399c.size()]);
                    this.f51399c.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iVarArr != null) {
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                try {
                    iVar.a(bVar2);
                } catch (IOException e11) {
                    if (e != null) {
                        e = e11;
                    }
                }
            }
        }
        try {
            this.f51419w.close();
        } catch (IOException e12) {
            if (e == null) {
                e = e12;
            }
        }
        try {
            this.f51418v.close();
        } catch (IOException e13) {
            e = e13;
        }
        this.f51404h.shutdown();
        this.f51405i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    void a(boolean z10) throws IOException {
        if (z10) {
            this.f51419w.d();
            this.f51419w.b(this.f51416t);
            if (this.f51416t.c() != 65535) {
                this.f51419w.a(0, r5 - 65535);
            }
        }
        new Thread(this.f51420x).start();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0046
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    void a(int r9, java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f51421y     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L41
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L18
            com.mbridge.msdk.thrid.okhttp.internal.http2.b r10 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L14
            r8.c(r9, r10)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L44
        L18:
            java.util.Set<java.lang.Integer> r0 = r8.f51421y     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L41
            com.mbridge.msdk.thrid.okhttp.internal.http2.g$d r2 = new com.mbridge.msdk.thrid.okhttp.internal.http2.g$d     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            java.lang.String r0 = r8.f51400d     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r3 = 0
            r5[r3] = r0     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r0 = 1
            r5[r0] = r1     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L40
            r8.a(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L40
            return
        L3f:
            r3 = r8
        L40:
            return
        L41:
            r0 = move-exception
            r3 = r8
        L43:
            r9 = r0
        L44:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L46
            throw r9
        L46:
            r0 = move-exception
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.g.a(int, java.util.List):void");
    }

    void a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10) throws IOException {
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        long j10 = i11;
        eVar.e(j10);
        eVar.b(cVar, j10);
        if (cVar.size() == j10) {
            a(new f("OkHttp %s Push Data[%s]", new Object[]{this.f51400d, Integer.valueOf(i10)}, i10, cVar, i11, z10));
            return;
        }
        throw new IOException(cVar.size() + " != " + i11);
    }

    void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        a(new C0578g("OkHttp %s Push Reset[%s]", new Object[]{this.f51400d, Integer.valueOf(i10)}, i10, bVar));
    }

    private synchronized void a(com.mbridge.msdk.thrid.okhttp.internal.b bVar) {
        if (!this.f51403g) {
            this.f51405i.execute(bVar);
        }
    }
}

package z9;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ka.m;
import v9.c2;
import z9.e0;
import z9.n;
import z9.u;

/* JADX INFO: loaded from: classes12.dex */
class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f119202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f119203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f119204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f119205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f119206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f119207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f119208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f119209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q9.m f119210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ka.m f119211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c2 f119212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n0 f119213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final UUID f119214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Looper f119215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f119216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f119217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f119218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HandlerThread f119219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f119220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private t9.b f119221t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private n.a f119222u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f119223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f119224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private e0.a f119225x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e0.d f119226y;

    public interface a {
        void a(g gVar);

        void onProvisionCompleted();

        void onProvisionError(Exception exc, boolean z10);
    }

    public interface b {
        void a(g gVar, int i10);

        void b(g gVar, int i10);
    }

    private class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f119227a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, o0 o0Var) {
            d dVar = (d) message.obj;
            if (!dVar.f119230b) {
                return false;
            }
            int i10 = dVar.f119233e + 1;
            dVar.f119233e = i10;
            if (i10 > g.this.f119211j.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            long jB = g.this.f119211j.b(new m.c(new ga.y(dVar.f119229a, o0Var.f119301b, o0Var.f119302c, o0Var.f119303d, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f119231c, o0Var.f119304e), new ga.b0(3), o0Var.getCause() instanceof IOException ? (IOException) o0Var.getCause() : new f(o0Var.getCause()), dVar.f119233e));
            if (jB == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f119227a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jB);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(ga.y.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f119227a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objA;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    objA = g.this.f119213l.a(g.this.f119214m, (e0.d) dVar.f119232d);
                } else {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                    objA = g.this.f119213l.b(g.this.f119214m, (e0.a) dVar.f119232d);
                }
            } catch (o0 e10) {
                boolean zA = a(message, e10);
                objA = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                q9.u.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objA = e11;
            }
            g.this.f119211j.onLoadTaskConcluded(dVar.f119229a);
            synchronized (this) {
                try {
                    if (!this.f119227a) {
                        g.this.f119216o.obtainMessage(message.what, Pair.create(dVar.f119232d, objA)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f119229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f119230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f119231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f119232d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f119233e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f119229a = j10;
            this.f119230b = z10;
            this.f119231c = j11;
            this.f119232d = obj;
        }
    }

    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 1) {
                g.this.w(obj, obj2);
            } else {
                if (i10 != 2) {
                    return;
                }
                g.this.q(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th2) {
            super(th2);
        }
    }

    public g(UUID uuid, e0 e0Var, a aVar, b bVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap map, n0 n0Var, Looper looper, ka.m mVar, c2 c2Var) {
        if (i10 == 1 || i10 == 3) {
            q9.a.e(bArr);
        }
        this.f119214m = uuid;
        this.f119204c = aVar;
        this.f119205d = bVar;
        this.f119203b = e0Var;
        this.f119206e = i10;
        this.f119207f = z10;
        this.f119208g = z11;
        if (bArr != null) {
            this.f119224w = bArr;
            this.f119202a = null;
        } else {
            this.f119202a = DesugarCollections.unmodifiableList((List) q9.a.e(list));
        }
        this.f119209h = map;
        this.f119213l = n0Var;
        this.f119210i = new q9.m();
        this.f119211j = mVar;
        this.f119212k = c2Var;
        this.f119217p = 2;
        this.f119215n = looper;
        this.f119216o = new e(looper);
    }

    private boolean A() {
        try {
            this.f119203b.restoreKeys(this.f119223v, this.f119224w);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            p(e10, 1);
            return false;
        }
    }

    private void B() {
        if (Thread.currentThread() != this.f119215n.getThread()) {
            q9.u.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f119215n.getThread().getName(), new IllegalStateException());
        }
    }

    private void k(q9.l lVar) {
        Iterator it = this.f119210i.elementSet().iterator();
        while (it.hasNext()) {
            lVar.accept((u.a) it.next());
        }
    }

    private void l(boolean z10) {
        if (this.f119208g) {
            return;
        }
        byte[] bArr = (byte[]) q9.o0.i(this.f119223v);
        int i10 = this.f119206e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f119224w == null || A()) {
                    y(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            q9.a.e(this.f119224w);
            q9.a.e(this.f119223v);
            y(this.f119224w, 3, z10);
            return;
        }
        if (this.f119224w == null) {
            y(bArr, 1, z10);
            return;
        }
        if (this.f119217p == 4 || A()) {
            long jM = m();
            if (this.f119206e != 0 || jM > 60) {
                if (jM <= 0) {
                    p(new m0(), 2);
                    return;
                } else {
                    this.f119217p = 4;
                    k(new q9.l() { // from class: z9.c
                        @Override // q9.l
                        public final void accept(Object obj) {
                            ((u.a) obj).j();
                        }
                    });
                    return;
                }
            }
            q9.u.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jM);
            y(bArr, 2, z10);
        }
    }

    private long m() {
        if (!n9.f.f95290d.equals(this.f119214m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) q9.a.e(q0.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean o() {
        int i10 = this.f119217p;
        return i10 == 3 || i10 == 4;
    }

    private void p(final Throwable th2, int i10) {
        this.f119222u = new n.a(th2, a0.b(th2, i10));
        q9.u.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            k(new q9.l() { // from class: z9.d
                @Override // q9.l
                public final void accept(Object obj) {
                    ((u.a) obj).l((Exception) th2);
                }
            });
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!a0.e(th2) && !a0.d(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.f119217p != 4) {
            this.f119217p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(Object obj, Object obj2) {
        if (obj == this.f119225x && o()) {
            this.f119225x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                r((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f119206e == 3) {
                    this.f119203b.provideKeyResponse((byte[]) q9.o0.i(this.f119224w), bArr);
                    k(new q9.l() { // from class: z9.e
                        @Override // q9.l
                        public final void accept(Object obj3) {
                            ((u.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrProvideKeyResponse = this.f119203b.provideKeyResponse(this.f119223v, bArr);
                int i10 = this.f119206e;
                if ((i10 == 2 || (i10 == 0 && this.f119224w != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.f119224w = bArrProvideKeyResponse;
                }
                this.f119217p = 4;
                k(new q9.l() { // from class: z9.f
                    @Override // q9.l
                    public final void accept(Object obj3) {
                        ((u.a) obj3).h();
                    }
                });
            } catch (Exception e10) {
                e = e10;
                r(e, true);
            } catch (NoSuchMethodError e11) {
                e = e11;
                r(e, true);
            }
        }
    }

    private void r(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || a0.d(th2)) {
            this.f119204c.a(this);
        } else {
            p(th2, z10 ? 1 : 2);
        }
    }

    private void s() {
        if (this.f119206e == 0 && this.f119217p == 4) {
            q9.o0.i(this.f119223v);
            l(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Object obj, Object obj2) {
        if (obj == this.f119226y) {
            if (this.f119217p == 2 || o()) {
                this.f119226y = null;
                if (obj2 instanceof Exception) {
                    this.f119204c.onProvisionError((Exception) obj2, false);
                    return;
                }
                try {
                    this.f119203b.provideProvisionResponse((byte[]) obj2);
                    this.f119204c.onProvisionCompleted();
                } catch (Exception e10) {
                    this.f119204c.onProvisionError(e10, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean x() {
        /*
            r4 = this;
            boolean r0 = r4.o()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            z9.e0 r0 = r4.f119203b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.openSession()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f119223v = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            z9.e0 r2 = r4.f119203b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            v9.c2 r3 = r4.f119212k     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.b(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            z9.e0 r0 = r4.f119203b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r2 = r4.f119223v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            t9.b r0 = r0.createCryptoConfig(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f119221t = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.f119217p = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            z9.b r2 = new z9.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.<init>()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.k(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r4.f119223v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            q9.a.e(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = z9.a0.d(r0)
            if (r2 == 0) goto L41
            z9.g$a r0 = r4.f119204c
            r0.a(r4)
            goto L4a
        L41:
            r4.p(r0, r1)
            goto L4a
        L45:
            z9.g$a r0 = r4.f119204c
            r0.a(r4)
        L4a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.g.x():boolean");
    }

    private void y(byte[] bArr, int i10, boolean z10) {
        try {
            this.f119225x = this.f119203b.getKeyRequest(bArr, this.f119202a, i10, this.f119209h);
            ((c) q9.o0.i(this.f119220s)).b(2, q9.a.e(this.f119225x), z10);
        } catch (Exception | NoSuchMethodError e10) {
            r(e10, true);
        }
    }

    @Override // z9.n
    public void a(u.a aVar) {
        B();
        if (this.f119218q < 0) {
            q9.u.c("DefaultDrmSession", "Session reference count less than zero: " + this.f119218q);
            this.f119218q = 0;
        }
        if (aVar != null) {
            this.f119210i.a(aVar);
        }
        int i10 = this.f119218q + 1;
        this.f119218q = i10;
        if (i10 == 1) {
            q9.a.g(this.f119217p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f119219r = handlerThread;
            handlerThread.start();
            this.f119220s = new c(this.f119219r.getLooper());
            if (x()) {
                l(true);
            }
        } else if (aVar != null && o() && this.f119210i.count(aVar) == 1) {
            aVar.k(this.f119217p);
        }
        this.f119205d.a(this, this.f119218q);
    }

    @Override // z9.n
    public void b(u.a aVar) {
        B();
        int i10 = this.f119218q;
        if (i10 <= 0) {
            q9.u.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f119218q = i11;
        if (i11 == 0) {
            this.f119217p = 0;
            ((e) q9.o0.i(this.f119216o)).removeCallbacksAndMessages(null);
            ((c) q9.o0.i(this.f119220s)).c();
            this.f119220s = null;
            ((HandlerThread) q9.o0.i(this.f119219r)).quit();
            this.f119219r = null;
            this.f119221t = null;
            this.f119222u = null;
            this.f119225x = null;
            this.f119226y = null;
            byte[] bArr = this.f119223v;
            if (bArr != null) {
                this.f119203b.closeSession(bArr);
                this.f119223v = null;
            }
        }
        if (aVar != null) {
            this.f119210i.b(aVar);
            if (this.f119210i.count(aVar) == 0) {
                aVar.m();
            }
        }
        this.f119205d.b(this, this.f119218q);
    }

    @Override // z9.n
    public final t9.b getCryptoConfig() {
        B();
        return this.f119221t;
    }

    @Override // z9.n
    public final n.a getError() {
        B();
        if (this.f119217p == 1) {
            return this.f119222u;
        }
        return null;
    }

    @Override // z9.n
    public final UUID getSchemeUuid() {
        B();
        return this.f119214m;
    }

    @Override // z9.n
    public final int getState() {
        B();
        return this.f119217p;
    }

    public boolean n(byte[] bArr) {
        B();
        return Arrays.equals(this.f119223v, bArr);
    }

    @Override // z9.n
    public boolean playClearSamplesWithoutKeys() {
        B();
        return this.f119207f;
    }

    @Override // z9.n
    public Map queryKeyStatus() {
        B();
        byte[] bArr = this.f119223v;
        if (bArr == null) {
            return null;
        }
        return this.f119203b.queryKeyStatus(bArr);
    }

    @Override // z9.n
    public boolean requiresSecureDecoder(String str) {
        B();
        return this.f119203b.requiresSecureDecoder((byte[]) q9.a.i(this.f119223v), str);
    }

    void t(int i10) {
        if (i10 != 2) {
            return;
        }
        s();
    }

    void u() {
        if (x()) {
            l(true);
        }
    }

    void v(Exception exc, boolean z10) {
        p(exc, z10 ? 1 : 3);
    }

    void z() {
        this.f119226y = this.f119203b.getProvisionRequest();
        ((c) q9.o0.i(this.f119220s)).b(1, q9.a.e(this.f119226y), true);
    }
}

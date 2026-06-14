package ka;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import q9.k0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f93113d = g(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f93114e = g(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f93115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f93116g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final la.b f93117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f93118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f93119c;

    public interface b {
        void f(e eVar, long j10, long j11);

        c g(e eVar, long j10, long j11, IOException iOException, int i10);

        void h(e eVar, long j10, long j11, boolean z10);

        void i(e eVar, long j10, long j11, int i10);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f93120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f93121b;

        public boolean c() {
            int i10 = this.f93120a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f93120a = i10;
            this.f93121b = j10;
        }
    }

    private final class d extends Handler implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f93123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f93124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b f93125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IOException f93126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f93127g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Thread f93128h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f93129i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile boolean f93130j;

        public d(Looper looper, e eVar, b bVar, int i10, long j10) {
            super(looper);
            this.f93123c = eVar;
            this.f93125e = bVar;
            this.f93122b = i10;
            this.f93124d = j10;
        }

        private void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) q9.a.e(this.f93125e)).i(this.f93123c, jElapsedRealtime, jElapsedRealtime - this.f93124d, this.f93127g);
            this.f93126f = null;
            o.this.f93117a.execute((Runnable) q9.a.e(o.this.f93118b));
        }

        private void d() {
            o.this.f93118b = null;
        }

        private long e() {
            return Math.min((this.f93127g - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f93130j = z10;
            this.f93126f = null;
            if (hasMessages(1)) {
                this.f93129i = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f93129i = true;
                        this.f93123c.cancelLoad();
                        Thread thread = this.f93128h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z10) {
                d();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) q9.a.e(this.f93125e)).h(this.f93123c, jElapsedRealtime, jElapsedRealtime - this.f93124d, true);
                this.f93125e = null;
            }
        }

        public void f(int i10) throws IOException {
            IOException iOException = this.f93126f;
            if (iOException != null && this.f93127g > i10) {
                throw iOException;
            }
        }

        public void g(long j10) {
            q9.a.g(o.this.f93118b == null);
            o.this.f93118b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f93130j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                b();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            d();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f93124d;
            b bVar = (b) q9.a.e(this.f93125e);
            if (this.f93129i) {
                bVar.h(this.f93123c, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    bVar.f(this.f93123c, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    q9.u.d("LoadTask", "Unexpected exception handling load completed", e10);
                    o.this.f93119c = new h(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f93126f = iOException;
            int i12 = this.f93127g + 1;
            this.f93127g = i12;
            c cVarG = bVar.g(this.f93123c, jElapsedRealtime, j10, iOException, i12);
            if (cVarG.f93120a == 3) {
                o.this.f93119c = this.f93126f;
            } else if (cVarG.f93120a != 2) {
                if (cVarG.f93120a == 1) {
                    this.f93127g = 1;
                }
                g(cVarG.f93121b != -9223372036854775807L ? cVarG.f93121b : e());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f93129i;
                    this.f93128h = Thread.currentThread();
                }
                if (!z10) {
                    k0.a("load:" + this.f93123c.getClass().getSimpleName());
                    try {
                        this.f93123c.load();
                        k0.b();
                    } catch (Throwable th2) {
                        k0.b();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f93128h = null;
                    Thread.interrupted();
                }
                if (this.f93130j) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f93130j) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Exception e11) {
                if (this.f93130j) {
                    return;
                }
                q9.u.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new h(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f93130j) {
                    return;
                }
                q9.u.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new h(e12)).sendToTarget();
            } catch (Error e13) {
                if (!this.f93130j) {
                    q9.u.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(4, e13).sendToTarget();
                }
                throw e13;
            }
        }
    }

    public interface e {
        void cancelLoad();

        void load();
    }

    public interface f {
        void onLoaderReleased();
    }

    private static final class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f93132b;

        public g(f fVar) {
            this.f93132b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f93132b.onLoaderReleased();
        }
    }

    public static final class h extends IOException {
        public h(Throwable th2) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th2.getClass().getSimpleName());
            if (th2.getMessage() != null) {
                str = ": " + th2.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th2);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f93115f = new c(2, j10);
        f93116g = new c(3, j10);
    }

    public o(String str) {
        this(la.a.a(o0.Q0("ExoPlayer:Loader:" + str), new q9.l() { // from class: ka.n
            @Override // q9.l
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) q9.a.i(this.f93118b)).a(false);
    }

    public void f() {
        this.f93119c = null;
    }

    public boolean h() {
        return this.f93119c != null;
    }

    public boolean i() {
        return this.f93118b != null;
    }

    public void j(int i10) throws IOException {
        IOException iOException = this.f93119c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f93118b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f93122b;
            }
            dVar.f(i10);
        }
    }

    public void k() {
        l(null);
    }

    public void l(f fVar) {
        d dVar = this.f93118b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f93117a.execute(new g(fVar));
        }
        this.f93117a.release();
    }

    public long m(e eVar, b bVar, int i10) {
        Looper looper = (Looper) q9.a.i(Looper.myLooper());
        this.f93119c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i10, jElapsedRealtime).g(0L);
        return jElapsedRealtime;
    }

    @Override // ka.q
    public void maybeThrowError() throws IOException {
        j(Integer.MIN_VALUE);
    }

    public o(la.b bVar) {
        this.f93117a = bVar;
    }
}

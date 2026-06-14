package sg.bigo.ads.common.utils;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f102810a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f102812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f102813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f102814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f102815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f102816h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f102817i = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    private final Handler f102811b = new Handler() { // from class: sg.bigo.ads.common.utils.n.1
        /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x000e, B:11:0x001c, B:14:0x0026, B:16:0x002e, B:18:0x0034, B:22:0x0041, B:23:0x0047, B:19:0x003b, B:24:0x005b), top: B:28:0x0003 }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r13) {
            /*
                r12 = this;
                sg.bigo.ads.common.utils.n r13 = sg.bigo.ads.common.utils.n.this
                monitor-enter(r13)
                sg.bigo.ads.common.utils.n r0 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0.f102816h     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L5b
                boolean r1 = r0.f102817i     // Catch: java.lang.Throwable -> L24
                if (r1 == 0) goto Le
                goto L5b
            Le:
                long r0 = r0.f102813e     // Catch: java.lang.Throwable -> L24
                long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L24
                long r0 = r0 - r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r5 = 1
                if (r4 > 0) goto L26
                sg.bigo.ads.common.utils.n r0 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L24
                r0.f102817i = r5     // Catch: java.lang.Throwable -> L24
                r0.a()     // Catch: java.lang.Throwable -> L24
                goto L5b
            L24:
                r0 = move-exception
                goto L5d
            L26:
                sg.bigo.ads.common.utils.n r4 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L24
                long r6 = r4.f102814f     // Catch: java.lang.Throwable -> L24
                int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r8 <= 0) goto L3b
                long r8 = r4.f102815g     // Catch: java.lang.Throwable -> L24
                int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r10 <= 0) goto L3b
                long r10 = r4.f102812d     // Catch: java.lang.Throwable -> L24
                long r8 = r8 - r6
                long r10 = r10 - r8
                r4.f102815g = r2     // Catch: java.lang.Throwable -> L24
                goto L3d
            L3b:
                long r10 = r4.f102812d     // Catch: java.lang.Throwable -> L24
            L3d:
                int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r4 >= 0) goto L47
                sg.bigo.ads.common.utils.n r4 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L24
                long r6 = r4.f102812d     // Catch: java.lang.Throwable -> L24
                long r10 = r10 + r6
                goto L3d
            L47:
                sg.bigo.ads.common.utils.n r2 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L24
                r2.a(r0)     // Catch: java.lang.Throwable -> L24
                sg.bigo.ads.common.utils.n r0 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L24
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L24
                r0.f102814f = r1     // Catch: java.lang.Throwable -> L24
                android.os.Message r0 = r12.obtainMessage(r5)     // Catch: java.lang.Throwable -> L24
                r12.sendMessageDelayed(r0, r10)     // Catch: java.lang.Throwable -> L24
            L5b:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L24
                return
            L5d:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L24
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.utils.n.AnonymousClass1.handleMessage(android.os.Message):void");
        }
    };

    public n(long j10, long j11) {
        this.f102812d = j11;
        this.f102810a = j10;
    }

    public abstract void a();

    public abstract void a(long j10);

    public final synchronized void b() {
        this.f102816h = true;
        this.f102811b.removeMessages(1);
    }

    public final synchronized n c() {
        this.f102816h = false;
        if (this.f102810a <= 0) {
            if (!this.f102817i) {
                this.f102817i = true;
                a();
            }
            return this;
        }
        this.f102813e = SystemClock.elapsedRealtime() + this.f102810a;
        Handler handler = this.f102811b;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    public final void d() {
        if (this.f102817i || this.f102816h) {
            return;
        }
        b();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f102815g = jElapsedRealtime;
        this.f102810a = this.f102813e - jElapsedRealtime;
    }

    public final boolean e() {
        return !this.f102817i && this.f102816h;
    }
}

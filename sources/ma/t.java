package ma;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f94705a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f94706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f94707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f94708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f94709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f94710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f94711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f94712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f94713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f94714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f94715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f94716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f94717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f94718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f94719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f94720p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f94721q;

    private static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                q9.u.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    private static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final c f94724g = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f94725b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f94726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HandlerThread f94727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Choreographer f94728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f94729f;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f94727d = handlerThread;
            handlerThread.start();
            Handler handlerZ = o0.z(handlerThread.getLooper(), this);
            this.f94726c = handlerZ;
            handlerZ.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.f94728e;
            if (choreographer != null) {
                int i10 = this.f94729f + 1;
                this.f94729f = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f94728e = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                q9.u.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static c d() {
            return f94724g;
        }

        private void f() {
            Choreographer choreographer = this.f94728e;
            if (choreographer != null) {
                int i10 = this.f94729f - 1;
                this.f94729f = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f94725b = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f94726c.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f94725b = j10;
            ((Choreographer) q9.a.e(this.f94728e)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f94726c.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            }
            if (i10 == 2) {
                b();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public t(Context context) {
        b bVarF = f(context);
        this.f94706b = bVarF;
        this.f94707c = bVarF != null ? c.d() : null;
        this.f94715k = -9223372036854775807L;
        this.f94716l = -9223372036854775807L;
        this.f94710f = -1.0f;
        this.f94713i = 1.0f;
        this.f94714j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (o0.f98837a < 30 || (surface = this.f94709e) == null || this.f94714j == Integer.MIN_VALUE || this.f94712h == 0.0f) {
            return;
        }
        this.f94712h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j12 + j14;
            j13 = j14;
            j14 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    private void n() {
        this.f94717m = 0L;
        this.f94720p = -1L;
        this.f94718n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f94715k = refreshRate;
            this.f94716l = (refreshRate * 80) / 100;
        } else {
            q9.u.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f94715k = -9223372036854775807L;
            this.f94716l = -9223372036854775807L;
        }
    }

    private void q() {
        if (o0.f98837a < 30 || this.f94709e == null) {
            return;
        }
        float fB = this.f94705a.e() ? this.f94705a.b() : this.f94710f;
        float f10 = this.f94711g;
        if (fB == f10) {
            return;
        }
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f94711g) < ((!this.f94705a.e() || this.f94705a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f94705a.c() < 30) {
            return;
        }
        this.f94711g = fB;
        r(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r(boolean r4) {
        /*
            r3 = this;
            int r0 = q9.o0.f98837a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f94709e
            if (r0 == 0) goto L30
            int r1 = r3.f94714j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f94708d
            if (r1 == 0) goto L21
            float r1 = r3.f94711g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f94713i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f94712h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.f94712h = r1
            ma.t.a.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.t.r(boolean):void");
    }

    public long b(long j10) {
        long j11;
        if (this.f94720p == -1 || !this.f94705a.e()) {
            j11 = j10;
        } else {
            long jA = this.f94721q + ((long) ((this.f94705a.a() * (this.f94717m - this.f94720p)) / this.f94713i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                n();
                j11 = j10;
            }
        }
        this.f94718n = this.f94717m;
        this.f94719o = j11;
        c cVar = this.f94707c;
        if (cVar != null && this.f94715k != -9223372036854775807L) {
            long j12 = cVar.f94725b;
            if (j12 != -9223372036854775807L) {
                return e(j11, j12, this.f94715k) - this.f94716l;
            }
        }
        return j11;
    }

    public void g(float f10) {
        this.f94710f = f10;
        this.f94705a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f94718n;
        if (j11 != -1) {
            this.f94720p = j11;
            this.f94721q = this.f94719o;
        }
        this.f94717m++;
        this.f94705a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f94713i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f94708d = true;
        n();
        if (this.f94706b != null) {
            ((c) q9.a.e(this.f94707c)).a();
            this.f94706b.b();
        }
        r(false);
    }

    public void l() {
        this.f94708d = false;
        b bVar = this.f94706b;
        if (bVar != null) {
            bVar.c();
            ((c) q9.a.e(this.f94707c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (this.f94709e == surface) {
            return;
        }
        d();
        this.f94709e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f94714j == i10) {
            return;
        }
        this.f94714j = i10;
        r(true);
    }

    private final class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DisplayManager f94722b;

        public b(DisplayManager displayManager) {
            this.f94722b = displayManager;
        }

        private Display a() {
            return this.f94722b.getDisplay(0);
        }

        public void b() {
            this.f94722b.registerDisplayListener(this, o0.A());
            t.this.p(a());
        }

        public void c() {
            this.f94722b.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                t.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}

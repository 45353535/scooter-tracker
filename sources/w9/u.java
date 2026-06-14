package w9;

import android.media.AudioTrack;
import java.lang.reflect.Method;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class u {
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private boolean H;
    private long I;
    private q9.h J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f107774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f107775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f107776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f107777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f107778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private t f107779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f107780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f107781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f107782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f107783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f107784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f107785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f107786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Method f107787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f107788o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f107789p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f107790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f107791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f107792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f107793t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f107794u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f107795v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f107796w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f107797x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f107798y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f107799z;

    public interface a {
        void onInvalidLatency(long j10);

        void onPositionAdvancing(long j10);

        void onPositionFramesMismatch(long j10, long j11, long j12, long j13);

        void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13);

        void onUnderrun(int i10, long j10);
    }

    public u(a aVar) {
        this.f107774a = (a) q9.a.e(aVar);
        try {
            this.f107787n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f107775b = new long[10];
        this.J = q9.h.f98789a;
    }

    private boolean b() {
        return this.f107781h && ((AudioTrack) q9.a.e(this.f107776c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        if (this.f107798y != -9223372036854775807L) {
            return Math.min(this.B, f());
        }
        long jElapsedRealtime = this.J.elapsedRealtime();
        if (jElapsedRealtime - this.f107792s >= 5) {
            w(jElapsedRealtime);
            this.f107792s = jElapsedRealtime;
        }
        return this.f107793t + this.I + (this.f107794u << 32);
    }

    private long e() {
        return o0.b1(d(), this.f107780g);
    }

    private long f() {
        if (((AudioTrack) q9.a.e(this.f107776c)).getPlayState() == 2) {
            return this.A;
        }
        return this.A + o0.F(o0.g0(o0.P0(this.J.elapsedRealtime()) - this.f107798y, this.f107783j), this.f107780g);
    }

    private void l(long j10) {
        t tVar = (t) q9.a.e(this.f107779f);
        if (tVar.f(j10)) {
            long jD = tVar.d();
            long jC = tVar.c();
            long jE = e();
            if (Math.abs(jD - j10) > 5000000) {
                this.f107774a.onSystemTimeUsMismatch(jC, jD, j10, jE);
                tVar.g();
            } else if (Math.abs(o0.b1(jC, this.f107780g) - jE) <= 5000000) {
                tVar.a();
            } else {
                this.f107774a.onPositionFramesMismatch(jC, jD, j10, jE);
                tVar.g();
            }
        }
    }

    private void m() {
        long jNanoTime = this.J.nanoTime() / 1000;
        if (jNanoTime - this.f107786m >= 30000) {
            long jE = e();
            if (jE != 0) {
                this.f107775b[this.f107796w] = o0.l0(jE, this.f107783j) - jNanoTime;
                this.f107796w = (this.f107796w + 1) % 10;
                int i10 = this.f107797x;
                if (i10 < 10) {
                    this.f107797x = i10 + 1;
                }
                this.f107786m = jNanoTime;
                this.f107785l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f107797x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f107785l += this.f107775b[i11] / ((long) i12);
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f107781h) {
            return;
        }
        l(jNanoTime);
        n(jNanoTime);
    }

    private void n(long j10) {
        Method method;
        if (!this.f107790q || (method = this.f107787n) == null || j10 - this.f107791r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) o0.i((Integer) method.invoke(q9.a.e(this.f107776c), null))).intValue()) * 1000) - this.f107782i;
            this.f107788o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f107788o = jMax;
            if (jMax > 5000000) {
                this.f107774a.onInvalidLatency(jMax);
                this.f107788o = 0L;
            }
        } catch (Exception unused) {
            this.f107787n = null;
        }
        this.f107791r = j10;
    }

    private static boolean o(int i10) {
        if (o0.f98837a < 23) {
            return i10 == 5 || i10 == 6;
        }
        return false;
    }

    private void r() {
        this.f107785l = 0L;
        this.f107797x = 0;
        this.f107796w = 0;
        this.f107786m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f107784k = false;
    }

    private void w(long j10) {
        AudioTrack audioTrack = (AudioTrack) q9.a.e(this.f107776c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f107781h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f107795v = this.f107793t;
            }
            playbackHeadPosition += this.f107795v;
        }
        if (o0.f98837a <= 29) {
            if (playbackHeadPosition == 0 && this.f107793t > 0 && playState == 3) {
                if (this.f107799z == -9223372036854775807L) {
                    this.f107799z = j10;
                    return;
                }
                return;
            }
            this.f107799z = -9223372036854775807L;
        }
        long j11 = this.f107793t;
        if (j11 > playbackHeadPosition) {
            if (this.H) {
                this.I += j11;
                this.H = false;
            } else {
                this.f107794u++;
            }
        }
        this.f107793t = playbackHeadPosition;
    }

    public void a() {
        this.H = true;
        t tVar = this.f107779f;
        if (tVar != null) {
            tVar.b();
        }
    }

    public long c() {
        long jMin;
        AudioTrack audioTrack = (AudioTrack) q9.a.e(this.f107776c);
        if (audioTrack.getPlayState() == 3) {
            m();
        }
        long jNanoTime = this.J.nanoTime() / 1000;
        t tVar = (t) q9.a.e(this.f107779f);
        boolean zE = tVar.e();
        if (zE) {
            jMin = o0.b1(tVar.c(), this.f107780g) + o0.g0(jNanoTime - tVar.d(), this.f107783j);
        } else {
            long jMax = Math.max(0L, (this.f107797x == 0 ? this.f107798y != -9223372036854775807L ? o0.b1(f(), this.f107780g) : e() : o0.g0(this.f107785l + jNanoTime, this.f107783j)) - this.f107788o);
            jMin = this.f107798y != -9223372036854775807L ? Math.min(o0.b1(this.B, this.f107780g), jMax) : jMax;
        }
        if (this.E != zE) {
            this.G = this.D;
            this.F = this.C;
        }
        long j10 = jNanoTime - this.G;
        if (j10 < 1000000) {
            long jG0 = this.F + o0.g0(j10, this.f107783j);
            long j11 = (j10 * 1000) / 1000000;
            jMin = ((jMin * j11) + ((1000 - j11) * jG0)) / 1000;
        }
        if (!this.f107784k && jMin > this.C && audioTrack.getPlayState() == 3) {
            this.f107784k = true;
            this.f107774a.onPositionAdvancing(this.J.currentTimeMillis() - o0.q1(o0.l0(o0.q1(jMin - this.C), this.f107783j)));
        }
        this.D = jNanoTime;
        this.C = jMin;
        this.E = zE;
        return jMin;
    }

    public void g(long j10) {
        this.A = d();
        this.f107798y = o0.P0(this.J.elapsedRealtime());
        this.B = j10;
    }

    public boolean h(long j10) {
        return j10 > o0.F(c(), this.f107780g) || b();
    }

    public boolean i() {
        return ((AudioTrack) q9.a.e(this.f107776c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f107799z != -9223372036854775807L && j10 > 0 && this.J.elapsedRealtime() - this.f107799z >= 200;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) q9.a.e(this.f107776c)).getPlayState();
        if (this.f107781h) {
            if (playState == 2) {
                this.f107789p = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        boolean z10 = this.f107789p;
        boolean zH = h(j10);
        this.f107789p = zH;
        if (z10 && !zH && playState != 1) {
            this.f107774a.onUnderrun(this.f107778e, o0.q1(this.f107782i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f107798y == -9223372036854775807L) {
            ((t) q9.a.e(this.f107779f)).h();
            return true;
        }
        this.A = d();
        return false;
    }

    public void q() {
        r();
        this.f107776c = null;
        this.f107779f = null;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f107776c = audioTrack;
        this.f107777d = i11;
        this.f107778e = i12;
        this.f107779f = new t(audioTrack);
        this.f107780g = audioTrack.getSampleRate();
        this.f107781h = z10 && o(i10);
        boolean zG0 = o0.G0(i10);
        this.f107790q = zG0;
        this.f107782i = zG0 ? o0.b1(i12 / i11, this.f107780g) : -9223372036854775807L;
        this.f107793t = 0L;
        this.f107794u = 0L;
        this.H = false;
        this.I = 0L;
        this.f107795v = 0L;
        this.f107789p = false;
        this.f107798y = -9223372036854775807L;
        this.f107799z = -9223372036854775807L;
        this.f107791r = 0L;
        this.f107788o = 0L;
        this.f107783j = 1.0f;
    }

    public void t(float f10) {
        this.f107783j = f10;
        t tVar = this.f107779f;
        if (tVar != null) {
            tVar.h();
        }
        r();
    }

    public void u(q9.h hVar) {
        this.J = hVar;
    }

    public void v() {
        if (this.f107798y != -9223372036854775807L) {
            this.f107798y = o0.P0(this.J.elapsedRealtime());
        }
        ((t) q9.a.e(this.f107779f)).h();
    }
}

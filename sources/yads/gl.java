package yads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class gl {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl f111246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f111247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f111248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f111249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public el f111251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f111252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f111253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f111254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f111255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f111256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f111257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f111258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f111259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f111260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f111261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f111262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f111263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f111264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f111265t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f111266u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f111267v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f111268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f111269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f111270y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f111271z;

    public gl(jb0 jb0Var) {
        this.f111246a = (fl) fi.a(jb0Var);
        if (w83.f117341a >= 18) {
            try {
                this.f111259n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f111247b = new long[10];
    }

    public final long a(long j10) {
        return (j10 * 1000000) / ((long) this.f111252g);
    }

    public final boolean b(long j10) {
        if (j10 > a()) {
            return true;
        }
        if (!this.f111253h) {
            return false;
        }
        AudioTrack audioTrack = this.f111248c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && a() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r29) {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gl.a(boolean):long");
    }

    public final long a() {
        AudioTrack audioTrack = this.f111248c;
        audioTrack.getClass();
        if (this.f111269x != -9223372036854775807L) {
            return Math.min(this.A, this.f111271z + ((((SystemClock.elapsedRealtime() * 1000) - this.f111269x) * ((long) this.f111252g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f111253h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f111266u = this.f111264s;
            }
            playbackHeadPosition += this.f111266u;
        }
        if (w83.f117341a <= 29) {
            if (playbackHeadPosition == 0 && this.f111264s > 0 && playState == 3) {
                if (this.f111270y == -9223372036854775807L) {
                    this.f111270y = SystemClock.elapsedRealtime();
                }
                return this.f111264s;
            }
            this.f111270y = -9223372036854775807L;
        }
        if (this.f111264s > playbackHeadPosition) {
            this.f111265t++;
        }
        this.f111264s = playbackHeadPosition;
        return playbackHeadPosition + (this.f111265t << 32);
    }

    public final void a(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f111248c = audioTrack;
        this.f111249d = i11;
        this.f111250e = i12;
        this.f111251f = new el(audioTrack);
        this.f111252g = audioTrack.getSampleRate();
        this.f111253h = z10 && w83.f117341a < 23 && (i10 == 5 || i10 == 6);
        boolean zE = w83.e(i10);
        this.f111262q = zE;
        this.f111254i = zE ? a(i12 / i11) : -9223372036854775807L;
        this.f111264s = 0L;
        this.f111265t = 0L;
        this.f111266u = 0L;
        this.f111261p = false;
        this.f111269x = -9223372036854775807L;
        this.f111270y = -9223372036854775807L;
        this.f111263r = 0L;
        this.f111260o = 0L;
        this.f111255j = 1.0f;
    }
}

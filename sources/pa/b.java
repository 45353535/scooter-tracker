package pa;

import android.net.Uri;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import io.bidmachine.media3.common.a;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import lb.t;
import oa.h0;
import oa.i;
import oa.l0;
import oa.m0;
import oa.n;
import oa.q;
import oa.r;
import oa.s;
import oa.s0;
import oa.w;
import oa.x;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final x f98133s = new x() { // from class: pa.a
        @Override // oa.x
        public /* synthetic */ x a(t.a aVar) {
            return w.d(this, aVar);
        }

        @Override // oa.x
        public /* synthetic */ x b(int i10) {
            return w.b(this, i10);
        }

        @Override // oa.x
        public final r[] createExtractors() {
            return b.d();
        }

        @Override // oa.x
        public /* synthetic */ x experimentalSetTextTrackTranscodingEnabled(boolean z10) {
            return w.c(this, z10);
        }

        @Override // oa.x
        public /* synthetic */ r[] createExtractors(Uri uri, Map map) {
            return w.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f98134t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[] f98135u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f98136v = o0.u0("#!AMR\n");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f98137w = o0.u0("#!AMR-WB\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f98138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f98139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0 f98140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f98141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f98142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f98143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f98144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f98145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f98146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f98147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f98148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private oa.t f98149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private s0 f98150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private s0 f98151n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m0 f98152o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f98153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f98154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f98155r;

    public b() {
        this(0);
    }

    public static /* synthetic */ r[] d() {
        return new r[]{new b()};
    }

    private void e() {
        q9.a.i(this.f98150m);
        o0.i(this.f98149l);
    }

    private static int f(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private m0 g(long j10, boolean z10) {
        return new i(j10, this.f98145h, f(this.f98146i, 20000L), this.f98146i, z10);
    }

    private int h(int i10) throws n9.x {
        if (k(i10)) {
            return this.f98141d ? f98135u[i10] : f98134t[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f98141d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw n9.x.a(sb2.toString(), null);
    }

    private boolean i(int i10) {
        if (this.f98141d) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    private boolean j(long j10, long j11) {
        return Math.abs(j11 - j10) < 20000;
    }

    private boolean k(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return l(i10) || i(i10);
    }

    private boolean l(int i10) {
        if (this.f98141d) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    private void m() {
        if (this.f98155r) {
            return;
        }
        this.f98155r = true;
        boolean z10 = this.f98141d;
        String str = z10 ? "audio/amr-wb" : "audio/amr";
        this.f98150m.f(new a.b().U(str).u0(z10 ? "audio/amr-wb" : "audio/3gpp").k0(z10 ? f98135u[8] : f98134t[7]).R(1).v0(z10 ? 16000 : 8000).N());
    }

    private void n(long j10, int i10) {
        int i11;
        if (this.f98152o != null) {
            return;
        }
        int i12 = this.f98139b;
        if ((i12 & 4) != 0) {
            this.f98152o = new h0(new long[]{this.f98145h}, new long[]{0}, -9223372036854775807L);
        } else if ((i12 & 1) == 0 || !((i11 = this.f98146i) == -1 || i11 == this.f98143f)) {
            this.f98152o = new m0.b(-9223372036854775807L);
        } else if (this.f98147j >= 20 || i10 == -1) {
            m0 m0VarG = g(j10, (i12 & 2) != 0);
            this.f98152o = m0VarG;
            this.f98150m.d(m0VarG.getDurationUs());
        }
        m0 m0Var = this.f98152o;
        if (m0Var != null) {
            this.f98149l.e(m0Var);
        }
    }

    private static boolean o(s sVar, byte[] bArr) {
        sVar.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        sVar.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int p(s sVar) throws n9.x {
        sVar.resetPeekPosition();
        sVar.peekFully(this.f98138a, 0, 1);
        byte b10 = this.f98138a[0];
        if ((b10 & 131) <= 0) {
            return h((b10 >> 3) & 15);
        }
        throw n9.x.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean q(s sVar) {
        byte[] bArr = f98136v;
        if (o(sVar, bArr)) {
            this.f98141d = false;
            sVar.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = f98137w;
        if (!o(sVar, bArr2)) {
            return false;
        }
        this.f98141d = true;
        sVar.skipFully(bArr2.length);
        return true;
    }

    private int r(s sVar) throws n9.x {
        if (this.f98144g == 0) {
            try {
                int iP = p(sVar);
                this.f98143f = iP;
                this.f98144g = iP;
                if (this.f98146i == -1) {
                    this.f98145h = sVar.getPosition();
                    this.f98146i = this.f98143f;
                }
                if (this.f98146i == this.f98143f) {
                    this.f98147j++;
                }
                m0 m0Var = this.f98152o;
                if (m0Var instanceof h0) {
                    h0 h0Var = (h0) m0Var;
                    long j10 = this.f98148k + this.f98142e + 20000;
                    long position = sVar.getPosition() + ((long) this.f98143f);
                    if (!h0Var.b(j10, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)) {
                        h0Var.a(j10, position);
                    }
                    if (this.f98153p && j(j10, this.f98154q)) {
                        this.f98153p = false;
                        this.f98151n = this.f98150m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iB = this.f98151n.b(sVar, this.f98144g, true);
        if (iB == -1) {
            return -1;
        }
        int i10 = this.f98144g - iB;
        this.f98144g = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f98151n.e(this.f98148k + this.f98142e, 1, this.f98143f, 0, null);
        this.f98142e += 20000;
        return 0;
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) throws n9.x {
        e();
        if (sVar.getPosition() == 0 && !q(sVar)) {
            throw n9.x.a("Could not find AMR header.", null);
        }
        m();
        int iR = r(sVar);
        n(sVar.getLength(), iR);
        if (iR == -1) {
            m0 m0Var = this.f98152o;
            if (m0Var instanceof h0) {
                long j10 = this.f98148k + this.f98142e;
                ((h0) m0Var).c(j10);
                this.f98149l.e(this.f98152o);
                this.f98150m.d(j10);
            }
        }
        return iR;
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f98149l = tVar;
        s0 s0VarTrack = tVar.track(0, 1);
        this.f98150m = s0VarTrack;
        this.f98151n = s0VarTrack;
        tVar.endTracks();
    }

    @Override // oa.r
    public boolean c(s sVar) {
        return q(sVar);
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ r getUnderlyingImplementation() {
        return q.b(this);
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        this.f98142e = 0L;
        this.f98143f = 0;
        this.f98144g = 0;
        this.f98154q = j11;
        m0 m0Var = this.f98152o;
        if (!(m0Var instanceof h0)) {
            if (j10 == 0 || !(m0Var instanceof i)) {
                this.f98148k = 0L;
                return;
            } else {
                this.f98148k = ((i) m0Var).b(j10);
                return;
            }
        }
        long timeUs = ((h0) m0Var).getTimeUs(j10);
        this.f98148k = timeUs;
        if (j(timeUs, this.f98154q)) {
            return;
        }
        this.f98153p = true;
        this.f98151n = this.f98140c;
    }

    public b(int i10) {
        this.f98139b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f98138a = new byte[1];
        this.f98146i = -1;
        n nVar = new n();
        this.f98140c = nVar;
        this.f98151n = nVar;
    }

    @Override // oa.r
    public void release() {
    }
}

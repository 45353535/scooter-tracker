package ia;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.MimeTypes;
import com.google.common.collect.ImmutableList;
import ga.f0;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import lb.k;
import lb.l;
import lb.m;
import lb.p;
import lb.q;
import n9.w;
import q9.o0;
import q9.u;
import u9.d0;
import u9.j0;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends io.bidmachine.media3.exoplayer.h implements Handler.Callback {
    private q A;
    private q B;
    private int C;
    private final Handler D;
    private final h E;
    private final d0 F;
    private boolean G;
    private boolean H;
    private io.bidmachine.media3.common.a I;
    private long J;
    private long K;
    private boolean L;
    private IOException M;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final lb.b f73978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final t9.f f73979t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f73980u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final g f73981v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f73982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f73983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private l f73984y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p f73985z;

    public i(h hVar, Looper looper) {
        this(hVar, looper, g.f73976a);
    }

    private void H() {
        q9.a.h(this.L || Objects.equals(this.I.f80561o, "application/cea-608") || Objects.equals(this.I.f80561o, "application/x-mp4-cea-608") || Objects.equals(this.I.f80561o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.I.f80561o + " samples (expected " + MimeTypes.APPLICATION_MEDIA3_CUES + ").");
    }

    private void I() {
        Y(new p9.b(ImmutableList.of(), L(this.J)));
    }

    private long J(long j10) {
        int nextEventTimeIndex = this.A.getNextEventTimeIndex(j10);
        if (nextEventTimeIndex == 0 || this.A.getEventTimeCount() == 0) {
            return this.A.f104996c;
        }
        if (nextEventTimeIndex != -1) {
            return this.A.getEventTime(nextEventTimeIndex - 1);
        }
        return this.A.getEventTime(r2.getEventTimeCount() - 1);
    }

    private long K() {
        if (this.C == -1) {
            return Long.MAX_VALUE;
        }
        q9.a.e(this.A);
        if (this.C >= this.A.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.A.getEventTime(this.C);
    }

    private long L(long j10) {
        q9.a.g(j10 != -9223372036854775807L);
        return j10 - q();
    }

    private void M(m mVar) {
        u.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.I, mVar);
        I();
        W();
    }

    private static boolean N(k kVar, long j10) {
        return kVar == null || kVar.getEventTime(kVar.getEventTimeCount() - 1) <= j10;
    }

    private void O() {
        this.f73982w = true;
        l lVarB = this.f73981v.b((io.bidmachine.media3.common.a) q9.a.e(this.I));
        this.f73984y = lVarB;
        lVarB.setOutputStartTimeUs(n());
    }

    private void P(p9.b bVar) {
        this.E.onCues(bVar.f98114a);
        this.E.h(bVar);
    }

    private static boolean Q(io.bidmachine.media3.common.a aVar) {
        return Objects.equals(aVar.f80561o, MimeTypes.APPLICATION_MEDIA3_CUES);
    }

    private boolean R(long j10) {
        if (this.G || E(this.F, this.f73979t, 0) != -4) {
            return false;
        }
        if (this.f73979t.f()) {
            this.G = true;
            return false;
        }
        this.f73979t.n();
        ByteBuffer byteBuffer = (ByteBuffer) q9.a.e(this.f73979t.f104988e);
        lb.e eVarA = this.f73978s.a(this.f73979t.f104990g, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f73979t.c();
        return this.f73980u.a(eVarA, j10);
    }

    private void S() {
        this.f73985z = null;
        this.C = -1;
        q qVar = this.A;
        if (qVar != null) {
            qVar.l();
            this.A = null;
        }
        q qVar2 = this.B;
        if (qVar2 != null) {
            qVar2.l();
            this.B = null;
        }
    }

    private void T() {
        S();
        ((l) q9.a.e(this.f73984y)).release();
        this.f73984y = null;
        this.f73983x = 0;
    }

    private void U(long j10) {
        boolean zR = R(j10);
        long nextCueChangeTimeUs = this.f73980u.getNextCueChangeTimeUs(this.J);
        if (nextCueChangeTimeUs == Long.MIN_VALUE && this.G && !zR) {
            this.H = true;
        }
        if (nextCueChangeTimeUs != Long.MIN_VALUE && nextCueChangeTimeUs <= j10) {
            zR = true;
        }
        if (zR) {
            ImmutableList cuesAtTimeUs = this.f73980u.getCuesAtTimeUs(j10);
            long previousCueChangeTimeUs = this.f73980u.getPreviousCueChangeTimeUs(j10);
            Y(new p9.b(cuesAtTimeUs, L(previousCueChangeTimeUs)));
            this.f73980u.discardCuesBeforeTimeUs(previousCueChangeTimeUs);
        }
        this.J = j10;
    }

    private void V(long j10) {
        boolean z10;
        this.J = j10;
        if (this.B == null) {
            ((l) q9.a.e(this.f73984y)).setPositionUs(j10);
            try {
                this.B = (q) ((l) q9.a.e(this.f73984y)).dequeueOutputBuffer();
            } catch (m e10) {
                M(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.A != null) {
            long jK = K();
            z10 = false;
            while (jK <= j10) {
                this.C++;
                jK = K();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        q qVar = this.B;
        if (qVar != null) {
            if (qVar.f()) {
                if (!z10 && K() == Long.MAX_VALUE) {
                    if (this.f73983x == 2) {
                        W();
                    } else {
                        S();
                        this.H = true;
                    }
                }
            } else if (qVar.f104996c <= j10) {
                q qVar2 = this.A;
                if (qVar2 != null) {
                    qVar2.l();
                }
                this.C = qVar.getNextEventTimeIndex(j10);
                this.A = qVar;
                this.B = null;
                z10 = true;
            }
        }
        if (z10) {
            q9.a.e(this.A);
            Y(new p9.b(this.A.getCues(j10), L(J(j10))));
        }
        if (this.f73983x == 2) {
            return;
        }
        while (!this.G) {
            try {
                p pVar = this.f73985z;
                if (pVar == null) {
                    pVar = (p) ((l) q9.a.e(this.f73984y)).dequeueInputBuffer();
                    if (pVar == null) {
                        return;
                    } else {
                        this.f73985z = pVar;
                    }
                }
                if (this.f73983x == 1) {
                    pVar.k(4);
                    ((l) q9.a.e(this.f73984y)).queueInputBuffer(pVar);
                    this.f73985z = null;
                    this.f73983x = 2;
                    return;
                }
                int iE = E(this.F, pVar, 0);
                if (iE == -4) {
                    if (pVar.f()) {
                        this.G = true;
                        this.f73982w = false;
                    } else {
                        io.bidmachine.media3.common.a aVar = this.F.f105308b;
                        if (aVar == null) {
                            return;
                        }
                        pVar.f94115k = aVar.f80566t;
                        pVar.n();
                        this.f73982w &= !pVar.h();
                    }
                    if (!this.f73982w) {
                        ((l) q9.a.e(this.f73984y)).queueInputBuffer(pVar);
                        this.f73985z = null;
                    }
                } else if (iE == -3) {
                    return;
                }
            } catch (m e11) {
                M(e11);
                return;
            }
        }
    }

    private void W() {
        T();
        O();
    }

    private void Y(p9.b bVar) {
        Handler handler = this.D;
        if (handler != null) {
            handler.obtainMessage(1, bVar).sendToTarget();
        } else {
            P(bVar);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void C(io.bidmachine.media3.common.a[] aVarArr, long j10, long j11, f0.b bVar) {
        io.bidmachine.media3.common.a aVar = aVarArr[0];
        this.I = aVar;
        if (Q(aVar)) {
            this.f73980u = this.I.K == 1 ? new e() : new f();
            return;
        }
        H();
        if (this.f73984y != null) {
            this.f73983x = 1;
        } else {
            O();
        }
    }

    public void X(long j10) {
        q9.a.g(isCurrentStreamFinal());
        this.K = j10;
    }

    @Override // io.bidmachine.media3.exoplayer.j2
    public int a(io.bidmachine.media3.common.a aVar) {
        if (Q(aVar) || this.f73981v.a(aVar)) {
            return j0.a(aVar.N == 0 ? 4 : 2);
        }
        return w.s(aVar.f80561o) ? j0.a(1) : j0.a(0);
    }

    @Override // io.bidmachine.media3.exoplayer.i2, io.bidmachine.media3.exoplayer.j2
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        P((p9.b) message.obj);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isEnded() {
        return this.H;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isReady() {
        if (this.I == null) {
            return true;
        }
        if (this.M == null) {
            try {
                maybeThrowStreamError();
            } catch (IOException e10) {
                this.M = e10;
            }
        }
        if (this.M != null) {
            if (Q((io.bidmachine.media3.common.a) q9.a.e(this.I))) {
                return ((a) q9.a.e(this.f73980u)).getNextCueChangeTimeUs(this.J) != Long.MIN_VALUE;
            }
            if (this.H || (this.G && N(this.A, this.J) && N(this.B, this.J) && this.f73985z != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public void render(long j10, long j11) {
        if (isCurrentStreamFinal()) {
            long j12 = this.K;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                S();
                this.H = true;
            }
        }
        if (this.H) {
            return;
        }
        if (Q((io.bidmachine.media3.common.a) q9.a.e(this.I))) {
            q9.a.e(this.f73980u);
            U(j10);
        } else {
            H();
            V(j10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void t() {
        this.I = null;
        this.K = -9223372036854775807L;
        I();
        this.J = -9223372036854775807L;
        if (this.f73984y != null) {
            T();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void w(long j10, boolean z10) {
        this.J = j10;
        a aVar = this.f73980u;
        if (aVar != null) {
            aVar.clear();
        }
        I();
        this.G = false;
        this.H = false;
        this.K = -9223372036854775807L;
        io.bidmachine.media3.common.a aVar2 = this.I;
        if (aVar2 == null || Q(aVar2)) {
            return;
        }
        if (this.f73983x != 0) {
            W();
            return;
        }
        S();
        l lVar = (l) q9.a.e(this.f73984y);
        lVar.flush();
        lVar.setOutputStartTimeUs(n());
    }

    public i(h hVar, Looper looper, g gVar) {
        super(3);
        this.E = (h) q9.a.e(hVar);
        this.D = looper == null ? null : o0.z(looper, this);
        this.f73981v = gVar;
        this.f73978s = new lb.b();
        this.f73979t = new t9.f(1);
        this.F = new d0();
        this.K = -9223372036854775807L;
        this.J = -9223372036854775807L;
        this.L = false;
    }
}

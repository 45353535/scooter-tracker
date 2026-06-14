package lb;

import androidx.media3.common.MimeTypes;
import java.io.EOFException;
import lb.t;
import oa.r0;
import oa.s0;
import q9.d0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class w implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f94130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t.a f94131b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private t f94137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private io.bidmachine.media3.common.a f94138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f94139j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f94132c = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f94134e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f94135f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f94136g = o0.f98842f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f94133d = new d0();

    public w(s0 s0Var, t.a aVar) {
        this.f94130a = s0Var;
        this.f94131b = aVar;
    }

    private void i(int i10) {
        int length = this.f94136g.length;
        int i11 = this.f94135f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f94134e;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f94136g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f94134e, bArr2, 0, i12);
        this.f94134e = 0;
        this.f94135f = i12;
        this.f94136g = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(e eVar, long j10, int i10) {
        q9.a.i(this.f94138i);
        byte[] bArrA = this.f94132c.a(eVar.f94092a, eVar.f94094c);
        this.f94133d.T(bArrA);
        this.f94130a.c(this.f94133d, bArrA.length);
        long j11 = eVar.f94093b;
        if (j11 == -9223372036854775807L) {
            q9.a.g(this.f94138i.f80566t == Long.MAX_VALUE);
        } else {
            long j12 = this.f94138i.f80566t;
            j10 = j12 == Long.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f94130a.e(j10, i10 | 1, bArrA.length, 0, null);
    }

    @Override // oa.s0
    public void a(d0 d0Var, int i10, int i11) {
        if (this.f94137h == null) {
            this.f94130a.a(d0Var, i10, i11);
            return;
        }
        i(i10);
        d0Var.l(this.f94136g, this.f94135f, i10);
        this.f94135f += i10;
    }

    @Override // oa.s0
    public /* synthetic */ int b(n9.h hVar, int i10, boolean z10) {
        return r0.b(this, hVar, i10, z10);
    }

    @Override // oa.s0
    public /* synthetic */ void c(d0 d0Var, int i10) {
        r0.c(this, d0Var, i10);
    }

    @Override // oa.s0
    public /* synthetic */ void d(long j10) {
        r0.a(this, j10);
    }

    @Override // oa.s0
    public void e(final long j10, final int i10, int i11, int i12, s0.a aVar) {
        if (this.f94137h == null) {
            this.f94130a.e(j10, i10, i11, i12, aVar);
            return;
        }
        q9.a.b(aVar == null, "DRM on subtitles is not supported");
        int i13 = (this.f94135f - i12) - i11;
        try {
            this.f94137h.a(this.f94136g, i13, i11, t.b.b(), new q9.l() { // from class: lb.v
                @Override // q9.l
                public final void accept(Object obj) {
                    this.f94127a.j((e) obj, j10, i10);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.f94139j) {
                throw e10;
            }
            q9.u.i("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.f94134e = i14;
        if (i14 == this.f94135f) {
            this.f94134e = 0;
            this.f94135f = 0;
        }
    }

    @Override // oa.s0
    public void f(io.bidmachine.media3.common.a aVar) {
        q9.a.e(aVar.f80561o);
        q9.a.a(n9.w.k(aVar.f80561o) == 3);
        if (!aVar.equals(this.f94138i)) {
            this.f94138i = aVar;
            this.f94137h = this.f94131b.a(aVar) ? this.f94131b.c(aVar) : null;
        }
        if (this.f94137h == null) {
            this.f94130a.f(aVar);
        } else {
            this.f94130a.f(aVar.b().u0(MimeTypes.APPLICATION_MEDIA3_CUES).S(aVar.f80561o).y0(Long.MAX_VALUE).W(this.f94131b.b(aVar)).N());
        }
    }

    @Override // oa.s0
    public int g(n9.h hVar, int i10, boolean z10, int i11) throws EOFException {
        if (this.f94137h == null) {
            return this.f94130a.g(hVar, i10, z10, i11);
        }
        i(i10);
        int i12 = hVar.read(this.f94136g, this.f94135f, i10);
        if (i12 != -1) {
            this.f94135f += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void k(boolean z10) {
        this.f94139j = z10;
    }
}

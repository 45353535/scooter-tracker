package lb;

import androidx.media3.common.MimeTypes;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lb.t;
import n9.x;
import oa.h0;
import oa.l0;
import oa.s0;
import q9.d0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public class o implements oa.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f94102a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.bidmachine.media3.common.a f94104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f94105d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f94108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f94109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f94110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f94111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f94112k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f94103b = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f94107f = o0.f98842f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f94106e = new d0();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f94113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f94114c;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f94113b, bVar.f94113b);
        }

        private b(long j10, byte[] bArr) {
            this.f94113b = j10;
            this.f94114c = bArr;
        }
    }

    public o(t tVar, io.bidmachine.media3.common.a aVar) {
        this.f94102a = tVar;
        this.f94104c = aVar != null ? aVar.b().u0(MimeTypes.APPLICATION_MEDIA3_CUES).S(aVar.f80561o).W(tVar.getCueReplacementBehavior()).N() : null;
        this.f94105d = new ArrayList();
        this.f94110i = 0;
        this.f94111j = o0.f98843g;
        this.f94112k = -9223372036854775807L;
    }

    public static /* synthetic */ void d(o oVar, e eVar) {
        oVar.getClass();
        b bVar = new b(eVar.f94093b, oVar.f94103b.a(eVar.f94092a, eVar.f94094c));
        oVar.f94105d.add(bVar);
        long j10 = oVar.f94112k;
        if (j10 == -9223372036854775807L || eVar.f94093b >= j10) {
            oVar.i(bVar);
        }
    }

    private void e() throws x {
        try {
            long j10 = this.f94112k;
            this.f94102a.a(this.f94107f, 0, this.f94109h, j10 != -9223372036854775807L ? t.b.c(j10) : t.b.b(), new q9.l() { // from class: lb.n
                @Override // q9.l
                public final void accept(Object obj) {
                    o.d(this.f94101a, (e) obj);
                }
            });
            Collections.sort(this.f94105d);
            this.f94111j = new long[this.f94105d.size()];
            for (int i10 = 0; i10 < this.f94105d.size(); i10++) {
                this.f94111j[i10] = ((b) this.f94105d.get(i10)).f94113b;
            }
            this.f94107f = o0.f98842f;
        } catch (RuntimeException e10) {
            throw x.a("SubtitleParser failed.", e10);
        }
    }

    private boolean f(oa.s sVar) {
        byte[] bArr = this.f94107f;
        if (bArr.length == this.f94109h) {
            this.f94107f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f94107f;
        int i10 = this.f94109h;
        int i11 = sVar.read(bArr2, i10, bArr2.length - i10);
        if (i11 != -1) {
            this.f94109h += i11;
        }
        long length = sVar.getLength();
        return (length != -1 && ((long) this.f94109h) == length) || i11 == -1;
    }

    private boolean g(oa.s sVar) {
        return sVar.skip((sVar.getLength() > (-1L) ? 1 : (sVar.getLength() == (-1L) ? 0 : -1)) != 0 ? Ints.checkedCast(sVar.getLength()) : 1024) == -1;
    }

    private void h() {
        long j10 = this.f94112k;
        for (int iH = j10 == -9223372036854775807L ? 0 : o0.h(this.f94111j, j10, true, true); iH < this.f94105d.size(); iH++) {
            i((b) this.f94105d.get(iH));
        }
    }

    private void i(b bVar) {
        q9.a.i(this.f94108g);
        int length = bVar.f94114c.length;
        this.f94106e.T(bVar.f94114c);
        this.f94108g.c(this.f94106e, length);
        this.f94108g.e(bVar.f94113b, 1, length, 0, null);
    }

    @Override // oa.r
    public int a(oa.s sVar, l0 l0Var) throws x {
        int i10 = this.f94110i;
        q9.a.g((i10 == 0 || i10 == 5) ? false : true);
        if (this.f94110i == 1) {
            int iCheckedCast = sVar.getLength() != -1 ? Ints.checkedCast(sVar.getLength()) : 1024;
            if (iCheckedCast > this.f94107f.length) {
                this.f94107f = new byte[iCheckedCast];
            }
            this.f94109h = 0;
            this.f94110i = 2;
        }
        if (this.f94110i == 2 && f(sVar)) {
            e();
            this.f94110i = 4;
        }
        if (this.f94110i == 3 && g(sVar)) {
            h();
            this.f94110i = 4;
        }
        return this.f94110i == 4 ? -1 : 0;
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        q9.a.g(this.f94110i == 0);
        s0 s0VarTrack = tVar.track(0, 3);
        this.f94108g = s0VarTrack;
        io.bidmachine.media3.common.a aVar = this.f94104c;
        if (aVar != null) {
            s0VarTrack.f(aVar);
            tVar.endTracks();
            tVar.e(new h0(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f94110i = 1;
    }

    @Override // oa.r
    public boolean c(oa.s sVar) {
        return true;
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return oa.q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ oa.r getUnderlyingImplementation() {
        return oa.q.b(this);
    }

    @Override // oa.r
    public void release() {
        if (this.f94110i == 5) {
            return;
        }
        this.f94102a.reset();
        this.f94110i = 5;
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        int i10 = this.f94110i;
        q9.a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f94112k = j11;
        if (this.f94110i == 2) {
            this.f94110i = 1;
        }
        if (this.f94110i == 4) {
            this.f94110i = 3;
        }
    }
}

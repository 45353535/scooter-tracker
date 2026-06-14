package ha;

import android.util.SparseArray;
import androidx.media3.common.MimeTypes;
import ha.f;
import io.bidmachine.media3.common.a;
import j$.util.Objects;
import java.util.List;
import lb.t;
import n9.w;
import oa.l0;
import oa.m0;
import oa.r;
import oa.r0;
import oa.s;
import oa.s0;
import oa.t;
import q9.d0;
import q9.o0;
import v9.c2;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements t, f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f72983k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final l0 f72984l = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f72985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f72986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.media3.common.a f72987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f72988e = new SparseArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f72989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f.b f72990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f72991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m0 f72992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private io.bidmachine.media3.common.a[] f72993j;

    private static final class a implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f72994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.bidmachine.media3.common.a f72996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final oa.n f72997d = new oa.n();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.bidmachine.media3.common.a f72998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private s0 f72999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f73000g;

        public a(int i10, int i11, io.bidmachine.media3.common.a aVar) {
            this.f72994a = i10;
            this.f72995b = i11;
            this.f72996c = aVar;
        }

        @Override // oa.s0
        public void a(d0 d0Var, int i10, int i11) {
            ((s0) o0.i(this.f72999f)).c(d0Var, i10);
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
        public void e(long j10, int i10, int i11, int i12, s0.a aVar) {
            long j11 = this.f73000g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f72999f = this.f72997d;
            }
            ((s0) o0.i(this.f72999f)).e(j10, i10, i11, i12, aVar);
        }

        @Override // oa.s0
        public void f(io.bidmachine.media3.common.a aVar) {
            io.bidmachine.media3.common.a aVar2 = this.f72996c;
            if (aVar2 != null) {
                aVar = aVar.i(aVar2);
            }
            this.f72998e = aVar;
            ((s0) o0.i(this.f72999f)).f(this.f72998e);
        }

        @Override // oa.s0
        public int g(n9.h hVar, int i10, boolean z10, int i11) {
            return ((s0) o0.i(this.f72999f)).b(hVar, i10, z10);
        }

        public void h(f.b bVar, long j10) {
            if (bVar == null) {
                this.f72999f = this.f72997d;
                return;
            }
            this.f73000g = j10;
            s0 s0VarTrack = bVar.track(this.f72994a, this.f72995b);
            this.f72999f = s0VarTrack;
            io.bidmachine.media3.common.a aVar = this.f72998e;
            if (aVar != null) {
                s0VarTrack.f(aVar);
            }
        }
    }

    public static final class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private t.a f73001a = new lb.h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f73002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f73003c;

        @Override // ha.f.a
        public io.bidmachine.media3.common.a c(io.bidmachine.media3.common.a aVar) {
            String str;
            if (!this.f73002b || !this.f73001a.a(aVar)) {
                return aVar;
            }
            a.b bVarW = aVar.b().u0(MimeTypes.APPLICATION_MEDIA3_CUES).W(this.f73001a.b(aVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVar.f80561o);
            if (aVar.f80557k != null) {
                str = " " + aVar.f80557k;
            } else {
                str = "";
            }
            sb2.append(str);
            return bVarW.S(sb2.toString()).y0(Long.MAX_VALUE).N();
        }

        @Override // ha.f.a
        public f d(int i10, io.bidmachine.media3.common.a aVar, boolean z10, List list, s0 s0Var, c2 c2Var) {
            r hVar;
            String str = aVar.f80560n;
            if (!w.s(str)) {
                if (w.r(str)) {
                    hVar = new gb.e(this.f73001a, this.f73002b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar = new wa.a(1);
                } else if (Objects.equals(str, MimeTypes.IMAGE_PNG)) {
                    hVar = new kb.a();
                } else {
                    int i11 = z10 ? 4 : 0;
                    if (!this.f73002b) {
                        i11 |= 32;
                    }
                    hVar = new ib.h(this.f73001a, i11 | ib.h.h(this.f73003c), null, null, list, s0Var);
                }
            } else {
                if (!this.f73002b) {
                    return null;
                }
                hVar = new lb.o(this.f73001a.c(aVar), aVar);
            }
            return new d(hVar, i10, aVar);
        }

        @Override // ha.f.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b experimentalParseSubtitlesDuringExtraction(boolean z10) {
            this.f73002b = z10;
            return this;
        }

        @Override // ha.f.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b b(int i10) {
            this.f73003c = i10;
            return this;
        }

        @Override // ha.f.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b a(t.a aVar) {
            this.f73001a = (t.a) q9.a.e(aVar);
            return this;
        }
    }

    public d(r rVar, int i10, io.bidmachine.media3.common.a aVar) {
        this.f72985b = rVar;
        this.f72986c = i10;
        this.f72987d = aVar;
    }

    @Override // ha.f
    public boolean a(s sVar) {
        int iA = this.f72985b.a(sVar, f72984l);
        q9.a.g(iA != 1);
        return iA == 0;
    }

    @Override // ha.f
    public void b(f.b bVar, long j10, long j11) {
        this.f72990g = bVar;
        this.f72991h = j11;
        if (!this.f72989f) {
            this.f72985b.b(this);
            if (j10 != -9223372036854775807L) {
                this.f72985b.seek(0L, j10);
            }
            this.f72989f = true;
            return;
        }
        r rVar = this.f72985b;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        rVar.seek(0L, j10);
        for (int i10 = 0; i10 < this.f72988e.size(); i10++) {
            ((a) this.f72988e.valueAt(i10)).h(bVar, j11);
        }
    }

    @Override // oa.t
    public void e(m0 m0Var) {
        this.f72992i = m0Var;
    }

    @Override // oa.t
    public void endTracks() {
        io.bidmachine.media3.common.a[] aVarArr = new io.bidmachine.media3.common.a[this.f72988e.size()];
        for (int i10 = 0; i10 < this.f72988e.size(); i10++) {
            aVarArr[i10] = (io.bidmachine.media3.common.a) q9.a.i(((a) this.f72988e.valueAt(i10)).f72998e);
        }
        this.f72993j = aVarArr;
    }

    @Override // ha.f
    public oa.h getChunkIndex() {
        m0 m0Var = this.f72992i;
        if (m0Var instanceof oa.h) {
            return (oa.h) m0Var;
        }
        return null;
    }

    @Override // ha.f
    public io.bidmachine.media3.common.a[] getSampleFormats() {
        return this.f72993j;
    }

    @Override // ha.f
    public void release() {
        this.f72985b.release();
    }

    @Override // oa.t
    public s0 track(int i10, int i11) {
        a aVar = (a) this.f72988e.get(i10);
        if (aVar == null) {
            q9.a.g(this.f72993j == null);
            aVar = new a(i10, i11, i11 == this.f72986c ? this.f72987d : null);
            aVar.h(this.f72990g, this.f72991h);
            this.f72988e.put(i10, aVar);
        }
        return aVar;
    }
}

package ca;

import android.graphics.Bitmap;
import ca.c;
import io.bidmachine.media3.exoplayer.h;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import io.bidmachine.media3.exoplayer.s;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import q9.k0;
import u9.d0;
import u9.j0;

/* JADX INFO: loaded from: classes12.dex */
public class f extends h {
    private int A;
    private int B;
    private io.bidmachine.media3.common.a C;
    private c D;
    private t9.f E;
    private ImageOutput F;
    private Bitmap G;
    private boolean H;
    private b I;
    private b J;
    private int K;
    private boolean L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c.a f6624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final t9.f f6625t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ArrayDeque f6626u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f6627v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f6628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private a f6629x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f6630y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f6631z;

    private static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f6632c = new a(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6634b;

        public a(long j10, long j11) {
            this.f6633a = j10;
            this.f6634b = j11;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f6636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f6637c;

        public b(int i10, long j10) {
            this.f6635a = i10;
            this.f6636b = j10;
        }

        public long a() {
            return this.f6636b;
        }

        public Bitmap b() {
            return this.f6637c;
        }

        public int c() {
            return this.f6635a;
        }

        public boolean d() {
            return this.f6637c != null;
        }

        public void e(Bitmap bitmap) {
            this.f6637c = bitmap;
        }
    }

    public f(c.a aVar, ImageOutput imageOutput) {
        super(4);
        this.f6624s = aVar;
        this.F = L(imageOutput);
        this.f6625t = t9.f.p();
        this.f6629x = a.f6632c;
        this.f6626u = new ArrayDeque();
        this.f6631z = -9223372036854775807L;
        this.f6630y = -9223372036854775807L;
        this.A = 0;
        this.B = 1;
    }

    private boolean H(io.bidmachine.media3.common.a aVar) {
        int iA = this.f6624s.a(aVar);
        return iA == j0.a(4) || iA == j0.a(3);
    }

    private Bitmap I(int i10) {
        q9.a.i(this.G);
        int width = this.G.getWidth() / ((io.bidmachine.media3.common.a) q9.a.i(this.C)).L;
        int height = this.G.getHeight() / ((io.bidmachine.media3.common.a) q9.a.i(this.C)).M;
        int i11 = this.C.L;
        return Bitmap.createBitmap(this.G, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    private boolean J(long j10, long j11) throws s {
        if (this.G != null && this.I == null) {
            return false;
        }
        if (this.B == 0 && getState() != 2) {
            return false;
        }
        if (this.G == null) {
            q9.a.i(this.D);
            e eVarDequeueOutputBuffer = this.D.dequeueOutputBuffer();
            if (eVarDequeueOutputBuffer == null) {
                return false;
            }
            if (((e) q9.a.i(eVarDequeueOutputBuffer)).f()) {
                if (this.A == 3) {
                    T();
                    q9.a.i(this.C);
                    P();
                } else {
                    ((e) q9.a.i(eVarDequeueOutputBuffer)).l();
                    if (this.f6626u.isEmpty()) {
                        this.f6628w = true;
                    }
                }
                return false;
            }
            q9.a.j(eVarDequeueOutputBuffer.f6623f, "Non-EOS buffer came back from the decoder without bitmap.");
            this.G = eVarDequeueOutputBuffer.f6623f;
            ((e) q9.a.i(eVarDequeueOutputBuffer)).l();
        }
        if (!this.H || this.G == null || this.I == null) {
            return false;
        }
        q9.a.i(this.C);
        io.bidmachine.media3.common.a aVar = this.C;
        int i10 = aVar.L;
        boolean z10 = ((i10 == 1 && aVar.M == 1) || i10 == -1 || aVar.M == -1) ? false : true;
        if (!this.I.d()) {
            b bVar = this.I;
            bVar.e(z10 ? I(bVar.c()) : (Bitmap) q9.a.i(this.G));
        }
        if (!S(j10, j11, (Bitmap) q9.a.i(this.I.b()), this.I.a())) {
            return false;
        }
        R(((b) q9.a.i(this.I)).a());
        this.B = 3;
        if (!z10 || ((b) q9.a.i(this.I)).c() == (((io.bidmachine.media3.common.a) q9.a.i(this.C)).M * ((io.bidmachine.media3.common.a) q9.a.i(this.C)).L) - 1) {
            this.G = null;
        }
        this.I = this.J;
        this.J = null;
        return true;
    }

    private boolean K(long j10) {
        if (this.H && this.I != null) {
            return false;
        }
        d0 d0VarL = l();
        c cVar = this.D;
        if (cVar == null || this.A == 3 || this.f6627v) {
            return false;
        }
        if (this.E == null) {
            t9.f fVar = (t9.f) cVar.dequeueInputBuffer();
            this.E = fVar;
            if (fVar == null) {
                return false;
            }
        }
        if (this.A == 2) {
            q9.a.i(this.E);
            this.E.k(4);
            ((c) q9.a.i(this.D)).a(this.E);
            this.E = null;
            this.A = 3;
            return false;
        }
        int iE = E(d0VarL, this.E, 0);
        if (iE == -5) {
            this.C = (io.bidmachine.media3.common.a) q9.a.i(d0VarL.f105308b);
            this.L = true;
            this.A = 2;
            return true;
        }
        if (iE != -4) {
            if (iE == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.E.n();
        ByteBuffer byteBuffer = this.E.f104988e;
        boolean z10 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((t9.f) q9.a.i(this.E)).f();
        if (z10) {
            ((c) q9.a.i(this.D)).a((t9.f) q9.a.i(this.E));
            this.K = 0;
        }
        O(j10, (t9.f) q9.a.i(this.E));
        if (((t9.f) q9.a.i(this.E)).f()) {
            this.f6627v = true;
            this.E = null;
            return false;
        }
        this.f6631z = Math.max(this.f6631z, ((t9.f) q9.a.i(this.E)).f104990g);
        if (z10) {
            this.E = null;
        } else {
            ((t9.f) q9.a.i(this.E)).c();
        }
        return !this.H;
    }

    private static ImageOutput L(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f81091a : imageOutput;
    }

    private boolean M(b bVar) {
        return ((io.bidmachine.media3.common.a) q9.a.i(this.C)).L == -1 || this.C.M == -1 || bVar.c() == (((io.bidmachine.media3.common.a) q9.a.i(this.C)).M * this.C.L) - 1;
    }

    private void N(int i10) {
        this.B = Math.min(this.B, i10);
    }

    private void O(long j10, t9.f fVar) {
        boolean z10 = true;
        if (fVar.f()) {
            this.H = true;
            return;
        }
        b bVar = new b(this.K, fVar.f104990g);
        this.J = bVar;
        this.K++;
        if (!this.H) {
            long jA = bVar.a();
            boolean z11 = jA - 30000 <= j10 && j10 <= 30000 + jA;
            b bVar2 = this.I;
            boolean z12 = bVar2 != null && bVar2.a() <= j10 && j10 < jA;
            boolean zM = M((b) q9.a.i(this.J));
            if (!z11 && !z12 && !zM) {
                z10 = false;
            }
            this.H = z10;
            if (z12 && !z11) {
                return;
            }
        }
        this.I = this.J;
        this.J = null;
    }

    private boolean P() throws s {
        if (!Q()) {
            return false;
        }
        if (!this.L) {
            return true;
        }
        if (!H((io.bidmachine.media3.common.a) q9.a.e(this.C))) {
            throw h(new d("Provided decoder factory can't create decoder for format."), this.C, 4005);
        }
        c cVar = this.D;
        if (cVar != null) {
            cVar.release();
        }
        this.D = this.f6624s.createImageDecoder();
        this.L = false;
        return true;
    }

    private void R(long j10) {
        this.f6630y = j10;
        while (!this.f6626u.isEmpty() && j10 >= ((a) this.f6626u.peek()).f6633a) {
            this.f6629x = (a) this.f6626u.removeFirst();
        }
    }

    private void T() {
        this.E = null;
        this.A = 0;
        this.f6631z = -9223372036854775807L;
        c cVar = this.D;
        if (cVar != null) {
            cVar.release();
            this.D = null;
        }
    }

    private void U(ImageOutput imageOutput) {
        this.F = L(imageOutput);
    }

    private boolean V() {
        boolean z10 = getState() == 2;
        int i10 = this.B;
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // io.bidmachine.media3.exoplayer.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void C(io.bidmachine.media3.common.a[] r5, long r6, long r8, ga.f0.b r10) {
        /*
            r4 = this;
            super.C(r5, r6, r8, r10)
            r5 = r4
            ca.f$a r6 = r5.f6629x
            long r6 = r6.f6634b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L37
            java.util.ArrayDeque r6 = r5.f6626u
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2a
            long r6 = r5.f6631z
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            long r2 = r5.f6630y
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L2a
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L2a
            goto L37
        L2a:
            java.util.ArrayDeque r6 = r5.f6626u
            ca.f$a r7 = new ca.f$a
            long r0 = r5.f6631z
            r7.<init>(r0, r8)
            r6.add(r7)
            return
        L37:
            ca.f$a r6 = new ca.f$a
            r6.<init>(r0, r8)
            r5.f6629x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.f.C(io.bidmachine.media3.common.a[], long, long, ga.f0$b):void");
    }

    protected boolean Q() {
        return true;
    }

    protected boolean S(long j10, long j11, Bitmap bitmap, long j12) {
        long j13 = j12 - j10;
        if (!V() && j13 >= 30000) {
            return false;
        }
        this.F.onImageAvailable(j12 - this.f6629x.f6634b, bitmap);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.j2
    public int a(io.bidmachine.media3.common.a aVar) {
        return this.f6624s.a(aVar);
    }

    @Override // io.bidmachine.media3.exoplayer.i2, io.bidmachine.media3.exoplayer.j2
    public String getName() {
        return "ImageRenderer";
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.g2.b
    public void handleMessage(int i10, Object obj) {
        if (i10 != 15) {
            super.handleMessage(i10, obj);
        } else {
            U(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isEnded() {
        return this.f6628w;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isReady() {
        int i10 = this.B;
        if (i10 != 3) {
            return i10 == 0 && this.H;
        }
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public void render(long j10, long j11) throws s {
        if (this.f6628w) {
            return;
        }
        if (this.C == null) {
            d0 d0VarL = l();
            this.f6625t.c();
            int iE = E(d0VarL, this.f6625t, 2);
            if (iE != -5) {
                if (iE == -4) {
                    q9.a.g(this.f6625t.f());
                    this.f6627v = true;
                    this.f6628w = true;
                    return;
                }
                return;
            }
            this.C = (io.bidmachine.media3.common.a) q9.a.i(d0VarL.f105308b);
            this.L = true;
        }
        if (this.D != null || P()) {
            try {
                k0.a("drainAndFeedDecoder");
                while (J(j10, j11)) {
                }
                while (K(j10)) {
                }
                k0.b();
            } catch (d e10) {
                throw h(e10, null, 4003);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void t() {
        this.C = null;
        this.f6629x = a.f6632c;
        this.f6626u.clear();
        T();
        this.F.onDisabled();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void u(boolean z10, boolean z11) {
        this.B = z11 ? 1 : 0;
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void w(long j10, boolean z10) {
        N(1);
        this.f6628w = false;
        this.f6627v = false;
        this.G = null;
        this.I = null;
        this.J = null;
        this.H = false;
        this.E = null;
        c cVar = this.D;
        if (cVar != null) {
            cVar.flush();
        }
        this.f6626u.clear();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void x() {
        T();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void z() {
        T();
        N(1);
    }
}

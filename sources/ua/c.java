package ua;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import lb.t;
import oa.l0;
import oa.m0;
import oa.q;
import oa.r;
import oa.s;
import oa.w;
import oa.x;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final x f105337q = new x() { // from class: ua.b
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
            return c.d();
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

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private oa.t f105343f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f105345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f105346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f105347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f105348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f105349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f105350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f105351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f105352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f f105353p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f105338a = new d0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f105339b = new d0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f105340c = new d0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f105341d = new d0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f105342e = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f105344g = 1;

    public static /* synthetic */ r[] d() {
        return new r[]{new c()};
    }

    private void e() {
        if (this.f105351n) {
            return;
        }
        this.f105343f.e(new m0.b(-9223372036854775807L));
        this.f105351n = true;
    }

    private long f() {
        if (this.f105345h) {
            return this.f105346i + this.f105350m;
        }
        if (this.f105342e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f105350m;
    }

    private d0 g(s sVar) {
        if (this.f105349l > this.f105341d.b()) {
            d0 d0Var = this.f105341d;
            d0Var.U(new byte[Math.max(d0Var.b() * 2, this.f105349l)], 0);
        } else {
            this.f105341d.W(0);
        }
        this.f105341d.V(this.f105349l);
        sVar.readFully(this.f105341d.e(), 0, this.f105349l);
        return this.f105341d;
    }

    private boolean h(s sVar) {
        if (!sVar.readFully(this.f105339b.e(), 0, 9, true)) {
            return false;
        }
        this.f105339b.W(0);
        this.f105339b.X(4);
        int iH = this.f105339b.H();
        boolean z10 = (iH & 4) != 0;
        boolean z11 = (iH & 1) != 0;
        if (z10 && this.f105352o == null) {
            this.f105352o = new a(this.f105343f.track(8, 1));
        }
        if (z11 && this.f105353p == null) {
            this.f105353p = new f(this.f105343f.track(9, 2));
        }
        this.f105343f.endTracks();
        this.f105347j = this.f105339b.q() - 5;
        this.f105344g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean i(oa.s r10) {
        /*
            r9 = this;
            long r0 = r9.f()
            int r2 = r9.f105348k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            ua.a r3 = r9.f105352o
            if (r3 == 0) goto L23
            r9.e()
            ua.a r2 = r9.f105352o
            q9.d0 r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            ua.f r3 = r9.f105353p
            if (r3 == 0) goto L39
            r9.e()
            ua.f r2 = r9.f105353p
            q9.d0 r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f105351n
            if (r2 != 0) goto L6e
            ua.d r2 = r9.f105342e
            q9.d0 r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
            ua.d r0 = r9.f105342e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            oa.t r2 = r9.f105343f
            oa.h0 r3 = new oa.h0
            ua.d r7 = r9.f105342e
            long[] r7 = r7.e()
            ua.d r8 = r9.f105342e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.e(r3)
            r9.f105351n = r6
            goto L21
        L6e:
            int r0 = r9.f105349l
            r10.skipFully(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f105345h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f105345h = r6
            ua.d r10 = r9.f105342e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f105350m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f105346i = r1
        L8f:
            r10 = 4
            r9.f105347j = r10
            r10 = 2
            r9.f105344g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.c.i(oa.s):boolean");
    }

    private boolean j(s sVar) {
        if (!sVar.readFully(this.f105340c.e(), 0, 11, true)) {
            return false;
        }
        this.f105340c.W(0);
        this.f105348k = this.f105340c.H();
        this.f105349l = this.f105340c.K();
        this.f105350m = this.f105340c.K();
        this.f105350m = (((long) (this.f105340c.H() << 24)) | this.f105350m) * 1000;
        this.f105340c.X(3);
        this.f105344g = 4;
        return true;
    }

    private void k(s sVar) {
        sVar.skipFully(this.f105347j);
        this.f105347j = 0;
        this.f105344g = 3;
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) {
        q9.a.i(this.f105343f);
        while (true) {
            int i10 = this.f105344g;
            if (i10 != 1) {
                if (i10 == 2) {
                    k(sVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (i(sVar)) {
                        return 0;
                    }
                } else if (!j(sVar)) {
                    return -1;
                }
            } else if (!h(sVar)) {
                return -1;
            }
        }
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f105343f = tVar;
    }

    @Override // oa.r
    public boolean c(s sVar) {
        sVar.peekFully(this.f105338a.e(), 0, 3);
        this.f105338a.W(0);
        if (this.f105338a.K() != 4607062) {
            return false;
        }
        sVar.peekFully(this.f105338a.e(), 0, 2);
        this.f105338a.W(0);
        if ((this.f105338a.P() & 250) != 0) {
            return false;
        }
        sVar.peekFully(this.f105338a.e(), 0, 4);
        this.f105338a.W(0);
        int iQ = this.f105338a.q();
        sVar.resetPeekPosition();
        sVar.advancePeekPosition(iQ);
        sVar.peekFully(this.f105338a.e(), 0, 4);
        this.f105338a.W(0);
        return this.f105338a.q() == 0;
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
        if (j10 == 0) {
            this.f105344g = 1;
            this.f105345h = false;
        } else {
            this.f105344g = 3;
        }
        this.f105347j = 0;
    }

    @Override // oa.r
    public void release() {
    }
}

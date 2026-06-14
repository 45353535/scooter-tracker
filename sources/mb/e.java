package mb;

import java.util.ArrayDeque;
import lb.k;
import lb.l;
import lb.p;
import lb.q;
import mb.e;
import q9.o0;
import t9.g;

/* JADX INFO: loaded from: classes12.dex */
abstract class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f94829a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f94830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f94831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f94832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f94833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f94834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f94835g;

    private static final class b extends p implements Comparable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f94836l;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (f() != bVar.f()) {
                return f() ? 1 : -1;
            }
            long j10 = this.f104990g - bVar.f104990g;
            if (j10 == 0) {
                j10 = this.f94836l - bVar.f94836l;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private g.a f94837h;

        public c(g.a aVar) {
            this.f94837h = aVar;
        }

        @Override // t9.g
        public final void l() {
            this.f94837h.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f94829a.add(new b());
        }
        this.f94830b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f94830b.add(new c(new g.a() { // from class: mb.d
                @Override // t9.g.a
                public final void a(g gVar) {
                    this.f94828a.k((e.c) gVar);
                }
            }));
        }
        this.f94831c = new ArrayDeque();
        this.f94835g = -9223372036854775807L;
    }

    private void j(b bVar) {
        bVar.c();
        this.f94829a.add(bVar);
    }

    protected abstract k b();

    protected abstract void c(p pVar);

    @Override // t9.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public p dequeueInputBuffer() {
        q9.a.g(this.f94832d == null);
        if (this.f94829a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f94829a.pollFirst();
        this.f94832d = bVar;
        return bVar;
    }

    @Override // t9.d, ca.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public q dequeueOutputBuffer() {
        if (this.f94830b.isEmpty()) {
            return null;
        }
        while (!this.f94831c.isEmpty() && ((b) o0.i((b) this.f94831c.peek())).f104990g <= this.f94833e) {
            b bVar = (b) o0.i((b) this.f94831c.poll());
            if (bVar.f()) {
                q qVar = (q) o0.i((q) this.f94830b.pollFirst());
                qVar.a(4);
                j(bVar);
                return qVar;
            }
            c(bVar);
            if (h()) {
                k kVarB = b();
                q qVar2 = (q) o0.i((q) this.f94830b.pollFirst());
                qVar2.m(bVar.f104990g, kVarB, Long.MAX_VALUE);
                j(bVar);
                return qVar2;
            }
            j(bVar);
        }
        return null;
    }

    protected final q f() {
        return (q) this.f94830b.pollFirst();
    }

    @Override // t9.d
    public void flush() {
        this.f94834f = 0L;
        this.f94833e = 0L;
        while (!this.f94831c.isEmpty()) {
            j((b) o0.i((b) this.f94831c.poll()));
        }
        b bVar = this.f94832d;
        if (bVar != null) {
            j(bVar);
            this.f94832d = null;
        }
    }

    protected final long g() {
        return this.f94833e;
    }

    protected abstract boolean h();

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    @Override // t9.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void queueInputBuffer(lb.p r7) {
        /*
            r6 = this;
            mb.e$b r0 = r6.f94832d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            q9.a.a(r0)
            mb.e$b r7 = (mb.e.b) r7
            boolean r0 = r7.f()
            if (r0 != 0) goto L2d
            long r0 = r7.f104990g
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2d
            long r2 = r6.f94835g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r6.j(r7)
            goto L3c
        L2d:
            long r0 = r6.f94834f
            r2 = 1
            long r2 = r2 + r0
            r6.f94834f = r2
            mb.e.b.r(r7, r0)
            java.util.ArrayDeque r0 = r6.f94831c
            r0.add(r7)
        L3c:
            r7 = 0
            r6.f94832d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.e.queueInputBuffer(lb.p):void");
    }

    protected void k(q qVar) {
        qVar.c();
        this.f94830b.add(qVar);
    }

    @Override // t9.d
    public final void setOutputStartTimeUs(long j10) {
        this.f94835g = j10;
    }

    @Override // lb.l
    public void setPositionUs(long j10) {
        this.f94833e = j10;
    }

    @Override // t9.d
    public void release() {
    }
}

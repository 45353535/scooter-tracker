package v9;

import android.os.Looper;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ga.f0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import n9.a0;
import n9.e0;
import q9.t;
import v9.c;
import w9.s;

/* JADX INFO: loaded from: classes12.dex */
public class s1 implements v9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.h f105980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0.b f105981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0.c f105982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f105983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray f105984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q9.t f105985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n9.a0 f105986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q9.q f105987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f105988j;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0.b f105989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImmutableList f105990b = ImmutableList.of();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImmutableMap f105991c = ImmutableMap.of();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0.b f105992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f0.b f105993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private f0.b f105994f;

        public a(e0.b bVar) {
            this.f105989a = bVar;
        }

        private void b(ImmutableMap.Builder builder, f0.b bVar, n9.e0 e0Var) {
            if (bVar == null) {
                return;
            }
            if (e0Var.b(bVar.f72270a) != -1) {
                builder.put(bVar, e0Var);
                return;
            }
            n9.e0 e0Var2 = (n9.e0) this.f105991c.get(bVar);
            if (e0Var2 != null) {
                builder.put(bVar, e0Var2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static f0.b c(n9.a0 a0Var, ImmutableList immutableList, f0.b bVar, e0.b bVar2) {
            n9.e0 currentTimeline = a0Var.getCurrentTimeline();
            int currentPeriodIndex = a0Var.getCurrentPeriodIndex();
            Object objM = currentTimeline.q() ? null : currentTimeline.m(currentPeriodIndex);
            int iD = (a0Var.isPlayingAd() || currentTimeline.q()) ? -1 : currentTimeline.f(currentPeriodIndex, bVar2).d(q9.o0.P0(a0Var.getCurrentPosition()) - bVar2.n());
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                f0.b bVar3 = (f0.b) immutableList.get(i10);
                if (i(bVar3, objM, a0Var.isPlayingAd(), a0Var.getCurrentAdGroupIndex(), a0Var.getCurrentAdIndexInAdGroup(), iD)) {
                    return bVar3;
                }
            }
            if (immutableList.isEmpty() && bVar != null && i(bVar, objM, a0Var.isPlayingAd(), a0Var.getCurrentAdGroupIndex(), a0Var.getCurrentAdIndexInAdGroup(), iD)) {
                return bVar;
            }
            return null;
        }

        private static boolean i(f0.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f72270a.equals(obj)) {
                return false;
            }
            if (z10 && bVar.f72271b == i10 && bVar.f72272c == i11) {
                return true;
            }
            return !z10 && bVar.f72271b == -1 && bVar.f72274e == i12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m(n9.e0 e0Var) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            if (this.f105990b.isEmpty()) {
                b(builder, this.f105993e, e0Var);
                if (!Objects.equals(this.f105994f, this.f105993e)) {
                    b(builder, this.f105994f, e0Var);
                }
                if (!Objects.equals(this.f105992d, this.f105993e) && !Objects.equals(this.f105992d, this.f105994f)) {
                    b(builder, this.f105992d, e0Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f105990b.size(); i10++) {
                    b(builder, (f0.b) this.f105990b.get(i10), e0Var);
                }
                if (!this.f105990b.contains(this.f105992d)) {
                    b(builder, this.f105992d, e0Var);
                }
            }
            this.f105991c = builder.buildOrThrow();
        }

        public f0.b d() {
            return this.f105992d;
        }

        public f0.b e() {
            if (this.f105990b.isEmpty()) {
                return null;
            }
            return (f0.b) Iterables.getLast(this.f105990b);
        }

        public n9.e0 f(f0.b bVar) {
            return (n9.e0) this.f105991c.get(bVar);
        }

        public f0.b g() {
            return this.f105993e;
        }

        public f0.b h() {
            return this.f105994f;
        }

        public void j(n9.a0 a0Var) {
            this.f105992d = c(a0Var, this.f105990b, this.f105993e, this.f105989a);
        }

        public void k(List list, f0.b bVar, n9.a0 a0Var) {
            this.f105990b = ImmutableList.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.f105993e = (f0.b) list.get(0);
                this.f105994f = (f0.b) q9.a.e(bVar);
            }
            if (this.f105992d == null) {
                this.f105992d = c(a0Var, this.f105990b, this.f105993e, this.f105989a);
            }
            m(a0Var.getCurrentTimeline());
        }

        public void l(n9.a0 a0Var) {
            this.f105992d = c(a0Var, this.f105990b, this.f105993e, this.f105989a);
            m(a0Var.getCurrentTimeline());
        }
    }

    public s1(q9.h hVar) {
        this.f105980b = (q9.h) q9.a.e(hVar);
        this.f105985g = new q9.t(q9.o0.X(), hVar, new t.b() { // from class: v9.k
            @Override // q9.t.b
            public final void a(Object obj, n9.n nVar) {
                s1.T((c) obj, nVar);
            }
        });
        e0.b bVar = new e0.b();
        this.f105981c = bVar;
        this.f105982d = new e0.c();
        this.f105983e = new a(bVar);
        this.f105984f = new SparseArray();
    }

    public static /* synthetic */ void H0(c.a aVar, int i10, a0.e eVar, a0.e eVar2, c cVar) {
        cVar.b(aVar, i10);
        cVar.N(aVar, eVar, eVar2, i10);
    }

    public static /* synthetic */ void M0(c.a aVar, n9.n0 n0Var, c cVar) {
        cVar.V(aVar, n0Var);
        cVar.o0(aVar, n0Var.f95436a, n0Var.f95437b, 0, n0Var.f95439d);
    }

    public static /* synthetic */ void P0(c.a aVar, ga.y yVar, ga.b0 b0Var, int i10, c cVar) {
        cVar.z(aVar, yVar, b0Var);
        cVar.x(aVar, yVar, b0Var, i10);
    }

    public static /* synthetic */ void T(c cVar, n9.n nVar) {
    }

    public static /* synthetic */ void U0(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.H(aVar, str, j10);
        cVar.d0(aVar, str, j11, j10);
    }

    public static /* synthetic */ void a0(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.T(aVar, str, j10);
        cVar.I(aVar, str, j11, j10);
    }

    private c.a d1(f0.b bVar) {
        q9.a.e(this.f105986h);
        n9.e0 e0VarF = bVar == null ? null : this.f105983e.f(bVar);
        if (bVar != null && e0VarF != null) {
            return e1(e0VarF, e0VarF.h(bVar.f72270a, this.f105981c).f95256c, bVar);
        }
        int currentMediaItemIndex = this.f105986h.getCurrentMediaItemIndex();
        n9.e0 currentTimeline = this.f105986h.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.p()) {
            currentTimeline = n9.e0.f95245a;
        }
        return e1(currentTimeline, currentMediaItemIndex, null);
    }

    private c.a f1() {
        return d1(this.f105983e.e());
    }

    private c.a g1(int i10, f0.b bVar) {
        q9.a.e(this.f105986h);
        if (bVar != null) {
            return this.f105983e.f(bVar) != null ? d1(bVar) : e1(n9.e0.f95245a, i10, bVar);
        }
        n9.e0 currentTimeline = this.f105986h.getCurrentTimeline();
        if (i10 >= currentTimeline.p()) {
            currentTimeline = n9.e0.f95245a;
        }
        return e1(currentTimeline, i10, null);
    }

    private c.a h1() {
        return d1(this.f105983e.g());
    }

    public static /* synthetic */ void i0(c.a aVar, boolean z10, c cVar) {
        cVar.u(aVar, z10);
        cVar.R(aVar, z10);
    }

    private c.a i1() {
        return d1(this.f105983e.h());
    }

    private c.a j1(n9.y yVar) {
        f0.b bVar;
        return (!(yVar instanceof io.bidmachine.media3.exoplayer.s) || (bVar = ((io.bidmachine.media3.exoplayer.s) yVar).f81287p) == null) ? c1() : d1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1() {
        final c.a aVarC1 = c1();
        l1(aVarC1, 1028, new t.a() { // from class: v9.i1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).o(aVarC1);
            }
        });
        this.f105985g.i();
    }

    public static /* synthetic */ void n0(c.a aVar, int i10, c cVar) {
        cVar.Y(aVar);
        cVar.q(aVar, i10);
    }

    @Override // n9.a0.d
    public void A(final n9.k kVar) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 29, new t.a() { // from class: v9.a1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).s(aVarC1, kVar);
            }
        });
    }

    @Override // ga.n0
    public final void B(int i10, f0.b bVar, final ga.b0 b0Var) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1005, new t.a() { // from class: v9.h0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).v(aVarG1, b0Var);
            }
        });
    }

    @Override // v9.a
    public void C(final n9.a0 a0Var, Looper looper) {
        q9.a.g(this.f105986h == null || this.f105983e.f105990b.isEmpty());
        this.f105986h = (n9.a0) q9.a.e(a0Var);
        this.f105987i = this.f105980b.createHandler(looper, null);
        this.f105985g = this.f105985g.e(looper, new t.b() { // from class: v9.r1
            @Override // q9.t.b
            public final void a(Object obj, n9.n nVar) {
                c cVar = (c) obj;
                cVar.G(a0Var, new c.b(nVar, this.f105973a.f105984f));
            }
        });
    }

    @Override // ga.n0
    public final void E(int i10, f0.b bVar, final ga.y yVar, final ga.b0 b0Var) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1002, new t.a() { // from class: v9.p0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).B(aVarG1, yVar, b0Var);
            }
        });
    }

    @Override // n9.a0.d
    public void F(final n9.y yVar) {
        final c.a aVarJ1 = j1(yVar);
        l1(aVarJ1, 10, new t.a() { // from class: v9.q1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).t0(aVarJ1, yVar);
            }
        });
    }

    @Override // z9.u
    public final void G(int i10, f0.b bVar, final int i11) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1022, new t.a() { // from class: v9.r0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                s1.n0(aVarG1, i11, (c) obj);
            }
        });
    }

    @Override // v9.a
    public void H(final int i10, final int i11, final boolean z10) {
        final c.a aVarI1 = i1();
        l1(aVarI1, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new t.a() { // from class: v9.h
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).M(aVarI1, i10, i11, z10);
            }
        });
    }

    @Override // ga.n0
    public final void I(int i10, f0.b bVar, final ga.y yVar, final ga.b0 b0Var, final int i11) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1000, new t.a() { // from class: v9.j0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                s1.P0(aVarG1, yVar, b0Var, i11, (c) obj);
            }
        });
    }

    @Override // z9.u
    public final void J(int i10, f0.b bVar) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1026, new t.a() { // from class: v9.l1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).j0(aVarG1);
            }
        });
    }

    @Override // ga.n0
    public final void K(int i10, f0.b bVar, final ga.b0 b0Var) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1004, new t.a() { // from class: v9.i0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).e(aVarG1, b0Var);
            }
        });
    }

    @Override // z9.u
    public final void L(int i10, f0.b bVar) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1027, new t.a() { // from class: v9.t0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).p0(aVarG1);
            }
        });
    }

    @Override // n9.a0.d
    public void M(final n9.h0 h0Var) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 19, new t.a() { // from class: v9.h1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).v0(aVarC1, h0Var);
            }
        });
    }

    @Override // n9.a0.d
    public final void a(final n9.n0 n0Var) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 25, new t.a() { // from class: v9.m0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                s1.M0(aVarI1, n0Var, (c) obj);
            }
        });
    }

    @Override // v9.a
    public void b(final s.a aVar) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1031, new t.a() { // from class: v9.k1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).f(aVarI1, aVar);
            }
        });
    }

    @Override // v9.a
    public void c(final s.a aVar) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1032, new t.a() { // from class: v9.f1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).g(aVarI1, aVar);
            }
        });
    }

    protected final c.a c1() {
        return d1(this.f105983e.d());
    }

    @Override // v9.a
    public final void d(final u9.b bVar) {
        final c.a aVarH1 = h1();
        l1(aVarH1, 1020, new t.a() { // from class: v9.q0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).Q(aVarH1, bVar);
            }
        });
    }

    @Override // v9.a
    public final void e(final io.bidmachine.media3.common.a aVar, final u9.c cVar) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1017, new t.a() { // from class: v9.f0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).l(aVarI1, aVar, cVar);
            }
        });
    }

    protected final c.a e1(n9.e0 e0Var, int i10, f0.b bVar) {
        f0.b bVar2 = e0Var.q() ? null : bVar;
        long jElapsedRealtime = this.f105980b.elapsedRealtime();
        boolean z10 = e0Var.equals(this.f105986h.getCurrentTimeline()) && i10 == this.f105986h.getCurrentMediaItemIndex();
        long jB = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                jB = this.f105986h.getContentPosition();
            } else if (!e0Var.q()) {
                jB = e0Var.n(i10, this.f105982d).b();
            }
        } else if (z10 && this.f105986h.getCurrentAdGroupIndex() == bVar2.f72271b && this.f105986h.getCurrentAdIndexInAdGroup() == bVar2.f72272c) {
            jB = this.f105986h.getCurrentPosition();
        }
        return new c.a(jElapsedRealtime, e0Var, i10, bVar2, jB, this.f105986h.getCurrentTimeline(), this.f105986h.getCurrentMediaItemIndex(), this.f105983e.d(), this.f105986h.getCurrentPosition(), this.f105986h.getTotalBufferedDuration());
    }

    @Override // n9.a0.d
    public final void f(final n9.v vVar) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 28, new t.a() { // from class: v9.k0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).a(aVarC1, vVar);
            }
        });
    }

    @Override // v9.a
    public final void g(final u9.b bVar) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1015, new t.a() { // from class: v9.o0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).P(aVarI1, bVar);
            }
        });
    }

    @Override // n9.a0.d
    public void h(final p9.b bVar) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 27, new t.a() { // from class: v9.o
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).e0(aVarC1, bVar);
            }
        });
    }

    @Override // v9.a
    public final void i(final u9.b bVar) {
        final c.a aVarH1 = h1();
        l1(aVarH1, 1013, new t.a() { // from class: v9.c0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).Z(aVarH1, bVar);
            }
        });
    }

    @Override // n9.a0.d
    public final void j(final n9.z zVar) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 12, new t.a() { // from class: v9.i
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).r0(aVarC1, zVar);
            }
        });
    }

    @Override // v9.a
    public final void k(final u9.b bVar) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1007, new t.a() { // from class: v9.b1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).k0(aVarI1, bVar);
            }
        });
    }

    @Override // v9.a
    public final void l(final io.bidmachine.media3.common.a aVar, final u9.c cVar) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1009, new t.a() { // from class: v9.e0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).F(aVarI1, aVar, cVar);
            }
        });
    }

    protected final void l1(c.a aVar, int i10, t.a aVar2) {
        this.f105984f.put(i10, aVar);
        this.f105985g.k(i10, aVar2);
    }

    @Override // n9.a0.d
    public void m(final n9.t tVar) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 14, new t.a() { // from class: v9.d
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).w(aVarC1, tVar);
            }
        });
    }

    @Override // n9.a0.d
    public void n(final a0.b bVar) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 13, new t.a() { // from class: v9.o1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).l0(aVarC1, bVar);
            }
        });
    }

    @Override // v9.a
    public final void notifySeekStarted() {
        if (this.f105988j) {
            return;
        }
        final c.a aVarC1 = c1();
        this.f105988j = true;
        l1(aVarC1, -1, new t.a() { // from class: v9.n
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).i0(aVarC1);
            }
        });
    }

    @Override // v9.a
    public final void o(List list, f0.b bVar) {
        this.f105983e.k(list, bVar, (n9.a0) q9.a.e(this.f105986h));
    }

    @Override // v9.a
    public final void onAudioCodecError(final Exception exc) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1029, new t.a() { // from class: v9.j
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).k(aVarI1, exc);
            }
        });
    }

    @Override // v9.a
    public final void onAudioDecoderInitialized(final String str, final long j10, final long j11) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1008, new t.a() { // from class: v9.p
            @Override // q9.t.a
            public final void invoke(Object obj) {
                s1.U0(aVarI1, str, j11, j10, (c) obj);
            }
        });
    }

    @Override // v9.a
    public final void onAudioDecoderReleased(final String str) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1012, new t.a() { // from class: v9.f
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).a0(aVarI1, str);
            }
        });
    }

    @Override // v9.a
    public final void onAudioPositionAdvancing(final long j10) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1010, new t.a() { // from class: v9.y0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).W(aVarI1, j10);
            }
        });
    }

    @Override // n9.a0.d
    public final void onAudioSessionIdChanged(final int i10) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 21, new t.a() { // from class: v9.d0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).f0(aVarI1, i10);
            }
        });
    }

    @Override // v9.a
    public final void onAudioSinkError(final Exception exc) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1014, new t.a() { // from class: v9.x0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).b0(aVarI1, exc);
            }
        });
    }

    @Override // v9.a
    public final void onAudioUnderrun(final int i10, final long j10, final long j11) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1011, new t.a() { // from class: v9.e1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).j(aVarI1, i10, j10, j11);
            }
        });
    }

    @Override // ka.e.a
    public final void onBandwidthSample(final int i10, final long j10, final long j11) {
        final c.a aVarF1 = f1();
        l1(aVarF1, 1006, new t.a() { // from class: v9.j1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).K(aVarF1, i10, j10, j11);
            }
        });
    }

    @Override // n9.a0.d
    public void onCues(final List list) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 27, new t.a() { // from class: v9.g1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).E(aVarC1, list);
            }
        });
    }

    @Override // n9.a0.d
    public void onDeviceVolumeChanged(final int i10, final boolean z10) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 30, new t.a() { // from class: v9.n0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).h0(aVarC1, i10, z10);
            }
        });
    }

    @Override // v9.a
    public final void onDroppedFrames(final int i10, final long j10) {
        final c.a aVarH1 = h1();
        l1(aVarH1, 1018, new t.a() { // from class: v9.w0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).w0(aVarH1, i10, j10);
            }
        });
    }

    @Override // n9.a0.d
    public final void onIsLoadingChanged(final boolean z10) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 3, new t.a() { // from class: v9.x
            @Override // q9.t.a
            public final void invoke(Object obj) {
                s1.i0(aVarC1, z10, (c) obj);
            }
        });
    }

    @Override // n9.a0.d
    public void onIsPlayingChanged(final boolean z10) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 7, new t.a() { // from class: v9.a0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).D(aVarC1, z10);
            }
        });
    }

    @Override // n9.a0.d
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 5, new t.a() { // from class: v9.l
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).x0(aVarC1, z10, i10);
            }
        });
    }

    @Override // n9.a0.d
    public final void onPlaybackStateChanged(final int i10) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 4, new t.a() { // from class: v9.t
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).m(aVarC1, i10);
            }
        });
    }

    @Override // n9.a0.d
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 6, new t.a() { // from class: v9.v
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).t(aVarC1, i10);
            }
        });
    }

    @Override // n9.a0.d
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final c.a aVarC1 = c1();
        l1(aVarC1, -1, new t.a() { // from class: v9.u
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).L(aVarC1, z10, i10);
            }
        });
    }

    @Override // v9.a
    public final void onRenderedFirstFrame(final Object obj, final long j10) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 26, new t.a() { // from class: v9.s0
            @Override // q9.t.a
            public final void invoke(Object obj2) {
                ((c) obj2).A(aVarI1, obj, j10);
            }
        });
    }

    @Override // n9.a0.d
    public final void onRepeatModeChanged(final int i10) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 8, new t.a() { // from class: v9.z
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).q0(aVarC1, i10);
            }
        });
    }

    @Override // n9.a0.d
    public final void onShuffleModeEnabledChanged(final boolean z10) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 9, new t.a() { // from class: v9.u0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).r(aVarC1, z10);
            }
        });
    }

    @Override // n9.a0.d
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 23, new t.a() { // from class: v9.m1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).S(aVarI1, z10);
            }
        });
    }

    @Override // n9.a0.d
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 24, new t.a() { // from class: v9.p1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).h(aVarI1, i10, i11);
            }
        });
    }

    @Override // v9.a
    public final void onVideoCodecError(final Exception exc) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1030, new t.a() { // from class: v9.g
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).p(aVarI1, exc);
            }
        });
    }

    @Override // v9.a
    public final void onVideoDecoderInitialized(final String str, final long j10, final long j11) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1016, new t.a() { // from class: v9.r
            @Override // q9.t.a
            public final void invoke(Object obj) {
                s1.a0(aVarI1, str, j11, j10, (c) obj);
            }
        });
    }

    @Override // v9.a
    public final void onVideoDecoderReleased(final String str) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 1019, new t.a() { // from class: v9.s
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).g0(aVarI1, str);
            }
        });
    }

    @Override // v9.a
    public final void onVideoFrameProcessingOffset(final long j10, final int i10) {
        final c.a aVarH1 = h1();
        l1(aVarH1, 1021, new t.a() { // from class: v9.g0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).O(aVarH1, j10, i10);
            }
        });
    }

    @Override // n9.a0.d
    public final void onVolumeChanged(final float f10) {
        final c.a aVarI1 = i1();
        l1(aVarI1, 22, new t.a() { // from class: v9.w
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).c0(aVarI1, f10);
            }
        });
    }

    @Override // ga.n0
    public final void p(int i10, f0.b bVar, final ga.y yVar, final ga.b0 b0Var, final IOException iOException, final boolean z10) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1003, new t.a() { // from class: v9.l0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).m0(aVarG1, yVar, b0Var, iOException, z10);
            }
        });
    }

    @Override // v9.a
    public void q(c cVar) {
        q9.a.e(cVar);
        this.f105985g.c(cVar);
    }

    @Override // n9.a0.d
    public void r(final n9.i0 i0Var) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 2, new t.a() { // from class: v9.m
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).X(aVarC1, i0Var);
            }
        });
    }

    @Override // v9.a
    public void release() {
        ((q9.q) q9.a.i(this.f105987i)).post(new Runnable() { // from class: v9.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f105862b.k1();
            }
        });
    }

    @Override // ga.n0
    public final void s(int i10, f0.b bVar, final ga.y yVar, final ga.b0 b0Var) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1001, new t.a() { // from class: v9.b0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).s0(aVarG1, yVar, b0Var);
            }
        });
    }

    @Override // n9.a0.d
    public final void t(final n9.r rVar, final int i10) {
        final c.a aVarC1 = c1();
        l1(aVarC1, 1, new t.a() { // from class: v9.y
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).c(aVarC1, rVar, i10);
            }
        });
    }

    @Override // n9.a0.d
    public final void u(final a0.e eVar, final a0.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f105988j = false;
        }
        this.f105983e.j((n9.a0) q9.a.e(this.f105986h));
        final c.a aVarC1 = c1();
        l1(aVarC1, 11, new t.a() { // from class: v9.q
            @Override // q9.t.a
            public final void invoke(Object obj) {
                s1.H0(aVarC1, i10, eVar, eVar2, (c) obj);
            }
        });
    }

    @Override // z9.u
    public final void v(int i10, f0.b bVar) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1025, new t.a() { // from class: v9.d1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).C(aVarG1);
            }
        });
    }

    @Override // z9.u
    public final void w(int i10, f0.b bVar) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1023, new t.a() { // from class: v9.n1
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).J(aVarG1);
            }
        });
    }

    @Override // n9.a0.d
    public final void x(n9.e0 e0Var, final int i10) {
        this.f105983e.l((n9.a0) q9.a.e(this.f105986h));
        final c.a aVarC1 = c1();
        l1(aVarC1, 0, new t.a() { // from class: v9.e
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).U(aVarC1, i10);
            }
        });
    }

    @Override // n9.a0.d
    public final void y(final n9.y yVar) {
        final c.a aVarJ1 = j1(yVar);
        l1(aVarJ1, 10, new t.a() { // from class: v9.v0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).y(aVarJ1, yVar);
            }
        });
    }

    @Override // z9.u
    public final void z(int i10, f0.b bVar, final Exception exc) {
        final c.a aVarG1 = g1(i10, bVar);
        l1(aVarG1, 1024, new t.a() { // from class: v9.z0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((c) obj).n(aVarG1, exc);
            }
        });
    }

    @Override // n9.a0.d
    public void onRenderedFirstFrame() {
    }

    @Override // n9.a0.d
    public void onLoadingChanged(boolean z10) {
    }

    @Override // n9.a0.d
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // n9.a0.d
    public void D(n9.a0 a0Var, a0.c cVar) {
    }
}

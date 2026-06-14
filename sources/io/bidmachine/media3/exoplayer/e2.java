package io.bidmachine.media3.exoplayer;

import android.util.Pair;
import ga.e1;
import ga.f0;
import io.bidmachine.media3.exoplayer.e2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v9.c2 f80801a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f80805e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v9.a f80808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q9.q f80809i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f80811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private s9.y f80812l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ga.e1 f80810j = new e1.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f80803c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f80804d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f80802b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f80806f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f80807g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements ga.n0, z9.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f80813b;

        public a(c cVar) {
            this.f80813b = cVar;
        }

        private Pair D(int i10, f0.b bVar) {
            f0.b bVar2 = null;
            if (bVar != null) {
                f0.b bVarN = e2.n(this.f80813b, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(e2.s(this.f80813b, i10)), bVar2);
        }

        @Override // ga.n0
        public void B(int i10, f0.b bVar, final ga.b0 b0Var) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f81400b;
                        Pair pair = pairD;
                        e2.this.f80808h.B(((Integer) pair.first).intValue(), (f0.b) q9.a.e((f0.b) pair.second), b0Var);
                    }
                });
            }
        }

        @Override // ga.n0
        public void E(int i10, f0.b bVar, final ga.y yVar, final ga.b0 b0Var) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f80644b;
                        Pair pair = pairD;
                        e2.this.f80808h.E(((Integer) pair.first).intValue(), (f0.b) pair.second, yVar, b0Var);
                    }
                });
            }
        }

        @Override // z9.u
        public void G(int i10, f0.b bVar, final int i11) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.s1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f81292b;
                        Pair pair = pairD;
                        e2.this.f80808h.G(((Integer) pair.first).intValue(), (f0.b) pair.second, i11);
                    }
                });
            }
        }

        @Override // ga.n0
        public void I(int i10, f0.b bVar, final ga.y yVar, final ga.b0 b0Var, final int i11) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.z1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f81419b;
                        Pair pair = pairD;
                        e2.this.f80808h.I(((Integer) pair.first).intValue(), (f0.b) pair.second, yVar, b0Var, i11);
                    }
                });
            }
        }

        @Override // z9.u
        public void J(int i10, f0.b bVar) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f81302b;
                        Pair pair = pairD;
                        e2.this.f80808h.J(((Integer) pair.first).intValue(), (f0.b) pair.second);
                    }
                });
            }
        }

        @Override // ga.n0
        public void K(int i10, f0.b bVar, final ga.b0 b0Var) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f80651b;
                        Pair pair = pairD;
                        e2.this.f80808h.K(((Integer) pair.first).intValue(), (f0.b) pair.second, b0Var);
                    }
                });
            }
        }

        @Override // z9.u
        public void L(int i10, f0.b bVar) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f81394b;
                        Pair pair = pairD;
                        e2.this.f80808h.L(((Integer) pair.first).intValue(), (f0.b) pair.second);
                    }
                });
            }
        }

        @Override // ga.n0
        public void p(int i10, f0.b bVar, final ga.y yVar, final ga.b0 b0Var, final IOException iOException, final boolean z10) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.y1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f81411b;
                        Pair pair = pairD;
                        e2.this.f80808h.p(((Integer) pair.first).intValue(), (f0.b) pair.second, yVar, b0Var, iOException, z10);
                    }
                });
            }
        }

        @Override // ga.n0
        public void s(int i10, f0.b bVar, final ga.y yVar, final ga.b0 b0Var) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f80636b;
                        Pair pair = pairD;
                        e2.this.f80808h.s(((Integer) pair.first).intValue(), (f0.b) pair.second, yVar, b0Var);
                    }
                });
            }
        }

        @Override // z9.u
        public void v(int i10, f0.b bVar) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.d2
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f80663b;
                        Pair pair = pairD;
                        e2.this.f80808h.v(((Integer) pair.first).intValue(), (f0.b) pair.second);
                    }
                });
            }
        }

        @Override // z9.u
        public void w(int i10, f0.b bVar) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f81308b;
                        Pair pair = pairD;
                        e2.this.f80808h.w(((Integer) pair.first).intValue(), (f0.b) pair.second);
                    }
                });
            }
        }

        @Override // z9.u
        public void z(int i10, f0.b bVar, final Exception exc) {
            final Pair pairD = D(i10, bVar);
            if (pairD != null) {
                e2.this.f80809i.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2.a aVar = this.f81373b;
                        Pair pair = pairD;
                        e2.this.f80808h.z(((Integer) pair.first).intValue(), (f0.b) pair.second, exc);
                    }
                });
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ga.f0 f80815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0.c f80816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f80817c;

        public b(ga.f0 f0Var, f0.c cVar, a aVar) {
            this.f80815a = f0Var;
            this.f80816b = cVar;
            this.f80817c = aVar;
        }
    }

    static final class c implements q1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ga.a0 f80818a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f80821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f80822e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f80820c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f80819b = new Object();

        public c(ga.f0 f0Var, boolean z10) {
            this.f80818a = new ga.a0(f0Var, z10);
        }

        public void a(int i10) {
            this.f80821d = i10;
            this.f80822e = false;
            this.f80820c.clear();
        }

        @Override // io.bidmachine.media3.exoplayer.q1
        public n9.e0 getTimeline() {
            return this.f80818a.R();
        }

        @Override // io.bidmachine.media3.exoplayer.q1
        public Object getUid() {
            return this.f80819b;
        }
    }

    public interface d {
        void onPlaylistUpdateRequested();
    }

    public e2(d dVar, v9.a aVar, q9.q qVar, v9.c2 c2Var) {
        this.f80801a = c2Var;
        this.f80805e = dVar;
        this.f80808h = aVar;
        this.f80809i = qVar;
    }

    private void A(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f80802b.remove(i12);
            this.f80804d.remove(cVar.f80819b);
            g(i12, -cVar.f80818a.R().p());
            cVar.f80822e = true;
            if (this.f80811k) {
                u(cVar);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f80802b.size()) {
            ((c) this.f80802b.get(i10)).f80821d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = (b) this.f80806f.get(cVar);
        if (bVar != null) {
            bVar.f80815a.g(bVar.f80816b);
        }
    }

    private void k() {
        Iterator it = this.f80807g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f80820c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f80807g.add(cVar);
        b bVar = (b) this.f80806f.get(cVar);
        if (bVar != null) {
            bVar.f80815a.a(bVar.f80816b);
        }
    }

    private static Object m(Object obj) {
        return u9.a.v(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f0.b n(c cVar, f0.b bVar) {
        for (int i10 = 0; i10 < cVar.f80820c.size(); i10++) {
            if (((f0.b) cVar.f80820c.get(i10)).f72273d == bVar.f72273d) {
                return bVar.a(p(cVar, bVar.f72270a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return u9.a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return u9.a.y(cVar.f80819b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i10) {
        return i10 + cVar.f80821d;
    }

    private void u(c cVar) {
        if (cVar.f80822e && cVar.f80820c.isEmpty()) {
            b bVar = (b) q9.a.e((b) this.f80806f.remove(cVar));
            bVar.f80815a.i(bVar.f80816b);
            bVar.f80815a.m(bVar.f80817c);
            bVar.f80815a.l(bVar.f80817c);
            this.f80807g.remove(cVar);
        }
    }

    private void w(c cVar) {
        ga.a0 a0Var = cVar.f80818a;
        f0.c cVar2 = new f0.c() { // from class: io.bidmachine.media3.exoplayer.r1
            @Override // ga.f0.c
            public final void a(ga.f0 f0Var, n9.e0 e0Var) {
                this.f81281a.f80805e.onPlaylistUpdateRequested();
            }
        };
        a aVar = new a(cVar);
        this.f80806f.put(cVar, new b(a0Var, cVar2, aVar));
        a0Var.f(q9.o0.C(), aVar);
        a0Var.k(q9.o0.C(), aVar);
        a0Var.j(cVar2, this.f80812l, this.f80801a);
    }

    public n9.e0 B(List list, ga.e1 e1Var) {
        A(0, this.f80802b.size());
        return f(this.f80802b.size(), list, e1Var);
    }

    public n9.e0 C(ga.e1 e1Var) {
        int iR = r();
        if (e1Var.getLength() != iR) {
            e1Var = e1Var.cloneAndClear().cloneAndInsert(0, iR);
        }
        this.f80810j = e1Var;
        return i();
    }

    public n9.e0 D(int i10, int i11, List list) {
        q9.a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        q9.a.a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((c) this.f80802b.get(i12)).f80818a.h((n9.r) list.get(i12 - i10));
        }
        return i();
    }

    public n9.e0 f(int i10, List list, ga.e1 e1Var) {
        if (!list.isEmpty()) {
            this.f80810j = e1Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = (c) list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f80802b.get(i11 - 1);
                    cVar.a(cVar2.f80821d + cVar2.f80818a.R().p());
                } else {
                    cVar.a(0);
                }
                g(i11, cVar.f80818a.R().p());
                this.f80802b.add(i11, cVar);
                this.f80804d.put(cVar.f80819b, cVar);
                if (this.f80811k) {
                    w(cVar);
                    if (this.f80803c.isEmpty()) {
                        this.f80807g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public ga.c0 h(f0.b bVar, ka.b bVar2, long j10) {
        Object objO = o(bVar.f72270a);
        f0.b bVarA = bVar.a(m(bVar.f72270a));
        c cVar = (c) q9.a.e((c) this.f80804d.get(objO));
        l(cVar);
        cVar.f80820c.add(bVarA);
        ga.z zVarE = cVar.f80818a.e(bVarA, bVar2, j10);
        this.f80803c.put(zVarE, cVar);
        k();
        return zVarE;
    }

    public n9.e0 i() {
        if (this.f80802b.isEmpty()) {
            return n9.e0.f95245a;
        }
        int iP = 0;
        for (int i10 = 0; i10 < this.f80802b.size(); i10++) {
            c cVar = (c) this.f80802b.get(i10);
            cVar.f80821d = iP;
            iP += cVar.f80818a.R().p();
        }
        return new h2(this.f80802b, this.f80810j);
    }

    public ga.e1 q() {
        return this.f80810j;
    }

    public int r() {
        return this.f80802b.size();
    }

    public boolean t() {
        return this.f80811k;
    }

    public void v(s9.y yVar) {
        q9.a.g(!this.f80811k);
        this.f80812l = yVar;
        for (int i10 = 0; i10 < this.f80802b.size(); i10++) {
            c cVar = (c) this.f80802b.get(i10);
            w(cVar);
            this.f80807g.add(cVar);
        }
        this.f80811k = true;
    }

    public void x() {
        for (b bVar : this.f80806f.values()) {
            try {
                bVar.f80815a.i(bVar.f80816b);
            } catch (RuntimeException e10) {
                q9.u.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f80815a.m(bVar.f80817c);
            bVar.f80815a.l(bVar.f80817c);
        }
        this.f80806f.clear();
        this.f80807g.clear();
        this.f80811k = false;
    }

    public void y(ga.c0 c0Var) {
        c cVar = (c) q9.a.e((c) this.f80803c.remove(c0Var));
        cVar.f80818a.c(c0Var);
        cVar.f80820c.remove(((ga.z) c0Var).f72553b);
        if (!this.f80803c.isEmpty()) {
            k();
        }
        u(cVar);
    }

    public n9.e0 z(int i10, int i11, ga.e1 e1Var) {
        q9.a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f80810j = e1Var;
        A(i10, i11);
        return i();
    }
}

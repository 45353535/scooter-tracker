package pc;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import ec.b;
import ic.t;
import ic.u;
import ic.v;
import id.a0;
import id.a1;
import id.b1;
import id.i1;
import id.q0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pc.k;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends jc.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final hd.h f98209t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private qc.b f98210u;

    public final class a implements qc.d {
        public a() {
        }

        @Override // qc.d
        public void a(qc.b player, boolean z10) {
            Intrinsics.checkNotNullParameter(player, "player");
            View viewJ = k.this.j();
            Integer numValueOf = viewJ != null ? Integer.valueOf(viewJ.getId()) : null;
            if (z10) {
                k.this.s().b(numValueOf);
            } else {
                k.this.s().a(numValueOf);
            }
        }

        @Override // qc.d
        public void b(qc.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            hd.h hVar = k.this.f98209t;
            if (hVar != null) {
                hVar.onViewReady(player.n());
            }
            k.this.C().a(k.this);
        }

        @Override // qc.d
        public void c(qc.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            hd.h hVar = k.this.f98209t;
            if (hVar != null) {
                hVar.onMediaStarted(player.g(), player.getVolume());
            }
            k.this.s().l();
        }

        @Override // qc.d
        public void d(qc.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            hd.h hVar = k.this.f98209t;
            if (hVar != null) {
                hVar.onMediaMidpoint();
            }
            k.this.s().i();
        }

        @Override // qc.d
        public void e(qc.b player, float f10) {
            Intrinsics.checkNotNullParameter(player, "player");
            hd.h hVar = k.this.f98209t;
            if (hVar != null) {
                hVar.onMediaVolumeChanged(f10);
            }
        }

        @Override // qc.d
        public void f(qc.b player, long j10) {
            Intrinsics.checkNotNullParameter(player, "player");
            k.this.s().a(player.g(), j10);
        }

        @Override // qc.d
        public void g(qc.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            hd.h hVar = k.this.f98209t;
            if (hVar != null) {
                hVar.onMediaCompleted();
            }
            k.this.s().a();
        }

        @Override // qc.d
        public void h(qc.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            hd.h hVar = k.this.f98209t;
            if (hVar != null) {
                hVar.onMediaFirstQuartile();
            }
            k.this.s().k();
        }

        @Override // qc.d
        public void i(qc.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            k.this.v();
            hd.h hVar = k.this.f98209t;
            if (hVar != null) {
                hVar.onMediaResumed();
            }
            k.this.s().b();
        }

        @Override // qc.d
        public void j(qc.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            hd.h hVar = k.this.f98209t;
            if (hVar != null) {
                hVar.onMediaPaused();
            }
            k.this.s().g();
        }

        @Override // qc.d
        public void k(qc.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            hd.h hVar = k.this.f98209t;
            if (hVar != null) {
                hVar.onMediaSkipped();
            }
            k.this.s().d();
        }

        @Override // qc.d
        public void l(qc.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            hd.h hVar = k.this.f98209t;
            if (hVar != null) {
                hVar.onMediaThirdQuartile();
            }
            k.this.s().c();
        }

        @Override // qc.d
        public void m(qc.b player, a0 error) {
            Intrinsics.checkNotNullParameter(player, "player");
            Intrinsics.checkNotNullParameter(error, "error");
            k.this.W(error);
        }

        @Override // qc.d
        public void n(qc.b player, a0 error) {
            Intrinsics.checkNotNullParameter(player, "player");
            Intrinsics.checkNotNullParameter(error, "error");
            k.this.c0(error);
        }
    }

    public final class b implements b.a {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(k this$0, Uri uri) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(uri, "$uri");
            try {
                qc.b bVar = this$0.f98210u;
                if (bVar != null) {
                    bVar.a(uri);
                    bVar.prepare();
                }
            } catch (Throwable th2) {
                v.i(th2);
                this$0.W(a0.f74366b.a(th2));
            }
        }

        @Override // ec.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            final k kVar = k.this;
            jd.h.d(new Runnable() { // from class: pc.l
                @Override // java.lang.Runnable
                public final void run() {
                    k.b.b(kVar, uri);
                }
            });
        }

        @Override // ec.b.a
        public void onError(a0 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            k.this.W(error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, Object assetsHolder, ec.b repository, id.a adElementParams, jc.c adFormListener, yc.b eventCallback, wc.a aVar, hd.h hVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.f98209t = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(a0 a0Var) {
        hd.h hVar = this.f98209t;
        if (hVar != null) {
            hVar.onError(a0Var);
        }
        C().d(this, a0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(k this$0, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewGroup, "$viewGroup");
        qc.b bVar = this$0.f98210u;
        hd.h hVar = this$0.f98209t;
        if (hVar == null || bVar == null) {
            return;
        }
        hVar.onViewAddedToContainer(bVar.n(), viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(k this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qc.b bVar = this$0.f98210u;
        if (bVar != null) {
            bVar.b(num);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(k this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            qc.b bVarA = qc.c.a(this$0.E(), str);
            bVarA.d(this$0.new a());
            hd.h hVar = this$0.f98209t;
            if (hVar != null) {
                hVar.onViewCreated(bVarA.n());
            }
            this$0.f98210u = bVarA;
        } catch (Throwable th2) {
            v.i(th2);
            this$0.W(a0.f74366b.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(a0 a0Var) {
        hd.h hVar = this.f98209t;
        if (hVar != null) {
            hVar.onError(a0Var);
        }
        C().c(this, a0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(k this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qc.b bVar = this$0.f98210u;
        if (bVar != null) {
            bVar.a(num);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qc.b bVar = this$0.f98210u;
        if (bVar != null) {
            bVar.a();
        }
        this$0.f98210u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qc.b bVar = this$0.f98210u;
        if (bVar != null) {
            bVar.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qc.b bVar = this$0.f98210u;
        if (bVar != null) {
            bVar.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qc.b bVar = this$0.f98210u;
        if (bVar != null) {
            bVar.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qc.b bVar = this$0.f98210u;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // jc.a
    public View H() {
        qc.b bVar = this.f98210u;
        if (bVar != null) {
            return bVar.n();
        }
        return null;
    }

    @Override // jc.a
    public void I() {
        super.I();
        hd.h hVar = this.f98209t;
        if (hVar != null) {
            hVar.onClicked();
        }
    }

    @Override // jc.a
    protected void J() {
        Unit unit;
        hd.h hVar = this.f98209t;
        if (hVar != null) {
            hVar.destroy(new u() { // from class: pc.e
                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    k.h0(this.f98202b);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            });
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            U();
        }
    }

    public final void U() {
        jd.h.d(new u() { // from class: pc.i
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                k.g0(this.f98207b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    @Override // jc.a, ic.f
    public void a(final ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        jd.h.d(new u() { // from class: pc.c
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                k.X(this.f98198b, viewGroup);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    @Override // ic.f0, ic.x
    public void b(final Integer num) {
        jd.h.d(new u() { // from class: pc.d
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                k.Z(this.f98200b, num);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    @Override // ic.f
    public void c() {
        a1 a1VarL = h().l();
        List listListOf = null;
        b1 b1VarA = a1VarL != null ? a1VarL.a() : null;
        if (b1VarA == null) {
            String strM = h().m();
            if (strM != null) {
                listListOf = CollectionsKt.listOf(strM);
            }
        } else if (b1VarA instanceof i1) {
            listListOf = ((i1) b1VarA).a();
        } else {
            A("Invalid resource type (" + b1VarA.getClass().getSimpleName() + "), it should be UrlResourceSource");
        }
        q0 q0VarE = q0.f74599b.e(listListOf == null ? CollectionsKt.emptyList() : listListOf);
        if (q0VarE != null) {
            final String strE = q0VarE.a() == q0.b.STREAM ? "exo" : h().e("player");
            jd.h.d(new Runnable() { // from class: pc.a
                @Override // java.lang.Runnable
                public final void run() {
                    k.a0(this.f98195b, strE);
                }
            });
            G().a(q0VarE, F(), new b());
        } else {
            W(new a0("Invalid adm url (" + listListOf + ')'));
        }
    }

    @Override // jc.a, ic.f
    public void d() {
        jd.h.d(new u() { // from class: pc.g
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                k.j0(this.f98205b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    @Override // ic.f0, ic.d0
    public void e() {
        jd.h.d(new u() { // from class: pc.b
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                k.l0(this.f98197b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    @Override // jc.a, ic.f
    public void f() {
        super.f();
        jd.h.d(new u() { // from class: pc.j
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                k.i0(this.f98208b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    @Override // ic.f0, ic.a0
    public void k() {
        jd.h.d(new u() { // from class: pc.h
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                k.k0(this.f98206b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    @Override // jc.a
    public void v() {
        super.v();
        hd.h hVar = this.f98209t;
        if (hVar != null) {
            hVar.onShown();
        }
    }

    @Override // ic.f0, ic.x
    public void a(final Integer num) {
        jd.h.d(new u() { // from class: pc.f
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                k.e0(this.f98203b, num);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    @Override // ic.f0, ic.i
    public void b() {
        e();
    }
}

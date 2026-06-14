package fd;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import ic.v;
import id.a0;
import id.z0;
import pd.i0;
import uc.b0;
import uc.t;
import uc.u;

/* JADX INFO: loaded from: classes3.dex */
public class l extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jd.f f72015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f72016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f72017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f72018e;

    private final class b implements u {
        private b() {
        }

        @Override // uc.u
        public void c(t tVar, a0 a0Var) {
            v.b(l.this.f72015b, "onAdPhaseFailToLoad (%s) - %s", tVar, a0Var);
            tVar.a();
        }

        @Override // uc.u
        public void d(t tVar) {
            v.g(l.this.f72015b, "onAdPhaseLoaded (%s)", tVar);
            if (tVar.a(l.this)) {
                tVar.a(new c());
                l.this.o();
            }
        }
    }

    private final class c implements uc.v {
        private c() {
        }

        @Override // uc.v
        public void a() {
        }

        @Override // uc.v
        public void b() {
            l.this.e();
        }

        @Override // uc.v
        public void d() {
            l.this.f72016c.j();
        }

        @Override // uc.v
        public void e() {
            l.this.e();
        }

        @Override // uc.v
        public void f() {
            l.this.f72016c.d();
        }

        @Override // uc.v
        public void a(id.t tVar) {
            l.this.j(tVar);
        }

        @Override // uc.v
        public void b(z0 z0Var) {
        }

        @Override // uc.v
        public void c() {
        }

        @Override // uc.v
        public void g() {
        }
    }

    public interface d {
        void a();

        void a(id.t tVar);

        void b();
    }

    public l(Context context, id.d dVar, tc.d dVar2) {
        super(context);
        jd.f fVar = new jd.f("PlaceholderView");
        this.f72015b = fVar;
        id.d dVarA = dVar == null ? ic.k.a() : dVar;
        jd.f fVar2 = new jd.f("PlaceholderViewAdPhaseController");
        this.f72017d = new b0(context, dVarA, fVar, fVar2, new ed.c(fVar2.toString(), ic.j.j()), new b(), dVar2);
        f fVar3 = new f(context);
        this.f72016c = fVar3;
        addView(fVar3, i0.c());
        fVar3.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(id.t tVar) {
        d dVar = this.f72018e;
        if (dVar != null) {
            dVar.a(tVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(final id.t tVar) {
        v.g(this.f72015b, "notifyBrokenCreativeEvent", new Object[0]);
        jd.h.d(new Runnable() { // from class: fd.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f72010b.g(tVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        d dVar = this.f72018e;
        if (dVar != null) {
            dVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        d dVar = this.f72018e;
        if (dVar != null) {
            dVar.b();
        }
    }

    private void n() {
        v.g(this.f72015b, "notifyPlaceholderClosed", new Object[0]);
        jd.h.d(new Runnable() { // from class: fd.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f72012b.k();
            }
        });
    }

    void e() {
        n();
    }

    public void i() {
        this.f72018e = null;
        this.f72017d.a();
        jd.h.d(new Runnable() { // from class: fd.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f72014b.removeAllViews();
            }
        });
    }

    public void m() {
        v.g(this.f72015b, "load", new Object[0]);
        this.f72017d.c();
    }

    void o() {
        v.g(this.f72015b, "notifyPlaceholderLoaded", new Object[0]);
        jd.h.d(new Runnable() { // from class: fd.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f72013b.l();
            }
        });
    }

    public void p() {
        this.f72017d.onShown();
    }

    public void q() {
        this.f72017d.a(true);
    }

    public void r() {
        this.f72017d.d();
    }

    public void setListener(@Nullable d dVar) {
        this.f72018e = dVar;
    }
}

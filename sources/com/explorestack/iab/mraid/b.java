package com.explorestack.iab.mraid;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.explorestack.iab.mraid.j;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f18049j = new AtomicInteger(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f18050k = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f18052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j f18053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18056f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18051a = f18049j.getAndIncrement();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18057g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18058h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final k f18059i = new C0311b();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j.a f18060a = new j.a(f.INTERSTITIAL);

        public a() {
        }

        public b a(Context context) {
            this.f18060a.B(b.this.f18059i);
            b.this.f18053c = this.f18060a.c(context);
            return b.this;
        }

        public a b(boolean z10) {
            this.f18060a.h(z10);
            return this;
        }

        public a c(d2.b bVar) {
            this.f18060a.t(bVar);
            return this;
        }

        public a d(String str) {
            this.f18060a.u(str);
            return this;
        }

        public a e(b2.a aVar) {
            this.f18060a.v(aVar);
            return this;
        }

        public a f(e2.e eVar) {
            this.f18060a.w(eVar);
            return this;
        }

        public a g(float f10) {
            this.f18060a.x(f10);
            return this;
        }

        public a h(e2.e eVar) {
            this.f18060a.y(eVar);
            return this;
        }

        public a i(float f10) {
            this.f18060a.z(f10);
            return this;
        }

        public a j(boolean z10) {
            this.f18060a.A(z10);
            return this;
        }

        public a k(c cVar) {
            b.this.f18052b = cVar;
            return this;
        }

        public a l(e2.e eVar) {
            this.f18060a.C(eVar);
            return this;
        }

        public a m(String str) {
            this.f18060a.D(str);
            return this;
        }

        public a n(String str) {
            this.f18060a.E(str);
            return this;
        }

        public a o(e2.e eVar) {
            this.f18060a.F(eVar);
            return this;
        }

        public a p(boolean z10) {
            this.f18060a.G(z10);
            return this;
        }

        public a q(boolean z10) {
            this.f18060a.H(z10);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.explorestack.iab.mraid.b$b, reason: collision with other inner class name */
    class C0311b implements k {
        C0311b() {
        }

        @Override // com.explorestack.iab.mraid.k
        public void b(j jVar) {
            d.a("MraidInterstitial", "ViewListener - onClose", new Object[0]);
            b.this.c();
            b.this.h();
        }

        @Override // com.explorestack.iab.mraid.k
        public void e(j jVar, b2.b bVar) {
            d.a("MraidInterstitial", "ViewListener - onShowFailed: %s", bVar);
            b.this.c();
            b.this.i(bVar);
        }

        @Override // com.explorestack.iab.mraid.k
        public void f(j jVar, String str, e2.c cVar) {
            d.a("MraidInterstitial", "ViewListener - onOpenBrowser (%s)", str);
            if (b.this.f18052b != null) {
                b.this.f18052b.g(b.this, str, cVar);
            }
        }

        @Override // com.explorestack.iab.mraid.k
        public void h(j jVar, String str) {
            d.a("MraidInterstitial", "ViewListener - onPlayVideo (%s)", str);
            if (b.this.f18052b != null) {
                b.this.f18052b.i(b.this, str);
            }
        }

        @Override // com.explorestack.iab.mraid.k
        public void j(j jVar, b2.b bVar) {
            d.a("MraidInterstitial", "ViewListener - onExpired: %s", bVar);
            if (b.this.f18052b != null) {
                b.this.f18052b.k(b.this, bVar);
            }
        }

        @Override // com.explorestack.iab.mraid.k
        public void m(j jVar) {
            d.a("MraidInterstitial", "ViewListener - onShown", new Object[0]);
            if (b.this.f18052b != null) {
                b.this.f18052b.l(b.this);
            }
        }

        @Override // com.explorestack.iab.mraid.k
        public void n(j jVar) {
            d.a("MraidInterstitial", "ViewListener - onLoaded", new Object[0]);
            b.this.f18054d = true;
            if (b.this.f18052b != null) {
                b.this.f18052b.c(b.this);
            }
        }

        @Override // com.explorestack.iab.mraid.k
        public void p(j jVar) {
        }

        @Override // com.explorestack.iab.mraid.k
        public void q(j jVar, b2.b bVar) {
            d.a("MraidInterstitial", "ViewListener - onLoadFailed: %s", bVar);
            b.this.c();
            b.this.f(bVar);
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Activity activityQ0;
        if (!this.f18058h || (activityQ0 = this.f18053c.q0()) == null) {
            return;
        }
        activityQ0.finish();
        activityQ0.overridePendingTransition(0, 0);
    }

    public static a s() {
        return new b().new a();
    }

    void d(Activity activity, ViewGroup viewGroup, boolean z10, boolean z11) {
        if (!p()) {
            if (activity != null && z10) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            k(b2.b.e("Interstitial is not ready"));
            d.g("MraidInterstitial", "Show failed: interstitial is not ready", new Object[0]);
            return;
        }
        if (!f18050k && this.f18053c == null) {
            throw new AssertionError();
        }
        this.f18057g = z11;
        this.f18058h = z10;
        viewGroup.addView(this.f18053c, new ViewGroup.LayoutParams(-1, -1));
        this.f18053c.r0(activity);
    }

    void e(Activity activity, boolean z10) {
        d(activity, (ViewGroup) activity.findViewById(R.id.content), true, z10);
    }

    void f(b2.b bVar) {
        this.f18054d = false;
        this.f18056f = true;
        c cVar = this.f18052b;
        if (cVar != null) {
            cVar.a(this, bVar);
        }
    }

    void h() {
        if (o()) {
            return;
        }
        this.f18054d = false;
        this.f18055e = true;
        c cVar = this.f18052b;
        if (cVar != null) {
            cVar.o(this);
        }
        if (this.f18057g) {
            m();
        }
    }

    void i(b2.b bVar) {
        this.f18054d = false;
        this.f18056f = true;
        k(bVar);
    }

    void k(b2.b bVar) {
        c cVar = this.f18052b;
        if (cVar != null) {
            cVar.d(this, bVar);
        }
    }

    public boolean l() {
        j jVar = this.f18053c;
        return jVar == null || jVar.k() || q();
    }

    public void m() {
        d.a("MraidInterstitial", "destroy", new Object[0]);
        this.f18054d = false;
        this.f18052b = null;
        j jVar = this.f18053c;
        if (jVar != null) {
            jVar.U();
            this.f18053c = null;
        }
    }

    public void n() {
        if (this.f18053c == null || !l()) {
            return;
        }
        this.f18053c.X();
    }

    public boolean o() {
        return this.f18055e;
    }

    public boolean p() {
        return this.f18054d && this.f18053c != null;
    }

    public boolean q() {
        return this.f18056f;
    }

    public void r(String str) {
        j jVar = this.f18053c;
        if (jVar == null) {
            throw new IllegalStateException("MraidView not created (mraidView == null)");
        }
        jVar.l0(str);
    }

    public void t(ViewGroup viewGroup, boolean z10) {
        d(null, viewGroup, false, z10);
    }
}

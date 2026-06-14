package io.bidmachine.iab.mraid;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import id.z0;
import io.bidmachine.iab.mraid.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f80217k = new AtomicInteger(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ boolean f80218l = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    s f80222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f80223e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80219a = f80217k.getAndIncrement();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f80224f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f80225g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f80226h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f80227i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f80228j = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f80220b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final t f80221c = new c();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s.a f80229a = new s.a(o.INTERSTITIAL);

        public a() {
        }

        public f a(Context context) {
            this.f80229a.B(f.this.f80221c);
            f.this.f80222d = this.f80229a.c(context);
            return f.this;
        }

        public a b(boolean z10) {
            this.f80229a.h(z10);
            return this;
        }

        public a c(a9.b bVar) {
            this.f80229a.t(bVar);
            return this;
        }

        public a d(String str) {
            this.f80229a.u(str);
            return this;
        }

        public a e(y8.a aVar) {
            this.f80229a.v(aVar);
            return this;
        }

        public a f(b9.k kVar) {
            this.f80229a.w(kVar);
            return this;
        }

        public a g(float f10) {
            this.f80229a.x(f10);
            return this;
        }

        public a h(b9.k kVar) {
            this.f80229a.y(kVar);
            return this;
        }

        public a i(float f10) {
            this.f80229a.z(f10);
            return this;
        }

        public a j(boolean z10) {
            this.f80229a.A(z10);
            return this;
        }

        public a k(g gVar) {
            f.this.f80223e = gVar;
            return this;
        }

        public a l(b9.k kVar) {
            this.f80229a.C(kVar);
            return this;
        }

        public a m(float f10) {
            this.f80229a.D(f10);
            return this;
        }

        public a n(String str) {
            this.f80229a.E(str);
            return this;
        }

        public a o(b9.k kVar) {
            this.f80229a.F(kVar);
            return this;
        }

        public a p(boolean z10) {
            this.f80229a.G(z10);
            return this;
        }

        public a q(boolean z10) {
            this.f80229a.H(z10);
            return this;
        }
    }

    private class c implements t {
        private c() {
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onCalendarEvent(s sVar, String str, b9.f fVar) {
            i.c("MraidInterstitial", "ViewListener - onCalendarEvent (%s)", str);
            if (f.this.f80223e != null) {
                f.this.f80223e.onCalendarEvent(f.this, str, fVar);
            }
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onClose(s sVar) {
            i.c("MraidInterstitial", "ViewListener - onClose", new Object[0]);
            f.this.c();
            f.this.g();
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onExpand(s sVar) {
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onExpired(s sVar, y8.b bVar) {
            i.c("MraidInterstitial", "ViewListener - onExpired (%s)", bVar);
            if (f.this.f80223e != null) {
                f.this.f80223e.onExpired(f.this, bVar);
            }
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onLoadFailed(s sVar, y8.b bVar) {
            i.c("MraidInterstitial", "ViewListener - onLoadFailed (%s)", bVar);
            f.this.c();
            f.this.f(bVar);
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onLoaded(s sVar) {
            i.c("MraidInterstitial", "ViewListener - onLoaded", new Object[0]);
            f.this.j();
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onOpenPrivacySheet(s sVar, z0 z0Var) {
            i.c("MraidInterstitial", "ViewListener - onOpenPrivacySheet (%s)", z0Var.toString());
            if (f.this.f80223e != null) {
                f.this.f80223e.onOpenPrivacySheet(f.this, z0Var);
            }
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onOpenUrl(s sVar, String str, b9.f fVar) {
            i.c("MraidInterstitial", "ViewListener - onOpenBrowser (%s)", str);
            if (f.this.f80223e != null) {
                f.this.f80223e.onOpenUrl(f.this, str, fVar);
            }
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onPlayVideo(s sVar, String str) {
            i.c("MraidInterstitial", "ViewListener - onPlayVideo (%s)", str);
            if (f.this.f80223e != null) {
                f.this.f80223e.onPlayVideo(f.this, str);
            }
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onShowFailed(s sVar, y8.b bVar) {
            i.c("MraidInterstitial", "ViewListener - onShowFailed (%s)", bVar);
            f.this.c();
            f.this.i(bVar);
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onShown(s sVar) {
            i.c("MraidInterstitial", "ViewListener - onShown", new Object[0]);
            f.this.m();
        }

        @Override // io.bidmachine.iab.mraid.t
        public void onStorePicture(s sVar, String str, b9.f fVar) {
            i.c("MraidInterstitial", "ViewListener - onCalendarEvent (%s)", str);
            if (f.this.f80223e != null) {
                f.this.f80223e.onStorePicture(f.this, str, fVar);
            }
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        s sVar;
        Activity activityS0;
        if (!this.f80228j || (sVar = this.f80222d) == null || (activityS0 = sVar.s0()) == null) {
            return;
        }
        pd.b0.a(activityS0);
    }

    public static a u() {
        return new f().new a();
    }

    void d(Activity activity, ViewGroup viewGroup, boolean z10, boolean z11) {
        if (!q()) {
            if (activity != null && z10) {
                pd.b0.a(activity);
            }
            k(y8.b.e("Interstitial is not ready"));
            i.h("MraidInterstitial", "Show failed: interstitial is not ready", new Object[0]);
            return;
        }
        if (!f80218l && this.f80222d == null) {
            throw new AssertionError();
        }
        this.f80227i = z11;
        this.f80228j = z10;
        b9.u.F(this.f80222d);
        viewGroup.addView(this.f80222d, new ViewGroup.LayoutParams(-1, -1));
        this.f80222d.u0(activity);
    }

    void e(Activity activity, boolean z10) {
        d(activity, (ViewGroup) activity.findViewById(R.id.content), true, z10);
    }

    void f(y8.b bVar) {
        this.f80224f = false;
        this.f80226h = true;
        g gVar = this.f80223e;
        if (gVar != null) {
            gVar.onLoadFailed(this, bVar);
        }
    }

    void g() {
        if (p()) {
            return;
        }
        this.f80225g = true;
        g gVar = this.f80223e;
        if (gVar != null) {
            gVar.onClose(this);
        }
        if (this.f80227i) {
            n();
        }
    }

    void i(y8.b bVar) {
        this.f80224f = false;
        this.f80226h = true;
        k(bVar);
    }

    void j() {
        this.f80224f = true;
        g gVar = this.f80223e;
        if (gVar != null) {
            gVar.onLoaded(this);
        }
    }

    void k(y8.b bVar) {
        g gVar = this.f80223e;
        if (gVar != null) {
            gVar.onShowFailed(this, bVar);
        }
    }

    public boolean l() {
        s sVar = this.f80222d;
        return sVar == null || sVar.k() || r();
    }

    void m() {
        this.f80220b.set(true);
        g gVar = this.f80223e;
        if (gVar != null) {
            gVar.onShown(this);
        }
    }

    public void n() {
        i.c("MraidInterstitial", "destroy", new Object[0]);
        this.f80224f = false;
        this.f80223e = null;
        s sVar = this.f80222d;
        if (sVar != null) {
            sVar.W();
            this.f80222d = null;
        }
    }

    public void o() {
        if (this.f80222d == null || !l()) {
            return;
        }
        this.f80222d.a0();
    }

    public boolean p() {
        return this.f80225g;
    }

    public boolean q() {
        return this.f80224f && this.f80222d != null;
    }

    public boolean r() {
        return this.f80226h;
    }

    public boolean s() {
        return this.f80220b.get();
    }

    public void t(String str) {
        s sVar = this.f80222d;
        if (sVar == null) {
            throw new IllegalStateException("MraidView not created (mraidView == null)");
        }
        sVar.o0(str);
    }

    public Context v() {
        s sVar = this.f80222d;
        if (sVar == null) {
            return null;
        }
        return sVar.t0();
    }

    public void w(Context context, q qVar) {
        MraidActivity.i(context, this, qVar);
    }

    public void x(ViewGroup viewGroup, boolean z10) {
        d(null, viewGroup, false, z10);
    }
}

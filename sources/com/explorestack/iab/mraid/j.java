package com.explorestack.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.explorestack.iab.mraid.a;
import com.taurusx.tax.o.g0;
import e2.r;
import j2.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes5.dex */
public class j extends j2.a implements a.d, e2.c {
    private final a.d A;
    private final e2.e B;
    private final e2.e C;
    private final e2.e D;
    private final e2.e E;
    private boolean F;
    private e2.r G;
    private e2.p H;
    private Integer I;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MutableContextWrapper f18088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.explorestack.iab.mraid.a f18089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private j2.a f18090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j2.a f18091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e2.n f18092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference f18093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f18094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f18095p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d2.b f18096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b2.a f18097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f18098s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f18099t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f18100u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f18101v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f18102w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f18103x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final boolean f18104y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AtomicBoolean f18105z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.explorestack.iab.mraid.f f18106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b2.a f18107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f18109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f18110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String[] f18111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public k f18112g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public d2.b f18113h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private e2.e f18114i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private e2.e f18115j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private e2.e f18116k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private e2.e f18117l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f18118m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f18119n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private float f18120o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f18121p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f18122q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f18123r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f18124s;

        public a() {
            this(com.explorestack.iab.mraid.f.INLINE);
        }

        public a A(boolean z10) {
            this.f18121p = z10;
            return this;
        }

        public a B(k kVar) {
            this.f18112g = kVar;
            return this;
        }

        public a C(e2.e eVar) {
            this.f18116k = eVar;
            return this;
        }

        public a D(String str) {
            this.f18110e = str;
            return this;
        }

        public a E(String str) {
            this.f18109d = str;
            return this;
        }

        public a F(e2.e eVar) {
            this.f18117l = eVar;
            return this;
        }

        public a G(boolean z10) {
            this.f18123r = z10;
            return this;
        }

        public a H(boolean z10) {
            this.f18124s = z10;
            return this;
        }

        public j c(Context context) {
            return new j(context, this, null);
        }

        public a h(boolean z10) {
            this.f18122q = z10;
            return this;
        }

        public a t(d2.b bVar) {
            this.f18113h = bVar;
            return this;
        }

        public a u(String str) {
            this.f18108c = str;
            return this;
        }

        public a v(b2.a aVar) {
            this.f18107b = aVar;
            return this;
        }

        public a w(e2.e eVar) {
            this.f18114i = eVar;
            return this;
        }

        public a x(float f10) {
            this.f18119n = f10;
            return this;
        }

        public a y(e2.e eVar) {
            this.f18115j = eVar;
            return this;
        }

        public a z(float f10) {
            this.f18120o = f10;
            return this;
        }

        a(com.explorestack.iab.mraid.f fVar) {
            this.f18111f = null;
            this.f18118m = 3.0f;
            this.f18119n = 0.0f;
            this.f18120o = 0.0f;
            this.f18106a = fVar;
            this.f18107b = b2.a.FullLoad;
            this.f18108c = "https://localhost";
        }
    }

    class b implements r.c {
        b() {
        }

        @Override // e2.r.c
        public void a() {
            if (j.this.H != null) {
                j.this.H.m();
            }
            if (j.this.f18089j.Q() || !j.this.f18104y || j.this.f18100u <= 0.0f) {
                return;
            }
            j.this.Z();
        }

        @Override // e2.r.c
        public void a(float f10, long j10, long j11) {
            int i10 = (int) (j11 / 1000);
            int i11 = (int) (j10 / 1000);
            if (j.this.H != null) {
                j.this.H.r(f10, i11, i10);
            }
        }
    }

    class c implements a.d {
        c() {
        }

        @Override // j2.a.d
        public void b() {
            j.this.O(b2.b.i("Close button clicked"));
            j.this.f0();
        }

        @Override // j2.a.d
        public void c() {
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l mraidViewState = j.this.f18089j.getMraidViewState();
            if (mraidViewState == l.RESIZED) {
                j.this.V();
                return;
            }
            if (mraidViewState == l.EXPANDED) {
                j.this.T();
            } else if (j.this.c0()) {
                j.this.f18089j.y();
                j.this.f0();
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f18089j.Z(null);
        }
    }

    static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18129a;

        static {
            int[] iArr = new int[b2.a.values().length];
            f18129a = iArr;
            try {
                iArr[b2.a.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18129a[b2.a.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18129a[b2.a.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class g implements a.f {
        private g() {
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void a(com.explorestack.iab.mraid.a aVar, com.explorestack.iab.mraid.e eVar) {
            j.this.s(eVar);
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void b(com.explorestack.iab.mraid.a aVar) {
            j.this.j0();
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void c(com.explorestack.iab.mraid.a aVar, b2.b bVar) {
            j.this.r(bVar);
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void d(com.explorestack.iab.mraid.a aVar, b2.b bVar) {
            j.this.J(bVar);
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void e(com.explorestack.iab.mraid.a aVar, String str) {
            j.this.N(str);
        }

        @Override // com.explorestack.iab.mraid.a.f
        public boolean f(com.explorestack.iab.mraid.a aVar, WebView webView, com.explorestack.iab.mraid.e eVar, boolean z10) {
            return j.this.C(webView, eVar, z10);
        }

        @Override // com.explorestack.iab.mraid.a.f
        public boolean g(com.explorestack.iab.mraid.a aVar, WebView webView, com.explorestack.iab.mraid.g gVar, h hVar) {
            return j.this.D(webView, gVar, hVar);
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void h(com.explorestack.iab.mraid.a aVar, b2.b bVar) {
            j.this.O(bVar);
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void i(com.explorestack.iab.mraid.a aVar, String str, WebView webView, boolean z10) {
            j.this.A(str, webView, z10);
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void j(com.explorestack.iab.mraid.a aVar, boolean z10) {
            if (j.this.f18102w) {
                return;
            }
            if (z10 && !j.this.F) {
                j.this.F = true;
            }
            j.this.B(z10);
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void k(com.explorestack.iab.mraid.a aVar) {
            j.this.X();
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void l(com.explorestack.iab.mraid.a aVar, String str) {
            j.this.z(str);
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void m(com.explorestack.iab.mraid.a aVar) {
            j.this.m0();
        }

        @Override // com.explorestack.iab.mraid.a.f
        public void n(com.explorestack.iab.mraid.a aVar) {
            j.this.h0();
        }

        /* synthetic */ g(j jVar, b bVar) {
            this();
        }
    }

    private j(Context context, a aVar) {
        super(context);
        this.f18105z = new AtomicBoolean(false);
        this.F = false;
        this.f18088i = new MutableContextWrapper(context);
        this.f18095p = aVar.f18112g;
        this.f18097r = aVar.f18107b;
        this.f18098s = aVar.f18118m;
        this.f18099t = aVar.f18119n;
        float f10 = aVar.f18120o;
        this.f18100u = f10;
        this.f18101v = aVar.f18121p;
        this.f18102w = aVar.f18122q;
        this.f18103x = aVar.f18123r;
        this.f18104y = aVar.f18124s;
        d2.b bVar = aVar.f18113h;
        this.f18096q = bVar;
        this.B = aVar.f18114i;
        this.C = aVar.f18115j;
        this.D = aVar.f18116k;
        e2.e eVar = aVar.f18117l;
        this.E = eVar;
        com.explorestack.iab.mraid.a aVarA = new a.d(context.getApplicationContext(), aVar.f18106a, new g(this, null)).b(aVar.f18108c).d(aVar.f18109d).e(aVar.f18111f).c(aVar.f18110e).a();
        this.f18089j = aVarA;
        addView(aVarA, new FrameLayout.LayoutParams(-1, -1, 17));
        if (f10 > 0.0f) {
            e2.p pVar = new e2.p(null);
            this.H = pVar;
            pVar.f(context, this, eVar);
            e2.r rVar = new e2.r(this, new b());
            this.G = rVar;
            rVar.b(f10);
        }
        this.A = new c();
        setCloseClickListener(this);
        if (bVar != null) {
            bVar.e(this);
            bVar.w(aVarA.getWebView());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(String str, WebView webView, boolean z10) {
        setLoadingVisible(false);
        if (c0()) {
            y(this, z10);
        }
        d2.b bVar = this.f18096q;
        if (bVar != null) {
            bVar.f(webView);
        }
        if (this.f18097r != b2.a.FullLoad || this.f18101v || str.equals("data:text/html,<html></html>")) {
            return;
        }
        j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(boolean z10) {
        boolean z11 = !z10 || this.f18102w;
        j2.a aVar = this.f18090k;
        if (aVar != null || (aVar = this.f18091l) != null) {
            aVar.n(z11, this.f18099t);
        } else if (c0()) {
            n(z11, this.F ? 0.0f : this.f18099t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C(WebView webView, com.explorestack.iab.mraid.e eVar, boolean z10) {
        j2.a aVar = this.f18091l;
        if (aVar == null || aVar.getParent() == null) {
            View viewC = p.c(o0(), this);
            if (!(viewC instanceof ViewGroup)) {
                com.explorestack.iab.mraid.d.d(g0.f66431k, "Can't add resized view because can't find required parent", new Object[0]);
                return false;
            }
            j2.a aVar2 = new j2.a(getContext());
            this.f18091l = aVar2;
            aVar2.setCloseClickListener(this);
            ((ViewGroup) viewC).addView(this.f18091l);
        }
        e2.g.F(webView);
        this.f18091l.addView(webView);
        y(this.f18091l, z10);
        s(eVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D(WebView webView, com.explorestack.iab.mraid.g gVar, h hVar) {
        j2.a aVar = this.f18090k;
        if (aVar == null || aVar.getParent() == null) {
            View viewC = p.c(o0(), this);
            if (!(viewC instanceof ViewGroup)) {
                com.explorestack.iab.mraid.d.d(g0.f66431k, "Can't add resized view because can't find required parent", new Object[0]);
                return false;
            }
            j2.a aVar2 = new j2.a(getContext());
            this.f18090k = aVar2;
            aVar2.setCloseClickListener(this);
            ((ViewGroup) viewC).addView(this.f18090k);
        }
        e2.g.F(webView);
        this.f18090k.addView(webView);
        e2.e eVarB = e2.a.b(getContext(), this.B);
        eVarB.T(Integer.valueOf(gVar.f18073e.i() & 7));
        eVarB.d0(Integer.valueOf(gVar.f18073e.i() & 112));
        this.f18090k.setCloseStyle(eVarB);
        this.f18090k.n(false, this.f18099t);
        t(gVar, hVar);
        return true;
    }

    private void I(Activity activity) {
        this.I = Integer.valueOf(activity.getRequestedOrientation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(b2.b bVar) {
        d2.b bVar2 = this.f18096q;
        if (bVar2 != null) {
            bVar2.p(bVar);
        }
        k kVar = this.f18095p;
        if (kVar != null) {
            kVar.q(this, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(String str) {
        if (this.f18095p == null || str.startsWith(MRAIDNativeFeature.TEL) || str.startsWith(MRAIDNativeFeature.SMS)) {
            return;
        }
        setLoadingVisible(true);
        d2.b bVar = this.f18096q;
        if (bVar != null) {
            bVar.onAdClicked();
        }
        this.f18095p.f(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(b2.b bVar) {
        d2.b bVar2 = this.f18096q;
        if (bVar2 != null) {
            bVar2.p(bVar);
        }
        k kVar = this.f18095p;
        if (kVar != null) {
            kVar.e(this, bVar);
        }
    }

    private void Q(String str) {
        this.f18089j.W(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        q(this.f18091l);
        this.f18091l = null;
        Activity activityQ0 = q0();
        if (activityQ0 != null) {
            p(activityQ0);
        }
        this.f18089j.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        q(this.f18090k);
        this.f18090k = null;
        this.f18089j.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        e2.e eVarB = e2.a.b(getContext(), this.B);
        this.f18089j.M(eVarB.n().intValue(), eVarB.E().intValue());
    }

    private boolean e0() {
        return this.f18089j.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        k kVar = this.f18095p;
        if (kVar != null) {
            kVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        k kVar = this.f18095p;
        if (kVar != null) {
            kVar.p(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        k kVar;
        if (this.f18105z.getAndSet(true) || (kVar = this.f18095p) == null) {
            return;
        }
        kVar.n(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        d2.b bVar = this.f18096q;
        if (bVar != null) {
            bVar.onAdShown();
        }
        k kVar = this.f18095p;
        if (kVar != null) {
            kVar.m(this);
        }
    }

    private Context o0() {
        Activity activityQ0 = q0();
        return activityQ0 == null ? getContext() : activityQ0;
    }

    private void p(Activity activity) {
        Integer num = this.I;
        if (num != null) {
            activity.setRequestedOrientation(num.intValue());
            this.I = null;
        }
    }

    private void p0() {
        setCloseClickListener(this.A);
        n(true, this.f18098s);
    }

    private void q(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        e2.g.F(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(b2.b bVar) {
        d2.b bVar2 = this.f18096q;
        if (bVar2 != null) {
            bVar2.p(bVar);
        }
        k kVar = this.f18095p;
        if (kVar != null) {
            kVar.j(this, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(com.explorestack.iab.mraid.e eVar) {
        if (eVar == null) {
            return;
        }
        Activity activityQ0 = q0();
        com.explorestack.iab.mraid.d.a(g0.f66431k, "applyOrientation: %s", eVar);
        if (activityQ0 == null) {
            com.explorestack.iab.mraid.d.a(g0.f66431k, "no any interacted activities", new Object[0]);
        } else {
            I(activityQ0);
            activityQ0.setRequestedOrientation(eVar.c(activityQ0));
        }
    }

    private void t(com.explorestack.iab.mraid.g gVar, h hVar) {
        com.explorestack.iab.mraid.d.a(g0.f66431k, "setResizedViewSizeAndPosition: %s", gVar);
        if (this.f18090k == null) {
            return;
        }
        int iK = e2.g.k(getContext(), gVar.f18069a);
        int iK2 = e2.g.k(getContext(), gVar.f18070b);
        int iK3 = e2.g.k(getContext(), gVar.f18071c);
        int iK4 = e2.g.k(getContext(), gVar.f18072d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK2);
        Rect rectF = hVar.f();
        int i10 = rectF.left + iK3;
        int i11 = rectF.top + iK4;
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        this.f18090k.setLayoutParams(layoutParams);
    }

    private void y(j2.a aVar, boolean z10) {
        setCloseClickListener(this);
        aVar.setCloseStyle(this.B);
        aVar.setCountDownStyle(this.C);
        B(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        k kVar = this.f18095p;
        if (kVar != null) {
            kVar.h(this, str);
        }
    }

    public void U() {
        this.f18095p = null;
        this.f18093n = null;
        Activity activityQ0 = q0();
        if (activityQ0 != null) {
            p(activityQ0);
        }
        q(this.f18090k);
        q(this.f18091l);
        this.f18089j.D();
        e2.r rVar = this.G;
        if (rVar != null) {
            rVar.a();
        }
    }

    void X() {
        if (this.f18089j.Q() || !this.f18103x) {
            e2.g.z(new d());
        } else {
            Z();
        }
    }

    @Override // e2.c
    public void a() {
        setLoadingVisible(false);
    }

    @Override // j2.a.d
    public void b() {
        X();
    }

    @Override // j2.a.d
    public void c() {
        if (!this.f18089j.Q() && this.f18104y && this.f18100u == 0.0f) {
            Z();
        }
    }

    boolean c0() {
        return this.f18089j.O();
    }

    @Override // e2.c
    public void d() {
        setLoadingVisible(false);
    }

    @Override // j2.a
    public boolean k() {
        if (getOnScreenTimeMs() > p.f18148a || this.f18089j.R()) {
            return true;
        }
        if (this.f18102w || !this.f18089j.S()) {
            return super.k();
        }
        return false;
    }

    public void l0(String str) {
        d2.b bVar = this.f18096q;
        if (bVar != null && str != null) {
            str = bVar.prepareCreativeForMeasure(str);
        }
        int i10 = f.f18129a[this.f18097r.ordinal()];
        if (i10 == 1) {
            Q(str);
            return;
        }
        if (i10 == 2) {
            this.f18094o = str;
            j0();
        } else {
            if (i10 != 3) {
                return;
            }
            j0();
            Q(str);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.explorestack.iab.mraid.d.a(g0.f66431k, "onConfigurationChanged: %s", e2.g.C(configuration.orientation));
        e2.g.z(new e());
    }

    public Activity q0() {
        WeakReference weakReference = this.f18093n;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r0(android.app.Activity r3) {
        /*
            r2 = this;
            int[] r0 = com.explorestack.iab.mraid.j.f.f18129a
            b2.a r1 = r2.f18097r
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3d
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 3
            if (r0 == r1) goto L14
            goto L4c
        L14:
            boolean r0 = r2.e0()
            if (r0 == 0) goto L21
            boolean r0 = r2.c0()
            if (r0 == 0) goto L4c
            goto L43
        L21:
            boolean r0 = r2.c0()
            if (r0 == 0) goto L4c
            r2.p0()
            goto L4c
        L2b:
            boolean r0 = r2.c0()
            if (r0 == 0) goto L34
            r2.p0()
        L34:
            java.lang.String r0 = r2.f18094o
            r2.Q(r0)
            r0 = 0
            r2.f18094o = r0
            goto L4c
        L3d:
            boolean r0 = r2.c0()
            if (r0 == 0) goto L4c
        L43:
            com.explorestack.iab.mraid.a r0 = r2.f18089j
            boolean r0 = r0.S()
            r2.y(r2, r0)
        L4c:
            com.explorestack.iab.mraid.a r0 = r2.f18089j
            r0.Y()
            r2.setLastInteractedActivity(r3)
            com.explorestack.iab.mraid.a r3 = r2.f18089j
            com.explorestack.iab.mraid.e r3 = r3.getLastOrientationProperties()
            r2.s(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.mraid.j.r0(android.app.Activity):void");
    }

    public void setLastInteractedActivity(@Nullable Activity activity) {
        if (activity != null) {
            this.f18093n = new WeakReference(activity);
            this.f18088i.setBaseContext(activity);
        }
    }

    public void setLoadingVisible(boolean z10) {
        if (!z10) {
            e2.n nVar = this.f18092m;
            if (nVar != null) {
                nVar.d(8);
                return;
            }
            return;
        }
        if (this.f18092m == null) {
            e2.n nVar2 = new e2.n(null);
            this.f18092m = nVar2;
            nVar2.f(getContext(), this, this.D);
        }
        this.f18092m.d(0);
        this.f18092m.c();
    }

    /* synthetic */ j(Context context, a aVar, b bVar) {
        this(context, aVar);
    }
}

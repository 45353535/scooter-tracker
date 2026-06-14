package io.bidmachine.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import b9.q;
import com.taurusx.tax.o.g0;
import g9.a;
import id.z0;
import io.bidmachine.iab.mraid.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public class s extends g9.a implements a.InterfaceC0886a, b9.f {
    private final a.InterfaceC0886a A;
    private final b9.k B;
    private final b9.k C;
    private final b9.k D;
    private final b9.k E;
    private boolean F;
    private b9.q G;
    private b9.o H;
    private Integer I;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MutableContextWrapper f80265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.bidmachine.iab.mraid.b f80266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g9.a f80267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g9.a f80268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b9.m f80269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference f80270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f80271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private t f80272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final a9.b f80273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final y8.a f80274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f80275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f80276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f80277u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f80278v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f80279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f80280x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final boolean f80281y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AtomicBoolean f80282z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f80283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y8.a f80284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f80285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f80286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f80287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String[] f80288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public t f80289g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public a9.b f80290h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private b9.k f80291i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private b9.k f80292j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private b9.k f80293k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private b9.k f80294l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f80295m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f80296n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private float f80297o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f80298p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f80299q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f80300r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f80301s;

        public a() {
            this(o.INLINE);
        }

        public a A(boolean z10) {
            this.f80298p = z10;
            return this;
        }

        public a B(t tVar) {
            this.f80289g = tVar;
            return this;
        }

        public a C(b9.k kVar) {
            this.f80293k = kVar;
            return this;
        }

        public a D(float f10) {
            this.f80295m = f10;
            return this;
        }

        public a E(String str) {
            this.f80286d = str;
            return this;
        }

        public a F(b9.k kVar) {
            this.f80294l = kVar;
            return this;
        }

        public a G(boolean z10) {
            this.f80300r = z10;
            return this;
        }

        public a H(boolean z10) {
            this.f80301s = z10;
            return this;
        }

        public s c(Context context) {
            return new s(context, this, null);
        }

        public a h(boolean z10) {
            this.f80299q = z10;
            return this;
        }

        public a t(a9.b bVar) {
            this.f80290h = bVar;
            return this;
        }

        public a u(String str) {
            this.f80285c = str;
            return this;
        }

        public a v(y8.a aVar) {
            this.f80284b = aVar;
            return this;
        }

        public a w(b9.k kVar) {
            this.f80291i = kVar;
            return this;
        }

        public a x(float f10) {
            this.f80296n = f10;
            return this;
        }

        public a y(b9.k kVar) {
            this.f80292j = kVar;
            return this;
        }

        public a z(float f10) {
            this.f80297o = f10;
            return this;
        }

        a(o oVar) {
            this.f80288f = null;
            this.f80295m = 3.0f;
            this.f80296n = 0.0f;
            this.f80297o = 0.0f;
            this.f80283a = oVar;
            this.f80284b = y8.a.FullLoad;
            this.f80285c = "https://localhost";
        }
    }

    class b implements q.a {
        b() {
        }

        @Override // b9.q.a
        public void a(float f10, long j10, long j11) {
            int i10 = (int) (j11 / 1000);
            int i11 = (int) (j10 / 1000);
            if (s.this.H != null) {
                s.this.H.r(f10, i11, i10);
            }
        }

        @Override // b9.q.a
        public void b() {
            if (s.this.H != null) {
                s.this.H.l();
            }
            if (s.this.f80266j.T() || !s.this.f80281y || s.this.f80277u <= 0.0f) {
                return;
            }
            s.this.c0();
        }
    }

    class c implements a.InterfaceC0886a {
        c() {
        }

        @Override // g9.a.InterfaceC0886a
        public void b() {
            s.this.Q(y8.b.i("Close button clicked"));
            s.this.i0();
        }

        @Override // g9.a.InterfaceC0886a
        public void c() {
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u mraidViewState = s.this.f80266j.getMraidViewState();
            if (mraidViewState == u.RESIZED) {
                s.this.X();
                return;
            }
            if (mraidViewState == u.EXPANDED) {
                s.this.T();
            } else if (s.this.f0()) {
                s.this.f80266j.x();
                s.this.i0();
            }
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f80305a;

        static {
            int[] iArr = new int[y8.a.values().length];
            f80305a = iArr;
            try {
                iArr[y8.a.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80305a[y8.a.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80305a[y8.a.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class f implements b.d {
        private f() {
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void a(io.bidmachine.iab.mraid.b bVar, y8.b bVar2) {
            s.this.B(bVar2);
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void b(io.bidmachine.iab.mraid.b bVar, n nVar) {
            s.this.t(nVar);
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public boolean c(io.bidmachine.iab.mraid.b bVar) {
            return false;
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void d(io.bidmachine.iab.mraid.b bVar) {
            s.this.p0();
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void e(io.bidmachine.iab.mraid.b bVar) {
            s.this.a0();
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void f(io.bidmachine.iab.mraid.b bVar, String str) {
            s.this.P(str);
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void g(io.bidmachine.iab.mraid.b bVar, String str) {
            s.this.V(str);
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void h(io.bidmachine.iab.mraid.b bVar, boolean z10) {
            if (s.this.f80279w) {
                return;
            }
            if (z10 && !s.this.F) {
                s.this.F = true;
            }
            s.this.C(z10);
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void i(io.bidmachine.iab.mraid.b bVar, y8.b bVar2) {
            s.this.Q(bVar2);
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void j(io.bidmachine.iab.mraid.b bVar) {
            s.this.m0();
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void k(io.bidmachine.iab.mraid.b bVar, String str) {
            s.this.z(str);
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void l(io.bidmachine.iab.mraid.b bVar, y8.b bVar2) {
            s.this.M(bVar2);
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void m(io.bidmachine.iab.mraid.b bVar) {
            s.this.k0();
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void n(io.bidmachine.iab.mraid.b bVar, String str, WebView webView, boolean z10) {
            s.this.A(str, webView, z10);
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void o(io.bidmachine.iab.mraid.b bVar, String str) {
            s.this.L(str);
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public void p(io.bidmachine.iab.mraid.b bVar, z0 z0Var) {
            s.this.s(z0Var);
        }

        @Override // io.bidmachine.iab.mraid.b.d
        public boolean q(io.bidmachine.iab.mraid.b bVar, WebView webView, n nVar, boolean z10) {
            return s.this.D(webView, nVar, z10);
        }

        /* synthetic */ f(s sVar, b bVar) {
            this();
        }
    }

    /* synthetic */ s(Context context, a aVar, b bVar) {
        this(context, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(String str, WebView webView, boolean z10) {
        setLoadingVisible(false);
        if (f0()) {
            r(this, z10);
        }
        a9.b bVar = this.f80273q;
        if (bVar != null) {
            bVar.f(webView);
        }
        if (this.f80274r != y8.a.FullLoad || this.f80278v || str.equals("data:text/html,<html></html>")) {
            return;
        }
        m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(y8.b bVar) {
        a9.b bVar2 = this.f80273q;
        if (bVar2 != null) {
            bVar2.y(bVar);
        }
        t tVar = this.f80272p;
        if (tVar != null) {
            tVar.onExpired(this, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z10) {
        boolean z11 = !z10 || this.f80279w;
        g9.a aVar = this.f80267k;
        if (aVar != null) {
            aVar.n(z11, this.f80276t);
            return;
        }
        g9.a aVar2 = this.f80268l;
        if (aVar2 != null) {
            aVar2.n(z11, this.f80276t);
        } else if (f0()) {
            n(z11, this.F ? 0.0f : this.f80276t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D(WebView webView, n nVar, boolean z10) {
        g9.a aVar = this.f80268l;
        if (aVar == null || aVar.getParent() == null) {
            View viewN = r.n(t0(), this);
            if (!(viewN instanceof ViewGroup)) {
                i.d(g0.f66431k, "Can't add expanded view because can't find required parent", new Object[0]);
                return false;
            }
            g9.a aVar2 = new g9.a(getContext());
            this.f80268l = aVar2;
            aVar2.setCloseClickListener(this);
            ((ViewGroup) viewN).addView(this.f80268l);
        }
        b9.u.F(webView);
        this.f80268l.addView(webView);
        r(this.f80268l, z10);
        t(nVar);
        return true;
    }

    private void H(Activity activity) {
        this.I = Integer.valueOf(activity.getRequestedOrientation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(String str) {
        if (this.f80272p == null) {
            return;
        }
        setLoadingVisible(true);
        a9.b bVar = this.f80273q;
        if (bVar != null) {
            bVar.onAdClicked();
        }
        this.f80272p.onCalendarEvent(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(y8.b bVar) {
        a9.b bVar2 = this.f80273q;
        if (bVar2 != null) {
            bVar2.y(bVar);
        }
        t tVar = this.f80272p;
        if (tVar != null) {
            tVar.onLoadFailed(this, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(String str) {
        if (this.f80272p == null) {
            return;
        }
        setLoadingVisible(true);
        a9.b bVar = this.f80273q;
        if (bVar != null) {
            bVar.onAdClicked();
        }
        this.f80272p.onOpenUrl(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(y8.b bVar) {
        a9.b bVar2 = this.f80273q;
        if (bVar2 != null) {
            bVar2.y(bVar);
        }
        t tVar = this.f80272p;
        if (tVar != null) {
            tVar.onShowFailed(this, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        q(this.f80268l);
        this.f80268l = null;
        Activity activityS0 = s0();
        if (activityS0 != null) {
            p(activityS0);
        }
        this.f80266j.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(String str) {
        if (this.f80272p == null) {
            return;
        }
        setLoadingVisible(true);
        a9.b bVar = this.f80273q;
        if (bVar != null) {
            bVar.onAdClicked();
        }
        this.f80272p.onStorePicture(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        q(this.f80267k);
        this.f80267k = null;
        this.f80266j.z();
    }

    private void Z(String str) {
        this.f80266j.Y(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        b9.k kVarB = b9.a.b(getContext(), this.B);
        this.f80266j.O(kVarB.n().intValue(), kVarB.E().intValue());
    }

    private boolean h0() {
        return this.f80266j.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        t tVar = this.f80272p;
        if (tVar != null) {
            tVar.onClose(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0() {
        t tVar = this.f80272p;
        if (tVar != null) {
            tVar.onExpand(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        t tVar;
        if (this.f80282z.getAndSet(true) || (tVar = this.f80272p) == null) {
            return;
        }
        tVar.onLoaded(this);
    }

    private void p(Activity activity) {
        Integer num = this.I;
        if (num != null) {
            activity.setRequestedOrientation(num.intValue());
            this.I = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        a9.b bVar = this.f80273q;
        if (bVar != null) {
            bVar.onAdShown();
        }
        t tVar = this.f80272p;
        if (tVar != null) {
            tVar.onShown(this);
        }
    }

    private void q(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        b9.u.F(view);
    }

    private void r(g9.a aVar, boolean z10) {
        setCloseClickListener(this);
        aVar.setCloseStyle(this.B);
        aVar.setCountDownStyle(this.C);
        C(z10);
    }

    private void r0() {
        setCloseClickListener(this.A);
        n(true, this.f80275s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(z0 z0Var) {
        t tVar = this.f80272p;
        if (tVar == null) {
            return;
        }
        tVar.onOpenPrivacySheet(this, z0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(n nVar) {
        if (nVar == null) {
            return;
        }
        Activity activityS0 = s0();
        i.c(g0.f66431k, "applyOrientation: %s", nVar);
        if (activityS0 == null) {
            i.c(g0.f66431k, "no any interacted activities", new Object[0]);
        } else {
            H(activityS0);
            activityS0.setRequestedOrientation(nVar.c(activityS0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        t tVar = this.f80272p;
        if (tVar != null) {
            tVar.onPlayVideo(this, str);
        }
    }

    public void W() {
        this.f80272p = null;
        this.f80270n = null;
        Activity activityS0 = s0();
        if (activityS0 != null) {
            p(activityS0);
        }
        q(this.f80267k);
        q(this.f80268l);
        this.f80266j.E();
        b9.q qVar = this.G;
        if (qVar != null) {
            qVar.h();
        }
    }

    @Override // b9.f
    public void a() {
        setLoadingVisible(false);
    }

    void a0() {
        if (this.f80266j.T() || !this.f80280x) {
            b9.u.B(new d());
        } else {
            c0();
        }
    }

    @Override // g9.a.InterfaceC0886a
    public void b() {
        a0();
    }

    @Override // g9.a.InterfaceC0886a
    public void c() {
        if (!this.f80266j.T() && this.f80281y && this.f80277u == 0.0f) {
            c0();
        }
    }

    @Override // b9.f
    public void d() {
        setLoadingVisible(false);
    }

    boolean f0() {
        return this.f80266j.R();
    }

    @Override // g9.a
    public boolean k() {
        if (getOnScreenTimeMs() > r.f80259a || this.f80266j.U()) {
            return true;
        }
        if (this.f80279w || !this.f80266j.W()) {
            return super.k();
        }
        return false;
    }

    public void o0(String str) {
        a9.b bVar = this.f80273q;
        if (bVar != null && str != null) {
            str = bVar.prepareCreativeForMeasure(str);
        }
        int i10 = e.f80305a[this.f80274r.ordinal()];
        if (i10 == 1) {
            Z(str);
            return;
        }
        if (i10 == 2) {
            this.f80271o = str;
            m0();
        } else {
            if (i10 != 3) {
                return;
            }
            m0();
            Z(str);
        }
    }

    public Activity s0() {
        WeakReference weakReference = this.f80270n;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public void setLastInteractedActivity(@Nullable Activity activity) {
        if (activity != null) {
            this.f80270n = new WeakReference(activity);
            this.f80265i.setBaseContext(activity);
        }
    }

    public void setLoadingVisible(boolean z10) {
        if (!z10) {
            b9.m mVar = this.f80269m;
            if (mVar != null) {
                mVar.o(8);
                return;
            }
            return;
        }
        if (this.f80269m == null) {
            b9.m mVar2 = new b9.m(null);
            this.f80269m = mVar2;
            mVar2.g(getContext(), this, this.D);
        }
        this.f80269m.o(0);
        this.f80269m.i();
    }

    public Context t0() {
        Activity activityS0 = s0();
        return activityS0 == null ? getContext() : activityS0;
    }

    public void u0(Activity activity) {
        int i10 = e.f80305a[this.f80274r.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                if (f0()) {
                    r0();
                }
                Z(this.f80271o);
                this.f80271o = null;
            } else if (i10 == 3) {
                if (h0()) {
                    if (f0()) {
                        r(this, this.f80266j.W());
                    }
                } else if (f0()) {
                    r0();
                }
            }
        } else if (f0()) {
            r(this, this.f80266j.W());
        }
        this.f80266j.Z();
        setLastInteractedActivity(activity);
        t(this.f80266j.getLastOrientationProperties());
    }

    private s(Context context, a aVar) {
        super(context);
        this.f80282z = new AtomicBoolean(false);
        this.F = false;
        this.f80265i = new MutableContextWrapper(context);
        this.f80272p = aVar.f80289g;
        this.f80274r = aVar.f80284b;
        this.f80275s = aVar.f80295m;
        this.f80276t = aVar.f80296n;
        float f10 = aVar.f80297o;
        this.f80277u = f10;
        this.f80278v = aVar.f80298p;
        this.f80279w = aVar.f80299q;
        this.f80280x = aVar.f80300r;
        this.f80281y = aVar.f80301s;
        a9.b bVar = aVar.f80290h;
        this.f80273q = bVar;
        this.B = aVar.f80291i;
        this.C = aVar.f80292j;
        this.D = aVar.f80293k;
        b9.k kVar = aVar.f80294l;
        this.E = kVar;
        io.bidmachine.iab.mraid.b bVarA = new b.C0979b(context.getApplicationContext(), aVar.f80283a, new f(this, null)).c(aVar.f80285c).e(aVar.f80286d).b(aVar.f80288f).d(aVar.f80287e).a();
        this.f80266j = bVarA;
        addView(bVarA, new FrameLayout.LayoutParams(-1, -1, 17));
        if (f10 > 0.0f) {
            b9.o oVar = new b9.o(null);
            this.H = oVar;
            oVar.g(context, this, kVar);
            b9.q qVar = new b9.q(this, new b());
            this.G = qVar;
            qVar.k(f10);
        }
        this.A = new c();
        setCloseClickListener(this);
        if (bVar != null) {
            bVar.e(this);
            bVar.w(bVarA.getWebView());
        }
    }
}

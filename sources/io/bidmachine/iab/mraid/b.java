package io.bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import id.z0;
import io.bidmachine.iab.mraid.b0;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import pd.i0;

/* JADX INFO: loaded from: classes12.dex */
public class b extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f80151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f80152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f80153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f80154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f80155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f80156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f80157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f80158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f80159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f80160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f80161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f80162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final GestureDetector f80163n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k f80164o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final l f80165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f0 f80166q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b0 f80167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final d f80168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    b0 f80169t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private u f80170u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Runnable f80171v;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f80172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f80173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f80174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f80175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b0 f80176f;

        /* JADX INFO: renamed from: io.bidmachine.iab.mraid.b$a$a, reason: collision with other inner class name */
        class RunnableC0977a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Point f80178b;

            /* JADX INFO: renamed from: io.bidmachine.iab.mraid.b$a$a$a, reason: collision with other inner class name */
            class RunnableC0978a implements Runnable {
                RunnableC0978a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.this.u();
                }
            }

            RunnableC0977a(Point point) {
                this.f80178b = point;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0978a runnableC0978a = new RunnableC0978a();
                a aVar = a.this;
                b bVar = b.this;
                Point point = this.f80178b;
                bVar.p(point.x, point.y, aVar.f80176f, runnableC0978a);
            }
        }

        a(int i10, int i11, int i12, int i13, b0 b0Var) {
            this.f80172b = i10;
            this.f80173c = i11;
            this.f80174d = i12;
            this.f80175e = i13;
            this.f80176f = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Point pointR = b9.u.r(this.f80172b, this.f80173c, this.f80174d, this.f80175e);
            b.this.c(pointR.x, pointR.y, this.f80176f, new RunnableC0977a(pointR));
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.iab.mraid.b$b, reason: collision with other inner class name */
    public static class C0979b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f80181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o f80182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f80183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f80184d = "https://localhost";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f80185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f80186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f80187g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Long f80188h;

        public C0979b(Context context, o oVar, d dVar) {
            this.f80181a = context;
            this.f80182b = oVar;
            this.f80183c = dVar;
        }

        public b a() {
            return new b(this.f80181a, this.f80182b, this.f80184d, this.f80187g, this.f80185e, this.f80186f, this.f80188h, this.f80183c);
        }

        public C0979b b(String[] strArr) {
            this.f80185e = strArr != null ? Arrays.asList(strArr) : null;
            return this;
        }

        public C0979b c(String str) {
            this.f80184d = str;
            return this;
        }

        public C0979b d(String str) {
            this.f80186f = str;
            return this;
        }

        public C0979b e(String str) {
            this.f80187g = str;
            return this;
        }
    }

    private static class c extends GestureDetector.SimpleOnGestureListener {
        private c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return true;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    public interface d {
        void a(b bVar, y8.b bVar2);

        void b(b bVar, n nVar);

        boolean c(b bVar);

        void d(b bVar);

        void e(b bVar);

        void f(b bVar, String str);

        void g(b bVar, String str);

        void h(b bVar, boolean z10);

        void i(b bVar, y8.b bVar2);

        void j(b bVar);

        void k(b bVar, String str);

        void l(b bVar, y8.b bVar2);

        void m(b bVar);

        void n(b bVar, String str, WebView webView, boolean z10);

        void o(b bVar, String str);

        void p(b bVar, z0 z0Var);

        boolean q(b bVar, WebView webView, n nVar, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class e implements b0.a {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            b.this.f80168s.o(b.this, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(String str) {
            b.this.f80168s.g(b.this, str);
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void b() {
            i.c("MraidAdView", "Callback - onLoaded", new Object[0]);
            b.this.o();
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void d(String str) {
            i.c("MraidAdView", "Callback - onPlayVideo: %s", str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                b.this.f80168s.k(b.this, URLDecoder.decode(str, "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                i.e("MraidAdView", e10);
            }
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void e(String str) {
            i.c("MraidAdView", "Callback - onStorePicture: %s", str);
            String strB = b.this.f80166q.b(str);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            b.this.l(strB, new pd.h() { // from class: io.bidmachine.iab.mraid.c
                @Override // pd.h
                public final void execute(Object obj) {
                    this.f80202a.l((String) obj);
                }
            });
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void f(String str) {
            i.c("MraidAdView", "Callback - onOpenPrivacySheet: %s", str);
            b.this.s(str);
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void g(String str) {
            i.c("MraidAdView", "Callback - onCalendarEvent: %s", str);
            String strA = b.this.f80166q.a(str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            b.this.l(strA, new pd.h() { // from class: io.bidmachine.iab.mraid.d
                @Override // pd.h
                public final void execute(Object obj) {
                    this.f80203a.k((String) obj);
                }
            });
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void h(n nVar) {
            i.c("MraidAdView", "Callback - onOrientation: %s", nVar);
            if (b.this.R() || b.this.f80170u == u.EXPANDED) {
                b.this.f80168s.b(b.this, nVar);
            }
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void onClose() {
            i.c("MraidAdView", "Callback - onClose", new Object[0]);
            b.this.b();
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void onOpen(String str) {
            i.c("MraidAdView", "Callback - onOpen: %s", str);
            b.this.w(str);
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void q(String str) {
            i.c("MraidAdView", "Callback - onExpand: %s", str);
            b.this.k(str);
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void y(y8.b bVar) {
            i.c("MraidAdView", "Callback - onError: %s", bVar);
            b.this.m(bVar);
        }

        /* synthetic */ e(b bVar, a aVar) {
            this();
        }
    }

    private class f extends e {
        private f() {
            super(b.this, null);
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void a(boolean z10) {
            if (z10) {
                b.this.I();
                b.this.K();
            }
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void c(boolean z10) {
            d dVar = b.this.f80168s;
            b bVar = b.this;
            dVar.h(bVar, bVar.f80167r.z());
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void onPageFinished(String str) {
            b.this.D(str);
        }

        /* synthetic */ f(b bVar, a aVar) {
            this();
        }
    }

    private class g extends e {
        private g() {
            super(b.this, null);
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void a(boolean z10) {
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void c(boolean z10) {
            b bVar = b.this;
            if (bVar.f80169t != null) {
                d dVar = bVar.f80168s;
                b bVar2 = b.this;
                dVar.h(bVar2, bVar2.f80169t.z());
            }
        }

        @Override // io.bidmachine.iab.mraid.b0.a
        public void onPageFinished(String str) {
            b.this.B();
        }

        /* synthetic */ g(b bVar, a aVar) {
            this();
        }
    }

    public b(Context context, o oVar, String str, String str2, List list, String str3, Long l10, d dVar) {
        this(context, oVar, str, str2, list, str3, l10, dVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        b0 b0Var = this.f80169t;
        if (b0Var == null) {
            return;
        }
        b0Var.l(this.f80164o);
        this.f80169t.i(this.f80151b);
        b0 b0Var2 = this.f80169t;
        b0Var2.m(b0Var2.A());
        this.f80169t.k(this.f80170u);
        this.f80169t.p(this.f80153d);
        this.f80169t.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(String str) {
        if (this.f80170u == u.LOADING && this.f80156g.compareAndSet(false, true)) {
            this.f80167r.l(this.f80164o);
            this.f80167r.i(this.f80151b);
            b0 b0Var = this.f80167r;
            b0Var.m(b0Var.A());
            this.f80167r.p(this.f80153d);
            setViewState(u.DEFAULT);
            I();
            this.f80168s.n(this, str, this.f80167r.x(), this.f80167r.z());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(String str) {
        this.f80168s.f(this, str);
    }

    private boolean H() {
        return this.f80158i.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        if (this.f80157h.compareAndSet(false, true)) {
            this.f80167r.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        if (this.f80159j.compareAndSet(false, true)) {
            this.f80168s.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f80168s.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10, int i11, b0 b0Var, Runnable runnable) {
        if (V()) {
            return;
        }
        i(b0Var.x(), i10, i11);
        this.f80171v = runnable;
        postDelayed(runnable, 150L);
    }

    @NonNull
    private b0 getCurrentMraidWebViewController() {
        b0 b0Var = this.f80169t;
        return b0Var != null ? b0Var : this.f80167r;
    }

    private void i(a0 a0Var, int i10, int i11) {
        a0Var.dispatchTouchEvent(b9.u.A(0, i10, i11));
        a0Var.dispatchTouchEvent(b9.u.A(1, i10, i11));
    }

    private void j(b0 b0Var, int i10, int i11, int i12, int i13) {
        if (this.f80161l.compareAndSet(false, true)) {
            this.f80162m.set(false);
            a aVar = new a(i10, i11, i12, i13, b0Var);
            Point pointS = b9.u.s(i10, i11);
            c(pointS.x, pointS.y, b0Var, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str) {
        b0 b0Var;
        if (R()) {
            return;
        }
        u uVar = this.f80170u;
        if (uVar == u.DEFAULT || uVar == u.RESIZED) {
            if (str == null || this.f80168s.c(this)) {
                b0Var = this.f80167r;
            } else {
                try {
                    String strDecode = URLDecoder.decode(str, "UTF-8");
                    if (!pd.f0.r(strDecode)) {
                        strDecode = this.f80152c + strDecode;
                    }
                    b0Var = new b0(getContext(), new g(this, null), this.f80154e);
                    this.f80169t = b0Var;
                    b0Var.B(strDecode);
                } catch (UnsupportedEncodingException unused) {
                    return;
                }
            }
            if (this.f80168s.q(this, b0Var.x(), b0Var.v(), b0Var.z())) {
                setViewState(u.EXPANDED);
                this.f80168s.m(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str, pd.h hVar) {
        this.f80160k.set(true);
        this.f80161l.set(false);
        this.f80162m.set(true);
        removeCallbacks(this.f80171v);
        if (this.f80165p.a(str)) {
            hVar.execute(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(y8.b bVar) {
        if (!S()) {
            this.f80168s.l(this, bVar);
        } else if (H()) {
            this.f80168s.i(this, bVar);
        } else {
            this.f80168s.a(this, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.f80168s.j(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(int i10, int i11, b0 b0Var, Runnable runnable) {
        if (V()) {
            return;
        }
        b0Var.g(i10, i11);
        this.f80171v = runnable;
        postDelayed(runnable, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(String str) {
        z0 z0VarC = jd.d.c(str);
        if (z0VarC == null) {
            i.d("MraidAdView", "Callback - can't parse privacy sheet", new Object[0]);
        } else {
            this.f80168s.p(this, z0VarC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (V() || TextUtils.isEmpty(this.f80155f)) {
            return;
        }
        w(this.f80155f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str) {
        l(str, new pd.h() { // from class: io.bidmachine.iab.mraid.a
            @Override // pd.h
            public final void execute(Object obj) {
                this.f80139a.G((String) obj);
            }
        });
    }

    public void E() {
        this.f80167r.u();
        b0 b0Var = this.f80169t;
        if (b0Var != null) {
            b0Var.u();
        }
    }

    public void N(int i10, int i11, int i12, int i13) {
        j(getCurrentMraidWebViewController(), i10, i11, i12, i13);
    }

    public void O(int i10, int i11) {
        Rect rectE = getCurrentMraidWebViewController().w().e();
        N(rectE.width(), rectE.height(), i10, i11);
    }

    public void P() {
        a0 a0VarX = getCurrentMraidWebViewController().x();
        N(a0VarX.getMeasuredWidth(), a0VarX.getMeasuredHeight(), 17, 17);
    }

    public boolean R() {
        return this.f80151b == o.INTERSTITIAL;
    }

    public boolean S() {
        return this.f80156g.get();
    }

    public boolean T() {
        return this.f80160k.get();
    }

    public boolean U() {
        return this.f80167r.y();
    }

    public boolean V() {
        return this.f80162m.get();
    }

    public boolean W() {
        return this.f80167r.z();
    }

    public void Y(String str) {
        if (str == null) {
            m(y8.b.h("Html data are null"));
        } else {
            this.f80167r.C(this.f80152c, String.format("<script type='application/javascript'>%s</script>%s%s", r.h(), z8.b.e(), r.r(str)), "text/html", "UTF-8");
            this.f80167r.h(i.f());
        }
    }

    public void Z() {
        if (this.f80158i.compareAndSet(false, true) && S()) {
            I();
        }
    }

    @Nullable
    public String getBaseUrl() {
        return this.f80152c;
    }

    @Nullable
    public n getLastOrientationProperties() {
        return this.f80167r.v();
    }

    @NonNull
    public u getMraidViewState() {
        return this.f80170u;
    }

    @NonNull
    public WebView getWebView() {
        return this.f80167r.x();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f80163n.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @VisibleForTesting
    void setViewState(@NonNull u uVar) {
        this.f80170u = uVar;
        this.f80167r.k(uVar);
        b0 b0Var = this.f80169t;
        if (b0Var != null) {
            b0Var.k(uVar);
        }
    }

    public void x() {
        setViewState(u.HIDDEN);
    }

    public void y() {
        b0 b0Var = this.f80169t;
        if (b0Var != null) {
            b0Var.u();
            this.f80169t = null;
        } else {
            a0 a0VarX = this.f80167r.x();
            if (a0VarX.getParent() != this) {
                i0.a(this, a0VarX);
            }
        }
        setViewState(u.DEFAULT);
    }

    public void z() {
        i0.a(this, this.f80167r.x());
        setViewState(u.DEFAULT);
    }

    b(Context context, o oVar, String str, String str2, List list, String str3, Long l10, d dVar, b0 b0Var) {
        super(context);
        this.f80166q = new f0();
        this.f80151b = oVar;
        this.f80152c = str;
        this.f80155f = str2;
        this.f80153d = str3;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        this.f80154e = jLongValue;
        this.f80168s = dVar;
        this.f80156g = new AtomicBoolean(false);
        this.f80157h = new AtomicBoolean(false);
        this.f80158i = new AtomicBoolean(false);
        this.f80159j = new AtomicBoolean(false);
        this.f80160k = new AtomicBoolean(false);
        this.f80161l = new AtomicBoolean(false);
        this.f80162m = new AtomicBoolean(false);
        a aVar = null;
        this.f80163n = new GestureDetector(context, new c(aVar));
        k kVar = new k(context, list);
        this.f80164o = kVar;
        this.f80165p = new l(kVar);
        b0Var = b0Var == null ? new b0(context, new f(this, aVar), jLongValue) : b0Var;
        this.f80167r = b0Var;
        addView(b0Var.x(), new FrameLayout.LayoutParams(-1, -1, 17));
        this.f80170u = u.LOADING;
    }
}

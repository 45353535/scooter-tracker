package com.explorestack.iab.mraid;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.iab.mraid.r;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class a extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.explorestack.iab.mraid.f f18008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f18011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f18012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f18013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f18014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f18015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f18016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final GestureDetector f18017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.explorestack.iab.mraid.h f18018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s f18019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o f18020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r f18021o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final f f18022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private r f18023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private l f18024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f18025s;

    /* JADX INFO: renamed from: com.explorestack.iab.mraid.a$a, reason: collision with other inner class name */
    class RunnableC0308a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f18027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f18029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ r f18030f;

        /* JADX INFO: renamed from: com.explorestack.iab.mraid.a$a$a, reason: collision with other inner class name */
        class RunnableC0309a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Point f18032b;

            /* JADX INFO: renamed from: com.explorestack.iab.mraid.a$a$a$a, reason: collision with other inner class name */
            class RunnableC0310a implements Runnable {
                RunnableC0310a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.u();
                }
            }

            RunnableC0309a(Point point) {
                this.f18032b = point;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0310a runnableC0310a = new RunnableC0310a();
                RunnableC0308a runnableC0308a = RunnableC0308a.this;
                a aVar = a.this;
                Point point = this.f18032b;
                aVar.q(point.x, point.y, runnableC0308a.f18030f, runnableC0310a);
            }
        }

        RunnableC0308a(int i10, int i11, int i12, int i13, r rVar) {
            this.f18026b = i10;
            this.f18027c = i11;
            this.f18028d = i12;
            this.f18029e = i13;
            this.f18030f = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Point pointN = e2.g.n(this.f18026b, this.f18027c, this.f18028d, this.f18029e);
            a.this.c(pointN.x, pointN.y, this.f18030f, new RunnableC0309a(pointN));
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f18035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f18036c;

        b(View view, Runnable runnable) {
            this.f18035b = view;
            this.f18036c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.d(this.f18035b);
            Runnable runnable = this.f18036c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f18023q.f(a.this.f18020n);
            if (a.this.f18008b != null) {
                a.this.f18023q.c(a.this.f18008b);
            }
            a.this.f18023q.l(a.this.f18023q.A());
            a.this.f18023q.e(a.this.f18024r);
            a.this.f18023q.r(a.this.f18010d);
            a.this.f18023q.C();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f18039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.explorestack.iab.mraid.f f18040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f f18041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f18042d = "https://localhost";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f18043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f18044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f18045g;

        public d(Context context, com.explorestack.iab.mraid.f fVar, f fVar2) {
            this.f18039a = context;
            this.f18040b = fVar;
            this.f18041c = fVar2;
        }

        public a a() {
            return new a(this.f18039a, this.f18040b, this.f18042d, this.f18045g, this.f18043e, this.f18044f, this.f18041c);
        }

        public d b(String str) {
            this.f18042d = str;
            return this;
        }

        public d c(String str) {
            this.f18044f = str;
            return this;
        }

        public d d(String str) {
            this.f18045g = str;
            return this;
        }

        public d e(String[] strArr) {
            this.f18043e = strArr != null ? Arrays.asList(strArr) : null;
            return this;
        }
    }

    private static class e extends GestureDetector.SimpleOnGestureListener {
        private e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return true;
        }

        /* synthetic */ e(RunnableC0308a runnableC0308a) {
            this();
        }
    }

    public interface f {
        void a(a aVar, com.explorestack.iab.mraid.e eVar);

        void b(a aVar);

        void c(a aVar, b2.b bVar);

        void d(a aVar, b2.b bVar);

        void e(a aVar, String str);

        boolean f(a aVar, WebView webView, com.explorestack.iab.mraid.e eVar, boolean z10);

        boolean g(a aVar, WebView webView, com.explorestack.iab.mraid.g gVar, com.explorestack.iab.mraid.h hVar);

        void h(a aVar, b2.b bVar);

        void i(a aVar, String str, WebView webView, boolean z10);

        void j(a aVar, boolean z10);

        void k(a aVar);

        void l(a aVar, String str);

        void m(a aVar);

        void n(a aVar);
    }

    private abstract class g implements r.b {
        private g() {
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void b() {
            com.explorestack.iab.mraid.d.a("MraidAdView", "Callback - onLoaded", new Object[0]);
            a.this.p();
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void onClose() {
            com.explorestack.iab.mraid.d.a("MraidAdView", "Callback - onClose", new Object[0]);
            a.this.b();
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void onOpen(String str) {
            com.explorestack.iab.mraid.d.a("MraidAdView", "Callback - onOpen: %s", str);
            a.this.t(str);
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void p(b2.b bVar) {
            com.explorestack.iab.mraid.d.a("MraidAdView", "Callback - onError: %s", bVar);
            a.this.e(bVar);
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void q(String str) {
            com.explorestack.iab.mraid.d.a("MraidAdView", "Callback - onExpand: %s", str);
            if (a.this.O()) {
                return;
            }
            a.this.n(str);
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void r(com.explorestack.iab.mraid.e eVar) {
            com.explorestack.iab.mraid.d.a("MraidAdView", "Callback - onOrientation: %s", eVar);
            if (a.this.O() || a.this.f18024r == l.EXPANDED) {
                a.this.f18022p.a(a.this, eVar);
            }
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void s(String str) {
            com.explorestack.iab.mraid.d.a("MraidAdView", "Callback - onVideo: %s", str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                a.this.f18022p.l(a.this, URLDecoder.decode(str, "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void t(com.explorestack.iab.mraid.g gVar) {
            com.explorestack.iab.mraid.d.a("MraidAdView", "Callback - onResize: %s", gVar);
            a.this.k(gVar);
        }

        /* synthetic */ g(a aVar, RunnableC0308a runnableC0308a) {
            this();
        }
    }

    private class h extends g {
        private h() {
            super(a.this, null);
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void a(boolean z10) {
            if (z10) {
                a.this.G();
                a.this.J();
            }
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void c(boolean z10) {
            f fVar = a.this.f18022p;
            a aVar = a.this;
            fVar.j(aVar, aVar.f18021o.z());
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void onPageFinished(String str) {
            a.this.x(str);
        }

        /* synthetic */ h(a aVar, RunnableC0308a runnableC0308a) {
            this();
        }
    }

    private class i extends g {
        private i() {
            super(a.this, null);
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void a(boolean z10) {
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void c(boolean z10) {
            if (a.this.f18023q != null) {
                f fVar = a.this.f18022p;
                a aVar = a.this;
                fVar.j(aVar, aVar.f18023q.z());
            }
        }

        @Override // com.explorestack.iab.mraid.r.b
        public void onPageFinished(String str) {
            a.this.B();
        }

        /* synthetic */ i(a aVar, RunnableC0308a runnableC0308a) {
            this();
        }
    }

    public a(Context context, com.explorestack.iab.mraid.f fVar, String str, String str2, List list, String str3, f fVar2) {
        super(context);
        this.f18008b = fVar;
        this.f18009c = str;
        this.f18011e = str2;
        this.f18010d = str3;
        this.f18022p = fVar2;
        this.f18012f = new AtomicBoolean(false);
        this.f18013g = new AtomicBoolean(false);
        this.f18014h = new AtomicBoolean(false);
        this.f18015i = new AtomicBoolean(false);
        this.f18016j = new AtomicBoolean(false);
        RunnableC0308a runnableC0308a = null;
        this.f18017k = new GestureDetector(context, new e(runnableC0308a));
        this.f18018l = new com.explorestack.iab.mraid.h(context);
        this.f18019m = new s();
        this.f18020n = new o(list);
        r rVar = new r(context, new h(this, runnableC0308a));
        this.f18021o = rVar;
        addView(rVar.t(), new FrameLayout.LayoutParams(-1, -1, 17));
        this.f18024r = l.LOADING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.f18023q == null) {
            return;
        }
        Z(new c());
    }

    private boolean F() {
        return this.f18014h.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.f18013g.compareAndSet(false, true)) {
            this.f18021o.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f18015i.compareAndSet(false, true)) {
            this.f18022p.m(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f18022p.k(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10, int i11, r rVar, Runnable runnable) {
        if (Q()) {
            return;
        }
        l(rVar.t(), i10, i11);
        this.f18025s = runnable;
        postDelayed(runnable, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(View view) {
        Context context = getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f18018l.c(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int[] iArr = new int[2];
        View viewL = p.l(context, this);
        viewL.getLocationOnScreen(iArr);
        this.f18018l.i(iArr[0], iArr[1], viewL.getWidth(), viewL.getHeight());
        getLocationOnScreen(iArr);
        this.f18018l.g(iArr[0], iArr[1], getWidth(), getHeight());
        view.getLocationOnScreen(iArr);
        this.f18018l.d(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        this.f18021o.d(this.f18018l);
        r rVar = this.f18023q;
        if (rVar != null) {
            rVar.d(this.f18018l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(b2.b bVar) {
        if (!P()) {
            this.f18022p.d(this, bVar);
        } else if (F()) {
            this.f18022p.h(this, bVar);
        } else {
            this.f18022p.c(this, bVar);
        }
    }

    @NonNull
    private r getCurrentMraidWebViewController() {
        r rVar = this.f18023q;
        return rVar != null ? rVar : this.f18021o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(com.explorestack.iab.mraid.g gVar) {
        l lVar = this.f18024r;
        if (lVar == l.LOADING || lVar == l.HIDDEN || lVar == l.EXPANDED || O()) {
            com.explorestack.iab.mraid.d.a("MraidAdView", "Callback: onResize (invalidate state: %s)", this.f18024r);
        } else if (this.f18022p.g(this, this.f18021o.t(), gVar, this.f18018l)) {
            setViewState(l.RESIZED);
        }
    }

    private void l(q qVar, int i10, int i11) {
        qVar.dispatchTouchEvent(e2.g.y(0, i10, i11));
        qVar.dispatchTouchEvent(e2.g.y(1, i10, i11));
    }

    private void m(r rVar, int i10, int i11, int i12, int i13) {
        RunnableC0308a runnableC0308a = new RunnableC0308a(i10, i11, i12, i13, rVar);
        Point pointO = e2.g.o(i10, i11);
        c(pointO.x, pointO.y, rVar, runnableC0308a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str) {
        r rVar;
        if (O()) {
            return;
        }
        l lVar = this.f18024r;
        if (lVar == l.DEFAULT || lVar == l.RESIZED) {
            if (str == null) {
                rVar = this.f18021o;
            } else {
                try {
                    String strDecode = URLDecoder.decode(str, "UTF-8");
                    if (!e2.g.r(strDecode)) {
                        strDecode = this.f18009c + strDecode;
                    }
                    r rVar2 = new r(getContext(), new i(this, null));
                    this.f18023q = rVar2;
                    rVar2.v(strDecode);
                    rVar = rVar2;
                } catch (UnsupportedEncodingException unused) {
                    return;
                }
            }
            if (this.f18022p.f(this, rVar.t(), rVar.o(), rVar.z())) {
                setViewState(l.EXPANDED);
                this.f18022p.n(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.f18022p.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i10, int i11, r rVar, Runnable runnable) {
        if (Q()) {
            return;
        }
        rVar.b(i10, i11);
        this.f18025s = runnable;
        postDelayed(runnable, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(String str) {
        this.f18016j.set(true);
        removeCallbacks(this.f18025s);
        this.f18022p.e(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (Q() || TextUtils.isEmpty(this.f18011e)) {
            return;
        }
        t(this.f18011e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(String str) {
        if (this.f18024r == l.LOADING && this.f18012f.compareAndSet(false, true)) {
            this.f18021o.f(this.f18020n);
            com.explorestack.iab.mraid.f fVar = this.f18008b;
            if (fVar != null) {
                this.f18021o.c(fVar);
            }
            r rVar = this.f18021o;
            rVar.l(rVar.A());
            this.f18021o.r(this.f18010d);
            d(this.f18021o.t());
            setViewState(l.DEFAULT);
            G();
            this.f18022p.i(this, str, this.f18021o.t(), this.f18021o.z());
        }
    }

    public void A() {
        addView(this.f18021o.t());
        setViewState(l.DEFAULT);
    }

    public void D() {
        this.f18019m.b();
        this.f18021o.a();
        r rVar = this.f18023q;
        if (rVar != null) {
            rVar.a();
        }
    }

    public void L(int i10, int i11, int i12, int i13) {
        m(getCurrentMraidWebViewController(), i10, i11, i12, i13);
    }

    public void M(int i10, int i11) {
        Rect rectK = this.f18018l.k();
        L(rectK.width(), rectK.height(), i10, i11);
    }

    public boolean O() {
        return this.f18008b == com.explorestack.iab.mraid.f.INTERSTITIAL;
    }

    public boolean P() {
        return this.f18012f.get();
    }

    public boolean Q() {
        return this.f18016j.get();
    }

    public boolean R() {
        return this.f18021o.x();
    }

    public boolean S() {
        return this.f18021o.z();
    }

    public void W(String str) {
        if (str == null) {
            e(b2.b.h("Html data are null"));
        } else {
            this.f18021o.j(this.f18009c, String.format("<script type='application/javascript'>%s</script>%s%s", p.m(), c2.a.b(), p.r(str)), "text/html", "UTF-8");
            this.f18021o.h(com.explorestack.iab.mraid.d.f());
        }
    }

    public void Y() {
        if (this.f18014h.compareAndSet(false, true) && P()) {
            G();
        }
    }

    public void Z(Runnable runnable) {
        r rVar = this.f18023q;
        if (rVar == null) {
            rVar = this.f18021o;
        }
        q qVarT = rVar.t();
        this.f18019m.a(this, qVarT).b(new b(qVarT, runnable));
    }

    @Nullable
    public com.explorestack.iab.mraid.e getLastOrientationProperties() {
        return this.f18021o.o();
    }

    @NonNull
    public l getMraidViewState() {
        return this.f18024r;
    }

    public WebView getWebView() {
        return this.f18021o.t();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f18017k.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @VisibleForTesting
    void setViewState(@NonNull l lVar) {
        this.f18024r = lVar;
        this.f18021o.e(lVar);
        r rVar = this.f18023q;
        if (rVar != null) {
            rVar.e(lVar);
        }
        if (lVar != l.HIDDEN) {
            Z(null);
        }
    }

    public void y() {
        setViewState(l.HIDDEN);
    }

    public void z() {
        r rVar = this.f18023q;
        if (rVar != null) {
            rVar.a();
            this.f18023q = null;
        } else {
            addView(this.f18021o.t());
        }
        setViewState(l.DEFAULT);
    }
}

package com.my.target;

import android.content.Context;
import android.view.View;
import com.ironsource.C4424m2;
import com.my.target.ca;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.VideoData;
import com.my.target.d;
import com.my.target.e3;
import com.my.target.h6;
import com.my.target.instreamads.InstreamAd;
import com.my.target.instreamads.InstreamAdPlayer;
import com.my.target.instreamads.InstreamAdVideoMotionPlayer;
import com.my.target.instreamads.postview.InstreamAdPostViewPlayer;
import com.my.target.j3;
import com.my.target.l;
import com.my.target.x3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstreamAd f59335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f59336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f59337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j3 f59338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x3 f59339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1 f59340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h6.a f59341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MenuFactory f59342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ca f59343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w3 f59344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k0 f59345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InstreamAd.InstreamAdBanner f59346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InstreamAd.InstreamAdVideoMotionBanner f59347m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f59349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f59350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f59351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f59352r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f59356v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f59357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f59358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f59359y;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d.a f59348n = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e3 f59353s = new e3(new b());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float[] f59354t = new float[0];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f59355u = 0;

    public class a implements d.a {
        public a() {
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            InstreamAd.InstreamAdListener listener = c3.this.f59335a.getListener();
            if (listener == null) {
                gb.a("InstreamAdEngine: can't call onBannerShouldClose callback, instreamAdListener is null");
                return;
            }
            if (c3.this.f59345k.C().equals("video-motion")) {
                gb.a("InstreamAdEngine: onVideoMotionBannerShouldClose called by adChoicesOption");
                c3 c3Var = c3.this;
                listener.onVideoMotionBannerShouldClose(c3Var.f59335a, c3Var.f59347m);
            } else {
                if (c3.this.f59345k.C().equals("video")) {
                    gb.a("InstreamAdEngine: onBannerShouldClose called by adChoicesOption");
                    listener.onBannerShouldClose();
                    return;
                }
                gb.a("InstreamAdEngine: ignore " + c3.this.f59345k.C() + " banner type for closing by adChoicesOption");
            }
        }
    }

    public class b implements e3.c {
        public b() {
        }

        @Override // com.my.target.e3.c
        public void a() {
            InstreamAd.InstreamAdListener listener;
            c3 c3Var = c3.this;
            if (c3Var.f59346l == null || (listener = c3Var.f59335a.getListener()) == null) {
                return;
            }
            listener.onPostViewComplete();
            c3 c3Var2 = c3.this;
            listener.onBannerComplete(c3Var2.f59335a, c3Var2.f59346l);
        }

        @Override // com.my.target.e3.c
        public void b() {
            c3 c3Var = c3.this;
            if (c3Var.f59346l == null) {
                return;
            }
            InstreamAd.InstreamAdListener listener = c3Var.f59335a.getListener();
            if (listener != null) {
                listener.onPostViewComplete();
                c3 c3Var2 = c3.this;
                listener.onBannerComplete(c3Var2.f59335a, c3Var2.f59346l);
            }
            c3.this.c();
        }

        @Override // com.my.target.e3.c
        public void onPostViewStart() {
            InstreamAd.InstreamAdListener listener = c3.this.f59335a.getListener();
            if (listener != null) {
                listener.onPostViewStart();
            }
        }
    }

    public static final class c implements ca.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fa f59362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e1 f59363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WeakReference f59364c;

        public c(fa faVar, e1 e1Var, Context context) {
            this.f59362a = faVar;
            this.f59363b = e1Var;
            this.f59364c = new WeakReference(context.getApplicationContext());
        }

        @Override // com.my.target.ca.a
        public void a(String str) {
            Context context = (Context) this.f59364c.get();
            if (context == null) {
                return;
            }
            q5.a("WebView error").f(str).d(this.f59362a.r()).b(context);
        }

        @Override // com.my.target.ca.a
        public void b(String str) {
            Context context = (Context) this.f59364c.get();
            if (context == null) {
                return;
            }
            this.f59363b.a(this.f59362a, str, 1, context);
        }
    }

    public class e implements x3.a {
        public e() {
        }

        @Override // com.my.target.x3.a
        public void a(tb tbVar) {
            c3 c3Var = c3.this;
            if (c3Var.f59344j == null || c3Var.f59345k != tbVar || c3Var.f59347m == null) {
                return;
            }
            InstreamAdPlayer player = c3Var.f59335a.getPlayer();
            if (player != null) {
                player.stopAdVideo();
            }
            InstreamAd.InstreamAdListener listener = c3.this.f59335a.getListener();
            if (listener != null) {
                c3 c3Var2 = c3.this;
                listener.onVideoMotionBannerComplete(c3Var2.f59335a, c3Var2.f59347m);
            }
            c3 c3Var3 = c3.this;
            if (c3Var3.f59355u == 0) {
                c3Var3.i();
            }
        }

        @Override // com.my.target.x3.a
        public void b(tb tbVar) {
            InstreamAd.InstreamAdListener listener;
            c3 c3Var = c3.this;
            if (c3Var.f59344j == null || c3Var.f59345k != tbVar || c3Var.f59347m == null || (listener = c3Var.f59335a.getListener()) == null) {
                return;
            }
            c3 c3Var2 = c3.this;
            listener.onVideoMotionBannerStart(c3Var2.f59335a, c3Var2.f59347m);
        }
    }

    public c3(InstreamAd instreamAd, h3 h3Var, j jVar, h6.a aVar, MenuFactory menuFactory) {
        this.f59335a = instreamAd;
        this.f59336b = h3Var;
        this.f59337c = jVar;
        this.f59341g = aVar;
        j3 j3VarI = j3.i();
        this.f59338d = j3VarI;
        j3VarI.a(new d());
        e1 e1VarA = e1.a();
        this.f59340f = e1VarA;
        x3 x3VarA = x3.a(e1VarA);
        this.f59339e = x3VarA;
        x3VarA.a(new e());
        this.f59342h = menuFactory;
    }

    public static c3 a(InstreamAd instreamAd, h3 h3Var, j jVar, h6.a aVar, MenuFactory menuFactory) {
        return new c3(instreamAd, h3Var, jVar, aVar, menuFactory);
    }

    public void b(Context context) {
        gb.a("InstreamAdEngine: handleAdChoicesClick called");
        f fVar = this.f59351q;
        if (fVar != null) {
            if (fVar.b()) {
                return;
            }
            this.f59351q.a(context);
            this.f59351q.a(this.f59348n);
            return;
        }
        gb.a("InstreamAdEngine: hasn't adChoicesOptions");
        if (this.f59352r != null) {
            gb.a("InstreamAdEngine: open adChoicesClickLink");
            y3.a(this.f59352r, context);
        }
    }

    public void c(String str) {
        m();
        w3 w3VarA = this.f59336b.a(str);
        this.f59344j = w3VarA;
        if (w3VarA == null) {
            gb.a("InstreamAdEngine: No section with name " + str);
            return;
        }
        this.f59338d.b(w3VarA.e());
        this.f59359y = this.f59344j.f();
        this.f59358x = -1;
        this.f59350p = this.f59344j.d();
        i();
    }

    public InstreamAdPlayer d() {
        return this.f59338d.e();
    }

    public float e() {
        return this.f59338d.f();
    }

    public void f() {
        if (this.f59345k == null) {
            gb.a("InstreamAdEngine: can't handle click - no playing banner");
            return;
        }
        Context contextD = this.f59338d.d();
        if (contextD == null) {
            gb.a("InstreamAdEngine: can't handle click - context is null");
        } else {
            this.f59340f.a(this.f59345k, 2, contextD);
        }
    }

    public boolean g() {
        return this.f59355u != 0;
    }

    public void h() {
        if (this.f59344j == null || this.f59353s.e()) {
            return;
        }
        this.f59338d.j();
    }

    public void i() {
        List list;
        List listA;
        b();
        w3 w3Var = this.f59344j;
        if (w3Var == null) {
            return;
        }
        if (this.f59359y == 0 || (list = this.f59350p) == null) {
            a(w3Var, this.f59356v);
            return;
        }
        int i10 = this.f59358x + 1;
        if (i10 >= list.size()) {
            a(this.f59344j, this.f59356v);
            return;
        }
        this.f59358x = i10;
        k0 k0Var = (k0) this.f59350p.get(i10);
        if ("statistics".equals(k0Var.C())) {
            a(k0Var, "playbackStarted");
            i();
            return;
        }
        int i11 = this.f59359y;
        if (i11 > 0) {
            this.f59359y = i11 - 1;
        }
        this.f59345k = k0Var;
        com.my.target.c cVarA = k0Var.a();
        if (cVarA != null) {
            this.f59352r = cVarA.b();
            listA = cVarA.a();
        } else {
            listA = null;
        }
        if (listA != null) {
            this.f59351q = f.a(listA, this.f59342h);
        }
        if (k0Var instanceof s5) {
            s5 s5Var = (s5) k0Var;
            if (s5Var.k0() instanceof VideoData) {
                this.f59346l = InstreamAd.InstreamAdBanner.a(k0Var);
                this.f59349o = new ArrayList(this.f59346l.companionBanners);
                this.f59338d.a(s5Var);
                return;
            }
            return;
        }
        if (!(k0Var instanceof tb)) {
            gb.a("InstreamAdEngine: failed play instreamAd banner, can't recognize type ");
            return;
        }
        tb tbVar = (tb) k0Var;
        InstreamAd.InstreamAdVideoMotionBanner instreamAdVideoMotionBannerA = InstreamAd.InstreamAdVideoMotionBanner.a(tbVar);
        this.f59347m = instreamAdVideoMotionBannerA;
        if (instreamAdVideoMotionBannerA == null) {
            gb.a("InstreamAdEngine: can't create instreamAdVideoMotionBanner");
        } else {
            this.f59339e.a(tbVar, instreamAdVideoMotionBannerA);
        }
    }

    public void j() {
        if (this.f59344j == null || this.f59353s.e()) {
            return;
        }
        this.f59338d.k();
    }

    public void k() {
        a(this.f59345k, "closedByUser");
        this.f59338d.m();
        m();
    }

    public void l() {
        a(this.f59345k, "closedByUser");
        this.f59338d.m();
        this.f59338d.l();
        if (this.f59353s.e()) {
            this.f59353s.a();
        }
        i();
    }

    public void m() {
        if (this.f59344j != null) {
            if (this.f59353s.e()) {
                this.f59353s.a();
            } else {
                this.f59338d.l();
            }
            a(this.f59344j);
        }
    }

    public void a(InstreamAdPlayer instreamAdPlayer) {
        this.f59338d.a(instreamAdPlayer);
    }

    public class d implements j3.a {
        public d() {
        }

        @Override // com.my.target.j3.a
        public void a(s5 s5Var) {
            InstreamAd.InstreamAdListener listener;
            c3 c3Var = c3.this;
            if (c3Var.f59344j == null || c3Var.f59345k != s5Var || c3Var.f59346l == null || (listener = c3Var.f59335a.getListener()) == null) {
                return;
            }
            c3 c3Var2 = c3.this;
            listener.onBannerResume(c3Var2.f59335a, c3Var2.f59346l);
        }

        @Override // com.my.target.j3.a
        public void b(s5 s5Var) {
            InstreamAd.InstreamAdListener listener;
            c3 c3Var = c3.this;
            if (c3Var.f59344j == null || c3Var.f59345k != s5Var || c3Var.f59346l == null || (listener = c3Var.f59335a.getListener()) == null) {
                return;
            }
            c3 c3Var2 = c3.this;
            listener.onBannerPause(c3Var2.f59335a, c3Var2.f59346l);
        }

        @Override // com.my.target.j3.a
        public void c(s5 s5Var) {
            c3 c3Var = c3.this;
            if (c3Var.f59344j == null || c3Var.f59345k != s5Var || c3Var.f59346l == null || c3Var.f59355u != 0) {
                return;
            }
            gb.a("InstreamAdEngine$VideoControllerListener: Ad shown, banner Id = " + s5Var.r());
            InstreamAd.InstreamAdListener listener = c3.this.f59335a.getListener();
            if (listener != null) {
                c3 c3Var2 = c3.this;
                listener.onBannerStart(c3Var2.f59335a, c3Var2.f59346l);
            }
        }

        @Override // com.my.target.j3.a
        public void d(s5 s5Var) {
            c3 c3Var = c3.this;
            if (c3Var.f59344j == null || c3Var.f59345k != s5Var || c3Var.f59346l == null) {
                return;
            }
            fa faVarZ = s5Var.Z();
            if (faVarZ != null && c3.this.g() && c3.this.f59343i != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jB = c3.this.f59343i.b();
                long jL = faVarZ.L();
                gb.a("InstreamAdEngine$VideoControllerListener: cm=" + jCurrentTimeMillis + ", vi=" + jB + ", it=" + jL);
                if (jCurrentTimeMillis - jB < jL) {
                    c3.this.a(faVarZ, "shoppableReplay");
                    c3.this.f59338d.a(s5Var, true);
                    return;
                } else {
                    c3.this.f59338d.l();
                    c3.this.f59355u = 2;
                }
            }
            InstreamAdPlayer player = c3.this.f59335a.getPlayer();
            if (player != null) {
                player.stopAdVideo();
            }
            u8 u8VarU = c3.this.f59345k.U();
            if (u8VarU != null && c3.this.f59353s.f()) {
                c3.this.f59353s.b(u8VarU);
                return;
            }
            InstreamAd.InstreamAdListener listener = c3.this.f59335a.getListener();
            if (listener != null) {
                c3 c3Var2 = c3.this;
                listener.onBannerComplete(c3Var2.f59335a, c3Var2.f59346l);
            }
            c3.this.c();
        }

        @Override // com.my.target.j3.a
        public void e(s5 s5Var) {
            InstreamAd.InstreamAdListener listener;
            c3 c3Var = c3.this;
            if (c3Var.f59344j == null || c3Var.f59345k != s5Var || c3Var.f59346l == null || (listener = c3Var.f59335a.getListener()) == null) {
                return;
            }
            c3 c3Var2 = c3.this;
            listener.onBannerComplete(c3Var2.f59335a, c3Var2.f59346l);
        }

        @Override // com.my.target.j3.a
        public void a(float f10, float f11, s5 s5Var) {
            InstreamAd.InstreamAdListener listener;
            c3 c3Var = c3.this;
            if (c3Var.f59344j == null || c3Var.f59345k != s5Var || c3Var.f59346l == null || (listener = c3Var.f59335a.getListener()) == null) {
                return;
            }
            listener.onBannerTimeLeftChange(f10, f11, c3.this.f59335a);
        }

        @Override // com.my.target.j3.a
        public void a(String str, s5 s5Var) {
            c3 c3Var = c3.this;
            if (c3Var.f59344j == null || c3Var.f59345k != s5Var || c3Var.f59346l == null) {
                return;
            }
            InstreamAd.InstreamAdListener listener = c3Var.f59335a.getListener();
            if (listener != null) {
                listener.onError(str, c3.this.f59335a);
            }
            c3.this.i();
        }
    }

    public void a(InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer) {
        this.f59339e.a(instreamAdVideoMotionPlayer);
    }

    public void a(float[] fArr) {
        this.f59354t = fArr;
    }

    public void a(int i10) {
        this.f59357w = i10;
    }

    public void a(boolean z10) {
        String str;
        if (z10) {
            str = "fullscreenOn";
        } else {
            str = "fullscreenOff";
        }
        a(this.f59345k, str);
    }

    public void a(String str) {
        a(str, "shoppableAdsItemClick");
        a(str, "click");
    }

    public void c(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context contextD = this.f59338d.d();
        if (contextD == null) {
            gb.a("can't handle show: context is null");
            return;
        }
        k1 k1VarA = a(instreamAdCompanionBanner);
        if (k1VarA == null) {
            gb.a("can't handle show: companion banner not found");
        } else {
            bb.b(k1VarA.x(), "playbackStarted", 1, contextD);
        }
    }

    public void b(InstreamAdPlayer instreamAdPlayer) {
        this.f59338d.b(instreamAdPlayer);
    }

    public void a(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner, Context context) {
        k1 k1VarA = a(instreamAdCompanionBanner);
        if (k1VarA == null) {
            gb.a("InstreamAdEngine: can't handle click - companion banner is null");
        } else {
            this.f59340f.a(k1VarA, 1, context);
        }
    }

    public void b(boolean z10) {
        k0 k0Var = this.f59345k;
        if (k0Var == null || k0Var.Z() == null) {
            return;
        }
        if (!z10 && this.f59355u == 2) {
            i();
        }
        this.f59355u = z10 ? 1 : 0;
        a(this.f59345k, z10 ? "shoppableOn" : "shoppableOff");
    }

    public void a() {
        this.f59338d.c();
        b();
    }

    public void c() {
        if (this.f59355u == 0) {
            i();
        }
    }

    public void a(float f10) {
        this.f59338d.b(f10);
    }

    public void b(float f10) {
        m();
        for (float f11 : this.f59354t) {
            if (Float.compare(f11, f10) == 0) {
                w3 w3VarA = this.f59336b.a("midroll");
                this.f59344j = w3VarA;
                if (w3VarA != null) {
                    this.f59338d.b(w3VarA.e());
                    this.f59359y = this.f59344j.f();
                    this.f59358x = -1;
                    this.f59356v = f10;
                    b(this.f59344j, f10);
                    return;
                }
                return;
            }
        }
        gb.a("InstreamAdEngine: Attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
    }

    public void a(InstreamAdPostViewPlayer instreamAdPostViewPlayer) {
        this.f59353s.a(instreamAdPostViewPlayer);
    }

    public View a(Context context) {
        ca caVar = this.f59343i;
        if (caVar != null) {
            return caVar.c();
        }
        k0 k0Var = this.f59345k;
        if (k0Var == null) {
            gb.a("InstreamAdEngine: no current banner");
            return null;
        }
        fa faVarZ = k0Var.Z();
        if (faVarZ == null) {
            gb.a("InstreamAdEngine: no shoppable banner");
            return null;
        }
        ca caVar2 = new ca(faVarZ, new ga(faVarZ, this.f59340f, this.f59345k.Y(), context), context);
        this.f59343i = caVar2;
        caVar2.a(new c(faVarZ, this.f59340f, context));
        return this.f59343i.c();
    }

    public void b(String str) {
        a(str, "shoppableAdsItemShow");
        a(str, C4424m2.f43623v);
    }

    public void b(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context contextD = this.f59338d.d();
        if (contextD == null) {
            gb.a("InstreamAdEngine: can't handle click - context is null");
        } else {
            a(instreamAdCompanionBanner, contextD);
        }
    }

    public void a(w3 w3Var, float f10) {
        u uVarJ = w3Var.j();
        if (uVarJ != null) {
            if ("midroll".equals(w3Var.h())) {
                uVarJ.c(true);
                uVarJ.b(f10);
                ArrayList arrayList = new ArrayList();
                arrayList.add(uVarJ);
                gb.a("InstreamAdEngine: Using doAfter service for point - " + f10);
                a(arrayList, w3Var, f10);
                return;
            }
            a(uVarJ, w3Var);
            return;
        }
        a(w3Var);
    }

    public void b() {
        this.f59355u = 0;
        ca caVar = this.f59343i;
        if (caVar == null) {
            return;
        }
        caVar.a();
        this.f59343i.a((ca.a) null);
        this.f59343i = null;
    }

    public void b(w3 w3Var, float f10) {
        ArrayList arrayList = new ArrayList();
        for (k0 k0Var : w3Var.d()) {
            if (k0Var.S() == f10) {
                arrayList.add(k0Var);
            }
        }
        int size = arrayList.size();
        if (size > 0 && this.f59358x < size - 1) {
            this.f59350p = arrayList;
            i();
            return;
        }
        ArrayList arrayListA = w3Var.a(f10);
        if (arrayListA.size() > 0) {
            a(arrayListA, w3Var, f10);
            return;
        }
        gb.a("InstreamAdEngine: There is no one midpoint service for point - " + f10);
        a(w3Var, f10);
    }

    public void a(w3 w3Var) {
        if (w3Var != this.f59344j) {
            return;
        }
        b();
        if ("midroll".equals(w3Var.h())) {
            this.f59344j.b(this.f59359y);
        }
        this.f59344j = null;
        this.f59345k = null;
        this.f59346l = null;
        this.f59347m = null;
        this.f59358x = -1;
        InstreamAd.InstreamAdListener listener = this.f59335a.getListener();
        if (listener != null) {
            listener.onComplete(w3Var.h(), this.f59335a);
        }
    }

    public void a(u uVar, final w3 w3Var) {
        Context contextD = this.f59338d.d();
        if (contextD == null) {
            gb.a("InstreamAdEngine: Can't load doAfter service: context is null");
            return;
        }
        gb.a("InstreamAdEngine: Loading doAfter service - " + uVar.f60846b);
        d3.a(uVar, this.f59337c, this.f59341g, this.f59357w).a(new l.b() { // from class: k5.r
            @Override // com.my.target.l.b
            public final void a(com.my.target.t tVar, com.my.target.m mVar) {
                this.f86121a.b(w3Var, (com.my.target.h3) tVar, mVar);
            }
        }).a(this.f59341g.a(), contextD);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(w3 w3Var, h3 h3Var, m mVar) {
        if (h3Var == null) {
            if (mVar != null) {
                gb.a("InstreamAdEngine: Loading doAfter service failed - " + mVar.f60118b);
            }
            if (w3Var == this.f59344j) {
                a(w3Var, this.f59356v);
                return;
            }
            return;
        }
        w3 w3VarA = h3Var.a(w3Var.h());
        if (w3VarA != null) {
            w3Var.a(w3VarA);
        }
        if (w3Var == this.f59344j) {
            this.f59350p = w3Var.d();
            i();
        }
    }

    public void a(ArrayList arrayList, final w3 w3Var, final float f10) {
        Context contextD = this.f59338d.d();
        if (contextD == null) {
            gb.a("InstreamAdEngine: can't load midpoint services - context is null");
            return;
        }
        gb.a("InstreamAdEngine: Loading midpoint services for point - " + f10);
        d3.a(arrayList, this.f59337c, this.f59341g, this.f59357w).a(new l.b() { // from class: k5.q
            @Override // com.my.target.l.b
            public final void a(com.my.target.t tVar, com.my.target.m mVar) {
                this.f86116a.a(w3Var, f10, (com.my.target.h3) tVar, mVar);
            }
        }).a(this.f59341g.a(), contextD);
    }

    public void a(w3 w3Var, h3 h3Var, IAdLoadingError iAdLoadingError, float f10) {
        if (h3Var == null) {
            if (iAdLoadingError != null) {
                gb.a("InstreamAdEngine: loading midpoint services failed - " + iAdLoadingError);
            }
            if (w3Var == this.f59344j && f10 == this.f59356v) {
                a(w3Var, f10);
                return;
            }
            return;
        }
        w3 w3VarA = h3Var.a(w3Var.h());
        if (w3VarA != null) {
            w3Var.a(w3VarA);
        }
        if (w3Var == this.f59344j && f10 == this.f59356v) {
            b(w3Var, f10);
        }
    }

    public void a(String str, String str2) {
        Context contextD = this.f59338d.d();
        if (contextD == null) {
            gb.a("InstreamAdEngine: Can't send stat - context is null");
            return;
        }
        k0 k0Var = this.f59345k;
        if (k0Var == null) {
            gb.a("InstreamAdEngine: hasn't current banner");
            return;
        }
        da daVarY = k0Var.Y();
        if (daVarY == null) {
            gb.a("InstreamAdEngine: hasn't shoppableAdsData");
            return;
        }
        for (b4 b4Var : daVarY.a()) {
            if (str.equals(b4Var.f59433id)) {
                bb.b(b4Var.f59279a, str2, -1, contextD);
                bb.b(daVarY.b(), str2, -1, contextD);
                return;
            }
        }
        gb.a("InstreamAdEngine: wrong shoppableAdsItemId");
    }

    public void a(com.my.target.b bVar, String str) {
        if (bVar == null) {
            gb.a("InstreamAdEngine: Can't send stat - banner is null");
            return;
        }
        Context contextD = this.f59338d.d();
        if (contextD == null) {
            gb.a("InstreamAdEngine: Can't send stat - context is null");
        } else {
            bb.b(bVar.x(), str, 1, contextD);
        }
    }

    public k1 a(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        k0 k0Var;
        if (this.f59349o != null && this.f59346l != null && (k0Var = this.f59345k) != null) {
            ArrayList arrayListP = k0Var.P();
            int iIndexOf = this.f59349o.indexOf(instreamAdCompanionBanner);
            if (iIndexOf >= 0 && iIndexOf < arrayListP.size()) {
                return (k1) arrayListP.get(iIndexOf);
            }
            gb.a("InstreamAdEngine: can't find companion banner - provided instreamAdCompanionBanner not found in current playing banner");
            return null;
        }
        gb.a("InstreamAdEngine: can't find companion banner - no playing banner");
        return null;
    }
}

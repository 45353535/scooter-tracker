package com.my.target;

import android.content.Context;
import com.my.target.b3;
import com.my.target.common.menu.MenuFactory;
import com.my.target.d;
import com.my.target.h6;
import com.my.target.instreamads.InstreamAudioAd;
import com.my.target.instreamads.InstreamAudioAdPlayer;
import com.my.target.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstreamAudioAd f60020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MenuFactory f60021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3 f60022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f60023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h6.a f60024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b3 f60025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f60026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f60027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f60028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v5 f60029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s5 f60030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InstreamAudioAd.InstreamAudioAdBanner f60031l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f60033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f60034o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f60036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f60037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f60038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f60039t;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d.a f60032m = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float[] f60035p = new float[0];

    public class a implements d.a {
        public a() {
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            InstreamAudioAd.InstreamAudioAdListener listener = l3.this.f60020a.getListener();
            if (listener != null) {
                l3 l3Var = l3.this;
                listener.onBannerShouldClose(l3Var.f60020a, l3Var.f60031l);
                gb.a("InstreamAudioAdEngine: onBannerShouldClose called by adChoicesOption");
            }
        }
    }

    public l3(InstreamAudioAd instreamAudioAd, p3 p3Var, j jVar, h6.a aVar, MenuFactory menuFactory) {
        this.f60020a = instreamAudioAd;
        this.f60022c = p3Var;
        this.f60023d = jVar;
        this.f60024e = aVar;
        b3 b3VarH = b3.h();
        this.f60025f = b3VarH;
        b3VarH.a(new b());
        this.f60026g = e1.a();
        this.f60021b = menuFactory;
    }

    public static l3 a(InstreamAudioAd instreamAudioAd, p3 p3Var, j jVar, h6.a aVar, MenuFactory menuFactory) {
        return new l3(instreamAudioAd, p3Var, jVar, aVar, menuFactory);
    }

    public void b(float f10) {
        k();
        for (float f11 : this.f60035p) {
            if (Float.compare(f11, f10) == 0) {
                v5 v5VarA = this.f60022c.a("midroll");
                this.f60029j = v5VarA;
                if (v5VarA != null) {
                    this.f60025f.a(v5VarA.e());
                    this.f60039t = this.f60029j.f();
                    this.f60038s = -1;
                    this.f60036q = f10;
                    b(this.f60029j, f10);
                    return;
                }
                return;
            }
        }
        gb.a("InstreamAudioAdEngine: Attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
    }

    public InstreamAudioAdPlayer c() {
        return this.f60025f.e();
    }

    public float d() {
        return this.f60025f.f();
    }

    public void e() {
        if (this.f60030k == null) {
            gb.a("InstreamAudioAdEngine: can't handle click - no playing banner");
            return;
        }
        Context contextD = this.f60025f.d();
        if (contextD == null) {
            gb.a("InstreamAudioAdEngine: can't handle click - context is null");
        } else {
            this.f60026g.a(this.f60030k, 1, contextD);
        }
    }

    public void f() {
        if (this.f60029j != null) {
            this.f60025f.i();
        }
    }

    public void g() {
        List list;
        List listA;
        v5 v5Var = this.f60029j;
        if (v5Var == null) {
            return;
        }
        if (this.f60039t == 0 || (list = this.f60034o) == null) {
            a(v5Var, this.f60036q);
            return;
        }
        int i10 = this.f60038s + 1;
        if (i10 >= list.size()) {
            a(this.f60029j, this.f60036q);
            return;
        }
        this.f60038s = i10;
        s5 s5Var = (s5) this.f60034o.get(i10);
        if ("statistics".equals(s5Var.C())) {
            a(s5Var, "playbackStarted");
            g();
            return;
        }
        int i11 = this.f60039t;
        if (i11 > 0) {
            this.f60039t = i11 - 1;
        }
        this.f60030k = s5Var;
        this.f60031l = InstreamAudioAd.InstreamAudioAdBanner.a(s5Var);
        this.f60033n = new ArrayList(this.f60031l.companionBanners);
        c cVarA = this.f60030k.a();
        if (cVarA != null) {
            this.f60028i = cVarA.b();
            listA = cVarA.a();
        } else {
            listA = null;
        }
        if (listA != null) {
            this.f60027h = f.a(listA, this.f60021b);
        }
        this.f60025f.a(s5Var);
    }

    public void h() {
        if (this.f60029j != null) {
            this.f60025f.j();
        }
    }

    public void i() {
        a(this.f60030k, "closedByUser");
        k();
    }

    public void j() {
        a(this.f60030k, "closedByUser");
        this.f60025f.k();
        g();
    }

    public void k() {
        if (this.f60029j != null) {
            this.f60025f.k();
            a(this.f60029j);
        }
    }

    public void a(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        this.f60025f.a(instreamAudioAdPlayer);
    }

    public void c(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context contextD = this.f60025f.d();
        if (contextD == null) {
            gb.a("InstreamAudioAdEngine: Can't handle show - context is null");
            return;
        }
        k1 k1VarA = a(instreamAdCompanionBanner);
        if (k1VarA == null) {
            gb.a("InstreamAudioAdEngine: Can't handle show - companion banner not found");
        } else {
            bb.b(k1VarA.x(), "playbackStarted", 1, contextD);
        }
    }

    public void a(float[] fArr) {
        this.f60035p = fArr;
    }

    public class b implements b3.b {
        public b() {
        }

        @Override // com.my.target.b3.b
        public void a(s5 s5Var) {
            l3 l3Var = l3.this;
            if (l3Var.f60029j == null || l3Var.f60030k != s5Var || l3Var.f60031l == null) {
                return;
            }
            InstreamAudioAd.InstreamAudioAdListener listener = l3Var.f60020a.getListener();
            if (listener != null) {
                l3 l3Var2 = l3.this;
                listener.onBannerComplete(l3Var2.f60020a, l3Var2.f60031l);
            }
            l3.this.g();
        }

        @Override // com.my.target.b3.b
        public void b(s5 s5Var) {
            InstreamAudioAd.InstreamAudioAdListener listener;
            l3 l3Var = l3.this;
            if (l3Var.f60029j == null || l3Var.f60030k != s5Var || l3Var.f60031l == null || (listener = l3Var.f60020a.getListener()) == null) {
                return;
            }
            l3 l3Var2 = l3.this;
            listener.onBannerComplete(l3Var2.f60020a, l3Var2.f60031l);
        }

        @Override // com.my.target.b3.b
        public void c(s5 s5Var) {
            l3 l3Var = l3.this;
            if (l3Var.f60029j == null || l3Var.f60030k != s5Var || l3Var.f60031l == null) {
                return;
            }
            gb.a("InstreamAudioAdEngine: Ad shown, banner Id = " + s5Var.r());
            InstreamAudioAd.InstreamAudioAdListener listener = l3.this.f60020a.getListener();
            if (listener != null) {
                l3 l3Var2 = l3.this;
                listener.onBannerStart(l3Var2.f60020a, l3Var2.f60031l);
            }
        }

        @Override // com.my.target.b3.b
        public void a(float f10, float f11, s5 s5Var) {
            InstreamAudioAd.InstreamAudioAdListener listener;
            l3 l3Var = l3.this;
            if (l3Var.f60029j == null || l3Var.f60030k != s5Var || l3Var.f60031l == null || (listener = l3Var.f60020a.getListener()) == null) {
                return;
            }
            listener.onBannerTimeLeftChange(f10, f11, l3.this.f60020a);
        }

        @Override // com.my.target.b3.b
        public void a(String str, s5 s5Var) {
            l3 l3Var = l3.this;
            if (l3Var.f60029j == null || l3Var.f60030k != s5Var) {
                return;
            }
            InstreamAudioAd.InstreamAudioAdListener listener = l3Var.f60020a.getListener();
            if (listener != null) {
                listener.onError(str, l3.this.f60020a);
            }
            l3.this.g();
        }
    }

    public void a(int i10) {
        this.f60037r = i10;
    }

    public void a(String str) {
        k();
        v5 v5VarA = this.f60022c.a(str);
        this.f60029j = v5VarA;
        if (v5VarA != null) {
            this.f60025f.a(v5VarA.e());
            this.f60039t = this.f60029j.f();
            this.f60038s = -1;
            this.f60034o = this.f60029j.d();
            g();
            return;
        }
        gb.a("InstreamAudioAdEngine: No section with name " + str);
    }

    public void b(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context contextD = this.f60025f.d();
        if (contextD == null) {
            gb.a("InstreamAudioAdEngine: Can't handle click - context is null");
            return;
        }
        k1 k1VarA = a(instreamAdCompanionBanner);
        if (k1VarA == null) {
            gb.a("InstreamAudioAdEngine: Can't handle click - companion banner not found");
        } else {
            this.f60026g.a(k1VarA, 1, contextD);
        }
    }

    public void a(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner, Context context) {
        k1 k1VarA = a(instreamAdCompanionBanner);
        if (k1VarA == null) {
            gb.a("InstreamAudioAdEngine: Can't handle click - companion banner not found");
        } else {
            this.f60026g.a(k1VarA, 1, context);
        }
    }

    public void a() {
        this.f60025f.c();
    }

    public InstreamAudioAd.InstreamAudioAdBanner b() {
        return this.f60031l;
    }

    public void a(float f10) {
        this.f60025f.c(f10);
    }

    public final void b(v5 v5Var, float f10) {
        ArrayList arrayList = new ArrayList();
        for (s5 s5Var : v5Var.d()) {
            if (s5Var.S() == f10) {
                arrayList.add(s5Var);
            }
        }
        int size = arrayList.size();
        if (size > 0 && this.f60038s < size - 1) {
            this.f60034o = arrayList;
            g();
            return;
        }
        ArrayList arrayListA = v5Var.a(f10);
        if (arrayListA.size() > 0) {
            a(arrayListA, v5Var, f10);
            return;
        }
        gb.a("InstreamAudioAdEngine: There is no one midpoint service for point - " + f10);
        a(v5Var, f10);
    }

    public void a(Context context) {
        gb.a("InstreamAudioAdEngine: handleAdChoicesClick called");
        f fVar = this.f60027h;
        if (fVar == null) {
            gb.a("InstreamAudioAdEngine: hasn't adChoicesOptions");
            if (this.f60028i != null) {
                gb.a("InstreamAudioAdEngine: open adChoicesClickLink");
                y3.a(this.f60028i, context);
                return;
            }
            return;
        }
        if (fVar.b()) {
            return;
        }
        this.f60027h.a(context);
        this.f60027h.a(this.f60032m);
    }

    public final void a(v5 v5Var, float f10) {
        u uVarJ = v5Var.j();
        if (uVarJ != null) {
            if ("midroll".equals(v5Var.h())) {
                uVarJ.c(true);
                uVarJ.b(f10);
                ArrayList arrayList = new ArrayList();
                arrayList.add(uVarJ);
                gb.a("InstreamAudioAdEngine: Using doAfter service for point - " + f10);
                a(arrayList, v5Var, f10);
                return;
            }
            a(uVarJ, v5Var);
            return;
        }
        a(v5Var);
    }

    public final void a(v5 v5Var) {
        if (v5Var == this.f60029j) {
            if ("midroll".equals(v5Var.h())) {
                this.f60029j.b(this.f60039t);
            }
            this.f60029j = null;
            this.f60030k = null;
            this.f60031l = null;
            this.f60038s = -1;
            InstreamAudioAd.InstreamAudioAdListener listener = this.f60020a.getListener();
            if (listener != null) {
                listener.onComplete(v5Var.h(), this.f60020a);
            }
        }
    }

    public final void a(u uVar, final v5 v5Var) {
        Context contextD = this.f60025f.d();
        if (contextD == null) {
            gb.a("InstreamAudioAdEngine: Can't load doAfter service - context is null");
            return;
        }
        gb.a("InstreamAudioAdEngine: Loading doAfter service - " + uVar.f60846b);
        m3.a(uVar, this.f60023d, this.f60024e, this.f60037r).a(new l.b() { // from class: k5.f1
            @Override // com.my.target.l.b
            public final void a(com.my.target.t tVar, com.my.target.m mVar) {
                this.f86028a.b(v5Var, (com.my.target.p3) tVar, mVar);
            }
        }).a(this.f60024e.a(), contextD);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(v5 v5Var, p3 p3Var, m mVar) {
        if (p3Var == null) {
            if (mVar != null) {
                gb.a("InstreamAudioAdEngine: Loading doAfter service failed - " + mVar.f60118b);
            }
            if (v5Var == this.f60029j) {
                a(v5Var, this.f60036q);
                return;
            }
            return;
        }
        v5 v5VarA = p3Var.a(v5Var.h());
        if (v5VarA != null) {
            v5Var.a(v5VarA);
        }
        if (v5Var == this.f60029j) {
            this.f60034o = v5Var.d();
            g();
        }
    }

    public final void a(ArrayList arrayList, final v5 v5Var, final float f10) {
        Context contextD = this.f60025f.d();
        if (contextD == null) {
            gb.a("InstreamAudioAdEngine: Can't load midpoint services - context is null");
            return;
        }
        gb.a("InstreamAudioAdEngine: Loading midpoint services for point - " + f10);
        m3.a(arrayList, this.f60023d, this.f60024e, this.f60037r).a(new l.b() { // from class: k5.g1
            @Override // com.my.target.l.b
            public final void a(com.my.target.t tVar, com.my.target.m mVar) {
                this.f86039a.a(v5Var, f10, (com.my.target.p3) tVar, mVar);
            }
        }).a(this.f60024e.a(), contextD);
    }

    public final void a(v5 v5Var, p3 p3Var, m mVar, float f10) {
        if (p3Var == null) {
            if (mVar != null) {
                gb.a("InstreamAudioAdEngine: Loading midpoint services failed - " + mVar.f60118b);
            }
            if (v5Var == this.f60029j && f10 == this.f60036q) {
                a(v5Var, f10);
                return;
            }
            return;
        }
        v5 v5VarA = p3Var.a(v5Var.h());
        if (v5VarA != null) {
            v5Var.a(v5VarA);
        }
        if (v5Var == this.f60029j && f10 == this.f60036q) {
            b(v5Var, f10);
        }
    }

    public final void a(s5 s5Var, String str) {
        if (s5Var == null) {
            gb.a("InstreamAudioAdEngine: Can't send stat: banner is null");
            return;
        }
        Context contextD = this.f60025f.d();
        if (contextD == null) {
            gb.a("InstreamAudioAdEngine: Can't send stat: context is null");
        } else {
            bb.b(s5Var.x(), str, -1, contextD);
        }
    }

    public final k1 a(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        s5 s5Var;
        if (this.f60033n != null && this.f60031l != null && (s5Var = this.f60030k) != null) {
            ArrayList arrayListP = s5Var.P();
            int iIndexOf = this.f60033n.indexOf(instreamAdCompanionBanner);
            if (iIndexOf >= 0 && iIndexOf < arrayListP.size()) {
                return (k1) arrayListP.get(iIndexOf);
            }
            gb.a("InstreamAudioAdEngine: Can't find companion banner - provided instreamAdCompanionBanner not found in current playing banner");
            return null;
        }
        gb.a("InstreamAudioAdEngine: Can't find companion banner - no playing banner");
        return null;
    }
}

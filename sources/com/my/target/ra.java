package com.my.target;

import android.app.Activity;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.h6;
import com.my.target.l;
import com.my.target.ua;
import com.my.target.v2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MyTargetView f60753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f60754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f60755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f60756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h6.a f60757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v2 f60758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f60759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f60760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f60761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f60762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f60763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f60764l;

    public static class a implements v2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ra f60765a;

        public a(ra raVar) {
            this.f60765a = raVar;
        }

        @Override // com.my.target.v2.a
        public void a() {
            this.f60765a.i();
        }

        @Override // com.my.target.v2.a
        public void b() {
            this.f60765a.h();
        }

        @Override // com.my.target.v2.a
        public void c() {
            this.f60765a.e();
        }

        @Override // com.my.target.v2.a
        public void d() {
            this.f60765a.f();
        }

        @Override // com.my.target.v2.a
        public void e() {
            this.f60765a.g();
        }

        @Override // com.my.target.v2.a
        public void f() {
            this.f60765a.j();
        }

        @Override // com.my.target.v2.a
        public void a(IAdLoadingError iAdLoadingError) {
            this.f60765a.a(iAdLoadingError);
        }

        @Override // com.my.target.v2.a
        public void a(q5 q5Var) {
            this.f60765a.a(q5Var);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f60766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f60767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f60768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f60769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f60770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f60771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f60772g;

        public boolean a() {
            if (this.f60767b || !this.f60766a) {
                return false;
            }
            return this.f60772g || !this.f60770e;
        }

        public boolean b() {
            if (this.f60768c && this.f60766a) {
                return (this.f60772g || this.f60770e) && !this.f60771f && this.f60767b;
            }
            return false;
        }

        public boolean c() {
            if (this.f60769d && this.f60768c) {
                return (this.f60772g || this.f60770e) && !this.f60766a;
            }
            return false;
        }

        public void d(boolean z10) {
            this.f60770e = z10;
        }

        public boolean e() {
            return this.f60767b;
        }

        public void f() {
            this.f60771f = false;
            this.f60768c = false;
        }

        public void g(boolean z10) {
            this.f60766a = z10;
            this.f60767b = false;
        }

        public void a(boolean z10) {
            this.f60769d = z10;
        }

        public void b(boolean z10) {
            this.f60771f = z10;
        }

        public void c(boolean z10) {
            this.f60772g = z10;
        }

        public boolean d() {
            return this.f60766a;
        }

        public void e(boolean z10) {
            this.f60768c = z10;
        }

        public void f(boolean z10) {
            this.f60767b = z10;
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f60773a;

        public c(ra raVar) {
            this.f60773a = new WeakReference(raVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            ra raVar = (ra) this.f60773a.get();
            if (raVar != null) {
                raVar.l();
            }
        }
    }

    public ra(MyTargetView myTargetView, j jVar, h6.a aVar) {
        b bVar = new b();
        this.f60755c = bVar;
        this.f60759g = true;
        this.f60761i = -1;
        this.f60764l = 0;
        this.f60753a = myTargetView;
        this.f60754b = jVar;
        this.f60757e = aVar;
        this.f60756d = new c(this);
        if (myTargetView.getContext() instanceof Activity) {
            bVar.c(false);
        } else {
            gb.a("StandardAdMasterEngine: MyTargetView was created with non-activity focus, so system cannot automatically handle lifecycle");
            bVar.c(true);
        }
    }

    public static ra a(MyTargetView myTargetView, j jVar, h6.a aVar) {
        return new ra(myTargetView, jVar, aVar);
    }

    public void b(ua uaVar) {
        if (this.f60755c.d()) {
            q();
        }
        m();
        a(uaVar);
        v2 v2Var = this.f60758f;
        if (v2Var == null) {
            return;
        }
        v2Var.a(new a(this));
        this.f60762j = System.currentTimeMillis() + ((long) this.f60761i);
        this.f60763k = 0L;
        if (this.f60760h && this.f60755c.e()) {
            this.f60763k = this.f60761i;
        }
        this.f60758f.prepare();
    }

    public float c() {
        v2 v2Var = this.f60758f;
        if (v2Var != null) {
            return v2Var.b();
        }
        return 0.0f;
    }

    public final void d() {
        r();
        m();
    }

    public final void e() {
        MyTargetView.MyTargetViewListener listener = this.f60753a.getListener();
        if (listener != null) {
            listener.onClick(this.f60753a);
        }
    }

    public void f() {
        this.f60755c.b(false);
        if (this.f60755c.b()) {
            n();
        }
    }

    public void g() {
        m();
    }

    public void h() {
        if (this.f60755c.a()) {
            k();
        }
        this.f60755c.b(true);
    }

    public void i() {
        if (this.f60759g) {
            this.f60755c.e(true);
            MyTargetView.MyTargetViewListener listener = this.f60753a.getListener();
            if (listener != null) {
                listener.onLoad(this.f60753a);
            }
            this.f60759g = false;
        }
        if (this.f60755c.c()) {
            p();
        }
    }

    public final void j() {
        MyTargetView.MyTargetViewListener listener = this.f60753a.getListener();
        if (listener != null) {
            listener.onShow(this.f60753a);
        }
    }

    public void k() {
        r();
        if (this.f60760h) {
            this.f60763k = this.f60762j - System.currentTimeMillis();
        }
        v2 v2Var = this.f60758f;
        if (v2Var != null) {
            v2Var.pause();
        }
        this.f60755c.f(true);
    }

    public void l() {
        gb.a("StandardAdMasterEngine: Load new standard ad");
        qa.a(this.f60754b, this.f60757e).a(new l.b() { // from class: k5.e2
            @Override // com.my.target.l.b
            public final void a(com.my.target.t tVar, com.my.target.m mVar) {
                this.f86025a.a((ua) tVar, mVar);
            }
        }).a(this.f60757e.a(), this.f60753a.getContext());
    }

    public void m() {
        v2 v2Var = this.f60758f;
        if (v2Var != null) {
            v2Var.destroy();
            this.f60758f.a((v2.a) null);
            this.f60758f = null;
        }
        this.f60753a.removeAllViews();
    }

    public void n() {
        if (this.f60763k > 0 && this.f60760h) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.f60763k;
            this.f60762j = jCurrentTimeMillis + j10;
            this.f60753a.postDelayed(this.f60756d, j10);
            this.f60763k = 0L;
        }
        v2 v2Var = this.f60758f;
        if (v2Var != null) {
            v2Var.resume();
        }
        this.f60755c.f(false);
    }

    public void o() {
        if (!this.f60760h || this.f60761i <= 0) {
            return;
        }
        r();
        this.f60753a.postDelayed(this.f60756d, this.f60761i);
    }

    public void p() {
        int i10 = this.f60761i;
        if (i10 > 0 && this.f60760h) {
            this.f60753a.postDelayed(this.f60756d, i10);
        }
        v2 v2Var = this.f60758f;
        if (v2Var != null) {
            v2Var.start();
        }
        this.f60755c.g(true);
    }

    public void q() {
        this.f60755c.g(false);
        r();
        v2 v2Var = this.f60758f;
        if (v2Var != null) {
            v2Var.stop();
        }
    }

    public void r() {
        this.f60753a.removeCallbacks(this.f60756d);
    }

    public void a(boolean z10) {
        this.f60755c.a(z10);
        this.f60755c.d(this.f60753a.hasWindowFocus());
        if (this.f60755c.c()) {
            p();
        } else {
            if (z10 || !this.f60755c.d()) {
                return;
            }
            q();
        }
    }

    public void a() {
        if (this.f60755c.d()) {
            q();
        }
        this.f60755c.f();
        m();
    }

    public void a(MyTargetView.AdSize adSize) {
        v2 v2Var = this.f60758f;
        if (v2Var != null) {
            v2Var.a(adSize);
        }
    }

    public void b(boolean z10) {
        this.f60755c.d(z10);
        if (this.f60755c.c()) {
            p();
        } else if (this.f60755c.b()) {
            n();
        } else if (this.f60755c.a()) {
            k();
        }
    }

    public final /* synthetic */ void a(ua uaVar, m mVar) {
        if (uaVar != null) {
            b(uaVar);
        } else {
            gb.a("StandardAdMasterEngine: No new ad");
            o();
        }
    }

    public void a(IAdLoadingError iAdLoadingError) {
        if (this.f60759g) {
            this.f60755c.e(false);
            MyTargetView.MyTargetViewListener listener = this.f60753a.getListener();
            if (listener != null) {
                listener.onNoAd(iAdLoadingError, this.f60753a);
            }
            this.f60759g = false;
            return;
        }
        m();
        o();
    }

    public String b() {
        v2 v2Var = this.f60758f;
        if (v2Var != null) {
            return v2Var.a();
        }
        return null;
    }

    public final void a(ua uaVar) {
        this.f60760h = uaVar.d() && this.f60754b.l() && !this.f60754b.h().equals("standard_300x250");
        na naVarC = uaVar.c();
        if (naVarC == null) {
            x5 x5VarB = uaVar.b();
            if (x5VarB == null) {
                MyTargetView.MyTargetViewListener listener = this.f60753a.getListener();
                if (listener != null) {
                    listener.onNoAd(m.f60116u, this.f60753a);
                    return;
                }
                return;
            }
            this.f60758f = g6.a(this.f60753a, x5VarB, this.f60754b, this.f60757e);
            if (this.f60760h) {
                int iA = x5VarB.a() * 1000;
                this.f60761i = iA;
                this.f60760h = iA > 0;
                return;
            }
            return;
        }
        this.f60758f = pa.a(this.f60753a, naVarC, this.f60757e);
        this.f60761i = naVarC.N() * 1000;
    }

    public void a(q5 q5Var) {
        if (q5Var != null) {
            q5Var.a(this.f60754b.i()).b(this.f60753a.getContext());
        }
        this.f60764l++;
        gb.b("WebView crashed " + this.f60764l + " times");
        if (this.f60764l > 2) {
            gb.a("No more try to reload ad, notify user...");
            d();
            MyTargetView.MyTargetViewRenderCrashListener renderCrashListener = this.f60753a.getRenderCrashListener();
            if (renderCrashListener != null) {
                renderCrashListener.onViewRenderCrash(this.f60753a);
                return;
            }
            return;
        }
        gb.a("Try reload ad without notifying user");
        l();
    }
}

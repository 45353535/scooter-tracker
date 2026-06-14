package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.ads.MyTargetView;
import com.my.target.bc;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.d;
import com.my.target.h6;
import com.my.target.l8;
import com.my.target.q6;
import com.my.target.v2;
import com.my.target.wa;
import com.my.target.xa;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class pa implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l8 f60537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MyTargetView f60538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na f60539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f60540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wa.a f60541e = new c(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ab f60542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bc f60543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yb f60544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.my.target.d f60545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h6.a f60546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public wa f60547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v2.a f60548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f60549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h6 f60550n;

    public class a extends bc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.my.target.b f60551a;

        public a(com.my.target.b bVar) {
            this.f60551a = bVar;
        }

        @Override // com.my.target.bc.a
        public void a() {
            gb.a("StandardAdEngine: Ad shown, banner Id = " + this.f60551a.r());
            h6 h6Var = pa.this.f60550n;
            if (h6Var != null) {
                h6Var.b();
                pa paVar = pa.this;
                paVar.f60550n.b(paVar.f60540d);
            }
            v2.a aVar = pa.this.f60548l;
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    public class b implements d.a {
        public b() {
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            pa.this.c();
        }
    }

    public static class c implements wa.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pa f60554a;

        public c(pa paVar) {
            this.f60554a = paVar;
        }

        @Override // com.my.target.wa.a
        public void a(com.my.target.b bVar, String str) {
            this.f60554a.a(bVar, str);
        }

        @Override // com.my.target.wa.a
        public void a(com.my.target.b bVar) {
            this.f60554a.a(bVar);
        }

        @Override // com.my.target.wa.a
        public void a(WebView webView) {
            this.f60554a.a(webView);
        }

        @Override // com.my.target.wa.a
        public void a(q5 q5Var) {
            this.f60554a.a(q5Var);
        }
    }

    public static class d implements xa.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pa f60555a;

        public d(pa paVar) {
            this.f60555a = paVar;
        }

        @Override // com.my.target.xa.a
        public void a() {
            this.f60555a.f();
        }

        @Override // com.my.target.xa.a
        public void a(IAdLoadingError iAdLoadingError) {
            this.f60555a.a(iAdLoadingError);
        }
    }

    public static class e implements q6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pa f60556a;

        public e(pa paVar) {
            this.f60556a = paVar;
        }

        @Override // com.my.target.q6.c
        public void a() {
            this.f60556a.f();
        }

        @Override // com.my.target.q6.c
        public void b() {
            this.f60556a.e();
        }

        @Override // com.my.target.q6.c
        public void d() {
            this.f60556a.d();
        }

        @Override // com.my.target.q6.c
        public void a(IAdLoadingError iAdLoadingError) {
            this.f60556a.a(iAdLoadingError);
        }

        @Override // com.my.target.q6.c
        public void a(String str, na naVar, Context context) {
            this.f60556a.a(str, naVar, context);
        }

        @Override // com.my.target.q6.c
        public void a(float f10, float f11, na naVar, Context context) {
            this.f60556a.a(f10, f11, context);
        }
    }

    public pa(MyTargetView myTargetView, na naVar, h6.a aVar) {
        this.f60538b = myTargetView;
        this.f60539c = naVar;
        this.f60540d = myTargetView.getContext();
        this.f60546j = aVar;
        this.f60542f = naVar.x().b();
        this.f60543g = bc.b(naVar.E(), naVar.x());
        this.f60544h = yb.a(naVar.x());
        this.f60545i = com.my.target.d.a(naVar.a());
        this.f60537a = l8.a(naVar, 1, null, myTargetView.getContext());
    }

    public static pa a(MyTargetView myTargetView, na naVar, h6.a aVar) {
        return new pa(myTargetView, naVar, aVar);
    }

    @Override // com.my.target.v2
    public float b() {
        return 0.0f;
    }

    public void c() {
        bb.b(this.f60539c.x(), "closedByUser", -1, this.f60540d);
        v2.a aVar = this.f60548l;
        if (aVar == null) {
            return;
        }
        aVar.e();
    }

    public void d() {
        v2.a aVar = this.f60548l;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.my.target.v2
    public void destroy() {
        this.f60543g.e();
        this.f60544h.c();
        this.f60545i.a();
        l8 l8Var = this.f60537a;
        if (l8Var != null) {
            l8Var.a();
        }
        wa waVar = this.f60547k;
        if (waVar != null) {
            waVar.a(this.f60537a != null ? 7000 : 0);
            this.f60547k = null;
        }
    }

    public void e() {
        v2.a aVar = this.f60548l;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void f() {
        v2.a aVar = this.f60548l;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void g() {
        q6 q6VarA;
        wa waVar = this.f60547k;
        if (waVar instanceof q6) {
            q6VarA = (q6) waVar;
        } else {
            if (waVar != null) {
                waVar.a((wa.a) null);
                this.f60547k.a(this.f60537a != null ? 7000 : 0);
            }
            q6VarA = q6.a(this.f60538b);
            q6VarA.a(this.f60541e);
            this.f60547k = q6VarA;
            a(q6VarA.getView());
        }
        q6VarA.a(new e(this));
        q6VarA.a(this.f60539c);
    }

    public final void h() {
        xa xaVarA;
        wa waVar = this.f60547k;
        if (waVar instanceof hc) {
            xaVarA = (xa) waVar;
        } else {
            if (waVar != null) {
                waVar.a((wa.a) null);
                this.f60547k.a(this.f60537a != null ? 7000 : 0);
            }
            xaVarA = hc.a(this.f60540d);
            xaVarA.a(this.f60541e);
            this.f60547k = xaVarA;
            a(xaVarA.getView());
        }
        xaVarA.a(new d(this));
        xaVarA.a(this.f60539c);
    }

    @Override // com.my.target.v2
    public void pause() {
        wa waVar = this.f60547k;
        if (waVar != null) {
            waVar.pause();
        }
        this.f60549m = false;
        this.f60543g.e();
        this.f60544h.a((View) null);
    }

    @Override // com.my.target.v2
    public void prepare() {
        this.f60550n = this.f60546j.b();
        if ("mraid".equals(this.f60539c.C())) {
            g();
        } else {
            h();
        }
    }

    @Override // com.my.target.v2
    public void resume() {
        wa waVar = this.f60547k;
        if (waVar != null) {
            waVar.resume();
        }
        this.f60549m = true;
        this.f60543g.c(this.f60538b);
        this.f60544h.a(this.f60538b);
        this.f60544h.b();
    }

    @Override // com.my.target.v2
    public void start() {
        this.f60549m = true;
        wa waVar = this.f60547k;
        if (waVar != null) {
            waVar.start();
        }
        this.f60544h.a(this.f60538b);
        this.f60544h.b();
    }

    @Override // com.my.target.v2
    public void stop() {
        wa waVar = this.f60547k;
        if (waVar != null) {
            waVar.a(this.f60537a == null);
        }
        this.f60544h.a((View) null);
    }

    @Override // com.my.target.v2
    public void a(v2.a aVar) {
        this.f60548l = aVar;
    }

    @Override // com.my.target.v2
    public String a() {
        return "myTarget";
    }

    @Override // com.my.target.v2
    public void a(MyTargetView.AdSize adSize) {
        wa waVar = this.f60547k;
        if (waVar == null) {
            return;
        }
        waVar.getView().a(adSize.getWidthPixels(), adSize.getHeightPixels());
    }

    public void a(float f10, float f11, Context context) {
        if (this.f60542f.f59176a.isEmpty()) {
            return;
        }
        float f12 = f11 - f10;
        ab abVarA = ab.a(new ArrayList(), this.f60542f.f59177b);
        Iterator it = this.f60542f.f59176a.iterator();
        while (it.hasNext()) {
            w8 w8Var = (w8) it.next();
            float fE = w8Var.e();
            if (fE < 0.0f && w8Var.d() >= 0.0f) {
                fE = (f11 / 100.0f) * w8Var.d();
            }
            if (fE >= 0.0f && fE <= f12) {
                abVarA.f59176a.add(w8Var);
                it.remove();
            }
        }
        bb.a(abVarA, 1, context);
    }

    public void a(String str, na naVar, Context context) {
        bb.b(naVar.x(), str, -1, context);
    }

    public void a(IAdLoadingError iAdLoadingError) {
        v2.a aVar = this.f60548l;
        if (aVar != null) {
            aVar.a(iAdLoadingError);
        }
    }

    public void a(com.my.target.b bVar, String str) {
        v2.a aVar = this.f60548l;
        if (aVar != null) {
            aVar.c();
        }
        e1 e1VarA = e1.a();
        if (TextUtils.isEmpty(str)) {
            e1VarA.a(bVar, 1, this.f60538b.getContext());
        } else {
            e1VarA.a(bVar, str, 1, this.f60538b.getContext());
        }
    }

    public void a(com.my.target.b bVar) {
        this.f60543g.e();
        this.f60543g.a(new a(bVar));
        if (this.f60549m) {
            this.f60543g.c(this.f60538b);
        }
    }

    public void a(WebView webView) {
        wa waVar;
        if (this.f60537a == null || (waVar = this.f60547k) == null) {
            return;
        }
        this.f60537a.a(webView, new l8.b(waVar.getView().getAdChoicesView(), 3));
        this.f60537a.c();
    }

    public void a(q5 q5Var) {
        bb.b(this.f60539c.x(), "error", 1, this.f60538b.getContext());
        v2.a aVar = this.f60548l;
        if (aVar == null) {
            return;
        }
        aVar.a(q5Var);
    }

    public final void a(m1 m1Var) {
        if (this.f60547k != null) {
            MyTargetView.AdSize size = this.f60538b.getSize();
            this.f60547k.getView().a(size.getWidthPixels(), size.getHeightPixels());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        m1Var.setLayoutParams(layoutParams);
        this.f60538b.removeAllViews();
        this.f60538b.addView(m1Var);
        if (this.f60539c.a() == null) {
            return;
        }
        this.f60545i.a(m1Var.getAdChoicesView(), new b());
    }
}

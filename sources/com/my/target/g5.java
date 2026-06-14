package com.my.target;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.C4424m2;
import com.my.target.b5;
import com.my.target.common.models.ImageData;
import com.my.target.d;
import com.my.target.e5;
import com.my.target.h9;
import com.my.target.k5;
import com.my.target.n9;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes11.dex */
public final class g5 implements b5, n9.a, e5.a, h9.a, k5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4 f59690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f59691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f59692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n9 f59693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f59694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9 f59695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f59696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f59697h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z4 f59699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f59700k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f59702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f59703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f59704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f59705p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f59701l = a.DISABLED;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f59698i = new Runnable() { // from class: k5.m0
        @Override // java.lang.Runnable
        public final void run() {
            this.f86085b.q();
        }
    };

    public enum a {
        DISABLED,
        RULED_BY_POST,
        RULED_BY_VIDEO
    }

    public interface b extends b5.a {
        void a(Context context);
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g5 f59710a;

        public c(g5 g5Var) {
            this.f59710a = g5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f59710a.p()) {
                this.f59710a.r();
            } else {
                this.f59710a.t();
            }
        }
    }

    public g5(f9 f9Var, o4 o4Var, b bVar) {
        g5 g5Var;
        o4 o4Var2;
        this.f59690a = o4Var;
        d1 d1VarG = o4Var.g();
        this.f59691b = d1VarG;
        this.f59692c = bVar;
        this.f59696g = f9Var.d();
        j9 j9VarE = f9Var.e();
        this.f59695f = j9VarE;
        j9VarE.setColor(o4Var.T().h());
        h9 h9VarA = f9Var.a(this);
        h9VarA.setBanner(o4Var);
        s5 s5VarV = o4Var.V();
        List listS = o4Var.S();
        if (listS.isEmpty()) {
            g5Var = this;
            o4Var2 = o4Var;
            if (s5VarV != null) {
                g5Var.f59697h = d1VarG.f59464n || d1VarG.f59463m;
                z zVarB = f9Var.b();
                n9 n9VarA = f9Var.a(o4Var2, h9VarA.a(), j9VarE.a(), zVarB, this);
                o4Var2 = o4Var2;
                g5Var = this;
                g5Var.f59693d = n9VarA;
                zVarB.a(s5VarV.G(), s5VarV.p());
                g5Var.f59699j = f9Var.a(s5VarV, zVarB, this);
                j9VarE.setMaxTime(s5VarV.o());
                ImageData imageDataV = s5VarV.V();
                n9VarA.setBackgroundImage(imageDataV == null ? o4Var2.s() : imageDataV);
            } else {
                n9 n9VarA2 = f9Var.a(o4Var2, h9VarA.a(), j9VarE.a(), null, g5Var);
                g5Var.f59693d = n9VarA2;
                n9VarA2.d();
                n9VarA2.setBackgroundImage(o4Var2.s());
            }
        } else {
            b9 b9VarC = f9Var.c();
            f9Var.a(b9VarC, listS, this);
            o4Var2 = o4Var;
            g5Var = this;
            g5Var.f59693d = f9Var.a(o4Var2, h9VarA.a(), j9VarE.a(), b9VarC, this);
        }
        g5Var.f59693d.setBanner(o4Var2);
        g5Var.f59694e = new c(this);
        a(o4Var2);
        bVar.a(o4Var2, g5Var.f59693d.a());
        a(o4Var2.a());
    }

    public static g5 a(f9 f9Var, o4 o4Var, b bVar) {
        return new g5(f9Var, o4Var, bVar);
    }

    @Override // com.my.target.k5.a
    public void b(com.my.target.b bVar) {
        bb.b(bVar.x(), Reporting.EventType.RENDER, 1, this.f59693d.a().getContext());
    }

    @Override // com.my.target.n9.a
    public void c() {
        com.my.target.c cVarA = this.f59690a.a();
        if (cVarA == null) {
            return;
        }
        u();
        f fVar = this.f59700k;
        if (fVar == null || !fVar.b()) {
            Context context = this.f59693d.a().getContext();
            f fVar2 = this.f59700k;
            if (fVar2 == null) {
                y3.a(cVarA.b(), context);
            } else {
                fVar2.a(context);
            }
        }
    }

    @Override // com.my.target.e5.a
    public void d() {
        this.f59693d.c(true);
        this.f59693d.a(0, (String) null);
        this.f59693d.b(false);
    }

    @Override // com.my.target.b5
    public void destroy() {
        z4 z4Var = this.f59699j;
        if (z4Var != null) {
            z4Var.destroy();
        }
        u();
    }

    @Override // com.my.target.e5.a
    public void e() {
        this.f59693d.c(true);
        this.f59693d.d();
        this.f59693d.a(false);
        this.f59693d.b(true);
        this.f59695f.setVisible(true);
    }

    @Override // com.my.target.e5.a
    public void f() {
        this.f59693d.c(false);
        this.f59693d.a(false);
        this.f59693d.d();
        this.f59693d.b(false);
    }

    @Override // com.my.target.n9.a
    public void g() {
        z4 z4Var = this.f59699j;
        if (z4Var != null) {
            z4Var.a();
        }
    }

    @Override // com.my.target.b5
    public View getCloseButton() {
        return this.f59693d.getCloseButton();
    }

    @Override // com.my.target.e5.a
    public void h() {
        this.f59693d.c(true);
        this.f59693d.a(0, (String) null);
        this.f59693d.b(false);
        this.f59695f.setVisible(false);
    }

    @Override // com.my.target.n9.a
    public void i() {
        if (this.f59697h) {
            a(this.f59690a, 1);
        } else if (this.f59704o) {
            q();
        }
    }

    @Override // com.my.target.b5
    public View j() {
        return this.f59693d.a();
    }

    @Override // com.my.target.e5.a
    public void k() {
        this.f59693d.c(false);
        this.f59693d.a(false);
        this.f59693d.d();
        this.f59693d.b(false);
        this.f59695f.setVisible(true);
    }

    @Override // com.my.target.n9.a
    public void l() {
        z4 z4Var = this.f59699j;
        if (z4Var != null) {
            z4Var.j();
        }
        u();
        this.f59692c.b(this.f59690a, j().getContext());
    }

    @Override // com.my.target.n9.a
    public void m() {
        u();
        String strQ = this.f59690a.Q();
        if (strQ == null) {
            return;
        }
        y3.a(strQ, this.f59693d.a().getContext());
    }

    @Override // com.my.target.n9.a
    public void n() {
        if (this.f59697h) {
            a(this.f59690a, 1);
            return;
        }
        if (this.f59705p) {
            if (this.f59691b.f59454d) {
                a((com.my.target.b) null, 1);
            }
        } else {
            this.f59693d.c(true);
            this.f59693d.a(1, (String) null);
            this.f59693d.b(false);
            u();
            this.f59696g.postDelayed(this.f59698i, 4000L);
            this.f59704o = true;
        }
    }

    public void o() {
        z4 z4Var = this.f59699j;
        if (z4Var != null) {
            z4Var.destroy();
        }
        u();
        this.f59692c.a(this.f59690a, j().getContext());
    }

    @Override // com.my.target.e5.a
    public void onVolumeChanged(float f10) {
        this.f59693d.setSoundState(f10 != 0.0f);
    }

    public boolean p() {
        a aVar = this.f59701l;
        if (aVar == a.DISABLED) {
            return true;
        }
        if (aVar == a.RULED_BY_POST) {
            this.f59702m -= 200;
        }
        return this.f59702m <= 0;
    }

    @Override // com.my.target.b5
    public void pause() {
        z4 z4Var = this.f59699j;
        if (z4Var != null) {
            z4Var.g();
        }
        this.f59696g.removeCallbacks(this.f59694e);
        u();
    }

    public final void q() {
        if (this.f59704o) {
            u();
            this.f59693d.c(false);
            this.f59693d.d();
            this.f59704o = false;
        }
    }

    public void r() {
        this.f59693d.b();
        this.f59696g.removeCallbacks(this.f59694e);
        this.f59701l = a.DISABLED;
    }

    @Override // com.my.target.b5
    public void resume() {
        if (this.f59701l != a.DISABLED && this.f59702m > 0) {
            t();
        }
        u();
    }

    public void s() {
        z4 z4Var = this.f59699j;
        if (z4Var != null) {
            z4Var.h();
        }
    }

    @Override // com.my.target.b5
    public void stop() {
        z4 z4Var = this.f59699j;
        if (z4Var != null) {
            z4Var.g();
        }
        u();
    }

    public void t() {
        this.f59696g.removeCallbacks(this.f59694e);
        this.f59696g.postDelayed(this.f59694e, 200L);
        float f10 = this.f59703n;
        long j10 = this.f59702m;
        this.f59693d.a((int) ((j10 / 1000) + 1), (f10 - j10) / f10);
    }

    public final void u() {
        this.f59704o = false;
        this.f59696g.removeCallbacks(this.f59698i);
    }

    @Override // com.my.target.k5.a
    public void a(com.my.target.b bVar) {
        Context context = this.f59693d.a().getContext();
        String strD = kb.d(context);
        if (strD != null) {
            bb.a(bVar.x(), strD, 1, context);
        }
        bb.b(bVar.x(), C4424m2.f43623v, 1, context);
    }

    @Override // com.my.target.n9.a
    public void b(int i10) {
        z4 z4Var = this.f59699j;
        if (z4Var != null) {
            z4Var.m();
        }
        u();
    }

    @Override // com.my.target.n9.a, com.my.target.h9.a, com.my.target.k5.a
    public void a(com.my.target.b bVar, int i10) {
        if (bVar != null) {
            this.f59692c.a(bVar, null, i10, j().getContext());
        } else {
            this.f59692c.a(this.f59690a, null, i10, j().getContext());
        }
    }

    @Override // com.my.target.e5.a
    public void b() {
        s5 s5VarV = this.f59690a.V();
        if (s5VarV != null) {
            if (s5VarV.c0()) {
                this.f59693d.a(2, !TextUtils.isEmpty(s5VarV.W()) ? s5VarV.W() : null);
                this.f59693d.c(true);
            } else {
                this.f59705p = true;
            }
        }
        this.f59693d.a(true);
        this.f59693d.b(false);
        this.f59695f.setVisible(false);
        this.f59695f.setTimeChanged(0.0f);
        this.f59692c.a(this.f59693d.a().getContext());
        r();
    }

    @Override // com.my.target.n9.a
    public void a(boolean z10) {
        m9 m9VarT = this.f59690a.T();
        int iB = m9VarT.b();
        int iArgb = Color.argb((int) (m9VarT.c() * 255.0f), Color.red(iB), Color.green(iB), Color.blue(iB));
        n9 n9Var = this.f59693d;
        if (z10) {
            iB = iArgb;
        }
        n9Var.setPanelColor(iB);
    }

    @Override // com.my.target.e5.a
    public void a(float f10, float f11) {
        if (this.f59701l == a.RULED_BY_VIDEO) {
            this.f59702m = (long) (this.f59703n - (1000.0f * f10));
        }
        this.f59695f.setTimeChanged(f10);
    }

    @Override // com.my.target.e5.a
    public void a() {
        this.f59693d.c(false);
        this.f59693d.a(true);
        this.f59693d.d();
        this.f59693d.b(false);
        this.f59693d.e();
        this.f59695f.setVisible(false);
        r();
    }

    public final void a(com.my.target.c cVar) {
        List listA;
        if (cVar == null || (listA = cVar.a()) == null) {
            return;
        }
        f fVarA = f.a(listA, new q1());
        this.f59700k = fVarA;
        fVarA.a(new d.a() { // from class: k5.n0
            @Override // com.my.target.d.a
            public final void a(Context context) {
                this.f86094a.a(context);
            }
        });
    }

    public final /* synthetic */ void a(Context context) {
        o();
    }

    public final void a(o4 o4Var) {
        s5 s5VarV = o4Var.V();
        if (s5VarV != null && s5VarV.h0()) {
            if (s5VarV.a0()) {
                long jM = (long) (s5VarV.M() * 1000.0f);
                this.f59703n = jM;
                this.f59702m = jM;
                if (jM > 0) {
                    this.f59701l = a.RULED_BY_VIDEO;
                    t();
                    return;
                } else {
                    r();
                    return;
                }
            }
            this.f59693d.c();
            return;
        }
        if (o4Var.O()) {
            long jL = (long) (o4Var.L() * 1000.0f);
            this.f59703n = jL;
            this.f59702m = jL;
            if (jL > 0) {
                gb.a("InterstitialPromoPresenterS2: Banner will be allowed to close in " + this.f59702m + " millis");
                this.f59701l = a.RULED_BY_POST;
                t();
                return;
            }
            gb.a("InterstitialPromoPresenterS2: Banner is allowed to close");
            r();
            return;
        }
        this.f59701l = a.DISABLED;
        this.f59693d.c();
    }
}

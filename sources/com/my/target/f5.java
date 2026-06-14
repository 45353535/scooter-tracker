package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.my.target.b5;
import com.my.target.j5;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class f5 implements b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4 f59643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f59644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j5 f59645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f59646d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f59647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f59648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i5 f59649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c1 f59650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u4 f59651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y4 f59652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f59653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f59654l;

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5 f59655a;

        public a(f5 f5Var) {
            this.f59655a = f5Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y4 y4VarC = this.f59655a.c();
            if (y4VarC != null) {
                y4VarC.d();
            }
            this.f59655a.d().b(this.f59655a.b(), view.getContext());
        }
    }

    public interface b {
        void a();
    }

    public interface c extends b5.a {
        void a(Context context);
    }

    public static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j5 f59657a;

        public e(j5 j5Var) {
            this.f59657a = j5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            gb.a("InterstitialPromoPresenter$ShowCloseButtonRunnable: Banner became just closeable");
            this.f59657a.c();
        }
    }

    public f5(e9 e9Var, o4 o4Var, c cVar, Context context) {
        c1 c1Var;
        this.f59643a = o4Var;
        this.f59647e = cVar;
        d dVar = new d(this);
        s5 s5VarV = o4Var.V();
        if (!o4Var.S().isEmpty()) {
            c1 c1VarA = e9Var.a();
            this.f59650h = c1VarA;
            this.f59645c = c1VarA;
        } else if (s5VarV == null || o4Var.U() != 1) {
            i5 i5VarB = e9Var.b();
            this.f59649g = i5VarB;
            this.f59645c = i5VarB;
        } else {
            i5 i5VarC = e9Var.c();
            this.f59649g = i5VarC;
            this.f59645c = i5VarC;
        }
        this.f59644b = new e(this.f59645c);
        this.f59645c.setInterstitialPromoViewListener(dVar);
        this.f59645c.getCloseButton().setOnClickListener(new a(this));
        i5 i5Var = this.f59649g;
        if (i5Var != null && s5VarV != null) {
            y4 y4VarA = y4.a(e9Var, s5VarV, i5Var, cVar, new b() { // from class: k5.j0
                @Override // com.my.target.f5.b
                public final void a() {
                    this.f86057a.a();
                }
            });
            this.f59652j = y4VarA;
            y4VarA.a(s5VarV, context);
            if (s5VarV.h0()) {
                this.f59654l = 0L;
            }
        }
        this.f59645c.setBanner(o4Var);
        this.f59645c.setClickArea(o4Var.g());
        if (s5VarV == null || !s5VarV.h0()) {
            long jL = (long) (o4Var.L() * 1000.0f);
            this.f59653k = jL;
            if (jL > 0) {
                gb.a("InterstitialPromoPresenter: Banner will be allowed to close in " + this.f59653k + " millis");
                a(this.f59653k);
            } else {
                gb.a("InterstitialPromoPresenter: Banner is allowed to close");
                this.f59645c.c();
            }
        }
        List listS = o4Var.S();
        if (!listS.isEmpty() && (c1Var = this.f59650h) != null) {
            this.f59651i = u4.a(listS, c1Var);
        }
        u4 u4Var = this.f59651i;
        if (u4Var != null) {
            u4Var.a(cVar);
        }
        com.my.target.c cVarA = o4Var.a();
        if (cVarA != null) {
            a(dVar, cVarA);
        }
        cVar.a(o4Var, this.f59645c.getView());
    }

    public static f5 a(e9 e9Var, o4 o4Var, c cVar, Context context) {
        return new f5(e9Var, o4Var, cVar, context);
    }

    public o4 b() {
        return this.f59643a;
    }

    public y4 c() {
        return this.f59652j;
    }

    public c d() {
        return this.f59647e;
    }

    @Override // com.my.target.b5
    public void destroy() {
        this.f59646d.removeCallbacks(this.f59644b);
        y4 y4Var = this.f59652j;
        if (y4Var != null) {
            y4Var.a();
        }
    }

    @Override // com.my.target.b5
    public View getCloseButton() {
        return this.f59645c.getCloseButton();
    }

    @Override // com.my.target.b5
    public View j() {
        return this.f59645c.getView();
    }

    @Override // com.my.target.b5
    public void pause() {
        y4 y4Var = this.f59652j;
        if (y4Var != null) {
            y4Var.e();
        }
        this.f59646d.removeCallbacks(this.f59644b);
        if (this.f59654l > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f59654l;
            if (jCurrentTimeMillis > 0) {
                long j10 = this.f59653k;
                if (jCurrentTimeMillis < j10) {
                    this.f59653k = j10 - jCurrentTimeMillis;
                    return;
                }
            }
            this.f59653k = 0L;
        }
    }

    @Override // com.my.target.b5
    public void resume() {
        if (this.f59652j == null) {
            long j10 = this.f59653k;
            if (j10 > 0) {
                a(j10);
            }
        }
    }

    @Override // com.my.target.b5
    public void stop() {
        y4 y4Var = this.f59652j;
        if (y4Var != null) {
            y4Var.g();
        }
    }

    public static class d implements j5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5 f59656a;

        public d(f5 f5Var) {
            this.f59656a = f5Var;
        }

        @Override // com.my.target.j5.a
        public void a(int i10) {
            this.f59656a.d().a(this.f59656a.b(), null, i10, this.f59656a.j().getContext());
        }

        @Override // com.my.target.j5.a
        public void c() {
            a();
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            y4 y4VarC = this.f59656a.c();
            if (y4VarC != null) {
                y4VarC.a();
            }
            this.f59656a.d().a(this.f59656a.b(), context);
        }

        public final void a() {
            Context context = this.f59656a.j().getContext();
            com.my.target.c cVarA = this.f59656a.b().a();
            if (cVarA == null) {
                return;
            }
            f fVar = this.f59656a.f59648f;
            if (fVar == null || !fVar.b()) {
                if (fVar == null) {
                    y3.a(cVarA.b(), context);
                } else {
                    fVar.a(context);
                }
            }
        }
    }

    public void a() {
        y4 y4Var = this.f59652j;
        if (y4Var != null) {
            y4Var.a(this.f59643a);
            this.f59652j.a();
            this.f59652j = null;
        }
    }

    public final void a(j5.a aVar, com.my.target.c cVar) {
        List listA = cVar.a();
        if (listA != null) {
            f fVarA = f.a(listA, new q1());
            this.f59648f = fVarA;
            fVarA.a(aVar);
        }
    }

    private void a(long j10) {
        this.f59646d.removeCallbacks(this.f59644b);
        this.f59654l = System.currentTimeMillis();
        this.f59646d.postDelayed(this.f59644b, j10);
    }
}

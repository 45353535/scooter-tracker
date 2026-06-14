package com.my.target;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.j0;
import com.my.target.wa;
import com.my.target.xa;

/* JADX INFO: loaded from: classes11.dex */
public class hc implements xa, j0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f59832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f59833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wa.a f59834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xa.a f59835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public na f59836e;

    public hc(j0 j0Var, m1 m1Var) {
        this.f59832a = j0Var;
        this.f59833b = m1Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        m1Var.addView(j0Var, 0);
        j0Var.setLayoutParams(layoutParams);
        j0Var.setBannerWebViewListener(this);
    }

    @Override // com.my.target.j0.a
    public void a(String str) {
    }

    @Override // com.my.target.j0.a
    public void b(String str) {
        if (this.f59836e != null) {
            c(str);
        }
    }

    public final void c(String str) {
        na naVar;
        wa.a aVar = this.f59834c;
        if (aVar == null || (naVar = this.f59836e) == null) {
            return;
        }
        aVar.a(naVar, str);
    }

    public final /* synthetic */ void d(String str) {
        e(str);
        this.f59832a.setOnLayoutListener(null);
    }

    public final void e(String str) {
        this.f59832a.setData(str);
    }

    @Override // com.my.target.wa
    public m1 getView() {
        return this.f59833b;
    }

    @Override // com.my.target.wa
    public void pause() {
    }

    @Override // com.my.target.wa
    public void resume() {
    }

    @Override // com.my.target.wa
    public void start() {
        na naVar;
        wa.a aVar = this.f59834c;
        if (aVar == null || (naVar = this.f59836e) == null) {
            return;
        }
        aVar.a(naVar);
    }

    @Override // com.my.target.wa
    public void a(boolean z10) {
    }

    public static hc a(Context context) {
        return new hc(context);
    }

    @Override // com.my.target.wa
    public void a(na naVar) {
        this.f59836e = naVar;
        final String strM = naVar.M();
        if (strM == null) {
            a(m.f60112q);
            return;
        }
        if (this.f59832a.getMeasuredHeight() != 0 && this.f59832a.getMeasuredWidth() != 0) {
            e(strM);
        } else {
            this.f59832a.setOnLayoutListener(new j0.d() { // from class: k5.s0
                @Override // com.my.target.j0.d
                public final void a() {
                    this.f86128a.d(strM);
                }
            });
        }
        xa.a aVar = this.f59835d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public hc(Context context) {
        this(new j0(context), new m1(context));
    }

    @Override // com.my.target.wa
    public void a(wa.a aVar) {
        this.f59834c = aVar;
    }

    @Override // com.my.target.wa
    public void a(int i10) {
        a((xa.a) null);
        a((wa.a) null);
        if (this.f59832a.getParent() != null) {
            ((ViewGroup) this.f59832a.getParent()).removeView(this.f59832a);
        }
        this.f59832a.a(i10);
    }

    @Override // com.my.target.xa
    public void a(xa.a aVar) {
        this.f59835d = aVar;
    }

    @Override // com.my.target.j0.a
    public void a(WebView webView) {
        wa.a aVar = this.f59834c;
        if (aVar != null) {
            aVar.a(webView);
        }
    }

    @Override // com.my.target.j0.a
    public void a() {
        wa.a aVar = this.f59834c;
        if (aVar == null) {
            return;
        }
        q5 q5VarF = q5.a("WebView error").f("WebView renderer crashed");
        na naVar = this.f59836e;
        q5 q5VarE = q5VarF.e(naVar == null ? null : naVar.M());
        na naVar2 = this.f59836e;
        aVar.a(q5VarE.d(naVar2 != null ? naVar2.r() : null));
    }

    private void a(IAdLoadingError iAdLoadingError) {
        xa.a aVar = this.f59835d;
        if (aVar != null) {
            aVar.a(iAdLoadingError);
        }
    }
}

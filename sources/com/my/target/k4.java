package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetActivity;
import com.my.target.l5;
import com.my.target.l8;
import com.my.target.s2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class k4 extends h4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j4 f59991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t4 f59992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ab f59993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WeakReference f59994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public bc f59995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yb f59996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l8 f59997n;

    public k4(j4 j4Var, t4 t4Var, s2.a aVar) {
        super(aVar);
        this.f59991h = j4Var;
        this.f59992i = t4Var;
        this.f59996m = yb.a(j4Var.x());
        this.f59993j = j4Var.x().b();
    }

    public static k4 a(j4 j4Var, t4 t4Var, s2.a aVar) {
        return new k4(j4Var, t4Var, aVar);
    }

    public void b(Context context) {
        if (this.f59801c) {
            return;
        }
        this.f59801c = true;
        this.f59799a.b();
        bb.b(this.f59991h.x(), "reward", -1, context);
        s2.b bVarC = c();
        if (bVarC != null) {
            bVarC.a(Reward.getDefault());
        }
    }

    @Override // com.my.target.h4
    public boolean d() {
        return this.f59991h.N();
    }

    public l5 e() {
        WeakReference weakReference = this.f59994k;
        if (weakReference != null) {
            return (l5) weakReference.get();
        }
        return null;
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        a(frameLayout);
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        l5 l5Var;
        super.onActivityDestroy();
        bc bcVar = this.f59995l;
        if (bcVar != null) {
            bcVar.e();
            this.f59995l = null;
        }
        l8 l8Var = this.f59997n;
        if (l8Var != null) {
            l8Var.a();
        }
        WeakReference weakReference = this.f59994k;
        if (weakReference != null && (l5Var = (l5) weakReference.get()) != null) {
            l5Var.a(this.f59997n != null ? 7000 : 0);
        }
        this.f59994k = null;
        this.f59996m.a((View) null);
        this.f59996m.c();
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        l5 l5Var;
        super.onActivityPause();
        WeakReference weakReference = this.f59994k;
        if (weakReference != null && (l5Var = (l5) weakReference.get()) != null) {
            l5Var.pause();
        }
        bc bcVar = this.f59995l;
        if (bcVar != null) {
            bcVar.e();
        }
        this.f59996m.a((View) null);
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        l5 l5Var;
        super.onActivityResume();
        WeakReference weakReference = this.f59994k;
        if (weakReference == null || (l5Var = (l5) weakReference.get()) == null) {
            return;
        }
        l5Var.resume();
        bc bcVar = this.f59995l;
        if (bcVar != null) {
            bcVar.c(l5Var.j());
        }
        this.f59996m.a(l5Var.j());
        this.f59996m.b();
    }

    public static class a implements l5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k4 f59998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j4 f59999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s2.a f60000c;

        public a(k4 k4Var, j4 j4Var, s2.a aVar) {
            this.f59998a = k4Var;
            this.f59999b = j4Var;
            this.f60000c = aVar;
        }

        @Override // com.my.target.b5.a
        public void a(b bVar, String str, int i10, Context context) {
            e1 e1VarA = e1.a();
            if (TextUtils.isEmpty(str)) {
                e1VarA.a(this.f59999b, i10, context);
            } else {
                e1VarA.a(this.f59999b, str, i10, context);
            }
            this.f60000c.c();
        }

        @Override // com.my.target.b5.a
        public void b(b bVar, Context context) {
            bb.b(bVar.x(), "closedByUser", -1, context);
            this.f59998a.dismiss();
        }

        @Override // com.my.target.l5.a
        public void b(Context context) {
            this.f59998a.b(context);
        }

        public void a() {
            this.f59998a.dismiss();
        }

        @Override // com.my.target.b5.a
        public void a(b bVar, Context context) {
            this.f59998a.a(bVar, context);
        }

        @Override // com.my.target.b5.a
        public void a(b bVar, View view) {
            gb.a("InterstitialAdHtmlEngine$InterstitialWebViewPresenterListener: Ad shown, banner Id = " + this.f59999b.r());
            this.f59998a.a(bVar, view);
        }

        @Override // com.my.target.l5.a
        public void a(String str) {
            this.f59998a.dismiss();
        }

        @Override // com.my.target.l5.a
        public void a(b bVar, String str, Context context) {
            this.f59998a.a(bVar, str, context);
        }

        @Override // com.my.target.l5.a
        public void a(b bVar, float f10, float f11, Context context) {
            this.f59998a.a(f10, f11, context);
        }

        @Override // com.my.target.l5.a
        public void a(WebView webView) {
            this.f59998a.a(webView);
        }

        @Override // com.my.target.l5.a
        public void a(q5 q5Var) {
            this.f59998a.a(this.f59999b, q5Var);
            a();
        }
    }

    public void a(float f10, float f11, Context context) {
        if (this.f59993j.f59176a.isEmpty()) {
            return;
        }
        float f12 = f11 - f10;
        ab abVarA = ab.a(new ArrayList(), this.f59993j.f59177b);
        Iterator it = this.f59993j.f59176a.iterator();
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

    public void a(b bVar, String str, Context context) {
        bb.b(bVar.x(), str, -1, context);
    }

    public void a(b bVar, View view) {
        bc bcVar = this.f59995l;
        if (bcVar != null) {
            bcVar.e();
        }
        bc bcVarB = bc.b(this.f59991h.E(), this.f59991h.x());
        this.f59995l = bcVarB;
        if (this.f59800b) {
            bcVarB.c(view);
        }
        gb.a("InterstitialAdHtmlEngine: Ad shown, banner Id = " + bVar.r());
    }

    public void a(WebView webView) {
        l5 l5VarE;
        if (this.f59997n == null || (l5VarE = e()) == null) {
            return;
        }
        this.f59997n.a(webView, new l8.b[0]);
        View closeButton = l5VarE.getCloseButton();
        if (closeButton != null) {
            this.f59997n.a(new l8.b(closeButton, 0));
        }
        this.f59997n.c();
    }

    public final void a(ViewGroup viewGroup) {
        l5 l5VarA;
        this.f59997n = l8.a(this.f59991h, 1, null, viewGroup.getContext());
        if ("mraid".equals(this.f59991h.C())) {
            l5VarA = a5.a(viewGroup.getContext());
        } else {
            l5VarA = v4.a(viewGroup.getContext());
        }
        this.f59994k = new WeakReference(l5VarA);
        l5VarA.a(new a(this, this.f59991h, this.f59799a));
        l5VarA.a(this.f59992i, this.f59991h);
        viewGroup.addView(l5VarA.j(), new FrameLayout.LayoutParams(-1, -1));
    }
}

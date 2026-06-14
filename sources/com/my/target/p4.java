package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.ads.Reward;
import com.my.target.bc;
import com.my.target.common.MyTargetActivity;
import com.my.target.f5;
import com.my.target.g5;
import com.my.target.l5;
import com.my.target.l8;
import com.my.target.s2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class p4 extends h4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t4 f60507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ab f60508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f60509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l8 f60510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o4 f60511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f60512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yb f60513n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public bc f60514o;

    public class a extends bc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f60515a;

        public a(View view) {
            this.f60515a = view;
        }

        @Override // com.my.target.bc.a
        public void a() {
            View closeButton;
            super.a();
            l8 l8Var = p4.this.f60510k;
            if (l8Var == null || l8Var.b()) {
                return;
            }
            p4.this.f60510k.a(this.f60515a, new l8.b[0]);
            b5 b5VarE = p4.this.e();
            if (b5VarE != null && (closeButton = b5VarE.getCloseButton()) != null) {
                p4.this.f60510k.a(new l8.b(closeButton, 0));
            }
            p4.this.f60510k.c();
        }
    }

    public static class b implements f5.c, l5.a, g5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p4 f60517a;

        public b(p4 p4Var) {
            this.f60517a = p4Var;
        }

        @Override // com.my.target.l5.a
        public void a(String str) {
        }

        @Override // com.my.target.l5.a
        public void b(Context context) {
        }

        @Override // com.my.target.b5.a
        public void a(com.my.target.b bVar, String str, int i10, Context context) {
            if (bVar != null) {
                this.f60517a.a(bVar, str, i10, context);
            }
        }

        @Override // com.my.target.b5.a
        public void b(com.my.target.b bVar, Context context) {
            this.f60517a.b(bVar, context);
        }

        @Override // com.my.target.b5.a
        public void a(com.my.target.b bVar, Context context) {
            this.f60517a.a(bVar, context);
        }

        @Override // com.my.target.b5.a
        public void a(com.my.target.b bVar, View view) {
            this.f60517a.a(bVar, view);
        }

        @Override // com.my.target.l5.a
        public void a(com.my.target.b bVar, String str, Context context) {
            this.f60517a.a(bVar, str, context);
        }

        @Override // com.my.target.l5.a
        public void a(com.my.target.b bVar, float f10, float f11, Context context) {
            this.f60517a.a(f10, f11, context);
        }

        @Override // com.my.target.l5.a
        public void a(WebView webView) {
            this.f60517a.a(webView);
        }

        @Override // com.my.target.f5.c, com.my.target.g5.b
        public void a(Context context) {
            this.f60517a.b(context);
        }

        @Override // com.my.target.l5.a
        public void a(q5 q5Var) {
            p4 p4Var = this.f60517a;
            p4Var.a(p4Var.f60511l, q5Var);
            this.f60517a.f();
        }
    }

    public p4(o4 o4Var, t4 t4Var, boolean z10, s2.a aVar) {
        super(aVar);
        this.f60511l = o4Var;
        this.f60507h = t4Var;
        this.f60509j = z10;
        this.f60513n = yb.a(o4Var.x());
        this.f60508i = o4Var.x().b();
    }

    public static p4 a(o4 o4Var, t4 t4Var, boolean z10, s2.a aVar) {
        return new p4(o4Var, t4Var, z10, aVar);
    }

    public void b(Context context) {
        this.f59799a.b();
        if (!this.f59801c) {
            this.f59801c = true;
            bb.b(this.f60511l.x(), "reward", 1, context);
            s2.b bVarC = c();
            if (bVarC != null) {
                bVarC.a(Reward.getDefault());
            }
        }
        e4 e4VarR = this.f60511l.R();
        b5 b5VarE = e();
        ViewParent parent = b5VarE != null ? b5VarE.j().getParent() : null;
        if (e4VarR == null || !(parent instanceof ViewGroup)) {
            return;
        }
        a(e4VarR, (ViewGroup) parent);
    }

    @Override // com.my.target.h4
    public boolean d() {
        return this.f60511l.N();
    }

    public b5 e() {
        WeakReference weakReference = this.f60512m;
        if (weakReference != null) {
            return (b5) weakReference.get();
        }
        return null;
    }

    public void f() {
        dismiss();
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        a(this.f60511l, (ViewGroup) frameLayout);
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        super.onActivityDestroy();
        if (!this.f59801c) {
            this.f59801c = true;
            s2.b bVarC = c();
            if (this.f60511l.V() == null && bVarC != null) {
                bVarC.a(Reward.getDefault());
            }
        }
        WeakReference weakReference = this.f60512m;
        if (weakReference != null) {
            b5 b5Var = (b5) weakReference.get();
            if (b5Var != null) {
                View viewJ = b5Var.j();
                ViewParent parent = viewJ.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewJ);
                }
                b5Var.destroy();
            }
            this.f60512m.clear();
            this.f60512m = null;
        }
        bc bcVar = this.f60514o;
        if (bcVar != null) {
            bcVar.e();
            this.f60514o = null;
        }
        l8 l8Var = this.f60510k;
        if (l8Var != null) {
            l8Var.a();
        }
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        super.onActivityPause();
        b5 b5VarE = e();
        if (b5VarE != null) {
            b5VarE.pause();
        }
        bc bcVar = this.f60514o;
        if (bcVar != null) {
            bcVar.e();
        }
        this.f60513n.a((View) null);
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        super.onActivityResume();
        b5 b5VarE = e();
        if (b5VarE != null) {
            b5VarE.resume();
            bc bcVar = this.f60514o;
            if (bcVar != null) {
                bcVar.c(b5VarE.j());
            }
            this.f60513n.a(b5VarE.j());
            this.f60513n.b();
        }
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityStop() {
        super.onActivityStop();
        b5 b5VarE = e();
        if (b5VarE != null) {
            b5VarE.stop();
        }
    }

    public void a(com.my.target.b bVar, String str, int i10, Context context) {
        if (e() == null) {
            return;
        }
        e1 e1VarA = e1.a();
        if (TextUtils.isEmpty(str)) {
            e1VarA.a(bVar, i10, context);
        } else {
            e1VarA.a(bVar, str, i10, context);
        }
        boolean z10 = bVar instanceof g4;
        if (z10) {
            bb.b(this.f60511l.x(), (i10 != 2 || this.f60511l.h() == null) ? "click" : "ctaClick", 2, context);
        }
        this.f59799a.c();
        if ((z10 || (bVar instanceof o4)) && this.f60511l.W()) {
            dismiss();
        }
    }

    public void b(com.my.target.b bVar, Context context) {
        bb.b(bVar.x(), "closedByUser", -1, context);
        dismiss();
    }

    public final void b(e4 e4Var, ViewGroup viewGroup) {
        l5 l5VarA;
        l8 l8Var = this.f60510k;
        if (l8Var != null) {
            l8Var.a();
        }
        this.f60510k = l8.a(e4Var, 2, null, viewGroup.getContext());
        if ("mraid".equals(e4Var.C())) {
            l5VarA = a5.a(viewGroup.getContext());
        } else {
            l5VarA = v4.a(viewGroup.getContext());
        }
        this.f60512m = new WeakReference(l5VarA);
        l5VarA.a(new b(this));
        l5VarA.a(this.f60507h, (j4) e4Var);
        viewGroup.addView(l5VarA.j(), new FrameLayout.LayoutParams(-1, -1));
    }

    public void a(float f10, float f11, Context context) {
        if (this.f60508i.f59176a.isEmpty()) {
            return;
        }
        float f12 = f11 - f10;
        ab abVarA = ab.a(new ArrayList(), this.f60508i.f59177b);
        Iterator it = this.f60508i.f59176a.iterator();
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

    public void a(com.my.target.b bVar, String str, Context context) {
        bb.b(bVar.x(), str, -1, context);
    }

    public void a(com.my.target.b bVar, View view) {
        bc bcVar = this.f60514o;
        if (bcVar != null) {
            bcVar.e();
        }
        bc bcVarB = bc.b(bVar.E(), bVar.x());
        this.f60514o = bcVarB;
        bcVarB.a(new a(view));
        if (this.f59800b) {
            this.f60514o.c(view);
        }
        gb.a("InterstitialAdPromoEngine: Ad shown, banner Id = " + bVar.r());
    }

    public void a(WebView webView) {
        l8 l8Var = this.f60510k;
        if (l8Var == null || !l8Var.b()) {
            return;
        }
        this.f60510k.a(webView, new l8.b[0]);
        b5 b5VarE = e();
        if (b5VarE == null) {
            return;
        }
        View closeButton = b5VarE.getCloseButton();
        if (closeButton != null) {
            this.f60510k.a(new l8.b(closeButton, 0));
        }
        this.f60510k.c();
    }

    public final void a(e4 e4Var, ViewGroup viewGroup) {
        b5 b5VarE = e();
        if (b5VarE != null) {
            b5VarE.destroy();
        }
        if (e4Var instanceof j4) {
            viewGroup.removeAllViews();
            b(e4Var, viewGroup);
        } else if (e4Var instanceof l4) {
            viewGroup.removeAllViews();
            a((l4) e4Var, viewGroup);
        } else if (e4Var instanceof o4) {
            viewGroup.removeAllViews();
            a((o4) e4Var, viewGroup);
        }
    }

    public final void a(l4 l4Var, ViewGroup viewGroup) {
        l8 l8Var = this.f60510k;
        if (l8Var != null) {
            l8Var.a();
        }
        this.f60510k = l8.a(l4Var, 2, null, viewGroup.getContext());
        w4 w4VarA = w4.a(viewGroup.getContext(), new b(this));
        this.f60512m = new WeakReference(w4VarA);
        w4VarA.a(l4Var);
        viewGroup.addView(w4VarA.j(), new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(o4 o4Var, ViewGroup viewGroup) {
        b5 b5VarA;
        l8 l8Var = this.f60510k;
        if (l8Var != null) {
            l8Var.a();
        }
        s5 s5VarV = o4Var.V();
        this.f60510k = l8.a(o4Var, s5VarV != null ? 3 : 2, s5VarV, viewGroup.getContext());
        if (o4Var.U() != 2) {
            e9 e9VarA = e9.a(this.f60510k, viewGroup.getContext());
            e9VarA.a(this.f60509j);
            b5VarA = f5.a(e9VarA, o4Var, new b(this), viewGroup.getContext());
        } else {
            f9 f9VarA = f9.a(o4Var.T(), this.f60510k, viewGroup.getContext());
            f9VarA.a(this.f60509j);
            g5 g5VarA = g5.a(f9VarA, o4Var, new b(this));
            g5VarA.s();
            b5VarA = g5VarA;
        }
        this.f60512m = new WeakReference(b5VarA);
        viewGroup.addView(b5VarA.j(), new FrameLayout.LayoutParams(-1, -1));
        this.f60511l = o4Var;
    }
}

package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.my.target.b5;
import com.my.target.bc;
import com.my.target.common.MyTargetActivity;
import com.my.target.l8;
import com.my.target.s2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class n4 extends h4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l4 f60173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public bc f60174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yb f60175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WeakReference f60176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l8 f60177l;

    public class a extends bc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f60178a;

        public a(View view) {
            this.f60178a = view;
        }

        @Override // com.my.target.bc.a
        public void a() {
            View closeButton;
            super.a();
            l8 l8Var = n4.this.f60177l;
            if (l8Var != null) {
                l8Var.a(this.f60178a, new l8.b[0]);
                WeakReference weakReference = n4.this.f60176k;
                if (weakReference != null && (closeButton = ((w4) weakReference.get()).getCloseButton()) != null) {
                    n4.this.f60177l.a(new l8.b(closeButton, 0));
                }
                n4.this.f60177l.c();
            }
        }
    }

    public static class b implements b5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n4 f60180a;

        public b(n4 n4Var) {
            this.f60180a = n4Var;
        }

        @Override // com.my.target.b5.a
        public void a(com.my.target.b bVar, String str, int i10, Context context) {
            this.f60180a.a(context, i10);
        }

        @Override // com.my.target.b5.a
        public void b(com.my.target.b bVar, Context context) {
            this.f60180a.b(bVar, context);
        }

        @Override // com.my.target.b5.a
        public void a(com.my.target.b bVar, Context context) {
            this.f60180a.a(bVar, context);
        }

        @Override // com.my.target.b5.a
        public void a(com.my.target.b bVar, View view) {
            gb.a("InterstitialAdImagineEngine$InterstitialImageListener: Ad shown, banner Id = " + bVar.r());
            this.f60180a.a(bVar, view);
        }
    }

    public n4(l4 l4Var, s2.a aVar) {
        super(aVar);
        this.f60173h = l4Var;
        this.f60175j = yb.a(l4Var.x());
    }

    public static n4 a(l4 l4Var, s2.a aVar) {
        return new n4(l4Var, aVar);
    }

    public void b(com.my.target.b bVar, Context context) {
        bb.b(bVar.x(), "closedByUser", -1, context);
        dismiss();
    }

    @Override // com.my.target.h4
    public boolean d() {
        return this.f60173h.N();
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        a(frameLayout);
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        super.onActivityDestroy();
        bc bcVar = this.f60174i;
        if (bcVar != null) {
            bcVar.e();
            this.f60174i = null;
        }
        l8 l8Var = this.f60177l;
        if (l8Var != null) {
            l8Var.a();
        }
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        super.onActivityPause();
        bc bcVar = this.f60174i;
        if (bcVar != null) {
            bcVar.e();
        }
        this.f60175j.a((View) null);
    }

    @Override // com.my.target.h4, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        w4 w4Var;
        super.onActivityResume();
        WeakReference weakReference = this.f60176k;
        if (weakReference == null || (w4Var = (w4) weakReference.get()) == null) {
            return;
        }
        bc bcVar = this.f60174i;
        if (bcVar != null) {
            bcVar.c(w4Var.j());
        }
        this.f60175j.a(w4Var.j());
        this.f60175j.b();
    }

    public void a(com.my.target.b bVar, View view) {
        bc bcVar = this.f60174i;
        if (bcVar != null) {
            bcVar.e();
        }
        bc bcVarB = bc.b(this.f60173h.E(), this.f60173h.x());
        this.f60174i = bcVarB;
        bcVarB.a(new a(view));
        if (this.f59800b) {
            this.f60174i.c(view);
        }
        gb.a("InterstitialAdImagineEngine: Ad shown, banner Id = " + bVar.r());
    }

    public void a(Context context, int i10) {
        e1.a().a(this.f60173h, i10, context);
        this.f59799a.c();
        dismiss();
    }

    private void a(ViewGroup viewGroup) {
        this.f60177l = l8.a(this.f60173h, 2, null, viewGroup.getContext());
        w4 w4VarA = w4.a(viewGroup.getContext(), new b(this));
        this.f60176k = new WeakReference(w4VarA);
        w4VarA.a(this.f60173h);
        viewGroup.addView(w4VarA.j(), new FrameLayout.LayoutParams(-1, -1));
    }
}

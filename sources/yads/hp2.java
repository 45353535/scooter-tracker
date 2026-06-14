package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hp2 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f111668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f111669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy f111670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ox1 f111671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r22 f111672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w33 f111673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oh0 f111674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tv f111675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mw0 f111676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fp2 f111677j;

    public hp2(t9 t9Var, b2 b2Var, wy wyVar, qx1 qx1Var, r22 r22Var, w33 w33Var, oh0 oh0Var, tv tvVar) {
        this.f111668a = t9Var;
        this.f111669b = b2Var;
        this.f111670c = wyVar;
        this.f111671d = qx1Var;
        this.f111672e = r22Var;
        this.f111673f = w33Var;
        this.f111674g = oh0Var;
        this.f111675h = tvVar;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        View viewC = this.f111671d.c(viewGroup);
        if (viewC != null) {
            fp2 fp2Var = new fp2(this);
            this.f111669b.f108890b.add(fp2Var);
            this.f111677j = fp2Var;
            Context context = viewC.getContext();
            Object obj = vt2.f117186j;
            hr2 hr2VarA = ut2.a().a(context);
            boolean z10 = false;
            boolean z11 = hr2VarA != null && hr2VarA.D;
            mf0[] mf0VarArr = mf0.f113454b;
            if (Intrinsics.areEqual("divkit", this.f111668a.f116118k) && z11) {
                z10 = true;
            }
            if (!z10) {
                viewC.setOnClickListener(new ep2(this.f111670c));
            }
            viewC.setVisibility(8);
            gp2 gp2Var = new gp2(new WeakReference(viewC));
            tv tvVar = this.f111675h;
            t9 t9Var = this.f111668a;
            r22 r22Var = this.f111672e;
            w33 w33Var = this.f111673f;
            oh0 oh0Var = this.f111674g;
            tvVar.getClass();
            q42 q42Var = r22Var.f115285a;
            b62 b62Var = r22Var.f115286b;
            mw0 mw0Var = null;
            String str = oh0Var != null ? oh0Var.f114317a : null;
            nf0[] nf0VarArr = nf0.f113851b;
            mw0 n12Var = (Intrinsics.areEqual(str, "pack_shot") && w33Var.f117306d.a()) ? new n12(t9Var, gp2Var, w33Var) : q42Var != null ? new o42(q42Var, gp2Var, t9Var.f116117j, w33Var.f117307e, w33Var.f117306d) : b62Var != null ? new z52(b62Var, gp2Var) : w33Var.f117306d.a() ? new n12(t9Var, gp2Var, w33Var) : null;
            if (n12Var != null) {
                n12Var.start();
                mw0Var = n12Var;
            }
            this.f111676i = mw0Var;
        }
    }

    @Override // yads.hf0
    public final void c() {
        fp2 fp2Var = this.f111677j;
        if (fp2Var != null) {
            this.f111669b.f108890b.remove(fp2Var);
        }
        mw0 mw0Var = this.f111676i;
        if (mw0Var != null) {
            mw0Var.invalidate();
        }
    }
}

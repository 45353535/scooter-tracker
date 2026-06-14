package yads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class yy implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f118436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f118437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y3 f118438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r22 f118439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w33 f118440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oh0 f118441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zy f118442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sd1 f118443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mw0 f118444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xy f118445j;

    public /* synthetic */ yy(t9 t9Var, b2 b2Var, y3 y3Var, r22 r22Var, w33 w33Var, oh0 oh0Var) {
        this(t9Var, b2Var, y3Var, r22Var, w33Var, oh0Var, new zy(), new sd1());
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        xy xyVar = new xy(this);
        this.f118437b.f108890b.add(xyVar);
        this.f118445j = xyVar;
        sd1 sd1Var = this.f118443h;
        sd1Var.f115753a.getClass();
        View viewFindViewWithTag = viewGroup.findViewWithTag("linear_progress_view");
        ProgressBar progressBar = viewFindViewWithTag instanceof ProgressBar ? (ProgressBar) viewFindViewWithTag : null;
        gk2 gk2Var = sd1Var.f115755c;
        KProperty kProperty = sd1.f115752d[0];
        gk2Var.getClass();
        gk2Var.f111244a = new WeakReference(progressBar);
        zy zyVar = this.f118442g;
        t9 t9Var = this.f118436a;
        y3 y3Var = this.f118438c;
        r22 r22Var = this.f118439d;
        w33 w33Var = this.f118440e;
        oh0 oh0Var = this.f118441f;
        sd1 sd1Var2 = this.f118443h;
        zyVar.getClass();
        q42 q42Var = r22Var.f115285a;
        b62 b62Var = r22Var.f115286b;
        String str = oh0Var != null ? oh0Var.f114317a : null;
        nf0[] nf0VarArr = nf0.f113851b;
        mw0 r12Var = Intrinsics.areEqual(str, "pack_shot") ? new r12(y3Var, w33Var, sd1Var2) : q42Var != null ? new p42(q42Var, y3Var, sd1Var2, t9Var.f116126s) : b62Var != null ? new a62(b62Var, y3Var) : new r12(y3Var, w33Var, sd1Var2);
        r12Var.start();
        this.f118444i = r12Var;
    }

    @Override // yads.hf0
    public final void c() {
        xy xyVar = this.f118445j;
        if (xyVar != null) {
            this.f118437b.f108890b.remove(xyVar);
        }
        mw0 mw0Var = this.f118444i;
        if (mw0Var != null) {
            mw0Var.invalidate();
        }
        gk2 gk2Var = this.f118443h.f115755c;
        KProperty kProperty = sd1.f115752d[0];
        gk2Var.getClass();
        gk2Var.f111244a = new WeakReference(null);
    }

    public yy(t9 t9Var, b2 b2Var, y3 y3Var, r22 r22Var, w33 w33Var, oh0 oh0Var, zy zyVar, sd1 sd1Var) {
        this.f118436a = t9Var;
        this.f118437b = b2Var;
        this.f118438c = y3Var;
        this.f118439d = r22Var;
        this.f118440e = w33Var;
        this.f118441f = oh0Var;
        this.f118442g = zyVar;
        this.f118443h = sd1Var;
    }
}

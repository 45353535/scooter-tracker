package yads;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class qp2 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f115118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k43 f115119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n32 f115120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f115121d;

    public qp2(b2 b2Var, k43 k43Var, n32 n32Var, c2 c2Var) {
        this.f115118a = b2Var;
        this.f115119b = k43Var;
        this.f115120c = n32Var;
        this.f115121d = c2Var;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        b2 b2Var = this.f115118a;
        b2Var.f108890b.add(this.f115121d);
        this.f115119b.getClass();
        View viewFindViewWithTag = viewGroup.findViewWithTag("timer_container");
        if (!androidx.activity.s.a(viewFindViewWithTag)) {
            viewFindViewWithTag = null;
        }
        n32 n32Var = this.f115120c;
        n32Var.f113716c = viewFindViewWithTag;
        mw0 mw0Var = n32Var.f113715b;
        if (mw0Var != null) {
            mw0Var.start();
        }
    }

    @Override // yads.hf0
    public final void c() {
        b2 b2Var = this.f115118a;
        b2Var.f108890b.remove(this.f115121d);
        n32 n32Var = this.f115120c;
        n32Var.f113716c = null;
        mw0 mw0Var = n32Var.f113715b;
        if (mw0Var != null) {
            mw0Var.invalidate();
        }
    }
}

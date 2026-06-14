package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aw implements hf0, c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f108837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f108838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mv f108839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wy f108840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ox1 f108841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m30 f108842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w33 f108843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ov f108844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final nh2 f108845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final iv f108846j;

    public aw(t9 t9Var, b2 b2Var, mv mvVar, wy wyVar, ox1 ox1Var, m30 m30Var, w33 w33Var) {
        this.f108837a = t9Var;
        this.f108838b = b2Var;
        this.f108839c = mvVar;
        this.f108840d = wyVar;
        this.f108841e = ox1Var;
        this.f108842f = m30Var;
        this.f108843g = w33Var;
        this.f108845i = w33Var.d();
        this.f108846j = w33Var.a();
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        View viewC = this.f108841e.c(viewGroup);
        ProgressBar progressBarA = this.f108841e.a(viewGroup);
        if (viewC != null) {
            this.f108838b.f108890b.add(this);
            Context context = viewC.getContext();
            Object obj = vt2.f117186j;
            hr2 hr2VarA = ut2.a().a(context);
            boolean z10 = false;
            boolean z11 = hr2VarA != null && hr2VarA.D;
            mf0[] mf0VarArr = mf0.f113454b;
            if (Intrinsics.areEqual("divkit", this.f108837a.f116118k) && z11) {
                z10 = true;
            }
            if (!z10) {
                viewC.setOnClickListener(new zv(this.f108840d, this.f108842f));
            }
            a(viewC, progressBarA);
            if (viewC.getTag() == null) {
                viewC.setTag("close");
            }
        }
    }

    @Override // yads.c2
    public final void b() {
        ov ovVar = this.f108844h;
        if (ovVar != null) {
            ovVar.b();
        }
    }

    @Override // yads.hf0
    public final void c() {
        this.f108838b.f108890b.remove(this);
        ov ovVar = this.f108844h;
        if (ovVar != null) {
            ovVar.invalidate();
        }
    }

    public final void a(View view, ProgressBar progressBar) {
        ov tb0Var;
        Long l10 = this.f108837a.f116117j;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        if (progressBar != null) {
            tb0Var = new gh2(view, progressBar, new wk0(), new uv(new ye()), this.f108842f, this.f108845i, jLongValue);
        } else {
            tb0Var = this.f108846j.a() ? new tb0(view, this.f108839c, this.f108842f, jLongValue, this.f108843g.f117307e, ia2.a(true)) : null;
        }
        this.f108844h = tb0Var;
        if (tb0Var != null) {
            tb0Var.c();
        }
    }

    @Override // yads.c2
    public final void a() {
        ov ovVar = this.f108844h;
        if (ovVar != null) {
            ovVar.a();
        }
    }
}

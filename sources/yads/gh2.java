package yads;

import android.view.View;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public final class gh2 implements ov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f111201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f111202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mv f111203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uv f111204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m30 f111205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nh2 f111206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f111207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ma2 f111208h = ia2.a(true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fh2 f111209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final eh2 f111210j;

    public gh2(View view, ProgressBar progressBar, wk0 wk0Var, uv uvVar, m30 m30Var, nh2 nh2Var, long j10) {
        this.f111201a = view;
        this.f111202b = progressBar;
        this.f111203c = wk0Var;
        this.f111204d = uvVar;
        this.f111205e = m30Var;
        this.f111206f = nh2Var;
        this.f111207g = j10;
        this.f111209i = new fh2(d(), wk0Var, m30Var);
        this.f111210j = new eh2(progressBar, uvVar, j10);
    }

    @Override // yads.ov
    public final void a() {
        this.f111208h.d();
    }

    @Override // yads.ov
    public final void b() {
        this.f111208h.b();
    }

    @Override // yads.ov
    public final void c() {
        uv uvVar = this.f111204d;
        ProgressBar progressBar = this.f111202b;
        int i10 = (int) this.f111207g;
        int i11 = (int) this.f111206f.f113910a;
        uvVar.getClass();
        progressBar.setMax(i10);
        progressBar.setVisibility(0);
        progressBar.setProgress(i11);
        long jMax = Math.max(0L, this.f111207g - this.f111206f.f113910a);
        if (jMax != 0) {
            this.f111203c.a(this.f111201a);
            ma2 ma2Var = this.f111208h;
            ma2Var.f113361e = this.f111210j;
            ma2Var.a(jMax, this.f111209i);
            this.f111205e.a(l30.f112934d);
        }
    }

    public final View d() {
        return this.f111201a;
    }

    @Override // yads.ov
    public final void invalidate() {
        this.f111208h.a();
    }
}

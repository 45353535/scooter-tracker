package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class tb0 implements ov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f116154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv f116155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m30 f116156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f116157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vv f116158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ja2 f116159f;

    public tb0(View view, mv mvVar, m30 m30Var, long j10, vv vvVar, ja2 ja2Var) {
        this.f116154a = view;
        this.f116155b = mvVar;
        this.f116156c = m30Var;
        this.f116157d = j10;
        this.f116158e = vvVar;
        this.f116159f = ja2Var;
        mvVar.a(d());
    }

    @Override // yads.ov
    public final void a() {
        ((ma2) this.f116159f).d();
    }

    @Override // yads.ov
    public final void b() {
        ((ma2) this.f116159f).b();
    }

    @Override // yads.ov
    public final void c() {
        sb0 sb0Var = new sb0(this.f116154a, this.f116155b, this.f116156c);
        long jMax = (long) Math.max(0.0d, this.f116157d - this.f116158e.f117208a);
        if (jMax == 0) {
            this.f116155b.b(this.f116154a);
            return;
        }
        ma2 ma2Var = (ma2) this.f116159f;
        ma2Var.f113361e = this.f116158e;
        ma2Var.a(jMax, sb0Var);
        this.f116156c.a(l30.f112934d);
    }

    public final View d() {
        return this.f116154a;
    }

    @Override // yads.ov
    public final void invalidate() {
        ((ma2) this.f116159f).a();
    }
}

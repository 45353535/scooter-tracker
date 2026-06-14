package yads;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class en2 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f110425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110426b;

    public en2(f2 f2Var, int i10) {
        this.f110425a = f2Var;
        this.f110426b = i10;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        if (this.f110426b == 1) {
            ((q2) this.f110425a).a(7);
        } else {
            ((q2) this.f110425a).a(6);
        }
    }

    @Override // yads.hf0
    public final void c() {
    }
}

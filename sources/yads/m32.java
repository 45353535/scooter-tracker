package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class m32 implements oh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n32 f113302a;

    public m32(n32 n32Var) {
        this.f113302a = n32Var;
    }

    @Override // yads.oh2
    public final void a(long j10, long j11) {
        n32 n32Var = this.f113302a;
        View view = n32Var.f113716c;
        if (view != null) {
            n32Var.f113714a.a(view, j10, j11);
        }
    }

    @Override // yads.oh2
    public final void a() {
        View view = this.f113302a.f113716c;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }
}

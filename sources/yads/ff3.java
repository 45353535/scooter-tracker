package yads;

import android.view.WindowManager;

/* JADX INFO: loaded from: classes4.dex */
public final class ff3 implements ef3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f110708a;

    public ff3(WindowManager windowManager) {
        this.f110708a = windowManager;
    }

    @Override // yads.ef3
    public final void a() {
    }

    @Override // yads.ef3
    public final void a(df3 df3Var) {
        df3Var.a(this.f110708a.getDefaultDisplay());
    }
}

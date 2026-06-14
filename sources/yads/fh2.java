package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class fh2 implements na2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mv f110728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m30 f110729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f110730c;

    public fh2(View view, wk0 wk0Var, m30 m30Var) {
        this.f110728a = wk0Var;
        this.f110729b = m30Var;
        this.f110730c = new WeakReference(view);
    }

    @Override // yads.na2
    public final void a() {
        View view = (View) this.f110730c.get();
        if (view != null) {
            this.f110728a.b(view);
            this.f110729b.a(l30.f112935e);
        }
    }
}

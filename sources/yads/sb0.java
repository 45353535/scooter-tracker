package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class sb0 implements na2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mv f115736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m30 f115737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f115738c;

    public sb0(View view, mv mvVar, m30 m30Var) {
        this.f115736a = mvVar;
        this.f115737b = m30Var;
        this.f115738c = new WeakReference(view);
    }

    @Override // yads.na2
    public final void a() {
        View view = (View) this.f115738c.get();
        if (view != null) {
            this.f115736a.b(view);
            this.f115737b.a(l30.f112935e);
        }
    }
}

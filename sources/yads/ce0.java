package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ce0 implements na2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rx2 f109378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f109379b;

    public ce0(View view, rx2 rx2Var) {
        this.f109378a = rx2Var;
        this.f109379b = new WeakReference(view);
    }

    @Override // yads.na2
    public final void a() {
        View view = (View) this.f109379b.get();
        if (view != null) {
            this.f109378a.b(view);
        }
    }
}

package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class gp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f111297a;

    public gp2(WeakReference weakReference) {
        this.f111297a = weakReference;
    }

    public final void a() {
        View view = (View) this.f111297a.get();
        if (view != null) {
            view.setVisibility(0);
        }
    }
}

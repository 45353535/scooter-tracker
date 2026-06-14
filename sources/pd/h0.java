package pd;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f98231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup.LayoutParams f98232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98233c = -1;

    public final void a() {
        WeakReference weakReference = this.f98231a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f98231a = null;
        this.f98232b = null;
        this.f98233c = -1;
    }

    public final void b(View view) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(view, "view");
        WeakReference weakReference = this.f98231a;
        if (weakReference != null && (viewGroup = (ViewGroup) weakReference.get()) != null) {
            k0.c(viewGroup, view, this.f98233c, this.f98232b);
        }
        a();
    }

    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        this.f98231a = new WeakReference(viewGroup);
        this.f98232b = view.getLayoutParams();
        viewGroup.indexOfChild(view);
    }
}

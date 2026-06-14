package pd;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f98235a = new i0();

    private i0() {
    }

    public static final void a(ViewGroup container, View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        b(container, view, null);
    }

    public static final void b(ViewGroup container, View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        k0.b(container, view, layoutParams);
    }

    public static final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final View d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return k0.g(view);
    }

    public static final int e() {
        return View.generateViewId();
    }

    public static final Rect f(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return k0.i(view);
    }

    public static final void g(View view) {
        k0.j(view);
    }

    public static final boolean h(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return k0.l(view);
    }

    public static final boolean i(int i10) {
        return i10 == 0;
    }

    public static final boolean j(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return k0.m(view);
    }

    public static final Unit k(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return k0.n(view);
    }

    public static final void l(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m(view, WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
    }

    public static final void m(View view, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        k0.p(view, i10);
    }

    public static final void n(View view) {
        k0.r(view);
    }
}

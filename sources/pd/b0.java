package pd;

import android.app.Activity;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f98218a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final wd.e f98219b = new yd.c();

    private b0() {
    }

    public static final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        d0.d(activity);
    }

    public static final boolean b(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        return f98219b.b(runnable);
    }

    public static final Unit c(Window window, int i10) {
        return d0.i(window, i10);
    }
}

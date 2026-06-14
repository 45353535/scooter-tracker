package yads;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w23 f114392a;

    public /* synthetic */ oq2() {
        this(new w23());
    }

    public final Point a(Context context) {
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        final WindowManager windowManager = (WindowManager) systemService;
        w23 w23Var = this.f114392a;
        Callable callable = new Callable() { // from class: yads.n00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return oq2.a(windowManager);
            }
        };
        w23Var.getClass();
        final Display display = (Display) w23.a(callable, windowManager, "getting display", "WindowManager");
        final Point point = new Point(0, 0);
        w23 w23Var2 = this.f114392a;
        Callable callable2 = new Callable() { // from class: yads.q00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return oq2.a(display, point, this);
            }
        };
        w23Var2.getClass();
        Object objA = w23.a(callable2, display, "getting display metrics", "Display");
        Object obj = point;
        if (objA != null) {
            obj = objA;
        }
        return (Point) obj;
    }

    public oq2(w23 w23Var) {
        this.f114392a = w23Var;
    }

    public static final Display a(WindowManager windowManager) {
        return windowManager.getDefaultDisplay();
    }

    public static final Point a(Display display, Point point, oq2 oq2Var) {
        if (display == null) {
            return point;
        }
        oq2Var.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}

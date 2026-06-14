package yads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cj3 f115019a = new cj3(new o92(), new ej3());

    public static final int a(int i10, float f10) {
        return Color.argb(kotlin.ranges.g.e(0, kotlin.ranges.g.j(255, (int) ((255 * (100 - f10)) / 100.0f))), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static final float b(int i10, float f10) {
        return ((i10 + 0.0f) / f10) + 0.5f;
    }

    public static final boolean c(View view) {
        Drawable background = view.getBackground();
        return (background == null || ((float) background.getAlpha()) == 0.0f) ? false : true;
    }

    public static final int d(Context context) {
        return (int) b(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().density);
    }

    public static final boolean b(View view) {
        return !view.isShown() || view.getAlpha() == 0.0f;
    }

    public static final int b(Context context) {
        return (int) b(c(context), context.getResources().getDisplayMetrics().density);
    }

    public static final int c(Context context) {
        Object objB;
        int iHeight;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA != null && hr2VarA.C0) {
            try {
                Result.Companion companion = Result.f93230c;
                Object systemService = context.getSystemService("window");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                WindowManager windowManager = (WindowManager) systemService;
                if (Build.VERSION.SDK_INT >= 30) {
                    iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    iHeight = displayMetrics.heightPixels;
                }
                objB = Result.b(Integer.valueOf(iHeight));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            Integer numValueOf = Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels);
            if (Result.i(objB)) {
                objB = numValueOf;
            }
            return ((Number) objB).intValue();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static final int a(Context context, int i10) {
        return zf.a.d(i10 / context.getResources().getDisplayMetrics().density);
    }

    public static final int a(Context context, float f10) {
        return zf.a.d(TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics()));
    }

    public static final int a(View view) {
        int i10;
        if (view == null || !view.isShown() || (i10 = f115019a.a(view).f109937a) <= 0) {
            return 0;
        }
        int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
        int height = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0;
        }
        return (i10 * 100) / (height * width);
    }

    public static final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (viewGroup.getParent() instanceof ViewGroup) {
                    ViewParent parent = viewGroup.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(viewGroup);
                }
            } catch (Exception unused) {
            }
            try {
                viewGroup.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    public static final int a(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }
}

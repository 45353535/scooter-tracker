package f1;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f69978a;

    public h0(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f69978a = new WeakReference(activity);
    }

    public final DisplayMetrics a() {
        Activity activity = (Activity) this.f69978a.get();
        if (activity != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics;
        }
        DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        return displayMetrics2;
    }

    public final s b() {
        DisplayMetrics displayMetricsA = a();
        int i10 = displayMetricsA.widthPixels;
        int i11 = displayMetricsA.heightPixels;
        float f10 = displayMetricsA.density;
        WindowInsetsCompat windowInsetsCompatC = c();
        if (windowInsetsCompatC == null) {
            return new s(i10, i11, f10, null, null, 24, null);
        }
        Insets insets = windowInsetsCompatC.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        DisplayCutoutCompat displayCutout = windowInsetsCompatC.getDisplayCutout();
        Insets insetsOf = displayCutout != null ? Insets.of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom()) : Insets.NONE;
        Intrinsics.checkNotNull(insetsOf);
        Insets insetsOf2 = Insets.of(Math.max(insets.left, insetsOf.left), Math.max(insets.top, insetsOf.top), Math.max(insets.right, insetsOf.right), Math.max(insets.bottom, insetsOf.bottom));
        Intrinsics.checkNotNullExpressionValue(insetsOf2, "of(...)");
        int i12 = (i10 - insetsOf2.left) - insetsOf2.right;
        int i13 = (i11 - insetsOf2.top) - insetsOf2.bottom;
        eg.m("VAST rendering container computed: width=" + i12 + ", height=" + i13 + ", density=" + f10, null, 2, null);
        return new s(i12, i13, f10, null, insetsOf2, 8, null);
    }

    public final WindowInsetsCompat c() {
        Window window;
        View decorView;
        Activity activity = (Activity) this.f69978a.get();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(decorView);
        eg.e("Window insets retrieved: " + rootWindowInsets, null, 2, null);
        return rootWindowInsets;
    }
}

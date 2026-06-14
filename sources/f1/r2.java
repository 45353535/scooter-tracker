package f1;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f70887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f70888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f70889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DisplayMetrics f70890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f70891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f70892f;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70893f = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public r2(WindowManager windowManager, DisplayMetrics displayMetrics, Function0 androidVersion, DisplayMetrics realDisplayMetrics) {
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(realDisplayMetrics, "realDisplayMetrics");
        this.f70887a = windowManager;
        this.f70888b = displayMetrics;
        this.f70889c = androidVersion;
        this.f70890d = realDisplayMetrics;
        this.f70891e = displayMetrics.density;
        this.f70892f = displayMetrics.densityDpi;
    }

    public final i3 a() {
        try {
            if (((Number) this.f70889c.invoke()).intValue() >= 30) {
                return b(this.f70887a);
            }
            DisplayMetrics displayMetrics = this.f70888b;
            return new i3(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e10) {
            eg.i("Cannot create device size", e10);
            return new i3(0, 0);
        }
    }

    public final i3 b(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        WindowInsets windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "getWindowInsets(...)");
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        int i10 = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
        int i11 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
        Rect bounds = currentWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        return new i3(bounds.width() - i10, bounds.height() - i11);
    }

    public final float c() {
        return this.f70891e;
    }

    public final int d() {
        return this.f70892f;
    }

    public final i3 e() {
        try {
            if (((Number) this.f70889c.invoke()).intValue() >= 30) {
                Rect bounds = this.f70887a.getCurrentWindowMetrics().getBounds();
                return new i3(bounds.width(), bounds.height());
            }
            this.f70890d.setTo(this.f70888b);
            Display defaultDisplay = this.f70887a.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getRealMetrics(this.f70890d);
            }
            DisplayMetrics displayMetrics = this.f70890d;
            return new i3(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e10) {
            eg.i("Cannot create size", e10);
            return new i3(0, 0);
        }
    }

    public /* synthetic */ r2(WindowManager windowManager, DisplayMetrics displayMetrics, Function0 function0, DisplayMetrics displayMetrics2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowManager, displayMetrics, (i10 & 4) != 0 ? a.f70893f : function0, (i10 & 8) != 0 ? new DisplayMetrics() : displayMetrics2);
    }
}

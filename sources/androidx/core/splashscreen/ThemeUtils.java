package androidx.core.splashscreen;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils;", "", "<init>", "()V", "Api31", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThemeUtils {

    @NotNull
    public static final ThemeUtils INSTANCE = new ThemeUtils();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils$Api31;", "", "<init>", "()V", "applyThemesSystemBarAppearance", "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "decor", "Landroid/view/View;", "tv", "Landroid/util/TypedValue;", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Api31 {

        @NotNull
        public static final Api31 INSTANCE = new Api31();

        private Api31() {
        }

        public static final void applyThemesSystemBarAppearance(@NotNull Resources.Theme theme, @NotNull View decor) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(decor, "decor");
            applyThemesSystemBarAppearance$default(theme, decor, null, 4, null);
        }

        public static /* synthetic */ void applyThemesSystemBarAppearance$default(Resources.Theme theme, View view, TypedValue typedValue, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                typedValue = new TypedValue();
            }
            applyThemesSystemBarAppearance(theme, view, typedValue);
        }

        public static final void applyThemesSystemBarAppearance(@NotNull Resources.Theme theme, @NotNull View decor, @NotNull TypedValue tv) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(decor, "decor");
            Intrinsics.checkNotNullParameter(tv, "tv");
            int i10 = (!theme.resolveAttribute(android.R.attr.windowLightStatusBar, tv, true) || tv.data == 0) ? 0 : 8;
            if (theme.resolveAttribute(android.R.attr.windowLightNavigationBar, tv, true) && tv.data != 0) {
                i10 |= 16;
            }
            WindowInsetsController windowInsetsController = decor.getWindowInsetsController();
            Intrinsics.checkNotNull(windowInsetsController);
            windowInsetsController.setSystemBarsAppearance(i10, 24);
        }
    }

    private ThemeUtils() {
    }
}

package org.bidon.sdk.ads.banner.helper;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0016"}, d2 = {"Lorg/bidon/sdk/ads/banner/helper/DeviceInfo;", "", "<init>", "()V", "applicationContext", "Landroid/content/Context;", "value", "", "isTablet", "()Z", "isLandscapeConfiguration", "screenWidthDp", "", "getScreenWidthDp", "()I", "screenHeightDp", "getScreenHeightDp", "init", "", POBCoreNativeConstants.NATIVE_CONTEXT, "getDisplay", "Landroid/view/Display;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceInfo {

    @NotNull
    public static final DeviceInfo INSTANCE = new DeviceInfo();

    @Nullable
    private static Context applicationContext;
    private static boolean isTablet;

    private DeviceInfo() {
    }

    private final Display getDisplay(Context context) {
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return ((WindowManager) systemService).getDefaultDisplay();
    }

    public final int getScreenHeightDp() {
        Resources resources;
        DisplayMetrics displayMetrics;
        try {
            Result.Companion companion = Result.f93230c;
            Context context = applicationContext;
            if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                return (int) (displayMetrics.heightPixels / displayMetrics.density);
            }
            return 0;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Object objB = Result.b(d.a(th2));
            if (Result.i(objB)) {
                objB = null;
            }
            Object obj = (Void) objB;
            if (obj != null) {
                return ((Number) obj).intValue();
            }
            return 0;
        }
    }

    public final int getScreenWidthDp() {
        Resources resources;
        DisplayMetrics displayMetrics;
        try {
            Result.Companion companion = Result.f93230c;
            Context context = applicationContext;
            if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                return (int) (displayMetrics.widthPixels / displayMetrics.density);
            }
            return 0;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Object objB = Result.b(d.a(th2));
            if (Result.i(objB)) {
                objB = null;
            }
            Object obj = (Void) objB;
            if (obj != null) {
                return ((Number) obj).intValue();
            }
            return 0;
        }
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        applicationContext = context.getApplicationContext();
        Display display = getDisplay(context);
        if (display == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Point point = new Point();
        display.getRealSize(point);
        display.getMetrics(displayMetrics);
        isTablet = Math.sqrt(Math.pow((double) (((float) point.x) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) point.y) / displayMetrics.ydpi), 2.0d)) > 7.0d;
    }

    public final boolean isLandscapeConfiguration() {
        Resources resources;
        Configuration configuration;
        Context context = applicationContext;
        return (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true;
    }

    public final boolean isTablet() {
        return isTablet;
    }
}

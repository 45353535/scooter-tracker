package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¨\u0006\u0014"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/PackageManagerUtils;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "getAppVersionCodeString", "", "getAppVersionCodeInt", "getAppVersionName", "Ljava/lang/Class;", "clazz", "Landroid/content/pm/ServiceInfo;", "getServiceInfo", "Landroid/content/pm/PackageInfo;", "getPackageInfo", "authority", "", "hasContentProvider", "Landroid/content/pm/ProviderInfo;", "resolveContentProvider", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public final class PackageManagerUtils {

    @NotNull
    public static final PackageManagerUtils INSTANCE = new PackageManagerUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SafePackageManager f75279a = new SafePackageManager();

    private PackageManagerUtils() {
    }

    public static final int getAppVersionCodeInt(@NotNull Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    @NotNull
    public static final String getAppVersionCodeString(@NotNull Context context) {
        return String.valueOf(getAppVersionCodeInt(context));
    }

    @NotNull
    public static final String getAppVersionName(@NotNull Context context) {
        String str;
        PackageInfo packageInfo = getPackageInfo(context);
        return (packageInfo == null || (str = packageInfo.versionName) == null) ? IdManager.DEFAULT_VERSION_NAME : str;
    }

    @Nullable
    public static final PackageInfo getPackageInfo(@NotNull Context context) {
        return f75279a.getPackageInfo(context, context.getPackageName());
    }

    @Nullable
    public static final ServiceInfo getServiceInfo(@NotNull Context context, @NotNull Class<?> clazz) {
        return f75279a.getServiceInfo(context, new ComponentName(context, clazz), 4);
    }

    public static final boolean hasContentProvider(@NotNull Context context, @NotNull String authority) {
        return resolveContentProvider(context, authority) != null;
    }

    @Nullable
    public static final ProviderInfo resolveContentProvider(@NotNull Context context, @NotNull String authority) {
        return f75279a.resolveContentProvider(context, authority);
    }
}

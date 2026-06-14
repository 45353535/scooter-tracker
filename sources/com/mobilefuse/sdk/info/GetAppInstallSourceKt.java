package com.mobilefuse.sdk.info;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.os.Build;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"appInstallSource", "", "getAppInstallSource", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getInstallingPackageName", "mobilefuse-sdk-telemetry_release"}, k = 2, mv = {1, 4, 3})
public final class GetAppInstallSourceKt {
    private static String appInstallSource;

    @NotNull
    public static final String getAppInstallSource(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = appInstallSource;
        if (str != null) {
            return str;
        }
        String installingPackageName = getInstallingPackageName(context);
        appInstallSource = installingPackageName;
        return installingPackageName;
    }

    private static final String getInstallingPackageName(Context context) {
        String installerPackageName;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                Intrinsics.checkNotNullExpressionValue(installSourceInfo, "context.packageManager.g…Info(context.packageName)");
                installerPackageName = installSourceInfo.getInstallingPackageName();
            } else {
                installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            }
        } catch (Throwable unused) {
            installerPackageName = "error";
        }
        return installerPackageName == null ? "none" : installerPackageName;
    }
}

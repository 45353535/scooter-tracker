package com.appodeal.ads.modules.common.internal.data;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0014\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0012H&J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u0019"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;", "Lcom/appodeal/ads/modules/common/internal/data/SessionData;", "getSdkKey", "", "getLastResumedActivityName", "getSdkVersion", "getFrameworkName", "getPluginVersion", "getFrameworkVersion", "getPackageName", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getVersionName", "getVersionCode", "", "getSegmentId", "", "isTestMode", "", "getTargetSdkVersion", "isAppodealInitialized", "isAppodealInitializing", "getPackageInfo", "Landroid/content/pm/PackageInfo;", "getInstallerPackageName", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ApplicationData extends SessionData {
    String getFrameworkName();

    String getFrameworkVersion();

    String getInstallerPackageName(Context context);

    String getLastResumedActivityName();

    PackageInfo getPackageInfo(Context context);

    String getPackageName(Context context);

    String getPluginVersion();

    String getSdkKey();

    String getSdkVersion();

    long getSegmentId();

    String getTargetSdkVersion(Context context);

    int getVersionCode(Context context);

    String getVersionName(Context context);

    boolean isAppodealInitialized();

    boolean isAppodealInitializing();

    boolean isTestMode();
}

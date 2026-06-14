package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.wrappers.Wrappers;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
@ShowFirstParty
@KeepForSdk
public class GooglePlayServicesUtilLight {

    @KeepForSdk
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;

    @KeepForSdk
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;

    @NonNull
    @KeepForSdk
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @NonNull
    @KeepForSdk
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @KeepForSdk
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;

    @NonNull
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    @NonNull
    @KeepForSdk
    public static final String GOOGLE_SERVICES_FRAMEWORK_PACKAGE = "com.google.android.gsf";

    @VisibleForTesting
    public static boolean zza = false;

    @VisibleForTesting
    public static boolean zzb = false;

    @KeepForSdk
    @Deprecated
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    @KeepForSdk
    GooglePlayServicesUtilLight() {
    }

    @KeepForSdk
    @Deprecated
    public static void cancelAvailabilityErrorNotifications(@NonNull Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (SecurityException e10) {
            Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e10);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @KeepForSdk
    @Deprecated
    public static void ensurePlayServicesAvailable(@NonNull Context context, int i10) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i10);
        if (iIsGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, EidRequestBuilder.REQUEST_FIELD_EMAIL);
            StringBuilder sb2 = new StringBuilder(String.valueOf(iIsGooglePlayServicesAvailable).length() + 46);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(iIsGooglePlayServicesAvailable);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (errorResolutionIntent != null) {
                throw new GooglePlayServicesRepairableException(iIsGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
            }
            throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getApkVersion(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getClientVersion(@NonNull Context context) {
        Preconditions.checkState(true);
        return ClientLibraryUtils.getClientVersion(context, context.getPackageName());
    }

    @Nullable
    @KeepForSdk
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i10, @NonNull Context context, int i11) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i10, i11);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static String getErrorString(int i10) {
        return ConnectionResult.zza(i10);
    }

    @Deprecated
    @Nullable
    @ShowFirstParty
    @KeepForSdk
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i10) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, i10, null);
    }

    @Nullable
    @KeepForSdk
    public static Context getRemoteContext(@NonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Nullable
    @KeepForSdk
    public static Resources getRemoteResource(@NonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static boolean honorsDebugCertificates(@NonNull Context context) {
        try {
            if (!zzb) {
                try {
                    PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                    GoogleSignatureVerifier.getInstance(context);
                    if (packageInfo == null || GoogleSignatureVerifier.zza(packageInfo, false) || !GoogleSignatureVerifier.zza(packageInfo, true)) {
                        zza = false;
                    } else {
                        zza = true;
                    }
                    zzb = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    zzb = true;
                }
            }
            return zza || !DeviceProperties.isUserBuild();
        } catch (Throwable th2) {
            zzb = true;
            throw th2;
        }
    }

    @HideFirstParty
    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isGooglePlayServicesUid(@NonNull Context context, int i10) {
        return UidVerifier.isGooglePlayServicesUid(context, i10);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(@NonNull Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(@NonNull Context context, int i10) {
        if (i10 == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    @KeepForSdk
    public static boolean isRestrictedUserProfile(@NonNull Context context) {
        Object systemService = context.getSystemService("user");
        Preconditions.checkNotNull(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isSidewinderDevice(@NonNull Context context) {
        return DeviceProperties.isSidewinder(context);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isUserRecoverableError(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @KeepForSdk
    @Deprecated
    public static boolean uidHasPackageName(@NonNull Context context, int i10, @NonNull String str) {
        return UidVerifier.uidHasPackageName(context, i10, str);
    }

    static boolean zza(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r11, int r12) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }
}

package com.appodeal.ads.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f14968a = new HashSet();

    public static List a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return Arrays.asList((Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) : packageManager.getPackageInfo(str, 4096)).requestedPermissions);
        } catch (Exception e10) {
            Log.log(LogConstants.KEY_SDK, "GetPermissions", "Failed to receive PackageInfo: " + e10.getMessage());
            return new ArrayList();
        }
    }

    public static void b(Context context) {
        boolean z10;
        try {
            PackageManager packageManager = context.getPackageManager();
            z10 = (Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo("com.google.android.gms", PackageManager.PackageInfoFlags.of(128L)) : packageManager.getPackageInfo("com.google.android.gms", 128)).applicationInfo.enabled;
        } catch (Exception e10) {
            Log.log(LogConstants.KEY_SDK, "MetaDataCheck", "Failed to receive PackageInfo: " + e10.getMessage());
            z10 = false;
        }
        if (z10) {
            return;
        }
        Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_INTEGRATION, "Google Play Services is not installed");
    }

    public static boolean c(Activity activity) {
        return activity != null && f14968a.contains(activity.getLocalClassName());
    }

    public static void d(Context context) {
        try {
            b bVar = new b();
            bVar.removeAll(a(context, context.getPackageName()));
            if (bVar.isEmpty()) {
                return;
            }
            String str = "Missing permissions:";
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                str = str + IOUtils.LINE_SEPARATOR_UNIX + ((String) it.next());
            }
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_INTEGRATION, str);
        } catch (Exception e10) {
            Log.log(LogConstants.KEY_SDK, "PermissionsCheck", "Failed to check permission: " + e10.getMessage());
        }
    }
}

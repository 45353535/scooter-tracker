package com.bytedance.sdk.openadsdk.core.qdl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import com.bytedance.sdk.component.utils.aaj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static Boolean f17416ud;

    public static String qdl(Context context) {
        String str = qdl;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                qdl = null;
            } else if (TextUtils.isEmpty(str2) || qdl(context, intent) || !arrayList.contains(str2)) {
                qdl = (String) arrayList.get(0);
            } else {
                qdl = str2;
            }
        } catch (Throwable th2) {
            aaj.lnr("CustomTabsHelper", th2.getMessage());
        }
        return qdl;
    }

    public static int ud(Context context) {
        return !TextUtils.isEmpty(qdl(context)) ? 1 : 0;
    }

    private static boolean qdl(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (listQueryIntentActivities.size() == 0) {
                return false;
            }
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        return false;
    }

    public static int qdl() {
        Boolean bool = f17416ud;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void qdl(Context context, String str, CustomTabsIntent customTabsIntent, Uri uri) {
        customTabsIntent.intent.setPackage(str);
        customTabsIntent.launchUrl(context, uri);
    }
}

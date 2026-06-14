package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n2 {
    public static boolean a(Context context, String url, boolean z10) {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        intent.addCategory("android.intent.category.BROWSABLE");
        Bundle bundle = new Bundle();
        Object obj = null;
        bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
        intent.putExtras(bundle);
        if (z10) {
            try {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.APP_BROWSER");
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 0);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listQueryIntentActivities) {
                    ResolveInfo resolveInfo = (ResolveInfo) obj2;
                    if (resolveInfo != null && (activityInfo2 = resolveInfo.activityInfo) != null && activityInfo2.enabled && activityInfo2.exported && activityInfo2.packageName != null) {
                        arrayList.add(obj2);
                    }
                }
                List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 0);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities2, "queryIntentActivities(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listQueryIntentActivities2) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) obj3;
                    if (resolveInfo2 != null && (activityInfo = resolveInfo2.activityInfo) != null && activityInfo.enabled && activityInfo.exported && activityInfo.packageName != null) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                loop2: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ResolveInfo resolveInfo3 = (ResolveInfo) next;
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (resolveInfo3.activityInfo.packageName.equals(((ResolveInfo) it2.next()).activityInfo.packageName)) {
                                obj = next;
                                break loop2;
                            }
                        }
                    }
                }
                ResolveInfo resolveInfo4 = (ResolveInfo) obj;
                if (resolveInfo4 != null) {
                    intent.setPackage(resolveInfo4.activityInfo.packageName);
                }
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Throwable th3) {
            g9.a(th3);
            return false;
        }
    }
}

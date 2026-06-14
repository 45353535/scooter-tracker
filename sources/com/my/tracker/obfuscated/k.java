package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.j;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f61616a = new j(Collections.EMPTY_LIST);

    private static String a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((j.a) it.next()).f61593a);
        }
        return TextUtils.join(StringUtils.COMMA, arrayList);
    }

    private static List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new j.a(applicationInfo.packageName, v2.b(packageInfo.firstInstallTime)));
            }
        }
        return arrayList;
    }

    public j a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, Context context) {
        List<PackageInfo> installedPackages;
        if (installedPackagesProvider == null) {
            return f61616a;
        }
        try {
            installedPackages = installedPackagesProvider.getInstalledPackages();
        } catch (Throwable unused) {
            x2.b("MyTracker error: exception at InstalledPackagesProvider::getInstalledPackages()");
            installedPackages = null;
        }
        if (installedPackages != null && !installedPackages.isEmpty()) {
            List listB = b(installedPackages);
            if (listB.isEmpty()) {
                return f61616a;
            }
            String strA = a(listB);
            String strG = p1.a(context).g();
            String strA2 = b0.a(strA);
            if (strG.equals(strA2)) {
                x2.a("AppsDataProvider: Apps hash did not changed");
                return f61616a;
            }
            x2.a("AppsDataProvider: Apps hash changed");
            p1.a(context).h(strA2);
            return new j(listB);
        }
        return f61616a;
    }
}

package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes11.dex */
public abstract class t {
    public static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th2) {
            x2.b("InstallHandler: unable to read app version from package manager: " + th2);
            return null;
        }
    }

    public static String b(Context context) {
        try {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th2) {
            x2.a("ReferrerHandler: cannot retrieve \"installer\", exception", th2);
            return null;
        }
    }
}

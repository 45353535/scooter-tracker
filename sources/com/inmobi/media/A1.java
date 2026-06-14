package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f36541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f36542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f36543e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte f36544f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        PackageManager packageManager;
        byte b10 = 2;
        f36544f = (byte) 2;
        Context context = Ji.f37157a;
        String strValueOf = null;
        if (context != null) {
            try {
                packageManager = context.getPackageManager();
            } catch (Exception unused) {
            }
        } else {
            packageManager = null;
        }
        ApplicationInfo applicationInfo = packageManager != null ? packageManager.getApplicationInfo(context.getPackageName(), 128) : null;
        if (applicationInfo != null) {
            String str = applicationInfo.packageName;
            f36539a = str;
            f36542d = applicationInfo.loadLabel(packageManager).toString();
            Intrinsics.checkNotNull(str);
            f36540b = packageManager.getInstallerPackageName(str);
        }
        PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 128) : null;
        if (packageInfo != null && ((strValueOf = packageInfo.versionName) == null || strValueOf.length() == 0)) {
            strValueOf = Build.VERSION.SDK_INT < 28 ? String.valueOf(packageInfo.versionCode) : String.valueOf(packageInfo.getLongVersionCode());
        }
        if (F3.a(strValueOf)) {
            f36541c = strValueOf;
        }
        try {
            C4148x5.f39893a.getClass();
            b10 = C4148x5.w() ? !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : 0;
        } catch (Error | Exception unused2) {
        }
        f36544f = b10;
        String str2 = f36539a;
        if (str2 != null) {
            f36543e.put("u-appbid", str2);
        }
        String str3 = f36542d;
        if (str3 != null) {
            f36543e.put("u-appdnm", str3);
        }
        String str4 = f36541c;
        if (str4 != null) {
            f36543e.put("u-appver", str4);
        }
        f36543e.put("u-appsecure", String.valueOf((int) b10));
    }
}

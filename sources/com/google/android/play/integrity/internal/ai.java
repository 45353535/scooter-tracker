package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* JADX INFO: loaded from: classes9.dex */
public final class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s f28776a = new s("PhoneskyVerificationUtils");

    public static int a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && c(packageInfo.signatures)) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static boolean b(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                if (c(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private static boolean c(Signature[] signatureArr) {
        if (signatureArr == null || (signatureArr.length) == 0) {
            f28776a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        for (Signature signature : signatureArr) {
            String strA = ah.a(signature.toByteArray());
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA)) {
                return true;
            }
        }
        return false;
    }
}

package com.startapp.sdk.internal;

import android.content.pm.PackageManager;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xe {
    public static boolean a(String str) {
        String[] strArr = ye.f65605c;
        boolean z10 = false;
        for (int i10 = 0; i10 < 14; i10++) {
            if (new File(strArr[i10], str).exists()) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean a(PackageManager packageManager, String[] strArr) {
        boolean z10 = false;
        for (String str : strArr) {
            try {
                packageManager.getPackageInfo(str, 0);
                z10 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z10;
    }
}

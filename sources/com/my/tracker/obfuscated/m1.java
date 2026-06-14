package com.my.tracker.obfuscated;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f61679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f61680b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        f61679a = i10 <= 30;
        if (i10 <= 30 && !Build.MODEL.equals("Pixel 5")) {
            z10 = true;
        }
        f61680b = z10;
    }

    public static boolean a() {
        return false;
    }

    public static boolean a(String str, Context context) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}

package com.my.target;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f59317a = {"com.vkontakte.android", "com.my.targetdemo5.initauto", "com.my.targetdemo5.initmanual", "com.my.targetdemo5.logoff"};

    public static boolean a(Context context) {
        String packageName = context.getPackageName();
        for (String str : f59317a) {
            if (str.equals(packageName)) {
                return true;
            }
        }
        return false;
    }
}

package com.my.target;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c2 {
    public static boolean a(String str, Context context) {
        int iCheckCallingOrSelfPermission;
        try {
            iCheckCallingOrSelfPermission = context.checkCallingOrSelfPermission(str);
        } catch (Throwable th2) {
            gb.a("FPDataProvider: Unable to check " + str + " permission! Unexpected throwable in Context.checkCallingOrSelfPermission() method - " + th2.getMessage());
            iCheckCallingOrSelfPermission = -1;
        }
        return iCheckCallingOrSelfPermission == 0;
    }
}

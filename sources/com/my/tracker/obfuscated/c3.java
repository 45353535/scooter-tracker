package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile String f61386a;

    public static String a(Context context) {
        String strK;
        String str = f61386a;
        if (str != null) {
            return str;
        }
        synchronized (c3.class) {
            try {
                strK = f61386a;
                if (strK == null) {
                    strK = p1.a(context).k();
                    if (TextUtils.isEmpty(strK)) {
                        strK = UUID.randomUUID().toString();
                        p1.a(context).k(strK);
                        f61386a = strK;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return strK;
    }
}

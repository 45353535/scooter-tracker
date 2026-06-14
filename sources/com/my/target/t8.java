package com.my.target;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class t8 {
    public r8 a(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str)) {
                gb.a("PostMessageParser: can't parse postMessage – type is empty");
                return null;
            }
            if (TextUtils.isEmpty(str2)) {
                gb.a("PostMessageParser: can't parse postMessage – action is empty");
                return null;
            }
            if (!TextUtils.isEmpty(str3)) {
                return r8.a(str, str2, str3);
            }
            gb.a("PostMessageParser: can't parse postMessage – params is empty");
            return null;
        } catch (Throwable th2) {
            gb.a("PostMessageParser: can't parse postMessage – " + th2.getMessage());
            return null;
        }
    }
}

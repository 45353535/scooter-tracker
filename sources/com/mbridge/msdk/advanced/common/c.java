package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f46243a = new HashMap();

    public static void a(String str, boolean z10) {
        f46243a.put(str, Boolean.valueOf(z10));
    }

    public static void b(String str) {
        f46243a.remove(str);
    }

    public static boolean a(String str) {
        if (f46243a.containsKey(str)) {
            return f46243a.get(str).booleanValue();
        }
        return false;
    }
}

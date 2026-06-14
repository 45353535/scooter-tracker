package com.my.target;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes11.dex */
public abstract class o5 {
    public static String a() {
        try {
            KotlinVersion.Companion companion = KotlinVersion.INSTANCE;
            Object obj = KotlinVersion.class.getDeclaredField("CURRENT").get(new Object());
            return obj == null ? "0" : obj.toString();
        } catch (Throwable unused) {
            return "0";
        }
    }
}

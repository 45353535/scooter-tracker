package com.startapp.sdk.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f64832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f64833b = new HashMap();

    public static synchronized Object a(int i10, Class cls) {
        try {
        } catch (RuntimeException e10) {
            g9.a(e10);
            return null;
        }
        return cls.cast(f64833b.remove(Integer.valueOf(i10)));
    }
}

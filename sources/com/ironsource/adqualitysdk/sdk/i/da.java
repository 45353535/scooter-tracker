package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hr;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class da extends cz {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Method m6142(List<Object> list) {
        hr hrVar = (hr) cz.m6139(list, 1, hr.class);
        return list.get(0) instanceof Class ? hs.m6618((Class) cz.m6139(list, 0, Class.class), hrVar) : hs.m6618(cz.m6139(list, 0, Object.class).getClass(), hrVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Method> m6143(List<Object> list) {
        hr hrVar = (hr) cz.m6139(list, 1, hr.class);
        return list.get(0) instanceof Class ? hs.m6620((Class) cz.m6139(list, 0, Class.class), hrVar) : hs.m6620(cz.m6139(list, 0, Object.class).getClass(), hrVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static hr.c m6144() {
        return new hr.c();
    }
}

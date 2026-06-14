package com.inmobi.media;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public abstract class S9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Ea f37701a;

    public static final Ea a() {
        Ea eaA;
        if (f37701a == null) {
            Context context = Ji.f37157a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                eaA = Da.a(context, "CrashSession-store");
            } else {
                eaA = null;
            }
            f37701a = eaA;
        }
        return f37701a;
    }
}

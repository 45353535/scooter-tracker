package com.facebook.appevents;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f19691a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19692b = n.class.getName();

    private n() {
    }

    public static final synchronized void a(a accessTokenAppIdPair, r0 appEvents) {
        if (e3.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            v2.h.b();
            q0 q0VarA = f.a();
            q0VarA.a(accessTokenAppIdPair, appEvents.d());
            f.b(q0VarA);
        } catch (Throwable th2) {
            e3.a.b(th2, n.class);
        }
    }

    public static final synchronized void b(e eventsToPersist) {
        if (e3.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
            v2.h.b();
            q0 q0VarA = f.a();
            for (a aVar : eventsToPersist.f()) {
                r0 r0VarC = eventsToPersist.c(aVar);
                if (r0VarC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                q0VarA.a(aVar, r0VarC.d());
            }
            f.b(q0VarA);
        } catch (Throwable th2) {
            e3.a.b(th2, n.class);
        }
    }
}

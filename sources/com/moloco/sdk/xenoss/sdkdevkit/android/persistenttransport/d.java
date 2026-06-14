package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.b;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f58943a = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.b();
        }
    });

    public static final a a() {
        return c();
    }

    public static final b b() {
        return d();
    }

    public static final b c() {
        return (b) f58943a.getValue();
    }

    public static final b d() {
        e eVarB;
        try {
            eVarB = b.i.f55834a.c();
        } catch (Exception e10) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "BestAttemptHttpRequest", "Failed to create PersistentHttpRequest, invoking NonPersistendHttpRequest", e10, false, 8, null);
            eVarB = k.b();
        }
        return new b(eVarB);
    }
}

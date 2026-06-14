package com.moloco.sdk.internal;

import com.moloco.sdk.service_locator.b;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f54452a = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.k0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l0.a();
        }
    });

    public static final j0 a() {
        return new j0(b.i.f55834a.c());
    }

    public static final i0 b() {
        return c();
    }

    public static final j0 c() {
        return (j0) f54452a.getValue();
    }
}

package com.moloco.sdk.internal;

import com.moloco.sdk.service_locator.b;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f54453a = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m.b();
        }
    });

    public static final j a() {
        return c();
    }

    public static final k b() {
        return new k(b.i.f55834a.c());
    }

    public static final k c() {
        return (k) f54453a.getValue();
    }
}

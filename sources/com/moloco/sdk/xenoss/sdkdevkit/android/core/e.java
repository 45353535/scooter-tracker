package com.moloco.sdk.xenoss.sdkdevkit.android.core;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import lf.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f58901a = i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.core.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e.a();
        }
    });

    public static final g a() {
        return new g();
    }

    public static final a b() {
        return c();
    }

    public static final g c() {
        return (g) f58901a.getValue();
    }
}

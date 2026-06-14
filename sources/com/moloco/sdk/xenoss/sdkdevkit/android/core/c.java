package com.moloco.sdk.xenoss.sdkdevkit.android.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe.a1;
import oe.x0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {
    public static final Unit a(long j10, x0 timeout) {
        Intrinsics.checkNotNullParameter(timeout, "$this$timeout");
        timeout.f(Long.valueOf(j10));
        return Unit.f93236a;
    }

    public static final void b(re.d dVar, final long j10) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        a1.o(dVar, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.core.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.a(j10, (x0) obj);
            }
        });
    }
}

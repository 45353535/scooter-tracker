package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class lk {
    public static void a(bg bgVar, boolean z10, Function0 lazyError) {
        Intrinsics.checkNotNullParameter(lazyError, "lazyError");
        if (!z10) {
            throw new C4352he((IronSourceError) lazyError.invoke());
        }
    }
}

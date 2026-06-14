package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class U7 implements M1 {
    @Override // com.ironsource.M1
    public void a(@NotNull InterfaceC4381ja observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.lifecycle.b.d().a(observer);
    }

    @Override // com.ironsource.M1
    public void b(@NotNull InterfaceC4381ja observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.lifecycle.b.d().b(observer);
    }
}

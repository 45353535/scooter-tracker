package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4310f6 {
    @NotNull
    public final C4293e6 a(@NotNull InterfaceC4327g6 listener, @NotNull C4441n0 adTools, @NotNull C4304f0 adProperties, @NotNull InterfaceC4514r6 fullscreenAdUnitFactory) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        return new C4293e6(listener, adTools, adProperties, null, fullscreenAdUnitFactory, 8, null);
    }
}

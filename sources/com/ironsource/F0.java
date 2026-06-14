package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class F0 implements Hb<E0, C4470oc> {
    @Override // com.ironsource.Hb
    @NotNull
    public C4470oc a(@NotNull E0 input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new C4470oc(input.e(), input.c(), input.b(), input.a());
    }
}

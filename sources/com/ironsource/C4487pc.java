package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4487pc implements Hb<C4470oc, C4305f1> {
    @Override // com.ironsource.Hb
    @NotNull
    public C4305f1 a(@NotNull C4470oc input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new C4305f1(input.d(), input.b(), input.a());
    }
}

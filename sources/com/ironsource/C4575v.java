package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4575v implements Hb<C4558u, E0> {
    @Override // com.ironsource.Hb
    @NotNull
    public E0 a(@NotNull C4558u input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new E0(input.f(), input.d(), input.e(), input.b(), input.a());
    }
}

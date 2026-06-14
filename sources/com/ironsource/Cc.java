package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Cc extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cc(@NotNull Exception e10) {
        super("Missing Headers", e10);
        Intrinsics.checkNotNullParameter(e10, "e");
    }
}

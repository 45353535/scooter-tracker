package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4251bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f42775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f42776b;

    public C4251bf(@NotNull String identifier, @NotNull String baseConst) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(baseConst, "baseConst");
        this.f42775a = identifier;
        this.f42776b = baseConst;
    }

    @NotNull
    public final String a() {
        return this.f42775a + "_" + this.f42776b;
    }
}

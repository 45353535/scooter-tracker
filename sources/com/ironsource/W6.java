package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class W6 implements X6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC4225a7 f41945b;

    public W6(long j10, @NotNull EnumC4225a7 recoveryStrategy) {
        Intrinsics.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.f41944a = j10;
        this.f41945b = recoveryStrategy;
    }

    @Override // com.ironsource.X6
    public long a() {
        return this.f41944a;
    }

    @Override // com.ironsource.X6
    @NotNull
    public EnumC4225a7 b() {
        return this.f41945b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W6(@NotNull Z6 feature) {
        this(feature.a(), feature.c());
        Intrinsics.checkNotNullParameter(feature, "feature");
    }
}

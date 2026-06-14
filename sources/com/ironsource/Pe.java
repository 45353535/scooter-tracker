package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final N f41599a;

    public Pe(@Nullable N n10) {
        this.f41599a = n10;
    }

    @Nullable
    public final N a() {
        return this.f41599a;
    }

    @NotNull
    public abstract We b();

    @NotNull
    public final C4558u a(@NotNull Hb<Pe, C4558u> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}

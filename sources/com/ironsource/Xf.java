package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4496q4 f42095a;

    public Xf(@NotNull InterfaceC4496q4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f42095a = currentTimeProvider;
    }

    public final boolean a(long j10, long j11) {
        long jA = this.f42095a.a();
        return j11 <= 0 || j10 <= 0 || jA < j10 || jA - j10 > j11;
    }
}

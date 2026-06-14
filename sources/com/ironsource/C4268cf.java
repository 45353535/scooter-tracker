package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4268cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final M3 f42829b;

    public C4268cf(int i10, @NotNull M3 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f42828a = i10;
        this.f42829b = unit;
    }

    public final int a() {
        return this.f42828a;
    }

    @NotNull
    public final M3 b() {
        return this.f42829b;
    }

    @NotNull
    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.f42828a + ", unit=" + this.f42829b + ")";
    }
}

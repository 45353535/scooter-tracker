package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final M3 f41809b;

    public Tc(long j10, @NotNull M3 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f41808a = j10;
        this.f41809b = unit;
    }

    public final long a() {
        return this.f41808a;
    }

    @NotNull
    public final M3 b() {
        return this.f41809b;
    }

    @NotNull
    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f41808a + " unit=" + this.f41809b + ")";
    }

    public /* synthetic */ Tc(long j10, M3 m32, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? M3.Second : m32);
    }
}

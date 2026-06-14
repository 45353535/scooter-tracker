package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f40904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f40905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f40906c;

    public Fa(long j10, long j11, boolean z10) {
        this.f40904a = j10;
        this.f40905b = j11;
        this.f40906c = z10;
    }

    public final long a() {
        return this.f40904a;
    }

    public final long b() {
        return this.f40905b;
    }

    public final boolean c() {
        return this.f40906c;
    }

    public final long d() {
        return this.f40904a;
    }

    public final long e() {
        return this.f40905b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fa)) {
            return false;
        }
        Fa fa2 = (Fa) obj;
        return this.f40904a == fa2.f40904a && this.f40905b == fa2.f40905b && this.f40906c == fa2.f40906c;
    }

    public final boolean f() {
        return this.f40906c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iA = ((androidx.collection.b.a(this.f40904a) * 31) + androidx.collection.b.a(this.f40905b)) * 31;
        boolean z10 = this.f40906c;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iA + r12;
    }

    @NotNull
    public String toString() {
        return "LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=" + this.f40904a + ", visibilityCheckerInterval=" + this.f40905b + ", isAutoRefreshEnabled=" + this.f40906c + ")";
    }

    @NotNull
    public final Fa a(long j10, long j11, boolean z10) {
        return new Fa(j10, j11, z10);
    }

    public static /* synthetic */ Fa a(Fa fa2, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = fa2.f40904a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = fa2.f40905b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            z10 = fa2.f40906c;
        }
        return fa2.a(j12, j13, z10);
    }
}

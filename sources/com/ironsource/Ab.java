package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC4431m9 f40402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f40403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f40404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f40405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f40406e;

    public Ab(@NotNull EnumC4431m9 instanceType, @NotNull String adSourceNameForEvents, long j10, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.f40402a = instanceType;
        this.f40403b = adSourceNameForEvents;
        this.f40404c = j10;
        this.f40405d = z10;
        this.f40406e = z11;
    }

    @NotNull
    public final EnumC4431m9 a() {
        return this.f40402a;
    }

    @NotNull
    public final String b() {
        return this.f40403b;
    }

    public final long c() {
        return this.f40404c;
    }

    public final boolean d() {
        return this.f40405d;
    }

    public final boolean e() {
        return this.f40406e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ab)) {
            return false;
        }
        Ab ab2 = (Ab) obj;
        return this.f40402a == ab2.f40402a && Intrinsics.areEqual(this.f40403b, ab2.f40403b) && this.f40404c == ab2.f40404c && this.f40405d == ab2.f40405d && this.f40406e == ab2.f40406e;
    }

    @NotNull
    public final String f() {
        return this.f40403b;
    }

    @NotNull
    public final EnumC4431m9 g() {
        return this.f40402a;
    }

    public final long h() {
        return this.f40404c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.f40402a.hashCode() * 31) + this.f40403b.hashCode()) * 31) + androidx.collection.b.a(this.f40404c)) * 31;
        boolean z10 = this.f40405d;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iHashCode + r12) * 31;
        boolean z11 = this.f40406e;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean i() {
        return this.f40406e;
    }

    public final boolean j() {
        return this.f40405d;
    }

    @NotNull
    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.f40402a + ", adSourceNameForEvents=" + this.f40403b + ", loadTimeoutInMills=" + this.f40404c + ", isOneFlow=" + this.f40405d + ", isMultipleAdObjects=" + this.f40406e + ")";
    }

    @NotNull
    public final Ab a(@NotNull EnumC4431m9 instanceType, @NotNull String adSourceNameForEvents, long j10, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new Ab(instanceType, adSourceNameForEvents, j10, z10, z11);
    }

    public static /* synthetic */ Ab a(Ab ab2, EnumC4431m9 enumC4431m9, String str, long j10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC4431m9 = ab2.f40402a;
        }
        if ((i10 & 2) != 0) {
            str = ab2.f40403b;
        }
        if ((i10 & 4) != 0) {
            j10 = ab2.f40404c;
        }
        if ((i10 & 8) != 0) {
            z10 = ab2.f40405d;
        }
        if ((i10 & 16) != 0) {
            z11 = ab2.f40406e;
        }
        long j11 = j10;
        return ab2.a(enumC4431m9, str, j11, z10, z11);
    }

    public /* synthetic */ Ab(EnumC4431m9 enumC4431m9, String str, long j10, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC4431m9, str, j10, z10, (i10 & 16) != 0 ? true : z11);
    }
}

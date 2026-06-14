package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f41623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f41624b;

    public Q9(@NotNull String advId, @NotNull String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        this.f41623a = advId;
        this.f41624b = advIdType;
    }

    @NotNull
    public final String a() {
        return this.f41623a;
    }

    @NotNull
    public final String b() {
        return this.f41624b;
    }

    @NotNull
    public final String c() {
        return this.f41623a;
    }

    @NotNull
    public final String d() {
        return this.f41624b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q9)) {
            return false;
        }
        Q9 q92 = (Q9) obj;
        return Intrinsics.areEqual(this.f41623a, q92.f41623a) && Intrinsics.areEqual(this.f41624b, q92.f41624b);
    }

    public int hashCode() {
        return (this.f41623a.hashCode() * 31) + this.f41624b.hashCode();
    }

    @NotNull
    public String toString() {
        return "IronSourceAdvId(advId=" + this.f41623a + ", advIdType=" + this.f41624b + ")";
    }

    @NotNull
    public final Q9 a(@NotNull String advId, @NotNull String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        return new Q9(advId, advIdType);
    }

    public static /* synthetic */ Q9 a(Q9 q92, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = q92.f41623a;
        }
        if ((i10 & 2) != 0) {
            str2 = q92.f41624b;
        }
        return q92.a(str, str2);
    }
}

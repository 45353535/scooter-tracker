package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4611x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f45813a;

    public C4611x1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String a() {
        return this.f45813a;
    }

    @NotNull
    public final String b() {
        return this.f45813a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4611x1) && Intrinsics.areEqual(this.f45813a, ((C4611x1) obj).f45813a);
    }

    public int hashCode() {
        return this.f45813a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f45813a + ")";
    }

    public C4611x1(@NotNull String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.f45813a = auctionData;
    }

    @NotNull
    public final C4611x1 a(@NotNull String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        return new C4611x1(auctionData);
    }

    public /* synthetic */ C4611x1(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ C4611x1 a(C4611x1 c4611x1, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4611x1.f45813a;
        }
        return c4611x1.a(str);
    }
}

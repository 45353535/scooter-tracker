package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4373j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f43399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final JSONObject f43400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final C4424m2 f43401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f43402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f43403e;

    public C4373j2(@NotNull String auctionId, @Nullable JSONObject jSONObject, @Nullable C4424m2 c4424m2, int i10, @NotNull String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.f43399a = auctionId;
        this.f43400b = jSONObject;
        this.f43401c = c4424m2;
        this.f43402d = i10;
        this.f43403e = auctionFallback;
    }

    @NotNull
    public final String a() {
        return this.f43399a;
    }

    @Nullable
    public final JSONObject b() {
        return this.f43400b;
    }

    @Nullable
    public final C4424m2 c() {
        return this.f43401c;
    }

    public final int d() {
        return this.f43402d;
    }

    @NotNull
    public final String e() {
        return this.f43403e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4373j2)) {
            return false;
        }
        C4373j2 c4373j2 = (C4373j2) obj;
        return Intrinsics.areEqual(this.f43399a, c4373j2.f43399a) && Intrinsics.areEqual(this.f43400b, c4373j2.f43400b) && Intrinsics.areEqual(this.f43401c, c4373j2.f43401c) && this.f43402d == c4373j2.f43402d && Intrinsics.areEqual(this.f43403e, c4373j2.f43403e);
    }

    @NotNull
    public final String f() {
        return this.f43403e;
    }

    @NotNull
    public final String g() {
        return this.f43399a;
    }

    @Nullable
    public final JSONObject h() {
        return this.f43400b;
    }

    public int hashCode() {
        int iHashCode = this.f43399a.hashCode() * 31;
        JSONObject jSONObject = this.f43400b;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C4424m2 c4424m2 = this.f43401c;
        return ((((iHashCode2 + (c4424m2 != null ? c4424m2.hashCode() : 0)) * 31) + this.f43402d) * 31) + this.f43403e.hashCode();
    }

    public final int i() {
        return this.f43402d;
    }

    @Nullable
    public final C4424m2 j() {
        return this.f43401c;
    }

    @NotNull
    public String toString() {
        return "AuctionResponseData(auctionId=" + this.f43399a + ", auctionResponseGenericParam=" + this.f43400b + ", genericNotifications=" + this.f43401c + ", auctionTrial=" + this.f43402d + ", auctionFallback=" + this.f43403e + ")";
    }

    @NotNull
    public final C4373j2 a(@NotNull String auctionId, @Nullable JSONObject jSONObject, @Nullable C4424m2 c4424m2, int i10, @NotNull String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new C4373j2(auctionId, jSONObject, c4424m2, i10, auctionFallback);
    }

    public static /* synthetic */ C4373j2 a(C4373j2 c4373j2, String str, JSONObject jSONObject, C4424m2 c4424m2, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c4373j2.f43399a;
        }
        if ((i11 & 2) != 0) {
            jSONObject = c4373j2.f43400b;
        }
        if ((i11 & 4) != 0) {
            c4424m2 = c4373j2.f43401c;
        }
        if ((i11 & 8) != 0) {
            i10 = c4373j2.f43402d;
        }
        if ((i11 & 16) != 0) {
            str2 = c4373j2.f43403e;
        }
        String str3 = str2;
        C4424m2 c4424m22 = c4424m2;
        return c4373j2.a(str, jSONObject, c4424m22, i10, str3);
    }
}

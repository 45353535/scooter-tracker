package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4443n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f44444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f44445b;

    public C4443n2(@NotNull String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.f44444a = serverData;
        this.f44445b = com.ironsource.mediationsdk.d.b();
    }

    private final String c() {
        return this.f44444a;
    }

    @NotNull
    public final C4443n2 a(@NotNull String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        return new C4443n2(serverData);
    }

    @NotNull
    public final Map<String, String> b() {
        Map<String, String> mapB = this.f44445b.b(this.f44444a);
        Intrinsics.checkNotNullExpressionValue(mapB, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return mapB;
    }

    @NotNull
    public final String d() {
        String strC = this.f44445b.c(this.f44444a);
        Intrinsics.checkNotNullExpressionValue(strC, "auctionDataUtils.getDyna…romServerData(serverData)");
        return strC;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4443n2) && Intrinsics.areEqual(this.f44444a, ((C4443n2) obj).f44444a);
    }

    public int hashCode() {
        return this.f44444a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AuctionServerData(serverData=" + this.f44444a + ")";
    }

    public static /* synthetic */ C4443n2 a(C4443n2 c4443n2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4443n2.f44444a;
        }
        return c4443n2.a(str);
    }

    @NotNull
    public final String a() {
        String strA = this.f44445b.a(this.f44444a);
        Intrinsics.checkNotNullExpressionValue(strA, "auctionDataUtils.getAdmFromServerData(serverData)");
        return strA;
    }
}

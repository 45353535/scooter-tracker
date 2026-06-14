package com.ironsource;

import com.ironsource.C4475p0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f40097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final NetworkSettings f40098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4373j2 f40099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C4237b1 f40100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4424m2 f40101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f40102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final H f40103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final IronSource.a f40104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final JSONObject f40105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final String f40106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f40107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final String f40108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final C4424m2 f40109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final String f40110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final String f40111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f40112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final AdData f40113q;

    public A(@NotNull AbstractC4576v0 adUnitData, @NotNull NetworkSettings providerSettings, @NotNull C4373j2 auctionData, @NotNull C4237b1 adapterConfig, @NotNull C4424m2 auctionResponseItem, int i10) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        this.f40097a = adUnitData;
        this.f40098b = providerSettings;
        this.f40099c = auctionData;
        this.f40100d = adapterConfig;
        this.f40101e = auctionResponseItem;
        this.f40102f = i10;
        this.f40103g = new H(C4475p0.a.DidntAttemptToLoad);
        IronSource.a aVarA = adUnitData.b().a();
        this.f40104h = aVarA;
        this.f40105i = auctionData.h();
        this.f40106j = auctionData.g();
        this.f40107k = auctionData.i();
        this.f40108l = auctionData.f();
        this.f40109m = auctionData.j();
        String strF = adapterConfig.f();
        Intrinsics.checkNotNullExpressionValue(strF, "adapterConfig.providerName");
        this.f40110n = strF;
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strF, Integer.valueOf(hashCode())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        this.f40111o = str;
        this.f40112p = adapterConfig.d();
        String strK = auctionResponseItem.k();
        Map<String, Object> mapA = C4365ia.a(auctionResponseItem.a());
        Intrinsics.checkNotNullExpressionValue(mapA, "jsonObjectToMap(auctionResponseItem.adData)");
        mapA.put("adUnit", aVarA);
        HashMap map = new HashMap();
        Map<String, Object> mapA2 = C4365ia.a(adapterConfig.c());
        Intrinsics.checkNotNullExpressionValue(mapA2, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        map.putAll(mapA2);
        mapA.put("userId", adUnitData.r());
        mapA.put("adUnitId", adUnitData.b().c());
        mapA.put("isMultipleAdUnits", Boolean.TRUE);
        this.f40113q = new AdData(strK, map, mapA);
    }

    @NotNull
    public final AbstractC4576v0 a() {
        return this.f40097a;
    }

    @NotNull
    public final NetworkSettings b() {
        return this.f40098b;
    }

    @NotNull
    public final C4373j2 c() {
        return this.f40099c;
    }

    @NotNull
    public final C4237b1 d() {
        return this.f40100d;
    }

    @NotNull
    public final C4424m2 e() {
        return this.f40101e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return Intrinsics.areEqual(this.f40097a, a10.f40097a) && Intrinsics.areEqual(this.f40098b, a10.f40098b) && Intrinsics.areEqual(this.f40099c, a10.f40099c) && Intrinsics.areEqual(this.f40100d, a10.f40100d) && Intrinsics.areEqual(this.f40101e, a10.f40101e) && this.f40102f == a10.f40102f;
    }

    public final int f() {
        return this.f40102f;
    }

    @NotNull
    public final AdData g() {
        return this.f40113q;
    }

    @NotNull
    public final IronSource.a h() {
        return this.f40104h;
    }

    public int hashCode() {
        return (((((((((this.f40097a.hashCode() * 31) + this.f40098b.hashCode()) * 31) + this.f40099c.hashCode()) * 31) + this.f40100d.hashCode()) * 31) + this.f40101e.hashCode()) * 31) + this.f40102f;
    }

    @NotNull
    public final AbstractC4576v0 i() {
        return this.f40097a;
    }

    @NotNull
    public final C4237b1 j() {
        return this.f40100d;
    }

    @NotNull
    public final C4373j2 k() {
        return this.f40099c;
    }

    @NotNull
    public final String l() {
        return this.f40108l;
    }

    @NotNull
    public final String m() {
        return this.f40106j;
    }

    @NotNull
    public final C4424m2 n() {
        return this.f40101e;
    }

    public final int o() {
        return this.f40107k;
    }

    @Nullable
    public final C4424m2 p() {
        return this.f40109m;
    }

    @Nullable
    public final JSONObject q() {
        return this.f40105i;
    }

    @NotNull
    public final String r() {
        return this.f40110n;
    }

    public final int s() {
        return this.f40112p;
    }

    @NotNull
    public final H t() {
        return this.f40103g;
    }

    @NotNull
    public String toString() {
        return "AdInstanceData(adUnitData=" + this.f40097a + ", providerSettings=" + this.f40098b + ", auctionData=" + this.f40099c + ", adapterConfig=" + this.f40100d + ", auctionResponseItem=" + this.f40101e + ", sessionDepth=" + this.f40102f + ")";
    }

    @NotNull
    public final NetworkSettings u() {
        return this.f40098b;
    }

    public final int v() {
        return this.f40102f;
    }

    @NotNull
    public final String w() {
        return this.f40111o;
    }

    @NotNull
    public final A a(@NotNull AbstractC4576v0 adUnitData, @NotNull NetworkSettings providerSettings, @NotNull C4373j2 auctionData, @NotNull C4237b1 adapterConfig, @NotNull C4424m2 auctionResponseItem, int i10) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        return new A(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i10);
    }

    public static /* synthetic */ A a(A a10, AbstractC4576v0 abstractC4576v0, NetworkSettings networkSettings, C4373j2 c4373j2, C4237b1 c4237b1, C4424m2 c4424m2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC4576v0 = a10.f40097a;
        }
        if ((i11 & 2) != 0) {
            networkSettings = a10.f40098b;
        }
        if ((i11 & 4) != 0) {
            c4373j2 = a10.f40099c;
        }
        if ((i11 & 8) != 0) {
            c4237b1 = a10.f40100d;
        }
        if ((i11 & 16) != 0) {
            c4424m2 = a10.f40101e;
        }
        if ((i11 & 32) != 0) {
            i10 = a10.f40102f;
        }
        C4424m2 c4424m22 = c4424m2;
        int i12 = i10;
        return a10.a(abstractC4576v0, networkSettings, c4373j2, c4237b1, c4424m22, i12);
    }

    public final void a(@NotNull C4475p0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f40103g.b(performance);
    }
}

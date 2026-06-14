package com.ironsource;

import com.ironsource.N0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class A9 extends U {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f40399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f40400t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final E9 f40401u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public A9(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull E9 configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        C4460o2 c4460o2G = configs.g();
        Intrinsics.checkNotNullExpressionValue(c4460o2G, "configs.interstitialAuctionSettings");
        super(aVar, str, list, c4460o2G, configs.c(), configs.d(), configs.f(), configs.b(), -1, new N0(N0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), new H0(-1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 32768, null);
        this.f40399s = str;
        this.f40400t = list;
        this.f40401u = configs;
    }

    @NotNull
    public final A9 a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull E9 configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new A9(str, list, configs);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A9)) {
            return false;
        }
        A9 a92 = (A9) obj;
        return Intrinsics.areEqual(this.f40399s, a92.f40399s) && Intrinsics.areEqual(this.f40400t, a92.f40400t) && Intrinsics.areEqual(this.f40401u, a92.f40401u);
    }

    public int hashCode() {
        String str = this.f40399s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f40400t;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f40401u.hashCode();
    }

    @Override // com.ironsource.U
    @Nullable
    public List<NetworkSettings> j() {
        return this.f40400t;
    }

    @Override // com.ironsource.U
    @Nullable
    public String o() {
        return this.f40399s;
    }

    @Nullable
    public final String s() {
        return this.f40399s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f40400t;
    }

    @NotNull
    public String toString() {
        return "InterstitialAdManagerData(userId=" + this.f40399s + ", providerList=" + this.f40400t + ", configs=" + this.f40401u + ")";
    }

    @NotNull
    public final E9 u() {
        return this.f40401u;
    }

    @NotNull
    public final E9 v() {
        return this.f40401u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ A9 a(A9 a92, String str, List list, E9 e92, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = a92.f40399s;
        }
        if ((i10 & 2) != 0) {
            list = a92.f40400t;
        }
        if ((i10 & 4) != 0) {
            e92 = a92.f40401u;
        }
        return a92.a(str, list, e92);
    }
}

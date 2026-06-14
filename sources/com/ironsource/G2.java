package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class G2 extends U {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f40947s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f40948t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final T2 f40949u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public G2(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull T2 configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        IronSource.a aVar = IronSource.a.BANNER;
        C4460o2 c4460o2D = configs.d();
        Intrinsics.checkNotNullExpressionValue(c4460o2D, "configs.bannerAuctionSettings");
        super(aVar, str, list, c4460o2D, configs.a(), (int) (configs.b() / ((long) 1000)), configs.c(), configs.f(), -1, H2.b(configs), new H0(configs.j()), configs.e(), configs.l(), configs.n(), configs.m(), false, 32768, null);
        this.f40947s = str;
        this.f40948t = list;
        this.f40949u = configs;
    }

    @NotNull
    public final G2 a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull T2 configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new G2(str, list, configs);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2)) {
            return false;
        }
        G2 g22 = (G2) obj;
        return Intrinsics.areEqual(this.f40947s, g22.f40947s) && Intrinsics.areEqual(this.f40948t, g22.f40948t) && Intrinsics.areEqual(this.f40949u, g22.f40949u);
    }

    public int hashCode() {
        String str = this.f40947s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f40948t;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f40949u.hashCode();
    }

    @Override // com.ironsource.U
    @Nullable
    public List<NetworkSettings> j() {
        return this.f40948t;
    }

    @Override // com.ironsource.U
    @Nullable
    public String o() {
        return this.f40947s;
    }

    @Nullable
    public final String s() {
        return this.f40947s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f40948t;
    }

    @NotNull
    public String toString() {
        return "BannerAdManagerData(userId=" + this.f40947s + ", providerList=" + this.f40948t + ", configs=" + this.f40949u + ")";
    }

    @NotNull
    public final T2 u() {
        return this.f40949u;
    }

    @NotNull
    public final T2 v() {
        return this.f40949u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ G2 a(G2 g22, String str, List list, T2 t22, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = g22.f40947s;
        }
        if ((i10 & 2) != 0) {
            list = g22.f40948t;
        }
        if ((i10 & 4) != 0) {
            t22 = g22.f40949u;
        }
        return g22.a(str, list, t22);
    }
}

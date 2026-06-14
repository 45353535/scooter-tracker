package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Md extends U {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f41326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f41327t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final Rd f41328u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f41329v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public Md(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Rd configs, boolean z10) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        C4460o2 c4460o2K = configs.k();
        Intrinsics.checkNotNullExpressionValue(c4460o2K, "configs.rewardedVideoAuctionSettings");
        super(aVar, str, list, c4460o2K, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), Nd.b(configs, z10), new H0(-1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 32768, null);
        this.f41326s = str;
        this.f41327t = list;
        this.f41328u = configs;
        this.f41329v = z10;
    }

    @NotNull
    public final Md a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Rd configs, boolean z10) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new Md(str, list, configs, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Md)) {
            return false;
        }
        Md md2 = (Md) obj;
        return Intrinsics.areEqual(this.f41326s, md2.f41326s) && Intrinsics.areEqual(this.f41327t, md2.f41327t) && Intrinsics.areEqual(this.f41328u, md2.f41328u) && this.f41329v == md2.f41329v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        String str = this.f41326s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f41327t;
        int iHashCode2 = (((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f41328u.hashCode()) * 31;
        boolean z10 = this.f41329v;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode2 + r12;
    }

    @Override // com.ironsource.U
    @Nullable
    public List<NetworkSettings> j() {
        return this.f41327t;
    }

    @Override // com.ironsource.U
    @Nullable
    public String o() {
        return this.f41326s;
    }

    @Nullable
    public final String s() {
        return this.f41326s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f41327t;
    }

    @NotNull
    public String toString() {
        return "RewardedVideoAdDataManager(userId=" + this.f41326s + ", providerList=" + this.f41327t + ", configs=" + this.f41328u + ", isManual=" + this.f41329v + ")";
    }

    @NotNull
    public final Rd u() {
        return this.f41328u;
    }

    public final boolean v() {
        return this.f41329v;
    }

    @NotNull
    public final Rd w() {
        return this.f41328u;
    }

    public final boolean x() {
        return this.f41329v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Md a(Md md2, String str, List list, Rd rd2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = md2.f41326s;
        }
        if ((i10 & 2) != 0) {
            list = md2.f41327t;
        }
        if ((i10 & 4) != 0) {
            rd2 = md2.f41328u;
        }
        if ((i10 & 8) != 0) {
            z10 = md2.f41329v;
        }
        return md2.a(str, list, rd2, z10);
    }
}

package com.ironsource;

import com.ironsource.N0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Xb extends U {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f42061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f42062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final Nb f42063u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Xb(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Nb configs) {
        super(IronSource.a.NATIVE_AD, str, list, configs.d(), configs.b(), (int) (configs.c() / ((long) 1000)), configs.a(), configs.f(), -1, new N0(N0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), new H0(-1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 32768, null);
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.f42061s = str;
        this.f42062t = list;
        this.f42063u = configs;
    }

    @NotNull
    public final Xb a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Nb configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new Xb(str, list, configs);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xb)) {
            return false;
        }
        Xb xb2 = (Xb) obj;
        return Intrinsics.areEqual(this.f42061s, xb2.f42061s) && Intrinsics.areEqual(this.f42062t, xb2.f42062t) && Intrinsics.areEqual(this.f42063u, xb2.f42063u);
    }

    public int hashCode() {
        String str = this.f42061s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f42062t;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f42063u.hashCode();
    }

    @Override // com.ironsource.U
    @Nullable
    public List<NetworkSettings> j() {
        return this.f42062t;
    }

    @Override // com.ironsource.U
    @Nullable
    public String o() {
        return this.f42061s;
    }

    @Nullable
    public final String s() {
        return this.f42061s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f42062t;
    }

    @NotNull
    public String toString() {
        return "NativeAdManagerData(userId=" + this.f42061s + ", providerList=" + this.f42062t + ", configs=" + this.f42063u + ")";
    }

    @NotNull
    public final Nb u() {
        return this.f42063u;
    }

    @NotNull
    public final Nb v() {
        return this.f42063u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Xb a(Xb xb2, String str, List list, Nb nb2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = xb2.f42061s;
        }
        if ((i10 & 2) != 0) {
            list = xb2.f42062t;
        }
        if ((i10 & 4) != 0) {
            nb2 = xb2.f42063u;
        }
        return xb2.a(str, list, nb2);
    }
}

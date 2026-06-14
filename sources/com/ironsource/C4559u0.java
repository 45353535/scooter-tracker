package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4559u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f45533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<NetworkSettings> f45534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4432ma f45535c;

    /* JADX WARN: Multi-variable type inference failed */
    public C4559u0(@Nullable String str, @NotNull List<? extends NetworkSettings> providerList, @NotNull C4432ma publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f45533a = str;
        this.f45534b = providerList;
        this.f45535c = publisherDataHolder;
    }

    @Nullable
    public final String a() {
        return this.f45533a;
    }

    @NotNull
    public final List<NetworkSettings> b() {
        return this.f45534b;
    }

    @NotNull
    public final C4432ma c() {
        return this.f45535c;
    }

    @NotNull
    public final List<NetworkSettings> d() {
        return this.f45534b;
    }

    @NotNull
    public final C4432ma e() {
        return this.f45535c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4559u0)) {
            return false;
        }
        C4559u0 c4559u0 = (C4559u0) obj;
        return Intrinsics.areEqual(this.f45533a, c4559u0.f45533a) && Intrinsics.areEqual(this.f45534b, c4559u0.f45534b) && Intrinsics.areEqual(this.f45535c, c4559u0.f45535c);
    }

    @Nullable
    public final String f() {
        return this.f45533a;
    }

    public int hashCode() {
        String str = this.f45533a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f45534b.hashCode()) * 31) + this.f45535c.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdUnitCommonData(userId=" + this.f45533a + ", providerList=" + this.f45534b + ", publisherDataHolder=" + this.f45535c + ")";
    }

    @NotNull
    public final C4559u0 a(@Nullable String str, @NotNull List<? extends NetworkSettings> providerList, @NotNull C4432ma publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new C4559u0(str, providerList, publisherDataHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4559u0 a(C4559u0 c4559u0, String str, List list, C4432ma c4432ma, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4559u0.f45533a;
        }
        if ((i10 & 2) != 0) {
            list = c4559u0.f45534b;
        }
        if ((i10 & 4) != 0) {
            c4432ma = c4559u0.f45535c;
        }
        return c4559u0.a(str, list, c4432ma);
    }
}

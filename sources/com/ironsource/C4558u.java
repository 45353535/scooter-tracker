package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4558u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final We f45527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f45528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f45529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f45530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final T7 f45531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f45532f;

    public C4558u(@NotNull We recordType, @NotNull String advertiserBundleId, @NotNull String networkInstanceId, @NotNull String adUnitId, @NotNull T7 adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f45527a = recordType;
        this.f45528b = advertiserBundleId;
        this.f45529c = networkInstanceId;
        this.f45530d = adUnitId;
        this.f45531e = adProvider;
        this.f45532f = adInstanceId;
    }

    @NotNull
    public final String a() {
        return this.f45532f;
    }

    @NotNull
    public final T7 b() {
        return this.f45531e;
    }

    @NotNull
    public final String c() {
        return this.f45530d;
    }

    @NotNull
    public final String d() {
        return this.f45528b;
    }

    @NotNull
    public final String e() {
        return this.f45529c;
    }

    @NotNull
    public final We f() {
        return this.f45527a;
    }

    @NotNull
    public final E0 a(@NotNull Hb<C4558u, E0> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}

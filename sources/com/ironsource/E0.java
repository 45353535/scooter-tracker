package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final We f40654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f40655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f40656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final T7 f40657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f40658e;

    public E0(@NotNull We recordType, @NotNull String advertiserBundleId, @NotNull String networkInstanceId, @NotNull T7 adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f40654a = recordType;
        this.f40655b = advertiserBundleId;
        this.f40656c = networkInstanceId;
        this.f40657d = adProvider;
        this.f40658e = adInstanceId;
    }

    @NotNull
    public final String a() {
        return this.f40658e;
    }

    @NotNull
    public final T7 b() {
        return this.f40657d;
    }

    @NotNull
    public final String c() {
        return this.f40655b;
    }

    @NotNull
    public final String d() {
        return this.f40656c;
    }

    @NotNull
    public final We e() {
        return this.f40654a;
    }

    @NotNull
    public final C4470oc a(@NotNull Hb<E0, C4470oc> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}

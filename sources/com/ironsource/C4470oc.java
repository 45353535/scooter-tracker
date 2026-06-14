package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4470oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final We f44570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f44571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final T7 f44572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f44573d;

    public C4470oc(@NotNull We recordType, @NotNull String advertiserBundleId, @NotNull T7 adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f44570a = recordType;
        this.f44571b = advertiserBundleId;
        this.f44572c = adProvider;
        this.f44573d = adInstanceId;
    }

    @NotNull
    public final String a() {
        return this.f44573d;
    }

    @NotNull
    public final T7 b() {
        return this.f44572c;
    }

    @NotNull
    public final String c() {
        return this.f44571b;
    }

    @NotNull
    public final We d() {
        return this.f44570a;
    }

    @NotNull
    public final C4305f1 a(@NotNull Hb<C4470oc, C4305f1> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}

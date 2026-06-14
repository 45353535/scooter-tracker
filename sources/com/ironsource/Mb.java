package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f41324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f41325b;

    public final void a(@Nullable AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f41324a = adapterNativeAdViewBinder;
    }

    @Nullable
    public final AdapterNativeAdViewBinder b() {
        return this.f41324a;
    }

    @Nullable
    public final AdapterNativeAdData a() {
        return this.f41325b;
    }

    public final void a(@Nullable AdapterNativeAdData adapterNativeAdData) {
        this.f41325b = adapterNativeAdData;
    }
}

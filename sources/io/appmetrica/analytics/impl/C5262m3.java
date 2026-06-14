package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5262m3 implements CacheControlHttpsConnectionPerformer.Client {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkClientWithCacheControl f77735a;

    public C5262m3(@NotNull NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f77735a = networkClientWithCacheControl;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    @Nullable
    public final String getOldETag() {
        return this.f77735a.getETag();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onError() {
        this.f77735a.onError();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onNotModified() {
        this.f77735a.onNotModified();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onResponse(@NotNull String str, @NotNull byte[] bArr) {
        this.f77735a.onResponse(str, bArr);
    }
}

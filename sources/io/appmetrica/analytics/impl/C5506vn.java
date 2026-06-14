package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5506vn implements TempCacheStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TempCacheStorage f78472a;

    public C5506vn(@NotNull Context context, @NotNull Wm wm, @NotNull TempCacheStorage tempCacheStorage) {
        this.f78472a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @Nullable
    public final TempCacheStorage.Entry get(@NotNull String str) {
        return this.f78472a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(@NotNull String str, long j10, @NotNull byte[] bArr) {
        return this.f78472a.put(str, j10, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j10) {
        this.f78472a.remove(j10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(@NotNull String str, long j10) {
        this.f78472a.removeOlderThan(str, j10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @NotNull
    public final Collection<TempCacheStorage.Entry> get(@NotNull String str, int i10) {
        return this.f78472a.get(str, i10);
    }
}

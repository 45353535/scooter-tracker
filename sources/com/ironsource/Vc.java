package com.ironsource;

import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Vc implements J7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final G3 f41905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<String, Long> f41906b;

    public Vc(@NotNull G3 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f41905a = storage;
        this.f41906b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.J7
    @Nullable
    public Long a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l10 = this.f41906b.get(identifier);
        if (l10 != null) {
            return l10;
        }
        Long lB = this.f41905a.b(identifier);
        if (lB == null) {
            return null;
        }
        long jLongValue = lB.longValue();
        this.f41906b.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.J7
    public void a(long j10, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f41906b.put(identifier, Long.valueOf(j10));
        this.f41905a.a(identifier, j10);
    }
}

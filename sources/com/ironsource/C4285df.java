package com.ironsource;

import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4285df implements Q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final G3 f42922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<String, Integer> f42923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<String, Long> f42924c;

    public C4285df(@NotNull G3 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f42922a = storage;
        this.f42923b = new ConcurrentHashMap<>();
        this.f42924c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.Q8
    public void a(int i10, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f42923b.put(identifier, Integer.valueOf(i10));
        this.f42922a.a(identifier, i10);
    }

    @Override // com.ironsource.Q8
    @Nullable
    public Long b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l10 = this.f42924c.get(identifier);
        if (l10 != null) {
            return l10;
        }
        Long lA = this.f42922a.a(identifier);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        this.f42924c.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.Q8
    public int a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Integer num = this.f42923b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer numC = this.f42922a.c(identifier);
        if (numC != null) {
            int iIntValue = numC.intValue();
            this.f42923b.put(identifier, Integer.valueOf(iIntValue));
            return iIntValue;
        }
        this.f42923b.put(identifier, 0);
        return 0;
    }

    @Override // com.ironsource.Q8
    public void a(long j10, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f42924c.put(identifier, Long.valueOf(j10));
        this.f42922a.b(identifier, j10);
    }
}

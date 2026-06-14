package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4440n extends G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f44433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final UUID f44434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f44435c;

    public C4440n(@NotNull IronSource.a adFormat, @NotNull UUID adId, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f44433a = adFormat;
        this.f44434b = adId;
        this.f44435c = adUnitId;
    }

    @Override // com.ironsource.C0
    @NotNull
    public Map<String, Object> a(@Nullable A0 a02) {
        return a(new C4304f0(this.f44433a, this.f44434b, this.f44435c, null, null, null, 56, null));
    }
}

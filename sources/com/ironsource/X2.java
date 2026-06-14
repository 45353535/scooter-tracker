package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class X2 extends C4384jd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4441n0 f42015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ISBannerSize f42016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(@NotNull C4441n0 adTools, @NotNull ISBannerSize size, @NotNull String placement) {
        super(placement);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f42015b = adTools;
        this.f42016c = size;
    }

    @Override // com.ironsource.C4384jd, com.ironsource.C0
    @NotNull
    public Map<String, Object> a(@Nullable A0 a02) {
        Map<String, Object> mutableMap = MapsKt.toMutableMap(super.a(a02));
        this.f42015b.a(mutableMap, this.f42016c);
        return mutableMap;
    }
}

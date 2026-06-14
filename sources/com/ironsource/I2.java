package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class I2 extends C4304f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdSize f41074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final Boolean f41075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final Long f41076i;

    public /* synthetic */ I2(UUID uuid, String str, C4283dd c4283dd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l10, C4642yf c4642yf, Double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i10 & 4) != 0 ? null : c4283dd, (i10 & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : l10, (i10 & 64) != 0 ? null : c4642yf, (i10 & 128) != 0 ? null : d10);
    }

    @NotNull
    public final LevelPlayAdSize h() {
        return this.f41074g;
    }

    @Nullable
    public final Boolean i() {
        return this.f41075h;
    }

    @Nullable
    public final Long j() {
        return this.f41076i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I2(@NotNull UUID adId, @NotNull String adUnitId, @Nullable C4283dd c4283dd, @NotNull LevelPlayAdSize adSize, @Nullable Boolean bool, @Nullable Long l10, @Nullable C4642yf c4642yf, @Nullable Double d10) {
        super(IronSource.a.BANNER, adId, adUnitId, c4283dd, c4642yf, d10);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.f41074g = adSize;
        this.f41075h = bool;
        this.f41076i = l10;
    }

    public I2() {
        this(C4600w7.f45720a.a(), "", null, null, null, null, null, null, 252, null);
    }
}

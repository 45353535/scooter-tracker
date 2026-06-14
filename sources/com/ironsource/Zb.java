package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Zb extends C4304f0 {
    public /* synthetic */ Zb(UUID uuid, String str, C4283dd c4283dd, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i10 & 4) != 0 ? null : c4283dd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zb(@NotNull UUID adId, @NotNull String adUnitId, @Nullable C4283dd c4283dd) {
        super(IronSource.a.NATIVE_AD, adId, adUnitId, c4283dd, null, null, 48, null);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public Zb() {
        this(C4600w7.f45720a.a(), "", null, 4, null);
    }
}

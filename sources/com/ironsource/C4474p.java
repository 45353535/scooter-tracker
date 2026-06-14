package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4474p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f44587a;

    public C4474p(@NotNull JSONObject adFormatAuctionSettings) {
        Intrinsics.checkNotNullParameter(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.f44587a = adFormatAuctionSettings.has(C4491q.f44668a) ? Boolean.valueOf(adFormatAuctionSettings.optBoolean(C4491q.f44668a)) : null;
    }

    @Nullable
    public final Boolean a() {
        return this.f44587a;
    }
}

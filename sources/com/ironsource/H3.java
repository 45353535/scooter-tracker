package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f41034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f41035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final M3 f41036c;

    public H3(@NotNull JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f41034a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f41035b = features.has("maxImpressions") ? Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.f41036c = features.has("unit") ? M3.f41302c.a(features.optString("unit")) : null;
    }

    @Nullable
    public final Boolean a() {
        return this.f41034a;
    }

    @Nullable
    public final Integer b() {
        return this.f41035b;
    }

    @Nullable
    public final M3 c() {
        return this.f41036c;
    }
}

package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f42064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f42065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final M3 f42066c;

    public Xc(@NotNull JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f42064a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f42065b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.f42066c = M3.Second;
    }

    @Nullable
    public final Boolean a() {
        return this.f42064a;
    }

    @Nullable
    public final Integer b() {
        return this.f42065b;
    }

    @NotNull
    public final M3 c() {
        return this.f42066c;
    }
}

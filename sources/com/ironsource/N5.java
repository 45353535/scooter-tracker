package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class N5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final JSONObject f41364a;

    public N5(@Nullable JSONObject jSONObject) {
        this.f41364a = jSONObject;
    }

    @Nullable
    public final Boolean a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f41364a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Boolean) {
            return (Boolean) objOpt;
        }
        return null;
    }

    @Nullable
    public final Integer b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f41364a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Integer) {
            return (Integer) objOpt;
        }
        return null;
    }

    @Nullable
    public final String c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f41364a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        return null;
    }
}

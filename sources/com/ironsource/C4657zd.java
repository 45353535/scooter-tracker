package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4657zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f45978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f45979b;

    public C4657zd(@NotNull JSONObject features, @NotNull String nameKey, @NotNull String amountKey) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(nameKey, "nameKey");
        Intrinsics.checkNotNullParameter(amountKey, "amountKey");
        this.f45978a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.f45979b = features.has(amountKey) ? Integer.valueOf(features.getInt(amountKey)) : null;
    }

    @Nullable
    public final Integer a() {
        return this.f45979b;
    }

    @Nullable
    public final String b() {
        return this.f45978a;
    }
}

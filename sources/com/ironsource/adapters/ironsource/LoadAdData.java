package com.ironsource.adapters.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class LoadAdData {

    @NotNull
    private final JSONObject localAdData;

    public LoadAdData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final String adUnitId() {
        String it = this.localAdData.optString("adUnitId");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }

    public LoadAdData(@Nullable JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public /* synthetic */ LoadAdData(JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : jSONObject);
    }
}

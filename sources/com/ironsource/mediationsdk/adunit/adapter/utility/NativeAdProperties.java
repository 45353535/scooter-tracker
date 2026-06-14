package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4462o4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class NativeAdProperties {

    @NotNull
    private final AdOptionsPosition adOptionsPosition;

    @NotNull
    private final AdOptionsPosition defaultAdOptionPosition;

    public NativeAdProperties(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(config);
    }

    @NotNull
    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        String position = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            Intrinsics.checkNotNullExpressionValue(position, "position");
            return AdOptionsPosition.valueOf(position);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return this.defaultAdOptionPosition;
        }
    }
}

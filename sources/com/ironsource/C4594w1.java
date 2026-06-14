package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4594w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C4474p> f45692a;

    public C4594w1(@NotNull JSONObject applicationAuctionSettings) {
        Intrinsics.checkNotNullParameter(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = applicationAuctionSettings.optJSONObject(C4456nf.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            } else {
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new C4474p(jSONObjectOptJSONObject));
        }
        this.f45692a = linkedHashMap;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, C4474p> a() {
        return this.f45692a;
    }
}

package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4524s f41789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4524s f41790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final S2 f41791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Ob f41792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4628y1 f41793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C4524s> f41794f;

    public T3(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        C4524s c4524s = new C4524s(a(configurations, "rewarded"));
        this.f41789a = c4524s;
        C4524s c4524s2 = new C4524s(a(configurations, "interstitial"));
        this.f41790b = c4524s2;
        this.f41791c = new S2(a(configurations, "banner"));
        this.f41792d = new Ob(a(configurations, "nativeAd"));
        JSONObject jSONObjectOptJSONObject = configurations.optJSONObject("application");
        this.f41793e = new C4628y1(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.f41794f = MapsKt.mapOf(TuplesKt.to(LevelPlay.AdFormat.INTERSTITIAL, c4524s2), TuplesKt.to(LevelPlay.AdFormat.REWARDED, c4524s));
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, C4524s> a() {
        return this.f41794f;
    }

    @NotNull
    public final C4628y1 b() {
        return this.f41793e;
    }

    @NotNull
    public final S2 c() {
        return this.f41791c;
    }

    @NotNull
    public final Ob d() {
        return this.f41792d;
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
        return jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2;
    }
}

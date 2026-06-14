package com.ironsource;

import com.ironsource.C4240b4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f41141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f41143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f41144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f41145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f41146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f41147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f41148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f41149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f41150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f41151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final JSONObject f41152l;

    public J1(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f41141a = config;
        this.f41142b = config.optBoolean("isExternalArmEventsEnabled", true);
        String strOptString = config.optString("externalArmEventsUrl", Q5.f41620j);
        Intrinsics.checkNotNullExpressionValue(strOptString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f41143c = strOptString;
        this.f41144d = config.optBoolean("sid", true);
        this.f41145e = config.optBoolean("radvid", false);
        this.f41146f = config.optInt("uaeh", 0);
        this.f41147g = config.optBoolean("sharedThreadPool", false);
        this.f41148h = config.optBoolean("sharedThreadPoolADP", true);
        this.f41149i = config.optInt(N6.T0, -1);
        this.f41150j = config.optBoolean("axal", false);
        this.f41151k = config.optBoolean("psrt", false);
        this.f41152l = config.optJSONObject(C4240b4.a.f42498c);
    }

    private final JSONObject a() {
        return this.f41141a;
    }

    public final int b() {
        return this.f41149i;
    }

    @Nullable
    public final JSONObject c() {
        return this.f41152l;
    }

    @NotNull
    public final String d() {
        return this.f41143c;
    }

    public final boolean e() {
        return this.f41151k;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J1) && Intrinsics.areEqual(this.f41141a, ((J1) obj).f41141a);
    }

    public final boolean f() {
        return this.f41145e;
    }

    public final boolean g() {
        return this.f41144d;
    }

    public final boolean h() {
        return this.f41147g;
    }

    public int hashCode() {
        return this.f41141a.hashCode();
    }

    public final boolean i() {
        return this.f41148h;
    }

    public final int j() {
        return this.f41146f;
    }

    public final boolean k() {
        return this.f41150j;
    }

    public final boolean l() {
        return this.f41142b;
    }

    @NotNull
    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f41141a + ")";
    }

    @NotNull
    public final J1 a(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new J1(config);
    }

    public static /* synthetic */ J1 a(J1 j12, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = j12.f41141a;
        }
        return j12.a(jSONObject);
    }
}

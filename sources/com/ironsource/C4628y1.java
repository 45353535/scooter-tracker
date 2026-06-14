package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4628y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Eb f45850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1 f45852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final J1 f45853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4594w1 f45854e;

    public C4628y1(@NotNull JSONObject applicationConfigurations) {
        Intrinsics.checkNotNullParameter(applicationConfigurations, "applicationConfigurations");
        JSONObject jSONObjectOptJSONObject = applicationConfigurations.optJSONObject(A1.f40166a);
        this.f45850a = new Eb(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.f45851b = applicationConfigurations.optBoolean(A1.f40172g, false);
        JSONObject jSONObjectOptJSONObject2 = applicationConfigurations.optJSONObject(A1.f40173h);
        this.f45852c = new C1(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = applicationConfigurations.optJSONObject("settings");
        this.f45853d = new J1(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = applicationConfigurations.optJSONObject(A1.f40171f);
        this.f45854e = new C4594w1(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    @NotNull
    public final C4594w1 a() {
        return this.f45854e;
    }

    @NotNull
    public final C1 b() {
        return this.f45852c;
    }

    @NotNull
    public final J1 c() {
        return this.f45853d;
    }

    public final boolean d() {
        return this.f45851b;
    }

    @NotNull
    public final Eb e() {
        return this.f45850a;
    }
}

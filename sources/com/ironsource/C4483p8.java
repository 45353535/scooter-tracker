package com.ironsource;

import com.ironsource.C4240b4;
import com.ironsource.InterfaceC4466o8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4483p8 implements InterfaceC4466o8, InterfaceC4466o8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private JSONObject f44643a = new JSONObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private JSONObject f44644b = new JSONObject();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private JSONObject f44645c = new JSONObject();

    private final Object e(String str) {
        if (this.f44645c.has(str)) {
            return this.f44645c.get(str);
        }
        if (this.f44644b.has(str)) {
            return this.f44644b.get(str);
        }
        if (this.f44643a.has(str)) {
            return this.f44643a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4466o8
    @Nullable
    public JSONObject a(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof JSONObject) {
            return (JSONObject) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4466o8
    @Nullable
    public Integer b(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Integer) {
            return (Integer) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4466o8
    @Nullable
    public Boolean c(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Boolean) {
            return (Boolean) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4466o8
    @Nullable
    public String d(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof String) {
            return (String) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4466o8.a
    public void a(@NotNull JSONObject controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        this.f44643a = controllerConfig;
        JSONObject jSONObjectOptJSONObject = controllerConfig.optJSONObject(C4240b4.a.f42497b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        this.f44644b = jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = this.f44643a.optJSONObject(C4240b4.a.f42498c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        this.f44645c = jSONObjectOptJSONObject2;
    }
}

package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class O3 implements U5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f41495a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f41496a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f41497b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f41498c = "curlError";

        private a() {
        }
    }

    public O3(@Nullable JSONObject jSONObject) {
        this.f41495a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.U5
    public boolean b() {
        return this.f41495a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.f41495a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.f41495a.optBoolean("reportController", true);
    }
}

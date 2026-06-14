package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class P3 implements U5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f41545a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f41546a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f41547b = false;

        private a() {
        }
    }

    public P3(@Nullable JSONObject jSONObject) {
        this.f41545a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.U5
    public boolean b() {
        return this.f41545a.optBoolean("clickCheck", false);
    }
}

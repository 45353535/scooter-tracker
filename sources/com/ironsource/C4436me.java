package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4436me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ee f43730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4538sd f43731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4572ud f43732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final T3 f43733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final N5 f43734e;

    public C4436me(@NotNull Ee fullResponse) {
        Intrinsics.checkNotNullParameter(fullResponse, "fullResponse");
        this.f43730a = fullResponse;
        JSONObject jSONObjectOptJSONObject = fullResponse.j().optJSONObject(C4455ne.f44462a);
        this.f43731b = new C4538sd(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = fullResponse.j().optJSONObject(C4455ne.f44463b);
        this.f43732c = new C4572ud(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = fullResponse.j().optJSONObject("configurations");
        this.f43733d = new T3(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = fullResponse.j().optJSONObject(C4455ne.f44465d);
        this.f43734e = new N5(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    @NotNull
    public final T3 a() {
        return this.f43733d;
    }

    @NotNull
    public final N5 b() {
        return this.f43734e;
    }

    @NotNull
    public final Ee c() {
        return this.f43730a;
    }

    @NotNull
    public final C4538sd d() {
        return this.f43731b;
    }

    @NotNull
    public final C4572ud e() {
        return this.f43732c;
    }
}

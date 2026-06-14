package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4502qa implements De<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final De<String> f44723a;

    public C4502qa(@NotNull De<String> serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.f44723a = serverResponse;
    }

    @Override // com.ironsource.De
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return new JSONObject(this.f44723a.a());
    }
}

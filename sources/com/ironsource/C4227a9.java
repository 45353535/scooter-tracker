package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4227a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f42348a = new ArrayList<>(new Z8().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final P6 f42349b = new P6();

    @NotNull
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f42349b.a(this.f42348a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDat…mInitDeferredDataKeyList)");
        return jSONObjectA;
    }
}

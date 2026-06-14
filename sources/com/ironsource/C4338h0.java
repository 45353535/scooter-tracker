package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4338h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f43204a = new ArrayList<>(new C4321g0().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final P6 f43205b = new P6();

    @NotNull
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f43205b.a(this.f43204a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return jSONObjectA;
    }
}

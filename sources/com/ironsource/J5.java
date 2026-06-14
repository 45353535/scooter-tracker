package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class J5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f41165a = new ArrayList<>(new I5().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final P6 f41166b = new P6();

    @NotNull
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f41166b.a(this.f41165a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return jSONObjectA;
    }
}

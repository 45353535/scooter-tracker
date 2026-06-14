package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4262c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f42809a = new ArrayList<>(new C4245b9().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final P6 f42810b = new P6();

    @NotNull
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f42810b.a(this.f42809a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return jSONObjectA;
    }
}

package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String[] f41652a = Pf.f41600a.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final P6 f41653b = new P6();

    @NotNull
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f41653b.a(this.f41652a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(jSONObjectA);
    }

    @NotNull
    public final JSONObject a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObjectA = this.f41653b.a(context, this.f41652a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = Q6.b(jSONObject.optJSONObject("md"));
        if (jSONObjectB != null) {
            jSONObject.put("md", jSONObjectB);
        }
        return jSONObject;
    }
}

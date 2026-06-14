package com.ironsource;

import com.ironsource.mediationsdk.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4446n5 implements Hb<String, d.a> {
    @Override // com.ironsource.Hb
    @NotNull
    public d.a a(@NotNull String input) throws JSONException {
        Intrinsics.checkNotNullParameter(input, "input");
        d.a aVarA = com.ironsource.mediationsdk.d.b().a(new JSONObject(input));
        Intrinsics.checkNotNullExpressionValue(aVarA, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarA;
    }
}

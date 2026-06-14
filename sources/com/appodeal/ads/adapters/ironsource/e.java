package com.appodeal.ads.adapters.ironsource;

import com.appodeal.ads.AdUnitParams;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f12368b;

    public e(String instanceId, JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.f12367a = instanceId;
        this.f12368b = jSONArray;
    }

    public final String toString() {
        return "IronsourceAdUnitParams(instanceId='" + this.f12367a + "', instances=" + this.f12368b + ")";
    }
}

package com.appodeal.ads.adapters.bidmachine;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f12097a;

    public j(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f12097a = jsonObject;
    }

    public final String toString() {
        return "BidmachineInitializeParams(jsonObject=" + this.f12097a + ")";
    }
}

package com.appodeal.ads.adapters.bidon;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f12123c;

    public d(String bidonAppKey, String str, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(bidonAppKey, "bidonAppKey");
        this.f12121a = bidonAppKey;
        this.f12122b = str;
        this.f12123c = jSONObject;
    }

    public final String a() {
        return this.f12121a;
    }

    public final String b() {
        return this.f12122b;
    }

    public final JSONObject c() {
        return this.f12123c;
    }

    public final String toString() {
        return "BidonInitializeParams(bidonAppKey='" + this.f12121a + "', bidonEndpoint=" + this.f12122b + ")";
    }
}

package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f61731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f61732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f61733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f61734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f61735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f61736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f61737g;

    o0(JSONObject jSONObject, String str, String str2, boolean z10, long j10) {
        this.f61732b = str;
        this.f61731a = jSONObject;
        this.f61733c = str2;
        this.f61734d = z10;
        this.f61735e = j10;
    }

    public static o0 a(String str, String str2, long j10) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
                return a(jSONObject, str2, j10);
            }
            x2.a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th2) {
            x2.b("RawPurchase error: creating object failed", th2);
            return null;
        }
    }

    public Long b() {
        return this.f61737g;
    }

    public String c() {
        return this.f61733c;
    }

    public JSONObject d() {
        return this.f61731a;
    }

    public JSONObject e() {
        return this.f61736f;
    }

    public long f() {
        return this.f61735e;
    }

    public boolean g() {
        return this.f61734d;
    }

    public static o0 a(JSONObject jSONObject, String str, long j10) {
        return new o0(jSONObject, str, jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID), jSONObject.has("autoRenewing"), j10);
    }

    public String a() {
        return this.f61732b;
    }

    public o0 a(Long l10) {
        this.f61737g = l10;
        return this;
    }

    public o0 a(JSONObject jSONObject) {
        this.f61736f = jSONObject;
        return this;
    }
}

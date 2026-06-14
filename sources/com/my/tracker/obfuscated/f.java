package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f61474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f61475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f61476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f61477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f61478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f61479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f61480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f61481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Long f61482i;

    f(JSONObject jSONObject, String str, String str2, String str3, int i10, boolean z10, long j10) {
        this.f61475b = str;
        this.f61474a = jSONObject;
        this.f61476c = str2;
        this.f61477d = str3;
        this.f61478e = i10;
        this.f61479f = z10;
        this.f61480g = j10;
    }

    public static f a(String str, String str2, String str3, int i10, long j10) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            if (!TextUtils.isEmpty(strOptString)) {
                return new f(jSONObject, str2, str3, strOptString, i10, jSONObject.has("priceType") && jSONObject.getInt("priceType") == 2, j10);
            }
            x2.a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th2) {
            x2.b("RawPurchase error: creating object failed", th2);
            return null;
        }
    }

    public Long b() {
        return this.f61482i;
    }

    public String c() {
        return this.f61477d;
    }

    public JSONObject d() {
        return this.f61481h;
    }

    public JSONObject e() {
        return this.f61474a;
    }

    public String f() {
        return this.f61476c;
    }

    public int g() {
        return this.f61478e;
    }

    public long h() {
        return this.f61480g;
    }

    public String a() {
        return this.f61475b;
    }

    public f a(Long l10) {
        this.f61482i = l10;
        return this;
    }

    public f a(JSONObject jSONObject) {
        this.f61481h = jSONObject;
        return this;
    }
}

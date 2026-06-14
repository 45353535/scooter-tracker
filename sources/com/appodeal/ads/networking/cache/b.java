package com.appodeal.ads.networking.cache;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.networking.d;
import com.appodeal.ads.storage.e0;
import com.appodeal.ads.utils.Log;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f14096b;

    public b(String key, e0 keyValueStorage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        this.f14095a = key;
        this.f14096b = keyValueStorage;
    }

    @Override // com.appodeal.ads.networking.d
    public final void a(JSONObject jSONObject) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iOptInt = jSONObject.optInt("wst", Constants.DEFAULT_WATERFALL_VALIDITY_PERIOD);
        e0 e0Var = this.f14096b;
        String str = this.f14095a;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        e0Var.b(str, string, jCurrentTimeMillis, iOptInt);
    }

    @Override // com.appodeal.ads.networking.d
    public final JSONObject a() {
        try {
            e0 e0Var = this.f14096b;
            String key = this.f14095a;
            e0Var.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Triple tripleB = e0Var.f14800a.b(key);
            JSONObject jSONObject = (JSONObject) tripleB.d();
            long jLongValue = ((Number) tripleB.g()).longValue();
            int iIntValue = ((Number) tripleB.h()).intValue();
            if (jSONObject != null && System.currentTimeMillis() - jLongValue <= iIntValue) {
                return jSONObject;
            }
            e0 e0Var2 = this.f14096b;
            String key2 = this.f14095a;
            e0Var2.getClass();
            Intrinsics.checkNotNullParameter(key2, "key");
            e0Var2.f14800a.d(key2);
            return null;
        } catch (Throwable th2) {
            Log.log(th2);
            return null;
        }
    }
}

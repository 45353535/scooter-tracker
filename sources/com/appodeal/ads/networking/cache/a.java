package com.appodeal.ads.networking.cache;

import com.appodeal.ads.networking.d;
import com.appodeal.ads.storage.e0;
import com.appodeal.ads.utils.Log;
import com.ironsource.C4240b4;
import com.vungle.ads.internal.model.Cookie;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f14094b;

    public a(e0 keyValueStorage) {
        Intrinsics.checkNotNullParameter(Cookie.CONFIG_RESPONSE, C4240b4.i.W);
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        this.f14093a = Cookie.CONFIG_RESPONSE;
        this.f14094b = keyValueStorage;
    }

    @Override // com.appodeal.ads.networking.d
    public final void a(JSONObject jSONObject) {
        e0 e0Var = this.f14094b;
        String str = this.f14093a;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        e0Var.b(str, string, System.currentTimeMillis(), Integer.MAX_VALUE);
    }

    @Override // com.appodeal.ads.networking.d
    public final JSONObject a() {
        try {
            e0 e0Var = this.f14094b;
            String key = this.f14093a;
            e0Var.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            JSONObject jSONObject = (JSONObject) e0Var.f14800a.b(key).d();
            if (jSONObject != null) {
                return jSONObject;
            }
            e0 e0Var2 = this.f14094b;
            String key2 = this.f14093a;
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

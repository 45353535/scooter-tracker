package com.appodeal.ads.networking.cache;

import com.appodeal.ads.networking.d;
import com.appodeal.ads.utils.Log;
import com.ironsource.C4240b4;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.appodeal.ads.storage.c f14098b;

    public c(com.appodeal.ads.storage.c keyValueStorage) {
        Intrinsics.checkNotNullParameter("init_response", C4240b4.i.W);
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        this.f14097a = "init_response";
        this.f14098b = keyValueStorage;
    }

    @Override // com.appodeal.ads.networking.d
    public final void a(JSONObject jSONObject) {
        com.appodeal.ads.storage.c cVar = this.f14098b;
        String str = this.f14097a;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        cVar.b(str, string, System.currentTimeMillis(), Integer.MAX_VALUE);
    }

    @Override // com.appodeal.ads.networking.d
    public final JSONObject a() {
        try {
            JSONObject jSONObject = (JSONObject) this.f14098b.b(this.f14097a).d();
            if (jSONObject != null) {
                return jSONObject;
            }
            this.f14098b.d(this.f14097a);
            return null;
        } catch (Throwable th2) {
            Log.log(th2);
            return null;
        }
    }
}

package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements com.fyber.inneractive.sdk.cache.a {
    @Override // com.fyber.inneractive.sdk.cache.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "IALastModifiedFromHeader.remote";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return "ia-remote.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) throws Exception {
        try {
            return l.a(new JSONObject(str));
        } catch (Exception e10) {
            IAlog.b("internal error while parsing remote features config file", new Object[0]);
            if (IAlog.f23840a <= 5) {
                e10.printStackTrace();
            }
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        int i10 = com.fyber.inneractive.sdk.config.k.f20410a;
        if (System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl") == null) {
            Locale locale = Locale.ENGLISH;
            return "https://cdn2.inner-active.mobi/ia-sdk-config/features_config.json";
        }
        return System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl");
    }
}

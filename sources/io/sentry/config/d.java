package io.sentry.config;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.sentry.util.d0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class d implements g {
    d() {
    }

    private String i(String str) {
        return "SENTRY_" + str.replace(".", "_").replace(TokenBuilder.TOKEN_DELIMITER, "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.g
    public /* synthetic */ Double a(String str) {
        return f.b(this, str);
    }

    @Override // io.sentry.config.g
    public /* synthetic */ List b(String str) {
        return f.c(this, str);
    }

    @Override // io.sentry.config.g
    public /* synthetic */ Boolean c(String str) {
        return f.a(this, str);
    }

    @Override // io.sentry.config.g
    public /* synthetic */ List d(String str) {
        return f.d(this, str);
    }

    @Override // io.sentry.config.g
    public Map e(String str) {
        String strF;
        String str2 = i(str) + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str2) && (strF = d0.f(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(str2.length()).toLowerCase(Locale.ROOT), strF);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.g
    public /* synthetic */ Long f(String str) {
        return f.e(this, str);
    }

    @Override // io.sentry.config.g
    public /* synthetic */ String g(String str, String str2) {
        return f.f(this, str, str2);
    }

    @Override // io.sentry.config.g
    public String h(String str) {
        return d0.f(System.getenv(i(str)), "\"");
    }
}

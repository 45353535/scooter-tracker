package io.sentry.config;

import io.sentry.util.d0;
import io.sentry.util.w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
abstract class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f83383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Properties f83384b;

    protected a(String str, Properties properties) {
        this.f83383a = (String) w.c(str, "prefix is required");
        this.f83384b = (Properties) w.c(properties, "properties are required");
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
        String str2 = this.f83383a + str + ".";
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f83384b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    map.put(str3.substring(str2.length()), d0.f((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
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
        return d0.f(this.f83384b.getProperty(this.f83383a + str), "\"");
    }

    protected a(Properties properties) {
        this("", properties);
    }
}

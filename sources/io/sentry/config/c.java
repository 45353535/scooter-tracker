package io.sentry.config;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f83388a;

    public c(List list) {
        this.f83388a = list;
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
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.f83388a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((g) it.next()).e(str));
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
        Iterator it = this.f83388a.iterator();
        while (it.hasNext()) {
            String strH = ((g) it.next()).h(str);
            if (strH != null) {
                return strH;
            }
        }
        return null;
    }
}

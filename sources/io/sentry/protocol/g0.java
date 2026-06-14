package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f83939c;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g0 a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            String strG = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("source")) {
                    strG = m3Var.G();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    m3Var.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            g0 g0Var = new g0(strG);
            g0Var.a(concurrentHashMap);
            m3Var.endObject();
            return g0Var;
        }
    }

    public g0(String str) {
        this.f83938b = str;
    }

    public void a(Map map) {
        this.f83939c = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83938b != null) {
            n3Var.e("source").j(iLogger, this.f83938b);
        }
        Map map = this.f83939c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83939c.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }
}

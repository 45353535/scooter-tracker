package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.g7;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Number f83972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f83973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f83974d;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            Number number = null;
            String strG = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("unit")) {
                    strG = m3Var.G();
                } else if (strNextName.equals("value")) {
                    number = (Number) m3Var.p0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    m3Var.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            m3Var.endObject();
            if (number != null) {
                k kVar = new k(number, strG);
                kVar.a(concurrentHashMap);
                return kVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.a(g7.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public k(Number number, String str) {
        this.f83972b = number;
        this.f83973c = str;
    }

    public void a(Map map) {
        this.f83974d = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("value").i(this.f83972b);
        if (this.f83973c != null) {
            n3Var.e("unit").a(this.f83973c);
        }
        Map map = this.f83974d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83974d.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }
}

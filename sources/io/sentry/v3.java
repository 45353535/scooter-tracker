package io.sentry;

import io.sentry.protocol.x;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class v3 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.protocol.x f84333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f84334c;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v3 a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            v3 v3Var = new v3();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("profiler_id")) {
                    io.sentry.protocol.x xVar = (io.sentry.protocol.x) m3Var.B(iLogger, new x.a());
                    if (xVar != null) {
                        v3Var.f84333b = xVar;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    m3Var.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            v3Var.b(concurrentHashMap);
            m3Var.endObject();
            return v3Var;
        }
    }

    public v3() {
        this(io.sentry.protocol.x.f84062c);
    }

    public void b(Map map) {
        this.f84334c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v3) {
            return this.f84333b.equals(((v3) obj).f84333b);
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f84333b);
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("profiler_id").j(iLogger, this.f84333b);
        Map map = this.f84334c;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f84334c.get(str));
            }
        }
        n3Var.endObject();
    }

    public v3(io.sentry.protocol.x xVar) {
        this.f84333b = xVar;
    }

    public v3(v3 v3Var) {
        this.f84333b = v3Var.f84333b;
        Map mapB = io.sentry.util.c.b(v3Var.f84334c);
        if (mapB != null) {
            this.f84334c = mapB;
        }
    }
}

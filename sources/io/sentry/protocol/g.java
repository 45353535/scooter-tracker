package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.protocol.f;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f83936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f83937c;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            List arrayList = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("values")) {
                    arrayList = m3Var.P(iLogger, new f.a());
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    m3Var.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            g gVar = new g(arrayList);
            gVar.b(concurrentHashMap);
            m3Var.endObject();
            return gVar;
        }
    }

    public g(List list) {
        this.f83936b = list;
    }

    public List a() {
        return this.f83936b;
    }

    public void b(Map map) {
        this.f83937c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.w.a(this.f83936b, ((g) obj).f83936b);
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f83936b);
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("values").j(iLogger, this.f83936b);
        Map map = this.f83937c;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83937c.get(str));
            }
        }
        n3Var.endObject();
    }
}

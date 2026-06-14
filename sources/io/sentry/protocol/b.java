package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f83853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f83854d;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("name")) {
                    bVar.f83852b = m3Var.G();
                } else if (strNextName.equals("version")) {
                    bVar.f83853c = m3Var.G();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    m3Var.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            bVar.c(concurrentHashMap);
            m3Var.endObject();
            return bVar;
        }
    }

    public b() {
    }

    public void c(Map map) {
        this.f83854d = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (io.sentry.util.w.a(this.f83852b, bVar.f83852b) && io.sentry.util.w.a(this.f83853c, bVar.f83853c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f83852b, this.f83853c);
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83852b != null) {
            n3Var.e("name").a(this.f83852b);
        }
        if (this.f83853c != null) {
            n3Var.e("version").a(this.f83853c);
        }
        Map map = this.f83854d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83854d.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    b(b bVar) {
        this.f83852b = bVar.f83852b;
        this.f83853c = bVar.f83853c;
        this.f83854d = io.sentry.util.c.b(bVar.f83854d);
    }
}

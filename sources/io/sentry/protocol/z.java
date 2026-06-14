package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f84068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f84070e;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            z zVar = new z();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "raw_description":
                        zVar.f84069d = m3Var.G();
                        break;
                    case "name":
                        zVar.f84067b = m3Var.G();
                        break;
                    case "version":
                        zVar.f84068c = m3Var.G();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            zVar.g(concurrentHashMap);
            m3Var.endObject();
            return zVar;
        }
    }

    public z() {
    }

    public String d() {
        return this.f84067b;
    }

    public String e() {
        return this.f84068c;
    }

    public void f(String str) {
        this.f84067b = str;
    }

    public void g(Map map) {
        this.f84070e = map;
    }

    public void h(String str) {
        this.f84068c = str;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84067b != null) {
            n3Var.e("name").a(this.f84067b);
        }
        if (this.f84068c != null) {
            n3Var.e("version").a(this.f84068c);
        }
        if (this.f84069d != null) {
            n3Var.e("raw_description").a(this.f84069d);
        }
        Map map = this.f84070e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84070e.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    z(z zVar) {
        this.f84067b = zVar.f84067b;
        this.f84068c = zVar.f84068c;
        this.f84069d = zVar.f84069d;
        this.f84070e = io.sentry.util.c.b(zVar.f84070e);
    }
}

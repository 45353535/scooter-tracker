package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f84023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f84024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f84025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f84026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f84027g;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            p pVar = new p();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "status_code":
                        pVar.f84024d = m3Var.d0();
                        break;
                    case "data":
                        pVar.f84026f = m3Var.p0();
                        break;
                    case "headers":
                        Map map = (Map) m3Var.p0();
                        if (map == null) {
                            break;
                        } else {
                            pVar.f84023c = io.sentry.util.c.b(map);
                            break;
                        }
                        break;
                    case "cookies":
                        pVar.f84022b = m3Var.G();
                        break;
                    case "body_size":
                        pVar.f84025e = m3Var.g0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            pVar.f(concurrentHashMap);
            m3Var.endObject();
            return pVar;
        }
    }

    public p() {
    }

    public void f(Map map) {
        this.f84027g = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84022b != null) {
            n3Var.e("cookies").a(this.f84022b);
        }
        if (this.f84023c != null) {
            n3Var.e("headers").j(iLogger, this.f84023c);
        }
        if (this.f84024d != null) {
            n3Var.e("status_code").j(iLogger, this.f84024d);
        }
        if (this.f84025e != null) {
            n3Var.e("body_size").j(iLogger, this.f84025e);
        }
        if (this.f84026f != null) {
            n3Var.e("data").j(iLogger, this.f84026f);
        }
        Map map = this.f84027g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84027g.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public p(p pVar) {
        this.f84022b = pVar.f84022b;
        this.f84023c = io.sentry.util.c.b(pVar.f84023c);
        this.f84027g = io.sentry.util.c.b(pVar.f84027g);
        this.f84024d = pVar.f84024d;
        this.f84025e = pVar.f84025e;
        this.f84026f = pVar.f84026f;
    }
}

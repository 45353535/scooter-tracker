package io.sentry.protocol;

import com.ironsource.D5;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f84011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f84013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f84014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f84015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f84016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Long f84017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f84018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f84019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f84020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map f84021m;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            o oVar = new o();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "fragment":
                        oVar.f84019k = m3Var.G();
                        break;
                    case "method":
                        oVar.f84011c = m3Var.G();
                        break;
                    case "env":
                        Map map = (Map) m3Var.p0();
                        if (map == null) {
                            break;
                        } else {
                            oVar.f84016h = io.sentry.util.c.b(map);
                            break;
                        }
                        break;
                    case "url":
                        oVar.f84010b = m3Var.G();
                        break;
                    case "data":
                        oVar.f84013e = m3Var.p0();
                        break;
                    case "other":
                        Map map2 = (Map) m3Var.p0();
                        if (map2 == null) {
                            break;
                        } else {
                            oVar.f84018j = io.sentry.util.c.b(map2);
                            break;
                        }
                        break;
                    case "headers":
                        Map map3 = (Map) m3Var.p0();
                        if (map3 == null) {
                            break;
                        } else {
                            oVar.f84015g = io.sentry.util.c.b(map3);
                            break;
                        }
                        break;
                    case "cookies":
                        oVar.f84014f = m3Var.G();
                        break;
                    case "body_size":
                        oVar.f84017i = m3Var.g0();
                        break;
                    case "query_string":
                        oVar.f84012d = m3Var.G();
                        break;
                    case "api_target":
                        oVar.f84020l = m3Var.G();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            oVar.m(concurrentHashMap);
            m3Var.endObject();
            return oVar;
        }
    }

    public o() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (io.sentry.util.w.a(this.f84010b, oVar.f84010b) && io.sentry.util.w.a(this.f84011c, oVar.f84011c) && io.sentry.util.w.a(this.f84012d, oVar.f84012d) && io.sentry.util.w.a(this.f84014f, oVar.f84014f) && io.sentry.util.w.a(this.f84015g, oVar.f84015g) && io.sentry.util.w.a(this.f84016h, oVar.f84016h) && io.sentry.util.w.a(this.f84017i, oVar.f84017i) && io.sentry.util.w.a(this.f84019k, oVar.f84019k) && io.sentry.util.w.a(this.f84020l, oVar.f84020l)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f84010b, this.f84011c, this.f84012d, this.f84014f, this.f84015g, this.f84016h, this.f84017i, this.f84019k, this.f84020l);
    }

    public Map l() {
        return this.f84015g;
    }

    public void m(Map map) {
        this.f84021m = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84010b != null) {
            n3Var.e("url").a(this.f84010b);
        }
        if (this.f84011c != null) {
            n3Var.e("method").a(this.f84011c);
        }
        if (this.f84012d != null) {
            n3Var.e("query_string").a(this.f84012d);
        }
        if (this.f84013e != null) {
            n3Var.e("data").j(iLogger, this.f84013e);
        }
        if (this.f84014f != null) {
            n3Var.e("cookies").a(this.f84014f);
        }
        if (this.f84015g != null) {
            n3Var.e("headers").j(iLogger, this.f84015g);
        }
        if (this.f84016h != null) {
            n3Var.e(D5.f40568o).j(iLogger, this.f84016h);
        }
        if (this.f84018j != null) {
            n3Var.e("other").j(iLogger, this.f84018j);
        }
        if (this.f84019k != null) {
            n3Var.e("fragment").j(iLogger, this.f84019k);
        }
        if (this.f84017i != null) {
            n3Var.e("body_size").j(iLogger, this.f84017i);
        }
        if (this.f84020l != null) {
            n3Var.e("api_target").j(iLogger, this.f84020l);
        }
        Map map = this.f84021m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84021m.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public o(o oVar) {
        this.f84010b = oVar.f84010b;
        this.f84014f = oVar.f84014f;
        this.f84011c = oVar.f84011c;
        this.f84012d = oVar.f84012d;
        this.f84015g = io.sentry.util.c.b(oVar.f84015g);
        this.f84016h = io.sentry.util.c.b(oVar.f84016h);
        this.f84018j = io.sentry.util.c.b(oVar.f84018j);
        this.f84021m = io.sentry.util.c.b(oVar.f84021m);
        this.f84013e = oVar.f84013e;
        this.f84019k = oVar.f84019k;
        this.f84017i = oVar.f84017i;
        this.f84020l = oVar.f84020l;
    }
}

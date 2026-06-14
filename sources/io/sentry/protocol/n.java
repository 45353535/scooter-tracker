package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f84004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f84006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f84007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f84008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f84009h;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            n nVar = new n();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "rooted":
                        nVar.f84008g = m3Var.x();
                        break;
                    case "raw_description":
                        nVar.f84005d = m3Var.G();
                        break;
                    case "name":
                        nVar.f84003b = m3Var.G();
                        break;
                    case "build":
                        nVar.f84006e = m3Var.G();
                        break;
                    case "version":
                        nVar.f84004c = m3Var.G();
                        break;
                    case "kernel_version":
                        nVar.f84007f = m3Var.G();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            nVar.l(concurrentHashMap);
            m3Var.endObject();
            return nVar;
        }
    }

    public n() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (io.sentry.util.w.a(this.f84003b, nVar.f84003b) && io.sentry.util.w.a(this.f84004c, nVar.f84004c) && io.sentry.util.w.a(this.f84005d, nVar.f84005d) && io.sentry.util.w.a(this.f84006e, nVar.f84006e) && io.sentry.util.w.a(this.f84007f, nVar.f84007f) && io.sentry.util.w.a(this.f84008g, nVar.f84008g)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        return this.f84003b;
    }

    public void h(String str) {
        this.f84006e = str;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f84003b, this.f84004c, this.f84005d, this.f84006e, this.f84007f, this.f84008g);
    }

    public void i(String str) {
        this.f84007f = str;
    }

    public void j(String str) {
        this.f84003b = str;
    }

    public void k(Boolean bool) {
        this.f84008g = bool;
    }

    public void l(Map map) {
        this.f84009h = map;
    }

    public void m(String str) {
        this.f84004c = str;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84003b != null) {
            n3Var.e("name").a(this.f84003b);
        }
        if (this.f84004c != null) {
            n3Var.e("version").a(this.f84004c);
        }
        if (this.f84005d != null) {
            n3Var.e("raw_description").a(this.f84005d);
        }
        if (this.f84006e != null) {
            n3Var.e("build").a(this.f84006e);
        }
        if (this.f84007f != null) {
            n3Var.e("kernel_version").a(this.f84007f);
        }
        if (this.f84008g != null) {
            n3Var.e("rooted").k(this.f84008g);
        }
        Map map = this.f84009h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84009h.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    n(n nVar) {
        this.f84003b = nVar.f84003b;
        this.f84004c = nVar.f84004c;
        this.f84005d = nVar.f84005d;
        this.f84006e = nVar.f84006e;
        this.f84007f = nVar.f84007f;
        this.f84008g = nVar.f84008g;
        this.f84009h = io.sentry.util.c.b(nVar.f84009h);
    }
}

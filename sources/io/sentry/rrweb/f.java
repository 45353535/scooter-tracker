package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.rrweb.b;
import io.sentry.rrweb.d;
import io.sentry.t1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d implements d2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f84120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f84121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f84122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f84123h;

    public static final class a implements t1 {
        private void c(f fVar, m3 m3Var, ILogger iLogger) {
            d.a aVar = new d.a();
            m3Var.beginObject();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("pointerId")) {
                    fVar.f84120e = m3Var.nextInt();
                } else if (strNextName.equals("positions")) {
                    fVar.f84121f = m3Var.P(iLogger, new b.a());
                } else if (!aVar.a(fVar, strNextName, m3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            fVar.l(map);
            m3Var.endObject();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            f fVar = new f();
            b.a aVar = new b.a();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    c(fVar, m3Var, iLogger);
                } else if (!aVar.a(fVar, strNextName, m3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            fVar.o(map);
            m3Var.endObject();
            return fVar;
        }
    }

    public static final class b implements d2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f84124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f84125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f84126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f84127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f84128f;

        public static final class a implements t1 {
            @Override // io.sentry.t1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(m3 m3Var, ILogger iLogger) {
                String strNextName;
                m3Var.beginObject();
                b bVar = new b();
                HashMap map = null;
                while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName = m3Var.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "x":
                            bVar.f84125c = m3Var.E();
                            break;
                        case "y":
                            bVar.f84126d = m3Var.E();
                            break;
                        case "id":
                            bVar.f84124b = m3Var.nextInt();
                            break;
                        case "timeOffset":
                            bVar.f84127e = m3Var.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            m3Var.l0(iLogger, map, strNextName);
                            break;
                    }
                }
                bVar.h(map);
                m3Var.endObject();
                return bVar;
            }
        }

        public long e() {
            return this.f84127e;
        }

        public void f(int i10) {
            this.f84124b = i10;
        }

        public void g(long j10) {
            this.f84127e = j10;
        }

        public void h(Map map) {
            this.f84128f = map;
        }

        public void i(float f10) {
            this.f84125c = f10;
        }

        public void j(float f10) {
            this.f84126d = f10;
        }

        @Override // io.sentry.d2
        public void serialize(n3 n3Var, ILogger iLogger) {
            n3Var.beginObject();
            n3Var.e("id").b(this.f84124b);
            n3Var.e("x").c(this.f84125c);
            n3Var.e("y").c(this.f84126d);
            n3Var.e("timeOffset").b(this.f84127e);
            Map map = this.f84128f;
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = this.f84128f.get(str);
                    n3Var.e(str);
                    n3Var.j(iLogger, obj);
                }
            }
            n3Var.endObject();
        }
    }

    public f() {
        super(d.b.TouchMove);
    }

    private void k(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        new d.c().a(this, n3Var, iLogger);
        List list = this.f84121f;
        if (list != null && !list.isEmpty()) {
            n3Var.e("positions").j(iLogger, this.f84121f);
        }
        n3Var.e("pointerId").b(this.f84120e);
        Map map = this.f84123h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84123h.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public void l(Map map) {
        this.f84123h = map;
    }

    public void m(int i10) {
        this.f84120e = i10;
    }

    public void n(List list) {
        this.f84121f = list;
    }

    public void o(Map map) {
        this.f84122g = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        new b.C1014b().a(this, n3Var, iLogger);
        n3Var.e("data");
        k(n3Var, iLogger);
        Map map = this.f84122g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84122g.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }
}

package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.rrweb.b;
import io.sentry.t1;
import io.sentry.util.w;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends b implements d2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f84130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f84131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f84132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f84133h;

    public static final class a implements t1 {
        private void c(g gVar, m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "height":
                        Integer numD0 = m3Var.d0();
                        gVar.f84130e = numD0 == null ? 0 : numD0.intValue();
                        break;
                    case "href":
                        String strG = m3Var.G();
                        if (strG == null) {
                            strG = "";
                        }
                        gVar.f84129d = strG;
                        break;
                    case "width":
                        Integer numD02 = m3Var.d0();
                        gVar.f84131f = numD02 == null ? 0 : numD02.intValue();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            gVar.k(concurrentHashMap);
            m3Var.endObject();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            g gVar = new g();
            b.a aVar = new b.a();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    c(gVar, m3Var, iLogger);
                } else if (!aVar.a(gVar, strNextName, m3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            gVar.m(map);
            m3Var.endObject();
            return gVar;
        }
    }

    public g() {
        super(c.Meta);
        this.f84129d = "";
    }

    private void j(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e(SVGParserImpl.XML_STYLESHEET_ATTR_HREF).a(this.f84129d);
        n3Var.e("height").b(this.f84130e);
        n3Var.e("width").b(this.f84131f);
        Map map = this.f84132g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84132g.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f84130e == gVar.f84130e && this.f84131f == gVar.f84131f && w.a(this.f84129d, gVar.f84129d);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return w.b(Integer.valueOf(super.hashCode()), this.f84129d, Integer.valueOf(this.f84130e), Integer.valueOf(this.f84131f));
    }

    public void k(Map map) {
        this.f84133h = map;
    }

    public void l(int i10) {
        this.f84130e = i10;
    }

    public void m(Map map) {
        this.f84132g = map;
    }

    public void n(int i10) {
        this.f84131f = i10;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        new b.C1014b().a(this, n3Var, iLogger);
        n3Var.e("data");
        j(n3Var, iLogger);
        n3Var.endObject();
    }
}

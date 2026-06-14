package io.sentry.rrweb;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.taurusx.tax.y.z.w.s;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.g7;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.rrweb.b;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b implements d2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f84100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f84101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f84102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f84103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g7 f84104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f84105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f84106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f84107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map f84108m;

    /* JADX INFO: renamed from: io.sentry.rrweb.a$a, reason: collision with other inner class name */
    public static final class C1013a implements t1 {
        private void c(a aVar, m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    d(aVar, m3Var, iLogger);
                } else if (strNextName.equals(s.z.f67720z)) {
                    String strG = m3Var.G();
                    if (strG == null) {
                        strG = "";
                    }
                    aVar.f84099d = strG;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    m3Var.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            aVar.v(concurrentHashMap);
            m3Var.endObject();
        }

        private void d(a aVar, m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "data":
                        Map mapB = io.sentry.util.c.b((Map) m3Var.p0());
                        if (mapB == null) {
                            break;
                        } else {
                            aVar.f84105j = mapB;
                            break;
                        }
                        break;
                    case "type":
                        aVar.f84101f = m3Var.G();
                        break;
                    case "category":
                        aVar.f84102g = m3Var.G();
                        break;
                    case "timestamp":
                        aVar.f84100e = m3Var.nextDouble();
                        break;
                    case "level":
                        try {
                            aVar.f84104i = new g7.a().a(m3Var, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.b(g7.DEBUG, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        aVar.f84103h = m3Var.G();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            aVar.y(concurrentHashMap);
            m3Var.endObject();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            a aVar = new a();
            b.a aVar2 = new b.a();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    c(aVar, m3Var, iLogger);
                } else if (!aVar2.a(aVar, strNextName, m3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            aVar.z(map);
            m3Var.endObject();
            return aVar;
        }
    }

    public a() {
        super(c.Custom);
        this.f84099d = "breadcrumb";
    }

    private void p(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e(s.z.f67720z).a(this.f84099d);
        n3Var.e("payload");
        q(n3Var, iLogger);
        Map map = this.f84108m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84108m.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    private void q(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84101f != null) {
            n3Var.e("type").a(this.f84101f);
        }
        n3Var.e("timestamp").j(iLogger, BigDecimal.valueOf(this.f84100e));
        if (this.f84102g != null) {
            n3Var.e("category").a(this.f84102g);
        }
        if (this.f84103h != null) {
            n3Var.e(PglCryptUtils.KEY_MESSAGE).a(this.f84103h);
        }
        if (this.f84104i != null) {
            n3Var.e("level").j(iLogger, this.f84104i);
        }
        if (this.f84105j != null) {
            n3Var.e("data").j(iLogger, this.f84105j);
        }
        Map map = this.f84107l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84107l.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public String n() {
        return this.f84102g;
    }

    public Map o() {
        return this.f84105j;
    }

    public void r(double d10) {
        this.f84100e = d10;
    }

    public void s(String str) {
        this.f84101f = str;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        new b.C1014b().a(this, n3Var, iLogger);
        n3Var.e("data");
        p(n3Var, iLogger);
        Map map = this.f84106k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84106k.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public void t(String str) {
        this.f84102g = str;
    }

    public void u(Map map) {
        this.f84105j = map == null ? null : new ConcurrentHashMap(map);
    }

    public void v(Map map) {
        this.f84108m = map;
    }

    public void w(g7 g7Var) {
        this.f84104i = g7Var;
    }

    public void x(String str) {
        this.f84103h = str;
    }

    public void y(Map map) {
        this.f84107l = map;
    }

    public void z(Map map) {
        this.f84106k = map;
    }
}

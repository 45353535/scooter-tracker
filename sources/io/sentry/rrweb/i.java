package io.sentry.rrweb;

import com.taurusx.tax.y.z.w.s;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.rrweb.b;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends b implements d2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f84139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f84140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f84141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f84142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f84143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f84144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f84145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f84146l;

    public static final class a implements t1 {
        private void c(i iVar, m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    d(iVar, m3Var, iLogger);
                } else if (strNextName.equals(s.z.f67720z)) {
                    String strG = m3Var.G();
                    if (strG == null) {
                        strG = "";
                    }
                    iVar.f84138d = strG;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    m3Var.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            iVar.p(concurrentHashMap);
            m3Var.endObject();
        }

        private void d(i iVar, m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "description":
                        iVar.f84140f = m3Var.G();
                        break;
                    case "endTimestamp":
                        iVar.f84142h = m3Var.nextDouble();
                        break;
                    case "startTimestamp":
                        iVar.f84141g = m3Var.nextDouble();
                        break;
                    case "op":
                        iVar.f84139e = m3Var.G();
                        break;
                    case "data":
                        Map mapB = io.sentry.util.c.b((Map) m3Var.p0());
                        if (mapB == null) {
                            break;
                        } else {
                            iVar.f84143i = mapB;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            iVar.t(concurrentHashMap);
            m3Var.endObject();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            i iVar = new i();
            b.a aVar = new b.a();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    c(iVar, m3Var, iLogger);
                } else if (!aVar.a(iVar, strNextName, m3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            iVar.v(map);
            m3Var.endObject();
            return iVar;
        }
    }

    public i() {
        super(c.Custom);
        this.f84138d = "performanceSpan";
    }

    private void m(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e(s.z.f67720z).a(this.f84138d);
        n3Var.e("payload");
        n(n3Var, iLogger);
        Map map = this.f84146l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84146l.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    private void n(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84139e != null) {
            n3Var.e("op").a(this.f84139e);
        }
        if (this.f84140f != null) {
            n3Var.e("description").a(this.f84140f);
        }
        n3Var.e("startTimestamp").j(iLogger, BigDecimal.valueOf(this.f84141g));
        n3Var.e("endTimestamp").j(iLogger, BigDecimal.valueOf(this.f84142h));
        if (this.f84143i != null) {
            n3Var.e("data").j(iLogger, this.f84143i);
        }
        Map map = this.f84145k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84145k.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public void o(Map map) {
        this.f84143i = map == null ? null : new ConcurrentHashMap(map);
    }

    public void p(Map map) {
        this.f84146l = map;
    }

    public void q(String str) {
        this.f84140f = str;
    }

    public void r(double d10) {
        this.f84142h = d10;
    }

    public void s(String str) {
        this.f84139e = str;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        new b.C1014b().a(this, n3Var, iLogger);
        n3Var.e("data");
        m(n3Var, iLogger);
        Map map = this.f84144j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84144j.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public void t(Map map) {
        this.f84145k = map;
    }

    public void u(double d10) {
        this.f84141g = d10;
    }

    public void v(Map map) {
        this.f84144j = map;
    }
}

package io.sentry;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import io.sentry.g7;
import io.sentry.n5;
import io.sentry.protocol.d0;
import io.sentry.protocol.m;
import io.sentry.protocol.s;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class w6 extends n5 implements d2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Date f84416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private io.sentry.protocol.m f84417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f84418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private j8 f84419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private j8 f84420u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private g7 f84421v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f84422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f84423x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map f84424y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Map f84425z;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w6 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            w6 w6Var = new w6();
            n5.a aVar = new n5.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "fingerprint":
                        List list = (List) m3Var.p0();
                        if (list == null) {
                            break;
                        } else {
                            w6Var.f84423x = list;
                            break;
                        }
                        break;
                    case "threads":
                        m3Var.beginObject();
                        m3Var.nextName();
                        w6Var.f84419t = new j8(m3Var.P(iLogger, new d0.a()));
                        m3Var.endObject();
                        break;
                    case "logger":
                        w6Var.f84418s = m3Var.G();
                        break;
                    case "timestamp":
                        Date dateL = m3Var.l(iLogger);
                        if (dateL == null) {
                            break;
                        } else {
                            w6Var.f84416q = dateL;
                            break;
                        }
                        break;
                    case "level":
                        w6Var.f84421v = (g7) m3Var.B(iLogger, new g7.a());
                        break;
                    case "message":
                        w6Var.f84417r = (io.sentry.protocol.m) m3Var.B(iLogger, new m.a());
                        break;
                    case "modules":
                        w6Var.f84425z = io.sentry.util.c.b((Map) m3Var.p0());
                        break;
                    case "exception":
                        m3Var.beginObject();
                        m3Var.nextName();
                        w6Var.f84420u = new j8(m3Var.P(iLogger, new s.a()));
                        m3Var.endObject();
                        break;
                    case "transaction":
                        w6Var.f84422w = m3Var.G();
                        break;
                    default:
                        if (!aVar.a(w6Var, strNextName, m3Var, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            m3Var.l0(iLogger, concurrentHashMap, strNextName);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            w6Var.K0(concurrentHashMap);
            m3Var.endObject();
            return w6Var;
        }
    }

    w6(io.sentry.protocol.x xVar, Date date) {
        super(xVar);
        this.f84416q = date;
    }

    public boolean A0() {
        return z0() != null;
    }

    public boolean B0() {
        j8 j8Var = this.f84420u;
        return (j8Var == null || j8Var.a().isEmpty()) ? false : true;
    }

    public void C0(List list) {
        this.f84420u = new j8(list);
    }

    public void D0(List list) {
        this.f84423x = list != null ? new ArrayList(list) : null;
    }

    public void E0(g7 g7Var) {
        this.f84421v = g7Var;
    }

    public void F0(io.sentry.protocol.m mVar) {
        this.f84417r = mVar;
    }

    public void G0(Map map) {
        this.f84425z = io.sentry.util.c.c(map);
    }

    public void H0(List list) {
        this.f84419t = new j8(list);
    }

    public void I0(Date date) {
        this.f84416q = date;
    }

    public void J0(String str) {
        this.f84422w = str;
    }

    public void K0(Map map) {
        this.f84424y = map;
    }

    public List r0() {
        j8 j8Var = this.f84420u;
        if (j8Var == null) {
            return null;
        }
        return j8Var.a();
    }

    public List s0() {
        return this.f84423x;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("timestamp").j(iLogger, this.f84416q);
        if (this.f84417r != null) {
            n3Var.e(PglCryptUtils.KEY_MESSAGE).j(iLogger, this.f84417r);
        }
        if (this.f84418s != null) {
            n3Var.e("logger").a(this.f84418s);
        }
        j8 j8Var = this.f84419t;
        if (j8Var != null && !j8Var.a().isEmpty()) {
            n3Var.e("threads");
            n3Var.beginObject();
            n3Var.e("values").j(iLogger, this.f84419t.a());
            n3Var.endObject();
        }
        j8 j8Var2 = this.f84420u;
        if (j8Var2 != null && !j8Var2.a().isEmpty()) {
            n3Var.e("exception");
            n3Var.beginObject();
            n3Var.e("values").j(iLogger, this.f84420u.a());
            n3Var.endObject();
        }
        if (this.f84421v != null) {
            n3Var.e("level").j(iLogger, this.f84421v);
        }
        if (this.f84422w != null) {
            n3Var.e("transaction").a(this.f84422w);
        }
        if (this.f84423x != null) {
            n3Var.e("fingerprint").j(iLogger, this.f84423x);
        }
        if (this.f84425z != null) {
            n3Var.e("modules").j(iLogger, this.f84425z);
        }
        new n5.b().a(this, n3Var, iLogger);
        Map map = this.f84424y;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84424y.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public g7 t0() {
        return this.f84421v;
    }

    public io.sentry.protocol.m u0() {
        return this.f84417r;
    }

    Map v0() {
        return this.f84425z;
    }

    public List w0() {
        j8 j8Var = this.f84419t;
        if (j8Var != null) {
            return j8Var.a();
        }
        return null;
    }

    public Date x0() {
        return (Date) this.f84416q.clone();
    }

    public String y0() {
        return this.f84422w;
    }

    public io.sentry.protocol.s z0() {
        j8 j8Var = this.f84420u;
        if (j8Var == null) {
            return null;
        }
        for (io.sentry.protocol.s sVar : j8Var.a()) {
            if (sVar.g() != null && sVar.g().l() != null && !sVar.g().l().booleanValue()) {
                return sVar;
            }
        }
        return null;
    }

    public w6(Throwable th2) {
        this();
        this.f83760k = th2;
    }

    public w6() {
        this(new io.sentry.protocol.x(), l.d());
    }
}

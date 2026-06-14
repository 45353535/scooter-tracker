package io.sentry;

import io.sentry.protocol.x;
import io.sentry.u8;
import io.sentry.w8;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class p8 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.x f83803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u8 f83804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u8 f83805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient d9 f83806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f83807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f83808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected w8 f83809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Map f83810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f83811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected Map f83812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f83813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q1 f83814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected d f83815n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected io.sentry.featureflags.b f83816o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private io.sentry.protocol.x f83817p;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p8 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            String strNextString = null;
            io.sentry.protocol.x xVarA = null;
            u8 u8VarB = null;
            u8 u8Var = null;
            ConcurrentHashMap concurrentHashMap = null;
            String strNextString2 = null;
            w8 w8Var = null;
            String strNextString3 = null;
            Map mapB = null;
            Map map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "span_id":
                        u8VarB = new u8.a().a(m3Var, iLogger);
                        break;
                    case "parent_span_id":
                        u8Var = (u8) m3Var.B(iLogger, new u8.a());
                        break;
                    case "description":
                        strNextString2 = m3Var.nextString();
                        break;
                    case "origin":
                        strNextString3 = m3Var.nextString();
                        break;
                    case "status":
                        w8Var = (w8) m3Var.B(iLogger, new w8.a());
                        break;
                    case "op":
                        strNextString = m3Var.nextString();
                        break;
                    case "data":
                        map = (Map) m3Var.p0();
                        break;
                    case "tags":
                        mapB = io.sentry.util.c.b((Map) m3Var.p0());
                        break;
                    case "trace_id":
                        xVarA = new x.a().a(m3Var, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            if (xVarA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.a(g7.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (u8VarB == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                iLogger.a(g7.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strNextString == null) {
                strNextString = "";
            }
            p8 p8Var = new p8(xVarA, u8VarB, strNextString, u8Var, null);
            p8Var.r(strNextString2);
            p8Var.v(w8Var);
            p8Var.t(strNextString3);
            if (mapB != null) {
                p8Var.f83810i = mapB;
            }
            if (map != null) {
                p8Var.f83812k = map;
            }
            p8Var.w(concurrentHashMap);
            m3Var.endObject();
            return p8Var;
        }
    }

    public p8(String str) {
        this(new io.sentry.protocol.x(), new u8(), str, null, null);
    }

    public p8 a(String str, u8 u8Var, u8 u8Var2) {
        io.sentry.protocol.x xVar = this.f83803b;
        if (u8Var2 == null) {
            u8Var2 = new u8();
        }
        return new p8(xVar, u8Var2, u8Var, str, null, this.f83806e, null, "manual");
    }

    public d b() {
        return this.f83815n;
    }

    public String c() {
        return this.f83808g;
    }

    public io.sentry.featureflags.b d() {
        return this.f83816o;
    }

    public q1 e() {
        return this.f83814m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return this.f83803b.equals(p8Var.f83803b) && this.f83804c.equals(p8Var.f83804c) && io.sentry.util.w.a(this.f83805d, p8Var.f83805d) && this.f83807f.equals(p8Var.f83807f) && io.sentry.util.w.a(this.f83808g, p8Var.f83808g) && n() == p8Var.n();
    }

    public String f() {
        return this.f83807f;
    }

    public String g() {
        return this.f83811j;
    }

    public u8 h() {
        return this.f83805d;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f83803b, this.f83804c, this.f83805d, this.f83807f, this.f83808g, n());
    }

    public Boolean i() {
        d9 d9Var = this.f83806e;
        if (d9Var == null) {
            return null;
        }
        return d9Var.b();
    }

    public io.sentry.protocol.x j() {
        return this.f83817p;
    }

    public Boolean k() {
        d9 d9Var = this.f83806e;
        if (d9Var == null) {
            return null;
        }
        return d9Var.e();
    }

    public d9 l() {
        return this.f83806e;
    }

    public u8 m() {
        return this.f83804c;
    }

    public w8 n() {
        return this.f83809h;
    }

    public Map o() {
        return this.f83810i;
    }

    public io.sentry.protocol.x p() {
        return this.f83803b;
    }

    public void q(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f83812k.remove(str);
        } else {
            this.f83812k.put(str, obj);
        }
    }

    public void r(String str) {
        this.f83808g = str;
    }

    public void s(q1 q1Var) {
        this.f83814m = q1Var;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("trace_id");
        this.f83803b.serialize(n3Var, iLogger);
        n3Var.e("span_id");
        this.f83804c.serialize(n3Var, iLogger);
        if (this.f83805d != null) {
            n3Var.e("parent_span_id");
            this.f83805d.serialize(n3Var, iLogger);
        }
        n3Var.e("op").a(this.f83807f);
        if (this.f83808g != null) {
            n3Var.e("description").a(this.f83808g);
        }
        if (n() != null) {
            n3Var.e("status").j(iLogger, n());
        }
        if (this.f83811j != null) {
            n3Var.e("origin").j(iLogger, this.f83811j);
        }
        if (!this.f83810i.isEmpty()) {
            n3Var.e("tags").j(iLogger, this.f83810i);
        }
        if (!this.f83812k.isEmpty()) {
            n3Var.e("data").j(iLogger, this.f83812k);
        }
        Map map = this.f83813l;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83813l.get(str));
            }
        }
        n3Var.endObject();
    }

    public void t(String str) {
        this.f83811j = str;
    }

    public void u(d9 d9Var) {
        this.f83806e = d9Var;
        d dVar = this.f83815n;
        if (dVar != null) {
            dVar.G(d9Var);
        }
    }

    public void v(w8 w8Var) {
        this.f83809h = w8Var;
    }

    public void w(Map map) {
        this.f83813l = map;
    }

    public p8(io.sentry.protocol.x xVar, u8 u8Var, String str, u8 u8Var2, d9 d9Var) {
        this(xVar, u8Var, u8Var2, str, null, d9Var, null, "manual");
    }

    public p8(io.sentry.protocol.x xVar, u8 u8Var, u8 u8Var2, String str, String str2, d9 d9Var, w8 w8Var, String str3) {
        this.f83810i = new ConcurrentHashMap();
        this.f83811j = "manual";
        this.f83812k = new ConcurrentHashMap();
        this.f83814m = q1.SENTRY;
        this.f83816o = io.sentry.featureflags.d.a();
        this.f83817p = io.sentry.protocol.x.f84062c;
        this.f83803b = (io.sentry.protocol.x) io.sentry.util.w.c(xVar, "traceId is required");
        this.f83804c = (u8) io.sentry.util.w.c(u8Var, "spanId is required");
        this.f83807f = (String) io.sentry.util.w.c(str, "operation is required");
        this.f83805d = u8Var2;
        this.f83808g = str2;
        this.f83809h = w8Var;
        this.f83811j = str3;
        u(d9Var);
        io.sentry.util.thread.a threadChecker = t4.g().getOptions().getThreadChecker();
        this.f83812k.put("thread.id", String.valueOf(threadChecker.c()));
        this.f83812k.put("thread.name", threadChecker.b());
    }

    public p8(p8 p8Var) {
        this.f83810i = new ConcurrentHashMap();
        this.f83811j = "manual";
        this.f83812k = new ConcurrentHashMap();
        this.f83814m = q1.SENTRY;
        this.f83816o = io.sentry.featureflags.d.a();
        this.f83817p = io.sentry.protocol.x.f84062c;
        this.f83803b = p8Var.f83803b;
        this.f83804c = p8Var.f83804c;
        this.f83805d = p8Var.f83805d;
        u(p8Var.f83806e);
        this.f83807f = p8Var.f83807f;
        this.f83808g = p8Var.f83808g;
        this.f83809h = p8Var.f83809h;
        Map mapB = io.sentry.util.c.b(p8Var.f83810i);
        if (mapB != null) {
            this.f83810i = mapB;
        }
        Map mapB2 = io.sentry.util.c.b(p8Var.f83813l);
        if (mapB2 != null) {
            this.f83813l = mapB2;
        }
        this.f83815n = p8Var.f83815n;
        Map mapB3 = io.sentry.util.c.b(p8Var.f83812k);
        if (mapB3 != null) {
            this.f83812k = mapB3;
        }
    }
}

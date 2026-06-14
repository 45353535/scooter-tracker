package io.sentry;

import io.sentry.j7;
import io.sentry.l7;
import io.sentry.protocol.x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i7 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.protocol.x f83606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Double f83607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l7 f83609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f83610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f83611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f83612h;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i7 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            io.sentry.protocol.x xVar = null;
            Double dX = null;
            String strG = null;
            HashMap map = null;
            l7 l7Var = null;
            Map mapK0 = null;
            Integer numD0 = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "severity_number":
                        numD0 = m3Var.d0();
                        break;
                    case "body":
                        strG = m3Var.G();
                        break;
                    case "timestamp":
                        dX = m3Var.X();
                        break;
                    case "level":
                        l7Var = (l7) m3Var.B(iLogger, new l7.a());
                        break;
                    case "attributes":
                        mapK0 = m3Var.k0(iLogger, new j7.a());
                        break;
                    case "trace_id":
                        xVar = (io.sentry.protocol.x) m3Var.B(iLogger, new x.a());
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        m3Var.l0(iLogger, map, strNextName);
                        break;
                }
            }
            m3Var.endObject();
            if (xVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.a(g7.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (dX == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                iLogger.a(g7.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strG == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                iLogger.a(g7.ERROR, "Missing required field \"body\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (l7Var == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                iLogger.a(g7.ERROR, "Missing required field \"level\"", illegalStateException4);
                throw illegalStateException4;
            }
            i7 i7Var = new i7(xVar, dX, strG, l7Var);
            i7Var.a(mapK0);
            i7Var.b(numD0);
            i7Var.c(map);
            return i7Var;
        }
    }

    public i7(io.sentry.protocol.x xVar, Double d10, String str, l7 l7Var) {
        this.f83606b = xVar;
        this.f83607c = d10;
        this.f83608d = str;
        this.f83609e = l7Var;
    }

    public void a(Map map) {
        this.f83611g = map;
    }

    public void b(Integer num) {
        this.f83610f = num;
    }

    public void c(Map map) {
        this.f83612h = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("timestamp").j(iLogger, l.c(this.f83607c));
        n3Var.e("trace_id").j(iLogger, this.f83606b);
        n3Var.e("body").a(this.f83608d);
        n3Var.e("level").j(iLogger, this.f83609e);
        if (this.f83610f != null) {
            n3Var.e("severity_number").j(iLogger, this.f83610f);
        }
        if (this.f83611g != null) {
            n3Var.e("attributes").j(iLogger, this.f83611g);
        }
        Map map = this.f83612h;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83612h.get(str));
            }
        }
        n3Var.endObject();
    }
}

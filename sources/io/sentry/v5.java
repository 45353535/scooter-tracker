package io.sentry;

import io.sentry.b9;
import io.sentry.protocol.r;
import io.sentry.protocol.x;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class v5 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.x f84335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.protocol.r f84336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b9 f84337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Date f84338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f84339f;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v5 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            io.sentry.protocol.x xVar = null;
            io.sentry.protocol.r rVar = null;
            b9 b9Var = null;
            Date dateL = null;
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "sdk":
                        rVar = (io.sentry.protocol.r) m3Var.B(iLogger, new r.a());
                        break;
                    case "trace":
                        b9Var = (b9) m3Var.B(iLogger, new b9.a());
                        break;
                    case "event_id":
                        xVar = (io.sentry.protocol.x) m3Var.B(iLogger, new x.a());
                        break;
                    case "sent_at":
                        dateL = m3Var.l(iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        m3Var.l0(iLogger, map, strNextName);
                        break;
                }
            }
            v5 v5Var = new v5(xVar, rVar, b9Var);
            v5Var.d(dateL);
            v5Var.e(map);
            m3Var.endObject();
            return v5Var;
        }
    }

    public v5(io.sentry.protocol.x xVar, io.sentry.protocol.r rVar) {
        this(xVar, rVar, null);
    }

    public io.sentry.protocol.x a() {
        return this.f84335b;
    }

    public io.sentry.protocol.r b() {
        return this.f84336c;
    }

    public b9 c() {
        return this.f84337d;
    }

    public void d(Date date) {
        this.f84338e = date;
    }

    public void e(Map map) {
        this.f84339f = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84335b != null) {
            n3Var.e("event_id").j(iLogger, this.f84335b);
        }
        if (this.f84336c != null) {
            n3Var.e("sdk").j(iLogger, this.f84336c);
        }
        if (this.f84337d != null) {
            n3Var.e("trace").j(iLogger, this.f84337d);
        }
        if (this.f84338e != null) {
            n3Var.e("sent_at").j(iLogger, l.h(this.f84338e));
        }
        Map map = this.f84339f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84339f.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public v5(io.sentry.protocol.x xVar, io.sentry.protocol.r rVar, b9 b9Var) {
        this.f84335b = xVar;
        this.f84336c = rVar;
        this.f84337d = b9Var;
    }
}

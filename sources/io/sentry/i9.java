package io.sentry;

import io.sentry.protocol.x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i9 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.x f83613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f83614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f83617f;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i9 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            io.sentry.protocol.x xVarA = null;
            String strG = null;
            String strG2 = null;
            String strG3 = null;
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "comments":
                        strG3 = m3Var.G();
                        break;
                    case "name":
                        strG = m3Var.G();
                        break;
                    case "email":
                        strG2 = m3Var.G();
                        break;
                    case "event_id":
                        xVarA = new x.a().a(m3Var, iLogger);
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
            if (xVarA != null) {
                i9 i9Var = new i9(xVarA, strG, strG2, strG3);
                i9Var.a(map);
                return i9Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.a(g7.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public i9(io.sentry.protocol.x xVar, String str, String str2, String str3) {
        this.f83613b = xVar;
        this.f83614c = str;
        this.f83615d = str2;
        this.f83616e = str3;
    }

    public void a(Map map) {
        this.f83617f = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("event_id");
        this.f83613b.serialize(n3Var, iLogger);
        if (this.f83614c != null) {
            n3Var.e("name").a(this.f83614c);
        }
        if (this.f83615d != null) {
            n3Var.e("email").a(this.f83615d);
        }
        if (this.f83616e != null) {
            n3Var.e("comments").a(this.f83616e);
        }
        Map map = this.f83617f;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83617f.get(str));
            }
        }
        n3Var.endObject();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f83613b + ", name='" + this.f83614c + "', email='" + this.f83615d + "', comments='" + this.f83616e + "'}";
    }
}

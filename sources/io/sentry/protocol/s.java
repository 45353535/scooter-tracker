package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.protocol.c0;
import io.sentry.protocol.l;
import io.sentry.t1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f84051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f84053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c0 f84054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l f84055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f84056h;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            s sVar = new s();
            m3Var.beginObject();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "thread_id":
                        sVar.f84053e = m3Var.g0();
                        break;
                    case "module":
                        sVar.f84052d = m3Var.G();
                        break;
                    case "type":
                        sVar.f84050b = m3Var.G();
                        break;
                    case "value":
                        sVar.f84051c = m3Var.G();
                        break;
                    case "mechanism":
                        sVar.f84055g = (l) m3Var.B(iLogger, new l.a());
                        break;
                    case "stacktrace":
                        sVar.f84054f = (c0) m3Var.B(iLogger, new c0.a());
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
            sVar.q(map);
            return sVar;
        }
    }

    public l g() {
        return this.f84055g;
    }

    public String h() {
        return this.f84052d;
    }

    public c0 i() {
        return this.f84054f;
    }

    public Long j() {
        return this.f84053e;
    }

    public String k() {
        return this.f84050b;
    }

    public void l(l lVar) {
        this.f84055g = lVar;
    }

    public void m(String str) {
        this.f84052d = str;
    }

    public void n(c0 c0Var) {
        this.f84054f = c0Var;
    }

    public void o(Long l10) {
        this.f84053e = l10;
    }

    public void p(String str) {
        this.f84050b = str;
    }

    public void q(Map map) {
        this.f84056h = map;
    }

    public void r(String str) {
        this.f84051c = str;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84050b != null) {
            n3Var.e("type").a(this.f84050b);
        }
        if (this.f84051c != null) {
            n3Var.e("value").a(this.f84051c);
        }
        if (this.f84052d != null) {
            n3Var.e("module").a(this.f84052d);
        }
        if (this.f84053e != null) {
            n3Var.e("thread_id").i(this.f84053e);
        }
        if (this.f84054f != null) {
            n3Var.e("stacktrace").j(iLogger, this.f84054f);
        }
        if (this.f84055g != null) {
            n3Var.e("mechanism").j(iLogger, this.f84055g);
        }
        Map map = this.f84056h;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f84056h.get(str));
            }
        }
        n3Var.endObject();
    }
}

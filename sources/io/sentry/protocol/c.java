package io.sentry.protocol;

import com.google.android.gms.common.Scopes;
import com.google.common.base.Ascii;
import com.ironsource.C4240b4;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.g1;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.p8;
import io.sentry.protocol.a;
import io.sentry.protocol.b;
import io.sentry.protocol.e;
import io.sentry.protocol.f0;
import io.sentry.protocol.g;
import io.sentry.protocol.h;
import io.sentry.protocol.j;
import io.sentry.protocol.n;
import io.sentry.protocol.p;
import io.sentry.protocol.z;
import io.sentry.t1;
import io.sentry.v3;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class c implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f83878b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final io.sentry.util.a f83879c = new io.sentry.util.a();

    public static final class a implements t1 {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(m3 m3Var, ILogger iLogger) {
            c cVar = new c();
            m3Var.beginObject();
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                byte b10 = -1;
                switch (strNextName.hashCode()) {
                    case -1335157162:
                        if (strNextName.equals(C4240b4.i.G)) {
                            b10 = 0;
                        }
                        break;
                    case -895679987:
                        if (strNextName.equals("spring")) {
                            b10 = 1;
                        }
                        break;
                    case -340323263:
                        if (strNextName.equals("response")) {
                            b10 = 2;
                        }
                        break;
                    case -309425751:
                        if (strNextName.equals(Scopes.PROFILE)) {
                            b10 = 3;
                        }
                        break;
                    case -191501435:
                        if (strNextName.equals("feedback")) {
                            b10 = 4;
                        }
                        break;
                    case 3556:
                        if (strNextName.equals("os")) {
                            b10 = 5;
                        }
                        break;
                    case 96801:
                        if (strNextName.equals("app")) {
                            b10 = 6;
                        }
                        break;
                    case 102572:
                        if (strNextName.equals("gpu")) {
                            b10 = 7;
                        }
                        break;
                    case 97513095:
                        if (strNextName.equals("flags")) {
                            b10 = 8;
                        }
                        break;
                    case 110620997:
                        if (strNextName.equals("trace")) {
                            b10 = 9;
                        }
                        break;
                    case 150940456:
                        if (strNextName.equals("browser")) {
                            b10 = 10;
                        }
                        break;
                    case 1550962648:
                        if (strNextName.equals("runtime")) {
                            b10 = Ascii.VT;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        cVar.q(new e.a().a(m3Var, iLogger));
                        break;
                    case 1:
                        cVar.y(new f0.a().a(m3Var, iLogger));
                        break;
                    case 2:
                        cVar.w(new p.a().a(m3Var, iLogger));
                        break;
                    case 3:
                        cVar.v(new v3.a().a(m3Var, iLogger));
                        break;
                    case 4:
                        cVar.s(new h.a().a(m3Var, iLogger));
                        break;
                    case 5:
                        cVar.u(new n.a().a(m3Var, iLogger));
                        break;
                    case 6:
                        cVar.o(new a.C1011a().a(m3Var, iLogger));
                        break;
                    case 7:
                        cVar.t(new j.a().a(m3Var, iLogger));
                        break;
                    case 8:
                        cVar.r(new g.a().a(m3Var, iLogger));
                        break;
                    case 9:
                        cVar.z(new p8.a().a(m3Var, iLogger));
                        break;
                    case 10:
                        cVar.p(new b.a().a(m3Var, iLogger));
                        break;
                    case 11:
                        cVar.x(new z.a().a(m3Var, iLogger));
                        break;
                    default:
                        Object objP0 = m3Var.p0();
                        if (objP0 != null) {
                            cVar.l(strNextName, objP0);
                        }
                        break;
                }
            }
            m3Var.endObject();
            return cVar;
        }
    }

    public c() {
    }

    private Object A(String str, Class cls) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f83878b.containsKey(obj);
    }

    public Set b() {
        return this.f83878b.entrySet();
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f83878b.get(obj);
    }

    public io.sentry.protocol.a d() {
        return (io.sentry.protocol.a) A("app", io.sentry.protocol.a.class);
    }

    public e e() {
        return (e) A(C4240b4.i.G, e.class);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        return this.f83878b.equals(((c) obj).f83878b);
    }

    public g f() {
        return (g) A("flags", g.class);
    }

    public h g() {
        return (h) A("feedback", h.class);
    }

    public n h() {
        return (n) A("os", n.class);
    }

    public int hashCode() {
        return this.f83878b.hashCode();
    }

    public z i() {
        return (z) A("runtime", z.class);
    }

    public p8 j() {
        return (p8) A("trace", p8.class);
    }

    public Enumeration k() {
        return this.f83878b.keys();
    }

    public Object l(String str, Object obj) {
        if (str == null) {
            return null;
        }
        return obj == null ? this.f83878b.remove(str) : this.f83878b.put(str, obj);
    }

    public void m(c cVar) {
        if (cVar == null) {
            return;
        }
        this.f83878b.putAll(cVar.f83878b);
    }

    public Object n(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f83878b.remove(obj);
    }

    public void o(io.sentry.protocol.a aVar) {
        l("app", aVar);
    }

    public void p(b bVar) {
        l("browser", bVar);
    }

    public void q(e eVar) {
        l(C4240b4.i.G, eVar);
    }

    public void r(g gVar) {
        l("flags", gVar);
    }

    public void s(h hVar) {
        l("feedback", hVar);
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        ArrayList<String> list = Collections.list(k());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                n3Var.e(str).j(iLogger, objC);
            }
        }
        n3Var.endObject();
    }

    public void t(j jVar) {
        l("gpu", jVar);
    }

    public void u(n nVar) {
        l("os", nVar);
    }

    public void v(v3 v3Var) {
        io.sentry.util.w.c(v3Var, "profileContext is required");
        l(Scopes.PROFILE, v3Var);
    }

    public void w(p pVar) {
        g1 g1VarD = this.f83879c.d();
        try {
            l("response", pVar);
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void x(z zVar) {
        l("runtime", zVar);
    }

    public void y(f0 f0Var) {
        l("spring", f0Var);
    }

    public void z(p8 p8Var) {
        io.sentry.util.w.c(p8Var, "traceContext is required");
        l("trace", p8Var);
    }

    public c(c cVar) {
        for (Map.Entry entry : cVar.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof io.sentry.protocol.a)) {
                    o(new io.sentry.protocol.a((io.sentry.protocol.a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof b)) {
                    p(new b((b) value));
                } else if (C4240b4.i.G.equals(entry.getKey()) && (value instanceof e)) {
                    q(new e((e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof n)) {
                    u(new n((n) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof z)) {
                    x(new z((z) value));
                } else if ("feedback".equals(entry.getKey()) && (value instanceof h)) {
                    s(new h((h) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof j)) {
                    t(new j((j) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof p8)) {
                    z(new p8((p8) value));
                } else if (Scopes.PROFILE.equals(entry.getKey()) && (value instanceof v3)) {
                    v(new v3((v3) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof p)) {
                    w(new p((p) value));
                } else if ("spring".equals(entry.getKey()) && (value instanceof f0)) {
                    y(new f0((f0) value));
                } else {
                    l((String) entry.getKey(), value);
                }
            }
        }
    }
}

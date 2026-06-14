package io.sentry;

import com.adjust.sdk.purchase.ADJPConstants;
import com.google.common.base.Ascii;
import io.sentry.e;
import io.sentry.protocol.c;
import io.sentry.protocol.d;
import io.sentry.protocol.i0;
import io.sentry.protocol.o;
import io.sentry.protocol.r;
import io.sentry.protocol.x;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.protocol.x f83751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.protocol.c f83752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.r f83753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.sentry.protocol.o f83754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f83755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f83756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f83757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f83758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private io.sentry.protocol.i0 f83759j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected transient Throwable f83760k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f83761l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f83762m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f83763n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private io.sentry.protocol.d f83764o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map f83765p;

    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean a(n5 n5Var, String str, m3 m3Var, ILogger iLogger) {
            str.getClass();
            byte b10 = -1;
            switch (str.hashCode()) {
                case -1840434063:
                    if (str.equals("debug_meta")) {
                        b10 = 0;
                    }
                    break;
                case -758770169:
                    if (str.equals("server_name")) {
                        b10 = 1;
                    }
                    break;
                case -567312220:
                    if (str.equals("contexts")) {
                        b10 = 2;
                    }
                    break;
                case -85904877:
                    if (str.equals(ADJPConstants.KEY_ENVIRONMENT)) {
                        b10 = 3;
                    }
                    break;
                case -51457840:
                    if (str.equals("breadcrumbs")) {
                        b10 = 4;
                    }
                    break;
                case 113722:
                    if (str.equals("sdk")) {
                        b10 = 5;
                    }
                    break;
                case 3083686:
                    if (str.equals("dist")) {
                        b10 = 6;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b10 = 7;
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        b10 = 8;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b10 = 9;
                    }
                    break;
                case 278118624:
                    if (str.equals("event_id")) {
                        b10 = 10;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        b10 = Ascii.VT;
                    }
                    break;
                case 1095692943:
                    if (str.equals("request")) {
                        b10 = Ascii.FF;
                    }
                    break;
                case 1874684019:
                    if (str.equals("platform")) {
                        b10 = 13;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    n5Var.f83764o = (io.sentry.protocol.d) m3Var.B(iLogger, new d.a());
                    return true;
                case 1:
                    n5Var.f83761l = m3Var.G();
                    return true;
                case 2:
                    n5Var.f83752c.m(new c.a().a(m3Var, iLogger));
                    return true;
                case 3:
                    n5Var.f83757h = m3Var.G();
                    return true;
                case 4:
                    n5Var.f83763n = m3Var.P(iLogger, new e.a());
                    return true;
                case 5:
                    n5Var.f83753d = (io.sentry.protocol.r) m3Var.B(iLogger, new r.a());
                    return true;
                case 6:
                    n5Var.f83762m = m3Var.G();
                    return true;
                case 7:
                    n5Var.f83755f = io.sentry.util.c.b((Map) m3Var.p0());
                    return true;
                case 8:
                    n5Var.f83759j = (io.sentry.protocol.i0) m3Var.B(iLogger, new i0.a());
                    return true;
                case 9:
                    n5Var.f83765p = io.sentry.util.c.b((Map) m3Var.p0());
                    return true;
                case 10:
                    n5Var.f83751b = (io.sentry.protocol.x) m3Var.B(iLogger, new x.a());
                    return true;
                case 11:
                    n5Var.f83756g = m3Var.G();
                    return true;
                case 12:
                    n5Var.f83754e = (io.sentry.protocol.o) m3Var.B(iLogger, new o.a());
                    return true;
                case 13:
                    n5Var.f83758i = m3Var.G();
                    return true;
                default:
                    return false;
            }
        }
    }

    public static final class b {
        public void a(n5 n5Var, n3 n3Var, ILogger iLogger) {
            if (n5Var.f83751b != null) {
                n3Var.e("event_id").j(iLogger, n5Var.f83751b);
            }
            n3Var.e("contexts").j(iLogger, n5Var.f83752c);
            if (n5Var.f83753d != null) {
                n3Var.e("sdk").j(iLogger, n5Var.f83753d);
            }
            if (n5Var.f83754e != null) {
                n3Var.e("request").j(iLogger, n5Var.f83754e);
            }
            if (n5Var.f83755f != null && !n5Var.f83755f.isEmpty()) {
                n3Var.e("tags").j(iLogger, n5Var.f83755f);
            }
            if (n5Var.f83756g != null) {
                n3Var.e("release").a(n5Var.f83756g);
            }
            if (n5Var.f83757h != null) {
                n3Var.e(ADJPConstants.KEY_ENVIRONMENT).a(n5Var.f83757h);
            }
            if (n5Var.f83758i != null) {
                n3Var.e("platform").a(n5Var.f83758i);
            }
            if (n5Var.f83759j != null) {
                n3Var.e("user").j(iLogger, n5Var.f83759j);
            }
            if (n5Var.f83761l != null) {
                n3Var.e("server_name").a(n5Var.f83761l);
            }
            if (n5Var.f83762m != null) {
                n3Var.e("dist").a(n5Var.f83762m);
            }
            if (n5Var.f83763n != null && !n5Var.f83763n.isEmpty()) {
                n3Var.e("breadcrumbs").j(iLogger, n5Var.f83763n);
            }
            if (n5Var.f83764o != null) {
                n3Var.e("debug_meta").j(iLogger, n5Var.f83764o);
            }
            if (n5Var.f83765p == null || n5Var.f83765p.isEmpty()) {
                return;
            }
            n3Var.e("extra").j(iLogger, n5Var.f83765p);
        }
    }

    protected n5(io.sentry.protocol.x xVar) {
        this.f83752c = new io.sentry.protocol.c();
        this.f83751b = xVar;
    }

    public List B() {
        return this.f83763n;
    }

    public io.sentry.protocol.c C() {
        return this.f83752c;
    }

    public io.sentry.protocol.d D() {
        return this.f83764o;
    }

    public String E() {
        return this.f83762m;
    }

    public String F() {
        return this.f83757h;
    }

    public io.sentry.protocol.x G() {
        return this.f83751b;
    }

    public Map H() {
        return this.f83765p;
    }

    public String I() {
        return this.f83758i;
    }

    public String J() {
        return this.f83756g;
    }

    public io.sentry.protocol.o K() {
        return this.f83754e;
    }

    public io.sentry.protocol.r L() {
        return this.f83753d;
    }

    public String M() {
        return this.f83761l;
    }

    public Map N() {
        return this.f83755f;
    }

    public Throwable O() {
        Throwable th2 = this.f83760k;
        return th2 instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th2).h() : th2;
    }

    public Throwable P() {
        return this.f83760k;
    }

    public io.sentry.protocol.i0 Q() {
        return this.f83759j;
    }

    public void R(String str) {
        Map map = this.f83765p;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void S(String str) {
        Map map = this.f83755f;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void T(List list) {
        this.f83763n = io.sentry.util.c.a(list);
    }

    public void U(io.sentry.protocol.d dVar) {
        this.f83764o = dVar;
    }

    public void V(String str) {
        this.f83762m = str;
    }

    public void W(String str) {
        this.f83757h = str;
    }

    public void X(io.sentry.protocol.x xVar) {
        this.f83751b = xVar;
    }

    public void Y(String str, Object obj) {
        if (this.f83765p == null) {
            this.f83765p = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (obj == null) {
            R(str);
        } else {
            this.f83765p.put(str, obj);
        }
    }

    public void Z(Map map) {
        this.f83765p = io.sentry.util.c.c(map);
    }

    public void a0(String str) {
        this.f83758i = str;
    }

    public void b0(String str) {
        this.f83756g = str;
    }

    public void c0(io.sentry.protocol.o oVar) {
        this.f83754e = oVar;
    }

    public void d0(io.sentry.protocol.r rVar) {
        this.f83753d = rVar;
    }

    public void e0(String str) {
        this.f83761l = str;
    }

    public void f0(String str, String str2) {
        if (this.f83755f == null) {
            this.f83755f = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            S(str);
        } else {
            this.f83755f.put(str, str2);
        }
    }

    public void g0(Map map) {
        this.f83755f = io.sentry.util.c.c(map);
    }

    public void h0(io.sentry.protocol.i0 i0Var) {
        this.f83759j = i0Var;
    }

    protected n5() {
        this(new io.sentry.protocol.x());
    }
}

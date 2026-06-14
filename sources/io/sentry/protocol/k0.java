package io.sentry.protocol;

import com.taurusx.tax.y.z.w.s;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f83976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Double f83979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Double f83980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Double f83981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Double f83982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f83983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Double f83984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f83985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map f83986m;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k0 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            k0 k0Var = new k0();
            m3Var.beginObject();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "rendering_system":
                        k0Var.f83975b = m3Var.G();
                        break;
                    case "identifier":
                        k0Var.f83977d = m3Var.G();
                        break;
                    case "height":
                        k0Var.f83980g = m3Var.X();
                        break;
                    case "x":
                        k0Var.f83981h = m3Var.X();
                        break;
                    case "y":
                        k0Var.f83982i = m3Var.X();
                        break;
                    case "tag":
                        k0Var.f83978e = m3Var.G();
                        break;
                    case "type":
                        k0Var.f83976c = m3Var.G();
                        break;
                    case "alpha":
                        k0Var.f83984k = m3Var.X();
                        break;
                    case "width":
                        k0Var.f83979f = m3Var.X();
                        break;
                    case "children":
                        k0Var.f83985l = m3Var.P(iLogger, this);
                        break;
                    case "visibility":
                        k0Var.f83983j = m3Var.G();
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
            k0Var.t(map);
            return k0Var;
        }
    }

    public List l() {
        return this.f83985l;
    }

    public String m() {
        return this.f83976c;
    }

    public String n() {
        return this.f83983j;
    }

    public void o(Double d10) {
        this.f83984k = d10;
    }

    public void p(List list) {
        this.f83985l = list;
    }

    public void q(Double d10) {
        this.f83980g = d10;
    }

    public void r(String str) {
        this.f83977d = str;
    }

    public void s(String str) {
        this.f83976c = str;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83975b != null) {
            n3Var.e("rendering_system").a(this.f83975b);
        }
        if (this.f83976c != null) {
            n3Var.e("type").a(this.f83976c);
        }
        if (this.f83977d != null) {
            n3Var.e("identifier").a(this.f83977d);
        }
        if (this.f83978e != null) {
            n3Var.e(s.z.f67720z).a(this.f83978e);
        }
        if (this.f83979f != null) {
            n3Var.e("width").i(this.f83979f);
        }
        if (this.f83980g != null) {
            n3Var.e("height").i(this.f83980g);
        }
        if (this.f83981h != null) {
            n3Var.e("x").i(this.f83981h);
        }
        if (this.f83982i != null) {
            n3Var.e("y").i(this.f83982i);
        }
        if (this.f83983j != null) {
            n3Var.e("visibility").a(this.f83983j);
        }
        if (this.f83984k != null) {
            n3Var.e("alpha").i(this.f83984k);
        }
        List list = this.f83985l;
        if (list != null && !list.isEmpty()) {
            n3Var.e("children").j(iLogger, this.f83985l);
        }
        Map map = this.f83986m;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83986m.get(str));
            }
        }
        n3Var.endObject();
    }

    public void t(Map map) {
        this.f83986m = map;
    }

    public void u(String str) {
        this.f83983j = str;
    }

    public void v(Double d10) {
        this.f83979f = d10;
    }

    public void w(Double d10) {
        this.f83981h = d10;
    }

    public void x(Double d10) {
        this.f83982i = d10;
    }
}

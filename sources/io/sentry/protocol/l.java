package io.sentry.protocol;

import com.adjust.sdk.Constants;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient Thread f83987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f83988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f83991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f83992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f83993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f83994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f83995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f83996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f83997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map f83998m;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            l lVar = new l();
            m3Var.beginObject();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "description":
                        lVar.f83989d = m3Var.G();
                        break;
                    case "exception_id":
                        lVar.f83995j = m3Var.d0();
                        break;
                    case "data":
                        lVar.f83993h = io.sentry.util.c.b((Map) m3Var.p0());
                        break;
                    case "meta":
                        lVar.f83992g = io.sentry.util.c.b((Map) m3Var.p0());
                        break;
                    case "type":
                        lVar.f83988c = m3Var.G();
                        break;
                    case "handled":
                        lVar.f83991f = m3Var.x();
                        break;
                    case "synthetic":
                        lVar.f83994i = m3Var.x();
                        break;
                    case "is_exception_group":
                        lVar.f83997l = m3Var.x();
                        break;
                    case "help_link":
                        lVar.f83990e = m3Var.G();
                        break;
                    case "parent_id":
                        lVar.f83996k = m3Var.d0();
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
            lVar.r(map);
            return lVar;
        }
    }

    public l() {
        this(null);
    }

    public String k() {
        return this.f83988c;
    }

    public Boolean l() {
        return this.f83991f;
    }

    public void m(String str) {
        this.f83989d = str;
    }

    public void n(Integer num) {
        this.f83995j = num;
    }

    public void o(Boolean bool) {
        this.f83991f = bool;
    }

    public void p(Integer num) {
        this.f83996k = num;
    }

    public void q(String str) {
        this.f83988c = str;
    }

    public void r(Map map) {
        this.f83998m = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83988c != null) {
            n3Var.e("type").a(this.f83988c);
        }
        if (this.f83989d != null) {
            n3Var.e("description").a(this.f83989d);
        }
        if (this.f83990e != null) {
            n3Var.e("help_link").a(this.f83990e);
        }
        if (this.f83991f != null) {
            n3Var.e("handled").k(this.f83991f);
        }
        if (this.f83992g != null) {
            n3Var.e(Constants.REFERRER_API_META).j(iLogger, this.f83992g);
        }
        if (this.f83993h != null) {
            n3Var.e("data").j(iLogger, this.f83993h);
        }
        if (this.f83994i != null) {
            n3Var.e("synthetic").k(this.f83994i);
        }
        if (this.f83995j != null) {
            n3Var.e("exception_id").j(iLogger, this.f83995j);
        }
        if (this.f83996k != null) {
            n3Var.e("parent_id").j(iLogger, this.f83996k);
        }
        if (this.f83997l != null) {
            n3Var.e("is_exception_group").k(this.f83997l);
        }
        Map map = this.f83998m;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83998m.get(str));
            }
        }
        n3Var.endObject();
    }

    public l(Thread thread) {
        this.f83987b = thread;
    }
}

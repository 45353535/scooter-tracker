package io.sentry.protocol;

import com.ironsource.C4240b4;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.h7;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.protocol.c0;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f83887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f83888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f83891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f83892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f83893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f83894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c0 f83895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f83896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f83897l;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d0 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            d0 d0Var = new d0();
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "daemon":
                        d0Var.f83893h = m3Var.x();
                        break;
                    case "priority":
                        d0Var.f83888c = m3Var.d0();
                        break;
                    case "held_locks":
                        Map mapK0 = m3Var.k0(iLogger, new h7.a());
                        if (mapK0 == null) {
                            break;
                        } else {
                            d0Var.f83896k = new HashMap(mapK0);
                            break;
                        }
                        break;
                    case "id":
                        d0Var.f83887b = m3Var.g0();
                        break;
                    case "main":
                        d0Var.f83894i = m3Var.x();
                        break;
                    case "name":
                        d0Var.f83889d = m3Var.G();
                        break;
                    case "state":
                        d0Var.f83890e = m3Var.G();
                        break;
                    case "crashed":
                        d0Var.f83891f = m3Var.x();
                        break;
                    case "current":
                        d0Var.f83892g = m3Var.x();
                        break;
                    case "stacktrace":
                        d0Var.f83895j = (c0) m3Var.B(iLogger, new c0.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            d0Var.A(concurrentHashMap);
            m3Var.endObject();
            return d0Var;
        }
    }

    public void A(Map map) {
        this.f83897l = map;
    }

    public Map k() {
        return this.f83896k;
    }

    public Long l() {
        return this.f83887b;
    }

    public String m() {
        return this.f83889d;
    }

    public c0 n() {
        return this.f83895j;
    }

    public Boolean o() {
        return this.f83892g;
    }

    public Boolean p() {
        return this.f83894i;
    }

    public void q(Boolean bool) {
        this.f83891f = bool;
    }

    public void r(Boolean bool) {
        this.f83892g = bool;
    }

    public void s(Boolean bool) {
        this.f83893h = bool;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83887b != null) {
            n3Var.e("id").i(this.f83887b);
        }
        if (this.f83888c != null) {
            n3Var.e(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).i(this.f83888c);
        }
        if (this.f83889d != null) {
            n3Var.e("name").a(this.f83889d);
        }
        if (this.f83890e != null) {
            n3Var.e("state").a(this.f83890e);
        }
        if (this.f83891f != null) {
            n3Var.e("crashed").k(this.f83891f);
        }
        if (this.f83892g != null) {
            n3Var.e("current").k(this.f83892g);
        }
        if (this.f83893h != null) {
            n3Var.e("daemon").k(this.f83893h);
        }
        if (this.f83894i != null) {
            n3Var.e(C4240b4.i.Z).k(this.f83894i);
        }
        if (this.f83895j != null) {
            n3Var.e("stacktrace").j(iLogger, this.f83895j);
        }
        if (this.f83896k != null) {
            n3Var.e("held_locks").j(iLogger, this.f83896k);
        }
        Map map = this.f83897l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83897l.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public void t(Map map) {
        this.f83896k = map;
    }

    public void u(Long l10) {
        this.f83887b = l10;
    }

    public void v(Boolean bool) {
        this.f83894i = bool;
    }

    public void w(String str) {
        this.f83889d = str;
    }

    public void x(Integer num) {
        this.f83888c = num;
    }

    public void y(c0 c0Var) {
        this.f83895j = c0Var;
    }

    public void z(String str) {
        this.f83890e = str;
    }
}

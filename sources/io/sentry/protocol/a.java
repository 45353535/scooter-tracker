package io.sentry.protocol;

import com.google.common.base.Ascii;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f83826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f83829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f83830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f83831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f83832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f83833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f83834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f83835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f83836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f83837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map f83838o;

    /* JADX INFO: renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    public static final class C1011a implements t1 {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                byte b10 = -1;
                switch (strNextName.hashCode()) {
                    case -1950148125:
                        if (strNextName.equals("split_names")) {
                            b10 = 0;
                        }
                        break;
                    case -1898053579:
                        if (strNextName.equals("device_app_hash")) {
                            b10 = 1;
                        }
                        break;
                    case -1573129993:
                        if (strNextName.equals("start_type")) {
                            b10 = 2;
                        }
                        break;
                    case -1524619986:
                        if (strNextName.equals("view_names")) {
                            b10 = 3;
                        }
                        break;
                    case -901870406:
                        if (strNextName.equals("app_version")) {
                            b10 = 4;
                        }
                        break;
                    case -650544995:
                        if (strNextName.equals("in_foreground")) {
                            b10 = 5;
                        }
                        break;
                    case -470395285:
                        if (strNextName.equals("build_type")) {
                            b10 = 6;
                        }
                        break;
                    case 746297735:
                        if (strNextName.equals("app_identifier")) {
                            b10 = 7;
                        }
                        break;
                    case 791585128:
                        if (strNextName.equals("app_start_time")) {
                            b10 = 8;
                        }
                        break;
                    case 1133704324:
                        if (strNextName.equals("permissions")) {
                            b10 = 9;
                        }
                        break;
                    case 1167648233:
                        if (strNextName.equals("app_name")) {
                            b10 = 10;
                        }
                        break;
                    case 1826866896:
                        if (strNextName.equals("app_build")) {
                            b10 = Ascii.VT;
                        }
                        break;
                    case 1965003281:
                        if (strNextName.equals("is_split_apks")) {
                            b10 = Ascii.FF;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        List list = (List) m3Var.p0();
                        if (list != null) {
                            aVar.u(list);
                        }
                        break;
                    case 1:
                        aVar.f83827d = m3Var.G();
                        break;
                    case 2:
                        aVar.f83834k = m3Var.G();
                        break;
                    case 3:
                        List list2 = (List) m3Var.p0();
                        if (list2 != null) {
                            aVar.x(list2);
                        }
                        break;
                    case 4:
                        aVar.f83830g = m3Var.G();
                        break;
                    case 5:
                        aVar.f83835l = m3Var.x();
                        break;
                    case 6:
                        aVar.f83828e = m3Var.G();
                        break;
                    case 7:
                        aVar.f83825b = m3Var.G();
                        break;
                    case 8:
                        aVar.f83826c = m3Var.l(iLogger);
                        break;
                    case 9:
                        aVar.f83832i = io.sentry.util.c.b((Map) m3Var.p0());
                        break;
                    case 10:
                        aVar.f83829f = m3Var.G();
                        break;
                    case 11:
                        aVar.f83831h = m3Var.G();
                        break;
                    case 12:
                        aVar.f83836m = m3Var.x();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            aVar.w(concurrentHashMap);
            m3Var.endObject();
            return aVar;
        }
    }

    public a() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (io.sentry.util.w.a(this.f83825b, aVar.f83825b) && io.sentry.util.w.a(this.f83826c, aVar.f83826c) && io.sentry.util.w.a(this.f83827d, aVar.f83827d) && io.sentry.util.w.a(this.f83828e, aVar.f83828e) && io.sentry.util.w.a(this.f83829f, aVar.f83829f) && io.sentry.util.w.a(this.f83830g, aVar.f83830g) && io.sentry.util.w.a(this.f83831h, aVar.f83831h) && io.sentry.util.w.a(this.f83832i, aVar.f83832i) && io.sentry.util.w.a(this.f83835l, aVar.f83835l) && io.sentry.util.w.a(this.f83833j, aVar.f83833j) && io.sentry.util.w.a(this.f83834k, aVar.f83834k) && io.sentry.util.w.a(this.f83836m, aVar.f83836m) && io.sentry.util.w.a(this.f83837n, aVar.f83837n)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f83825b, this.f83826c, this.f83827d, this.f83828e, this.f83829f, this.f83830g, this.f83831h, this.f83832i, this.f83835l, this.f83833j, this.f83834k, this.f83836m, this.f83837n);
    }

    public Boolean l() {
        return this.f83835l;
    }

    public void m(String str) {
        this.f83831h = str;
    }

    public void n(String str) {
        this.f83825b = str;
    }

    public void o(String str) {
        this.f83829f = str;
    }

    public void p(Date date) {
        this.f83826c = date;
    }

    public void q(String str) {
        this.f83830g = str;
    }

    public void r(Boolean bool) {
        this.f83835l = bool;
    }

    public void s(Map map) {
        this.f83832i = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83825b != null) {
            n3Var.e("app_identifier").a(this.f83825b);
        }
        if (this.f83826c != null) {
            n3Var.e("app_start_time").j(iLogger, this.f83826c);
        }
        if (this.f83827d != null) {
            n3Var.e("device_app_hash").a(this.f83827d);
        }
        if (this.f83828e != null) {
            n3Var.e("build_type").a(this.f83828e);
        }
        if (this.f83829f != null) {
            n3Var.e("app_name").a(this.f83829f);
        }
        if (this.f83830g != null) {
            n3Var.e("app_version").a(this.f83830g);
        }
        if (this.f83831h != null) {
            n3Var.e("app_build").a(this.f83831h);
        }
        Map map = this.f83832i;
        if (map != null && !map.isEmpty()) {
            n3Var.e("permissions").j(iLogger, this.f83832i);
        }
        if (this.f83835l != null) {
            n3Var.e("in_foreground").k(this.f83835l);
        }
        if (this.f83833j != null) {
            n3Var.e("view_names").j(iLogger, this.f83833j);
        }
        if (this.f83834k != null) {
            n3Var.e("start_type").a(this.f83834k);
        }
        if (this.f83836m != null) {
            n3Var.e("is_split_apks").k(this.f83836m);
        }
        List list = this.f83837n;
        if (list != null && !list.isEmpty()) {
            n3Var.e("split_names").j(iLogger, this.f83837n);
        }
        Map map2 = this.f83838o;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                n3Var.e(str).j(iLogger, this.f83838o.get(str));
            }
        }
        n3Var.endObject();
    }

    public void t(Boolean bool) {
        this.f83836m = bool;
    }

    public void u(List list) {
        this.f83837n = list;
    }

    public void v(String str) {
        this.f83834k = str;
    }

    public void w(Map map) {
        this.f83838o = map;
    }

    public void x(List list) {
        this.f83833j = list;
    }

    a(a aVar) {
        this.f83831h = aVar.f83831h;
        this.f83825b = aVar.f83825b;
        this.f83829f = aVar.f83829f;
        this.f83826c = aVar.f83826c;
        this.f83830g = aVar.f83830g;
        this.f83828e = aVar.f83828e;
        this.f83827d = aVar.f83827d;
        this.f83832i = io.sentry.util.c.b(aVar.f83832i);
        this.f83835l = aVar.f83835l;
        this.f83833j = io.sentry.util.c.a(aVar.f83833j);
        this.f83834k = aVar.f83834k;
        this.f83836m = aVar.f83836m;
        this.f83837n = aVar.f83837n;
        this.f83838o = io.sentry.util.c.b(aVar.f83838o);
    }
}

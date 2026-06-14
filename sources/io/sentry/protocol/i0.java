package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.protocol.i;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f83952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f83955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f83956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f83957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f83958i;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            i0 i0Var = new i0();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "username":
                        i0Var.f83953d = m3Var.G();
                        break;
                    case "id":
                        i0Var.f83952c = m3Var.G();
                        break;
                    case "geo":
                        i0Var.f83956g = new i.a().a(m3Var, iLogger);
                        break;
                    case "data":
                        i0Var.f83957h = io.sentry.util.c.b((Map) m3Var.p0());
                        break;
                    case "name":
                        i0Var.f83955f = m3Var.G();
                        break;
                    case "email":
                        i0Var.f83951b = m3Var.G();
                        break;
                    case "ip_address":
                        i0Var.f83954e = m3Var.G();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            i0Var.l(concurrentHashMap);
            m3Var.endObject();
            return i0Var;
        }
    }

    public i0() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (io.sentry.util.w.a(this.f83951b, i0Var.f83951b) && io.sentry.util.w.a(this.f83952c, i0Var.f83952c) && io.sentry.util.w.a(this.f83953d, i0Var.f83953d) && io.sentry.util.w.a(this.f83954e, i0Var.f83954e)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f83952c;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f83951b, this.f83952c, this.f83953d, this.f83954e);
    }

    public String i() {
        return this.f83954e;
    }

    public void j(String str) {
        this.f83952c = str;
    }

    public void k(String str) {
        this.f83954e = str;
    }

    public void l(Map map) {
        this.f83958i = map;
    }

    public void m(String str) {
        this.f83953d = str;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83951b != null) {
            n3Var.e("email").a(this.f83951b);
        }
        if (this.f83952c != null) {
            n3Var.e("id").a(this.f83952c);
        }
        if (this.f83953d != null) {
            n3Var.e("username").a(this.f83953d);
        }
        if (this.f83954e != null) {
            n3Var.e("ip_address").a(this.f83954e);
        }
        if (this.f83955f != null) {
            n3Var.e("name").a(this.f83955f);
        }
        if (this.f83956g != null) {
            n3Var.e("geo");
            this.f83956g.serialize(n3Var, iLogger);
        }
        if (this.f83957h != null) {
            n3Var.e("data").j(iLogger, this.f83957h);
        }
        Map map = this.f83958i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83958i.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public i0(i0 i0Var) {
        this.f83951b = i0Var.f83951b;
        this.f83953d = i0Var.f83953d;
        this.f83952c = i0Var.f83952c;
        this.f83954e = i0Var.f83954e;
        this.f83955f = i0Var.f83955f;
        this.f83956g = i0Var.f83956g;
        this.f83957h = io.sentry.util.c.b(i0Var.f83957h);
        this.f83958i = io.sentry.util.c.b(i0Var.f83958i);
    }
}

package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h7 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f83561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f83562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f83565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f83566g;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h7 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            h7 h7Var = new h7();
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "package_name":
                        h7Var.f83563d = m3Var.G();
                        break;
                    case "thread_id":
                        h7Var.f83565f = m3Var.g0();
                        break;
                    case "address":
                        h7Var.f83562c = m3Var.G();
                        break;
                    case "class_name":
                        h7Var.f83564e = m3Var.G();
                        break;
                    case "type":
                        h7Var.f83561b = m3Var.nextInt();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            h7Var.m(concurrentHashMap);
            m3Var.endObject();
            return h7Var;
        }
    }

    public h7() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h7.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.w.a(this.f83562c, ((h7) obj).f83562c);
    }

    public String f() {
        return this.f83562c;
    }

    public int g() {
        return this.f83561b;
    }

    public void h(String str) {
        this.f83562c = str;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f83562c);
    }

    public void i(String str) {
        this.f83564e = str;
    }

    public void j(String str) {
        this.f83563d = str;
    }

    public void k(Long l10) {
        this.f83565f = l10;
    }

    public void l(int i10) {
        this.f83561b = i10;
    }

    public void m(Map map) {
        this.f83566g = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("type").b(this.f83561b);
        if (this.f83562c != null) {
            n3Var.e("address").a(this.f83562c);
        }
        if (this.f83563d != null) {
            n3Var.e("package_name").a(this.f83563d);
        }
        if (this.f83564e != null) {
            n3Var.e("class_name").a(this.f83564e);
        }
        if (this.f83565f != null) {
            n3Var.e("thread_id").i(this.f83565f);
        }
        Map map = this.f83566g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83566g.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public h7(h7 h7Var) {
        this.f83561b = h7Var.f83561b;
        this.f83562c = h7Var.f83562c;
        this.f83563d = h7Var.f83563d;
        this.f83564e = h7Var.f83564e;
        this.f83565f = h7Var.f83565f;
        this.f83566g = io.sentry.util.c.b(h7Var.f83566g);
    }
}

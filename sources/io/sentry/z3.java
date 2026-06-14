package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z3 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f84505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f84507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f84508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f84509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f84510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f84511i;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z3 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            z3 z3Var = new z3();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "relative_start_ns":
                        Long lG0 = m3Var.g0();
                        if (lG0 == null) {
                            break;
                        } else {
                            z3Var.f84507e = lG0;
                            break;
                        }
                        break;
                    case "relative_end_ns":
                        Long lG02 = m3Var.g0();
                        if (lG02 == null) {
                            break;
                        } else {
                            z3Var.f84508f = lG02;
                            break;
                        }
                        break;
                    case "id":
                        String strG = m3Var.G();
                        if (strG == null) {
                            break;
                        } else {
                            z3Var.f84504b = strG;
                            break;
                        }
                        break;
                    case "name":
                        String strG2 = m3Var.G();
                        if (strG2 == null) {
                            break;
                        } else {
                            z3Var.f84506d = strG2;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strG3 = m3Var.G();
                        if (strG3 == null) {
                            break;
                        } else {
                            z3Var.f84505c = strG3;
                            break;
                        }
                        break;
                    case "relative_cpu_end_ms":
                        Long lG03 = m3Var.g0();
                        if (lG03 == null) {
                            break;
                        } else {
                            z3Var.f84510h = lG03;
                            break;
                        }
                        break;
                    case "relative_cpu_start_ms":
                        Long lG04 = m3Var.g0();
                        if (lG04 == null) {
                            break;
                        } else {
                            z3Var.f84509g = lG04;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            z3Var.l(concurrentHashMap);
            m3Var.endObject();
            return z3Var;
        }
    }

    public z3() {
        this(h3.s(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z3.class == obj.getClass()) {
            z3 z3Var = (z3) obj;
            if (this.f84504b.equals(z3Var.f84504b) && this.f84505c.equals(z3Var.f84505c) && this.f84506d.equals(z3Var.f84506d) && this.f84507e.equals(z3Var.f84507e) && this.f84509g.equals(z3Var.f84509g) && io.sentry.util.w.a(this.f84510h, z3Var.f84510h) && io.sentry.util.w.a(this.f84508f, z3Var.f84508f) && io.sentry.util.w.a(this.f84511i, z3Var.f84511i)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f84504b;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f84504b, this.f84505c, this.f84506d, this.f84507e, this.f84508f, this.f84509g, this.f84510h, this.f84511i);
    }

    public String i() {
        return this.f84506d;
    }

    public String j() {
        return this.f84505c;
    }

    public void k(Long l10, Long l11, Long l12, Long l13) {
        if (this.f84508f == null) {
            this.f84508f = Long.valueOf(l10.longValue() - l11.longValue());
            this.f84507e = Long.valueOf(this.f84507e.longValue() - l11.longValue());
            this.f84510h = Long.valueOf(l12.longValue() - l13.longValue());
            this.f84509g = Long.valueOf(this.f84509g.longValue() - l13.longValue());
        }
    }

    public void l(Map map) {
        this.f84511i = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("id").j(iLogger, this.f84504b);
        n3Var.e("trace_id").j(iLogger, this.f84505c);
        n3Var.e("name").j(iLogger, this.f84506d);
        n3Var.e("relative_start_ns").j(iLogger, this.f84507e);
        n3Var.e("relative_end_ns").j(iLogger, this.f84508f);
        n3Var.e("relative_cpu_start_ms").j(iLogger, this.f84509g);
        n3Var.e("relative_cpu_end_ms").j(iLogger, this.f84510h);
        Map map = this.f84511i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84511i.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public z3(l1 l1Var, Long l10, Long l11) {
        this.f84504b = l1Var.getEventId().toString();
        this.f84505c = l1Var.e().p().toString();
        this.f84506d = l1Var.getName().isEmpty() ? "unknown" : l1Var.getName();
        this.f84507e = l10;
        this.f84509g = l11;
    }
}

package io.sentry;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import io.sentry.g7;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements d2, Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f83417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f83418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f83419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f83421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f83422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f83423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f83424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g7 f83425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f83426k;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            Date dateD = l.d();
            Map concurrentHashMap = new ConcurrentHashMap();
            String strG = null;
            String strG2 = null;
            String strG3 = null;
            String strG4 = null;
            g7 g7VarA = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "origin":
                        strG4 = m3Var.G();
                        break;
                    case "data":
                        Map mapB = io.sentry.util.c.b((Map) m3Var.p0());
                        if (mapB == null) {
                            break;
                        } else {
                            concurrentHashMap = mapB;
                            break;
                        }
                        break;
                    case "type":
                        strG2 = m3Var.G();
                        break;
                    case "category":
                        strG3 = m3Var.G();
                        break;
                    case "timestamp":
                        Date dateL = m3Var.l(iLogger);
                        if (dateL == null) {
                            break;
                        } else {
                            dateD = dateL;
                            break;
                        }
                        break;
                    case "level":
                        try {
                            g7VarA = new g7.a().a(m3Var, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.b(g7.ERROR, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        strG = m3Var.G();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap2, strNextName);
                        break;
                }
            }
            e eVar = new e(dateD);
            eVar.f83420e = strG;
            eVar.f83421f = strG2;
            eVar.f83422g = concurrentHashMap;
            eVar.f83423h = strG3;
            eVar.f83424i = strG4;
            eVar.f83425j = g7VarA;
            eVar.z(concurrentHashMap2);
            m3Var.endObject();
            return eVar;
        }
    }

    public e(Date date) {
        this.f83422g = new ConcurrentHashMap();
        this.f83419d = Long.valueOf(System.nanoTime());
        this.f83418c = date;
        this.f83417b = null;
    }

    public static e A(String str, String str2, String str3, String str4, Map map) {
        e eVar = new e();
        eVar.y("user");
        eVar.u("ui." + str);
        if (str2 != null) {
            eVar.v("view.id", str2);
        }
        if (str3 != null) {
            eVar.v("view.class", str3);
        }
        if (str4 != null) {
            eVar.v("view.tag", str4);
        }
        for (Map.Entry entry : map.entrySet()) {
            eVar.m().put((String) entry.getKey(), entry.getValue());
        }
        eVar.w(g7.INFO);
        return eVar;
    }

    private static boolean h(e eVar, e eVar2) {
        return eVar.p().getTime() == eVar2.p().getTime() && io.sentry.util.w.a(eVar.f83420e, eVar2.f83420e) && io.sentry.util.w.a(eVar.f83421f, eVar2.f83421f) && io.sentry.util.w.a(eVar.f83423h, eVar2.f83423h) && io.sentry.util.w.a(eVar.f83424i, eVar2.f83424i) && eVar.f83425j == eVar2.f83425j;
    }

    private static int i(e eVar) {
        return io.sentry.util.w.b(Long.valueOf(eVar.p().getTime()), eVar.f83420e, eVar.f83421f, eVar.f83423h, eVar.f83424i, eVar.f83425j);
    }

    private static boolean r(e eVar, e eVar2) {
        return h(eVar, eVar2) && io.sentry.util.w.a(eVar.l("status_code"), eVar2.l("status_code")) && io.sentry.util.w.a(eVar.l("url"), eVar2.l("url")) && io.sentry.util.w.a(eVar.l("method"), eVar2.l("method")) && io.sentry.util.w.a(eVar.l("http.fragment"), eVar2.l("http.fragment")) && io.sentry.util.w.a(eVar.l("http.query"), eVar2.l("http.query"));
    }

    private static int s(e eVar) {
        return io.sentry.util.w.b(Long.valueOf(eVar.p().getTime()), eVar.f83420e, eVar.f83421f, eVar.f83423h, eVar.f83424i, eVar.f83425j, eVar.l("status_code"), eVar.l("url"), eVar.l("method"), eVar.l("http.fragment"), eVar.l("http.query"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return "http".equals(this.f83421f) ? r(this, eVar) : h(this, eVar);
    }

    public int hashCode() {
        return "http".equals(this.f83421f) ? s(this) : i(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        return this.f83419d.compareTo(eVar.f83419d);
    }

    public String k() {
        return this.f83423h;
    }

    public Object l(String str) {
        if (str == null) {
            return null;
        }
        return this.f83422g.get(str);
    }

    public Map m() {
        return this.f83422g;
    }

    public g7 n() {
        return this.f83425j;
    }

    public String o() {
        return this.f83420e;
    }

    public Date p() {
        Date date = this.f83418c;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l10 = this.f83417b;
        if (l10 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateE = l.e(l10.longValue());
        this.f83418c = dateE;
        return dateE;
    }

    public String q() {
        return this.f83421f;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("timestamp").j(iLogger, p());
        if (this.f83420e != null) {
            n3Var.e(PglCryptUtils.KEY_MESSAGE).a(this.f83420e);
        }
        if (this.f83421f != null) {
            n3Var.e("type").a(this.f83421f);
        }
        n3Var.e("data").j(iLogger, this.f83422g);
        if (this.f83423h != null) {
            n3Var.e("category").a(this.f83423h);
        }
        if (this.f83424i != null) {
            n3Var.e("origin").a(this.f83424i);
        }
        if (this.f83425j != null) {
            n3Var.e("level").j(iLogger, this.f83425j);
        }
        Map map = this.f83426k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83426k.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public void t(String str) {
        if (str == null) {
            return;
        }
        this.f83422g.remove(str);
    }

    public void u(String str) {
        this.f83423h = str;
    }

    public void v(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            t(str);
        } else {
            this.f83422g.put(str, obj);
        }
    }

    public void w(g7 g7Var) {
        this.f83425j = g7Var;
    }

    public void x(String str) {
        this.f83420e = str;
    }

    public void y(String str) {
        this.f83421f = str;
    }

    public void z(Map map) {
        this.f83426k = map;
    }

    public e(long j10) {
        this.f83422g = new ConcurrentHashMap();
        this.f83419d = Long.valueOf(System.nanoTime());
        this.f83417b = Long.valueOf(j10);
        this.f83418c = null;
    }

    e(e eVar) {
        this.f83422g = new ConcurrentHashMap();
        this.f83419d = Long.valueOf(System.nanoTime());
        this.f83418c = eVar.f83418c;
        this.f83417b = eVar.f83417b;
        this.f83420e = eVar.f83420e;
        this.f83421f = eVar.f83421f;
        this.f83423h = eVar.f83423h;
        this.f83424i = eVar.f83424i;
        Map mapB = io.sentry.util.c.b(eVar.f83422g);
        if (mapB != null) {
            this.f83422g = mapB;
        }
        this.f83426k = io.sentry.util.c.b(eVar.f83426k);
        this.f83425j = eVar.f83425j;
    }

    public e() {
        this(System.currentTimeMillis());
    }
}

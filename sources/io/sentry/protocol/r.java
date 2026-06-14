package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.e7;
import io.sentry.g7;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.protocol.y;
import io.sentry.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f84046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f84047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f84048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f84049f;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m3Var.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "name":
                        strNextString = m3Var.nextString();
                        break;
                    case "version":
                        strNextString2 = m3Var.nextString();
                        break;
                    case "packages":
                        List listP = m3Var.P(iLogger, new y.a());
                        if (listP == null) {
                            break;
                        } else {
                            arrayList.addAll(listP);
                            break;
                        }
                        break;
                    case "integrations":
                        List list = (List) m3Var.p0();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
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
            if (strNextString == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.a(g7.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strNextString2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                iLogger.a(g7.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            r rVar = new r(strNextString, strNextString2);
            rVar.f84047d = new CopyOnWriteArraySet(arrayList);
            rVar.f84048e = new CopyOnWriteArraySet(arrayList2);
            rVar.i(map);
            return rVar;
        }
    }

    public r(String str, String str2) {
        this.f84045b = (String) io.sentry.util.w.c(str, "name is required.");
        this.f84046c = (String) io.sentry.util.w.c(str2, "version is required.");
    }

    public static r k(r rVar, String str, String str2) {
        io.sentry.util.w.c(str, "name is required.");
        io.sentry.util.w.c(str2, "version is required.");
        if (rVar == null) {
            return new r(str, str2);
        }
        rVar.h(str);
        rVar.j(str2);
        return rVar;
    }

    public void c(String str, String str2) {
        e7.d().b(str, str2);
    }

    public Set d() {
        Set set = this.f84048e;
        return set != null ? set : e7.d().e();
    }

    public String e() {
        return this.f84045b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f84045b.equals(rVar.f84045b) && this.f84046c.equals(rVar.f84046c)) {
                return true;
            }
        }
        return false;
    }

    public Set f() {
        Set set = this.f84047d;
        return set != null ? set : e7.d().f();
    }

    public String g() {
        return this.f84046c;
    }

    public void h(String str) {
        this.f84045b = (String) io.sentry.util.w.c(str, "name is required.");
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f84045b, this.f84046c);
    }

    public void i(Map map) {
        this.f84049f = map;
    }

    public void j(String str) {
        this.f84046c = (String) io.sentry.util.w.c(str, "version is required.");
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("name").a(this.f84045b);
        n3Var.e("version").a(this.f84046c);
        Set setF = f();
        Set setD = d();
        if (!setF.isEmpty()) {
            n3Var.e("packages").j(iLogger, setF);
        }
        if (!setD.isEmpty()) {
            n3Var.e("integrations").j(iLogger, setD);
        }
        Map map = this.f84049f;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f84049f.get(str));
            }
        }
        n3Var.endObject();
    }
}

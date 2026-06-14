package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.profilemeasurements.b;
import io.sentry.t1;
import io.sentry.util.w;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f83818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f83819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Collection f83820d;

    /* JADX INFO: renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    public static final class C1010a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("values")) {
                    List listP = m3Var.P(iLogger, new b.a());
                    if (listP != null) {
                        aVar.f83820d = listP;
                    }
                } else if (strNextName.equals("unit")) {
                    String strG = m3Var.G();
                    if (strG != null) {
                        aVar.f83819c = strG;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    m3Var.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            aVar.c(concurrentHashMap);
            m3Var.endObject();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public void c(Map map) {
        this.f83818b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (w.a(this.f83818b, aVar.f83818b) && this.f83819c.equals(aVar.f83819c) && new ArrayList(this.f83820d).equals(new ArrayList(aVar.f83820d))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return w.b(this.f83818b, this.f83819c, this.f83820d);
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("unit").j(iLogger, this.f83819c);
        n3Var.e("values").j(iLogger, this.f83820d);
        Map map = this.f83818b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83818b.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public a(String str, Collection collection) {
        this.f83819c = str;
        this.f83820d = collection;
    }
}

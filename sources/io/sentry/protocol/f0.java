package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f83934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f83935c;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f0 a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            f0 f0Var = new f0();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("active_profiles")) {
                    List list = (List) m3Var.p0();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        f0Var.f83934b = strArr;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    m3Var.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            f0Var.b(concurrentHashMap);
            m3Var.endObject();
            return f0Var;
        }
    }

    public f0() {
    }

    public void b(Map map) {
        this.f83935c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f83934b, ((f0) obj).f83934b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f83934b);
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83934b != null) {
            n3Var.e("active_profiles").j(iLogger, this.f83934b);
        }
        Map map = this.f83935c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83935c.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public f0(f0 f0Var) {
        this.f83934b = f0Var.f83934b;
        this.f83935c = io.sentry.util.c.b(f0Var.f83935c);
    }
}

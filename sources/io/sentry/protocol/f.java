package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.g7;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f83932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f83933d;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            String strG = null;
            Boolean boolX = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("result")) {
                    boolX = m3Var.x();
                } else if (strNextName.equals("flag")) {
                    strG = m3Var.G();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    m3Var.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            if (strG == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                iLogger.a(g7.ERROR, "Missing required field \"flag\"", illegalStateException);
                throw illegalStateException;
            }
            if (boolX == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                iLogger.a(g7.ERROR, "Missing required field \"result\"", illegalStateException2);
                throw illegalStateException2;
            }
            f fVar = new f(strG, boolX.booleanValue());
            fVar.c(concurrentHashMap);
            m3Var.endObject();
            return fVar;
        }
    }

    public f(String str, boolean z10) {
        this.f83931b = str;
        this.f83932c = z10;
    }

    public String a() {
        return this.f83931b;
    }

    public Boolean b() {
        return Boolean.valueOf(this.f83932c);
    }

    public void c(Map map) {
        this.f83933d = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (io.sentry.util.w.a(this.f83931b, fVar.f83931b) && io.sentry.util.w.a(Boolean.valueOf(this.f83932c), Boolean.valueOf(fVar.f83932c))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f83931b, Boolean.valueOf(this.f83932c));
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("flag").a(this.f83931b);
        n3Var.e("result").d(this.f83932c);
        Map map = this.f83933d;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83933d.get(str));
            }
        }
        n3Var.endObject();
    }
}

package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.g7;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f84065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f84066d;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("name")) {
                    strNextString = m3Var.nextString();
                } else if (strNextName.equals("version")) {
                    strNextString2 = m3Var.nextString();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            m3Var.endObject();
            if (strNextString == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.a(g7.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strNextString2 != null) {
                y yVar = new y(strNextString, strNextString2);
                yVar.c(map);
                return yVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            iLogger.a(g7.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public y(String str, String str2) {
        this.f84064b = (String) io.sentry.util.w.c(str, "name is required.");
        this.f84065c = (String) io.sentry.util.w.c(str2, "version is required.");
    }

    public String a() {
        return this.f84064b;
    }

    public String b() {
        return this.f84065c;
    }

    public void c(Map map) {
        this.f84066d = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (Objects.equals(this.f84064b, yVar.f84064b) && Objects.equals(this.f84065c, yVar.f84065c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f84064b, this.f84065c);
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("name").a(this.f84064b);
        n3Var.e("version").a(this.f84065c);
        Map map = this.f84066d;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f84066d.get(str));
            }
        }
        n3Var.endObject();
    }
}

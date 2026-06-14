package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f84041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f84042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f84043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f84044f;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            q qVar = new q();
            m3Var.beginObject();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "sdk_name":
                        qVar.f84040b = m3Var.G();
                        break;
                    case "version_patchlevel":
                        qVar.f84043e = m3Var.d0();
                        break;
                    case "version_major":
                        qVar.f84041c = m3Var.d0();
                        break;
                    case "version_minor":
                        qVar.f84042d = m3Var.d0();
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
            qVar.e(map);
            return qVar;
        }
    }

    public void e(Map map) {
        this.f84044f = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84040b != null) {
            n3Var.e("sdk_name").a(this.f84040b);
        }
        if (this.f84041c != null) {
            n3Var.e("version_major").i(this.f84041c);
        }
        if (this.f84042d != null) {
            n3Var.e("version_minor").i(this.f84042d);
        }
        if (this.f84043e != null) {
            n3Var.e("version_patchlevel").i(this.f84043e);
        }
        Map map = this.f84044f;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f84044f.get(str));
            }
        }
        n3Var.endObject();
    }
}

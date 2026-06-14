package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f83948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f83950e;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            i iVar = new i();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "region":
                        iVar.f83949d = m3Var.G();
                        break;
                    case "city":
                        iVar.f83947b = m3Var.G();
                        break;
                    case "country_code":
                        iVar.f83948c = m3Var.G();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            iVar.d(concurrentHashMap);
            m3Var.endObject();
            return iVar;
        }
    }

    public void d(Map map) {
        this.f83950e = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83947b != null) {
            n3Var.e("city").a(this.f83947b);
        }
        if (this.f83948c != null) {
            n3Var.e("country_code").a(this.f83948c);
        }
        if (this.f83949d != null) {
            n3Var.e("region").a(this.f83949d);
        }
        Map map = this.f83950e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83950e.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }
}

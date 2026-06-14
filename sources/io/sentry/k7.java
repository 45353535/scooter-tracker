package io.sentry;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.i7;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k7 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f83668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f83669c;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k7 a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            List listP = null;
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals(FirebaseAnalytics.Param.ITEMS)) {
                    listP = m3Var.P(iLogger, new i7.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            m3Var.endObject();
            if (listP != null) {
                k7 k7Var = new k7(listP);
                k7Var.b(map);
                return k7Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
            iLogger.a(g7.ERROR, "Missing required field \"items\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public k7(List list) {
        this.f83668b = list;
    }

    public List a() {
        return this.f83668b;
    }

    public void b(Map map) {
        this.f83669c = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e(FirebaseAnalytics.Param.ITEMS).j(iLogger, this.f83668b);
        Map map = this.f83669c;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83669c.get(str));
            }
        }
        n3Var.endObject();
    }
}

package io.sentry.clientreport;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.g7;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f83380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f83381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f83382e;

    public static final class a implements t1 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(g7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(m3 m3Var, ILogger iLogger) throws Exception {
            String strNextName;
            m3Var.beginObject();
            String strG = null;
            String strG2 = null;
            Long lG0 = null;
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "quantity":
                        lG0 = m3Var.g0();
                        break;
                    case "reason":
                        strG = m3Var.G();
                        break;
                    case "category":
                        strG2 = m3Var.G();
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
            if (strG == null) {
                throw c("reason", iLogger);
            }
            if (strG2 == null) {
                throw c("category", iLogger);
            }
            if (lG0 == null) {
                throw c(FirebaseAnalytics.Param.QUANTITY, iLogger);
            }
            g gVar = new g(strG, strG2, lG0);
            gVar.d(map);
            return gVar;
        }
    }

    public g(String str, String str2, Long l10) {
        this.f83379b = str;
        this.f83380c = str2;
        this.f83381d = l10;
    }

    public String a() {
        return this.f83380c;
    }

    public Long b() {
        return this.f83381d;
    }

    public String c() {
        return this.f83379b;
    }

    public void d(Map map) {
        this.f83382e = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("reason").a(this.f83379b);
        n3Var.e("category").a(this.f83380c);
        n3Var.e(FirebaseAnalytics.Param.QUANTITY).i(this.f83381d);
        Map map = this.f83382e;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83382e.get(str));
            }
        }
        n3Var.endObject();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f83379b + "', category='" + this.f83380c + "', quantity=" + this.f83381d + '}';
    }
}

package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f84033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f84034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f84036e;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            b bVar = new b();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "thread_id":
                        bVar.f84035d = m3Var.G();
                        break;
                    case "timestamp":
                        bVar.f84033b = m3Var.nextDouble();
                        break;
                    case "stack_id":
                        bVar.f84034c = m3Var.nextInt();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        m3Var.l0(iLogger, map, strNextName);
                        break;
                }
            }
            bVar.e(map);
            m3Var.endObject();
            return bVar;
        }
    }

    private BigDecimal d(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public void e(Map map) {
        this.f84036e = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("timestamp").j(iLogger, d(Double.valueOf(this.f84033b)));
        n3Var.e("stack_id").j(iLogger, Integer.valueOf(this.f84034c));
        if (this.f84035d != null) {
            n3Var.e("thread_id").j(iLogger, this.f84035d);
        }
        Map map = this.f84036e;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f84036e.get(str));
            }
        }
        n3Var.endObject();
    }
}

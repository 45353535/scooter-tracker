package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.l;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import io.sentry.util.w;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f83821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f83822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f83824e;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            Double dValueOf;
            m3Var.beginObject();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "elapsed_since_start_ns":
                        String strG = m3Var.G();
                        if (strG == null) {
                            break;
                        } else {
                            bVar.f83823d = strG;
                            break;
                        }
                        break;
                    case "timestamp":
                        try {
                            dValueOf = m3Var.X();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateL = m3Var.l(iLogger);
                            dValueOf = dateL != null ? Double.valueOf(l.b(dateL)) : null;
                        }
                        if (dValueOf == null) {
                            break;
                        } else {
                            bVar.f83822c = dValueOf.doubleValue();
                            break;
                        }
                        break;
                    case "value":
                        Double dX = m3Var.X();
                        if (dX == null) {
                            break;
                        } else {
                            bVar.f83824e = dX.doubleValue();
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            bVar.e(concurrentHashMap);
            m3Var.endObject();
            return bVar;
        }
    }

    public b() {
        this(0L, 0, 0L);
    }

    private BigDecimal d(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public void e(Map map) {
        this.f83821b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (w.a(this.f83821b, bVar.f83821b) && this.f83823d.equals(bVar.f83823d) && this.f83824e == bVar.f83824e && this.f83822c == bVar.f83822c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return w.b(this.f83821b, this.f83823d, Double.valueOf(this.f83824e));
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("value").j(iLogger, Double.valueOf(this.f83824e));
        n3Var.e("elapsed_since_start_ns").j(iLogger, this.f83823d);
        n3Var.e("timestamp").j(iLogger, d(Double.valueOf(this.f83822c)));
        Map map = this.f83821b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83821b.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public b(Long l10, Number number, long j10) {
        this.f83823d = l10.toString();
        this.f83824e = number.doubleValue();
        this.f83822c = l.m(j10);
    }
}

package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.g7;
import io.sentry.n3;
import io.sentry.o8;
import io.sentry.t1;
import io.sentry.u8;
import io.sentry.w8;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f83839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Double f83840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f83841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u8 f83842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u8 f83843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f83844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f83845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w8 f83846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f83847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f83848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f83849l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f83850m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map f83851n;

    public static final class a implements t1 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(g7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.sentry.protocol.a0 a(io.sentry.m3 r24, io.sentry.ILogger r25) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 500
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.protocol.a0.a.a(io.sentry.m3, io.sentry.ILogger):io.sentry.protocol.a0");
        }
    }

    public a0(o8 o8Var) {
        this(o8Var, o8Var.s());
    }

    private BigDecimal a(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public Map b() {
        return this.f83849l;
    }

    public Map c() {
        return this.f83850m;
    }

    public String d() {
        return this.f83844g;
    }

    public u8 e() {
        return this.f83842e;
    }

    public Double f() {
        return this.f83839b;
    }

    public Double g() {
        return this.f83840c;
    }

    public void h(Map map) {
        this.f83849l = map;
    }

    public void i(Map map) {
        this.f83851n = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("start_timestamp").j(iLogger, a(this.f83839b));
        if (this.f83840c != null) {
            n3Var.e("timestamp").j(iLogger, a(this.f83840c));
        }
        n3Var.e("trace_id").j(iLogger, this.f83841d);
        n3Var.e("span_id").j(iLogger, this.f83842e);
        if (this.f83843f != null) {
            n3Var.e("parent_span_id").j(iLogger, this.f83843f);
        }
        n3Var.e("op").a(this.f83844g);
        if (this.f83845h != null) {
            n3Var.e("description").a(this.f83845h);
        }
        if (this.f83846i != null) {
            n3Var.e("status").j(iLogger, this.f83846i);
        }
        if (this.f83847j != null) {
            n3Var.e("origin").j(iLogger, this.f83847j);
        }
        if (!this.f83848k.isEmpty()) {
            n3Var.e("tags").j(iLogger, this.f83848k);
        }
        if (this.f83849l != null) {
            n3Var.e("data").j(iLogger, this.f83849l);
        }
        if (!this.f83850m.isEmpty()) {
            n3Var.e("measurements").j(iLogger, this.f83850m);
        }
        Map map = this.f83851n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83851n.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public a0(o8 o8Var, Map map) {
        io.sentry.util.w.c(o8Var, "span is required");
        this.f83845h = o8Var.getDescription();
        this.f83844g = o8Var.v();
        this.f83842e = o8Var.A();
        this.f83843f = o8Var.x();
        this.f83841d = o8Var.C();
        this.f83846i = o8Var.getStatus();
        this.f83847j = o8Var.e().g();
        Map mapB = io.sentry.util.c.b(o8Var.B());
        this.f83848k = mapB == null ? new ConcurrentHashMap() : mapB;
        Map mapB2 = io.sentry.util.c.b(o8Var.u());
        this.f83850m = mapB2 == null ? new ConcurrentHashMap() : mapB2;
        this.f83840c = o8Var.q() == null ? null : Double.valueOf(io.sentry.l.m(o8Var.r().f(o8Var.q())));
        this.f83839b = Double.valueOf(io.sentry.l.m(o8Var.r().g()));
        this.f83849l = map;
        g featureFlags = o8Var.e().d().getFeatureFlags();
        if (featureFlags != null) {
            if (this.f83849l == null) {
                this.f83849l = new HashMap();
            }
            for (f fVar : featureFlags.a()) {
                this.f83849l.put("flag.evaluation." + fVar.a(), fVar.b());
            }
        }
    }

    public a0(Double d10, Double d11, x xVar, u8 u8Var, u8 u8Var2, String str, String str2, w8 w8Var, String str3, Map map, Map map2, Map map3) {
        this.f83839b = d10;
        this.f83840c = d11;
        this.f83841d = xVar;
        this.f83842e = u8Var;
        this.f83843f = u8Var2;
        this.f83844g = str;
        this.f83845h = str2;
        this.f83846i = w8Var;
        this.f83847j = str3;
        this.f83848k = map;
        this.f83850m = map2;
        this.f83849l = map3;
    }
}

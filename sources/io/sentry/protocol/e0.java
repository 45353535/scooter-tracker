package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.d9;
import io.sentry.h8;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.n5;
import io.sentry.o8;
import io.sentry.p8;
import io.sentry.protocol.a0;
import io.sentry.protocol.g0;
import io.sentry.protocol.k;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends n5 implements d2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f83923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Double f83924r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Double f83925s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f83926t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f83927u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Map f83928v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private g0 f83929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map f83930x;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            e0 e0Var = new e0("", Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new g0(h0.CUSTOM.apiName()));
            n5.a aVar = new n5.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "start_timestamp":
                        try {
                            Double dX = m3Var.X();
                            if (dX != null) {
                                e0Var.f83924r = dX;
                            }
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateL = m3Var.l(iLogger);
                            if (dateL != null) {
                                e0Var.f83924r = Double.valueOf(io.sentry.l.b(dateL));
                            }
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapK0 = m3Var.k0(iLogger, new k.a());
                        if (mapK0 != null) {
                            e0Var.f83928v.putAll(mapK0);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "type":
                        m3Var.nextString();
                        break;
                    case "timestamp":
                        try {
                            Double dX2 = m3Var.X();
                            if (dX2 != null) {
                                e0Var.f83925s = dX2;
                            }
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateL2 = m3Var.l(iLogger);
                            if (dateL2 != null) {
                                e0Var.f83925s = Double.valueOf(io.sentry.l.b(dateL2));
                            }
                            break;
                        }
                        break;
                    case "spans":
                        List listP = m3Var.P(iLogger, new a0.a());
                        if (listP != null) {
                            e0Var.f83926t.addAll(listP);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "transaction_info":
                        e0Var.f83929w = new g0.a().a(m3Var, iLogger);
                        break;
                    case "transaction":
                        e0Var.f83923q = m3Var.G();
                        break;
                    default:
                        if (aVar.a(e0Var, strNextName, m3Var, iLogger)) {
                            break;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            m3Var.l0(iLogger, concurrentHashMap, strNextName);
                            break;
                        }
                        break;
                }
            }
            e0Var.u0(concurrentHashMap);
            m3Var.endObject();
            return e0Var;
        }
    }

    public e0(h8 h8Var) {
        super(h8Var.getEventId());
        this.f83926t = new ArrayList();
        this.f83927u = "transaction";
        this.f83928v = new HashMap();
        io.sentry.util.w.c(h8Var, "sentryTracer is required");
        this.f83924r = Double.valueOf(io.sentry.l.m(h8Var.r().g()));
        this.f83925s = Double.valueOf(io.sentry.l.m(h8Var.r().f(h8Var.q())));
        this.f83923q = h8Var.getName();
        for (o8 o8Var : h8Var.F()) {
            if (Boolean.TRUE.equals(o8Var.b())) {
                this.f83926t.add(new a0(o8Var));
            }
        }
        c cVarC = C();
        cVarC.m(h8Var.G());
        p8 p8VarE = h8Var.e();
        Map mapH = h8Var.H();
        p8 p8Var = new p8(p8VarE.p(), p8VarE.m(), p8VarE.h(), p8VarE.f(), p8VarE.c(), p8VarE.l(), p8VarE.n(), p8VarE.g());
        for (Map.Entry entry : p8VarE.o().entrySet()) {
            f0((String) entry.getKey(), (String) entry.getValue());
        }
        if (mapH != null) {
            for (Map.Entry entry2 : mapH.entrySet()) {
                p8Var.q((String) entry2.getKey(), entry2.getValue());
            }
        }
        g featureFlags = p8VarE.d().getFeatureFlags();
        if (featureFlags != null) {
            for (f fVar : featureFlags.a()) {
                p8Var.q("flag.evaluation." + fVar.a(), fVar.b());
            }
        }
        cVarC.z(p8Var);
        this.f83929w = new g0(h8Var.M().apiName());
    }

    public Map o0() {
        return this.f83928v;
    }

    public d9 p0() {
        p8 p8VarJ = C().j();
        if (p8VarJ == null) {
            return null;
        }
        return p8VarJ.l();
    }

    public List q0() {
        return this.f83926t;
    }

    public String r0() {
        return this.f83923q;
    }

    public boolean s0() {
        return this.f83925s != null;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83923q != null) {
            n3Var.e("transaction").a(this.f83923q);
        }
        n3Var.e("start_timestamp").j(iLogger, io.sentry.l.c(this.f83924r));
        if (this.f83925s != null) {
            n3Var.e("timestamp").j(iLogger, io.sentry.l.c(this.f83925s));
        }
        if (!this.f83926t.isEmpty()) {
            n3Var.e("spans").j(iLogger, this.f83926t);
        }
        n3Var.e("type").a("transaction");
        if (!this.f83928v.isEmpty()) {
            n3Var.e("measurements").j(iLogger, this.f83928v);
        }
        n3Var.e("transaction_info").j(iLogger, this.f83929w);
        new n5.b().a(this, n3Var, iLogger);
        Map map = this.f83930x;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83930x.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public boolean t0() {
        d9 d9VarP0 = p0();
        if (d9VarP0 == null) {
            return false;
        }
        return d9VarP0.e().booleanValue();
    }

    public void u0(Map map) {
        this.f83930x = map;
    }

    public e0(String str, Double d10, Double d11, List list, Map map, g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        this.f83926t = arrayList;
        this.f83927u = "transaction";
        HashMap map2 = new HashMap();
        this.f83928v = map2;
        this.f83923q = str;
        this.f83924r = d10;
        this.f83925s = d11;
        arrayList.addAll(list);
        map2.putAll(map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f83928v.putAll(((a0) it.next()).c());
        }
        this.f83929w = g0Var;
    }
}

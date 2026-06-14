package io.sentry.rrweb;

import com.google.common.base.Ascii;
import com.taurusx.tax.y.z.w.s;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.rrweb.b;
import io.sentry.t1;
import io.sentry.util.w;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends b implements d2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f84148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f84149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f84150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f84151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f84152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f84153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f84154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f84155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f84156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f84157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f84158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f84159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map f84160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f84161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map f84162s;

    public static final class a implements t1 {
        private void c(j jVar, m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    d(jVar, m3Var, iLogger);
                } else if (strNextName.equals(s.z.f67720z)) {
                    String strG = m3Var.G();
                    if (strG == null) {
                        strG = "";
                    }
                    jVar.f84147d = strG;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    m3Var.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            jVar.v(concurrentHashMap);
            m3Var.endObject();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private void d(j jVar, m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                byte b10 = -1;
                switch (strNextName.hashCode()) {
                    case -1992012396:
                        if (strNextName.equals("duration")) {
                            b10 = 0;
                        }
                        break;
                    case -1627805778:
                        if (strNextName.equals("segmentId")) {
                            b10 = 1;
                        }
                        break;
                    case -1221029593:
                        if (strNextName.equals("height")) {
                            b10 = 2;
                        }
                        break;
                    case -410956671:
                        if (strNextName.equals("container")) {
                            b10 = 3;
                        }
                        break;
                    case -296512606:
                        if (strNextName.equals("frameCount")) {
                            b10 = 4;
                        }
                        break;
                    case 115029:
                        if (strNextName.equals("top")) {
                            b10 = 5;
                        }
                        break;
                    case 3317767:
                        if (strNextName.equals("left")) {
                            b10 = 6;
                        }
                        break;
                    case 3530753:
                        if (strNextName.equals("size")) {
                            b10 = 7;
                        }
                        break;
                    case 113126854:
                        if (strNextName.equals("width")) {
                            b10 = 8;
                        }
                        break;
                    case 545057773:
                        if (strNextName.equals("frameRate")) {
                            b10 = 9;
                        }
                        break;
                    case 1711222099:
                        if (strNextName.equals("encoding")) {
                            b10 = 10;
                        }
                        break;
                    case 2135109831:
                        if (strNextName.equals("frameRateType")) {
                            b10 = Ascii.VT;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        jVar.f84150g = m3Var.nextLong();
                        break;
                    case 1:
                        jVar.f84148e = m3Var.nextInt();
                        break;
                    case 2:
                        Integer numD0 = m3Var.d0();
                        jVar.f84153j = numD0 == null ? 0 : numD0.intValue();
                        break;
                    case 3:
                        String strG = m3Var.G();
                        jVar.f84152i = strG != null ? strG : "";
                        break;
                    case 4:
                        Integer numD02 = m3Var.d0();
                        jVar.f84155l = numD02 == null ? 0 : numD02.intValue();
                        break;
                    case 5:
                        Integer numD03 = m3Var.d0();
                        jVar.f84159p = numD03 == null ? 0 : numD03.intValue();
                        break;
                    case 6:
                        Integer numD04 = m3Var.d0();
                        jVar.f84158o = numD04 == null ? 0 : numD04.intValue();
                        break;
                    case 7:
                        Long lG0 = m3Var.g0();
                        jVar.f84149f = lG0 == null ? 0L : lG0.longValue();
                        break;
                    case 8:
                        Integer numD05 = m3Var.d0();
                        jVar.f84154k = numD05 == null ? 0 : numD05.intValue();
                        break;
                    case 9:
                        Integer numD06 = m3Var.d0();
                        jVar.f84157n = numD06 == null ? 0 : numD06.intValue();
                        break;
                    case 10:
                        String strG2 = m3Var.G();
                        jVar.f84151h = strG2 != null ? strG2 : "";
                        break;
                    case 11:
                        String strG3 = m3Var.G();
                        jVar.f84156m = strG3 != null ? strG3 : "";
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            jVar.B(concurrentHashMap);
            m3Var.endObject();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            j jVar = new j();
            b.a aVar = new b.a();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    c(jVar, m3Var, iLogger);
                } else if (!aVar.a(jVar, strNextName, m3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            jVar.F(map);
            m3Var.endObject();
            return jVar;
        }
    }

    public j() {
        super(c.Custom);
        this.f84151h = "h264";
        this.f84152i = "mp4";
        this.f84156m = "constant";
        this.f84147d = "video";
    }

    private void t(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e(s.z.f67720z).a(this.f84147d);
        n3Var.e("payload");
        u(n3Var, iLogger);
        Map map = this.f84162s;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84162s.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    private void u(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("segmentId").b(this.f84148e);
        n3Var.e("size").b(this.f84149f);
        n3Var.e("duration").b(this.f84150g);
        n3Var.e("encoding").a(this.f84151h);
        n3Var.e("container").a(this.f84152i);
        n3Var.e("height").b(this.f84153j);
        n3Var.e("width").b(this.f84154k);
        n3Var.e("frameCount").b(this.f84155l);
        n3Var.e("frameRate").b(this.f84157n);
        n3Var.e("frameRateType").a(this.f84156m);
        n3Var.e("left").b(this.f84158o);
        n3Var.e("top").b(this.f84159p);
        Map map = this.f84161r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84161r.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public void A(int i10) {
        this.f84158o = i10;
    }

    public void B(Map map) {
        this.f84161r = map;
    }

    public void C(int i10) {
        this.f84148e = i10;
    }

    public void D(long j10) {
        this.f84149f = j10;
    }

    public void E(int i10) {
        this.f84159p = i10;
    }

    public void F(Map map) {
        this.f84160q = map;
    }

    public void G(int i10) {
        this.f84154k = i10;
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f84148e == jVar.f84148e && this.f84149f == jVar.f84149f && this.f84150g == jVar.f84150g && this.f84153j == jVar.f84153j && this.f84154k == jVar.f84154k && this.f84155l == jVar.f84155l && this.f84157n == jVar.f84157n && this.f84158o == jVar.f84158o && this.f84159p == jVar.f84159p && w.a(this.f84147d, jVar.f84147d) && w.a(this.f84151h, jVar.f84151h) && w.a(this.f84152i, jVar.f84152i) && w.a(this.f84156m, jVar.f84156m);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return w.b(Integer.valueOf(super.hashCode()), this.f84147d, Integer.valueOf(this.f84148e), Long.valueOf(this.f84149f), Long.valueOf(this.f84150g), this.f84151h, this.f84152i, Integer.valueOf(this.f84153j), Integer.valueOf(this.f84154k), Integer.valueOf(this.f84155l), this.f84156m, Integer.valueOf(this.f84157n), Integer.valueOf(this.f84158o), Integer.valueOf(this.f84159p));
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        new b.C1014b().a(this, n3Var, iLogger);
        n3Var.e("data");
        t(n3Var, iLogger);
        Map map = this.f84160q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84160q.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public void v(Map map) {
        this.f84162s = map;
    }

    public void w(long j10) {
        this.f84150g = j10;
    }

    public void x(int i10) {
        this.f84155l = i10;
    }

    public void y(int i10) {
        this.f84157n = i10;
    }

    public void z(int i10) {
        this.f84153j = i10;
    }
}

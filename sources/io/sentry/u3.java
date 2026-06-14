package io.sentry;

import com.adjust.sdk.purchase.ADJPConstants;
import com.google.android.gms.common.Scopes;
import com.google.common.base.Ascii;
import io.sentry.profilemeasurements.a;
import io.sentry.protocol.d;
import io.sentry.protocol.profiling.a;
import io.sentry.protocol.r;
import io.sentry.protocol.x;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class u3 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.protocol.d f84261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.protocol.x f84262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.x f84263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.sentry.protocol.r f84264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f84265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f84266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f84267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f84268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f84269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double f84270k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final File f84271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f84272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private io.sentry.protocol.profiling.a f84273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map f84274o;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.sentry.protocol.x f84275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.sentry.protocol.x f84276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f84277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File f84278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final double f84279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f84280f;

        public a(io.sentry.protocol.x xVar, io.sentry.protocol.x xVar2, Map map, File file, s5 s5Var, String str) {
            this.f84275a = xVar;
            this.f84276b = xVar2;
            this.f84277c = new ConcurrentHashMap(map);
            this.f84278d = file;
            this.f84279e = l.m(s5Var.g());
            this.f84280f = str;
        }

        public u3 a(v7 v7Var) {
            return new u3(this.f84275a, this.f84276b, this.f84278d, this.f84277c, Double.valueOf(this.f84279e), this.f84280f, v7Var);
        }
    }

    public static final class b implements t1 {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u3 a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            u3 u3Var = new u3();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                byte b10 = -1;
                switch (strNextName.hashCode()) {
                    case -1840434063:
                        if (strNextName.equals("debug_meta")) {
                            b10 = 0;
                        }
                        break;
                    case -362243017:
                        if (strNextName.equals("measurements")) {
                            b10 = 1;
                        }
                        break;
                    case -309425751:
                        if (strNextName.equals(Scopes.PROFILE)) {
                            b10 = 2;
                        }
                        break;
                    case -85904877:
                        if (strNextName.equals(ADJPConstants.KEY_ENVIRONMENT)) {
                            b10 = 3;
                        }
                        break;
                    case 55126294:
                        if (strNextName.equals("timestamp")) {
                            b10 = 4;
                        }
                        break;
                    case 178573617:
                        if (strNextName.equals("profiler_id")) {
                            b10 = 5;
                        }
                        break;
                    case 351608024:
                        if (strNextName.equals("version")) {
                            b10 = 6;
                        }
                        break;
                    case 1090594823:
                        if (strNextName.equals("release")) {
                            b10 = 7;
                        }
                        break;
                    case 1102774726:
                        if (strNextName.equals("client_sdk")) {
                            b10 = 8;
                        }
                        break;
                    case 1874684019:
                        if (strNextName.equals("platform")) {
                            b10 = 9;
                        }
                        break;
                    case 1953158756:
                        if (strNextName.equals("sampled_profile")) {
                            b10 = 10;
                        }
                        break;
                    case 2005113901:
                        if (strNextName.equals("chunk_id")) {
                            b10 = Ascii.VT;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        io.sentry.protocol.d dVar = (io.sentry.protocol.d) m3Var.B(iLogger, new d.a());
                        if (dVar != null) {
                            u3Var.f84261b = dVar;
                        }
                        break;
                    case 1:
                        Map mapK0 = m3Var.k0(iLogger, new a.C1010a());
                        if (mapK0 != null) {
                            u3Var.f84265f.putAll(mapK0);
                        }
                        break;
                    case 2:
                        io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) m3Var.B(iLogger, new a.b());
                        if (aVar != null) {
                            u3Var.f84273n = aVar;
                        }
                        break;
                    case 3:
                        String strG = m3Var.G();
                        if (strG != null) {
                            u3Var.f84268i = strG;
                        }
                        break;
                    case 4:
                        Double dX = m3Var.X();
                        if (dX != null) {
                            u3Var.f84270k = dX.doubleValue();
                        }
                        break;
                    case 5:
                        io.sentry.protocol.x xVar = (io.sentry.protocol.x) m3Var.B(iLogger, new x.a());
                        if (xVar != null) {
                            u3Var.f84262c = xVar;
                        }
                        break;
                    case 6:
                        String strG2 = m3Var.G();
                        if (strG2 != null) {
                            u3Var.f84269j = strG2;
                        }
                        break;
                    case 7:
                        String strG3 = m3Var.G();
                        if (strG3 != null) {
                            u3Var.f84267h = strG3;
                        }
                        break;
                    case 8:
                        io.sentry.protocol.r rVar = (io.sentry.protocol.r) m3Var.B(iLogger, new r.a());
                        if (rVar != null) {
                            u3Var.f84264e = rVar;
                        }
                        break;
                    case 9:
                        String strG4 = m3Var.G();
                        if (strG4 != null) {
                            u3Var.f84266g = strG4;
                        }
                        break;
                    case 10:
                        String strG5 = m3Var.G();
                        if (strG5 != null) {
                            u3Var.f84272m = strG5;
                        }
                        break;
                    case 11:
                        io.sentry.protocol.x xVar2 = (io.sentry.protocol.x) m3Var.B(iLogger, new x.a());
                        if (xVar2 != null) {
                            u3Var.f84263d = xVar2;
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
            u3Var.u(concurrentHashMap);
            m3Var.endObject();
            return u3Var;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u3() {
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
        this(xVar, xVar, new File("dummy"), new HashMap(), Double.valueOf(0.0d), "android", v7.empty());
    }

    private BigDecimal m(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return Objects.equals(this.f84261b, u3Var.f84261b) && Objects.equals(this.f84262c, u3Var.f84262c) && Objects.equals(this.f84263d, u3Var.f84263d) && Objects.equals(this.f84264e, u3Var.f84264e) && Objects.equals(this.f84265f, u3Var.f84265f) && Objects.equals(this.f84266g, u3Var.f84266g) && Objects.equals(this.f84267h, u3Var.f84267h) && Objects.equals(this.f84268i, u3Var.f84268i) && Objects.equals(this.f84269j, u3Var.f84269j) && Objects.equals(this.f84272m, u3Var.f84272m) && Objects.equals(this.f84274o, u3Var.f84274o) && Objects.equals(this.f84273n, u3Var.f84273n);
    }

    public int hashCode() {
        return Objects.hash(this.f84261b, this.f84262c, this.f84263d, this.f84264e, this.f84265f, this.f84266g, this.f84267h, this.f84268i, this.f84269j, this.f84272m, this.f84273n, this.f84274o);
    }

    public io.sentry.protocol.x n() {
        return this.f84263d;
    }

    public io.sentry.protocol.d o() {
        return this.f84261b;
    }

    public String p() {
        return this.f84266g;
    }

    public File q() {
        return this.f84271l;
    }

    public void r(io.sentry.protocol.d dVar) {
        this.f84261b = dVar;
    }

    public void s(String str) {
        this.f84272m = str;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84261b != null) {
            n3Var.e("debug_meta").j(iLogger, this.f84261b);
        }
        n3Var.e("profiler_id").j(iLogger, this.f84262c);
        n3Var.e("chunk_id").j(iLogger, this.f84263d);
        if (this.f84264e != null) {
            n3Var.e("client_sdk").j(iLogger, this.f84264e);
        }
        if (!this.f84265f.isEmpty()) {
            String strF = n3Var.f();
            n3Var.h("");
            n3Var.e("measurements").j(iLogger, this.f84265f);
            n3Var.h(strF);
        }
        n3Var.e("platform").j(iLogger, this.f84266g);
        n3Var.e("release").j(iLogger, this.f84267h);
        if (this.f84268i != null) {
            n3Var.e(ADJPConstants.KEY_ENVIRONMENT).j(iLogger, this.f84268i);
        }
        n3Var.e("version").j(iLogger, this.f84269j);
        if (this.f84272m != null) {
            n3Var.e("sampled_profile").j(iLogger, this.f84272m);
        }
        n3Var.e("timestamp").j(iLogger, m(Double.valueOf(this.f84270k)));
        if (this.f84273n != null) {
            n3Var.e(Scopes.PROFILE).j(iLogger, this.f84273n);
        }
        Map map = this.f84274o;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f84274o.get(str));
            }
        }
        n3Var.endObject();
    }

    public void t(io.sentry.protocol.profiling.a aVar) {
        this.f84273n = aVar;
    }

    public void u(Map map) {
        this.f84274o = map;
    }

    public u3(io.sentry.protocol.x xVar, io.sentry.protocol.x xVar2, File file, Map map, Double d10, String str, v7 v7Var) {
        this.f84272m = null;
        this.f84262c = xVar;
        this.f84263d = xVar2;
        this.f84271l = file;
        this.f84265f = map;
        this.f84261b = null;
        this.f84264e = v7Var.getSdkVersion();
        this.f84267h = v7Var.getRelease() != null ? v7Var.getRelease() : "";
        this.f84268i = v7Var.getEnvironment();
        this.f84266g = str;
        this.f84269j = "2";
        this.f84270k = d10.doubleValue();
    }
}

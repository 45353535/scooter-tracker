package io.sentry;

import com.adjust.sdk.purchase.ADJPConstants;
import com.ironsource.C4240b4;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class k8 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f83670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f83671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f83672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f83673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f83674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f83675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f83676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Long f83677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Double f83678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f83679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f83680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f83681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f83682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f83683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.sentry.util.a f83684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map f83685q;

    public static final class a implements t1 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(g7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.sentry.k8 a(io.sentry.m3 r30, io.sentry.ILogger r31) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 616
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.k8.a.a(io.sentry.m3, io.sentry.ILogger):io.sentry.k8");
        }
    }

    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public k8(b bVar, Date date, Date date2, int i10, String str, String str2, Boolean bool, Long l10, Double d10, String str3, String str4, String str5, String str6, String str7) {
        this.f83684p = new io.sentry.util.a();
        this.f83676h = bVar;
        this.f83670b = date;
        this.f83671c = date2;
        this.f83672d = new AtomicInteger(i10);
        this.f83673e = str;
        this.f83674f = str2;
        this.f83675g = bool;
        this.f83677i = l10;
        this.f83678j = d10;
        this.f83679k = str3;
        this.f83680l = str4;
        this.f83681m = str5;
        this.f83682n = str6;
        this.f83683o = str7;
    }

    private double a(Date date) {
        return Math.abs(date.getTime() - this.f83670b.getTime()) / 1000.0d;
    }

    private long i(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k8 clone() {
        return new k8(this.f83676h, this.f83670b, this.f83671c, this.f83672d.get(), this.f83673e, this.f83674f, this.f83675g, this.f83677i, this.f83678j, this.f83679k, this.f83680l, this.f83681m, this.f83682n, this.f83683o);
    }

    public void c() {
        d(l.d());
    }

    public void d(Date date) {
        g1 g1VarD = this.f83684p.d();
        try {
            this.f83675g = null;
            if (this.f83676h == b.Ok) {
                this.f83676h = b.Exited;
            }
            if (date != null) {
                this.f83671c = date;
            } else {
                this.f83671c = l.d();
            }
            Date date2 = this.f83671c;
            if (date2 != null) {
                this.f83678j = Double.valueOf(a(date2));
                this.f83677i = Long.valueOf(i(this.f83671c));
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public int e() {
        return this.f83672d.get();
    }

    public String f() {
        return this.f83683o;
    }

    public Boolean g() {
        return this.f83675g;
    }

    public String h() {
        return this.f83682n;
    }

    public String j() {
        return this.f83674f;
    }

    public Date k() {
        Date date = this.f83670b;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public b l() {
        return this.f83676h;
    }

    public boolean m() {
        return this.f83676h != b.Ok;
    }

    public void n() {
        this.f83675g = Boolean.TRUE;
    }

    public void o(Map map) {
        this.f83685q = map;
    }

    public boolean p(b bVar, String str, boolean z10) {
        return q(bVar, str, z10, null);
    }

    public boolean q(b bVar, String str, boolean z10, String str2) {
        boolean z11;
        g1 g1VarD = this.f83684p.d();
        boolean z12 = true;
        if (bVar != null) {
            try {
                this.f83676h = bVar;
                z11 = true;
            } catch (Throwable th2) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } else {
            z11 = false;
        }
        if (str != null) {
            this.f83680l = str;
            z11 = true;
        }
        if (z10) {
            this.f83672d.addAndGet(1);
            z11 = true;
        }
        if (str2 != null) {
            this.f83683o = str2;
        } else {
            z12 = z11;
        }
        if (z12) {
            this.f83675g = null;
            Date dateD = l.d();
            this.f83671c = dateD;
            if (dateD != null) {
                this.f83677i = Long.valueOf(i(dateD));
            }
        }
        if (g1VarD != null) {
            g1VarD.close();
        }
        return z12;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83674f != null) {
            n3Var.e("sid").a(this.f83674f);
        }
        if (this.f83673e != null) {
            n3Var.e("did").a(this.f83673e);
        }
        if (this.f83675g != null) {
            n3Var.e("init").k(this.f83675g);
        }
        n3Var.e(C4240b4.i.f42621d0).j(iLogger, this.f83670b);
        n3Var.e("status").j(iLogger, this.f83676h.name().toLowerCase(Locale.ROOT));
        if (this.f83677i != null) {
            n3Var.e("seq").i(this.f83677i);
        }
        n3Var.e("errors").b(this.f83672d.intValue());
        if (this.f83678j != null) {
            n3Var.e("duration").i(this.f83678j);
        }
        if (this.f83671c != null) {
            n3Var.e("timestamp").j(iLogger, this.f83671c);
        }
        if (this.f83683o != null) {
            n3Var.e("abnormal_mechanism").j(iLogger, this.f83683o);
        }
        n3Var.e("attrs");
        n3Var.beginObject();
        n3Var.e("release").j(iLogger, this.f83682n);
        if (this.f83681m != null) {
            n3Var.e(ADJPConstants.KEY_ENVIRONMENT).j(iLogger, this.f83681m);
        }
        if (this.f83679k != null) {
            n3Var.e("ip_address").j(iLogger, this.f83679k);
        }
        if (this.f83680l != null) {
            n3Var.e("user_agent").j(iLogger, this.f83680l);
        }
        n3Var.endObject();
        Map map = this.f83685q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83685q.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public k8(String str, io.sentry.protocol.i0 i0Var, String str2, String str3) {
        this(b.Ok, l.d(), l.d(), 0, str, i8.a(), Boolean.TRUE, null, null, i0Var != null ? i0Var.i() : null, null, str2, str3, null);
    }
}

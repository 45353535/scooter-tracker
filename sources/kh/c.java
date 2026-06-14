package kh;

import com.google.common.net.HttpHeaders;
import com.vungle.ads.internal.signals.SignalManager;
import hh.b0;
import hh.t;
import hh.z;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f93162c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f93163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f93164b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(hh.b0 r5, hh.z r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r5.q()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = hh.b0.M(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                hh.d r0 = r5.n()
                int r0 = r0.c()
                r1 = -1
                if (r0 != r1) goto L65
                hh.d r0 = r5.n()
                boolean r0 = r0.b()
                if (r0 != 0) goto L65
                hh.d r0 = r5.n()
                boolean r0 = r0.a()
                if (r0 != 0) goto L65
                return r2
            L65:
                hh.d r5 = r5.n()
                boolean r5 = r5.h()
                if (r5 != 0) goto L7b
                hh.d r5 = r6.b()
                boolean r5 = r5.h()
                if (r5 != 0) goto L7b
                r5 = 1
                return r5
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kh.c.a.a(hh.b0, hh.z):boolean");
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f93165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z f93166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b0 f93167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Date f93168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f93169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Date f93170f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f93171g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Date f93172h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f93173i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f93174j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f93175k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f93176l;

        public b(long j10, z request, b0 b0Var) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f93165a = j10;
            this.f93166b = request;
            this.f93167c = b0Var;
            this.f93176l = -1;
            if (b0Var != null) {
                this.f93173i = b0Var.s0();
                this.f93174j = b0Var.n0();
                t tVarR = b0Var.R();
                int size = tVarR.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strE = tVarR.e(i10);
                    String strI = tVarR.i(i10);
                    if (StringsKt.N(strE, "Date", true)) {
                        this.f93168d = nh.c.a(strI);
                        this.f93169e = strI;
                    } else if (StringsKt.N(strE, "Expires", true)) {
                        this.f93172h = nh.c.a(strI);
                    } else if (StringsKt.N(strE, HttpHeaders.LAST_MODIFIED, true)) {
                        this.f93170f = nh.c.a(strI);
                        this.f93171g = strI;
                    } else if (StringsKt.N(strE, "ETag", true)) {
                        this.f93175k = strI;
                    } else if (StringsKt.N(strE, HttpHeaders.AGE, true)) {
                        this.f93176l = ih.d.W(strI, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f93168d;
            long jMax = date != null ? Math.max(0L, this.f93174j - date.getTime()) : 0L;
            int i10 = this.f93176l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f93174j;
            return jMax + (j10 - this.f93173i) + (this.f93165a - j10);
        }

        private final c c() {
            String str;
            if (this.f93167c == null) {
                return new c(this.f93166b, null);
            }
            if (this.f93166b.g() && this.f93167c.w() == null) {
                return new c(this.f93166b, null);
            }
            if (!c.f93162c.a(this.f93167c, this.f93166b)) {
                return new c(this.f93166b, null);
            }
            hh.d dVarB = this.f93166b.b();
            if (dVarB.g() || e(this.f93166b)) {
                return new c(this.f93166b, null);
            }
            hh.d dVarN = this.f93167c.n();
            long jA = a();
            long jD = d();
            if (dVarB.c() != -1) {
                jD = Math.min(jD, TimeUnit.SECONDS.toMillis(dVarB.c()));
            }
            long millis = 0;
            long millis2 = dVarB.e() != -1 ? TimeUnit.SECONDS.toMillis(dVarB.e()) : 0L;
            if (!dVarN.f() && dVarB.d() != -1) {
                millis = TimeUnit.SECONDS.toMillis(dVarB.d());
            }
            if (!dVarN.g()) {
                long j10 = millis2 + jA;
                if (j10 < millis + jD) {
                    b0.a aVarB0 = this.f93167c.b0();
                    if (j10 >= jD) {
                        aVarB0.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > SignalManager.TWENTY_FOUR_HOURS_MILLIS && f()) {
                        aVarB0.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c(null, aVarB0.c());
                }
            }
            String str2 = this.f93175k;
            if (str2 != null) {
                str = HttpHeaders.IF_NONE_MATCH;
            } else {
                if (this.f93170f != null) {
                    str2 = this.f93171g;
                } else {
                    if (this.f93168d == null) {
                        return new c(this.f93166b, null);
                    }
                    str2 = this.f93169e;
                }
                str = HttpHeaders.IF_MODIFIED_SINCE;
            }
            t.a aVarF = this.f93166b.e().f();
            Intrinsics.checkNotNull(str2);
            aVarF.c(str, str2);
            return new c(this.f93166b.i().g(aVarF.e()).b(), this.f93167c);
        }

        private final long d() {
            b0 b0Var = this.f93167c;
            Intrinsics.checkNotNull(b0Var);
            if (b0Var.n().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            Date date = this.f93172h;
            if (date != null) {
                Date date2 = this.f93168d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f93174j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f93170f != null && this.f93167c.r0().l().m() == null) {
                Date date3 = this.f93168d;
                long time2 = date3 != null ? date3.getTime() : this.f93173i;
                Date date4 = this.f93170f;
                Intrinsics.checkNotNull(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean e(z zVar) {
            return (zVar.d(HttpHeaders.IF_MODIFIED_SINCE) == null && zVar.d(HttpHeaders.IF_NONE_MATCH) == null) ? false : true;
        }

        private final boolean f() {
            b0 b0Var = this.f93167c;
            Intrinsics.checkNotNull(b0Var);
            return b0Var.n().c() == -1 && this.f93172h == null;
        }

        public final c b() {
            c cVarC = c();
            return (cVarC.b() == null || !this.f93166b.b().i()) ? cVarC : new c(null, null);
        }
    }

    public c(z zVar, b0 b0Var) {
        this.f93163a = zVar;
        this.f93164b = b0Var;
    }

    public final b0 a() {
        return this.f93164b;
    }

    public final z b() {
        return this.f93163a;
    }
}

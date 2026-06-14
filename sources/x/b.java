package x;

import androidx.webkit.ProxyConfig;
import c0.i;
import com.google.common.net.HttpHeaders;
import hh.b0;
import hh.t;
import hh.z;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f108060c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f108061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x.a f108062b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean d(String str) {
            return StringsKt.N("Content-Length", str, true) || StringsKt.N("Content-Encoding", str, true) || StringsKt.N("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (StringsKt.N("Connection", str, true) || StringsKt.N(HttpHeaders.KEEP_ALIVE, str, true) || StringsKt.N("Proxy-Authenticate", str, true) || StringsKt.N(HttpHeaders.PROXY_AUTHORIZATION, str, true) || StringsKt.N(HttpHeaders.TE, str, true) || StringsKt.N("Trailers", str, true) || StringsKt.N(HttpHeaders.TRANSFER_ENCODING, str, true) || StringsKt.N(HttpHeaders.UPGRADE, str, true)) ? false : true;
        }

        public final t a(t tVar, t tVar2) {
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strE = tVar.e(i10);
                String strI = tVar.i(i10);
                if ((!StringsKt.N("Warning", strE, true) || !StringsKt.a0(strI, "1", false, 2, null)) && (d(strE) || !e(strE) || tVar2.a(strE) == null)) {
                    aVar.a(strE, strI);
                }
            }
            int size2 = tVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strE2 = tVar2.e(i11);
                if (!d(strE2) && e(strE2)) {
                    aVar.a(strE2, tVar2.i(i11));
                }
            }
            return aVar.e();
        }

        public final boolean b(z zVar, b0 b0Var) {
            return (zVar.b().h() || b0Var.n().h() || Intrinsics.areEqual(b0Var.R().a(HttpHeaders.VARY), ProxyConfig.MATCH_ALL_SCHEMES)) ? false : true;
        }

        public final boolean c(z zVar, x.a aVar) {
            return (zVar.b().h() || aVar.a().h() || Intrinsics.areEqual(aVar.d().a(HttpHeaders.VARY), ProxyConfig.MATCH_ALL_SCHEMES)) ? false : true;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: x.b$b, reason: collision with other inner class name */
    public static final class C1332b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z f108063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x.a f108064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Date f108065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f108066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Date f108067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f108068f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Date f108069g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f108070h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f108071i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f108072j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f108073k;

        public C1332b(z zVar, x.a aVar) {
            this.f108063a = zVar;
            this.f108064b = aVar;
            this.f108073k = -1;
            if (aVar != null) {
                this.f108070h = aVar.e();
                this.f108071i = aVar.c();
                t tVarD = aVar.d();
                int size = tVarD.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strE = tVarD.e(i10);
                    if (StringsKt.N(strE, "Date", true)) {
                        this.f108065c = tVarD.b("Date");
                        this.f108066d = tVarD.i(i10);
                    } else if (StringsKt.N(strE, "Expires", true)) {
                        this.f108069g = tVarD.b("Expires");
                    } else if (StringsKt.N(strE, HttpHeaders.LAST_MODIFIED, true)) {
                        this.f108067e = tVarD.b(HttpHeaders.LAST_MODIFIED);
                        this.f108068f = tVarD.i(i10);
                    } else if (StringsKt.N(strE, "ETag", true)) {
                        this.f108072j = tVarD.i(i10);
                    } else if (StringsKt.N(strE, HttpHeaders.AGE, true)) {
                        this.f108073k = i.y(tVarD.i(i10), -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f108065c;
            long jMax = date != null ? Math.max(0L, this.f108071i - date.getTime()) : 0L;
            int i10 = this.f108073k;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + (this.f108071i - this.f108070h) + (c0.t.f6462a.a() - this.f108071i);
        }

        private final long c() {
            x.a aVar = this.f108064b;
            Intrinsics.checkNotNull(aVar);
            if (aVar.a().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            Date date = this.f108069g;
            if (date != null) {
                Date date2 = this.f108065c;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f108071i);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f108067e != null && this.f108063a.l().m() == null) {
                Date date3 = this.f108065c;
                long time2 = date3 != null ? date3.getTime() : this.f108070h;
                Date date4 = this.f108067e;
                Intrinsics.checkNotNull(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean d(z zVar) {
            return (zVar.d(HttpHeaders.IF_MODIFIED_SINCE) == null && zVar.d(HttpHeaders.IF_NONE_MATCH) == null) ? false : true;
        }

        public final b b() {
            String str;
            x.a aVar = null;
            byte b10 = 0;
            byte b11 = 0;
            byte b12 = 0;
            byte b13 = 0;
            byte b14 = 0;
            byte b15 = 0;
            byte b16 = 0;
            byte b17 = 0;
            byte b18 = 0;
            byte b19 = 0;
            byte b20 = 0;
            byte b21 = 0;
            if (this.f108064b == null) {
                return new b(this.f108063a, aVar, b21 == true ? 1 : 0);
            }
            if (this.f108063a.g() && !this.f108064b.f()) {
                return new b(this.f108063a, b20 == true ? 1 : 0, b19 == true ? 1 : 0);
            }
            hh.d dVarA = this.f108064b.a();
            if (!b.f108060c.c(this.f108063a, this.f108064b)) {
                return new b(this.f108063a, b18 == true ? 1 : 0, b17 == true ? 1 : 0);
            }
            hh.d dVarB = this.f108063a.b();
            if (dVarB.g() || d(this.f108063a)) {
                return new b(this.f108063a, b11 == true ? 1 : 0, b10 == true ? 1 : 0);
            }
            long jA = a();
            long jC = c();
            if (dVarB.c() != -1) {
                jC = Math.min(jC, TimeUnit.SECONDS.toMillis(dVarB.c()));
            }
            long millis = 0;
            long millis2 = dVarB.e() != -1 ? TimeUnit.SECONDS.toMillis(dVarB.e()) : 0L;
            if (!dVarA.f() && dVarB.d() != -1) {
                millis = TimeUnit.SECONDS.toMillis(dVarB.d());
            }
            if (!dVarA.g() && jA + millis2 < jC + millis) {
                return new b(b16 == true ? 1 : 0, this.f108064b, b15 == true ? 1 : 0);
            }
            String str2 = this.f108072j;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                str = HttpHeaders.IF_NONE_MATCH;
            } else {
                Date date = this.f108067e;
                str = HttpHeaders.IF_MODIFIED_SINCE;
                if (date != null) {
                    str2 = this.f108068f;
                    Intrinsics.checkNotNull(str2);
                } else {
                    if (this.f108065c == null) {
                        return new b(this.f108063a, b13 == true ? 1 : 0, b12 == true ? 1 : 0);
                    }
                    str2 = this.f108066d;
                    Intrinsics.checkNotNull(str2);
                }
            }
            return new b(this.f108063a.i().a(str, str2).b(), this.f108064b, b14 == true ? 1 : 0);
        }
    }

    public /* synthetic */ b(z zVar, x.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(zVar, aVar);
    }

    public final x.a a() {
        return this.f108062b;
    }

    public final z b() {
        return this.f108061a;
    }

    private b(z zVar, x.a aVar) {
        this.f108061a = zVar;
        this.f108062b = aVar;
    }
}

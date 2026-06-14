package qd;

import android.os.SystemClock;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import eg.m1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import sd.a;
import td.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f98972l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final c f98973m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f98974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sd.a f98975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final td.c f98976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pd.x f98977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ud.b f98978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f98979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile c f98980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f98981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Mutex f98982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f98983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f98984k;

    /* JADX INFO: renamed from: qd.a$a, reason: collision with other inner class name */
    public static final class C1171a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f98985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f98986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f98987c;

        public C1171a(boolean z10, boolean z11, boolean z12) {
            this.f98985a = z10;
            this.f98986b = z11;
            this.f98987c = z12;
        }

        public final boolean a() {
            return this.f98986b;
        }

        public final boolean b() {
            return this.f98987c;
        }

        public final boolean c() {
            return this.f98985a;
        }
    }

    static final class a0 extends Lambda implements Function0 {
        a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return kotlinx.coroutines.i.a(m1.b(null, 1, null).plus(a.this.f98977d.e()));
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class b0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f98989f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(Object obj) {
            super(0);
            this.f98989f = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Unhold holder's media files, holder: " + this.f98989f;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1171a f98990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f98991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f98992c;

        public c(C1171a cleanConfiguration, d connectionConfiguration, g policyConfiguration) {
            Intrinsics.checkNotNullParameter(cleanConfiguration, "cleanConfiguration");
            Intrinsics.checkNotNullParameter(connectionConfiguration, "connectionConfiguration");
            Intrinsics.checkNotNullParameter(policyConfiguration, "policyConfiguration");
            this.f98990a = cleanConfiguration;
            this.f98991b = connectionConfiguration;
            this.f98992c = policyConfiguration;
        }

        public final C1171a a() {
            return this.f98990a;
        }

        public final d b() {
            return this.f98991b;
        }

        public final g c() {
            return this.f98992c;
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f98993r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f98994s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f98995t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f98996u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Mutex f98997v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Function2 f98998w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(Mutex mutex, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f98997v = mutex;
            this.f98998w = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c0 c0Var = new c0(this.f98997v, this.f98998w, continuation);
            c0Var.f98996u = obj;
            return c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Mutex mutex;
            Function2 function2;
            Mutex mutex2;
            Throwable th2;
            Object objG = pf.b.g();
            int i10 = this.f98995t;
            try {
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    coroutineScope = (CoroutineScope) this.f98996u;
                    mutex = this.f98997v;
                    function2 = this.f98998w;
                    this.f98996u = coroutineScope;
                    this.f98993r = mutex;
                    this.f98994s = function2;
                    this.f98995t = 1;
                    if (mutex.lock(null, this) != objG) {
                    }
                    return objG;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.f98996u;
                    try {
                        kotlin.d.b(obj);
                        mutex2.unlock(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        mutex2.unlock(null);
                        throw th2;
                    }
                }
                function2 = (Function2) this.f98994s;
                Mutex mutex3 = (Mutex) this.f98993r;
                coroutineScope = (CoroutineScope) this.f98996u;
                kotlin.d.b(obj);
                mutex = mutex3;
                this.f98996u = mutex;
                this.f98993r = null;
                this.f98994s = null;
                this.f98995t = 2;
                Object objInvoke = function2.invoke(coroutineScope, this);
                if (objInvoke != objG) {
                    mutex2 = mutex;
                    obj = objInvoke;
                    mutex2.unlock(null);
                    return obj;
                }
                return objG;
            } catch (Throwable th4) {
                mutex2 = mutex;
                th2 = th4;
                mutex2.unlock(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f98999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f99000b;

        public /* synthetic */ d(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11);
        }

        public final long a() {
            return this.f99000b;
        }

        public final long b() {
            return this.f98999a;
        }

        private d(long j10, long j11) {
            this.f98999a = j10;
            this.f99000b = j11;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f99001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f99002b;

        public e(h maxPingTimeMs, h maxFileSizeBytes) {
            Intrinsics.checkNotNullParameter(maxPingTimeMs, "maxPingTimeMs");
            Intrinsics.checkNotNullParameter(maxFileSizeBytes, "maxFileSizeBytes");
            this.f99001a = maxPingTimeMs;
            this.f99002b = maxFileSizeBytes;
        }

        public final h a() {
            return this.f99002b;
        }

        public final h b() {
            return this.f99001a;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f99003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f99004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f99005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f99006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final h f99007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final h f99008f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h f99009g;

        public f(double d10, double d11, double d12, h maxTtlMs, h minFrequency, h maxImageSizeBytes, h maxVideoSizeBytes) {
            Intrinsics.checkNotNullParameter(maxTtlMs, "maxTtlMs");
            Intrinsics.checkNotNullParameter(minFrequency, "minFrequency");
            Intrinsics.checkNotNullParameter(maxImageSizeBytes, "maxImageSizeBytes");
            Intrinsics.checkNotNullParameter(maxVideoSizeBytes, "maxVideoSizeBytes");
            this.f99003a = d10;
            this.f99004b = d11;
            this.f99005c = d12;
            this.f99006d = maxTtlMs;
            this.f99007e = minFrequency;
            this.f99008f = maxImageSizeBytes;
            this.f99009g = maxVideoSizeBytes;
        }

        public final double a() {
            return this.f99005c;
        }

        public final h b() {
            return this.f99008f;
        }

        public final h c() {
            return this.f99006d;
        }

        public final h d() {
            return this.f99009g;
        }

        public final double e() {
            return this.f99004b;
        }

        public final h f() {
            return this.f99007e;
        }

        public final double g() {
            return this.f99003a;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f99010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f99011b;

        public g(e downloadPolicy, List evictionPolicyList) {
            Intrinsics.checkNotNullParameter(downloadPolicy, "downloadPolicy");
            Intrinsics.checkNotNullParameter(evictionPolicyList, "evictionPolicyList");
            this.f99010a = downloadPolicy;
            this.f99011b = evictionPolicyList;
        }

        public final e a() {
            return this.f99010a;
        }

        public final List b() {
            return this.f99011b;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f99012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f99013b;

        public h(long j10, double d10) {
            this.f99012a = j10;
            this.f99013b = d10;
        }

        public final double a(double d10) {
            long j10 = this.f99012a;
            if (j10 == 0) {
                return 0.0d;
            }
            return this.f99013b * kotlin.ranges.g.l(d10 / j10, 0.0d, 1.0d);
        }

        public final double b(double d10) {
            long j10 = this.f99012a;
            if (j10 == 0) {
                return 0.0d;
            }
            return this.f99013b * kotlin.ranges.g.l(((double) 1) - (d10 / j10), 0.0d, 1.0d);
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f99014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f99015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f99016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f99017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final double f99018e;

        public /* synthetic */ i(String str, long j10, String str2, long j11, double d10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j10, str2, j11, d10);
        }

        public static /* synthetic */ i b(i iVar, String str, long j10, String str2, long j11, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = iVar.f99014a;
            }
            if ((i10 & 2) != 0) {
                j10 = iVar.f99015b;
            }
            if ((i10 & 4) != 0) {
                str2 = iVar.f99016c;
            }
            if ((i10 & 8) != 0) {
                j11 = iVar.f99017d;
            }
            if ((i10 & 16) != 0) {
                d10 = iVar.f99018e;
            }
            String str3 = str2;
            return iVar.a(str, j10, str3, j11, d10);
        }

        public final i a(String url, long j10, String contentType, long j11, double d10) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return new i(url, j10, contentType, j11, d10, null);
        }

        public final String c() {
            return this.f99016c;
        }

        public final long d() {
            return this.f99015b;
        }

        public final double e() {
            return this.f99018e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.areEqual(this.f99014a, iVar.f99014a) && kotlin.time.b.l(this.f99015b, iVar.f99015b) && Intrinsics.areEqual(this.f99016c, iVar.f99016c) && this.f99017d == iVar.f99017d && Double.compare(this.f99018e, iVar.f99018e) == 0;
        }

        public final long f() {
            return this.f99017d;
        }

        public final String g() {
            return this.f99014a;
        }

        public int hashCode() {
            return (((((((this.f99014a.hashCode() * 31) + kotlin.time.b.y(this.f99015b)) * 31) + this.f99016c.hashCode()) * 31) + androidx.collection.b.a(this.f99017d)) * 31) + androidx.collection.a.a(this.f99018e);
        }

        public String toString() {
            return "RemoteMediaFileInfo(url=" + this.f99014a + ", pingTime=" + ((Object) kotlin.time.b.L(this.f99015b)) + ", contentType=" + this.f99016c + ", size=" + this.f99017d + ", score=" + this.f99018e + ')';
        }

        private i(String str, long j10, String str2, long j11, double d10) {
            this.f99014a = str;
            this.f99015b = j10;
            this.f99016c = str2;
            this.f99017d = j11;
            this.f99018e = d10;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ i(String str, long j10, String str2, long j11, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 2) != 0) {
                b.a aVar = kotlin.time.b.f93560c;
                j10 = kotlin.time.c.s(0, cg.b.f6838e);
            }
            this(str, j10, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? Long.MAX_VALUE : j11, (i10 & 16) != 0 ? 0.0d : d10, null);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f99019r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f99020s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f99021t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f99023v;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f99021t = obj;
            this.f99023v |= Integer.MIN_VALUE;
            Object objQ = a.this.q(null, null, this);
            return objQ == pf.b.g() ? objQ : Result.a(objQ);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {
        final /* synthetic */ a A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f99024r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f99025s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f99026t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f99027u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f99028v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f99029w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f99030x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f99031y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ c f99032z;

        /* JADX INFO: renamed from: qd.a$k$a, reason: collision with other inner class name */
        static final class C1172a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1172a f99033f = new C1172a();

            C1172a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Cleanup is skipped due to empty eviction policy list";
            }
        }

        static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c.b f99034f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c.b bVar) {
                super(0);
                this.f99034f = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cleanup is skipped due not existing eviction policy (free space ");
                c.b bVar = this.f99034f;
                sb2.append(bVar != null ? Double.valueOf(bVar.a()) : null);
                sb2.append("%)");
                return sb2.toString();
            }
        }

        static final class c extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ File f99035f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(File file) {
                super(0);
                this.f99035f = file;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Remove from cache: " + this.f99035f.getName();
            }
        }

        static final class d extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t0 f99036f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(t0 t0Var) {
                super(0);
                this.f99036f = t0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Cleanup is finished, total removed count: " + this.f99036f.f93331b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(c cVar, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f99032z = cVar;
            this.A = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i(a aVar, File file) {
            Intrinsics.checkNotNullExpressionValue(file, "file");
            return aVar.C(file);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.f99032z, this.A, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01d5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0120 -> B:60:0x01cd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x013e -> B:49:0x0141). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 496
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: qd.a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f99037r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f99039t;

        l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f99037r = obj;
            this.f99039t |= Integer.MIN_VALUE;
            Object objU = a.this.u(null, this);
            return objU == pf.b.g() ? objU : Result.a(objU);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f99040r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f99041s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ List f99043u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(List list, Continuation continuation) {
            super(2, continuation);
            this.f99043u = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new m(this.f99043u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objV;
            Object obj2;
            Object objG = pf.b.g();
            int i10 = this.f99041s;
            if (i10 == 0) {
                kotlin.d.b(obj);
                a aVar = a.this;
                List list = this.f99043u;
                this.f99041s = 1;
                objV = aVar.v(list, this);
                if (objV != objG) {
                }
                return objG;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f99040r;
                kotlin.d.b(obj);
                objV = obj2;
                return Result.a(objV);
            }
            kotlin.d.b(obj);
            objV = ((Result) obj).l();
            File file = (File) (Result.i(objV) ? null : objV);
            if (file != null) {
                a aVar2 = a.this;
                if (td.b.g(file)) {
                    qd.d dVarY = aVar2.y();
                    this.f99040r = objV;
                    this.f99041s = 2;
                    Object objQ = dVarY.q(file, this);
                    if (objQ != objG) {
                        obj2 = objV;
                        obj = objQ;
                        objV = obj2;
                    }
                    return objG;
                }
                aVar2.y().g(file);
            }
            return Result.a(objV);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f99044r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f99046t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f99044r = obj;
            this.f99046t |= Integer.MIN_VALUE;
            Object objV = a.this.v(null, this);
            return objV == pf.b.g() ? objV : Result.a(objV);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f99047r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f99048s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f99049t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ a f99050u;

        /* JADX INFO: renamed from: qd.a$o$a, reason: collision with other inner class name */
        static final class C1173a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Pair f99051f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1173a(Pair pair) {
                super(0);
                this.f99051f = pair;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Return from cache: " + ((String) this.f99051f.getFirst());
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f99052r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f99053s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ a f99054t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ i f99055u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar, i iVar, Continuation continuation) {
                super(2, continuation);
                this.f99054t = aVar;
                this.f99055u = iVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(a.b bVar, Continuation continuation) {
                return ((b) create(bVar, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                b bVar = new b(this.f99054t, this.f99055u, continuation);
                bVar.f99053s = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objH;
                a.b bVar;
                Object objG = pf.b.g();
                int i10 = this.f99052r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    a.b bVar2 = (a.b) this.f99053s;
                    qd.d dVarY = this.f99054t.y();
                    File fileB = bVar2.b();
                    this.f99053s = bVar2;
                    this.f99052r = 1;
                    objH = dVarY.h(fileB, this);
                    if (objH == objG) {
                        return objG;
                    }
                    bVar = bVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (a.b) this.f99053s;
                    kotlin.d.b(obj);
                    objH = obj;
                }
                qd.c cVar = (qd.c) objH;
                if (cVar == null) {
                    return Unit.f93236a;
                }
                String strG = cVar.g();
                pd.r rVar = pd.r.f98251a;
                if (!rVar.g(strG)) {
                    strG = rVar.g(this.f99055u.c()) ? this.f99055u.c() : rVar.a(bVar.b());
                }
                this.f99054t.y().n(qd.c.b(cVar, null, strG, 0L, 0L, this.f99055u.d(), bVar.a(), null, null, 205, null));
                return Unit.f93236a;
            }
        }

        static final class c extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f99056f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a aVar) {
                super(1);
                this.f99056f = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Pair invoke(String mediaUrl) {
                Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
                File fileZ = this.f99056f.z(mediaUrl);
                if (fileZ != null) {
                    return new Pair(mediaUrl, fileZ);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(List list, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f99049t = list;
            this.f99050u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.f99049t, this.f99050u, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x010c, code lost:
        
            if (r15 == r0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01a0, code lost:
        
            if (r15 == r0) goto L63;
         */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0134 A[PHI: r1 r11 r15
  0x0134: PHI (r1v13 qd.a$c) = (r1v12 qd.a$c), (r1v22 qd.a$c) binds: [B:51:0x0131, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r11v3 qd.a$o) = (r11v2 qd.a$o), (r11v6 qd.a$o) binds: [B:51:0x0131, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r15v21 java.lang.Object) = (r15v20 java.lang.Object), (r15v0 java.lang.Object) binds: [B:51:0x0131, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x017b  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 424
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: qd.a.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99057r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ File f99059t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(File file, Continuation continuation) {
            super(2, continuation);
            this.f99059t = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new p(this.f99059t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f99057r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            qd.d dVarY = a.this.y();
            File file = this.f99059t;
            this.f99057r = 1;
            Object objH = dVarY.h(file, this);
            return objH == objG ? objG : objH;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99060r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f99062t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, Continuation continuation) {
            super(2, continuation);
            this.f99062t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new q(this.f99062t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f99060r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            a aVar = a.this;
            File fileZ = aVar.z(this.f99062t);
            if (fileZ == null) {
                return null;
            }
            this.f99060r = 1;
            Object objW = aVar.w(fileZ, this);
            return objW == objG ? objG : objW;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class r extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ File f99063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f99064g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(File file, Object obj) {
            super(0);
            this.f99063f = file;
            this.f99064g = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Hold media file " + this.f99063f.getName() + ", holder: " + this.f99064g;
        }
    }

    static final class s extends Lambda implements Function0 {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final qd.d invoke() {
            return new qd.d(a.this.f98977d, a.this.f98978e);
        }
    }

    static final class t extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final t f99066f = new t();

        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cleanup is triggered by cache started event";
        }
    }

    static final class u extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final u f99067f = new u();

        u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cleanup is triggered by low disk space event";
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99068r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ c f99070t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(c cVar, Continuation continuation) {
            super(2, continuation);
            this.f99070t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new v(this.f99070t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f99068r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                a aVar = a.this;
                c cVar = this.f99070t;
                this.f99068r = 1;
                if (aVar.s(cVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class w extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final w f99071f = new w();

        w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cleanup is triggered by new session event";
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99072r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ c f99074t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(c cVar, Continuation continuation) {
            super(2, continuation);
            this.f99074t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new x(this.f99074t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f99072r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                a aVar = a.this;
                c cVar = this.f99074t;
                this.f99072r = 1;
                if (aVar.s(cVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        long f99075r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f99076s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f99077t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ c f99079v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ List f99080w;

        /* JADX INFO: renamed from: qd.a$y$a, reason: collision with other inner class name */
        static final class C1174a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f99081f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1174a(List list) {
                super(0);
                this.f99081f = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Start picking best file from:\n" + CollectionsKt.joinToString$default(this.f99081f, IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, null, 62, null);
            }
        }

        static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f99082f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f99082f = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Download and score stat:\n" + CollectionsKt.joinToString$default(this.f99082f, IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, null, 62, null);
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f99083r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ a f99084s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f99085t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ long f99086u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a aVar, String str, long j10, Continuation continuation) {
                super(2, continuation);
                this.f99084s = aVar;
                this.f99085t = str;
                this.f99086u = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new c(this.f99084s, this.f99085t, this.f99086u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objC;
                Object objG = pf.b.g();
                int i10 = this.f99083r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    sd.a aVar = this.f99084s.f98975b;
                    String str = this.f99085t;
                    kotlin.time.b bVarG = kotlin.time.b.g(this.f99086u);
                    this.f99083r = 1;
                    objC = aVar.c(str, bVarG, this);
                    if (objC == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    objC = ((Result) obj).l();
                }
                return Result.a(objC);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(c cVar, List list, Continuation continuation) {
            super(2, continuation);
            this.f99079v = cVar;
            this.f99080w = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            y yVar = a.this.new y(this.f99079v, this.f99080w, continuation);
            yVar.f99077t = obj;
            return yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            e eVar;
            long j10;
            Object objG = pf.b.g();
            int i10 = this.f99076s;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f99077t;
                a.this.f98978e.a("MediaFileCacheManager", new C1174a(this.f99080w));
                e eVarA = this.f99079v.c().a();
                long jB = this.f99079v.b().b();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List list = this.f99080w;
                a aVar = a.this;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(eg.i.b(coroutineScope, null, null, new c(aVar, (String) it.next(), jB, null), 3, null));
                    arrayList = arrayList2;
                    jB = jB;
                    aVar = aVar;
                }
                this.f99077t = eVarA;
                this.f99075r = jElapsedRealtime;
                this.f99076s = 1;
                objA = eg.d.a(arrayList, this);
                if (objA == objG) {
                    return objG;
                }
                eVar = eVarA;
                j10 = jElapsedRealtime;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f99075r;
                eVar = (e) this.f99077t;
                kotlin.d.b(obj);
                objA = obj;
            }
            List list2 = this.f99080w;
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            for (Object obj2 : (Iterable) objA) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Object objL = ((Result) obj2).l();
                i iVar = null;
                if (Result.i(objL)) {
                    objL = null;
                }
                a.C1195a c1195a = (a.C1195a) objL;
                if (c1195a != null) {
                    String str = (String) list2.get(i11);
                    long jC = c1195a.c();
                    String strB = c1195a.b();
                    if (strB == null) {
                        strB = "";
                    }
                    String str2 = strB;
                    Long lA = c1195a.a();
                    iVar = new i(str, jC, str2, lA != null ? lA.longValue() : Long.MAX_VALUE, 0.0d, 16, null);
                }
                if (iVar != null) {
                    arrayList3.add(iVar);
                }
                i11 = i12;
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(i.b((i) it2.next(), null, 0L, null, 0L, eVar.b().b(kotlin.time.b.q(r8.d())) + eVar.a().b(r8.f()), 15, null));
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j10;
            if (arrayList4.isEmpty()) {
                String str3 = (String) CollectionsKt.first(this.f99080w);
                b.a aVar2 = kotlin.time.b.f93560c;
                return new i(str3, kotlin.time.c.t(jElapsedRealtime2, cg.b.f6838e), null, 0L, 0.0d, 28, null);
            }
            Iterator it3 = arrayList4.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it3.next();
            if (it3.hasNext()) {
                double dE = ((i) next).e();
                do {
                    Object next2 = it3.next();
                    double dE2 = ((i) next2).e();
                    if (Double.compare(dE, dE2) < 0) {
                        next = next2;
                        dE = dE2;
                    }
                } while (it3.hasNext());
            }
            i iVar2 = (i) next;
            a.this.f98978e.a("MediaFileCacheManager", new b(arrayList4));
            if (iVar2.e() > 1.0E-4d) {
                return iVar2;
            }
            Iterator it4 = arrayList4.iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next3 = it4.next();
            if (it4.hasNext()) {
                long jF = ((i) next3).f();
                do {
                    Object next4 = it4.next();
                    long jF2 = ((i) next4).f();
                    if (jF > jF2) {
                        next3 = next4;
                        jF = jF2;
                    }
                } while (it4.hasNext());
            }
            return (i) next3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class z extends Lambda implements Function0 {
        z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Holder stat:");
            Object obj = a.this.f98983j;
            a aVar = a.this;
            synchronized (obj) {
                try {
                    if (aVar.f98984k.isEmpty()) {
                        sb2.append("\n No active holds");
                    } else {
                        for (Map.Entry entry : aVar.f98984k.entrySet()) {
                            sb2.append("\nFile: " + ((String) entry.getKey()) + "\nHolders: [" + CollectionsKt.joinToString$default((Iterable) entry.getValue(), ", ", null, null, 0, null, null, 62, null) + ']');
                        }
                        Unit unit = Unit.f93236a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }
    }

    static {
        C1171a c1171a = new C1171a(true, true, true);
        b.a aVar = kotlin.time.b.f93560c;
        f98973m = new c(c1171a, new d(kotlin.time.c.s(10, cg.b.f6839f), kotlin.time.c.s(10, cg.b.f6840g), null), new g(new e(new h(500L, 0.8d), new h(5242880L, 0.4d)), CollectionsKt.listOf(new f(0.1d, 0.0d, 1.0d, new h(kotlin.time.b.q(kotlin.time.c.s(3, cg.b.f6842i)), 1.0d), new h(0L, 0.0d), new h(0L, 0.0d), new h(0L, 0.0d)))));
    }

    public a(File cacheDir, sd.a downloadManager, td.c storageSpaceMonitor, pd.x dispatchers, ud.b logger) {
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(storageSpaceMonitor, "storageSpaceMonitor");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f98974a = cacheDir;
        this.f98975b = downloadManager;
        this.f98976c = storageSpaceMonitor;
        this.f98977d = dispatchers;
        this.f98978e = logger;
        this.f98979f = lf.i.a(new a0());
        this.f98980g = f98973m;
        this.f98981h = lf.i.a(new s());
        this.f98982i = ng.f.b(false, 1, null);
        this.f98983j = new Object();
        this.f98984k = new LinkedHashMap();
    }

    private final CoroutineScope A() {
        return (CoroutineScope) this.f98979f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C(File file) {
        return StringsKt.y0(uf.i.y(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D(File file) {
        boolean z10;
        synchronized (this.f98983j) {
            z10 = this.f98984k.get(file.getPath()) != null;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(Continuation continuation) {
        c cVar = this.f98980g;
        if (!cVar.a().a()) {
            return Unit.f93236a;
        }
        this.f98978e.a("MediaFileCacheManager", t.f99066f);
        Object objS = s(cVar, continuation);
        return objS == pf.b.g() ? objS : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(c cVar, List list, Continuation continuation) {
        return eg.g.g(this.f98977d.e(), new y(cVar, list, null), continuation);
    }

    private final void I() {
        this.f98978e.a("MediaFileCacheManager", new z());
    }

    private final Object K(CoroutineContext coroutineContext, Mutex mutex, Function2 function2, Continuation continuation) {
        return eg.g.g(coroutineContext, new c0(mutex, function2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(sd.a.c r7, kotlin.jvm.functions.Function2 r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qd.a.q(sd.a$c, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object r(a aVar, a.c cVar, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        return aVar.q(cVar, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(c cVar, Continuation continuation) {
        Object objK = K(this.f98977d.e(), this.f98982i, new k(cVar, this, null), continuation);
        return objK == pf.b.g() ? objK : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(java.util.List r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qd.a.n
            if (r0 == 0) goto L13
            r0 = r7
            qd.a$n r0 = (qd.a.n) r0
            int r1 = r0.f99046t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99046t = r1
            goto L18
        L13:
            qd.a$n r0 = new qd.a$n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f99044r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f99046t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r7)
            pd.x r7 = r5.f98977d
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.e()
            qd.a$o r2 = new qd.a$o
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.f99046t = r3
            java.lang.Object r7 = eg.g.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qd.a.v(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qd.d y() {
        return (qd.d) this.f98981h.getValue();
    }

    public final void B(File mediaFile, Object holder) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f98978e.a("MediaFileCacheManager", new r(mediaFile, holder));
        synchronized (this.f98983j) {
            try {
                Set linkedHashSet = (Set) this.f98984k.get(mediaFile.getPath());
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    Map map = this.f98984k;
                    String path = mediaFile.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "mediaFile.path");
                    map.put(path, linkedHashSet);
                }
                linkedHashSet.add(holder);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        I();
    }

    public final void F() {
        c cVar = this.f98980g;
        if (cVar.a().b()) {
            this.f98978e.a("MediaFileCacheManager", u.f99067f);
            eg.i.d(A(), null, null, new v(cVar, null), 3, null);
        }
    }

    public final void G() {
        c cVar = this.f98980g;
        if (cVar.a().c()) {
            this.f98978e.a("MediaFileCacheManager", w.f99071f);
            eg.i.d(A(), null, null, new x(cVar, null), 3, null);
        }
    }

    public final void J(Object holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f98978e.a("MediaFileCacheManager", new b0(holder));
        synchronized (this.f98983j) {
            try {
                for (String str : CollectionsKt.toList(this.f98984k.keySet())) {
                    Set set = (Set) this.f98984k.get(str);
                    if (set != null) {
                        set.remove(holder);
                    }
                    if (set != null && set.isEmpty()) {
                        this.f98984k.remove(str);
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        I();
    }

    public final void t(c configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f98980g = configuration;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(java.util.List r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qd.a.l
            if (r0 == 0) goto L13
            r0 = r7
            qd.a$l r0 = (qd.a.l) r0
            int r1 = r0.f99039t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99039t = r1
            goto L18
        L13:
            qd.a$l r0 = new qd.a$l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f99037r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f99039t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r7)
            pd.x r7 = r5.f98977d
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.e()
            qd.a$m r2 = new qd.a$m
            r4 = 0
            r2.<init>(r6, r4)
            r0.f99039t = r3
            java.lang.Object r7 = eg.g.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qd.a.u(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object w(File file, Continuation continuation) {
        return eg.g.g(this.f98977d.e(), new p(file, null), continuation);
    }

    public final Object x(String str, Continuation continuation) {
        return eg.g.g(this.f98977d.e(), new q(str, null), continuation);
    }

    public final File z(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return td.b.b(this.f98974a, url);
    }
}

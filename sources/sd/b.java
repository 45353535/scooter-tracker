package sd;

import android.content.Context;
import eg.m1;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.t0;
import kotlin.time.b;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import pd.x;
import sd.a;
import vd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements sd.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C1196b f99943k = new C1196b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f99944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function3 f99945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f99946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ud.b f99947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f99948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f99949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f99950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f99951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f99952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Deferred f99953j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends Lambda implements Function3 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f99954f = new a();

        a() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(Context context, File tempDownloadDir, ud.b logger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(tempDownloadDir, "tempDownloadDir");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new f(context, tempDownloadDir, logger);
        }
    }

    /* JADX INFO: renamed from: sd.b$b, reason: collision with other inner class name */
    public static final class C1196b {
        public /* synthetic */ C1196b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1196b() {
        }
    }

    public interface c {
        Object a(String str, kotlin.time.b bVar, Continuation continuation);

        Object b(String str, File file, kotlin.time.b bVar, Continuation continuation);
    }

    private static final class d implements g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CancellableContinuation f99955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Function2 f99956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function2 f99957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private vd.g f99958d;

        public d(CancellableContinuation continuation, Function2 successBuilder, Function2 errorBuilder) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            Intrinsics.checkNotNullParameter(successBuilder, "successBuilder");
            Intrinsics.checkNotNullParameter(errorBuilder, "errorBuilder");
            this.f99955a = continuation;
            this.f99956b = successBuilder;
            this.f99957c = errorBuilder;
        }

        @Override // vd.g.c
        public void a(vd.e networkError) {
            Intrinsics.checkNotNullParameter(networkError, "networkError");
            if (this.f99955a.isActive()) {
                CancellableContinuation cancellableContinuation = this.f99955a;
                Result.Companion companion = Result.f93230c;
                cancellableContinuation.resumeWith(Result.b(this.f99957c.invoke(this.f99958d, networkError)));
            }
        }

        public final void b(vd.g gVar) {
            this.f99958d = gVar;
        }

        @Override // vd.g.c
        public void onSuccess(Object obj) {
            if (this.f99955a.isActive()) {
                CancellableContinuation cancellableContinuation = this.f99955a;
                Result.Companion companion = Result.f93230c;
                cancellableContinuation.resumeWith(Result.b(this.f99956b.invoke(this.f99958d, obj)));
            }
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f99959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f99960b;

        public e(String url, String outputFilePath) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(outputFilePath, "outputFilePath");
            this.f99959a = url;
            this.f99960b = outputFilePath;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f99959a, eVar.f99959a) && Intrinsics.areEqual(this.f99960b, eVar.f99960b);
        }

        public int hashCode() {
            return (this.f99959a.hashCode() * 31) + this.f99960b.hashCode();
        }

        public String toString() {
            return "DownloadKey(url=" + this.f99959a + ", outputFilePath=" + this.f99960b + ')';
        }
    }

    public static final class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f99961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ud.b f99962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f99963c;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f99964r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f99965s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f99966t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f99967u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            /* synthetic */ Object f99968v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f99970x;

            a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f99968v = obj;
                this.f99970x |= Integer.MIN_VALUE;
                Object objB = f.this.b(null, null, null, this);
                return objB == pf.b.g() ? objB : Result.a(objB);
            }
        }

        /* JADX INFO: renamed from: sd.b$f$b, reason: collision with other inner class name */
        static final class C1197b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f99971f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1197b(String str) {
                super(0);
                this.f99971f = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Starting download " + this.f99971f;
            }
        }

        static final class c extends Lambda implements Function2 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f99973g;

            static final class a extends Lambda implements Function0 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ String f99974f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(String str) {
                    super(0);
                    this.f99974f = str;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Download success: " + this.f99974f;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str) {
                super(2);
                this.f99973g = str;
            }

            public final Object a(vd.g gVar, File file) {
                f.this.f99962b.a("DownloadManager", new a(this.f99973g));
                kotlin.time.b bVarG = gVar != null ? gVar.g() : null;
                if (file == null || bVarG == null) {
                    return Result.b(null);
                }
                Result.Companion companion = Result.f93230c;
                return Result.b(new a.b(bVarG.N(), file, null));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Result.a(a((vd.g) obj, (File) obj2));
            }
        }

        static final class d extends Lambda implements Function2 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f99976g;

            static final class a extends Lambda implements Function0 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ vd.e f99977f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ String f99978g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(vd.e eVar, String str) {
                    super(0);
                    this.f99977f = eVar;
                    this.f99978g = str;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Download failed (" + this.f99977f.a().getMessage() + "): " + this.f99978g;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(String str) {
                super(2);
                this.f99976g = str;
            }

            public final Object a(vd.g gVar, vd.e networkError) {
                Intrinsics.checkNotNullParameter(networkError, "networkError");
                f.this.f99962b.b("DownloadManager", new a(networkError, this.f99976g));
                Result.Companion companion = Result.f93230c;
                return Result.b(kotlin.d.a(networkError.a()));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Result.a(a((vd.g) obj, (vd.e) obj2));
            }
        }

        static final class e extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f99979r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f99980s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f99981t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f99983v;

            e(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f99981t = obj;
                this.f99983v |= Integer.MIN_VALUE;
                Object objA = f.this.a(null, null, this);
                return objA == pf.b.g() ? objA : Result.a(objA);
            }
        }

        /* JADX INFO: renamed from: sd.b$f$f, reason: collision with other inner class name */
        static final class C1198f extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1198f f99984f = new C1198f();

            C1198f() {
                super(2);
            }

            public final Object a(vd.g gVar, Map map) {
                long jS;
                kotlin.time.b bVarG;
                Result.Companion companion = Result.f93230c;
                if (gVar == null || (bVarG = gVar.g()) == null) {
                    b.a aVar = kotlin.time.b.f93560c;
                    jS = kotlin.time.c.s(0, cg.b.f6838e);
                } else {
                    jS = bVarG.N();
                }
                if (map == null) {
                    map = MapsKt.emptyMap();
                }
                return Result.b(new a.C1195a(jS, map, null));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Result.a(a((vd.g) obj, (Map) obj2));
            }
        }

        static final class g extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final g f99985f = new g();

            g() {
                super(2);
            }

            public final Object a(vd.g gVar, vd.e networkError) {
                Intrinsics.checkNotNullParameter(networkError, "networkError");
                Result.Companion companion = Result.f93230c;
                return Result.b(kotlin.d.a(networkError.a()));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Result.a(a((vd.g) obj, (vd.e) obj2));
            }
        }

        public f(Context context, File tempDownloadDir, ud.b logger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(tempDownloadDir, "tempDownloadDir");
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.f99961a = tempDownloadDir;
            this.f99962b = logger;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.f99963c = applicationContext;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sd.b.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(java.lang.String r8, kotlin.time.b r9, kotlin.coroutines.Continuation r10) {
            /*
                r7 = this;
                boolean r0 = r10 instanceof sd.b.f.e
                if (r0 == 0) goto L13
                r0 = r10
                sd.b$f$e r0 = (sd.b.f.e) r0
                int r1 = r0.f99983v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f99983v = r1
                goto L18
            L13:
                sd.b$f$e r0 = new sd.b$f$e
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f99981t
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f99983v
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.f99980s
                kotlin.time.b r8 = (kotlin.time.b) r8
                java.lang.Object r8 = r0.f99979r
                java.lang.String r8 = (java.lang.String) r8
                kotlin.d.b(r10)
                goto L9a
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                kotlin.d.b(r10)
                r0.f99979r = r8
                r0.f99980s = r9
                r0.f99983v = r3
                kotlinx.coroutines.e r10 = new kotlinx.coroutines.e
                kotlin.coroutines.Continuation r2 = pf.b.d(r0)
                r10.<init>(r2, r3)
                r10.I()
                sd.b$d r2 = new sd.b$d
                sd.b$f$f r4 = sd.b.f.C1198f.f99984f
                sd.b$f$g r5 = sd.b.f.g.f99985f
                r2.<init>(r10, r4, r5)
                vd.g$a r4 = new vd.g$a
                vd.d r5 = vd.d.Head
                r4.<init>(r8, r5)
                vd.b r8 = new vd.b
                r8.<init>()
                vd.g$a r8 = r4.c(r8)
                vd.g$a r8 = r8.b(r2)
                r4 = 0
                if (r9 == 0) goto L7b
                long r5 = r9.N()
                long r5 = kotlin.time.b.q(r5)
                java.lang.Long r9 = kotlin.coroutines.jvm.internal.b.e(r5)
                goto L7c
            L7b:
                r9 = r4
            L7c:
                vd.g$a r8 = r8.d(r9)
                vd.g r8 = r8.a()
                r2.b(r8)
                vd.g.r(r8, r4, r3, r4)
                java.lang.Object r10 = r10.C()
                java.lang.Object r8 = pf.b.g()
                if (r10 != r8) goto L97
                kotlin.coroutines.jvm.internal.g.c(r0)
            L97:
                if (r10 != r1) goto L9a
                return r1
            L9a:
                kotlin.Result r10 = (kotlin.Result) r10
                java.lang.Object r8 = r10.l()
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.b.f.a(java.lang.String, kotlin.time.b, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sd.b.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(java.lang.String r8, java.io.File r9, kotlin.time.b r10, kotlin.coroutines.Continuation r11) {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.b.f.b(java.lang.String, java.io.File, kotlin.time.b, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99986r;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t0 f99988f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t0 t0Var) {
                super(1);
                this.f99988f = t0Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File it) {
                Intrinsics.checkNotNullParameter(it, "it");
                boolean zIsFile = it.isFile();
                if (zIsFile) {
                    this.f99988f.f93331b++;
                }
                return Boolean.valueOf(zIsFile);
            }
        }

        /* JADX INFO: renamed from: sd.b$g$b, reason: collision with other inner class name */
        static final class C1199b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t0 f99989f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1199b(t0 t0Var) {
                super(0);
                this.f99989f = t0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Cleanup unused files completed, removed count: " + this.f99989f.f93331b;
            }
        }

        g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f99986r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            t0 t0Var = new t0();
            td.b.e(b.this.f99944a, new a(t0Var));
            b.this.f99947d.a("DownloadManager", new C1199b(t0Var));
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class h extends Lambda implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return (c) b.this.f99945b.invoke(b.this.f99948e, b.this.f99944a, b.this.f99947d);
        }
    }

    static final class i extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f99991f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(0);
            this.f99991f = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Active download detected: " + this.f99991f;
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f99992r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f99994t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f99992r = obj;
            this.f99994t |= Integer.MIN_VALUE;
            Object objC = b.this.c(null, null, this);
            return objC == pf.b.g() ? objC : Result.a(objC);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99995r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f99997t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlin.time.b f99998u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, kotlin.time.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f99997t = str;
            this.f99998u = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new k(this.f99997t, this.f99998u, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.f99995r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.d.b(r5)
                kotlin.Result r5 = (kotlin.Result) r5
                java.lang.Object r5 = r5.l()
                goto L45
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L20:
                kotlin.d.b(r5)
                goto L32
            L24:
                kotlin.d.b(r5)
                sd.b r5 = sd.b.this
                r4.f99995r = r3
                java.lang.Object r5 = r5.n(r4)
                if (r5 != r0) goto L32
                goto L44
            L32:
                sd.b r5 = sd.b.this
                sd.b$c r5 = sd.b.g(r5)
                java.lang.String r1 = r4.f99997t
                kotlin.time.b r3 = r4.f99998u
                r4.f99995r = r2
                java.lang.Object r5 = r5.a(r1, r3, r4)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Result r5 = kotlin.Result.a(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.b.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99999r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f100001t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ File f100002u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ kotlin.time.b f100003v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ e f100004w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, File file, kotlin.time.b bVar, e eVar, Continuation continuation) {
            super(2, continuation);
            this.f100001t = str;
            this.f100002u = file;
            this.f100003v = bVar;
            this.f100004w = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new l(this.f100001t, this.f100002u, this.f100003v, this.f100004w, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.f99999r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.d.b(r6)
                kotlin.Result r6 = (kotlin.Result) r6
                java.lang.Object r6 = r6.l()
                goto L47
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                kotlin.d.b(r6)
                goto L32
            L24:
                kotlin.d.b(r6)
                sd.b r6 = sd.b.this
                r5.f99999r = r3
                java.lang.Object r6 = r6.n(r5)
                if (r6 != r0) goto L32
                goto L46
            L32:
                sd.b r6 = sd.b.this
                sd.b$c r6 = sd.b.g(r6)
                java.lang.String r1 = r5.f100001t
                java.io.File r3 = r5.f100002u
                kotlin.time.b r4 = r5.f100003v
                r5.f99999r = r2
                java.lang.Object r6 = r6.b(r1, r3, r4, r5)
                if (r6 != r0) goto L47
            L46:
                return r0
            L47:
                boolean r0 = kotlin.Result.i(r6)
                if (r0 == 0) goto L4f
                r0 = 0
                goto L50
            L4f:
                r0 = r6
            L50:
                sd.a$b r0 = (sd.a.b) r0
                sd.b r1 = sd.b.this
                java.lang.Object r1 = sd.b.e(r1)
                sd.b r2 = sd.b.this
                sd.b$e r3 = r5.f100004w
                monitor-enter(r1)
                java.util.Map r2 = sd.b.d(r2)     // Catch: java.lang.Throwable -> L9d
                java.lang.Object r2 = r2.remove(r3)     // Catch: java.lang.Throwable -> L9d
                sd.a$c r2 = (sd.a.c) r2     // Catch: java.lang.Throwable -> L9d
                monitor-exit(r1)
                if (r0 == 0) goto L6f
                java.lang.Object r6 = kotlin.Result.b(r0)
                goto L98
            L6f:
                java.lang.Exception r0 = new java.lang.Exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to download content from url ("
                r1.append(r2)
                java.lang.String r2 = r5.f100001t
                r1.append(r2)
                r2 = 41
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.Throwable r6 = kotlin.Result.g(r6)
                r0.<init>(r1, r6)
                java.lang.Object r6 = kotlin.d.a(r0)
                java.lang.Object r6 = kotlin.Result.b(r6)
            L98:
                kotlin.Result r6 = kotlin.Result.a(r6)
                return r6
            L9d:
                r6 = move-exception
                monitor-exit(r1)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.b.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class m extends Lambda implements Function0 {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return kotlinx.coroutines.i.a(m1.b(null, 1, null).plus(b.this.f99946c.e()));
        }
    }

    public b(Context context, File tempDir, Function3 contentFetcherBuilder, x dispatchers, ud.b logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tempDir, "tempDir");
        Intrinsics.checkNotNullParameter(contentFetcherBuilder, "contentFetcherBuilder");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f99944a = tempDir;
        this.f99945b = contentFetcherBuilder;
        this.f99946c = dispatchers;
        this.f99947d = logger;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f99948e = applicationContext;
        this.f99949f = lf.i.a(new m());
        this.f99950g = lf.i.a(new h());
        this.f99951h = new Object();
        this.f99952i = new LinkedHashMap();
        this.f99953j = l();
    }

    private final Deferred l() {
        return eg.i.b(p(), this.f99946c.e(), null, new g(null), 2, null);
    }

    private final e m(String str, File file) {
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "outputFile.path");
        return new e(str, path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c o() {
        return (c) this.f99950g.getValue();
    }

    private final CoroutineScope p() {
        return (CoroutineScope) this.f99949f.getValue();
    }

    private final Deferred q(e eVar, String str, File file, kotlin.time.b bVar) {
        return eg.i.b(p(), null, null, new l(str, file, bVar, eVar, null), 3, null);
    }

    @Override // sd.a
    public a.c a(String url, File outputFile, kotlin.time.b bVar) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        synchronized (this.f99951h) {
            e eVarM = m(url, outputFile);
            a.c cVar = (a.c) this.f99952i.get(eVarM);
            if (cVar != null) {
                this.f99947d.a("DownloadManager", new i(url));
                return cVar;
            }
            a.c cVar2 = new a.c(url, q(eVarM, url, outputFile, bVar));
            this.f99952i.put(eVarM, cVar2);
            return cVar2;
        }
    }

    @Override // sd.a
    public a.c b(String url, File outputFile) {
        a.c cVar;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        synchronized (this.f99951h) {
            cVar = (a.c) this.f99952i.get(m(url, outputFile));
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r6, kotlin.time.b r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof sd.b.j
            if (r0 == 0) goto L13
            r0 = r8
            sd.b$j r0 = (sd.b.j) r0
            int r1 = r0.f99994t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99994t = r1
            goto L18
        L13:
            sd.b$j r0 = new sd.b$j
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f99992r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f99994t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r8)
            pd.x r8 = r5.f99946c
            kotlinx.coroutines.CoroutineDispatcher r8 = r8.e()
            sd.b$k r2 = new sd.b$k
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f99994t = r3
            java.lang.Object r8 = eg.g.g(r8, r2, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.b.c(java.lang.String, kotlin.time.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object n(Continuation continuation) {
        Object objAwait = this.f99953j.await(continuation);
        return objAwait == pf.b.g() ? objAwait : Unit.f93236a;
    }

    public /* synthetic */ b(Context context, File file, Function3 function3, x xVar, ud.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, file, (i10 & 4) != 0 ? a.f99954f : function3, (i10 & 8) != 0 ? x.f98252g.a() : xVar, (i10 & 16) != 0 ? ud.a.f105618a.a() : bVar);
    }
}

package f1;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class qf implements kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f70858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f70859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f70860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f70861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f70862e;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Lazy f70863f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lazy lazy) {
            super(0);
            this.f70863f = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ud invoke() {
            u uVarG = ((ga) ((z6) this.f70863f.getValue()).b().get()).g();
            return new ud(uVarG.c(), uVarG.f());
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Lazy f70864f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ qf f70865g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Lazy f70866h;

        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ qf f70867f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qf qfVar) {
                super(0);
                this.f70867f = qfVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final ud invoke() {
                return this.f70867f.b();
            }
        }

        /* JADX INFO: renamed from: f1.qf$b$b, reason: collision with other inner class name */
        public static final class C0877b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Lazy f70868f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0877b(Lazy lazy) {
                super(0);
                this.f70868f = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final g2 invoke() {
                return ((z6) this.f70868f.getValue()).u();
            }
        }

        public static final class c extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Lazy f70869f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Lazy lazy) {
                super(0);
                this.f70869f = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final u invoke() {
                return ((ga) ((z6) this.f70869f.getValue()).b().get()).g();
            }
        }

        public static final class d extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ qf f70870f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(qf qfVar) {
                super(0);
                this.f70870f = qfVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final u4 invoke() {
                return this.f70870f.e();
            }
        }

        public static final class e extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ qf f70871f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(qf qfVar) {
                super(0);
                this.f70871f = qfVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final h2 invoke() {
                return this.f70871f.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Lazy lazy, qf qfVar, Lazy lazy2) {
            super(0);
            this.f70864f = lazy;
            this.f70865g = qfVar;
            this.f70866h = lazy2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final l invoke() {
            Lazy lazyA = lf.i.a(new a(this.f70865g));
            Lazy lazyA2 = lf.i.a(new C0877b(this.f70866h));
            return new l(lf.i.a(new c(this.f70866h)), lazyA, lazyA2, this.f70864f, lf.i.a(new d(this.f70865g)), lf.i.a(new e(this.f70865g)));
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f70872f = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final jg invoke() {
            return new jg(null, 1, null);
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Lazy f70873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ qf f70874g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Lazy lazy, qf qfVar) {
            super(0);
            this.f70873f = lazy;
            this.f70874g = qfVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final h2 invoke() {
            return new h2(((j4) this.f70873f.getValue()).h(), this.f70874g.c(), null, 4, null);
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Lazy f70875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ qf f70876g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Lazy lazy, qf qfVar) {
            super(0);
            this.f70875f = lazy;
            this.f70876g = qfVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final u4 invoke() {
            return new u4(((z6) this.f70875f.getValue()).g(), this.f70876g.d(), null, this.f70876g.a(), ((z6) this.f70875f.getValue()).k().f(), 4, null);
        }
    }

    public qf(Lazy androidComponent, Lazy applicationComponent, Lazy privacyApi) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        this.f70858a = lf.i.a(new b(privacyApi, this, applicationComponent));
        this.f70859b = lf.i.a(new a(applicationComponent));
        this.f70860c = lf.i.a(new d(androidComponent, this));
        this.f70861d = lf.i.a(c.f70872f);
        this.f70862e = lf.i.a(new e(applicationComponent, this));
    }

    @Override // f1.kd
    public ag a() {
        return (ag) this.f70858a.getValue();
    }

    public ud b() {
        return (ud) this.f70859b.getValue();
    }

    public jg c() {
        return (jg) this.f70861d.getValue();
    }

    public h2 d() {
        return (h2) this.f70860c.getValue();
    }

    public u4 e() {
        return (u4) this.f70862e.getValue();
    }
}

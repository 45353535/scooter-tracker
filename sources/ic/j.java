package ic;

import eg.o0;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f74267i = new e(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final j f74268j = new j(a.f74277f, b.f74278f, c.f74279f, d.f74280f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f74269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f74270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f74271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function0 f74272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f74273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f74274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f74275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f74276h;

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f74277f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return o0.c();
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f74278f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return o0.c().w();
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f74279f = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return o0.b();
        }
    }

    static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f74280f = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return o0.a();
        }
    }

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.f74268j;
        }

        private e() {
        }
    }

    static final class f extends Lambda implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) j.this.f74272d.invoke();
        }
    }

    static final class g extends Lambda implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) j.this.f74271c.invoke();
        }
    }

    static final class h extends Lambda implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) j.this.f74269a.invoke();
        }
    }

    static final class i extends Lambda implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) j.this.f74270b.invoke();
        }
    }

    public j(Function0 mainProvider, Function0 mainImmediateProvider, Function0 ioProvider, Function0 defaultProvider) {
        Intrinsics.checkNotNullParameter(mainProvider, "mainProvider");
        Intrinsics.checkNotNullParameter(mainImmediateProvider, "mainImmediateProvider");
        Intrinsics.checkNotNullParameter(ioProvider, "ioProvider");
        Intrinsics.checkNotNullParameter(defaultProvider, "defaultProvider");
        this.f74269a = mainProvider;
        this.f74270b = mainImmediateProvider;
        this.f74271c = ioProvider;
        this.f74272d = defaultProvider;
        this.f74273e = lf.i.a(new h());
        this.f74274f = lf.i.a(new i());
        this.f74275g = lf.i.a(new g());
        this.f74276h = lf.i.a(new f());
    }

    public static final j j() {
        return f74267i.a();
    }

    public final CoroutineDispatcher d() {
        return (CoroutineDispatcher) this.f74276h.getValue();
    }

    public final CoroutineDispatcher f() {
        return (CoroutineDispatcher) this.f74275g.getValue();
    }

    public final CoroutineDispatcher h() {
        return (CoroutineDispatcher) this.f74273e.getValue();
    }

    public final CoroutineDispatcher i() {
        return (CoroutineDispatcher) this.f74274f.getValue();
    }
}

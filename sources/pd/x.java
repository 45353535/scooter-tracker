package pd;

import eg.o0;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f98252g = new d(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final x f98253h = new x(a.f98260f, b.f98261f, c.f98262f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f98254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f98255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f98256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f98257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f98258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f98259f;

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f98260f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineDispatcher invoke() {
            return o0.c();
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f98261f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineDispatcher invoke() {
            return o0.b();
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f98262f = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineDispatcher invoke() {
            return o0.a();
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a() {
            return x.f98253h;
        }

        private d() {
        }
    }

    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) x.this.f98256c.invoke();
        }
    }

    static final class f extends Lambda implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) x.this.f98255b.invoke();
        }
    }

    static final class g extends Lambda implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) x.this.f98254a.invoke();
        }
    }

    public x(Function0 mainProvider, Function0 ioProvider, Function0 defaultProvider) {
        Intrinsics.checkNotNullParameter(mainProvider, "mainProvider");
        Intrinsics.checkNotNullParameter(ioProvider, "ioProvider");
        Intrinsics.checkNotNullParameter(defaultProvider, "defaultProvider");
        this.f98254a = mainProvider;
        this.f98255b = ioProvider;
        this.f98256c = defaultProvider;
        this.f98257d = lf.i.a(new g());
        this.f98258e = lf.i.a(new f());
        this.f98259f = lf.i.a(new e());
    }

    public final CoroutineDispatcher e() {
        return (CoroutineDispatcher) this.f98258e.getValue();
    }

    public final CoroutineDispatcher f() {
        return (CoroutineDispatcher) this.f98257d.getValue();
    }
}

package io.bidmachine.analytics.internal.a;

import eg.o0;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import lf.i;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0947d f79505g = new C0947d(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d f79506h = new d(a.f79513a, b.f79514a, c.f79515a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f79507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f79508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f79509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f79510d = i.a(new g());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f79511e = i.a(new f());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f79512f = i.a(new e());

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79513a = new a();

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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f79514a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return o0.b();
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f79515a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return o0.a();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.a.d$d, reason: collision with other inner class name */
    public static final class C0947d {
        public /* synthetic */ C0947d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return d.f79506h;
        }

        private C0947d() {
        }
    }

    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) d.this.f79509c.invoke();
        }
    }

    static final class f extends Lambda implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) d.this.f79508b.invoke();
        }
    }

    static final class g extends Lambda implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) d.this.f79507a.invoke();
        }
    }

    public d(Function0 function0, Function0 function02, Function0 function03) {
        this.f79507a = function0;
        this.f79508b = function02;
        this.f79509c = function03;
    }

    public final CoroutineDispatcher b() {
        return (CoroutineDispatcher) this.f79512f.getValue();
    }

    public final CoroutineDispatcher c() {
        return (CoroutineDispatcher) this.f79511e.getValue();
    }
}

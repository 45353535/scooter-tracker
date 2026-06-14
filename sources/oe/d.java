package oe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ze.a f96741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ze.a f96742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final pe.b f96743c;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96744r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f96745s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96746t;

        a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(re.d dVar, ye.c cVar, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f96745s = dVar;
            aVar.f96746t = cVar;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f96744r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            re.d dVar = (re.d) this.f96745s;
            androidx.privacysandbox.ads.adservices.topics.a.a(dVar.c().a(d.f96741a));
            return null;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96747r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f96748s;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(se.c cVar, Continuation continuation) {
            return ((b) create(cVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f96748s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f96747r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            androidx.privacysandbox.ads.adservices.topics.a.a(((se.c) this.f96748s).p().d().getAttributes().a(d.f96742b));
            return null;
        }
    }

    static {
        KType kTypeO;
        KClass kClassB = kotlin.jvm.internal.v0.b(ke.a.class);
        KType kTypeO2 = null;
        try {
            kTypeO = kotlin.jvm.internal.v0.o(ke.a.class);
        } catch (Throwable unused) {
            kTypeO = null;
        }
        f96741a = new ze.a("UploadProgressListenerAttributeKey", new ff.a(kClassB, kTypeO));
        KClass kClassB2 = kotlin.jvm.internal.v0.b(ke.a.class);
        try {
            kTypeO2 = kotlin.jvm.internal.v0.o(ke.a.class);
        } catch (Throwable unused2) {
        }
        f96742b = new ze.a("DownloadProgressListenerAttributeKey", new ff.a(kClassB2, kTypeO2));
        f96743c = pe.i.c("BodyProgress", new Function1() { // from class: oe.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.b((pe.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(pe.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.f(oe.b.f96711a, new a(null));
        createClientPlugin.f(oe.a.f96691a, new b(null));
        return Unit.f93236a;
    }

    public static final pe.b e() {
        return f96743c;
    }
}

package oe;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ze.a f96862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ze.a f96863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f96864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final pe.b f96865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final pe.b f96866e;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f96867r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f96868s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f96869t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f96870u;

        a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, se.c cVar, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f96869t = eVar;
            aVar.f96870u = cVar;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(3:6|41|42)(2:7|8))(3:9|53|10))(2:14|(4:16|(1:18)|19|20)(6:55|21|(1:23)|26|(1:29)|40))|30|51|31|35|(1:37)|38) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
        
            r4 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
        
            r6 = kotlin.Result.f93230c;
            r4 = kotlin.Result.b(kotlin.d.a(r4));
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
        
            if (r5.e(r11, r10) == r0) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.y implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f96871b = new b();

        b() {
            super(0, g1.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final g1 invoke() {
            return new g1();
        }
    }

    static {
        KType kTypeO;
        KClass kClassB = kotlin.jvm.internal.v0.b(Unit.class);
        KType kTypeO2 = null;
        try {
            kTypeO = kotlin.jvm.internal.v0.o(Unit.class);
        } catch (Throwable unused) {
            kTypeO = null;
        }
        f96862a = new ze.a("SkipSaveBody", new ff.a(kClassB, kTypeO));
        KClass kClassB2 = kotlin.jvm.internal.v0.b(Unit.class);
        try {
            kTypeO2 = kotlin.jvm.internal.v0.o(Unit.class);
        } catch (Throwable unused2) {
        }
        f96863b = new ze.a("ResponseBodySaved", new ff.a(kClassB2, kTypeO2));
        f96864c = lf.i.a(new Function0() { // from class: oe.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.d();
            }
        });
        f96865d = pe.i.c("SaveBody", new Function1() { // from class: oe.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.e((pe.d) obj);
            }
        });
        f96866e = pe.i.b("DoubleReceivePlugin", b.f96871b, new Function1() { // from class: oe.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.f((pe.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.d d() {
        return df.a.a("io.ktor.client.plugins.SaveBody");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(pe.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.b().q().l(se.b.f100014g.b(), new a(null));
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(pe.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        if (((g1) createClientPlugin.e()).a()) {
            j().n("It is no longer possible to disable body saving for all requests. Use client.prepareRequest(...).execute { ... } syntax to prevent saving the body in memory.\n\nThis API is deprecated and will be removed in Ktor 4.0.0\nIf you were relying on this functionality, share your use case by commenting on this issue: https://youtrack.jetbrains.com/issue/KTOR-8367/");
        } else {
            j().n("The SaveBodyPlugin plugin is deprecated and can be safely removed. Request bodies are now saved in memory by default for all non-streaming responses.");
        }
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.d j() {
        return (yh.d) f96864c.getValue();
    }

    public static final pe.b k() {
        return f96865d;
    }

    public static final boolean l(se.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.p().getAttributes().g(f96863b);
    }
}

package oe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ze.a f96782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final yh.d f96783b;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f96784r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f96785s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f96786t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f96787u;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(se.c cVar, Continuation continuation) {
            return ((a) create(cVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f96787u = obj;
            return aVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(8:6|56|7|30|34|(2:39|(1:(1:48)(1:47))(1:43))(1:38)|49|50)(2:9|10))(1:11))(2:12|(2:14|15)(2:16|(2:51|52)(3:21|(1:24)|28)))|25|54|26|(6:29|30|34|(2:39|(1:(2:45|48)(0))(0))(0)|49|50)|28) */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
        
            r0 = r1;
            r3 = r5;
            r1 = r11;
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        KType kTypeO;
        KClass kClassB = kotlin.jvm.internal.v0.b(Unit.class);
        try {
            kTypeO = kotlin.jvm.internal.v0.o(Unit.class);
        } catch (Throwable unused) {
            kTypeO = null;
        }
        f96782a = new ze.a("ValidateMark", new ff.a(kClassB, kTypeO));
        f96783b = df.a.a("io.ktor.client.plugins.DefaultResponseValidation");
    }

    public static final void d(final ie.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        t.f(iVar, new Function1() { // from class: oe.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.e(iVar, (r) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(ie.i iVar, r HttpResponseValidator) {
        Intrinsics.checkNotNullParameter(HttpResponseValidator, "$this$HttpResponseValidator");
        HttpResponseValidator.d(iVar.h());
        HttpResponseValidator.e(new a(null));
        return Unit.f93236a;
    }
}

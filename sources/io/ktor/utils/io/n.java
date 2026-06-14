package io.ktor.utils.io;

import eg.p0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f82182a = new a();

    public static final class a implements Continuation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CoroutineContext f82183b = kotlin.coroutines.e.f93267b;

        a() {
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.f82183b;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.y implements Function1 {
        b(Object obj) {
            super(1, obj, k.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((k) this.receiver).e(continuation);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82184r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f82185s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f82186t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function2 f82187u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.a f82188v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function2 function2, io.ktor.utils.io.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f82187u = function2;
            this.f82188v = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f82187u, this.f82188v, continuation);
            cVar.f82186t = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:29:0x008d, B:31:0x009e, B:26:0x006d), top: B:68:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v9, types: [eg.s, kotlinx.coroutines.Job] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 344
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.n.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final void b(k kVar, Throwable th2) throws Throwable {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (th2 == null) {
            c(new b(kVar));
        } else {
            kVar.a(th2);
        }
    }

    public static final void c(Function1 function1) throws Throwable {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        kg.a.c(function1, f82182a);
    }

    public static final p0 d(o oVar, Function1 block) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return oVar.a().q(block);
    }

    public static final Object e(k kVar, byte b10, Continuation continuation) {
        kVar.f().F(b10);
        Object objA = l.a(kVar, continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public static final h0 f(CoroutineScope coroutineScope, CoroutineContext coroutineContext, final io.ktor.utils.io.a channel, Function2 block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        Job jobD = eg.i.d(coroutineScope, coroutineContext, null, new c(block, channel, null), 2, null);
        jobD.q(new Function1() { // from class: io.ktor.utils.io.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.i(channel, (Throwable) obj);
            }
        });
        return new h0(channel, jobD);
    }

    public static final h0 g(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z10, Function2 block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return f(coroutineScope, coroutineContext, new io.ktor.utils.io.a(false, 1, null), block);
    }

    public static /* synthetic */ h0 h(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return g(coroutineScope, coroutineContext, z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(io.ktor.utils.io.a aVar, Throwable th2) {
        if (th2 != null && !aVar.o()) {
            aVar.a(th2);
        }
        return Unit.f93236a;
    }
}

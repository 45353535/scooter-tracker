package oe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements pe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f96816a = new k1();

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96817r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f96818s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function3 f96819t;

        /* JADX INFO: renamed from: oe.k1$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1116a extends kotlin.jvm.internal.a implements Function1 {
            C1116a(Object obj) {
                super(1, obj, ef.e.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return a.j((ef.e) this.receiver, continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function3 function3, Continuation continuation) {
            super(3, continuation);
            this.f96819t = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object j(ef.e eVar, Continuation continuation) {
            Object objD = eVar.d(continuation);
            return objD == pf.b.g() ? objD : Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, Object obj, Continuation continuation) {
            a aVar = new a(this.f96819t, continuation);
            aVar.f96818s = eVar;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f96817r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ef.e eVar = (ef.e) this.f96818s;
                Function3 function3 = this.f96819t;
                Object objB = eVar.b();
                C1116a c1116a = new C1116a(eVar);
                this.f96817r = 1;
                if (function3.invoke(objB, c1116a, this) == objG) {
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
    }

    private k1() {
    }

    @Override // pe.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(ie.c client, Function3 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.s().l(re.g.f99440g.a(), new a(handler, null));
    }
}

package pe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements pe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f98295a = new n();

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f98296r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f98297s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function2 f98298t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, Continuation continuation) {
            super(3, continuation);
            this.f98298t = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, Object obj, Continuation continuation) {
            a aVar = new a(this.f98298t, continuation);
            aVar.f98297s = eVar;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f98296r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ef.e eVar = (ef.e) this.f98297s;
                Function2 function2 = this.f98298t;
                Object objB = eVar.b();
                this.f98296r = 1;
                if (function2.invoke(objB, this) == objG) {
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

    private n() {
    }

    @Override // pe.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(ie.c client, Function2 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.s().l(re.g.f99440g.a(), new a(handler, null));
    }
}

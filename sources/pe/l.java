package pe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements pe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f98283a = new l();

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f98284r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f98285s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function4 f98286t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function4 function4, Continuation continuation) {
            super(3, continuation);
            this.f98286t = function4;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, Object obj, Continuation continuation) {
            a aVar = new a(this.f98286t, continuation);
            aVar.f98285s = eVar;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f98284r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ef.e eVar = (ef.e) this.f98285s;
                Function4 function4 = this.f98286t;
                k kVar = new k();
                Object objB = eVar.b();
                Object objC = eVar.c();
                this.f98284r = 1;
                if (function4.invoke(kVar, objB, objC, this) == objG) {
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

    private l() {
    }

    @Override // pe.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(ie.c client, Function4 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.s().l(re.g.f99440g.d(), new a(handler, null));
    }
}

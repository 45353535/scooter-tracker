package pe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oe.i1;
import oe.v0;
import oe.w;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements pe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f98287a = new m();

    public static final class a implements CoroutineScope {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i1 f98288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CoroutineContext f98289c;

        public a(i1 httpSendSender, CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(httpSendSender, "httpSendSender");
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            this.f98288b = httpSendSender;
            this.f98289c = coroutineContext;
        }

        public final Object a(re.d dVar, Continuation continuation) {
            return this.f98288b.a(dVar, continuation);
        }

        @Override // kotlinx.coroutines.CoroutineScope
        public CoroutineContext getCoroutineContext() {
            return this.f98289c;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f98290r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f98291s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f98292t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function3 f98293u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ ie.c f98294v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function3 function3, ie.c cVar, Continuation continuation) {
            super(3, continuation);
            this.f98293u = function3;
            this.f98294v = cVar;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i1 i1Var, re.d dVar, Continuation continuation) {
            b bVar = new b(this.f98293u, this.f98294v, continuation);
            bVar.f98291s = i1Var;
            bVar.f98292t = dVar;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f98290r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            i1 i1Var = (i1) this.f98291s;
            re.d dVar = (re.d) this.f98292t;
            Function3 function3 = this.f98293u;
            a aVar = new a(i1Var, this.f98294v.getCoroutineContext());
            this.f98291s = null;
            this.f98290r = 1;
            Object objInvoke = function3.invoke(aVar, dVar, this);
            return objInvoke == objG ? objG : objInvoke;
        }
    }

    private m() {
    }

    @Override // pe.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(ie.c client, Function3 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        ((v0) w.b(client, v0.f96923c)).d(new b(handler, client, null));
    }
}

package h9;

import eg.m1;
import eg.o0;
import io.bidmachine.BidMachine;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f72971a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CoroutineScope f72972b = i.a(m1.b(null, 1, null).plus(o0.a()));

    static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f72973r;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f72973r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            io.bidmachine.core.a.c(BidMachine.NAME, "Kotlin runtime version is " + KotlinVersion.CURRENT);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    private c() {
    }

    public static final void a() {
        io.bidmachine.core.a.c(BidMachine.NAME, "Init Kt");
        eg.i.d(f72972b, null, null, new a(null), 3, null);
    }
}

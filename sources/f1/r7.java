package f1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class r7 implements t6 {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70970r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Function0 f70971s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f70971s = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f70971s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f70970r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.f70971s.invoke();
            return Unit.f93236a;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70972r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f70973s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Function0 f70974t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f70973s = j10;
            this.f70974t = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f70973s, this.f70974t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f70972r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                long j10 = this.f70973s;
                this.f70972r = 1;
                if (eg.k0.a(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            this.f70974t.invoke();
            return Unit.f93236a;
        }
    }

    @Override // f1.t6
    public void a(long j10, Function0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        eg.i.d(kotlinx.coroutines.i.a(eg.o0.c()), null, null, new b(j10, call, null), 3, null);
    }

    @Override // f1.t6
    public void b(Function0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        eg.i.d(kotlinx.coroutines.i.a(eg.o0.c()), null, null, new a(call, null), 3, null);
    }
}

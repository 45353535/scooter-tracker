package androidx.room.coroutines;

import eg.f0;
import eg.g;
import eg.h;
import eg.p;
import eg.r;
import eg.x0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "runBlockingUninterruptible", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RunBlockingUninterruptible_androidKt {

    /* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        static final class C01181 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Function2<CoroutineScope, Continuation, Object> $block;
            final /* synthetic */ p $deferred;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01181(p pVar, Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
                super(2, continuation);
                this.$deferred = pVar;
                this.$block = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C01181 c01181 = new C01181(this.$deferred, this.$block, continuation);
                c01181.L$0 = obj;
                return c01181;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p pVar;
                Object objB;
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    p pVar2 = this.$deferred;
                    Function2<CoroutineScope, Continuation, Object> function2 = this.$block;
                    try {
                        Result.Companion companion = Result.f93230c;
                        this.L$0 = pVar2;
                        this.label = 1;
                        obj = function2.invoke(coroutineScope, this);
                        if (obj == objG) {
                            return objG;
                        }
                        pVar = pVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        pVar = pVar2;
                        Result.Companion companion2 = Result.f93230c;
                        objB = Result.b(kotlin.d.a(th));
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (p) this.L$0;
                    try {
                        kotlin.d.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion22 = Result.f93230c;
                        objB = Result.b(kotlin.d.a(th));
                    }
                }
                objB = Result.b(obj);
                r.d(pVar, objB);
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C01181) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
        static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ p $deferred;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(p pVar, Continuation continuation) {
                super(2, continuation);
                this.$deferred = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.$deferred, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    return obj;
                }
                kotlin.d.b(obj);
                p pVar = this.$deferred;
                this.label = 1;
                Object objAwait = pVar.await(this);
                return objAwait == objG ? objG : objAwait;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(kotlin.coroutines.d.M8);
            Intrinsics.checkNotNull(element);
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) element;
            p pVarC = r.c(null, 1, null);
            g.c(x0.f69181b, dVar, f0.f69149e, new C01181(pVarC, this.$block, null));
            while (!pVarC.n()) {
                try {
                    return g.e(dVar, new AnonymousClass2(pVarC, null));
                } catch (InterruptedException unused) {
                }
            }
            return pVarC.o();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final <T> T runBlockingUninterruptible(@NotNull Function2<? super CoroutineScope, ? super Continuation, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Thread.interrupted();
        return (T) h.b(null, new AnonymousClass1(block, null), 1, null);
    }
}

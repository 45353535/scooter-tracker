package androidx.room;

import eg.o1;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a8\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\b\u0010\u0007\u001a>\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0082@¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0014\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0\u001a*\u00020\u00012\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a8\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u001e\u0010\u0007¨\u0006\u001f"}, d2 = {"R", "Landroidx/room/RoomDatabase;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "withTransaction", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTransactionContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "transactionBlock", "startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTransactionCoroutine", "Lkotlin/coroutines/d;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/d;)Lkotlin/coroutines/CoroutineContext;", "createTransactionContext", "", "", "tables", "", "emitInitialState", "Lkotlinx/coroutines/flow/Flow;", "", "invalidationTrackerFlow", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "compatTransactionCoroutineExecute", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
final /* synthetic */ class RoomDatabaseKt__RoomDatabase_androidKt {

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2", f = "RoomDatabase.android.kt", l = {2044}, m = "invokeSuspend")
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.k implements Function1<Continuation, Object> {
        final /* synthetic */ Function1<Continuation, Object> $block;
        final /* synthetic */ RoomDatabase $this_withTransaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(RoomDatabase roomDatabase, Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
            super(1, continuation);
            this.$this_withTransaction = roomDatabase;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass2(this.$this_withTransaction, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    this.$this_withTransaction.beginTransaction();
                    Function1<Continuation, Object> function1 = this.$block;
                    this.label = 1;
                    obj = function1.invoke(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                this.$this_withTransaction.setTransactionSuccessful();
                return obj;
            } finally {
                this.$this_withTransaction.endTransaction();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @Nullable
    public static final <R> Object compatTransactionCoroutineExecute(@NotNull RoomDatabase roomDatabase, @NotNull Function1<? super Continuation, ? extends Object> function1, @NotNull Continuation continuation) {
        return (roomDatabase.inCompatibilityMode() && roomDatabase.isOpenInternal$room_runtime() && roomDatabase.inTransaction()) ? function1.invoke(continuation) : continuation.getContext().get(RoomExternalOperationElement.INSTANCE) == null ? function1.invoke(continuation) : RoomDatabaseKt.withTransactionContext(roomDatabase, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(RoomDatabase roomDatabase, kotlin.coroutines.d dVar) {
        CoroutineContext coroutineContextPlus = dVar.plus(new TransactionElement(dVar));
        return coroutineContextPlus.plus(o1.a(roomDatabase.getSuspendingTransactionContext(), coroutineContextPlus));
    }

    @NotNull
    public static final Flow invalidationTrackerFlow(@NotNull RoomDatabase roomDatabase, @NotNull String[] tables, boolean z10) {
        Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        Intrinsics.checkNotNullParameter(tables, "tables");
        return roomDatabase.getInvalidationTracker().createFlow((String[]) Arrays.copyOf(tables, tables.length), z10);
    }

    public static /* synthetic */ Flow invalidationTrackerFlow$default(RoomDatabase roomDatabase, String[] strArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return RoomDatabaseKt.invalidationTrackerFlow(roomDatabase, strArr, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(final RoomDatabase roomDatabase, final Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
        final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1

                /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2087}, m = "invokeSuspend")
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ CancellableContinuation $continuation;
                    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ Function2<CoroutineScope, Continuation, Object> $transactionBlock;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(RoomDatabase roomDatabase, CancellableContinuation cancellableContinuation, Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
                        super(2, continuation);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = cancellableContinuation;
                        this.$transactionBlock = function2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation create(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Continuation continuation;
                        Object objG = pf.b.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.d.b(obj);
                            CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(kotlin.coroutines.d.M8);
                            Intrinsics.checkNotNull(element);
                            CoroutineContext coroutineContextCreateTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt = RoomDatabaseKt__RoomDatabase_androidKt.createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(this.$this_startTransactionCoroutine, (kotlin.coroutines.d) element);
                            CancellableContinuation cancellableContinuation = this.$continuation;
                            Result.Companion companion = Result.f93230c;
                            Function2<CoroutineScope, Continuation, Object> function2 = this.$transactionBlock;
                            this.L$0 = cancellableContinuation;
                            this.label = 1;
                            obj = eg.g.g(coroutineContextCreateTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt, function2, this);
                            if (obj == objG) {
                                return objG;
                            }
                            continuation = cancellableContinuation;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            continuation = (Continuation) this.L$0;
                            kotlin.d.b(obj);
                        }
                        continuation.resumeWith(Result.b(obj));
                        return Unit.f93236a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        eg.g.e(eVar.getContext().minusKey(kotlin.coroutines.d.M8), new AnonymousClass1(roomDatabase, eVar, function2, null));
                    } catch (Throwable th2) {
                        eVar.a(th2);
                    }
                }
            });
        } catch (RejectedExecutionException e10) {
            eVar.a(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }

    @Nullable
    public static final <R> Object withTransaction(@NotNull RoomDatabase roomDatabase, @NotNull Function1<? super Continuation, ? extends Object> function1, @NotNull Continuation continuation) {
        return RoomDatabaseKt.withTransactionContext(roomDatabase, new AnonymousClass2(roomDatabase, function1, null), continuation);
    }

    @Nullable
    public static final <R> Object withTransactionContext(@NotNull RoomDatabase roomDatabase, @NotNull Function1<? super Continuation, ? extends Object> function1, @NotNull Continuation continuation) {
        RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 = new RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(function1, null);
        TransactionElement transactionElement = (TransactionElement) continuation.getContext().get(TransactionElement.INSTANCE);
        kotlin.coroutines.d transactionDispatcher = transactionElement != null ? transactionElement.getTransactionDispatcher() : null;
        return transactionDispatcher != null ? eg.g.g(transactionDispatcher, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, continuation) : startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(roomDatabase, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, continuation);
    }
}

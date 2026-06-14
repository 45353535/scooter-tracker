package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086H¢\u0006\u0002\u0010\u0003\u001a.\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¨\u0006\u000e"}, d2 = {"await", "Landroidx/work/Operation$State$SUCCESS;", "Landroidx/work/Operation;", "(Landroidx/work/Operation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchOperation", "tracer", "Landroidx/work/Tracer;", "label", "", "executor", "Ljava/util/concurrent/Executor;", "block", "Lkotlin/Function0;", "", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class OperationKt {

    /* JADX INFO: renamed from: androidx.work.OperationKt$await$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.work.OperationKt", f = "Operation.kt", l = {36}, m = "await")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object await(@org.jetbrains.annotations.NotNull androidx.work.Operation r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.d.b(r5)
            com.google.common.util.concurrent.ListenableFuture r4 = r4.getResult()
            java.lang.String r5 = "getResult(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.label = r3
            java.lang.Object r5 = androidx.concurrent.futures.ListenableFutureKt.await(r4, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final Object await$$forInline(Operation operation, Continuation continuation) throws Throwable {
        ListenableFuture<Operation.State.SUCCESS> result = operation.getResult();
        Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
        z.c(0);
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(result, continuation);
        z.c(1);
        Intrinsics.checkNotNullExpressionValue(objAwait, "await(...)");
        return objAwait;
    }

    @NotNull
    public static final Operation launchOperation(@NotNull final Tracer tracer, @NotNull final String label, @NotNull final Executor executor, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(block, "block");
        final MutableLiveData mutableLiveData = new MutableLiveData(Operation.IN_PROGRESS);
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.h
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return OperationKt.launchOperation$lambda$2(executor, tracer, label, block, mutableLiveData, completer);
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        return new OperationImpl(mutableLiveData, future);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchOperation$lambda$2(Executor executor, final Tracer tracer, final String str, final Function0 function0, final MutableLiveData mutableLiveData, final CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        executor.execute(new Runnable() { // from class: androidx.work.i
            @Override // java.lang.Runnable
            public final void run() {
                OperationKt.launchOperation$lambda$2$lambda$1(tracer, str, function0, mutableLiveData, completer);
            }
        });
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchOperation$lambda$2$lambda$1(Tracer tracer, String str, Function0 function0, MutableLiveData mutableLiveData, CallbackToFutureAdapter.Completer completer) {
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(str);
            } finally {
                if (zIsEnabled) {
                    tracer.endSection();
                }
            }
        }
        try {
            function0.invoke();
            Operation.State.SUCCESS success = Operation.SUCCESS;
            mutableLiveData.postValue(success);
            completer.set(success);
        } catch (Throwable th2) {
            mutableLiveData.postValue(new Operation.State.FAILURE(th2));
            completer.setException(th2);
        }
        Unit unit = Unit.f93236a;
    }
}

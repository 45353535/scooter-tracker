package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.f0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Leg/f0;", "start", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "Lcom/google/common/util/concurrent/ListenableFuture;", "launchFuture", "(Lkotlin/coroutines/CoroutineContext;Leg/f0;Lkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/ListenableFuture;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "executeAsync", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/google/common/util/concurrent/ListenableFuture;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ListenableFutureKt {
    @NotNull
    public static final <V> ListenableFuture<V> executeAsync(@NotNull final Executor executor, @NotNull final String debugTag, @NotNull final Function0<? extends V> block) {
        Intrinsics.checkNotNullParameter(executor, "<this>");
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(block, "block");
        ListenableFuture<V> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.b
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ListenableFutureKt.executeAsync$lambda$4(executor, debugTag, block, completer);
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object executeAsync$lambda$4(Executor executor, String str, final Function0 function0, final CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.addCancellationListener(new Runnable() { // from class: androidx.work.d
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(true);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: androidx.work.e
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.executeAsync$lambda$4$lambda$3(atomicBoolean, completer, function0);
            }
        });
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAsync$lambda$4$lambda$3(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(function0.invoke());
        } catch (Throwable th2) {
            completer.setException(th2);
        }
    }

    @NotNull
    public static final <T> ListenableFuture<T> launchFuture(@NotNull final CoroutineContext context, @NotNull final f0 start, @NotNull final Function2<? super CoroutineScope, ? super Continuation, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        ListenableFuture<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.c
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ListenableFutureKt.launchFuture$lambda$1(context, start, block, completer);
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }

    public static /* synthetic */ ListenableFuture launchFuture$default(CoroutineContext coroutineContext, f0 f0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        if ((i10 & 2) != 0) {
            f0Var = f0.f69146b;
        }
        return launchFuture(coroutineContext, f0Var, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object launchFuture$lambda$1(CoroutineContext coroutineContext, f0 f0Var, Function2 function2, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        final Job job = (Job) coroutineContext.get(Job.N8);
        completer.addCancellationListener(new Runnable() { // from class: androidx.work.f
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.launchFuture$lambda$1$lambda$0(job);
            }
        }, DirectExecutor.INSTANCE);
        return eg.i.d(kotlinx.coroutines.i.a(coroutineContext), null, f0Var, new ListenableFutureKt$launchFuture$1$2(function2, completer, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchFuture$lambda$1$lambda$0(Job job) {
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
    }
}

package androidx.test.core.view;

import androidx.concurrent.futures.ResolvableFuture;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.util.concurrent.ListenableFuture;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.f0;
import eg.o0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0010\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/test/core/view/SuspendToFutureAdapter;", "", "<init>", "()V", "T", "Lkotlin/coroutines/CoroutineContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "launchUndispatched", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "block", "Lcom/google/common/util/concurrent/ListenableFuture;", "launchFuture", "(Lkotlin/coroutines/CoroutineContext;ZLkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/ListenableFuture;", "androidx/test/core/view/SuspendToFutureAdapter$GlobalListenableFutureScope$1", "GlobalListenableFutureScope", "Landroidx/test/core/view/SuspendToFutureAdapter$GlobalListenableFutureScope$1;", "Lkotlinx/coroutines/CoroutineDispatcher;", "GlobalListenableFutureAwaitContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "DeferredFuture", "core_java_androidx_test_core-core_internal_kt"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SuspendToFutureAdapter {

    @NotNull
    public static final SuspendToFutureAdapter INSTANCE = new SuspendToFutureAdapter();

    @NotNull
    private static final SuspendToFutureAdapter$GlobalListenableFutureScope$1 GlobalListenableFutureScope = new CoroutineScope() { // from class: androidx.test.core.view.SuspendToFutureAdapter$GlobalListenableFutureScope$1

        @NotNull
        private final CoroutineContext coroutineContext = o0.c();

        @Override // kotlinx.coroutines.CoroutineScope
        @NotNull
        public CoroutineContext getCoroutineContext() {
            return this.coroutineContext;
        }
    };

    @NotNull
    private static final CoroutineDispatcher GlobalListenableFutureAwaitContext = o0.d();

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\r\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096\u0002¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u001e\u0010 \u001a\u00020\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016ø\u0001\u0000¢\u0006\u0002\u0010#R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR2\u0010\u000b\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00018\u00008\u0000 \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/test/core/view/SuspendToFutureAdapter$DeferredFuture;", "T", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlin/coroutines/Continuation;", "resultDeferred", "Lkotlinx/coroutines/Deferred;", "(Lkotlinx/coroutines/Deferred;)V", POBCoreNativeConstants.NATIVE_CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "delegateFuture", "Landroidx/concurrent/futures/ResolvableFuture;", "kotlin.jvm.PlatformType", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/lang/Runnable;", "executor", "Ljava/util/concurrent/Executor;", MenuActionType.CANCEL, "", "shouldInterrupt", "get", "()Ljava/lang/Object;", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isCancelled", "isDone", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "core_java_androidx_test_core-core_internal_kt"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class DeferredFuture<T> implements ListenableFuture<T>, Continuation {
        private final ResolvableFuture<T> delegateFuture;

        @NotNull
        private final Deferred resultDeferred;

        public DeferredFuture(@NotNull Deferred resultDeferred) {
            Intrinsics.checkNotNullParameter(resultDeferred, "resultDeferred");
            this.resultDeferred = resultDeferred;
            this.delegateFuture = ResolvableFuture.create();
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(@NotNull Runnable listener, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.delegateFuture.addListener(listener, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean shouldInterrupt) {
            boolean zCancel = this.delegateFuture.cancel(shouldInterrupt);
            if (zCancel) {
                Job.a.a(this.resultDeferred, null, 1, null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.delegateFuture.get();
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            return SuspendToFutureAdapter.GlobalListenableFutureAwaitContext;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegateFuture.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegateFuture.isDone();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object result) {
            Throwable thG = Result.g(result);
            if (thG == null) {
                this.delegateFuture.set(result);
            } else if (thG instanceof CancellationException) {
                this.delegateFuture.cancel(false);
            } else {
                this.delegateFuture.setException(thG);
            }
        }

        @Override // java.util.concurrent.Future
        public T get(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this.delegateFuture.get(timeout, unit);
        }
    }

    private SuspendToFutureAdapter() {
    }

    public static /* synthetic */ ListenableFuture launchFuture$default(SuspendToFutureAdapter suspendToFutureAdapter, CoroutineContext coroutineContext, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return suspendToFutureAdapter.launchFuture(coroutineContext, z10, function2);
    }

    @NotNull
    public final <T> ListenableFuture<T> launchFuture(@NotNull CoroutineContext context, boolean launchUndispatched, @NotNull Function2<? super CoroutineScope, ? super Continuation, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        Deferred deferredA = eg.g.a(GlobalListenableFutureScope, context, launchUndispatched ? f0.f69149e : f0.f69146b, block);
        DeferredFuture deferredFuture = new DeferredFuture(deferredA);
        Continuation continuationA = of.c.a(new SuspendToFutureAdapter$launchFuture$1$1(deferredA), deferredFuture);
        Result.Companion companion = Result.f93230c;
        continuationA.resumeWith(Result.b(Unit.f93236a));
        return deferredFuture;
    }
}

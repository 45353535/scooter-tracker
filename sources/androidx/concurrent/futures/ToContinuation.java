package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/concurrent/futures/ToContinuation;", "T", "Ljava/lang/Runnable;", "futureToObserve", "Lcom/google/common/util/concurrent/ListenableFuture;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlinx/coroutines/CancellableContinuation;)V", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "getFutureToObserve", "()Lcom/google/common/util/concurrent/ListenableFuture;", "run", "", "concurrent-futures-ktx"}, k = 1, mv = {1, 1, 16})
final class ToContinuation<T> implements Runnable {

    @NotNull
    private final CancellableContinuation continuation;

    @NotNull
    private final ListenableFuture<T> futureToObserve;

    public ToContinuation(@NotNull ListenableFuture<T> futureToObserve, @NotNull CancellableContinuation continuation) {
        Intrinsics.checkParameterIsNotNull(futureToObserve, "futureToObserve");
        Intrinsics.checkParameterIsNotNull(continuation, "continuation");
        this.futureToObserve = futureToObserve;
        this.continuation = continuation;
    }

    @NotNull
    public final CancellableContinuation getContinuation() {
        return this.continuation;
    }

    @NotNull
    public final ListenableFuture<T> getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            CancellableContinuation.a.a(this.continuation, null, 1, null);
            return;
        }
        try {
            CancellableContinuation cancellableContinuation = this.continuation;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(AbstractResolvableFuture.getUninterruptibly(this.futureToObserve)));
        } catch (ExecutionException e10) {
            CancellableContinuation cancellableContinuation2 = this.continuation;
            Throwable thNonNullCause = ListenableFutureKt.nonNullCause(e10);
            Result.Companion companion2 = Result.f93230c;
            cancellableContinuation2.resumeWith(Result.b(d.a(thNonNullCause)));
        }
    }
}

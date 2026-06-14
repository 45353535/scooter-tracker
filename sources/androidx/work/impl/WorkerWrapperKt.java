package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.DirectExecutor;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker;", "worker", "awaitWithin", "(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/work/ListenableWorker;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Future;", "future", "getUninterruptibly", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "nonNullCause", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WorkerWrapperKt {

    @NotNull
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkerWrapper");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public static final <T> Object awaitWithin(@NotNull final ListenableFuture<T> listenableFuture, @NotNull final ListenableWorker listenableWorker, @NotNull Continuation continuation) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return getUninterruptibly(listenableFuture);
            }
            kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
            eVar.I();
            listenableFuture.addListener(new ToContinuation(listenableFuture, eVar), DirectExecutor.INSTANCE);
            eVar.v(new Function1<Throwable, Unit>() { // from class: androidx.work.impl.WorkerWrapperKt$awaitWithin$2$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    if (th2 instanceof WorkerStoppedException) {
                        listenableWorker.stop(((WorkerStoppedException) th2).getReason());
                    }
                    listenableFuture.cancel(false);
                }
            });
            Object objC = eVar.C();
            if (objC == pf.b.g()) {
                kotlin.coroutines.jvm.internal.g.c(continuation);
            }
            return objC;
        } catch (ExecutionException e10) {
            throw nonNullCause(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> V getUninterruptibly(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }
}

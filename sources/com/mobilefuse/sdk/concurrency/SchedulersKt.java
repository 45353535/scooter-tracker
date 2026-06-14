package com.mobilefuse.sdk.concurrency;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0006\u0010\u000b\u001a\u00020\f\u001a\b\u0010\r\u001a\u00020\u000eH\u0001\u001a\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014\u001a,\u0010\u0015\u001a\u00020\u00102\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00172\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014\u001a,\u0010\u0019\u001a\u00020\u00102\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00172\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014\u001a4\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"globalHandler", "Landroid/os/Handler;", "getGlobalHandler", "()Landroid/os/Handler;", "globalHandler$delegate", "Lkotlin/Lazy;", "poolExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "getPoolExecutor", "()Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "poolExecutor$delegate", "currentThreadName", "", "isMainThread", "", "runOnScheduler", "", "scheduler", "Lcom/mobilefuse/sdk/concurrency/Schedulers;", "action", "Lkotlin/Function0;", "safelyRunOnBgThread", "errorCallback", "Lkotlin/Function1;", "", "safelyRunOnMainThread", "safelyRunOnScheduler", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class SchedulersKt {
    private static final Lazy poolExecutor$delegate = i.a(new Function0<ScheduledThreadPoolExecutor>() { // from class: com.mobilefuse.sdk.concurrency.SchedulersKt$poolExecutor$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ScheduledThreadPoolExecutor invoke() {
            return new ScheduledThreadPoolExecutor(3);
        }
    });

    @NotNull
    private static final Lazy globalHandler$delegate = i.a(new Function0<Handler>() { // from class: com.mobilefuse.sdk.concurrency.SchedulersKt$globalHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Schedulers.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Schedulers.IO.ordinal()] = 1;
            iArr[Schedulers.MAIN.ordinal()] = 2;
        }
    }

    @NotNull
    public static final String currentThreadName() {
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        String name = threadCurrentThread.getName();
        Intrinsics.checkNotNullExpressionValue(name, "Thread.currentThread().name");
        return name;
    }

    @NotNull
    public static final Handler getGlobalHandler() {
        return (Handler) globalHandler$delegate.getValue();
    }

    private static final ScheduledThreadPoolExecutor getPoolExecutor() {
        return (ScheduledThreadPoolExecutor) poolExecutor$delegate.getValue();
    }

    @VisibleForTesting
    public static final boolean isMainThread() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final void runOnScheduler(@NotNull Schedulers scheduler, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(action, "action");
        int i10 = WhenMappings.$EnumSwitchMapping$0[scheduler.ordinal()];
        if (i10 == 1) {
            if (isMainThread()) {
                getPoolExecutor().execute(new Runnable() { // from class: com.mobilefuse.sdk.concurrency.SchedulersKt$sam$java_lang_Runnable$0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        Intrinsics.checkNotNullExpressionValue(action.invoke(), "invoke(...)");
                    }
                });
                return;
            } else {
                action.invoke();
                return;
            }
        }
        if (i10 != 2) {
            return;
        }
        if (isMainThread()) {
            action.invoke();
        } else {
            getGlobalHandler().post(new Runnable() { // from class: com.mobilefuse.sdk.concurrency.SchedulersKt$sam$java_lang_Runnable$0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Intrinsics.checkNotNullExpressionValue(action.invoke(), "invoke(...)");
                }
            });
        }
    }

    public static final void safelyRunOnBgThread(@Nullable Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        safelyRunOnScheduler(Schedulers.IO, action, function1);
    }

    public static /* synthetic */ void safelyRunOnBgThread$default(Function1 function1, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        safelyRunOnBgThread(function1, function0);
    }

    public static final void safelyRunOnMainThread(@Nullable Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        safelyRunOnScheduler(Schedulers.MAIN, action, function1);
    }

    public static /* synthetic */ void safelyRunOnMainThread$default(Function1 function1, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        safelyRunOnMainThread(function1, function0);
    }

    public static final void safelyRunOnScheduler(@NotNull final Schedulers scheduler, @NotNull final Function0<Unit> action, @Nullable final Function1<? super Throwable, Unit> function1) {
        Either errorResult;
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(action, "action");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            runOnScheduler(scheduler, new Function0<Unit>() { // from class: com.mobilefuse.sdk.concurrency.SchedulersKt$safelyRunOnScheduler$$inlined$gracefullyHandleException$lambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Either errorResult2;
                    Function0 function0 = action;
                    ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        errorResult2 = new SuccessResult(function0.invoke());
                    } catch (Throwable th2) {
                        if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy2.ordinal()] == 1) {
                            StabilityHelper.logException("[Automatically caught]", th2);
                        }
                        errorResult2 = new ErrorResult(th2);
                    }
                    if (errorResult2 instanceof ErrorResult) {
                        Throwable th3 = (Throwable) ((ErrorResult) errorResult2).getValue();
                        Function1 function12 = function1;
                        if (function12 != null) {
                        }
                    }
                }
            });
            errorResult = new SuccessResult(Unit.f93236a);
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th3 = (Throwable) ((ErrorResult) errorResult).getValue();
            if (function1 != null) {
                function1.invoke(th3);
            }
        }
    }

    public static /* synthetic */ void safelyRunOnScheduler$default(Schedulers schedulers, Function0 function0, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        safelyRunOnScheduler(schedulers, function0, function1);
    }
}

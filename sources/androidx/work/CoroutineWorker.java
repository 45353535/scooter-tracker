package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.o0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.a0;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u000e\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u001cJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fJ\u0006\u0010\u001e\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "appContext", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "startWork", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfo", "Landroidx/work/ForegroundInfo;", "setProgress", "", "data", "Landroidx/work/Data;", "(Landroidx/work/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setForeground", "foregroundInfo", "(Landroidx/work/ForegroundInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfoAsync", AtomManager.ATOM_ON_STOPPED_METHOD_NAME, "DeprecatedDispatcher", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends ListenableWorker {

    @NotNull
    private final CoroutineDispatcher coroutineContext;

    @NotNull
    private final WorkerParameters params;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/work/CoroutineWorker$DeprecatedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "dispatcher", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatch", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "isDispatchNeeded", "", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class DeprecatedDispatcher extends CoroutineDispatcher {

        @NotNull
        public static final DeprecatedDispatcher INSTANCE = new DeprecatedDispatcher();

        @NotNull
        private static final CoroutineDispatcher dispatcher = o0.a();

        private DeprecatedDispatcher() {
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            dispatcher.dispatch(context, block);
        }

        @NotNull
        public final CoroutineDispatcher getDispatcher() {
            return dispatcher;
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public boolean isDispatchNeeded(@NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return dispatcher.isDispatchNeeded(context);
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/work/ForegroundInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {121}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return CoroutineWorker.this.new AnonymousClass1(continuation);
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
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            return foregroundInfo == objG ? objG : foregroundInfo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$startWork$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {67}, m = "invokeSuspend")
    static final class C16931 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C16931(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return CoroutineWorker.this.new C16931(continuation);
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
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object objDoWork = coroutineWorker.doWork(this);
            return objDoWork == objG ? objG : objDoWork;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16931) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        this.coroutineContext = DeprecatedDispatcher.INSTANCE;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, Continuation continuation) {
        throw new IllegalStateException("Not implemented");
    }

    @Nullable
    public abstract Object doWork(@NotNull Continuation continuation);

    @NotNull
    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    public Object getForegroundInfo(@NotNull Continuation continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        return ListenableFutureKt.launchFuture$default(getCoroutineContext().plus(a0.b(null, 1, null)), null, new AnonymousClass1(null), 2, null);
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
    }

    @Nullable
    public final Object setForeground(@NotNull ForegroundInfo foregroundInfo, @NotNull Continuation continuation) throws Throwable {
        ListenableFuture<Void> foregroundAsync = setForegroundAsync(foregroundInfo);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(...)");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(foregroundAsync, continuation);
        return objAwait == pf.b.g() ? objAwait : Unit.f93236a;
    }

    @Nullable
    public final Object setProgress(@NotNull Data data, @NotNull Continuation continuation) throws Throwable {
        ListenableFuture<Void> progressAsync = setProgressAsync(data);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(...)");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(progressAsync, continuation);
        return objAwait == pf.b.g() ? objAwait : Unit.f93236a;
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        CoroutineContext coroutineContext = !Intrinsics.areEqual(getCoroutineContext(), DeprecatedDispatcher.INSTANCE) ? getCoroutineContext() : this.params.getWorkerContext();
        Intrinsics.checkNotNull(coroutineContext);
        return ListenableFutureKt.launchFuture$default(coroutineContext.plus(a0.b(null, 1, null)), null, new C16931(null), 2, null);
    }
}

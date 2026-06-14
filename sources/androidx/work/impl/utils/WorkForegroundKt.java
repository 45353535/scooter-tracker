package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.WorkerWrapperKt;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.w0;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroidx/work/impl/model/WorkSpec;", "spec", "Landroidx/work/ListenableWorker;", "worker", "Landroidx/work/ForegroundUpdater;", "foregroundUpdater", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "", "workForeground", "(Landroid/content/Context;Landroidx/work/impl/model/WorkSpec;Landroidx/work/ListenableWorker;Landroidx/work/ForegroundUpdater;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WorkForegroundKt {

    @NotNull
    private static final String TAG;

    /* JADX INFO: renamed from: androidx.work.impl.utils.WorkForegroundKt$workForeground$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend")
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ForegroundUpdater $foregroundUpdater;
        final /* synthetic */ WorkSpec $spec;
        final /* synthetic */ ListenableWorker $worker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ListenableWorker listenableWorker, WorkSpec workSpec, ForegroundUpdater foregroundUpdater, Context context, Continuation continuation) {
            super(2, continuation);
            this.$worker = listenableWorker;
            this.$spec = workSpec;
            this.$foregroundUpdater = foregroundUpdater;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$worker, this.$spec, this.$foregroundUpdater, this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ListenableFuture<ForegroundInfo> foregroundInfoAsync = this.$worker.getForegroundInfoAsync();
                Intrinsics.checkNotNullExpressionValue(foregroundInfoAsync, "getForegroundInfoAsync(...)");
                ListenableWorker listenableWorker = this.$worker;
                this.label = 1;
                obj = WorkerWrapperKt.awaitWithin(foregroundInfoAsync, listenableWorker, this);
                if (obj != objG) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
            if (foregroundInfo == null) {
                throw new IllegalStateException("Worker was marked important (" + this.$spec.workerClassName + ") but did not provide ForegroundInfo");
            }
            String str = WorkForegroundKt.TAG;
            WorkSpec workSpec = this.$spec;
            Logger.get().debug(str, "Updating notification for " + workSpec.workerClassName);
            ListenableFuture<Void> foregroundAsync = this.$foregroundUpdater.setForegroundAsync(this.$context, this.$worker.getId(), foregroundInfo);
            Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(...)");
            this.label = 2;
            Object objAwait = ListenableFutureKt.await(foregroundAsync, this);
            return objAwait == objG ? objG : objAwait;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkForegroundRunnable");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }

    @Nullable
    public static final Object workForeground(@NotNull Context context, @NotNull WorkSpec workSpec, @NotNull ListenableWorker listenableWorker, @NotNull ForegroundUpdater foregroundUpdater, @NotNull TaskExecutor taskExecutor, @NotNull Continuation continuation) {
        if (!workSpec.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.f93236a;
        }
        Executor mainThreadExecutor = taskExecutor.getMainThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "getMainThreadExecutor(...)");
        Object objG = eg.g.g(w0.b(mainThreadExecutor), new AnonymousClass2(listenableWorker, workSpec, foregroundUpdater, context, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }
}

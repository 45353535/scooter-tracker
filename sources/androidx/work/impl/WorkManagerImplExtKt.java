package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.R;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.adjust.sdk.Constants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0085\u0001\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2<\b\u0002\u0010\u0010\u001a6\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fj\u0002`\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aU\u0010\u0019\u001a6\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fj\u0002`\u000f2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0018\"\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001aE\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010#\u001a\u00020\"*\u00020\u0011¢\u0006\u0004\b#\u0010$*j\u0010%\"2\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f22\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¨\u0006&"}, d2 = {"Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroidx/work/Configuration;", "configuration", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/impl/constraints/trackers/Trackers;", Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, "Landroidx/work/impl/Processor;", "processor", "Lkotlin/Function6;", "", "Landroidx/work/impl/Scheduler;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Landroidx/work/impl/WorkManagerImpl;", "createWorkManager", "(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;Lkotlin/jvm/functions/Function6;)Landroidx/work/impl/WorkManagerImpl;", "WorkManagerImpl", "createTestWorkManager", "(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)Landroidx/work/impl/WorkManagerImpl;", "TestWorkManagerImpl", "", "schedulers", "([Landroidx/work/impl/Scheduler;)Lkotlin/jvm/functions/Function6;", "createSchedulers", "(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", "taskExecutor", "Lkotlinx/coroutines/CoroutineScope;", "createWorkManagerScope", "(Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)Lkotlinx/coroutines/CoroutineScope;", "WorkManagerScope", "", "close", "(Landroidx/work/impl/WorkManagerImpl;)V", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WorkManagerImplExtKt {

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImplExtKt$close$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.work.impl.WorkManagerImplExtKt$close$1", f = "WorkManagerImplExt.kt", l = {121}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ WorkManagerImpl $this_close;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WorkManagerImpl workManagerImpl, Continuation continuation) {
            super(2, continuation);
            this.$this_close = workManagerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_close, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineContext.Element element = this.$this_close.getWorkManagerScope().getCoroutineContext().get(Job.N8);
                Intrinsics.checkNotNull(element);
                this.label = 1;
                if (kotlinx.coroutines.z.g((Job) element, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final void close(@NotNull WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(workManagerImpl, "<this>");
        eg.h.b(null, new AnonymousClass1(workManagerImpl, null), 1, null);
        workManagerImpl.getWorkDatabase().close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Scheduler> createSchedulers(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        Scheduler schedulerCreateBestAvailableBackgroundScheduler = Schedulers.createBestAvailableBackgroundScheduler(context, workDatabase, configuration);
        Intrinsics.checkNotNullExpressionValue(schedulerCreateBestAvailableBackgroundScheduler, "createBestAvailableBackgroundScheduler(...)");
        return CollectionsKt.listOf((Object[]) new Scheduler[]{schedulerCreateBestAvailableBackgroundScheduler, new GreedyScheduler(context, configuration, trackers, processor, new WorkLauncherImpl(processor, taskExecutor), taskExecutor)});
    }

    @NotNull
    public static final WorkManagerImpl createTestWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull TaskExecutor workTaskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
        SerialExecutor serialTaskExecutor = workTaskExecutor.getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return createWorkManager$default(context, configuration, workTaskExecutor, companion.create(context, serialTaskExecutor, configuration.getClock(), true), null, null, null, 112, null);
    }

    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context, @NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return createWorkManager$default(context, configuration, null, null, null, null, null, 124, null);
    }

    public static /* synthetic */ WorkManagerImpl createWorkManager$default(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, Function6 function6, int i10, Object obj) {
        Trackers trackers2;
        if ((i10 & 4) != 0) {
            taskExecutor = new WorkManagerTaskExecutor(configuration.getTaskExecutor());
        }
        TaskExecutor taskExecutor2 = taskExecutor;
        if ((i10 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            SerialExecutor serialTaskExecutor = taskExecutor2.getSerialTaskExecutor();
            Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
            workDatabase = companion.create(applicationContext, serialTaskExecutor, configuration.getClock(), context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            trackers2 = new Trackers(applicationContext2, taskExecutor2, null, null, null, null, 60, null);
        } else {
            trackers2 = trackers;
        }
        return createWorkManager(context, configuration, taskExecutor2, workDatabase, trackers2, (i10 & 32) != 0 ? new Processor(context.getApplicationContext(), configuration, taskExecutor2, workDatabase) : processor, (i10 & 64) != 0 ? WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE : function6);
    }

    @NotNull
    public static final CoroutineScope createWorkManagerScope(@NotNull TaskExecutor taskExecutor) {
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        CoroutineDispatcher taskCoroutineDispatcher = taskExecutor.getTaskCoroutineDispatcher();
        Intrinsics.checkNotNullExpressionValue(taskCoroutineDispatcher, "getTaskCoroutineDispatcher(...)");
        return kotlinx.coroutines.i.a(taskCoroutineDispatcher);
    }

    @NotNull
    public static final Function6<Context, Configuration, TaskExecutor, WorkDatabase, Trackers, Processor, List<Scheduler>> schedulers(@NotNull final Scheduler... schedulers) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        return new Function6() { // from class: androidx.work.impl.v
            @Override // kotlin.jvm.functions.Function6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return WorkManagerImplExtKt.schedulers$lambda$0(schedulers, (Context) obj, (Configuration) obj2, (TaskExecutor) obj3, (WorkDatabase) obj4, (Trackers) obj5, (Processor) obj6);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List schedulers$lambda$0(Scheduler[] schedulerArr, Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        Intrinsics.checkNotNullParameter(context, "<unused var>");
        Intrinsics.checkNotNullParameter(configuration, "<unused var>");
        Intrinsics.checkNotNullParameter(taskExecutor, "<unused var>");
        Intrinsics.checkNotNullParameter(workDatabase, "<unused var>");
        Intrinsics.checkNotNullParameter(trackers, "<unused var>");
        Intrinsics.checkNotNullParameter(processor, "<unused var>");
        return ArraysKt.toList(schedulerArr);
    }

    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull TaskExecutor workTaskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, null, null, null, null, 120, null);
    }

    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull TaskExecutor workTaskExecutor, @NotNull WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, null, null, null, 112, null);
    }

    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull TaskExecutor workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull Trackers trackers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, null, null, 96, null);
    }

    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull TaskExecutor workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull Trackers trackers, @NotNull Processor processor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, processor, null, 64, null);
    }

    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull TaskExecutor workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull Trackers trackers, @NotNull Processor processor, @NotNull Function6<? super Context, ? super Configuration, ? super TaskExecutor, ? super WorkDatabase, ? super Trackers, ? super Processor, ? extends List<? extends Scheduler>> schedulersCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new WorkManagerImpl(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }
}

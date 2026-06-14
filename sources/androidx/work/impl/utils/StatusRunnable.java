package androidx.work.impl.utils;

import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.taurusx.tax.y.z.w.s;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0000\u001a$\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0000\u001a(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0000\u001a(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a4\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0001\"\u0004\b\u0000\u0010\u0014*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00140\u0016H\u0002¨\u0006\u0017"}, d2 = {"forStringIds", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "Landroidx/work/WorkInfo;", "Landroidx/work/impl/WorkDatabase;", "executor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "ids", "", "forUUID", "id", "Ljava/util/UUID;", "forTag", s.z.f67720z, "forUniqueWork", "name", "forWorkQuerySpec", "querySpec", "Landroidx/work/WorkQuery;", "loadStatusFuture", "T", "block", "Lkotlin/Function1;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class StatusRunnable {
    @NotNull
    public static final ListenableFuture<List<WorkInfo>> forStringIds(@NotNull WorkDatabase workDatabase, @NotNull TaskExecutor executor, @NotNull final List<String> ids) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(ids, "ids");
        return loadStatusFuture(workDatabase, executor, new Function1() { // from class: androidx.work.impl.utils.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StatusRunnable.forStringIds$lambda$0(ids, (WorkDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List forStringIds$lambda$0(List list, WorkDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.workSpecDao().getWorkStatusPojoForIds(list));
        Intrinsics.checkNotNullExpressionValue(listApply, "apply(...)");
        return listApply;
    }

    @NotNull
    public static final ListenableFuture<List<WorkInfo>> forTag(@NotNull WorkDatabase workDatabase, @NotNull TaskExecutor executor, @NotNull final String tag) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return loadStatusFuture(workDatabase, executor, new Function1() { // from class: androidx.work.impl.utils.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StatusRunnable.forTag$lambda$2(tag, (WorkDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List forTag$lambda$2(String str, WorkDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.workSpecDao().getWorkStatusPojoForTag(str));
        Intrinsics.checkNotNullExpressionValue(listApply, "apply(...)");
        return listApply;
    }

    @NotNull
    public static final ListenableFuture<WorkInfo> forUUID(@NotNull WorkDatabase workDatabase, @NotNull TaskExecutor executor, @NotNull final UUID id2) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(id2, "id");
        return loadStatusFuture(workDatabase, executor, new Function1() { // from class: androidx.work.impl.utils.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StatusRunnable.forUUID$lambda$1(id2, (WorkDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkInfo forUUID$lambda$1(UUID uuid, WorkDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        WorkSpecDao workSpecDao = db2.workSpecDao();
        String string = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        WorkSpec.WorkInfoPojo workStatusPojoForId = workSpecDao.getWorkStatusPojoForId(string);
        if (workStatusPojoForId != null) {
            return workStatusPojoForId.toWorkInfo();
        }
        return null;
    }

    @NotNull
    public static final ListenableFuture<List<WorkInfo>> forUniqueWork(@NotNull WorkDatabase workDatabase, @NotNull TaskExecutor executor, @NotNull final String name) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(name, "name");
        return loadStatusFuture(workDatabase, executor, new Function1() { // from class: androidx.work.impl.utils.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StatusRunnable.forUniqueWork$lambda$3(name, (WorkDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List forUniqueWork$lambda$3(String str, WorkDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.workSpecDao().getWorkStatusPojoForName(str));
        Intrinsics.checkNotNullExpressionValue(listApply, "apply(...)");
        return listApply;
    }

    @NotNull
    public static final ListenableFuture<List<WorkInfo>> forWorkQuerySpec(@NotNull WorkDatabase workDatabase, @NotNull TaskExecutor executor, @NotNull final WorkQuery querySpec) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(querySpec, "querySpec");
        return loadStatusFuture(workDatabase, executor, new Function1() { // from class: androidx.work.impl.utils.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StatusRunnable.forWorkQuerySpec$lambda$4(querySpec, (WorkDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List forWorkQuerySpec$lambda$4(WorkQuery workQuery, WorkDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.rawWorkInfoDao().getWorkInfoPojos(RawQueries.toRawQuery(workQuery)));
        Intrinsics.checkNotNullExpressionValue(listApply, "apply(...)");
        return listApply;
    }

    private static final <T> ListenableFuture<T> loadStatusFuture(final WorkDatabase workDatabase, TaskExecutor taskExecutor, final Function1<? super WorkDatabase, ? extends T> function1) {
        SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new Function0() { // from class: androidx.work.impl.utils.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return function1.invoke(workDatabase);
            }
        });
    }
}

package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends kotlin.jvm.internal.y implements Function6<Context, Configuration, TaskExecutor, WorkDatabase, Trackers, Processor, List<? extends Scheduler>> {
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 INSTANCE = new WorkManagerImplExtKt$WorkManagerImpl$1();

    WorkManagerImplExtKt$WorkManagerImpl$1() {
        super(6, WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function6
    public final List<Scheduler> invoke(Context p02, Configuration p12, TaskExecutor p22, WorkDatabase p32, Trackers p42, Processor p52) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        Intrinsics.checkNotNullParameter(p32, "p3");
        Intrinsics.checkNotNullParameter(p42, "p4");
        Intrinsics.checkNotNullParameter(p52, "p5");
        return WorkManagerImplExtKt.createSchedulers(p02, p12, p22, p32, p42, p52);
    }
}

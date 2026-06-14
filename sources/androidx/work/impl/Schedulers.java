package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.PackageManagerHelper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Schedulers {
    private static final String TAG = Logger.tagWithPrefix("Schedulers");

    private Schedulers() {
    }

    public static /* synthetic */ void b(List list, WorkGenerationalId workGenerationalId, Configuration configuration, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Scheduler) it.next()).cancel(workGenerationalId.getWorkSpecId());
        }
        schedule(configuration, workDatabase, list);
    }

    static Scheduler createBestAvailableBackgroundScheduler(Context context, WorkDatabase workDatabase, Configuration configuration) {
        SystemJobScheduler systemJobScheduler = new SystemJobScheduler(context, workDatabase, configuration);
        PackageManagerHelper.setComponentEnabled(context, SystemJobService.class, true);
        Logger.get().debug(TAG, "Created SystemJobScheduler and enabled SystemJobService");
        return systemJobScheduler;
    }

    private static void markScheduled(WorkSpecDao workSpecDao, Clock clock, List<WorkSpec> list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = clock.currentTimeMillis();
            Iterator<WorkSpec> it = list.iterator();
            while (it.hasNext()) {
                workSpecDao.markWorkSpecScheduled(it.next().id, jCurrentTimeMillis);
            }
        }
    }

    public static void registerRescheduling(final List<Scheduler> list, Processor processor, final Executor executor, final WorkDatabase workDatabase, final Configuration configuration) {
        processor.addExecutionListener(new ExecutionListener() { // from class: androidx.work.impl.d
            @Override // androidx.work.impl.ExecutionListener
            public final void onExecuted(WorkGenerationalId workGenerationalId, boolean z10) {
                executor.execute(new Runnable() { // from class: androidx.work.impl.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        Schedulers.b(list, workGenerationalId, configuration, workDatabase);
                    }
                });
            }
        });
    }

    public static void schedule(Configuration configuration, WorkDatabase workDatabase, List<Scheduler> list) {
        List<WorkSpec> eligibleWorkForSchedulingWithContentUris;
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                eligibleWorkForSchedulingWithContentUris = workSpecDao.getEligibleWorkForSchedulingWithContentUris();
                markScheduled(workSpecDao, configuration.getClock(), eligibleWorkForSchedulingWithContentUris);
            } else {
                eligibleWorkForSchedulingWithContentUris = null;
            }
            List<WorkSpec> eligibleWorkForScheduling = workSpecDao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit());
            markScheduled(workSpecDao, configuration.getClock(), eligibleWorkForScheduling);
            if (eligibleWorkForSchedulingWithContentUris != null) {
                eligibleWorkForScheduling.addAll(eligibleWorkForSchedulingWithContentUris);
            }
            List<WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (eligibleWorkForScheduling.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) eligibleWorkForScheduling.toArray(new WorkSpec[eligibleWorkForScheduling.size()]);
                for (Scheduler scheduler : list) {
                    if (scheduler.hasLimitedSchedulingSlots()) {
                        scheduler.schedule(workSpecArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) allEligibleWorkSpecsForScheduling.toArray(new WorkSpec[allEligibleWorkSpecsForScheduling.size()]);
                for (Scheduler scheduler2 : list) {
                    if (!scheduler2.hasLimitedSchedulingSlots()) {
                        scheduler2.schedule(workSpecArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }
}

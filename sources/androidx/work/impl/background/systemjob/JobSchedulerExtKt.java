package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.compose.material.TextFieldImplKt;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001d\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/Configuration;", "configuration", "", "createErrorMessage", "(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/Configuration;)Ljava/lang/String;", "WORKMANAGER_NAMESPACE", "Ljava/lang/String;", "TAG", "Landroid/app/job/JobScheduler;", "getWmJobScheduler", "(Landroid/content/Context;)Landroid/app/job/JobScheduler;", "wmJobScheduler", "", "Landroid/app/job/JobInfo;", "getSafePendingJobs", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "safePendingJobs", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class JobSchedulerExtKt {

    @NotNull
    private static final String TAG;

    @NotNull
    public static final String WORKMANAGER_NAMESPACE = "androidx.work.systemjobscheduler";

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("SystemJobScheduler");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }

    @NotNull
    public static final String createErrorMessage(@NotNull Context context, @NotNull WorkDatabase workDatabase, @NotNull Configuration configuration) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int i10 = Build.VERSION.SDK_INT;
        int i11 = i10 >= 31 ? TextFieldImplKt.AnimationDuration : 100;
        int size = workDatabase.workSpecDao().getScheduledWork().size();
        String strJoinToString$default = "<faulty JobScheduler failed to getPendingJobs>";
        if (i10 >= 34) {
            JobScheduler wmJobScheduler = getWmJobScheduler(context);
            List<JobInfo> safePendingJobs = getSafePendingJobs(wmJobScheduler);
            if (safePendingJobs != null) {
                List<JobInfo> pendingJobs = SystemJobScheduler.getPendingJobs(context, wmJobScheduler);
                int size2 = pendingJobs != null ? safePendingJobs.size() - pendingJobs.size() : 0;
                String str2 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List<JobInfo> pendingJobs2 = SystemJobScheduler.getPendingJobs(context, (JobScheduler) systemService);
                int size3 = pendingJobs2 != null ? pendingJobs2.size() : 0;
                if (size3 != 0) {
                    str2 = size3 + " from WorkManager in the default namespace";
                }
                strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{safePendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2}), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List<JobInfo> pendingJobs3 = SystemJobScheduler.getPendingJobs(context, getWmJobScheduler(context));
            if (pendingJobs3 != null) {
                strJoinToString$default = pendingJobs3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i11 + " job limit exceeded.\nIn JobScheduler there are " + strJoinToString$default + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + configuration.getMaxSchedulerLimit() + '.';
    }

    @Nullable
    public static final List<JobInfo> getSafePendingJobs(@NotNull JobScheduler jobScheduler) {
        Intrinsics.checkNotNullParameter(jobScheduler, "<this>");
        try {
            return JobScheduler21.INSTANCE.getAllPendingJobs(jobScheduler);
        } catch (Throwable th2) {
            Logger.get().error(TAG, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }

    @NotNull
    public static final JobScheduler getWmJobScheduler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? JobScheduler34.INSTANCE.forNamespace(jobScheduler) : jobScheduler;
    }
}

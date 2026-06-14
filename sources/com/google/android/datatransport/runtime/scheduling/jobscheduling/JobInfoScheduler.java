package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes7.dex */
@RequiresApi(api = 21)
public class JobInfoScheduler implements WorkScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventStore f24473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SchedulerConfig f24474c;

    public JobInfoScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig) {
        this.f24472a = context;
        this.f24473b = eventStore;
        this.f24474c = schedulerConfig;
    }

    private boolean b(JobScheduler jobScheduler, int i10, int i11) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }

    int a(TransportContext transportContext) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f24472a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(transportContext.getBackendName().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.toInt(transportContext.getPriority())).array());
        if (transportContext.getExtras() != null) {
            adler32.update(transportContext.getExtras());
        }
        return (int) adler32.getValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i10) {
        schedule(transportContext, i10, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f24472a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f24472a.getSystemService("jobscheduler");
        int iA = a(transportContext);
        if (!z10 && b(jobScheduler, iA, i10)) {
            Logging.d("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
            return;
        }
        long nextCallTime = this.f24473b.getNextCallTime(transportContext);
        JobInfo.Builder builderConfigureJob = this.f24474c.configureJob(new JobInfo.Builder(iA, componentName), transportContext.getPriority(), nextCallTime, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", transportContext.getBackendName());
        persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, PriorityMapping.toInt(transportContext.getPriority()));
        if (transportContext.getExtras() != null) {
            persistableBundle.putString(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(transportContext.getExtras(), 0));
        }
        builderConfigureJob.setExtras(persistableBundle);
        Logging.d("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Integer.valueOf(iA), Long.valueOf(this.f24474c.getScheduleDelay(transportContext.getPriority(), nextCallTime, i10)), Long.valueOf(nextCallTime), Integer.valueOf(i10));
        jobScheduler.schedule(builderConfigureJob.build());
    }
}

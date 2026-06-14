package com.startapp.sdk.internal;

import android.app.job.JobParameters;
import com.startapp.sdk.jobs.SchedulerService;

/* JADX INFO: loaded from: classes11.dex */
public final class cg implements bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JobParameters f64376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SchedulerService f64377b;

    public cg(SchedulerService schedulerService, JobParameters jobParameters) {
        this.f64377b = schedulerService;
        this.f64376a = jobParameters;
    }

    @Override // com.startapp.sdk.internal.bb
    public final void a() {
        this.f64377b.jobFinished(this.f64376a, false);
    }
}

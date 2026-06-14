package com.startapp.sdk.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class eb implements bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JobScheduler f64454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f64455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64456c;

    public eb(Context context, Class cls) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            throw new IllegalStateException();
        }
        this.f64454a = jobScheduler;
        this.f64455b = new ComponentName(context, (Class<?>) cls);
        this.f64456c = q0.a(context, "android.permission.RECEIVE_BOOT_COMPLETED");
    }

    @Override // com.startapp.sdk.internal.bg
    public final boolean a(ge geVar, long j10) {
        JobInfo.Builder builder = new JobInfo.Builder(Math.abs(Arrays.hashCode(geVar.f64570a)), this.f64455b);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("extraKeyUuid", geVar.f64571b.toString());
        persistableBundle.putStringArray("extraKeyTags", geVar.f64570a);
        builder.setExtras(persistableBundle);
        JobRequest$Network jobRequest$Network = geVar.f64572c;
        if (jobRequest$Network != null) {
            builder.setRequiredNetworkType(jobRequest$Network == JobRequest$Network.UNMETERED ? 2 : jobRequest$Network == JobRequest$Network.ANY ? 1 : 0);
        }
        if (this.f64456c) {
            builder.setPersisted(true);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f64454a.schedule(builder.setPeriodic(j10, JobInfo.getMinFlexMillis()).build()) == 1;
        }
        ArrayList<JobInfo> arrayListA = a();
        if (arrayListA == null) {
            return false;
        }
        for (JobInfo jobInfo : arrayListA) {
            if (jobInfo.getId() == Math.abs(Arrays.hashCode(geVar.f64570a)) && jobInfo.getIntervalMillis() == j10) {
                return false;
            }
        }
        return this.f64454a.schedule(builder.setPeriodic(j10).build()) == 1;
    }

    public final ArrayList a() {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = this.f64454a.getAllPendingJobs();
        } catch (Throwable unused) {
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        for (JobInfo jobInfo : allPendingJobs) {
            if (this.f64455b.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // com.startapp.sdk.internal.bg
    public final boolean a(int i10) {
        Iterator it;
        ArrayList arrayListA = a();
        if (arrayListA == null) {
            return false;
        }
        try {
            it = arrayListA.iterator();
        } catch (Throwable unused) {
        }
        while (it.hasNext()) {
            if (((JobInfo) it.next()).getId() == i10) {
                this.f64454a.cancel(i10);
                return true;
            }
            return false;
        }
        return false;
    }
}

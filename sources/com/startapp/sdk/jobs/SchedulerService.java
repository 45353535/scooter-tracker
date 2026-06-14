package com.startapp.sdk.jobs;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.startapp.sdk.internal.cg;
import com.startapp.sdk.internal.v5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"SpecifyJobSchedulerIdRange"})
public class SchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ExecutorService f65704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f65705b = new a(this);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f65704a = Executors.newSingleThreadExecutor(new v5("scheduler"));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.f65704a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Bundle bundle;
        if (this.f65704a == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras.containsKey("extraKeyDuplicate")) {
            return false;
        }
        PersistableBundle persistableBundle = extras.getPersistableBundle("extraKeyBundle");
        if (persistableBundle != null) {
            bundle = new Bundle();
            bundle.putAll(persistableBundle);
        } else {
            bundle = null;
        }
        return this.f65705b.a(this, extras.getStringArray("extraKeyTags"), new cg(this, jobParameters), bundle);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ JobInfo.TriggerContentUri a(Uri uri, int i10) {
        return new JobInfo.TriggerContentUri(uri, i10);
    }
}

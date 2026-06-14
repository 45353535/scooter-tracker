package io.appmetrica.analytics;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes12.dex */
public interface AnrListener {
    @WorkerThread
    void onAppNotResponding();
}

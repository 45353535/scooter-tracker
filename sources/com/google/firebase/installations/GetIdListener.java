package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: loaded from: classes9.dex */
class GetIdListener implements StateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f32863a;

    public GetIdListener(TaskCompletionSource<String> taskCompletionSource) {
        this.f32863a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.f32863a.trySetResult(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}

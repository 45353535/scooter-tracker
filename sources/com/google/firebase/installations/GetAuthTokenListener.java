package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: loaded from: classes9.dex */
class GetAuthTokenListener implements StateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Utils f32861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f32862b;

    public GetAuthTokenListener(Utils utils, TaskCompletionSource<InstallationTokenResult> taskCompletionSource) {
        this.f32861a = utils;
        this.f32862b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        this.f32862b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.f32861a.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        this.f32862b.setResult(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }
}

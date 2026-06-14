package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface ExponentialBackoffPolicy {
    boolean canBeExecuted(@Nullable RetryPolicyConfig retryPolicyConfig);

    void onAllHostsAttemptsFinished(boolean z10);

    void onHostAttemptFinished(boolean z10);
}

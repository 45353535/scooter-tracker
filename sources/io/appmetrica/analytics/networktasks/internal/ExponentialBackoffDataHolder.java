package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* JADX INFO: loaded from: classes12.dex */
public class ExponentialBackoffDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f78852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeProvider f78853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f78854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f78855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f78856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f78857f;

    public ExponentialBackoffDataHolder(@NonNull HostRetryInfoProvider hostRetryInfoProvider, @NonNull String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f78856e = 1;
        this.f78855d = 0L;
        this.f78854c.saveNextSendAttemptNumber(1);
        this.f78854c.saveLastAttemptTimeSeconds(this.f78855d);
    }

    public void updateLastAttemptInfo() {
        long jCurrentTimeSeconds = this.f78853b.currentTimeSeconds();
        this.f78855d = jCurrentTimeSeconds;
        this.f78856e++;
        this.f78854c.saveLastAttemptTimeSeconds(jCurrentTimeSeconds);
        this.f78854c.saveNextSendAttemptNumber(this.f78856e);
    }

    public boolean wasLastAttemptLongAgoEnough(@Nullable RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j10 = this.f78855d;
            if (j10 != 0) {
                TimePassedChecker timePassedChecker = this.f78852a;
                int i10 = ((1 << (this.f78856e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i11 = retryPolicyConfig.maxIntervalSeconds;
                if (i10 > i11) {
                    i10 = i11;
                }
                return timePassedChecker.didTimePassSeconds(j10, i10, this.f78857f);
            }
        }
        return true;
    }

    ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f78854c = hostRetryInfoProvider;
        this.f78853b = systemTimeProvider;
        this.f78852a = timePassedChecker;
        this.f78855d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f78856e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f78857f = String.format("[ExponentialBackoffDataHolder-%s]", str);
    }
}

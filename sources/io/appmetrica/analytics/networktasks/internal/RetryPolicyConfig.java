package io.appmetrica.analytics.networktasks.internal;

/* JADX INFO: loaded from: classes12.dex */
public class RetryPolicyConfig {
    public final int exponentialMultiplier;
    public final int maxIntervalSeconds;

    public RetryPolicyConfig(int i10, int i11) {
        this.maxIntervalSeconds = i10;
        this.exponentialMultiplier = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RetryPolicyConfig retryPolicyConfig = (RetryPolicyConfig) obj;
            if (this.maxIntervalSeconds == retryPolicyConfig.maxIntervalSeconds && this.exponentialMultiplier == retryPolicyConfig.exponentialMultiplier) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.maxIntervalSeconds * 31) + this.exponentialMultiplier;
    }

    public String toString() {
        return "RetryPolicyConfig{maxIntervalSeconds=" + this.maxIntervalSeconds + ", exponentialMultiplier=" + this.exponentialMultiplier + '}';
    }
}

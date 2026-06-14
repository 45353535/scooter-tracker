package io.appmetrica.analytics.billinginterface.internal.config;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class BillingConfig {
    public final int firstCollectingInappMaxAgeSeconds;
    public final int sendFrequencySeconds;

    public BillingConfig(int i10, int i11) {
        this.sendFrequencySeconds = i10;
        this.firstCollectingInappMaxAgeSeconds = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BillingConfig billingConfig = (BillingConfig) obj;
        return this.sendFrequencySeconds == billingConfig.sendFrequencySeconds && this.firstCollectingInappMaxAgeSeconds == billingConfig.firstCollectingInappMaxAgeSeconds;
    }

    public int hashCode() {
        return (this.sendFrequencySeconds * 31) + this.firstCollectingInappMaxAgeSeconds;
    }

    @NonNull
    public String toString() {
        return "BillingConfig{sendFrequencySeconds=" + this.sendFrequencySeconds + ", firstCollectingInappMaxAgeSeconds=" + this.firstCollectingInappMaxAgeSeconds + "}";
    }
}

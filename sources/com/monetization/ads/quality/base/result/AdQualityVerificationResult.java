package com.monetization.ads.quality.base.result;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/monetization/ads/quality/base/result/AdQualityVerificationResult;", "", "WaitingForVerification", "Lcom/monetization/ads/quality/base/result/AdQualityVerificationResult$WaitingForVerification;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AdQualityVerificationResult {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/monetization/ads/quality/base/result/AdQualityVerificationResult$WaitingForVerification;", "Lcom/monetization/ads/quality/base/result/AdQualityVerificationResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WaitingForVerification implements AdQualityVerificationResult {

        @NotNull
        public static final WaitingForVerification INSTANCE = new WaitingForVerification();

        private WaitingForVerification() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof WaitingForVerification);
        }

        public int hashCode() {
            return 393213194;
        }

        @NotNull
        public String toString() {
            return "WaitingForVerification";
        }
    }
}

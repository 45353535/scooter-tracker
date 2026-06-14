package com.monetization.ads.quality.base.model.configuration;

import androidx.collection.b;
import androidx.compose.foundation.c;
import com.amazon.device.ads.DTBMetricsConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifierAdapterConfiguration;", "", "", DTBMetricsConfiguration.APSMETRICS_APIKEY, "", "verificationTimeoutInSec", "", "debug", "<init>", "(Ljava/lang/String;JZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApiKey", "J", "getVerificationTimeoutInSec", "()J", "Z", "getDebug", "()Z", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AdQualityVerifierAdapterConfiguration {

    @NotNull
    private final String apiKey;
    private final boolean debug;
    private final long verificationTimeoutInSec;

    public AdQualityVerifierAdapterConfiguration(@NotNull String str, long j10, boolean z10) {
        this.apiKey = str;
        this.verificationTimeoutInSec = j10;
        this.debug = z10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdQualityVerifierAdapterConfiguration)) {
            return false;
        }
        AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = (AdQualityVerifierAdapterConfiguration) other;
        return Intrinsics.areEqual(this.apiKey, adQualityVerifierAdapterConfiguration.apiKey) && this.verificationTimeoutInSec == adQualityVerifierAdapterConfiguration.verificationTimeoutInSec && this.debug == adQualityVerifierAdapterConfiguration.debug;
    }

    public int hashCode() {
        return c.a(this.debug) + ((b.a(this.verificationTimeoutInSec) + (this.apiKey.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AdQualityVerifierAdapterConfiguration(apiKey=" + this.apiKey + ", verificationTimeoutInSec=" + this.verificationTimeoutInSec + ", debug=" + this.debug + ")";
    }
}

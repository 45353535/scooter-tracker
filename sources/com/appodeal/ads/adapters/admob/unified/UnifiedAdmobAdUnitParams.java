package com.appodeal.ads.adapters.admob.unified;

import com.appodeal.ads.AdUnitParams;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0003B/\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0006H\u0016R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdmobAdUnitParams;", "AdRequestType", "Lcom/google/android/gms/ads/AdRequest;", "Lcom/appodeal/ads/AdUnitParams;", "request", C4240b4.i.W, "", "isMuted", "", "useAdaptiveBanner", "useSmartBanner", "<init>", "(Lcom/google/android/gms/ads/AdRequest;Ljava/lang/String;ZZZ)V", "getRequest", "()Lcom/google/android/gms/ads/AdRequest;", "Lcom/google/android/gms/ads/AdRequest;", "getKey", "()Ljava/lang/String;", "()Z", "getUseAdaptiveBanner", "getUseSmartBanner", "toString", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnifiedAdmobAdUnitParams<AdRequestType extends AdRequest> implements AdUnitParams {
    private final boolean isMuted;

    @NotNull
    private final String key;
    private final AdRequestType request;
    private final boolean useAdaptiveBanner;
    private final boolean useSmartBanner;

    public UnifiedAdmobAdUnitParams(AdRequestType adrequesttype, @NotNull String key, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.request = adrequesttype;
        this.key = key;
        this.isMuted = z10;
        this.useAdaptiveBanner = z11;
        this.useSmartBanner = z12;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final AdRequestType getRequest() {
        return this.request;
    }

    public final boolean getUseAdaptiveBanner() {
        return this.useAdaptiveBanner;
    }

    public final boolean getUseSmartBanner() {
        return this.useSmartBanner;
    }

    /* JADX INFO: renamed from: isMuted, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    @NotNull
    public String toString() {
        return "UnifiedAdmobAdUnitParams(request=" + this.request + ", key='" + this.key + "', isMuted=" + this.isMuted + ", useAdaptiveBanner=" + this.useAdaptiveBanner + ", useSmartBanner=" + this.useSmartBanner + ")";
    }
}

package com.unity3d.ads.beta;

import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\u0000\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"set", "", C4240b4.j.f42669b0, "Lcom/unity3d/ads/beta/UnityAdsPrivacyConsent;", "value", "Lcom/unity3d/ads/beta/UnityAdsPrivacyConsentValue;", "privacy", "Lcom/unity3d/ads/beta/UnityAdsPrivacyFlag;", "Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;", "setPrivacy", "flag", "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UnityAdsPrivacy {
    public static final void set(@NotNull UnityAdsPrivacyConsent consent, @NotNull UnityAdsPrivacyConsentValue value) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public static final void setPrivacy(@NotNull String flag, @NotNull UnityAdsPrivacyConsentValue value) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public static final void set(@NotNull UnityAdsPrivacyFlag privacy, @NotNull UnityAdsPrivacyValue value) {
        Intrinsics.checkNotNullParameter(privacy, "privacy");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public static final void setPrivacy(@NotNull String flag, @NotNull UnityAdsPrivacyValue consent) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(consent, "consent");
    }
}

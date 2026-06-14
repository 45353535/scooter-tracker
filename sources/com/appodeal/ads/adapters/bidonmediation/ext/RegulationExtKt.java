package com.appodeal.ads.adapters.bidonmediation.ext;

import android.os.Bundle;
import com.appodeal.ads.adapters.bidonmediation.AdmobCustomAdapterKt;
import com.mobilefuse.sdk.privacy.IabString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asBundle", "Landroid/os/Bundle;", "Lorg/bidon/sdk/regulation/Regulation;", "admob_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RegulationExtKt {
    @NotNull
    public static final Bundle asBundle(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "<this>");
        Bundle bundle = new Bundle();
        LogExtKt.logInfo("AdmobAdapter", "Applying regulation to " + AdmobCustomAdapterKt.getAdmobDemandId().getDemandId());
        String usPrivacyString = regulation.getUsPrivacyString();
        if (usPrivacyString != null) {
            bundle.putString(IabString.IAB_US_PRIVACY_STRING, usPrivacyString);
        }
        String gdprConsentString = regulation.getGdprConsentString();
        if (gdprConsentString != null) {
            bundle.putString("IABConsent_ConsentString", gdprConsentString);
        }
        bundle.putBoolean("IABConsent_SubjectToGDPR", regulation.getGdprApplies());
        return bundle;
    }
}

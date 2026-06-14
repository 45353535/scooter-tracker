package org.bidon.mobilefuse.ext;

import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.regulation.Regulation;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c {
    public static final MobileFusePrivacyPreferences a(Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "<this>");
        MobileFusePrivacyPreferences.Builder builder = new MobileFusePrivacyPreferences.Builder();
        if (regulation.getCoppaApplies()) {
            builder.setSubjectToCoppa(true);
        }
        if (regulation.getGdprApplies()) {
            builder.setGppConsentString(regulation.getGdprConsentString());
        }
        if (regulation.getCcpaApplies()) {
            builder.setUsPrivacyConsentString(regulation.getUsPrivacyString());
        }
        return builder.build();
    }
}

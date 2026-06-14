package com.appodeal.ads.adapters.admobmediation.customevent;

import android.content.Context;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends o {
    public static MediationRewardedAd d(MediationRewardedAdConfiguration adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return new MediationRewardedAd() { // from class: com.appodeal.ads.adapters.admobmediation.customevent.t
            @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
            public final void showAd(Context context) {
                u.e(context);
            }
        };
    }

    public static final void e(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // com.appodeal.ads.adapters.admobmediation.customevent.o
    public final /* bridge */ /* synthetic */ Object c(MediationAdConfiguration mediationAdConfiguration) {
        return d((MediationRewardedAdConfiguration) mediationAdConfiguration);
    }
}

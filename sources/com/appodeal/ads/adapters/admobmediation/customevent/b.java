package com.appodeal.ads.adapters.admobmediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends o {
    public static MediationBannerAd d(final MediationBannerAdConfiguration adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return new MediationBannerAd() { // from class: com.appodeal.ads.adapters.admobmediation.customevent.a
            @Override // com.google.android.gms.ads.mediation.MediationBannerAd
            public final View getView() {
                return b.e(adConfiguration);
            }
        };
    }

    public static final View e(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        return new View(mediationBannerAdConfiguration.getContext().getApplicationContext());
    }

    @Override // com.appodeal.ads.adapters.admobmediation.customevent.o
    public final /* bridge */ /* synthetic */ Object c(MediationAdConfiguration mediationAdConfiguration) {
        return d((MediationBannerAdConfiguration) mediationAdConfiguration);
    }
}

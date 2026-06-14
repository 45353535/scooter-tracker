package com.appodeal.ads.adapters.admobmediation.customevent;

import android.content.Context;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends o {
    public static MediationInterstitialAd d(MediationInterstitialAdConfiguration adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return new MediationInterstitialAd() { // from class: com.appodeal.ads.adapters.admobmediation.customevent.p
            @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
            public final void showAd(Context context) {
                q.e(context);
            }
        };
    }

    public static final void e(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // com.appodeal.ads.adapters.admobmediation.customevent.o
    public final /* bridge */ /* synthetic */ Object c(MediationAdConfiguration mediationAdConfiguration) {
        return d((MediationInterstitialAdConfiguration) mediationAdConfiguration);
    }
}

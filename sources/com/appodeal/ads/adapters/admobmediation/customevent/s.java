package com.appodeal.ads.adapters.admobmediation.customevent;

import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends o {
    @Override // com.appodeal.ads.adapters.admobmediation.customevent.o
    public final Object c(MediationAdConfiguration mediationAdConfiguration) {
        MediationNativeAdConfiguration adConfiguration = (MediationNativeAdConfiguration) mediationAdConfiguration;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return new r();
    }
}

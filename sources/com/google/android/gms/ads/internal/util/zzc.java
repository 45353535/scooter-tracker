package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzc extends zzb {
    private final Context zza;

    zzc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to get isAdIdFakeForDebugLogging", e10);
            isAdIdFakeForDebugLogging = false;
        }
        com.google.android.gms.ads.internal.util.client.zzl.zzh(isAdIdFakeForDebugLogging);
        StringBuilder sb2 = new StringBuilder(String.valueOf(isAdIdFakeForDebugLogging).length() + 38);
        sb2.append("Update ad debug logging enablement as ");
        sb2.append(isAdIdFakeForDebugLogging);
        String string = sb2.toString();
        int i11 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
    }
}

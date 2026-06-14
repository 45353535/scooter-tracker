package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzayc implements PackageManager$OnChecksumsReadyListener {
    final zzhah zza = zzhah.zze();

    public final void onChecksumsReady(List list) {
        int size;
        int i10;
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            size = list.size();
        } catch (Throwable unused) {
        }
        for (i10 = 0; i10 < size; i10++) {
            ApkChecksum apkChecksumA = v.a(list.get(i10));
            if (apkChecksumA.getType() == 8) {
                zzhah zzhahVar = this.zza;
                zzgxa zzgxaVarZzi = zzgxa.zzn().zzi();
                byte[] value = apkChecksumA.getValue();
                zzhahVar.zza(zzgxaVarZzi.zzj(value, 0, value.length));
                return;
            }
            this.zza.zza("");
        }
        this.zza.zza("");
    }
}

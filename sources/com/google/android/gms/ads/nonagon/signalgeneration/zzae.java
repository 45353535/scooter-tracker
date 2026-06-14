package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzgzl;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
final class zzae implements zzgzl {
    final /* synthetic */ zzbyh zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;

    zzae(zzau zzauVar, zzbyh zzbyhVar, boolean z10) {
        this.zza = zzbyhVar;
        this.zzb = z10;
        Objects.requireNonNull(zzauVar);
        this.zzc = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        try {
            zzbyh zzbyhVar = this.zza;
            String message = th2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
            sb2.append("Internal error: ");
            sb2.append(message);
            zzbyhVar.zzf(sb2.toString());
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.zza.zze(arrayList);
            zzau zzauVar = this.zzc;
            if (!zzauVar.zzC() && !this.zzb) {
                return;
            }
            for (Uri uri : arrayList) {
                if (zzauVar.zzc(uri)) {
                    zzauVar.zzB().zzb(zzau.zzZ(uri, zzauVar.zzM(), "1").toString(), null, null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziu)).booleanValue()) {
                        zzauVar.zzB().zzb(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }
}

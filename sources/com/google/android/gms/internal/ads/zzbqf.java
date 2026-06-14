package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbqf implements zzarr {
    private volatile zzbps zza;
    private final Context zzb;

    public zzbqf(Context context) {
        this.zzb = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzarr
    @Nullable
    public final zzaru zza(zzary zzaryVar) throws zzash {
        Parcelable.Creator<zzbpt> creator = zzbpt.CREATOR;
        Map mapZzm = zzaryVar.zzm();
        int size = mapZzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        for (Map.Entry entry : mapZzm.entrySet()) {
            strArr[i10] = (String) entry.getKey();
            strArr2[i10] = (String) entry.getValue();
            i10++;
        }
        zzbpt zzbptVar = new zzbpt(zzaryVar.zzh(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            zzcen zzcenVar = new zzcen();
            this.zza = new zzbps(this.zzb, com.google.android.gms.ads.internal.zzt.zzs().zza(), new zzbqd(this, zzcenVar), new zzbqe(this, zzcenVar));
            this.zza.checkAvailabilityAndConnect();
            zzbqb zzbqbVar = new zzbqb(this, zzbptVar);
            zzgzy zzgzyVar = zzcei.zza;
            ListenableFuture listenableFutureZzi = zzgzo.zzi(zzgzo.zzj(zzcenVar, zzbqbVar, zzgzyVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfr)).intValue(), TimeUnit.MILLISECONDS, zzcei.zzd);
            listenableFutureZzi.addListener(new zzbqc(this), zzgzyVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) listenableFutureZzi.get();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime2);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            zzbpv zzbpvVar = (zzbpv) new zzbzs(parcelFileDescriptor).zza(zzbpv.CREATOR);
            if (zzbpvVar == null) {
                return null;
            }
            if (zzbpvVar.zza) {
                throw new zzash(zzbpvVar.zzb);
            }
            String[] strArr3 = zzbpvVar.zze;
            String[] strArr4 = zzbpvVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap map = new HashMap();
            for (int i11 = 0; i11 < strArr3.length; i11++) {
                map.put(strArr3[i11], strArr4[i11]);
            }
            return new zzaru(zzbpvVar.zzc, zzbpvVar.zzd, map, zzbpvVar.zzg, zzbpvVar.zzh);
        } catch (InterruptedException | ExecutionException unused) {
            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime3);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            return null;
        } catch (Throwable th2) {
            long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb4.append("Http assets remote cache took ");
            sb4.append(jElapsedRealtime4);
            sb4.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
            throw th2;
        }
    }

    final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    final /* synthetic */ zzbps zzc() {
        return this.zza;
    }
}
